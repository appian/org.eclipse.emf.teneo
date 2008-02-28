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
 * $Id: EMFSoftRefCache.java,v 1.4 2008/02/28 07:09:04 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.cache;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.teneo.jpox.JpoxUtil;
import org.jpox.cache.SoftRefCache;

/**
 * Implementation of cache to add econtainer control for new objects.
 * 
 * @see java.lang.ref.WeakReference
 * @version $Revision: 1.4 $
 */
@SuppressWarnings("unchecked")
public class EMFSoftRefCache extends SoftRefCache {
	/** Is overridden to repair econtainer references for new objects */
	public Object put(Object key, Object value) {
		JpoxUtil.repairContainer(value);
		return super.put(key, value);
	}

	/** Is overridden to repair econtainer references */
	public void putAll(Map t) {
		final Iterator it = t.values().iterator();
		while (it.hasNext()) {
			JpoxUtil.repairContainer(it.next());
		}
		super.putAll(t);
	}
}