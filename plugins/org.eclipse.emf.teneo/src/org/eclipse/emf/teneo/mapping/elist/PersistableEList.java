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
 * $Id: PersistableEList.java,v 1.8 2007/01/02 17:53:32 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapping.elist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.DelegatingEcoreEList;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * A persistable elist which can be used by different or mappers. This persistable elist works around the idea that the
 * persisted list (e.g. PersistentList in Hibernate) is the delegate for this elist.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */

public abstract class PersistableEList extends DelegatingEcoreEList implements EMap, PersistableDelegateList {
	/** The logger */
	private static Log log = LogFactory.getLog(PersistableEList.class);

	/** The actual list, must never be an elist as notifications etc. are done by this list */
	protected List delegate;

	/** The structural feature modeled by this list */
	private EStructuralFeature estructuralFeature;

	/** The unique path to the efeature, used to support serializaion */
	private String eFeaturePath = "";

	/** Is loaded from backend */
	private boolean isLoaded = false;

	/** Is being loaded from backend */
	private boolean isLoading = false;

	/** The string used for logging */
	protected final String logString;

	/** Constructor */
	public PersistableEList(InternalEObject owner, EStructuralFeature feature, List list) {
		super(owner);
		estructuralFeature = feature;
		if (list == null) {
			delegate = new ArrayList();
			isLoaded = true;
		} else if (list instanceof EList) {
			delegate = new ArrayList(list);
			isLoaded = true;
		} else if (list instanceof ArrayList) // already loaded lists are packaged in an elist
		{
			delegate = list;
			isLoaded = list.size() > 0;
		} else {
			delegate = list;
		}

		logString = "EList of type: " + this.getClass().getName() + " of member " + estructuralFeature.getName()
				+ " owned by " + owner.getClass().getName() + " with delegate list " + delegate.getClass().getName();

		log.debug("Created persistable list " + logString);
	}

