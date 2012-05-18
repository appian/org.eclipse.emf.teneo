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
 * $Id: HibernatePersistableEList.java,v 1.35 2010/03/25 01:05:53 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.elist;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.HbMapperException;
import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.eclipse.emf.teneo.hibernate.resource.HbResource;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.resource.StoreResource;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.hibernate.HibernateException;
import org.hibernate.collection.internal.AbstractPersistentCollection;
import org.hibernate.collection.internal.PersistentBag;
import org.hibernate.collection.internal.PersistentIdentifierBag;
import org.hibernate.collection.internal.PersistentList;
import org.hibernate.collection.spi.PersistentCollection;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.loader.CollectionAliases;
import org.hibernate.persister.collection.CollectionPersister;
import org.hibernate.type.Type;

/**
 * Implements the hibernate persistable elist.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.35 $
 */

public class HibernatePersistableEList<E> extends PersistableEList<E> implements
		ExtensionPoint, PersistentCollection {
	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = -4553160393592497834L;
	/** The logger */
	private static Log log = LogFactory.getLog(HibernatePersistableEList.class);

	/** Constructor */
	public HibernatePersistableEList(InternalEObject owner,
			EStructuralFeature feature, List<E> list) {
		super(owner, feature, list);
	}

	/** If the delegate has been initialized */
	public boolean isInitialized() {
		return ((PersistentCollection) delegate).wasInitialized();
	}

	/**
	 * Override isLoaded to check if the delegate lists was not already loaded
	 * by hibernate behind the scenes, this happens with eagerly loaded lists.
	 */
	@Override
	public boolean isLoaded() {
		// if the delegated list was loaded under the hood and this
		// HibernatePersistableEList did
		// not yet notice it then do the local load behavior.
		// delegate is loaded in case of subselect or eager loading
		final boolean isDelegateLoaded = delegate instanceof AbstractPersistentCollection
				&& ((AbstractPersistentCollection) delegate).wasInitialized();
		if (!super.isLoaded() && !isLoading() && isDelegateLoaded) {
			if (log.isDebugEnabled()) {
				log
						.debug("Persistentlist already initialized, probably eagerly loaded: "
								+ getLogString());
			}
			try {
				setIsLoading(true);
				// do load to load the resource
				doLoad();
				setIsLoaded(true);
			} finally {
				setIsLoading(false);
			}
		}
		return super.isLoaded();
	}

	/** Do the actual load can be overridden */
	@Override
	protected synchronized void doLoad() {
		// TODO, read the following link and reconsider transaction usage
		// http://community.jboss.org/wiki/Non-transactionaldataaccessandtheauto-commitmode

		AssertUtil.assertTrue("EList " + logString, !isLoaded());

		log.debug("Started loading elist " + logString);

		SessionWrapper sessionWrapper = null;
		boolean controlsTransaction = false;
		boolean err = true;
		Resource res = null;
		try {
			res = owner.eResource();
			if (res != null && res instanceof HbResource) {
				sessionWrapper = ((HbResource) res).getSessionWrapper();
				if (res.isLoaded()) // resource is loaded reopen transaction
				{
					// if the delegate is already loaded then no transaction is
					// required
					final boolean isDelegateLoaded = delegate instanceof AbstractPersistentCollection
							&& ((AbstractPersistentCollection) delegate)
									.wasInitialized();
					if (!isDelegateLoaded
							&& !sessionWrapper.isTransactionActive()) {
						log
								.debug("Reconnecting session to read a lazy collection, elist: "
										+ logString);
						controlsTransaction = true;
						sessionWrapper.beginTransaction();
						sessionWrapper.setFlushModeManual();
					} else {
						log
								.debug("Delegate loaded or resource session is still active, using it");
					}
				} else {
					log.debug("Elist uses session from resource, " + logString);
				}
			} else {
				log.debug("EList is not loaded in session context");
			}

			if (controlsTransaction) {
				assert (res instanceof HbResource);
				((StoreResource) res).setIsLoading(true);
			}

			try {
				Object[] objs = delegate.toArray(); // this forces the load

				// disabled for now as containers are persisted by hibernate
				// anyway
				if (isContainment()) {
					for (Object element : objs) {
						if (element instanceof InternalEObject) {
							EContainerRepairControl.setContainer(owner,
									(InternalEObject) element,
									getEStructuralFeature());
						}
					}
				}

				// add the new objects to the resource so they are tracked
				if (res != null && res instanceof StoreResource) {
					// attach the new contained objects so that they are adapted
					// when required
					for (Object element : objs) {
						if (element instanceof EObject) {
							((StoreResource) res).addToContentOrAttach(
									(InternalEObject) element,
									(EReference) getEStructuralFeature());
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
					sessionWrapper.rollbackTransaction();
					sessionWrapper.restorePreviousFlushMode();
				} else {
					// a bit rough but delete from the persitence context
					// otherwise
					// hibernate will think that this collection is not attached
					// to anything and
					// will delete me
					// getSession().getPersistenceContext().getCollectionEntries().remove(this);
					sessionWrapper.commitTransaction();
					sessionWrapper.restorePreviousFlushMode();
				}
			}
			if (sessionWrapper != null) {
				((HbResource) res).returnSessionWrapper(sessionWrapper);
			}
		}
		log.debug("Finished loading elist " + logString);
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
	public boolean isPersistencyWrapped() {
		return delegate instanceof PersistentCollection;
	}

	public boolean afterInitialize() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).afterInitialize();
		}
		return false;
	}

	public void afterRowInsert(CollectionPersister persister, Object entry,
			int i) throws HibernateException {
		if (isPersistencyWrapped()) {
			((PersistentCollection) delegate).afterRowInsert(persister, entry,
					i);
		}
	}

	public void beforeInitialize(CollectionPersister persister,
			int anticipatedSize) {
		if (isPersistencyWrapped()) {
			((PersistentCollection) delegate).beforeInitialize(persister,
					anticipatedSize);
		}
	}

	public void beginRead() {
		if (isPersistencyWrapped()) {
			((PersistentCollection) delegate).beginRead();
		}
	}

	public void clearDirty() {
		if (isPersistencyWrapped()) {
			((PersistentCollection) delegate).clearDirty();
		}
	}

	public void dirty() {
		if (isPersistencyWrapped()) {
			((PersistentCollection) delegate).dirty();
		}
	}

	public Serializable disassemble(CollectionPersister persister)
			throws HibernateException {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).disassemble(persister);
		}
		return null;
	}

	public boolean empty() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).empty();
		}
		return false;
	}

	public boolean endRead() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).endRead();
		}
		return false;
	}

	public Iterator<?> entries(CollectionPersister persister) {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).entries(persister);
		}
		return null;
	}

	public boolean entryExists(Object entry, int i) {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).entryExists(entry, i);
		}
		return false;
	}

	public boolean equalsSnapshot(CollectionPersister persister)
			throws HibernateException {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).equalsSnapshot(persister);
		}
		return false;
	}

	public void forceInitialization() throws HibernateException {
		if (isPersistencyWrapped()) {
			((PersistentCollection) delegate).forceInitialization();
		}
	}

	public Iterator<?> getDeletes(CollectionPersister persister,
			boolean indexIsFormula) throws HibernateException {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getDeletes(persister,
					indexIsFormula);
		}
		return null;
	}

	public Object getElement(Object entry) {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getElement(entry);
		}
		return null;
	}

	public Object getIdentifier(Object entry, int i) {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getIdentifier(entry, i);
		}
		return null;
	}

	public Object getIndex(Object entry, int i, CollectionPersister persister) {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getIndex(entry, i,
					persister);
		}
		return null;
	}

	public Serializable getKey() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getKey();
		}
		return null;
	}

	public Collection<?> getOrphans(Serializable snapshot, String entityName)
			throws HibernateException {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getOrphans(snapshot,
					entityName);
		}
		return null;
	}

	public Object getOwner() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getOwner();
		}
		return getEObject();
	}

	public Collection<?> getQueuedOrphans(String entityName) {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate)
					.getQueuedOrphans(entityName);
		}
		return null;
	}

	public String getRole() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getRole();
		}
		return null;
	}

	public Serializable getSnapshot(CollectionPersister persister)
			throws HibernateException {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getSnapshot(persister);
		}
		return null;
	}

	public Object getSnapshotElement(Object entry, int i) {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getSnapshotElement(entry,
					i);
		}
		return null;
	}

	public Serializable getStoredSnapshot() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getStoredSnapshot();
		}
		return null;
	}

	public Object getValue() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).getValue();
		}
		return null;
	}

	public boolean hasQueuedOperations() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).hasQueuedOperations();
		}
		return false;
	}

	public void initializeFromCache(CollectionPersister persister,
			Serializable disassembled, Object owner) throws HibernateException {
		if (isPersistencyWrapped()) {
			((PersistentCollection) delegate).initializeFromCache(persister,
					disassembled, owner);
		}
	}

	public boolean isDirectlyAccessible() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).isDirectlyAccessible();
		}
		return false;
	}

	public boolean isDirty() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).isDirty();
		}
		return false;
	}

	public boolean isRowUpdatePossible() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).isRowUpdatePossible();
		}
		return false;
	}

	public boolean isSnapshotEmpty(Serializable snapshot) {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).isSnapshotEmpty(snapshot);
		}
		return false;
	}

	public boolean isUnreferenced() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).isUnreferenced();
		}
		return false;
	}

	public boolean isWrapper(Object collection) {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).isWrapper(collection);
		}
		return false;
	}

	public boolean needsInserting(Object entry, int i, Type elemType)
			throws HibernateException {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).needsInserting(entry, i,
					elemType);
		}
		return false;
	}

	public boolean needsRecreate(CollectionPersister persister) {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).needsRecreate(persister);
		}
		return false;
	}

	public boolean needsUpdating(Object entry, int i, Type elemType)
			throws HibernateException {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).needsUpdating(entry, i,
					elemType);
		}
		return false;
	}

	public void postAction() {
		if (isPersistencyWrapped()) {
			((PersistentCollection) delegate).postAction();
		}
	}

	@Override
	protected int delegateSize() {
		return delegateList().size();
	}

	protected final boolean isConnectedToSession() {
		if (!(getDelegate() instanceof AbstractPersistentCollection)) {
			return false;
		}
		final AbstractPersistentCollection persistentCollection = (AbstractPersistentCollection) getDelegate();
		final SessionImplementor session = ((AbstractPersistentCollection) persistentCollection)
				.getSession();
		return isConnectedToSession(session);
	}
	
	private final boolean isConnectedToSession(SessionImplementor session) {
		final PersistentCollection persistentCollection = (PersistentCollection) getDelegate();
		return session != null
				&& session.isOpen()
				&& session.getPersistenceContext().containsCollection(
						persistentCollection);
	}

	@Override
	protected boolean delegateIsEmpty() {
		return delegateSize() == 0;
	}

	public void preInsert(CollectionPersister persister)
			throws HibernateException {
		if (isPersistencyWrapped()) {
			((PersistentCollection) delegate).preInsert(persister);
		}
	}

	public Iterator<?> queuedAdditionIterator() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).queuedAdditionIterator();
		}
		return null;
	}

	public Object readFrom(ResultSet rs, CollectionPersister role,
			CollectionAliases descriptor, Object owner)
			throws HibernateException, SQLException {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).readFrom(rs, role,
					descriptor, owner);
		}
		return null;
	}

	public boolean setCurrentSession(SessionImplementor session)
			throws HibernateException {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).setCurrentSession(session);
		}
		return false;
	}

	public void setOwner(Object entity) {
		if (isPersistencyWrapped()) {
			((PersistentCollection) delegate).setOwner(entity);
		}
	}

	public void setSnapshot(Serializable key, String role, Serializable snapshot) {
		if (isPersistencyWrapped()) {
			((PersistentCollection) delegate).setSnapshot(key, role, snapshot);
		}
	}

	public boolean unsetSession(SessionImplementor currentSession) {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate)
					.unsetSession(currentSession);
		}
		return false;
	}

	public boolean wasInitialized() {
		if (isPersistencyWrapped()) {
			return ((PersistentCollection) delegate).wasInitialized();
		}
		return false;
	}

}