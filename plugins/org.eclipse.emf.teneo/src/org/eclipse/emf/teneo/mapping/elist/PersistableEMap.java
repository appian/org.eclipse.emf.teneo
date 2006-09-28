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
 *   Douglas Bitting
 *   Martin Taal
 *
 * </copyright>
 *
 * $Id: PersistableEMap.java,v 1.2 2006/09/28 20:04:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.mapping.elist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;

/**
 * A persistable emap which delegates to another map for persisting changes.
 * 
 * @version $Revision: 1.2 $
 */
public abstract class PersistableEMap extends EcoreEMap implements EMap {
	/** The logger */
	private static Log log = LogFactory.getLog(PersistableEMap.class);

	/** The delegate map to which operations are forwarded */
	private Map delegateMap;

	/** Is true if being loaded */
	private boolean loading = false;
	
	/** Is true if has been loaded */
	private boolean loaded = false;

	/** The log string for this instance */
	private final String logString;
	
	/** Constructor */
	public PersistableEMap(EClass entryEClass, Class entryClass, InternalEObject owner, int featureID, Map delegateMap) {
		super(entryEClass, entryClass, owner, featureID);

		// note the delegatemap will be passed on to the superclass at the doload action.
		if (delegateMap == null) {
			this.delegateMap = new HashMap();
			loaded = true;
		} else {
			this.delegateMap = delegateMap;
			loaded = false;
		}

		logString = "EList of type: " + this.getClass().getName() + " of member " + getEStructuralFeature().getName()
				+ " owned by " + owner.getClass().getName() + " with delegate list " + 
				this.delegateMap.getClass().getName();

		log.debug("Created persistable list " + logString);
	}
	
	/** Constructor */
	public PersistableEMap(EClass entryEClass, Class entryClass, InternalEObject owner, int featureID, EMap delegateMap) {
		super(entryEClass, entryClass, owner, featureID);

		// note the delegatemap will be passed on to the superclass at the doload action.
		if (delegateMap == null) {
			this.delegateMap = new HashMap();
			loaded = true;
		} else {
			this.delegateMap = (Map)delegateMap.map();
			loaded = delegateMap.size() > 0;
			if (loaded) {
				loading = true;
				try {
					set(delegateMap);
				} finally {
					loading = false;
				}
			}
		}

		logString = "EList of type: " + this.getClass().getName() + " of member " + getEStructuralFeature().getName()
				+ " owned by " + owner.getClass().getName() + " with delegate list " + 
				this.delegateMap.getClass().getName();

		log.debug("Created persistable list " + logString);
	}

	protected void didAdd(Entry entry) {
		if (loading) {
			return;
		}
		delegateMap.put(entry.getKey(), entry.getValue());
		super.didAdd(entry);
	}

	protected void didClear(BasicEList[] oldEntryData) {
		if (loading) {
			return;
		}
		delegateMap.clear();
		super.didClear(oldEntryData);
	}

	protected void didModify(Entry entry, Object oldValue) {
		if (loading) {
			return;
		}
		delegateMap.put(entry.getKey(), entry.getValue());
		super.didModify(entry, oldValue);
	}

	protected void didRemove(Entry entry) {
		if (loading) {
			return;
		}
		delegateMap.remove(entry.getKey());
		super.didRemove(entry);
	}

	public Map getPersistableMap() {
		return this.delegateMap;
	}


	/** Performs the load action if not yet oaded and sends out the load notification. */
	protected void load() {
		if (loaded)
			return;

		// When we are loading we should not be reloaded!
		// this can happen in the jpox elist impl. when detaching
		if (loading)
			return;

		loading = true;
		log.debug("Loading " + getLogString());

		doLoad();
		loaded = true;
		loading = false;
		// StoreUtil.dispatchEListLoadNotification(owner, this, getEStructuralFeature());
	}

