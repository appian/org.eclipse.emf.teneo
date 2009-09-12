/**
 * Copyright (c) 2009 Martin Taal and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Taal - initial api
 */
package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * The emap which initializes itself from the persistent collection when first accessed.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EAVDelegatingEMap<K, V> implements EMap<K, V>, EAVDelegatingList,
		InternalEList.Unsettable<Map.Entry<K, V>>, EStructuralFeature.Setting {

	private static final long serialVersionUID = 1L;
	private List<?> persistentList;
	private EcoreEMap<K, V> delegatingEMap;
	private EClass entryEClass;
	private Class<?> entryClass;
	private InternalEObject owner;
	private int featureID;

	public EAVDelegatingEMap(EClass entryEClass, Class<?> entryClass, InternalEObject owner, int featureID) {
		this.entryClass = entryClass;
		this.entryEClass = entryEClass;
		this.owner = owner;
		this.featureID = featureID;
	}

	public boolean isDelegateInitialized() {
		return delegatingEMap != null;
	}

	@SuppressWarnings("unchecked")
	private void initialize() {
		if (delegatingEMap != null) {
			return;
		}
		delegatingEMap = new EcoreEMap<K, V>(entryEClass, entryClass, owner, featureID);

		for (Object obj : persistentList) {
			EAVSingleContainmentEReferenceValueHolder valueHolder = (EAVSingleContainmentEReferenceValueHolder) obj;
			delegatingEMap.basicAdd((BasicEMap.Entry<K, V>) valueHolder.getReferenceValue(), null);
		}
		// force the map to be computed, this sets the internal entrydata/size member
		delegatingEMap.get(null);
	}

	public boolean add(Entry<K, V> object) {
		initialize();
		return delegatingEMap.add(object);
	}

	public void add(int index, Entry<K, V> object) {
		initialize();
		delegatingEMap.add(index, object);
	}

	public boolean addAll(Collection<? extends Entry<K, V>> collection) {
		initialize();
		return delegatingEMap.addAll(collection);
	}

	public boolean addAll(int index, Collection<? extends Entry<K, V>> collection) {
		initialize();
		return delegatingEMap.addAll(index, collection);
	}

	public boolean addAllUnique(Collection<? extends Entry<K, V>> collection) {
		initialize();
		return delegatingEMap.addAllUnique(collection);
	}

	public boolean addAllUnique(int index, Collection<? extends Entry<K, V>> collection) {
		initialize();
		return delegatingEMap.addAllUnique(index, collection);
	}

	public void addUnique(Entry<K, V> object) {
		initialize();
		delegatingEMap.addUnique(object);
	}

	public void addUnique(int index, Entry<K, V> object) {
		initialize();
		delegatingEMap.addUnique(index, object);
	}

	public NotificationChain basicAdd(Entry<K, V> object, NotificationChain notifications) {
		initialize();
		return delegatingEMap.basicAdd(object, notifications);
	}

	public boolean basicContains(Object object) {
		initialize();
		return delegatingEMap.basicContains(object);
	}

	public boolean basicContainsAll(Collection<?> collection) {
		initialize();
		return delegatingEMap.basicContainsAll(collection);
	}

	public org.eclipse.emf.common.util.BasicEMap.Entry<K, V> basicGet(int index) {
		initialize();
		return delegatingEMap.basicGet(index);
	}

	public int basicIndexOf(Object object) {
		initialize();
		return delegatingEMap.basicIndexOf(object);
	}

	public Iterator<Entry<K, V>> basicIterator() {
		initialize();
		return delegatingEMap.basicIterator();
	}

	public int basicLastIndexOf(Object object) {
		initialize();
		return delegatingEMap.basicLastIndexOf(object);
	}

	public List<Entry<K, V>> basicList() {
		initialize();
		return delegatingEMap.basicList();
	}

	public ListIterator<Entry<K, V>> basicListIterator() {
		initialize();
		return delegatingEMap.basicListIterator();
	}

	public ListIterator<Entry<K, V>> basicListIterator(int index) {
		initialize();
		return delegatingEMap.basicListIterator(index);
	}

	public NotificationChain basicRemove(Object object, NotificationChain notifications) {
		initialize();
		return delegatingEMap.basicRemove(object, notifications);
	}

	public Object[] basicToArray() {
		initialize();
		return delegatingEMap.basicToArray();
	}

	public <T> T[] basicToArray(T[] array) {
		initialize();
		return delegatingEMap.basicToArray(array);
	}

	public void clear() {
		initialize();
		delegatingEMap.clear();
	}

	public Object clone() {
		initialize();
		return delegatingEMap.clone();
	}

	public boolean contains(Object object) {
		initialize();
		return delegatingEMap.contains(object);
	}

	public boolean containsAll(Collection<?> collection) {
		initialize();
		return delegatingEMap.containsAll(collection);
	}

	public boolean containsKey(Object key) {
		initialize();
		return delegatingEMap.containsKey(key);
	}

	public boolean containsValue(Object value) {
		initialize();
		return delegatingEMap.containsValue(value);
	}

	public Set<Entry<K, V>> entrySet() {
		initialize();
		return delegatingEMap.entrySet();
	}

	public boolean equals(Object object) {
		initialize();
		return delegatingEMap.equals(object);
	}

	public Object get(boolean resolve) {
		initialize();
		return delegatingEMap.get(resolve);
	}

	public org.eclipse.emf.common.util.BasicEMap.Entry<K, V> get(int index) {
		initialize();
		return delegatingEMap.get(index);
	}

	public V get(Object key) {
		initialize();
		return delegatingEMap.get(key);
	}

	public EObject getEObject() {
		initialize();
		return delegatingEMap.getEObject();
	}

	public EStructuralFeature getEStructuralFeature() {
		initialize();
		return delegatingEMap.getEStructuralFeature();
	}

	public int hashCode() {
		initialize();
		return delegatingEMap.hashCode();
	}

	public int indexOf(Object object) {
		initialize();
		return delegatingEMap.indexOf(object);
	}

	public int indexOfKey(Object key) {
		initialize();
		return delegatingEMap.indexOfKey(key);
	}

	public boolean isEmpty() {
		initialize();
		return delegatingEMap.isEmpty();
	}

	public boolean isSet() {
		initialize();
		return delegatingEMap.isSet();
	}

	public Iterator<Entry<K, V>> iterator() {
		initialize();
		return delegatingEMap.iterator();
	}

	public Set<K> keySet() {
		initialize();
		return delegatingEMap.keySet();
	}

	public int lastIndexOf(Object object) {
		initialize();
		return delegatingEMap.lastIndexOf(object);
	}

	public ListIterator<Entry<K, V>> listIterator() {
		initialize();
		return delegatingEMap.listIterator();
	}

	public ListIterator<Entry<K, V>> listIterator(int index) {
		initialize();
		return delegatingEMap.listIterator(index);
	}

	public Map<K, V> map() {
		initialize();
		return delegatingEMap.map();
	}

	public void move(int index, Entry<K, V> object) {
		initialize();
		delegatingEMap.move(index, object);
	}

	public Entry<K, V> move(int targetIndex, int sourceIndex) {
		initialize();
		return delegatingEMap.move(targetIndex, sourceIndex);
	}

	public V put(K key, V value) {
		initialize();
		return delegatingEMap.put(key, value);
	}

	public void putAll(EMap<? extends K, ? extends V> map) {
		initialize();
		delegatingEMap.putAll(map);
	}

	public void putAll(Map<? extends K, ? extends V> map) {
		initialize();
		delegatingEMap.putAll(map);
	}

	public Entry<K, V> remove(int index) {
		initialize();
		return delegatingEMap.remove(index);
	}

	public boolean remove(Object object) {
		initialize();
		return delegatingEMap.remove(object);
	}

	public boolean removeAll(Collection<?> collection) {
		initialize();
		return delegatingEMap.removeAll(collection);
	}

	public V removeKey(Object key) {
		initialize();
		return delegatingEMap.removeKey(key);
	}

	public boolean retainAll(Collection<?> collection) {
		initialize();
		return delegatingEMap.retainAll(collection);
	}

	public Entry<K, V> set(int index, Entry<K, V> object) {
		initialize();
		return delegatingEMap.set(index, object);
	}

	public void set(Object value) {
		initialize();
		delegatingEMap.set(value);
	}

	public Entry<K, V> setUnique(int index, Entry<K, V> object) {
		initialize();
		return delegatingEMap.setUnique(index, object);
	}

	public int size() {
		initialize();
		return delegatingEMap.size();
	}

	public List<Entry<K, V>> subList(int start, int end) {
		initialize();
		return delegatingEMap.subList(start, end);
	}

	public Object[] toArray() {
		initialize();
		return delegatingEMap.toArray();
	}

	public <T> T[] toArray(T[] array) {
		initialize();
		return delegatingEMap.toArray(array);
	}

	public String toString() {
		initialize();
		return delegatingEMap.toString();
	}

	public void unset() {
		initialize();
		delegatingEMap.unset();
	}

	public Collection<V> values() {
		initialize();
		return delegatingEMap.values();
	}

	public List<?> getPersistentList() {
		return persistentList;
	}

	public void setPersistentList(List<?> persistentList) {
		this.persistentList = persistentList;
	}

}
