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
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * The list used in instances mapped using the EAV schema.
 */
public class EAVDelegatingEMap<K, V> extends EAVDelegatingEcoreEList<Map.Entry<K, V>> implements EMap<K, V>,
		EAVDelegatingList {

	private static final long serialVersionUID = 1L;
	private List<?> persistentList;

	public EAVDelegatingEMap(InternalEObject owner) {
		super(owner);
	}

	@SuppressWarnings("unchecked")
	protected EMap<K, V> getDelegateMap() {
		return (EMap<K, V>) getDelegate();
	}

	public V get(Object key) {
		return getDelegateMap().get(key);
	}

	public V put(K key, V value) {
		return getDelegateMap().put(key, value);
	}

	public void putAll(Map<? extends K, ? extends V> map) {
		getDelegateMap().putAll(map);
	}

	public void putAll(EMap<? extends K, ? extends V> map) {
		getDelegateMap().putAll(map);
	}

	public int indexOfKey(Object key) {
		return getDelegateMap().indexOfKey(key);
	}

	public boolean containsKey(Object key) {
		return getDelegateMap().containsKey(key);
	}

	public boolean containsValue(Object value) {
		return getDelegateMap().containsValue(value);
	}

	public V removeKey(Object key) {
		return getDelegateMap().removeKey(key);
	}

	public Map<K, V> map() {
		return getDelegateMap().map();
	}

	public Set<Map.Entry<K, V>> entrySet() {
		return getDelegateMap().entrySet();
	}

	public Set<K> keySet() {
		return getDelegateMap().keySet();
	}

	public Collection<V> values() {
		return getDelegateMap().values();
	}

}
