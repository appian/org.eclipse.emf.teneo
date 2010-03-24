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
 * $Id: HbExtraLazyPersistableEList.java,v 1.12 2010/03/24 17:32:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.elist;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.HbMapperException;
import org.eclipse.emf.teneo.hibernate.HbUtil;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.emf.teneo.hibernate.resource.HbResource;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.resource.StoreResource;
import org.eclipse.emf.teneo.type.PersistentStoreAdapter;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.Session;
import org.hibernate.collection.AbstractPersistentCollection;
import org.hibernate.collection.PersistentBag;
import org.hibernate.collection.PersistentCollection;
import org.hibernate.collection.PersistentIdentifierBag;
import org.hibernate.collection.PersistentList;

/**
 * Implements the hibernate persistable elist with extra lazy behavior, most
 * operations should not load the complete list. This is targeted at very large
 * lists. Note that this list can not work in a detached mode.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.12 $
 */

public class HbExtraLazyPersistableEList<E> extends
		HibernatePersistableEList<E> implements ExtensionPoint {

	/** The logger */
	// private static Log log =
	// LogFactory.getLog(HbExtraLazyPersistableEList.class);
	/**
	 * Serial version id
	 */
	private static final long serialVersionUID = 5479222310361594394L;

	private boolean previousDeliverSetting = false;

	/** Constructor */
	public HbExtraLazyPersistableEList(InternalEObject owner,
			EStructuralFeature feature, List<E> list) {
		super(owner, feature, list);
	}

	// done in superclass:
	// - delegateSize and delegateIsEmpty: super implementation is already extra
	// lazy
	// - delegateBasicList: will result in a full load
	// - delegateContains and delegateContainsAll: will result in a full load
	// - delegateEquals and delegatehashCode: will result in a full load
	// - delegateIndexOf and delegateLastIndexOf: will result in a full load
	// - delegateToArray: will result in a full load
	// - delegateIterator and delegateListIterator: will result in a full load
	// - delegateToString: will result in a full load

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateAdd(int,
	 * java.lang.Object)
	 */
	@Override
	protected void delegateAdd(int index, E object) {
		if (index == size()) {
			delegateAdd(object);
			return;
		}

		// force a load
		delegateList().iterator();

		delegateList().add(index, object);

		int newIndex = index;
		for (Object element : delegateList().subList(index, size())) {
			// for the new one set the owner
			if (newIndex == index) {
				HbUtil.setSyntheticListOwner(getEStructuralFeature(), element, getOwner());
			}
			HbUtil.setSyntheticListIndex(getEStructuralFeature(), element, newIndex++);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.util.DelegatingEList#delegateAdd(java.lang.Object)
	 */
	@Override
	protected void delegateAdd(E object) {
		int newIndex = delegateList().size();
		delegateList().add(object);
		HbUtil.setSyntheticListIndex(getEStructuralFeature(), object, newIndex);
		HbUtil.setSyntheticListOwner(getEStructuralFeature(), object,
				getOwner());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateClear()
	 */
	@Override
	protected void delegateClear() {
		for (Object element : delegateList()) {
			HbUtil.resetSyntheticListInfo(getEStructuralFeature(), element);
		}
		delegateList().clear();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.util.DelegatingEList#delegateContains(java.lang
	 * .Object)
	 */
	@Override
	protected boolean delegateContains(Object object) {
		return delegateList().contains(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.util.DelegatingEList#delegateContainsAll(java.
	 * util.Collection)
	 */
	@Override
	protected boolean delegateContainsAll(Collection<?> collection) {
		return delegateList().containsAll(collection);
	}

	/** Returns the underlying elist */
	@Override
	protected List<E> delegateList() {
		return getDelegate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateGet(int)
	 */
	@Override
	protected E delegateGet(int index) {
		boolean callAfterLoadInstance = false;
		if (!isLoaded()) {
			beforeLoadInstance();
			callAfterLoadInstance = true;
		}
		final E object = delegateList().get(index);
		if (callAfterLoadInstance && object instanceof EObject) {
			final EObject eObject = (EObject) object;
			afterLoadInstance(eObject);
		}
		return object;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateRemove(int)
	 */
	@Override
	protected E delegateRemove(int index) {
		if (index == (size() - 1) && !isInitialized() && isConnectedToSession()) {
			// removing the last one
			final E result = delegateList().remove(index);
			HbUtil.resetSyntheticListInfo(getEStructuralFeature(), result);
			if (getEStructuralFeature() instanceof EReference && ((EReference)getEStructuralFeature()).isContainment()) {
				// remove the removed object
				// if the list is not initialized then cascade deletes won't work
				final Session session = (Session)((PersistentList)getDelegate()).getSession();
				session.delete(result);
			}
			return result;
		}

		// force a full load
		delegateList().iterator();

		final E result = delegateList().remove(index);
		HbUtil.resetSyntheticListInfo(getEStructuralFeature(), result);

		int newIndex = index;
		for (Object element : delegateList().subList(index, size())) {
			HbUtil.setSyntheticListIndex(getEStructuralFeature(), element,
					newIndex++);
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateSet(int,
	 * java.lang.Object)
	 */
	@Override
	protected E delegateSet(int index, E object) {
		final E oldObject = delegateList().set(index, object);

		// clear old object
		if (oldObject != null) {
			HbUtil.resetSyntheticListInfo(getEStructuralFeature(), oldObject);
		}

		// set new object
		HbUtil.setSyntheticListIndex(getEStructuralFeature(), object, index);
		HbUtil.setSyntheticListOwner(getEStructuralFeature(), object,
				getOwner());
		return oldObject;
	}

	/**
	 * Implements the actions which need to be done before getting/loading an
	 * instance.
	 */
	protected synchronized void beforeLoadInstance() {
		final Resource res = owner.eResource();
		if (res != null && res instanceof HbResource) {
			final SessionWrapper sessionWrapper = ((HbResource) res)
					.getSessionWrapper();
			if (res.isLoaded()) // resource is loaded reopen transaction
			{
				// if the delegate is already loaded then no transaction is
				// required
				final boolean isDelegateLoaded = delegate instanceof AbstractPersistentCollection
						&& ((AbstractPersistentCollection) delegate)
								.wasInitialized();
				if (!isDelegateLoaded && !sessionWrapper.isTransactionActive()) {
					sessionWrapper.setFlushModeManual();
				}
				((StoreResource) res).setIsLoading(true);
			}
		}
		previousDeliverSetting = owner.eDeliver();
		try {
			// only set to false if it was true
			if (previousDeliverSetting) {
				owner.eSetDeliver(false);
			}
		} catch (UnsupportedOperationException e) {
			// in this case the eSetDeliver was not overridden from the
			// baseclass
			// ignore
		}
	}

	protected void afterLoadInstance(EObject eObject) {

		// disabled for now as containers are persisted by hibernate
		// anyway
		if (isContainment() && eObject.eContainer() == null) {
			EContainerRepairControl.setContainer(owner,
					(InternalEObject) eObject, getEStructuralFeature());
		}
		final Resource res = owner.eResource();
		if (res != null && res instanceof HbResource) {
			// attach the new contained objects so that they are adapted
			// when required
			((StoreResource) res).addToContentOrAttach(
					(InternalEObject) eObject,
					(EReference) getEStructuralFeature());
			((StoreResource) res).setIsLoading(false);
		}

		try {
			// only set to false if it was true
			if (previousDeliverSetting) {
				owner.eSetDeliver(true);
			}
		} catch (UnsupportedOperationException e) {
			// in this case the eSetDeliver was not overridden from the
			// baseclass
			// ignore
		}
	}

	/** If the delegate has been initialized */
	public boolean isInitialized() {
		return ((PersistentCollection) delegate).wasInitialized();
	}

	/** Overridden because general list type is not supported as a replacement */
	@Override
	public void replaceDelegate(List<E> newDelegate) {
		if (newDelegate instanceof PersistentList) {
			// disabled this assertion because in case of a session refresh it
			// is possible
			// that the list is replaced by a persistent list
			// AssertUtil.assertTrue("This elist " + logString + " contains a
			// different list than the " +
			// " passed list",
			// ((PersistentList)newDelegate).isWrapper(delegate));
			super.replaceDelegate(newDelegate);
		} else if (newDelegate instanceof PersistentBag) {
			// disabled this assertion because in case of a session refresh it
			// is possible
			// that the list is replaced by a persistent list
			// AssertUtil.assertTrue("This elist " + logString + " contains a
			// different list than the " +
			// " passed list",
			// ((PersistentBag)newDelegate).isWrapper(delegate));
			super.replaceDelegate(newDelegate);
		} else if (newDelegate instanceof PersistentIdentifierBag) {
			// Added to support <idbag>
			super.replaceDelegate(newDelegate);
		} else if (newDelegate == delegate) // this can occur and is okay, do
		// nothing in this case
		{

		} else {
			throw new HbMapperException("Type "
					+ newDelegate.getClass().getName() + " can not be "
					+ " used as a replacement for elist " + logString);
		}
	}

	/** Returns true if the wrapped list is a persistency layer specific list */
	@Override
	public boolean isPersistencyWrapped() {
		return delegate instanceof PersistentCollection;
	}
}