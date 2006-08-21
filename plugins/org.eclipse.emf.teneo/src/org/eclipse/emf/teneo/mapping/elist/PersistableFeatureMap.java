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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PersistableFeatureMap.java,v 1.3 2006/08/21 13:27:27 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapping.elist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.DelegatingFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.teneo.StoreException;
import org.eclipse.emf.teneo.type.FeatureMapEntry;
import org.eclipse.emf.teneo.util.AssertUtil;

/**
 * A persistable elist which can be used by different or mappers. This persistable elist works around the idea that the
 * persisted list (e.g. PersistentList in Hibernate) is the delegate for this elist.
 * 
 * Note the delegate**() methods are overridden to force a load before anything else happens with the delegated list.
 * The addUnique. addSet methods are overridden to ensure that the featuremap entries of the right type are passed to
 * the persistent store.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public abstract class PersistableFeatureMap extends DelegatingFeatureMap implements PersistableDelegateList {
	/** The logger */
	private static Log log = LogFactory.getLog(PersistableFeatureMap.class);

	/** The actual list, must never be an elist as notifications etc. are done by this list */
	protected List delegate;

	/** Is loaded from backend */
	private boolean isLoaded = false;

	/** Is being loaded from backend */
	private boolean isLoading = false;

	/** The string used for logging */
	protected final String logString;

	/** The type of the elements in this list */
	private final Class elementType;

	/** Constructor */
	public PersistableFeatureMap(InternalEObject owner, EStructuralFeature feature, List list) {
		super(owner, feature);
		elementType = determineElementType();

		if (list == null) {
			delegate = new ArrayList();
			isLoaded = true;
		} else if (list instanceof EList) {
			AssertUtil.assertTrue("The passed elist is not a featuremap but a : " + list.getClass().getName()
					+ ". Error in featureMap: " + getLogString(), list instanceof FeatureMap);

			delegate = replaceEntryAll(list);
			isLoaded = true;
		} else {
			delegate = list;
			isLoaded = list.size() > 0;
		}

		logString = "FeatureMap of member " + getEStructuralFeature().getName() + " owned by "
				+ owner.getClass().getName() + " with delegate list " + delegate.getClass().getName();

		log.debug("Created persistable featuremap " + logString);
	}

	/** Returns the element type to be used */
	protected abstract Class determineElementType();

	/** Returns the element type */
	public Class getElementType() {
		return elementType;
	}

	/** Shortcut to replace entries */
	protected FeatureMap.Entry replaceEntry(Object entry) {
		if (entry instanceof FeatureMapEntry && ((FeatureMapEntry) entry).belongsToFeatureMap(this)) {
			return (FeatureMapEntry) entry;
		}

		final FeatureMap.Entry emfEntry = (FeatureMap.Entry) entry;
		return (FeatureMap.Entry) createEntry(emfEntry.getEStructuralFeature(), emfEntry.getValue());
	}

	/** Convenience to replace all */
	private List replaceEntryAll(Collection coll) {
		final ArrayList result = new ArrayList();
		final Iterator it = coll.iterator();
		while (it.hasNext()) {
			result.add(replaceEntry(it.next()));
		}
		return result;
	}

	/** Creates an exception with the logID added, without a cause */
	protected StoreException createException(String msg) {
		return new StoreException(msg + "\n" + getLogString());
	}

	/** Creates an exception with the logID added, without a cause */
	protected StoreException createException(String msg, Throwable t) {
		return new StoreException(msg + "\n" + getLogString(), t);
	}

	/** Return the delegate list without doing a load */
	public List getDelegate() {
		return delegate;
	}

	/** Returns the underlying elist */
	protected List delegateList() {
		load();

		return delegate;
	}

	/** Replace the delegating list */
	public void replaceDelegate(List newDelegate) {
		AssertUtil.assertTrue("This featuremap " + logString + " already wraps an or specific featuremap",
				!isPersistencyWrapped());

		delegate = newDelegate;
		isLoaded = false;
	}

	/** Returns a string which can be used to log for this elist */
	public String getLogString() {
		return logString;
	}

	/** Performs the load action if not yet loaded and sends out the load notification */
	protected void load() {
		if (isLoaded)
			return;

		// When we are loading we should not be reloaded!
		// this can happen in the jpox fm impl. when detaching
		if (isLoading)
			return;

		isLoading = true;
		doLoad();
		isLoaded = true;
		isLoading = false;
		// StoreUtil.dispatchEListLoadNotification(owner, this, getEStructuralFeature());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreEList#isNotificationRequired()
	 */
	protected boolean isNotificationRequired() {
		if (!isLoaded() || isLoading())
			return false; // not yet loaded so no notifications, prevents infinite looping
		return super.isNotificationRequired();
	}

	/** Is loaded */
	public boolean isLoaded() {
		return isLoaded;
	}

	/** Is loaded */
	public void setIsLoaded(boolean isLoaded) {
		this.isLoaded = isLoaded;
	}

	/** Returns true if the load action is running and false otherwise */
	public boolean isLoading() {
		return isLoading;
	}

	/** The load method which should be overridden by the subclass to add lazyloading */
	protected abstract void doLoad();

	/** Returns true if the wrapped list is a persistency layer specific list */
	public abstract boolean isPersistencyWrapped();

	/** Override the didadd to enable opposite setting */
	protected void didAdd(int index, Object obj) {
		final NotificationChain nc = inverseAdd(obj, null);
		if (nc != null && isNotificationRequired())
			nc.dispatch();
		super.didAdd(index, obj);
	}

	/** Override the didremove to enable opposite setting */
	protected void didRemove(int index, Object obj) {
		final NotificationChain nc = inverseRemove(obj, null);
		if (nc != null && isNotificationRequired())
			nc.dispatch();
		super.didRemove(index, obj);
	}

	// ---------------------------- Overloaded delegate methods --------------------------
	// These methods have been overridden to a load action before the backing list is
	// accessed.

	/** OVerridden to create the correct featuremap entry */
	protected abstract FeatureMap.Entry createEntry(EStructuralFeature eStructuralFeature, Object value);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateAdd(int, java.lang.Object)
	 */
	protected void delegateAdd(int index, Object object) {
		load();
		super.delegateAdd(index, object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateAdd(java.lang.Object)
	 */
	protected void delegateAdd(Object object) {
		load();
		super.delegateAdd(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.DelegatingNotifyingListImpl#addAllUnique(java.util.Collection)
	 */
	public boolean addAllUnique(Collection collection) {
		return super.addAllUnique(replaceEntryAll(collection));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.DelegatingNotifyingListImpl#addAllUnique(int, java.util.Collection)
	 */
	public boolean addAllUnique(int index, Collection collection) {
		return super.addAllUnique(index, replaceEntryAll(collection));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.DelegatingNotifyingListImpl#addUnique(int, java.lang.Object)
	 */
	public void addUnique(int index, Object object) {
		super.addUnique(index, replaceEntry(object));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.DelegatingNotifyingListImpl#addUnique(java.lang.Object)
	 */
	public void addUnique(Object object) {
		super.addUnique(replaceEntry(object));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.DelegatingNotifyingListImpl#setUnique(int, java.lang.Object)
	 */
	public Object setUnique(int index, Object object) {
		return super.setUnique(index, replaceEntry(object));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateBasicList()
	 */
	protected List delegateBasicList() {
		load();
		return super.delegateBasicList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateClear()
	 */
	protected void delegateClear() {
		load();
		super.delegateClear();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateContains(java.lang.Object)
	 */
	protected boolean delegateContains(Object object) {
		load();
		return super.delegateContains(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateContainsAll(java.util.Collection)
	 */
	protected boolean delegateContainsAll(Collection collection) {
		load();
		return super.delegateContainsAll(collection);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateEquals(java.lang.Object)
	 */
	protected boolean delegateEquals(Object object) {
		load();
		return super.delegateEquals(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateGet(int)
	 */
	protected Object delegateGet(int index) {
		load();
		return super.delegateGet(index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateHashCode()
	 */
	protected int delegateHashCode() {
		load();
		return super.delegateHashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateIndexOf(java.lang.Object)
	 */
	protected int delegateIndexOf(Object object) {
		load();
		return super.delegateIndexOf(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateIsEmpty()
	 */
	protected boolean delegateIsEmpty() {
		load();
		return super.delegateIsEmpty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateIterator()
	 */
	protected Iterator delegateIterator() {
		load();
		return super.delegateIterator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateLastIndexOf(java.lang.Object)
	 */
	protected int delegateLastIndexOf(Object object) {
		load();
		return super.delegateLastIndexOf(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateListIterator()
	 */
	protected ListIterator delegateListIterator() {
		// TODO Auto-generated method stub
		return super.delegateListIterator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateRemove(int)
	 */
	protected Object delegateRemove(int index) {
		load();
		return super.delegateRemove(index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateSet(int, java.lang.Object)
	 */
	protected Object delegateSet(int index, Object object) {
		load();
		return super.delegateSet(index, object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateSize()
	 */
	protected int delegateSize() {
		load();
		return super.delegateSize();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateToArray()
	 */
	protected Object[] delegateToArray() {
		load();
		return super.delegateToArray();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateToArray(java.lang.Object[])
	 */
	protected Object[] delegateToArray(Object[] array) {
		load();
		return super.delegateToArray(array);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateToString()
	 */
	protected String delegateToString() {
		load();
		return super.delegateToString();
	}

}