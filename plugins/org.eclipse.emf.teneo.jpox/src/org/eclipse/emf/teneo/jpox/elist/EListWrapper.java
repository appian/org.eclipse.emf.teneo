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
 * $Id: EListWrapper.java,v 1.1 2006/09/13 10:39:52 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;
import javax.jdo.spi.PersistenceCapable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.DelegatingEcoreEList;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.eclipse.emf.teneo.jpox.JpoxStoreException;
import org.eclipse.emf.teneo.jpox.JpoxUtil;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeEObject;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeObject;
import org.eclipse.emf.teneo.jpox.resource.Detacher;
import org.eclipse.emf.teneo.jpox.resource.JPOXResource;
import org.eclipse.emf.teneo.jpox.resource.JPOXResourceDAO;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.resource.StoreResource;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.AbstractPersistenceManager;
import org.jpox.StateManager;
import org.jpox.sco.SCO;
import org.jpox.sco.SCOList;
import org.jpox.sco.exceptions.QueryUnownedSCOException;
import org.jpox.state.FetchPlanState;
import org.jpox.store.expression.QueryExpression;
import org.jpox.store.query.Query;
import org.jpox.store.query.QueryStatement;
import org.jpox.store.query.Queryable;
import org.jpox.util.ClassUtils;

/**
 * This class works as a wrapper around the EList as it is used in the EMF objects. The class extends PersistableEList,
 * the delegate of this elist is a normal arraylist. In addition this class has a reference to a jpox arraylist which
 * represents the underlying datastore. The jpox arraylist can not be used as the delegate because certain type of store
 * objects (AnyObject_ are replaced by their contained value at load time, this indirection can not be accomplished when
 * the jpox arraylist is the delegate.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/09/13 10:39:52 $
 */

public class EListWrapper extends PersistableEList implements SCO, Queryable, SCOList, JPOXEList {
	/** The logger */
	private static Log log = LogFactory.getLog(EListWrapper.class);

	/** The statemanager used to get to all the jdo information */
	private StateManager stateManager = null;

	/** The field for which this EList operates */
	private String elistFieldName = null;

	/** The jdo delegate representing the datastore */
	protected JPOXArrayList jdoDelegate = null;

	/** Is set to true if this is a containment list */
	private final boolean containmentList;

	/** Is true if this list contains EObjectListElements */
	private final boolean isEObjectList;

	/** Is true if this list contains unidentified Objects */
	private final boolean isObjectList;

	/**
	 * Constructor, using the StateManager of the "owner" and the field name.
	 * 
	 * @param ownerSM
	 *            The owner StateManager
	 * @param fieldName
	 *            The name of the field of the SCO.
	 */
	public EListWrapper(StateManager ownerSM, String fieldName) {
		this(ownerSM, fieldName, new ArrayList());
	}

	/**
	 * Constructor, using the StateManager of the "owner" and the field name.
	 * 
	 * @param ownerSM
	 *            The owner StateManager
	 * @param fieldName
	 *            The name of the field of the SCO.
	 */
	public EListWrapper(StateManager ownerSM, String fieldName, List list) {
		super((InternalEObject) ownerSM.getObject(), StoreUtil.getEStructuralFeature((InternalEObject) ownerSM
				.getObject(), fieldName), new ArrayList(list));

		AssertUtil.assertTrue("The delegate may not be an elistwrapper", !(getDelegate() instanceof EListWrapper));

		stateManager = ownerSM;

		containmentList = getEStructuralFeature() instanceof EAttribute
				|| ((EReference) getEStructuralFeature()).isContainment();
		jdoDelegate = new JPOXArrayList(ownerSM, fieldName);
		elistFieldName = fieldName;

		final Class elementType = getEStructuralFeature().getEType().getInstanceClass();
		isEObjectList = elementType == EObject.class; // AnyTypeEObject.class;
		isObjectList = elementType == Object.class; // AnyTypeEObject.class;

		if (jdoDelegate.isLoaded()) {
			load();
		}
	}

	/** Returns true if the owner is detached */
	private boolean isOwnerDetached() {
		return Detacher.isDetached(getEObject());
	}

	/**
	 * Constructor, used for the clone method
	 * 
	 * @param ownerSM
	 *            The owner StateManager
	 * @param fieldName
	 *            The name of the field of the SCO.
	 */
	private EListWrapper(EListWrapper copyFrom) {
		super((InternalEObject) copyFrom.getEObject(), copyFrom.getEStructuralFeature(), new ArrayList());
		containmentList = copyFrom.containmentList;
		jdoDelegate = new JPOXArrayList(copyFrom.stateManager, copyFrom.elistFieldName);
		isEObjectList = copyFrom.isEObjectList;
		isObjectList = copyFrom.isObjectList;
		log.debug("Cloned elist: " + getLogString());
	}

