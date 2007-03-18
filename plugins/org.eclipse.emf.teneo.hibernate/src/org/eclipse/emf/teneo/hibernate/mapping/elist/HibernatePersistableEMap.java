/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: HibernatePersistableEMap.java,v 1.3 2007/03/18 19:19:47 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.elist;

import java.lang.reflect.Field;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.hibernate.resource.HbResource;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.mapping.elist.PersistableEMap;
import org.eclipse.emf.teneo.resource.StoreResource;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.collection.AbstractPersistentCollection;
import org.hibernate.impl.SessionImpl;

/**
 * Implements the hibernate persistable emap. Note an emap is not loaded lazily!
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class HibernatePersistableEMap<K, V> extends PersistableEMap<K, V> {
	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = -4553160393592497834L;

	/** The logger */
	private static Log log = LogFactory.getLog(HibernatePersistableEMap.class);

	/** Constructor */
	public HibernatePersistableEMap(InternalEObject owner, EReference eref,
			List<Entry<K, V>> list) {
		super(eref.getEReferenceType(), owner, eref, list);
	}

	/** Do the actual load can be overridden */
	@SuppressWarnings("unchecked")
	protected void doLoad() {
		Transaction tx = null;
		Session session = null;
		boolean controlsTransaction = false;
		boolean err = true;
		Resource res = null;
		final List<?> delegate = ((HibernatePersistableEList) delegateEList)
				.getDelegate();
		try {
			res = getEObject().eResource();
			if (res != null && res instanceof HbResource) {
				session = ((HbResource) res).getSession();
				if (res.isLoaded()) // resource is loaded reopen transaction
				{
					// if the delegate is already loaded then no transaction is
					// required
					final boolean isDelegateLoaded = delegate instanceof AbstractPersistentCollection
							&& ((AbstractPersistentCollection) delegate)
									.wasInitialized();
					if (!isDelegateLoaded
							&& !((SessionImpl) session)
									.isTransactionInProgress()) {
						log
								.debug("Reconnecting session to read a lazy collection, elist: "
										+ logString);
						controlsTransaction = true;
						tx = session.beginTransaction();
					} else {
						log
								.debug("Delegate loaded or resource session is still active, using it");
					}
				} else {
					log.debug("EMap uses session from resource, " + logString);
				}
			} else {
				log.debug("EMap is not loaded in session context");
			}

			if (controlsTransaction) {
				assert (res instanceof HbResource);
				((StoreResource) res).setIsLoading(true);
			}

			try {
				Object[] objs = delegate.toArray(); // this forces the load

				// add the new objects to the resource so they are tracked
				if (res != null && res instanceof StoreResource) {
					// attach the new contained objects so that they are adapted
					// when required
					for (int i = 0; i < objs.length; i++) {
						if (objs[i] instanceof EObject) {
							((StoreResource) res).addToContentOrAttach(
									(InternalEObject) objs[i],
									((EReference) getEStructuralFeature())
											.isContainment());
						}
					}
				}
				log.debug("Loaded " + objs.length + " from backend store for "
						+ logString);
			} finally {
				if (controlsTransaction) {
					((StoreResource) res).setIsLoading(false);
				}
			}
			err = false;
		} finally {
			if (controlsTransaction) {
				if (err) {
					tx.rollback();
				} else {
					// a bit rough but delete from the persitence context
					// otherwise
					// hibernate will think that this collection is not attached
					// to anything and
					// will delete me
					// getSession().getPersistenceContext().getCollectionEntries().remove(this);
					tx.commit();
				}
				((HbResource) res).returnSession(session);
			}
		}
		log.debug("Finished loading elist " + logString);
	}

	/**
	 * Overridden because of access to size attribute. This version will try to
	 * read the collection size without lading it if it is lazy loaded
	 */
	@Override
	public int size() {
		if (size != 0)
			return size;

		// if we are not loaded yet, we return the size of the buffered lazy
		// load delegate

		if (delegateEList instanceof PersistableEList
				&& ((PersistableEList<?>) delegateEList).getDelegate() instanceof AbstractPersistentCollection) {
			try {
				// here is a neat trick. we use reflection to get the
				// session of the persistanMap.
				Field field = AbstractPersistentCollection.class
						.getDeclaredField("session");
				field.setAccessible(true);
				Session s = (Session) field
						.get(((PersistableEList<?>) delegateEList)
								.getDelegate());

				// now that we have the session, we can query the size of
				// the list without loading it
				s.flush();
				size = ((Long) s.createFilter(
						((PersistableEList<?>) delegateEList).getDelegate(),
						"select count(*)").list().get(0)).intValue();
				return size;
			} catch (Throwable t) {
				// ignore on purpose, let the call to super handle it
			}
		}

		// didnt work, so we simply call the parent version
		return super.size();
	}

	/** Needs to be implemented by concrete subclass */
	@Override
	protected EList<BasicEMap.Entry<K, V>> createDelegateEList(
			InternalEObject owner, EStructuralFeature feature,
			List<BasicEMap.Entry<K, V>> delegateORMList) {
		return new HibernatePersistableEList<Entry<K, V>>(owner, feature,
				delegateORMList) {
			private static final long serialVersionUID = 1L;

			@Override
			protected void didAdd(int index, Entry<K, V> newObject) {
				doPut(newObject);
			}

			@Override
			protected void didSet(int index, Entry<K, V> newObject,
					Entry<K, V> oldObject) {
				didRemove(index, oldObject);
				didAdd(index, newObject);
			}

			@Override
			protected void didRemove(int index, Entry<K, V> oldObject) {
				HibernatePersistableEMap.this.doRemove(oldObject);
			}

			@Override
			protected void didClear(int size, Object[] oldObjects) {
				doClear();
			}

			@Override
			protected void didMove(int index, Entry<K, V> movedObject,
					int oldIndex) {
				HibernatePersistableEMap.this.doMove(movedObject);
			}
		};
	}
	
	/** Return the orm backing list */
	public Object getDelegate() {
		return ((PersistableDelegateList<?>)delegateEList).getDelegate();
	}
}