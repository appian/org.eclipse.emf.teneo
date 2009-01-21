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
package org.eclipse.emf.teneo.eclipselink.elist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;

public class EclipseLinkEList<E> extends BasicEList<E> implements InternalEList.Unsettable<E>,
		EStructuralFeature.Setting {

	private static final String PLACEHOLDER_ERROR_MESSAGE = "EclipseLinkEList is a temporary placeholder--usage implies a bug in Teneo.";
	private static final long serialVersionUID = 1L;

	public EclipseLinkEList() {
		super();
	}

	public EclipseLinkEList(Collection<? extends E> collection) {
		super(collection);
	}

	public EclipseLinkEList(int size, Object[] data) {
		super(size, data);
	}

	public EclipseLinkEList(int initialCapacity) {
		super(initialCapacity);
	}

	@Override
	public ListIterator<E> basicListIterator(int index) {
		return super.basicListIterator(index);
	}

	@Override
	public Iterator<E> basicIterator() {
		return super.basicIterator();
	}

	@Override
	public ListIterator<E> basicListIterator() {
		return super.basicListIterator();
	}

	@Override
	public List<E> basicList() {
		return super.basicList();
	}

	public NotificationChain basicRemove(Object object, NotificationChain notifications) {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public NotificationChain basicAdd(E object, NotificationChain notifications) {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public boolean isSet() {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public void unset() {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public Object get(boolean resolve) {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public EObject getEObject() {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public EStructuralFeature getEStructuralFeature() {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public void set(Object newValue) {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public boolean basicContains(Object arg0) {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public boolean basicContainsAll(Collection<?> arg0) {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public int basicIndexOf(Object arg0) {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public int basicLastIndexOf(Object arg0) {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public Object[] basicToArray() {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}

	public <T> T[] basicToArray(T[] arg0) {
		throw new RuntimeException(PLACEHOLDER_ERROR_MESSAGE);
	}
}
