/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DynamicAction.java,v 1.4 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

/**
 * A DynamicEObjectImpl which implements Serializable. This is required by Hibernate.
 * 
 * TODO: probably serialization code has to be added to actually support serialization of a 
 * DynamicEObjectImpl. Often however Hibernate won't really serialize the object, so it might not be
 * necessary for most cases.
 * 
 * Implements Map so that Hibernate can use the MapAccessor to get to the values.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */ 
public class SerializableDynamicEObjectImpl extends DynamicEObjectImpl implements Serializable, Map<String, Object> {
	
	private static final long serialVersionUID = 1L;

	public SerializableDynamicEObjectImpl(EClass eClass) {
		super(eClass);
	}

	public int size() {
		return eClass().getEAllStructuralFeatures().size();
	}

	public boolean isEmpty() {
		// an eobject is never empty
		return false;
	}

	public boolean containsKey(Object key) {
		if (!(key instanceof String)) {
			return false;
		}
		final String keyString = (String)key;
		final EStructuralFeature eFeature = eClass().getEStructuralFeature(keyString);
		if (eFeature == null) {
			return false;
		}
		return true;
	}

	public boolean containsValue(Object value) {
		if (value == null) {
			return false;
		}
		for (EStructuralFeature eFeature : eClass().getEAllStructuralFeatures()) {
			final Object featureValue  = eGet(eFeature);
			if (featureValue != null && value.equals(featureValue)) {
				return true;
			}
		}
		return false;
	}

	public Object get(Object key) {
		return eGet(eClass().getEStructuralFeature((String)key));
	}

	public Object put(String key, Object value) {
		eSet(eClass().getEStructuralFeature(key), value);
		return value;
	}

	public Object remove(Object key) {
		final Object value = get(key);
		eSet(eClass().getEStructuralFeature((String)key), null);
		return value;
	}

	public void putAll(Map<? extends String, ? extends Object> t) {
		for (String key : t.keySet()) {
			put(key, t.get(key));
		}
	}

	public void clear() {
		throw new UnsupportedOperationException();
	}

	public Set<String> keySet() {
		final HashSet<String> keySet = new HashSet<String>();
		for (EStructuralFeature eFeature : eClass().getEAllStructuralFeatures()) {
			keySet.add(eFeature.getName());
		}
		return keySet;
	}

	public Collection<Object> values() {
		final List<Object> values = new ArrayList<Object>();
		for (EStructuralFeature eFeature : eClass().getEAllStructuralFeatures()) {
			values.add(eGet(eFeature));
		}
		return values;
	}

	public Set<java.util.Map.Entry<String, Object>> entrySet() {
		throw new UnsupportedOperationException();
	}
}