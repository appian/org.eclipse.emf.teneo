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

import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.eclipselink.EmfHelper;
import org.eclipse.emf.teneo.eclipselink.IndirectEContainer;
import org.eclipse.emf.teneo.eclipselink.internal.messages.Messages;
import org.eclipse.persistence.indirection.ValueHolder;
import org.eclipse.persistence.indirection.ValueHolderInterface;
import org.eclipse.persistence.internal.helper.Helper;
import org.eclipse.persistence.internal.indirection.UnitOfWorkQueryValueHolder;

public class IndirectEList<E> extends ArrayList<E> implements IndirectEContainer<E>, InternalEList.Unsettable<E>,
		EStructuralFeature.Setting {

	private static final long serialVersionUID = 1L;

	/** Reduce type casting. */
	protected InternalEList<E> delegate;

	/** Delegate indirection behavior to a value holder. */
	protected ValueHolderInterface valueHolder;

	/** Change tracking listener. */
	private transient PropertyChangeListener changeListener;

	/** The mapping attribute name, used to raise change events. */
	private transient String attributeName;

	/** Store initial size for lazy init. */
	protected int initialCapacity = 10;

	/**
	 * PUBLIC: Construct an empty IndirectEList so that its internal data array has size <tt>10</tt> and its standard
	 * capacity increment is zero.
	 */
	public IndirectEList() {

		this(10);
	}

	/**
	 * PUBLIC: Construct an empty IndirectEList with the specified initial capacity and with its capacity increment
	 * equal to zero.
	 * 
	 * @param initialCapacity
	 *            the initial capacity of the vector
	 * @exception IllegalArgumentException
	 *                if the specified initial capacity is negative
	 */
	public IndirectEList(int initialCapacity) {

		this(initialCapacity, 0);
	}

	/**
	 * PUBLIC: Construct an empty IndirectEList with the specified initial capacity and capacity increment.
	 * 
	 * @param initialCapacity
	 *            the initial capacity of the vector
	 * @param capacityIncrement
	 *            the amount by which the capacity is increased when the vector overflows
	 * @exception IllegalArgumentException
	 *                if the specified initial capacity is negative
	 */
	public IndirectEList(int initialCapacity, int capacityIncrement) {

		super(0);
		this.initialize(initialCapacity, capacityIncrement);
	}

	/**
	 * PUBLIC: Construct an IndirectEList containing the elements of the specified collection, in the order they are
	 * returned by the collection's iterator.
	 * 
	 * @param collection
	 *            a collection containing the elements to construct this IndirectEList with.
	 */
	public IndirectEList(Collection<? extends E> collection) {

		super(0);
		this.initialize(collection);
	}

	/**
	 * @see java.util.Vector#add(int, E)
	 */
	@Override
	public void add(int index, E element) {

		this.getDelegate().add(index, element);
		raiseAddChangeEvent(element);
	}

	/**
	 * Raise the add change event and relationship maintainence.
	 */
	protected void raiseAddChangeEvent(E element) {
		if (hasBeenRegistered()) {
			((UnitOfWorkQueryValueHolder) getValueHolder()).updateForeignReferenceSet(element, null);
		}
	}

	/**
	 * Raise the remove change event.
	 */
	protected void raiseRemoveChangeEvent(Object object) {
		if (hasBeenRegistered()) {
			((UnitOfWorkQueryValueHolder) getValueHolder()).updateForeignReferenceRemove(object);
		}
	}

	/**
	 * @see java.util.Vector#add(E)
	 */
	@Override
	public synchronized boolean add(E element) {

		this.getDelegate().add(element);
		raiseAddChangeEvent(element);
		return true;
	}

	/**
	 * @see java.util.Vector#addAll(int, java.util.Collection)
	 */
	@Override
	public synchronized boolean addAll(int index, Collection<? extends E> collection) {

		Iterator<? extends E> elements = collection.iterator();
		// Must trigger add events if tracked or uow.
		if (hasBeenRegistered() || hasEclipseLinkPropertyChangeListener()) {
			while (elements.hasNext()) {
				this.add(index, elements.next());
				index++;
			}
			return true;
		}

		return this.getDelegate().addAll(index, collection);

	}

	/**
	 * @see java.util.Vector#addAll(java.util.Collection)
	 */
	@Override
	public synchronized boolean addAll(Collection<? extends E> collection) {

		// Must trigger add events if tracked or uow.
		if (hasBeenRegistered() || hasEclipseLinkPropertyChangeListener()) {
			Iterator<? extends E> elements = collection.iterator();
			while (elements.hasNext()) {
				this.add(elements.next());
			}
			return true;
		}

		return getDelegate().addAll(collection);
	}

	/**
	 * @see java.util.Vector#addElement(E)
	 */
	public synchronized void addElement(E element) {

		this.add(element);
	}

	/**
	 * PUBLIC: Return the freshly-built delegate.
	 */
	@SuppressWarnings("unchecked")
	protected InternalEList<E> buildDelegate() {

		return (InternalEList<E>) getValueHolder().getValue();
	}

	/**
	 * @see java.util.Vector#clear()
	 */
	@Override
	public void clear() {

		if (hasBeenRegistered() || hasEclipseLinkPropertyChangeListener()) {
			Iterator<E> elements = this.iterator();
			while (elements.hasNext()) {
				E element = elements.next();
				elements.remove();
				this.raiseRemoveChangeEvent(element);
			}
		} else {
			this.getDelegate().clear();
		}
	}

	/**
	 * PUBLIC:
	 * 
	 * @see java.util.Vector#clone() This will result in a database query if necessary.
	 */

	@Override
	@SuppressWarnings("unchecked")
	public synchronized Object clone() {

		IndirectEList<E> result = (IndirectEList<E>) super.clone();
		try {
			Method cloneMethod = this.getDelegate().getClass().getMethod("clone", new Class[] {}); //$NON-NLS-1$
			result.delegate = (InternalEList<E>) cloneMethod.invoke(this.getDelegate(), new Object[] {});
		} catch (Exception e) {
			throw new RuntimeException(Messages.exception_errorInvokingCloneOnDelegate, e);
		}
		result.attributeName = null;
		result.changeListener = null;
		return result;
	}

	/**
	 * PUBLIC:
	 * 
	 * @see java.util.List#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(Object object) {

		return this.getDelegate().contains(object);
	}

	/**
	 * @see java.util.List#containsAll(java.util.Collection)
	 */
	@Override
	public synchronized boolean containsAll(Collection<?> c) {

		return this.getDelegate().containsAll(c);
	}

	/**
	 * @see java.util.List#equals(E)
	 */
	@Override
	public synchronized boolean equals(Object object) {

		return this.getDelegate().equals(object);
	}

	/**
	 * @see java.util.List#get(int)
	 */
	@Override
	public synchronized E get(int index) {

		return this.getDelegate().get(index);
	}

	/**
	 * PUBLIC: Check whether the contents have been read from the database. If they have not, read them and set the
	 * delegate.
	 */
	protected synchronized InternalEList<E> getDelegate() {

		if (delegate == null) {
			delegate = this.buildDelegate();
		}
		return delegate;
	}

	/**
	 * PUBLIC: Return the valueHolder.
	 */
	public synchronized ValueHolderInterface getValueHolder() {

		if (valueHolder == null) {
			valueHolder = new ValueHolder(new EclipseLinkEList<E>(this.initialCapacity));
		}
		return valueHolder;
	}

	/**
	 * INTERNAL: return whether this IndirectEList has been registered with the UnitOfWork
	 */
	public boolean hasBeenRegistered() {

		return getValueHolder() instanceof UnitOfWorkQueryValueHolder;
	}

	/**
	 * INTERNAL:
	 * 
	 * @see java.util.Vector#hashCode()
	 */
	@Override
	public synchronized int hashCode() {

		return this.getDelegate().hashCode();
	}

	/**
	 * @see java.util.Vector#indexOf(java.lang.Object)
	 */
	@Override
	public int indexOf(Object object) {

		return this.getDelegate().indexOf(object);
	}

	/**
	 * Initialize the instance.
	 */
	protected void initialize(int initialCapacity, int capacityIncrement) {

		this.initialCapacity = initialCapacity;
		this.delegate = null;
		this.valueHolder = null;
	}

	/**
	 * Initialize the instance.
	 */
	protected void initialize(Collection<? extends E> collection) {

		this.delegate = null;
		EclipseLinkEList<E> temp = new EclipseLinkEList<E>(collection);
		this.valueHolder = new ValueHolder(temp);
	}

	/**
	 * @see java.util.Vector#isEmpty()
	 */
	@Override
	public boolean isEmpty() {

		return this.getDelegate().isEmpty();
	}

	/**
	 * PUBLIC: Return whether the contents have been read from the database.
	 */
	public boolean isInstantiated() {

		return this.getValueHolder().isInstantiated();
	}

	/**
	 * @see java.util.AbstractList#iterator()
	 */
	@Override
	public Iterator<E> iterator() {

		// Must wrap the interator to raise the remove event.
		return new Iterator<E>() {

			Iterator<E> delegateIterator = IndirectEList.this.getDelegate().iterator();
			E currentElement;

			public boolean hasNext() {

				return this.delegateIterator.hasNext();
			}

			public E next() {

				this.currentElement = this.delegateIterator.next();
				return this.currentElement;
			}

			public void remove() {

				this.delegateIterator.remove();
				IndirectEList.this.raiseRemoveChangeEvent(this.currentElement);
			}
		};
	}

	/**
	 * @see java.util.Vector#lastIndexOf(java.lang.Object)
	 */
	@Override
	public int lastIndexOf(Object object) {

		return this.getDelegate().lastIndexOf(object);
	}

	/**
	 * @see java.util.AbstractList#listIterator()
	 */
	@Override
	public ListIterator<E> listIterator() {

		return this.listIterator(0);
	}

	/**
	 * @see java.util.AbstractList#listIterator(int)
	 */
	@Override
	public ListIterator<E> listIterator(final int index) {

		// Must wrap the interator to raise the remove event.
		return new ListIterator<E>() {

			ListIterator<E> delegateIterator = IndirectEList.this.getDelegate().listIterator(index);
			E currentElement;

			public boolean hasNext() {

				return this.delegateIterator.hasNext();
			}

			public boolean hasPrevious() {

				return this.delegateIterator.hasPrevious();
			}

			public int previousIndex() {

				return this.delegateIterator.previousIndex();
			}

			public int nextIndex() {

				return this.delegateIterator.nextIndex();
			}

			public E next() {

				this.currentElement = this.delegateIterator.next();
				return this.currentElement;
			}

			public E previous() {

				this.currentElement = this.delegateIterator.previous();
				return this.currentElement;
			}

			public void remove() {

				this.delegateIterator.remove();
				IndirectEList.this.raiseRemoveChangeEvent(this.currentElement);
			}

			public void set(E element) {

				this.delegateIterator.set(element);
				IndirectEList.this.raiseRemoveChangeEvent(this.currentElement);
				IndirectEList.this.raiseAddChangeEvent(element);
			}

			public void add(E element) {

				this.delegateIterator.add(element);
				IndirectEList.this.raiseAddChangeEvent(element);
			}
		};
	}

	/**
	 * @see java.util.Vector#remove(int)
	 */
	@Override
	public synchronized E remove(int index) {

		E value = this.getDelegate().remove(index);
		this.raiseRemoveChangeEvent(value);
		return value;
	}

	/**
	 * @see java.util.Vector#remove(java.lang.Object)
	 */
	@Override
	public boolean remove(Object object) {

		if (this.getDelegate().remove(object)) {
			this.raiseRemoveChangeEvent(object);
			return true;
		}
		return false;
	}

	/**
	 * @see java.util.Vector#removeAll(java.util.Collection)
	 */
	@Override
	public synchronized boolean removeAll(Collection<?> collection) {

		// Must trigger remove events if tracked or uow.
		if (hasBeenRegistered() || hasEclipseLinkPropertyChangeListener()) {
			Iterator<?> objects = collection.iterator();
			while (objects.hasNext()) {
				this.remove(objects.next());
			}
			return true;
		}
		return this.getDelegate().removeAll(collection);
	}

	/**
	 * @see java.util.Vector#removeElement(E)
	 */
	public synchronized boolean removeElement(E obj) {

		return this.remove(obj);
	}

	/**
	 * @see java.util.Vector#removeElementAt(int)
	 */
	public synchronized void removeElementAt(int index) {

		this.remove(index);
	}

	/**
	 * @see java.util.Vector#retainAll(java.util.Collection)
	 */
	@Override
	public synchronized boolean retainAll(Collection<?> collection) {

		// Must trigger remove events if tracked or uow.
		if (hasBeenRegistered() || hasEclipseLinkPropertyChangeListener()) {
			Iterator<E> elements = getDelegate().iterator();
			while (elements.hasNext()) {
				E element = elements.next();
				if (!collection.contains(element)) {
					elements.remove();
					this.raiseRemoveChangeEvent(element);
				}
			}
			return true;
		}
		return this.getDelegate().retainAll(collection);
	}

	/**
	 * @see java.util.Vector#set(int, E)
	 */
	@Override
	public synchronized E set(int index, E element) {

		E oldValue = this.getDelegate().set(index, element);
		this.raiseRemoveChangeEvent(oldValue);
		this.raiseAddChangeEvent(element);
		return oldValue;
	}

	/**
	 * @see java.util.Vector#setElementAt(E, int)
	 */
	public synchronized void setElementAt(E obj, int index) {

		this.set(index, obj);
	}

	// /**
	// * Since the value holder may be instantiated by the mapping and not the
	// policy
	// * @see ForeignReferenceMapping#createUnitOfWorkValueHolder
	// * @see TransparentIndirectionPolicy#cloneAttribute
	// * we may receive a UnitOfWorkQueryValueHolder which we have to
	// * switch with an EmfQueryBasedValueHolder
	// */
	// public void setValueHolder(ValueHolderInterface valueHolder) {
	// if (valueHolder instanceof UnitOfWorkQueryValueHolder) {
	// UnitOfWorkQueryValueHolder uowValueHolder =
	// (UnitOfWorkQueryValueHolder)valueHolder;
	// this.valueHolder = new EmfQueryBasedValueHolder(uowValueHolder);
	// } else {
	// this.valueHolder = valueHolder;
	// }
	// this.delegate = null;
	// }
	//

	public void setValueHolder(ValueHolderInterface valueHolder) {

		this.valueHolder = valueHolder;
		this.delegate = null;
	}

	/**
	 * @see java.util.Vector#size()
	 */
	@Override
	public int size() {

		return this.getDelegate().size();
	}

	/**
	 * @see java.util.Vector#subList(int, int)
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex) {

		return this.getDelegate().subList(fromIndex, toIndex);
	}

	/**
	 * @see java.util.Vector#toArray()
	 */
	@Override
	public synchronized Object[] toArray() {

		return this.getDelegate().toArray();
	}

	/**
	 * @see java.util.Vector#toArray(java.lang.Object[])
	 */
	@Override
	public synchronized <T> T[] toArray(T[] a) {

		return this.getDelegate().toArray(a);
	}

	/**
	 * PUBLIC: Use the java.util.Vector#toString(); but wrap it with braces to indicate there is a bit of indirection.
	 * Don't allow this method to trigger a database read.
	 * 
	 * @see java.util.Vector#toString()
	 */
	@Override
	public String toString() {

		if (ValueHolderInterface.shouldToStringInstantiate) {
			return this.getDelegate().toString();
		}
		if (this.isInstantiated()) {
			return "{" + this.getDelegate().toString() + "}"; //$NON-NLS-1$ //$NON-NLS-2$
		} else {
			return "{" + Helper.getShortClassName(this.getClass()) + ": not instantiated}"; //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * Return the property change listener for change tracking.
	 */
	public PropertyChangeListener getEclipseLinkPropertyChangeListener() {

		return changeListener;
	}

	/**
	 * Return if the collection has a property change listener for change tracking.
	 */
	public boolean hasEclipseLinkPropertyChangeListener() {

		return this.changeListener != null;
	}

	/**
	 * Set the property change listener for change tracking.
	 */
	public void setEclipseLinkPropertyChangeListener(PropertyChangeListener changeListener) {

		this.changeListener = changeListener;
	}

	/**
	 * Return the mapping attribute name, used to raise change events.
	 */
	public String getEclipseLinkAttributeName() {

		return attributeName;
	}

	/**
	 * Set the mapping attribute name, used to raise change events. This is required if the change listener is set.
	 */
	public void setEclipseLinkAttributeName(String attributeName) {

		this.attributeName = attributeName;
	}

	public void move(int newPosition, E element) {

		this.getDelegate().move(newPosition, element);
		this.raiseRemoveChangeEvent(element);
		this.raiseAddChangeEvent(element);
	}

	public E move(int newPosition, int oldPosition) {

		E element = this.getDelegate().move(newPosition, oldPosition);
		this.raiseRemoveChangeEvent(element);
		this.raiseAddChangeEvent(element);
		return element;
	}

	public NotificationChain basicAdd(E element, NotificationChain notifications) {

		this.getDelegate().basicAdd(element, notifications);
		raiseAddChangeEvent(element);
		return notifications;
	}

	public NotificationChain basicRemove(Object object, NotificationChain notifications) {

		this.getDelegate().basicRemove(object, notifications);
		raiseRemoveChangeEvent(object);
		return notifications;
	}

	public Iterator<E> basicIterator() {

		// Must wrap the interator to raise the remove event.
		return new Iterator<E>() {

			Iterator<E> delegateIterator = IndirectEList.this.getDelegate().basicIterator();
			E currentElement;

			public boolean hasNext() {

				return this.delegateIterator.hasNext();
			}

			public E next() {

				this.currentElement = this.delegateIterator.next();
				return this.currentElement;
			}

			public void remove() {

				this.delegateIterator.remove();
				IndirectEList.this.raiseRemoveChangeEvent(this.currentElement);
			}
		};
	}

	public List<E> basicList() {

		return this.getDelegate().basicList();
	}

	public ListIterator<E> basicListIterator() {

		return this.getDelegate().basicListIterator();
	}

	public ListIterator<E> basicListIterator(int index) {

		return this.getDelegate().basicListIterator(index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.BasicEList#addUnique(int, E)
	 */
	public void addUnique(int index, E element) {

		this.getDelegate().addUnique(index, element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.BasicEList#addUnique(E)
	 */
	public void addUnique(E element) {

		this.getDelegate().addUnique(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.BasicEList#basicGet(int)
	 */
	public E basicGet(int index) {

		return this.getDelegate().basicGet(index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.BasicEList#setUnique(int, E)
	 */
	public E setUnique(int index, E element) {

		return this.getDelegate().setUnique(index, element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.ArrayList#ensureCapacity(int)
	 */
	@Override
	public void ensureCapacity(int minCapacity) {

		// InternalELists don't support ensureCapacity so no-op
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.ArrayList#trimToSize()
	 */
	@Override
	public void trimToSize() {

		// InternalELists don't support trimToSize so no-op
	}

	public boolean eAdd(E element) {

		InternalEList<E> delegate = this.getDelegate();
		return EmfHelper.getInstance().addToEList(delegate, element);
	}

	public boolean isSet() {

		return ((InternalEList.Unsettable<E>) this.getDelegate()).isSet();
	}

	public void unset() {

		((InternalEList.Unsettable<E>) this.getDelegate()).unset();
	}

	public EObject getEObject() {

		return ((EStructuralFeature.Setting) this.getDelegate()).getEObject();
	}

	public EStructuralFeature getEStructuralFeature() {

		return ((EStructuralFeature.Setting) this.getDelegate()).getEStructuralFeature();
	}

	public Object get(boolean resolve) {

		return ((EStructuralFeature.Setting) this.getDelegate()).get(resolve);
	}

	public void set(Object newValue) {

		((EStructuralFeature.Setting) this.getDelegate()).set(newValue);
	}

	public boolean addAllUnique(Collection<? extends E> arg0) {
		return this.getDelegate().addAllUnique(arg0);
	}

	public boolean addAllUnique(int arg0, Collection<? extends E> arg1) {
		return this.getDelegate().addAllUnique(arg0, arg1);
	}

	public boolean basicContains(Object arg0) {
		return this.getDelegate().basicContains(arg0);
	}

	public boolean basicContainsAll(Collection<?> arg0) {
		return this.getDelegate().basicContainsAll(arg0);
	}

	public int basicIndexOf(Object arg0) {
		return this.getDelegate().basicIndexOf(arg0);
	}

	public int basicLastIndexOf(Object arg0) {
		return this.getDelegate().basicIndexOf(arg0);
	}

	public Object[] basicToArray() {
		return this.getDelegate().basicToArray();
	}

	public <T> T[] basicToArray(T[] arg0) {
		return this.getDelegate().basicToArray(arg0);
	}
}
