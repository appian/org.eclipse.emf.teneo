/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.emap;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.teneo.eclipselink.elist.EclipseLinkEList;
import org.eclipse.emf.teneo.eclipselink.internal.messages.Messages;

public class EclipseLinkEMap<K, V> extends EclipseLinkEList<Map.Entry<K, V>> implements EMap<K, V> {

	private static final long serialVersionUID = 1L;

	public EclipseLinkEMap() {
		super();
	}

	public EclipseLinkEMap(Collection<? extends Map.Entry<K, V>> collection) {
		super(collection);
	}

	public EclipseLinkEMap(int size, Object[] data) {
		super(size, data);
	}

	public EclipseLinkEMap(int initialCapacity) {
		super(initialCapacity);
	}

	public V get(Object key) {
		throw new UnsupportedOperationException(Messages.exception_getNotImplemented);
	}

	public V put(Object key, Object value) {
		throw new UnsupportedOperationException(Messages.exception_putNotImplemented);
	}

	public void putAll(Map<? extends K, ? extends V> map) {
		throw new UnsupportedOperationException(Messages.exception_putAllNotImplemented);
	}

	public void putAll(EMap<? extends K, ? extends V> map) {
		throw new UnsupportedOperationException(Messages.exception_putAllNotImplemented);
	}

	public int indexOfKey(Object key) {
		throw new UnsupportedOperationException(Messages.exception_indexOfKeyNotImplemented);
	}

	public boolean containsKey(Object key) {
		throw new UnsupportedOperationException(Messages.exception_containsKeyNotImplemented);
	}

	public boolean containsValue(Object value) {
		throw new UnsupportedOperationException(Messages.exception_containsValueNotImplemented);
	}

	public V removeKey(Object key) {
		throw new UnsupportedOperationException(Messages.exception_removeKeyNotImplemented);
	}

	public Map<K, V> map() {
		throw new UnsupportedOperationException(Messages.exception_mapNotImplemented);
	}

	/**
	 * returns the list contents (of Entries) as a set
	 */
	public Set<Map.Entry<K, V>> entrySet() {
		return new HashSet<Map.Entry<K, V>>(this);
	}

	public Set<K> keySet() {
		throw new UnsupportedOperationException(Messages.exception_keySetNotImplmplemented);
	}

	public Collection<V> values() {
		throw new UnsupportedOperationException(Messages.exception_valuesNotImplemented);
	}
}