	/** The method which does persistency layer specific actions */
	protected abstract void doLoad();
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#addUnique(int, java.lang.Object)
	 */
	public void addUnique(int arg0, Object arg1) {
		load();
		super.addUnique(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#addUnique(java.lang.Object)
	 */
	public void addUnique(Object arg0) {
		load();
		super.addUnique(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#basicAdd(java.lang.Object, org.eclipse.emf.common.notify.NotificationChain)
	 */
	public NotificationChain basicAdd(Object arg0, NotificationChain arg1) {
		load();
		return super.basicAdd(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#basicGet(int)
	 */
	public Object basicGet(int arg0) {
		load();
		return super.basicGet(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#basicIterator()
	 */
	public Iterator basicIterator() {
		load();
		return super.basicIterator();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#basicList()
	 */
	public List basicList() {
		load();
		return super.basicList();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#basicListIterator()
	 */
	public ListIterator basicListIterator() {
		load();
		return super.basicListIterator();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#basicListIterator(int)
	 */
	public ListIterator basicListIterator(int arg0) {
		load();
		return super.basicListIterator(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#basicRemove(java.lang.Object, org.eclipse.emf.common.notify.NotificationChain)
	 */
	public NotificationChain basicRemove(Object arg0, NotificationChain arg1) {
		load();
		return super.basicRemove(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#get(boolean)
	 */
	public Object get(boolean arg0) {
		load();
		return super.get(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#isSet()
	 */
	public boolean isSet() {
		load();
		return super.isSet();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#newList()
	 */
	protected BasicEList newList() {
		load();
		return super.newList();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#set(java.lang.Object)
	 */
	public void set(Object arg0) {
		load();
		super.set(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#setUnique(int, java.lang.Object)
	 */
	public Object setUnique(int arg0, Object arg1) {
		load();
		return super.setUnique(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreEMap#unset()
	 */
	public void unset() {
		load();
		super.unset();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#add(int, java.lang.Object)
	 */
	public void add(int arg0, Object arg1) {
		load();
		super.add(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#add(java.lang.Object)
	 */
	public boolean add(Object arg0) {
		load();
		return super.add(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#addAll(java.util.Collection)
	 */
	public boolean addAll(Collection arg0) {
		load();
		return super.addAll(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#addAll(int, java.util.Collection)
	 */
	public boolean addAll(int arg0, Collection arg1) {
		load();
		return super.addAll(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#clear()
	 */
	public void clear() {
		load();
		super.clear();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#clone()
	 */
	public Object clone() {
		return super.clone();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#contains(java.lang.Object)
	 */
	public boolean contains(Object arg0) {
		load();
		return super.contains(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#containsAll(java.util.Collection)
	 */
	public boolean containsAll(Collection arg0) {
		load();
		return super.containsAll(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#containsKey(java.lang.Object)
	 */
	public boolean containsKey(Object arg0) {
		load();
		return super.containsKey(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#containsValue(java.lang.Object)
	 */
	public boolean containsValue(Object arg0) {
		load();
		return super.containsValue(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#entrySet()
	 */
	public Set entrySet() {
		load();
		return super.entrySet();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#get(int)
	 */
	public Object get(int arg0) {
		load();
		return super.get(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#get(java.lang.Object)
	 */
	public Object get(Object arg0) {
		load();
		return super.get(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#grow(int)
	 */
	protected boolean grow(int arg0) {
		load();
		return super.grow(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#indexOf(int)
	 */
	protected int indexOf(int arg0) {
		load();
		return super.indexOf(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#indexOf(java.lang.Object)
	 */
	public int indexOf(Object arg0) {
		load();
		return super.indexOf(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#indexOfKey(java.lang.Object)
	 */
	public int indexOfKey(Object arg0) {
		load();
		return super.indexOfKey(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#isEmpty()
	 */
	public boolean isEmpty() {
		load();
		return super.isEmpty();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#iterator()
	 */
	public Iterator iterator() {
		load();
		return super.iterator();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#keySet()
	 */
	public Set keySet() {
		load();
		return super.keySet();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#lastIndexOf(java.lang.Object)
	 */
	public int lastIndexOf(Object arg0) {
		load();
		return super.lastIndexOf(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#listIterator()
	 */
	public ListIterator listIterator() {
		load();
		return super.listIterator();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#listIterator(int)
	 */
	public ListIterator listIterator(int arg0) {
		load();
		return super.listIterator(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#map()
	 */
	public Map map() {
		load();
		return super.map();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#move(int, int)
	 */
	public Object move(int arg0, int arg1) {
		load();
		return super.move(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#move(int, java.lang.Object)
	 */
	public void move(int arg0, Object arg1) {
		load();
		super.move(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#newEntryData(int)
	 */
	protected BasicEList[] newEntryData(int arg0) {
		load();
		return super.newEntryData(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#put(java.lang.Object, java.lang.Object)
	 */
	public Object put(Object arg0, Object arg1) {
		load();
		return super.put(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#putAll(org.eclipse.emf.common.util.EMap)
	 */
	public void putAll(EMap arg0) {
		load();
		super.putAll(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#putAll(java.util.Map)
	 */
	public void putAll(Map arg0) {
		load();
		super.putAll(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#putEntry(org.eclipse.emf.common.util.BasicEMap.Entry, java.lang.Object)
	 */
	protected Object putEntry(Entry arg0, Object arg1) {
		load();
		return super.putEntry(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#remove(int)
	 */
	public Object remove(int arg0) {
		load();
		return super.remove(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#remove(java.lang.Object)
	 */
	public boolean remove(Object arg0) {
		load();
		return super.remove(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#removeAll(java.util.Collection)
	 */
	public boolean removeAll(Collection arg0) {
		load();
		return super.removeAll(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#removeEntry(int, int)
	 */
	protected Object removeEntry(int arg0, int arg1) {
		load();
		return super.removeEntry(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#removeKey(java.lang.Object)
	 */
	public Object removeKey(Object arg0) {
		load();
		return super.removeKey(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#resolve(java.lang.Object, java.lang.Object)
	 */
	protected Object resolve(Object arg0, Object arg1) {
		load();
		return super.resolve(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#retainAll(java.util.Collection)
	 */
	public boolean retainAll(Collection arg0) {
		load();
		return super.retainAll(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#set(int, java.lang.Object)
	 */
	public Object set(int arg0, Object arg1) {
		load();
		return super.set(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#size()
	 */
	public int size() {
		load();
		return super.size();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#subList(int, int)
	 */
	public List subList(int arg0, int arg1) {
		load();
		return super.subList(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#toArray()
	 */
	public Object[] toArray() {
		load();
		return super.toArray();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#toArray(java.lang.Object[])
	 */
	public Object[] toArray(Object[] arg0) {
		load();
		return super.toArray(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#toString()
	 */
	public String toString() {
		load();
		return super.toString();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#validateKey(java.lang.Object)
	 */
	protected void validateKey(Object arg0) {
		load();
		super.validateKey(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#validateValue(java.lang.Object)
	 */
	protected void validateValue(Object arg0) {
		load();
		super.validateValue(arg0);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#values()
	 */
	public Collection values() {
		load();
		return super.values();
	}

	/**
	 * @return the logString
	 */
	public String getLogString() {
		return logString;
	}

	/**
	 * @return the loaded
	 */
	public boolean isLoaded() {
		return loaded;
	}

	/**
	 * @return the loading
	 */
	public boolean isLoading() {
		return loading;
	}

	/**
	 * @return the delegateMap
	 */
	public Map getDelegateMap() {
		return delegateMap;
	}

	/**
	 * @param loaded the loaded to set
	 */
	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}
}
