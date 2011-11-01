/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: DelegatingLateLoadingList.java,v 1.1 2009/09/12 05:47:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A list implementation which initializes its delegate when it is really called and not earlier.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @deprecated not used at the moment
 */
public class DelegatingLateLoadingList<E extends Object> implements List<E> {

	private List<?> persistentList = null;
	private List<E> delegateList = null;

	private void initialize() {
		if (delegateList != null) {
			return;
		}
		delegateList = new ArrayList<E>();
		for (Object eavValueObj : persistentList) {
			delegateList.add(getConvertedValue(eavValueObj));
		}
	}

	@SuppressWarnings("unchecked")
	protected E getConvertedValue(Object value) {
		return (E) ((EAVValueHolder) value).getValue();
	}

	public List<?> getPersistentList() {
		return persistentList;
	}

	public void setPersistentList(List<?> persistentList) {
		this.persistentList = persistentList;
	}

	public boolean add(E e) {
		initialize();
		return delegateList.add(e);
	}

	public void add(int index, E element) {
		initialize();
		delegateList.add(index, element);
	}

	public boolean addAll(Collection<? extends E> c) {
		initialize();
		return delegateList.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		initialize();
		return delegateList.addAll(index, c);
	}

	public void clear() {
		initialize();
		delegateList.clear();
	}

	public boolean contains(Object o) {
		initialize();
		return delegateList.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		initialize();
		return delegateList.containsAll(c);
	}

	public boolean equals(Object o) {
		initialize();
		return delegateList.equals(o);
	}

	public E get(int index) {
		initialize();
		return delegateList.get(index);
	}

	public int hashCode() {
		initialize();
		return delegateList.hashCode();
	}

	public int indexOf(Object o) {
		initialize();
		return delegateList.indexOf(o);
	}

	public boolean isEmpty() {
		initialize();
		return delegateList.isEmpty();
	}

	public Iterator<E> iterator() {
		initialize();
		return delegateList.iterator();
	}

	public int lastIndexOf(Object o) {
		initialize();
		return delegateList.lastIndexOf(o);
	}

	public ListIterator<E> listIterator() {
		initialize();
		return delegateList.listIterator();
	}

	public ListIterator<E> listIterator(int index) {
		initialize();
		return delegateList.listIterator(index);
	}

	public E remove(int index) {
		initialize();
		return delegateList.remove(index);
	}

	public boolean remove(Object o) {
		initialize();
		return delegateList.remove(o);
	}

	public boolean removeAll(Collection<?> c) {
		initialize();
		return delegateList.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		initialize();
		return delegateList.retainAll(c);
	}

	public E set(int index, E element) {
		initialize();
		return delegateList.set(index, element);
	}

	public int size() {
		initialize();
		return delegateList.size();
	}

	public List<E> subList(int fromIndex, int toIndex) {
		initialize();
		return delegateList.subList(fromIndex, toIndex);
	}

	public Object[] toArray() {
		initialize();
		return delegateList.toArray();
	}

	public <T> T[] toArray(T[] a) {
		initialize();
		return delegateList.toArray(a);
	}

	public static class FeatureMapList extends DelegatingLateLoadingList<FeatureMap.Entry> {

		private InternalEObject owner;

		protected FeatureMap.Entry getConvertedValue(Object value) {
			return (FeatureMap.Entry) ((EAVValueHolder) value).get(owner);
		}

		public InternalEObject getOwner() {
			return owner;
		}

		public void setOwner(InternalEObject owner) {
			this.owner = owner;
		}

	}
}