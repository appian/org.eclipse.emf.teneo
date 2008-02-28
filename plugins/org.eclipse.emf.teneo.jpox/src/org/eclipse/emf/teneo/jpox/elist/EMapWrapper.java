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
 * $Id: EMapWrapper.java,v 1.2 2008/02/28 07:09:03 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.BasicEMap.Entry;
import org.eclipse.emf.ecore.EClass;
import org.jpox.StateManager;

/**
 * This class works as a wrapper around the EList as it is used in the EMF objects. The class extends PersistableEList,
 * the delegate of this elist is a normal arraylist. In addition this class has a reference to a jpox arraylist which
 * represents the underlying datastore. The jpox arraylist can not be used as the delegate because certain type of store
 * objects (AnyObject_ are replaced by their contained value at load time, this indirection can not be accomplished when
 * the jpox arraylist is the delegate.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2008/02/28 07:09:03 $
 */

public class EMapWrapper<K, V> extends EListWrapper<Map.Entry<K, V>> implements EMap<K, V> {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -6719775217240311479L;

	/** The logger */
	//private static Log log = LogFactory.getLog(EMapWrapper.class);

	/**
	 * Constructor, using the StateManager of the "owner" and the field name.
	 * 
	 * @param ownerSM
	 *            The owner StateManager
	 * @param fieldName
	 *            The name of the field of the SCO.
	 */
	public EMapWrapper(StateManager ownerSM, String fieldName) {
		super(ownerSM, fieldName, new ArrayList<Map.Entry<K, V>>());
	}

	/**
	 * Constructor, using the StateManager of the "owner" and the field name.
	 * 
	 * @param ownerSM
	 *            The owner StateManager
	 * @param fieldName
	 *            The name of the field of the SCO.
	 */
	public EMapWrapper(StateManager ownerSM, String fieldName, List<Map.Entry<K, V>> list) {
		super(ownerSM, fieldName, list);
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
		for (V v : values()) {
			if (v.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#entrySet()
	 */
	public Set<Map.Entry<K, V>> entrySet() {
		return new HashSet<Map.Entry<K, V>>(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#get(java.lang.Object)
	 */
	public V get(Object arg0) {
		for (Iterator<Map.Entry<K, V>> it = iterator(); it.hasNext();) {
			Entry<K, V> entry = (Entry<K, V>) it.next();
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
	public Set<K> keySet() {
		final Set<K> set = new TreeSet<K>();
		for (Map.Entry<K, V> e : entrySet()) {
			set.add(e.getKey());
		}
		return set;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#map()
	 */
	public Map<K, V> map() {
		return new DelegatingMap();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#put(java.lang.Object, java.lang.Object)
	 */
	public V put(K key, V value) {
		Map.Entry<K, V> e = get(indexOfKey(key));
		if (e != null) {
			e.setValue(value);
			return value;
		}
		add(newEntry(key, value));
		return value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#putAll(org.eclipse.emf.common.util.EMap)
	 */
	public void putAll(EMap<? extends K, ? extends V> arg0) {
		putAll(arg0.map());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#putAll(java.util.Map)
	 */
	@SuppressWarnings("unchecked")
	public void putAll(Map<? extends K, ? extends V> arg0) {
		load();
		addAll((Collection<? extends Map.Entry<K, V>>)Arrays.asList(arg0.entrySet().toArray()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#removeKey(java.lang.Object)
	 */
	public V removeKey(Object arg0) {
		load();
		for (Map.Entry<K, V> e : entrySet()) {
			if (arg0.equals(e.getKey())) {
				remove(e);
				return e.getValue();
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.EMap#values()
	 */
	public Collection<V> values() {
		final ArrayList<V> result = new ArrayList<V>();
		for (Map.Entry<K, V> e : entrySet()) {
			result.add(e.getValue());
		}

		return result;
	}

	/** returns a new map entry */
	protected Map.Entry<K, V> newEntry(K key, V value) {
		final EClass entryEClass = (EClass) getEStructuralFeature().getEType();

		@SuppressWarnings("unchecked") org.eclipse.emf.common.util.BasicEMap.Entry<K, V> entry = (org.eclipse.emf.common.util.BasicEMap.Entry) entryEClass
				.getEPackage().getEFactoryInstance().create(entryEClass);
		entry.setHash(key == null ? 0 : key.hashCode());
		entry.setKey(key);
		entry.setValue(value);
		return entry;
	}

	/** Forwards all calls to its EListWrapper */
	public class DelegatingMap implements EMap.InternalMapView<K, V> {
		public DelegatingMap() {
		}

		public EMap<K, V> eMap() {
			return EMapWrapper.this;
		}

		public int size() {
			return EMapWrapper.this.size();
		}

		public boolean isEmpty() {
			return EMapWrapper.this.isEmpty();
		}

		public boolean containsKey(Object key) {
			return EMapWrapper.this.containsKey(key);
		}

		public boolean containsValue(Object value) {
			return EMapWrapper.this.containsValue(value);
		}

		public V get(Object key) {
			return EMapWrapper.this.get(key);
		}

		public V put(K key, V value) {
			return EMapWrapper.this.put(key, value);
		}

		public V remove(Object o) {
			final Entry<K, V> e = EMapWrapper.this.get(indexOfKey(o));
			if (e != null) {
				return e.getValue();
			}
			return null;
		}

		public V remove(Map.Entry<K, V> o) {
			if (EMapWrapper.this.remove(o)) {
				return o.getValue();
			}
			return null;
		}

		public void putAll(Map<? extends K, ? extends V> map) {
			EMapWrapper.this.putAll(map);
		}

		public void clear() {
			EMapWrapper.this.clear();
		}

		public Set<K> keySet() {
			return EMapWrapper.this.keySet();
		}

		public Collection<V> values() {
			return EMapWrapper.this.values();
		}

		public Set<Entry<K, V>> entrySet() {
			return EMapWrapper.this.entrySet();
		}

		public boolean equals(Object object) {
			return EMapWrapper.this.equals(object);
		}

		public int hashCode() {
			return EMapWrapper.this.hashCode();
		}
		
		public boolean isLoaded() {
			return EMapWrapper.this.isLoaded();
		}
	}

}