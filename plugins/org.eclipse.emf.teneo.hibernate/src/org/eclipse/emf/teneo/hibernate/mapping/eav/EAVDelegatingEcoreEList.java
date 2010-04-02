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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.DelegatingEcoreEList;
import org.eclipse.emf.teneo.hibernate.LazyCollectionUtils;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.hibernate.collection.AbstractPersistentCollection;
import org.hibernate.collection.PersistentCollection;
import org.hibernate.collection.PersistentList;
import org.hibernate.engine.SessionImplementor;

/**
 * The list used in instances mapped using the EAV schema. The persistentList is
 * the Hibernate list present as the referenceValues in the
 * EAVMulti*ContainmentEReferenceValueHolder.
 */
public class EAVDelegatingEcoreEList<E> extends DelegatingEcoreEList<E>
		implements EAVDelegatingList, PersistableDelegateList<E> {

	private static final long serialVersionUID = 1L;
	private EStructuralFeature eStructuralFeature;
	private List<E> delegate;
	private List<EAVValueHolder> persistentList;

	public EAVDelegatingEcoreEList(InternalEObject owner) {
		super(owner);
	}

	protected void initialize() {
		if (delegate != null) {
			return;
		}
		doInitialize();
	}

	public boolean isDelegateInitialized() {
		return delegate != null;
	}

	protected void doInitialize() {
		delegate = new ArrayList<E>();
		for (Object eavValueObj : persistentList) {
			delegate.add(getConvertedValue(eavValueObj));
		}
	}

	@SuppressWarnings("unchecked")
	protected E getConvertedValue(Object value) {
		return (E) ((EAVValueHolder) value).getValue();
	}

	@Override
	protected List<E> delegateList() {
		initialize();
		return delegate;
	}

	public List<?> getDelegate() {
		return persistentList;
	}

	public void setDelegate(List<E> delegate) {
		this.delegate = delegate;
	}

	public EStructuralFeature getEStructuralFeature() {
		return eStructuralFeature;
	}

	public void setEStructuralFeature(EStructuralFeature eStructuralFeature) {
		this.eStructuralFeature = eStructuralFeature;
	}

	public List<EAVValueHolder> getPersistentList() {
		return persistentList;
	}

	@SuppressWarnings("unchecked")
	public void setPersistentList(List<?> persistentList) {
		this.persistentList = (List<EAVValueHolder>) persistentList;
	}

	public boolean isInitialized() {
		return delegate != null;
	}

	public boolean isLoaded() {
		return delegate != null;
	}
	
	@Override
	/**
	 * Will always return false, means that the unique check is not performed
	 * for the eav list. This is a small price to pay for increased performance. 
	 */
	public boolean isUnique() {
		return false;
	}

	private boolean isHibernateListPresent() {
		return (persistentList instanceof AbstractPersistentCollection);
	}

	private EAVMultiValueHolder getValueHolderOwner() {
		if (!isHibernateListPresent()) {
			throw new IllegalStateException();
		}
		return (EAVMultiValueHolder) getHibernatePersistentList().getOwner();
	}

	private PersistentList getHibernatePersistentList() {
		return (PersistentList) persistentList;
	}

	protected final boolean isConnectedToSession() {
		if (!(getDelegate() instanceof AbstractPersistentCollection)) {
			return false;
		}
		final AbstractPersistentCollection persistentCollection = (AbstractPersistentCollection) getDelegate();
		final SessionImplementor session = ((AbstractPersistentCollection) persistentCollection)
				.getSession();
		return isConnectedToSession(session);
	}

	private final boolean isConnectedToSession(SessionImplementor session) {
		final PersistentCollection persistentCollection = (PersistentCollection) getDelegate();
		return session != null
				&& session.isOpen()
				&& session.getPersistenceContext().containsCollection(
						persistentCollection);
	}

	@Override
	protected void delegateAdd(E object) {
		final EAVValueHolder valueHolder = (EAVValueHolder) getValueHolderOwner()
				.getElement(object);
		valueHolder.setListIndex(getHibernatePersistentList().size());
		persistentList.add(valueHolder);

		if (delegate != null) {
			super.delegateAdd(object);
		}
	}

	@Override
	protected void delegateAdd(int index, E object) {
		if (index == size() && delegate == null) {
			delegateAdd(object);
			// stop here as the delegate is not yet set
			return;
		}

		// insert in the middle, load the whole list
		delegateList();

		final EAVValueHolder valueHolder = (EAVValueHolder) getValueHolderOwner()
				.getElement(object);

		persistentList.add(index, valueHolder);

		int newIndex = index;
		for (EAVValueHolder element : persistentList.subList(index, size())) {
			element.setListIndex(newIndex++);
		}

		super.delegateAdd(index, object);
	}

	@Override
	protected List<E> delegateBasicList() {
		return super.delegateBasicList();
	}

	@Override
	protected void delegateClear() {
		for (EAVValueHolder valueHolder : persistentList) {
			valueHolder.setOwner(null);
			valueHolder.setValueOwner(null);
		}

		super.delegateClear();
	}

	@Override
	protected boolean delegateContains(Object object) {
		// TODO: consider building a query to support lazy contains
		return super.delegateContains(object);
	}

	@Override
	protected boolean delegateContainsAll(Collection<?> collection) {
		// will read the persistent list anyway
		return super.delegateContainsAll(collection);
	}

	@Override
	protected boolean delegateEquals(Object object) {
		// will read the persistent list anyway
		return super.delegateEquals(object);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected E delegateGet(int index) {
		final EAVValueHolder valueHolder = persistentList.get(index);
		return (E) valueHolder.getValue();
	}

	@Override
	protected int delegateHashCode() {
		// hashcode will read the persistentlist always anyway
		return super.delegateHashCode();
	}

	@Override
	protected int delegateIndexOf(Object object) {
		// indexof will read the persistentlist always anyway
		return super.delegateIndexOf(object);
	}

	@Override
	protected boolean delegateIsEmpty() {
		return delegateSize() == 0;
	}

	@Override
	public Iterator<E> delegateIterator() {
		return iterator();
	}
	
	@Override
	public Iterator<E> iterator() {
		boolean extraLazyLoaded = getValueHolderOwner() instanceof EAVExtraMultiContainmentEReferenceValueHolder;
		extraLazyLoaded |=  getValueHolderOwner() instanceof EAVExtraMultiNonContainmentEReferenceValueHolder;
		extraLazyLoaded |=  getValueHolderOwner() instanceof EAVExtraMultiEAttributeValueHolder;
		if (extraLazyLoaded && delegate == null && isHibernateListPresent() && isConnectedToSession()) {
			// return a paging iterator
			return LazyCollectionUtils.getPagedLoadingIterator(this, 100);			
		}
		return super.iterator();
	}

	@Override
	protected int delegateLastIndexOf(Object object) {
		// will read the persistentlist always anyway
		return super.delegateLastIndexOf(object);
	}

	@Override
	protected ListIterator<E> delegateListIterator() {
		// will read the persistentlist always anyway
		return super.delegateListIterator();
	}

	@Override
	protected E delegateMove(int targetIndex, int sourceIndex) {
		final EAVValueHolder result = persistentList.remove(sourceIndex);

		int newIndex = sourceIndex;
		for (EAVValueHolder element : persistentList.subList(sourceIndex,
				size())) {
			element.setListIndex(newIndex++);
		}

		persistentList.add(targetIndex, result);

		newIndex = targetIndex;
		for (EAVValueHolder element : persistentList.subList(sourceIndex,
				size())) {
			element.setListIndex(newIndex++);
		}
		return super.delegateMove(targetIndex, sourceIndex);
	}

	@Override
	@SuppressWarnings("unchecked")
	protected E delegateRemove(int index) {
		final boolean reallyLazy = index == (size() - 1) && delegate == null;
		if (!reallyLazy) {
			// force a load before removing
			delegateList();
		}
		final EAVValueHolder result = persistentList.remove(index);
		result.setOwner(null);
		result.setValueOwner(null);

		if (reallyLazy) {
			// no need to update other things
			return (E) result.getValue();
		}

		int newIndex = index;
		for (EAVValueHolder element : persistentList.subList(index, size())) {
			element.setListIndex(newIndex++);
		}
		return super.delegateRemove(index);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected E delegateSet(int index, E object) {
		final EAVValueHolder newValueHolder = (EAVValueHolder) getValueHolderOwner()
				.getElement(object);
		newValueHolder.setListIndex(index);
		final EAVValueHolder oldValueHolder = persistentList.set(index,
				newValueHolder);

		// clear old object
		if (oldValueHolder != null) {
			oldValueHolder.setOwner(null);
			oldValueHolder.setValueOwner(null);
		}
		if (delegate != null) {
			return super.delegateSet(index, object);
		}
		if (oldValueHolder != null) {
			return (E) oldValueHolder.getValue();			
		}
		return null;
	}

	// override set to prevent indexOf call, note isUnique is now not
	// enforced for set, but this is a small price to pay for improved
	// performance.
	@Override
	public E set(int index, E object) {
		int size = size();
		if (index >= size) {
			throw new BasicIndexOutOfBoundsException(index, size);
		}

		return setUnique(index, object);
	}

	@Override
	protected int delegateSize() {
		return persistentList.size();
	}

	@Override
	protected Object[] delegateToArray() {
		// will load list anyway
		return super.delegateToArray();
	}

	@Override
	protected <T> T[] delegateToArray(T[] array) {
		// will load list anyway
		return super.delegateToArray(array);
	}

	@Override
	protected String delegateToString() {
		// will load list anyway
		return super.delegateToString();
	}

}
