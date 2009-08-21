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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;

/**
 * Extends EcoreEMap to make the doPut method visible.
 */
public class EAVEMap<K, V> extends EcoreEMap<K, V> implements EAVDelegatingList {

	private static final long serialVersionUID = 1L;

	public EAVEMap(EClass entryEClass, Class<?> entryClass, InternalEObject owner, int featureID) {
		super(entryEClass, entryClass, owner, featureID);

		entryData = newEntryData(10);
	}

	public void addToMap(Entry<K, V> entry) {
		doPut(entry);
	}
}
