/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EMFNullCache.java,v 1.3 2007/02/08 23:14:52 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.teneo.jpox.JpoxUtil;
import org.jpox.cache.Level1Cache;

/**
 * Own implementation of level 1 cache to prevent any caching during testing. This cache also does econtainer references
 * repair for new objects.
 * 
 * @see java.lang.ref.WeakReference
 * @version $Revision: 1.3 $
 */
@SuppressWarnings("unchecked")
public class EMFNullCache implements Level1Cache {
	public EMFNullCache() {
		// default constructor
	}

	public Object put(Object key, Object value) {
		JpoxUtil.repairContainer(value);
		return value;
	}

	public Object get(Object key) {
		return null;
	}

	public boolean containsKey(Object key) {
		return false;
	}

	public Object remove(Object key) {
		return null;
	}

	public void clear() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#containsValue(java.lang.Object)
	 */
	public boolean containsValue(Object value) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#entrySet()
	 */
	public Set entrySet() {
		return new HashSet();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#isEmpty()
	 */
	public boolean isEmpty() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#keySet()
	 */
	public Set keySet() {
		return new HashSet();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#putAll(java.util.Map)
	 */
	public void putAll(Map t) {
		final Iterator it = t.values().iterator();
		while (it.hasNext()) {
			JpoxUtil.repairContainer(it.next());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#size()
	 */
	public int size() {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Map#values()
	 */
	public Collection values() {
		return new ArrayList();
	}
}