	/** Nullify the delegate and stateManager before serializing */
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		jdoDelegate = null;
		stateManager = null;
		out.defaultWriteObject();
	}

	/** Replace normal EObject with AnyTypeImpl */
	private Object replaceForAnyType(Object obj) {
		if (isEObjectList)
			return replaceForAnyTypeEObject(obj);
		if (isObjectList)
			return replaceForAnyTypeObject(obj);

		return obj; // note that an exception can not be thrown because the
		// replace is always tried
	}

	/** Do your subclass thing for serialization */
	protected void additionalWriteObject() {
		stateManager = null;
	}

	/** Replace normal EObject with AnyTypeImpl */
	private Object replaceForAnyTypeObject(Object obj) {
		assert (isObjectList);

		if (jdoDelegate == null)
			return obj; // do this at attach

		if (obj instanceof AnyTypeObject) {
			return (AnyTypeObject) obj;
		}

		return new AnyTypeObject(getPM(), obj);
	}

	/** Replace normal EObject with AnyTypeImpl */
	private Object replaceForAnyTypeEObject(Object obj) {
		assert (isEObjectList);

		assert (obj instanceof EObject);

		if (jdoDelegate == null) {
			return obj; // do this at attach
		}

		if (obj instanceof AnyTypeEObject) {
			return (AnyTypeEObject) obj;
		}

		return new AnyTypeEObject(getPM(), (EObject) obj);
	}

	// ----------------------- Implementation of JPOXElist methods
	// -------------------

	/** Detaches this wrapper and all its children, but makes no copy */
	public void detach(Detacher detacher) {
		// if we are not yet loaded and are not loading then return
		if (!isLoaded() && !isLoading()) {
			return;
		}

		// load ourselves
		load();

		for (int i = 0; i < size(); i++) {
			Object object = get(i);

			if (object instanceof PersistenceCapable) {
				// if the object is attached but there is already a detached
				// version then
				// use that
				if (!Detacher.isDetached((EObject) object)) {
					final PersistenceCapable pc = (PersistenceCapable) object;
					final Object detachedVersion = detacher.getDetachedVersion(pc);
					if (detachedVersion != null) {
						basicSet(i, detachedVersion, null);
						object = detachedVersion;
					}
				}
				detacher.detachPreCommit((PersistenceCapable) object);
			} else if (object instanceof SCO) {
				detacher.detachSCO((SCO) object);
			}
		}

		log.debug("Detached elist: " + getLogString());
	}

	/**
	 * Method to detach the elements of this list.
	 */
	public void detach(FetchPlanState state) {
		load();
		jdoDelegate.detach(state);

		final Object[] values = toArray();
		for (int i = 0; i < values.length; i++) {
			if (values[i] != null && values[i] instanceof PersistenceCapable) {
				stateManager.getPersistenceManager().detachInternal(values[i], state);
			}
		}
		stateManager = null;
		jdoDelegate = null;
	}

	/**
	 * Method to return a detached copy of the list.
	 */
	public Object detachCopy(FetchPlanState state) {
		final ArrayList detached = new ArrayList();
		final Object[] values = toArray();
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				detached.add(null);
			} else {
				Object object = values[i];
				if (object instanceof PersistenceCapable) {
					detached.add(stateManager.getPersistenceManager().detachCopyInternal(object, state));
				} else {
					detached.add(object);
				}
			}
		}
		
		// create a delegating ecorelist, this ensures that all the feature characteristics
		// are supported
		final EStructuralFeature feature = getEStructuralFeature();
		final InternalEObject myOwner = (InternalEObject)getOwner();
		final EList elist = new DelegatingEcoreEList(myOwner) {
			protected List delegateList() {
				return detached;
			}
			
			public EStructuralFeature getEStructuralFeature() {
				return feature; 
			}
		};

		return elist;
	}

	/** Detach self, means nullify all references to jdo */
	public void detachSelf() {
		// and detach ourselves also
		jdoDelegate = null;
		stateManager = null;
	}

	/**
	 * Method to run reachability on this SCO.
	 * 
	 * @param reachables
	 *            List of StateManagers reachable so far
	 */
	public void runReachability(java.util.Set reachables) {
		Object[] values = toArray();
		for (int i = 0; i < values.length; i++) {
			if (values[i] != null && values[i] instanceof PersistenceCapable) {
				StateManager sm = stateManager.getPersistenceManager().findStateManager((PersistenceCapable) values[i]);
				if (sm != null) { // already detached
					sm.runReachability(reachables);
				}
			}
		}
	}

	/** Set method for SCO.set */
	public Object set(int arg0, Object arg1, boolean arg2) {
		return jdoDelegate.set(arg0, arg1, arg2);
	}

	// ----------------------- Implementation of SCO methods -------------------

	/** Returns the persistence manager from the owner */
	private PersistenceManager getPM() {
		final PersistenceCapable pc = (PersistenceCapable) getEObject();
		if (!isOwnerDetached())
			return pc.jdoGetPersistenceManager();
		throw new JpoxStoreException("This method may not be called if the elist is detached");
	}

	/** Clones this object */
	public Object clone() {
		return new EListWrapper(this);
	}

	/**
	 * Mutator for setting using an object.
	 * 
	 * @param o
	 *            The object to set from
	 */
	public void setValueFrom(Object o) {
		Collection c = (Collection) o;
		clear();
		delegate.addAll(c);
	}

	/**
	 * Accessor for the field name.
	 * 
	 * @return The field name
	 */
	public String getFieldName() {
		return elistFieldName;
	}

	/**
	 * Accessor for the owner object.
	 * 
	 * @return The owner object
	 */
	public Object getOwner() {
		return getEObject();
	}

	/**
	 * Method to unset the owner and field information.
	 */
	public synchronized void unsetOwner() {
		log.debug("Unsetting owner of elist " + getLogString());

		if (jdoDelegate != null) {
			elistFieldName = null;
			jdoDelegate = null;
			stateManager = null;
		}
	}

	/**
	 * Utility to mark the object as dirty
	 */
	public void makeDirty() {
		if (jdoDelegate != null)
			jdoDelegate.makeDirty();
	}

	/**
	 * Method to make transient all elements of this list.
	 */
	public void makeTransient(FetchPlanState state) {
		final Object[] values = toArray();
		for (int i = 0; i < values.length; i++) {
			if (values[i] != null && values[i] instanceof PersistenceCapable) {
				stateManager.getPersistenceManager().makeTransientInternal(values[i], state);
			}
		}
		stateManager = null;
		jdoDelegate = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpox.sco.SCO#setValueFrom(java.lang.Object, boolean)
	 */
	public void setValueFrom(Object arg0, boolean arg1) throws ClassCastException {
		final Collection c = (Collection) arg0;
		if (arg1) {
			clear();
			addAll(c);
		} else {
			getDelegate().clear();
			getDelegate().addAll(c);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpox.sco.SCOCollection#getElementType()
	 */
	public Class getElementType() {
		return getEStructuralFeature().getEType().getInstanceClass();
	}

	/**
	 * Method to re-attach a detached collection. Goes through the existing elements in the store for this owner field
	 * and removes ones no longer present, and adds new elements. All elements in the (detached) value are attached.
	 * 
	 * @param value
	 *            The new (collection) value
	 * @param makeTransactional
	 *            Whether to make this transactional
	 */
	public void attachCopy(Object value) {
		// if not loaded then nothing changed so nothing to attach
		assert (value instanceof PersistableEList);
		if (!((PersistableEList) value).isLoaded())
			return;

		java.util.Collection c = (java.util.Collection) value;

		// force a load!
		load();

		// Attach all of the elements in the new list
		final ArrayList attachedElements = new ArrayList(c.size());
		final Iterator iter = c.iterator();
		while (iter.hasNext()) {
			Object detachedElement = iter.next();
			if (ClassUtils.isPersistenceCapable(detachedElement)) {
				if (Detacher.isDetached((EObject) detachedElement)) {
					// TODO: handle embedded
					attachedElements.add(((AbstractPersistenceManager) getPM()).attachCopy(detachedElement, false));
				} else {
					attachedElements.add(((AbstractPersistenceManager) getPM()).makePersistent(detachedElement));
				}
			} else {
				attachedElements.add(detachedElement);
			}
		}
		log.debug("Attaching " + attachedElements.size() + " objects to elist " + getLogString());
		// NOTE: needed to pass the jdodelegate because the update actions
		// should go directly to the
		// underlying datastore and not through this list. Tests showed that if
		// the updates where
		// done directly in this list that in case of bidirectional reatlions
		// elements which had
		// been moved from one list to another ended up with empty relations
		// because the remove
		// action in the updateListWithListElements cleared the one side of the
		// bidirectional case.
		JpoxUtil.updateListWithListElements(jdoDelegate, attachedElements);
	}

	/**
	 * Method to return a ResultObjectFactory for the SCO.
	 * 
	 * @param stmt
	 *            The QueryStatement
	 * @param ignoreCache
	 *            Whether to ignore the cache
	 * @param resultClass
	 *            Whether to create objects of a particular class
	 * @param useFetchPlan
	 *            whether to use the fetch plan to retrieve fields in the same query
	 * @return The ResultObjectFactory
	 */
	public synchronized Query.ResultObjectFactory newResultObjectFactory(QueryExpression stmt, boolean ignoreCache,
			Class resultClass, boolean useFetchPlan) {
		if (jdoDelegate == null) {
			throw new QueryUnownedSCOException();
		}
		return jdoDelegate.newResultObjectFactory(stmt, ignoreCache, resultClass, useFetchPlan);
	}

	/**
	 * Method to update an embedded element in this collection.
	 * 
	 * @param element
	 *            The element
	 * @param fieldNumber
	 *            Number of field in the element
	 * @param value
	 *            New value for this field
	 */
	public void updateEmbeddedElement(Object element, int fieldNumber, Object value) {
		if (jdoDelegate != null) {
			jdoDelegate.updateEmbeddedElement(element, fieldNumber, value);
		}
	}

	// ------------------------ Query Statement methods ------------------------

	/**
	 * Method to generate a QueryStatement for the SCO.
	 * 
	 * @return The QueryStatement
	 */
	public synchronized QueryExpression newQueryStatement() {
		if (jdoDelegate == null) {
			throw new QueryUnownedSCOException();
		}
		return jdoDelegate.newQueryStatement();
	}

	/**
	 * Method to return a QueryStatement, using the specified candidate class.
	 * 
	 * @param candidate_class
	 *            The candidate class
	 * @return The QueryStatement
	 */
	public synchronized QueryExpression newQueryStatement(Class candidate_class) {
		if (jdoDelegate == null) {
			throw new QueryUnownedSCOException();
		}
		return jdoDelegate.newQueryStatement(candidate_class);
	}

	/**
	 * Method to return a ResultObjectFactory for the SCO.
	 * 
	 * @param stmt
	 *            The QueryStatement
	 * @param ignoreCache
	 *            Whether to ignore the cache
	 * @param resultClass
	 *            Whether to create objects of a particular class
	 * @param useFetchPlan
	 *            whether to use the fetch plan to retrieve fields in the same query
	 * @return The ResultObjectFactory
	 */
	public synchronized Query.ResultObjectFactory newResultObjectFactory(QueryStatement stmt, boolean ignoreCache,
			Class resultClass, boolean useFetchPlan) {
		if (jdoDelegate == null) {
			throw new QueryUnownedSCOException();
		}

		return jdoDelegate.newResultObjectFactory(stmt, ignoreCache, resultClass, useFetchPlan);
	}

	// ---------------------------------- EList methods including loading from
	// the store ------------------------

	/** Does the actual loading from the store in a synchronized manner */
	protected synchronized void doLoad() {
		AssertUtil.assertTrue("EList " + getLogString() + " is already loaded", !isLoaded());

		// if there is a resource and this resource is not loading then this is
		// a lazy collection
		// which is retrieved on demand
		final Resource res = getEObject().eResource();
		boolean controlTrans = res != null && res instanceof JPOXResourceDAO && !((StoreResource) res).isLoading();
		Transaction tx = null;
		PersistenceManager pm = null;
		boolean err = true;
		try {
			if (controlTrans) {
				pm = ((JPOXResource) res).getPersistenceManager();
				tx = pm.currentTransaction();
				controlTrans = !tx.isActive();
				if (controlTrans) {
					tx.begin();
				}
			}

			// note add directly to the delegate to prevent infinite looping and
			// notifications
			final List list = getDelegate();
			final Iterator iter = jdoDelegate.iterator();
			while (iter.hasNext()) {
				Object child = iter.next();

				// get the eobject if hidden behind an eobjectlistelement
				// bit ugly to reuse child var but okay
				if (child instanceof AnyTypeEObject) {
					child = ((AnyTypeEObject) child).getEObject();
				} else if (child instanceof AnyTypeObject) {
					child = ((AnyTypeObject) child).getObject();
				}
				list.add(child);
			}

			err = false;
		} finally {
			if (controlTrans && !err) {
				// set the jdoDelegate to null so that detach actions
				// are not reflected back into the jdoDelegate
				jdoDelegate = null;

				// now detach what we just loaded
				((JPOXResourceDAO) res).setIsDetaching(true);
				err = true;
				Detacher detacher = null;
				try {
					detacher = new Detacher((JPOXResourceDAO) res);
					detach(detacher);
					err = false;
				} finally {
					((JPOXResourceDAO) res).setIsDetaching(false);
					if (err) {
						tx.rollback();
					} else {
						tx.commit();
					}

					// Actually detaches all the to-detach objects
					detacher.detachPostCommit();

					// detach ourselves because this elist is not being detached
					detachSelf();
				}
			} else if (err) {
				if (controlTrans)
					tx.rollback();
			}
		}

		if (res != null && res instanceof StoreResource)
			((StoreResource) res).setIsLoading(true);
		try {
			final Iterator it = getDelegate().iterator();
			while (it.hasNext()) {
				final Object child = it.next();
				if (containmentList) {
					EContainerRepairControl.repair(getEObject(), child, getEStructuralFeature());
				} else if (res != null && res instanceof ResourceImpl) {
					// attach the new objects so that they are adapted when
					// required
					if (child instanceof EObject) {
						((ResourceImpl) res).attached((EObject) child);
					}
				}
			}
		} finally {
			if (res != null && res instanceof StoreResource)
				((JPOXResource) res).setIsLoading(false);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.mapping.elist.PersistableEList#isPersistencyWrapped()
	 */
	public boolean isPersistencyWrapped() {
		return true;
	}

	/**
	 * Updates the backing store
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#didAdd(int, java.lang.Object)
	 */
	protected void didAdd(int index, Object newObject) {
		if (jdoDelegate != null)
			jdoDelegate.add(index, replaceForAnyType(newObject));
		super.didAdd(index, newObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#didChange()
	 */
	protected void didChange() {
		if (jdoDelegate != null)
			jdoDelegate.makeDirty();
		super.didChange();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#didClear(int, java.lang.Object[])
	 */
	protected void didClear(int size, Object[] oldObjects) {
		if (oldObjects == null)
			return;

		if (jdoDelegate != null)
			jdoDelegate.clear();

		// don't do super do clear because it calls didremveo again
		// super.didClear(size, oldObjects);

		if (containmentList) // check if this is now handled correctly by
		// jpox
		{
			if (!isOwnerDetached()) {
				// check which part of the list is persistencecapable!
				// only that part should be deleted
				final ArrayList pcList = new ArrayList();
				for (int i = 0; i < oldObjects.length; i++) {
					if (oldObjects[i] instanceof PersistenceCapable) {
						pcList.add(oldObjects[i]);
					}
				}

				getPM().deletePersistentAll(pcList);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#didMove(int, java.lang.Object, int)
	 */
	protected void didMove(int index, Object movedObject, int oldIndex) {
		if (jdoDelegate != null) {
			// note that the object moved/removed from the jdo delegate can be
			// different from the
			// one stored in this list (because of handling anytype)
			Object obj = jdoDelegate.get(oldIndex);
			jdoDelegate.add(index, obj);
			/*
			 * no join table for !containment therefor the following is not required anymore if (!containmentList) // in
			 * case of containment no join table and the set statement will have solved it all { int delPos =
			 * oldPosition; if (newPosition < oldPosition) { delPos++; } listStore.remove(stateManager, delPos); }
			 */
		}
		super.didMove(index, movedObject, oldIndex);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#didRemove(int, java.lang.Object)
	 */
	protected void didRemove(int index, Object oldObject) {
		// note that the object removed from the jdo delegate can be different
		// from the
		// one stored in this list (because of handling anytype), therefore
		// remove on the basis
		// index is chosen
		if (jdoDelegate != null) {
			Object obj = jdoDelegate.remove(index);

			if (containmentList && !isOwnerDetached() && obj instanceof PersistenceCapable && owner.eResource() == null) {
				// only remove if not working within a resource because the resource will handle the remove then
				PersistenceCapable pc = (PersistenceCapable) oldObject;
				if (pc.jdoIsPersistent() || pc.jdoIsTransactional()) {
					getPM().deletePersistent(obj);
				}
			}
		}
		super.didRemove(index, oldObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#didSet(int, java.lang.Object, java.lang.Object)
	 */
	protected void didSet(int index, Object newObject, Object oldObject) {
		// not that the object removed from the jdo delegate can be different
		// from the
		// one stored in this list (because of handling anytype)
		if (jdoDelegate != null) {
			jdoDelegate.set(index, replaceForAnyType(newObject));

			if (containmentList && !isOwnerDetached() && oldObject instanceof PersistenceCapable) {
				PersistenceCapable pc = (PersistenceCapable) oldObject;
				if (pc.jdoIsPersistent() || pc.jdoIsTransactional()) {
					getPM().deletePersistent(oldObject);
				}
			}
		}

		super.didSet(index, newObject, oldObject);
	}
}