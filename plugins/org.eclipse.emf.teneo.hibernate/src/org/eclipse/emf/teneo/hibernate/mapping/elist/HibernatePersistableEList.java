/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: HibernatePersistableEList.java,v 1.4 2006/11/25 23:52:14 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.elist;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.eclipse.emf.teneo.hibernate.HbMapperException;
import org.eclipse.emf.teneo.hibernate.resource.HbResource;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.resource.StoreResource;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.collection.AbstractPersistentCollection;
import org.hibernate.collection.PersistentBag;
import org.hibernate.collection.PersistentCollection;
import org.hibernate.collection.PersistentIdentifierBag;
import org.hibernate.collection.PersistentList;
import org.hibernate.impl.SessionImpl;

/**
 * Implements the hibernate persistable elist.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class HibernatePersistableEList extends PersistableEList {
	/** The logger */
	private static Log log = LogFactory.getLog(HibernatePersistableEList.class);

	/** Constructor */
	public HibernatePersistableEList(InternalEObject owner, EStructuralFeature feature, List list) {
		super(owner, feature, list);
	}

	/**
	 * Override isLoaded to check if the delegate lists was not already loaded by hibernate behind the scenes, this
	 * happens with eagerly loaded lists.
	 */
	public boolean isLoaded() {
		if (delegate instanceof AbstractPersistentCollection) {
			if (((AbstractPersistentCollection) delegate).wasInitialized()) {
				setIsLoaded(true);
				// log.debug("Persistentlist already initialized, probably eagerly loaded: " + getLogString());
			}
		}
		return super.isLoaded();
	}

	/** Do the actual load can be overridden */
	protected synchronized void doLoad() {
		AssertUtil.assertTrue("EList " + logString, !isLoaded());

		log.debug("Started loading elist " + logString);

		Transaction tx = null;
		Session session = null;
		boolean controlsSession = false;
		boolean err = true;
		Resource res = null;
		try {
			res = owner.eResource();
			if (res != null && res instanceof HbResource) {
				session = ((HbResource) res).getSession();
				if (res.isLoaded()) // resource is loaded reopen transaction
				{
					if (!((SessionImpl) session).isTransactionInProgress()) {
						log.debug("Reconnecting session to read a lazy collection, elist: " + logString);
						controlsSession = true;
						tx = session.beginTransaction();
					} else {
						log.debug("Resource session is still active, using it");
					}
				} else {
					log.debug("Elist uses session from resource, " + logString);
				}
			} else {
				log.debug("EList is not loaded in session context");
			}

			if (controlsSession)
				assert (res instanceof HbResource);

			Object[] objs = delegate.toArray(); // this forces the load

			if (false && isContainment()) {
				final int featureID = getEStructuralFeature().getFeatureID();
				for (int i = 0; i < objs.length; i++) {
					if (objs[i] instanceof InternalEObject) {
						EContainerRepairControl.setContainer(owner, (InternalEObject) objs[i], getEStructuralFeature());
					}
				}
			}

			// add the new objects so they are tracked
			if (controlsSession)
				((HbResource) res).setIsLoading(true);

			if (res != null && res instanceof ResourceImpl) {
				try {
					// attach the new objects so that they are adapted when required
					for (int i = 0; i < objs.length; i++) {
						if (objs[i] instanceof EObject) {
							if (!isContainment()) {
								if (((EObject)objs[i]).eResource() == null) {
									((StoreResource)res).addToResource(objs[i]);
								}
							} else { // if containment then just attach
								((ResourceImpl) res).attached((EObject) objs[i]);
							}
						}
					}
				} finally {
					if (controlsSession)
						((HbResource) res).setIsLoading(false);
				}
			}
			err = false;
			log.debug("Loaded " + objs.length + " from backend store for " + logString);
		} finally {
			if (controlsSession) {
				if (err) {
					tx.rollback();
				} else {
					// a bit rough but delete from the persitence context otherwise
					// hibernate will think that this collection is not attached to anything and
					// will delete me
					// getSession().getPersistenceContext().getCollectionEntries().remove(this);
					tx.commit();
				}
				((HbResource) res).returnSession(session);
			}
		}
		log.debug("Finished loading elist " + logString);
	}

	/** Overridden because general list type is not supported as a replacement */
	public void replaceDelegate(List newDelegate) {
		if (newDelegate instanceof PersistentList) {
			// disabled this assertion because in case of a session refresh it is possible
			// that the list is replaced by a persistent list
			// AssertUtil.assertTrue("This elist " + logString + " contains a different list than the " +
			// " passed list", ((PersistentList)newDelegate).isWrapper(delegate));
			super.replaceDelegate(newDelegate);
		} else if (newDelegate instanceof PersistentBag) {
			// disabled this assertion because in case of a session refresh it is possible
			// that the list is replaced by a persistent list
			// AssertUtil.assertTrue("This elist " + logString + " contains a different list than the " +
			// " passed list", ((PersistentBag)newDelegate).isWrapper(delegate));
			super.replaceDelegate(newDelegate);
		} else if (newDelegate instanceof PersistentIdentifierBag) {
			// Added to support <idbag>
			super.replaceDelegate(newDelegate);
		} else if (newDelegate == delegate) // this can occur and is okay, do nothing in this case
		{

		} else {
			throw new HbMapperException("Type " + newDelegate.getClass().getName() + " can not be "
					+ " used as a replacement for elist " + logString);
		}
	}

	/** Returns true if the wrapped list is a persistency layer specific list */
	public boolean isPersistencyWrapped() {
		return delegate instanceof PersistentCollection;
	}
}