	/** Takes care of serializing the efeature */
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		eFeaturePath = StoreUtil.structuralFeatureToString(estructuralFeature);
		estructuralFeature = null;
		additionalWriteObject();
		out.defaultWriteObject();
	}

	/** Do your subclass thing for serialization */
	protected void additionalWriteObject() {
	}

	/** Takes care of deserializing the efeature */
	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		estructuralFeature = StoreUtil.stringToStructureFeature(eFeaturePath);
	}

	/*
	 * Get the underlying efeature
	 * 
	 * @see org.eclipse.emf.ecore.util.DelegatingEcoreEList#getEStructuralFeature()
	 */
	public EStructuralFeature getEStructuralFeature() {
		return estructuralFeature;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.DelegatingEcoreEList#getFeature()
	 */
	public Object getFeature() {
		return estructuralFeature;
	}

	/** Return the isunique value of the efeature */
	public boolean isUnique() {
		return estructuralFeature.isUnique();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.DelegatingEcoreEList#getFeatureID()
	 */
	public int getFeatureID() {
		return estructuralFeature.getFeatureID();
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
		// disabled this assertion because in case of a session refresh it is possible
		// that the list is replaced by a persistent list
		// AssertUtil.assertTrue("This elist " + logString + " already wraps an or specific list",
		// !isPersistencyWrapped());

		delegate = newDelegate;
		isLoaded = false;
	}

	/** Returns a string which can be used to log for this elist */
	public String getLogString() {
		return logString;
	}

	/** Performs the load action if not yet oaded and sends out the load notification. */
	protected void load() {
		if (isLoaded())
			return;

		// When we are loading we should not be reloaded!
		// this can happen in the jpox elist impl. when detaching
		if (isLoading)
			return;

		isLoading = true;
		log.debug("Loading " + getLogString());

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

	/** Is loading */
	public void setIsLoading(boolean isLoading) {
		this.isLoading = isLoading;
	}

	/** Returns true if the load action is running and false otherwise */
	public boolean isLoading() {
		return isLoading;
	}

	/** The load method which should be overridden by the subclass to add lazyloading */
	protected abstract void doLoad();

	/** Returns true if the wrapped list is a persistency layer specific list */
	public abstract boolean isPersistencyWrapped();

	// ---------------------------- Overloaded delegate methods --------------------------
	// These methods have been overridden to a load action before the backing list is
	// accessed.

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

	/** If not loaded then basicIterator will always return a false for hasNext */
	public Iterator basicIterator() {
		if (!isLoaded()) {
			return new NonResolvingEIterator() {
				/** Always returns false */
				public boolean hasNext() {
					return false;
				}
			};
		}

		return super.basicIterator();
	}

	/** If not loaded then basicIterator will always return a false for hasNext/hasPrevious */
	public ListIterator basicListIterator() {
		if (!isLoaded()) {
			return new NonResolvingEListIterator() {
				/** Always returns false */
				public boolean hasNext() {
					return false;
				}

				/** Always returns false */
				public boolean hasPrevious() {
					return false;
				}
			};
		}

		return super.basicListIterator();
	}

	/** If not loaded then basicIterator will always return a false for hasNext/hasPrevious */
	public ListIterator basicListIterator(int index) {
		if (!isLoaded()) {
			// note no size check on index as this would load this thing
			return new NonResolvingEListIterator() {
				/** Always returns false */
				public boolean hasNext() {
					return false;
				}

				/** Always returns false */
				public boolean hasPrevious() {
					return false;
				}
			};
		}

		return super.basicListIterator(index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#containsKey(java.lang.Object)
	 */
	public boolean containsKey(Object arg0) {
		return get(arg0) != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#containsValue(java.lang.Object)
	 */
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#entrySet()
	 */
	public Set entrySet() {
		return new TreeSet(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#get(java.lang.Object)
	 */
	public Object get(Object arg0) {
		for (Iterator it = iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			if (arg0.equals(entry.getKey())) {
				return entry.getValue();
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#indexOfKey(java.lang.Object)
	 */
	public int indexOfKey(Object arg0) {
		final Object entry = get(arg0);
		return indexOf(entry);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#keySet()
	 */
	public Set keySet() {
		final Set set = new TreeSet();
		for (Iterator it = iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			set.add(entry.getKey());
		}
		return set;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#map()
	 */
	public Map map() {
		return new DelegatingMap();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#put(java.lang.Object, java.lang.Object)
	 */
	public Object put(Object key, Object value) {
		Object entry = get(key);
		if (entry != null) {
			((Entry) entry).setValue(value);
			return entry;
		}
		entry = newEntry(key, value);
		add(entry);
		return entry;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#putAll(org.eclipse.emf.common.util.EMap)
	 */
	public void putAll(EMap arg0) {
		putAll(arg0.map());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#putAll(java.util.Map)
	 */
	public void putAll(Map arg0) {
		load();
		addAll(Arrays.asList(arg0.entrySet().toArray()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#removeKey(java.lang.Object)
	 */
	public Object removeKey(Object arg0) {
		load();
		for (Iterator it = iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			if (arg0.equals(entry.getKey())) {
				remove(entry);
				return entry.getValue();
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#values()
	 */
	public Collection values() {
		final ArrayList result = new ArrayList();
		for (Iterator it = iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			result.add(entry.getValue());
		}

		return result;
	}

	/** returns a new map entry */
	protected Entry newEntry(Object key, Object value) {
		final EClass entryEClass = (EClass) getEStructuralFeature().getEType();

		org.eclipse.emf.common.util.BasicEMap.Entry entry = (org.eclipse.emf.common.util.BasicEMap.Entry) entryEClass
				.getEPackage().getEFactoryInstance().create(entryEClass);
		entry.setHash(key == null ? 0 : key.hashCode());
		entry.setKey(key);
		entry.setValue(value);
		return entry;
	}

	/** Forwards all calls to its EListWrapper */
	public class DelegatingMap implements EMap.InternalMapView {
		public DelegatingMap() {
		}

		public EMap eMap() {
			return PersistableEList.this;
		}

		public int size() {
			return PersistableEList.this.size();
		}

		public boolean isEmpty() {
			return PersistableEList.this.isEmpty();
		}

		public boolean containsKey(Object key) {
			return PersistableEList.this.containsKey(key);
		}

		public boolean containsValue(Object value) {
			return PersistableEList.this.containsValue(value);
		}

		public Object get(Object key) {
			return PersistableEList.this.get(key);
		}

		public Object put(Object key, Object value) {
			return PersistableEList.this.put(key, value);
		}

		public Object remove(Object key) {
			return PersistableEList.this.removeKey(key);
		}

		public void putAll(Map map) {
			PersistableEList.this.putAll(map);
		}

		public void clear() {
			PersistableEList.this.clear();
		}

		public Set keySet() {
			return PersistableEList.this.keySet();
		}

		public Collection values() {
			return PersistableEList.this.values();
		}

		public Set entrySet() {
			return PersistableEList.this.entrySet();
		}

		public boolean equals(Object object) {
			return PersistableEList.this.equals(object);
		}

		public int hashCode() {
			return PersistableEList.this.hashCode();
		}
		
		public boolean isLoaded() {
			return PersistableEList.this.isLoaded();
		}
	}

	/** 
	 * Is overridden because it can't use delegates for equality because the delegate
	 * (a hibernate or jpox list) will try to be equal with this persistable elist.
	 * 
	 * This method does jvm instance equality because doing a full-fledge equal would result in 
	 * a load of the list.
	 */
	public boolean equals(Object object) {
		return this == object;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}