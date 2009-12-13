/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EMFInterceptor.java,v 1.14 2009/12/13 10:13:40 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.extension.ExtensionInitializable;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManagerAware;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.type.PersistentStoreAdapter;
import org.eclipse.emf.teneo.util.FieldUtil;
import org.hibernate.EmptyInterceptor;
import org.hibernate.Transaction;
import org.hibernate.collection.AbstractPersistentCollection;

/**
 * Intercepts the getEntityName call to return the EClass name as the entity name.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.14 $
 */

public class EMFInterceptor extends EmptyInterceptor implements ExtensionPoint, ExtensionManagerAware,
		ExtensionInitializable {

	// is kept to do dereferencing of collections, see the description in the deReferenceCollections
	// method
	// clear all session instances in the persistentcollection to solve
	// this issue which still occured with Teneo in hibernate 3.2.5
	// http://forum.hibernate.org/viewtopic.php?t=934961&highlight=two+representations+same+collection
	// http://opensource.atlassian.com/projects/hibernate/browse/HHH-511
	// this issue occured when doing the following using a resource:
	// create a new object with a isMany feature, save the resource,
	// delete the just saved object, save the resource
	// undo the delete (possible in the editor) and then
	// save the resource a 'Found two representations of same collection:'
	// exception occurs
	private static ThreadLocal<List<AbstractPersistentCollection>> persistentCollections = new ThreadLocal<List<AbstractPersistentCollection>>();
	private static ThreadLocal<List<EObject>> deletedEObjects = new ThreadLocal<List<EObject>>();

	// note is also used for non-deleted objects in HbResource
	public static void registerCollectionsForDereferencing(EObject eObject) {
		for (EReference eReference : eObject.eClass().getEAllReferences()) {
			if (eReference.isMany()) {
				final Object refValue = eObject.eGet(eReference);
				if (refValue instanceof PersistableDelegateList<?>) {
					final Object delegate = ((PersistableDelegateList<?>) refValue).getDelegate();
					if (delegate instanceof AbstractPersistentCollection) {
						if (persistentCollections.get() == null) {
							persistentCollections.set(new ArrayList<AbstractPersistentCollection>());
						}
						final List<AbstractPersistentCollection> list = persistentCollections.get();
						list.add((AbstractPersistentCollection) delegate);
					}
				}
			}
		}
		if (deletedEObjects.get() == null) {
			deletedEObjects.set(new ArrayList<EObject>());
		}
		deletedEObjects.get().add(eObject);
	}

	// is used to unset a session in a collection. Note that it would be better to use the
	// AbstractPersistentCollection.unsetSession/getSession method but these give me a
	// java.lang.AccessError
	private static final Field sessionField = FieldUtil.getField(AbstractPersistentCollection.class, "session");

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 1680117509182298808L;

	/** The qualify property used to compute the eclassname */
	private EntityNameStrategy qualifyStrategy;

	private ExtensionManager extensionManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.emf.teneo.extension.ExtensionManagerAware#setExtensionManager(org.eclipse.emf.teneo.extension.
	 * ExtensionManager)
	 */
	public void setExtensionManager(ExtensionManager extensionManager) {
		this.extensionManager = extensionManager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.extension.ExtensionInitializable#initializeExtension()
	 */
	public void initializeExtension() {
		qualifyStrategy = extensionManager.getExtension(EntityNameStrategy.class);
	}

	/**
	 * Is overridden to return the eclass uri as the entity name.
	 * 
	 * @see org.hibernate.EmptyInterceptor#getEntityName(java.lang.Object)
	 */
	@Override
	public String getEntityName(Object object) {
		if (object instanceof EObject) {
			// TODO handle featuremap
			EObject eobj = (EObject) object;
			return qualifyStrategy.toEntityName(eobj.eClass());
		}

		return super.getEntityName(object);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void postFlush(Iterator entities) {
		// TODO: consider to move this to after commit
		final List<AbstractPersistentCollection> list = persistentCollections.get();
		if (list == null) {
			return;
		}
		try {
			for (AbstractPersistentCollection apc : list) {
				try {
					sessionField.set(apc, null);
				} catch (Exception e) {
					throw new HbStoreException(e);
				}
			}
		} finally {
			persistentCollections.set(null);
		}
	}

	@Override
	public void afterTransactionCompletion(Transaction tx) {
		if (tx.wasCommitted()) {
			if (deletedEObjects.get() != null) {
				try {
					for (EObject eObject : deletedEObjects.get()) {
						// remove the PersistentStoreAdapter
						PersistentStoreAdapter toRemoveAdapter = null;
						for (Adapter adapter : eObject.eAdapters()) {
							if (adapter instanceof PersistentStoreAdapter) {
								toRemoveAdapter = (PersistentStoreAdapter) adapter;
							}
						}
						if (toRemoveAdapter != null) {
							eObject.eAdapters().remove(toRemoveAdapter);
						}
						IdentifierCacheHandler.getInstance().setVersion(eObject, null);
						IdentifierCacheHandler.getInstance().setID(eObject, null);

					}
				} finally {
					deletedEObjects.set(null);
				}
			}
		}
		super.afterTransactionCompletion(tx);
	}

	/**
	 * Returns true if the eobject belongs to the newEObject set of a hibernateResource, in all other cases returns
	 * null.
	 */
	// Disabled this method because an object can be new to a resource but already
	// exist in the database.
	// See bugzilla 280355 and the related testcase
	// @Override
	// public Boolean isTransient(Object entity) {
	// if (!(entity instanceof EObject)) {
	// return null;
	// }
	//
	// final EObject eObject = (EObject) entity;
	// final Resource res = eObject.eResource();
	// if (res == null || !(res instanceof StoreResource)) {
	// return null;
	// }
	//
	// final StoreResource storeResource = (StoreResource) res;
	// if (storeResource.getNewEObjectSet().contains(entity)) {
	// return true;
	// }
	// // in all other cases let hibernate do it
	// return null;
	// }
}