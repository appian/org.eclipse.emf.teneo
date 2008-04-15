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
    throw new RuntimeException("EclipseLinkEMap.get not implemented");
  }

  public V put(Object key, Object value) {
    throw new RuntimeException("EclipseLinkEMap.put not implemented");
  }

  public void putAll(Map<? extends K, ? extends V> map) {
    throw new RuntimeException("EclipseLinkEMap.putAll not implemented");
  }

  public void putAll(EMap<? extends K, ? extends V> map) {
    throw new RuntimeException("EclipseLinkEMap.putAll not implemented");
  }

  public int indexOfKey(Object key) {
    throw new RuntimeException("EclipseLinkEMap.indexOfKey not implemented");
  }

  public boolean containsKey(Object key) {
    throw new RuntimeException("EclipseLinkEMap.containsKey not implemented");
  }

  public boolean containsValue(Object value) {
    throw new RuntimeException("EclipseLinkEMap.containsValue not implemented");
  }

  public V removeKey(Object key) {
    throw new RuntimeException("EclipseLinkEMap.removeKey not implemented");
  }

  public Map<K, V> map() {
    throw new RuntimeException("EclipseLinkEMap.map not implemented");
  }

  /**
   * returns the list contents (of Entries) as a set
   */
  public Set<Map.Entry<K, V>> entrySet() {
    return new HashSet<Map.Entry<K, V>>(this);
  }

  public Set<K> keySet() {
    throw new RuntimeException("EclipseLinkEMap.keySet not implemented");
  }

  public Collection<V> values() {
    throw new RuntimeException("EclipseLinkEMap.values not implemented");
  }
}
