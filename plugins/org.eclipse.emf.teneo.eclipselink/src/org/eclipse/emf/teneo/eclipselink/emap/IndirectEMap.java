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

import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.eclipselink.EmfHelper;
import org.eclipse.emf.teneo.eclipselink.IndirectEContainer;
import org.eclipse.persistence.indirection.ValueHolder;
import org.eclipse.persistence.indirection.ValueHolderInterface;
import org.eclipse.persistence.internal.helper.Helper;

public class IndirectEMap<K, V> extends BasicEMap<K, V> implements IndirectEContainer<Map.Entry<K, V>>,
		InternalEList.Unsettable<Map.Entry<K, V>>, EStructuralFeature.Setting {

	private static final long serialVersionUID = 1L;

	/** Reduce type casting */
	protected EMap<K, V> delegate;

	/** Delegate indirection behavior to a value holder */
	protected ValueHolderInterface valueHolder;

	/** Change tracking listener. */
	private transient PropertyChangeListener changeListener;

	/** The mapping attribute name, used to raise change events. */
	private transient String attributeName;

	/** Store initial size for lazy init. */
	protected int initialCapacity = 11;

	/** Store load factor for lazy init. */
	protected float loadFactor = 0.75f;

	/**
	 * PUBLIC: Construct a new, empty EmfIndirectEMap with a default capacity and load factor.
	 */
	public IndirectEMap() {

		this(11);
	}

	/**
	 * PUBLIC: Construct a new, empty EmfIndirectEMap with the specified initial capacity and default load factor.
	 * 
	 * @param initialCapacity
	 *            the initial capacity of the hashtable
	 */
	public IndirectEMap(int initialCapacity) {

		this(initialCapacity, 0.75f);
	}

	/**
	 * PUBLIC: Construct a new, empty EmfIndirectEMap with the specified initial capacity and load factor.
	 * 
	 * @param initialCapacity
	 *            the initial capacity of the hashtable
	 * @param loadFactor
	 *            a number between 0.0 and 1.0
	 * @exception IllegalArgumentException
	 *                if the initial capacity is less than or equal to zero, or if the load factor is less than or equal
	 *                to zero
	 */
	public IndirectEMap(int initialCapacity, float loadFactor) {

		super(0);
		this.initialize(initialCapacity, loadFactor);
	}

	/**
	 * PUBLIC: Construct a new EmfIndirectEMap with the same mappings as the given Map. The EmfIndirectEMap is created
	 * with a capacity of twice the number of entries in the given Map or 11 (whichever is greater), and a default load
	 * factor, which is 0.75.
	 * 
	 * @param map
	 *            a map containing the mappings to use
	 */
	public IndirectEMap(Map<K, V> map) {

		super(0);
		this.initialize(map);
	}

	/**
	 * Used during postBuild/Merge/Clone to replace generic EclipseLinkEMap with the correct EMF collection class
	 * 
	 * @param eMap
	 */
	public void setDelegate(EMap<K, V> eMap) {
		getValueHolder().setValue(eMap);
		delegate = eMap;
	}

	/**
	 * Return the freshly-built delegate.
	 */
	@SuppressWarnings("unchecked")
	protected EMap<K, V> buildDelegate() {

		return (EMap<K, V>) getValueHolder().getValue();
	}

	/**
	 * @see java.util.Hashtable#clear()
	 */
	@Override
	public synchronized void clear() {

		if (hasEclipseLinkPropertyChangeListener()) {
			Iterator<K> objects = this.keySet().iterator();
			while (objects.hasNext()) {
				Object object = objects.next();
				objects.remove();
				this.raiseRemoveChangeEvent(object, this.get(object));
			}
		} else {
			this.getDelegate().clear();
		}
	}

	/**
	 * @see java.util.Hashtable#clone() This will result in a database query if necessary.
	 */

	/*
	 * There are 3 situations when clone() is called: 1. The developer actually wants to clone the collection (typically
	 * to modify one of the 2 resulting collections). In which case the contents must be read from the database. 2. A
	 * UnitOfWork needs a clone (or backup clone) of the collection. But the UnitOfWork checks "instantiation" before
	 * cloning collections ("un-instantiated" collections are not cloned). 3. A MergeManager needs an extra copy of the
	 * collection (because the "backup" and "target" are the same object?). But the MergeManager checks "instantiation"
	 * before merging collections (again, "un-instantiated" collections are not merged).
	 */
	@SuppressWarnings("unchecked")
	@Override
	public synchronized Object clone() {

		IndirectEMap<K, V> result = (IndirectEMap<K, V>) super.clone();
		try {
			Method cloneMethod = this.getDelegate().getClass().getMethod("clone", new Class[] {});
			result.delegate = (EMap<K, V>) cloneMethod.invoke(this.getDelegate(), new Object[] {});
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception invoking clone method on delegate", e);
		}
		return result;
	}

	/**
	 * @see java.util.Hashtable#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(Object value) {

		return this.getDelegate().contains(value);
	}

	/**
	 * @see java.util.Hashtable#containsKey(java.lang.Object)
	 */
	@Override
	public boolean containsKey(Object key) {

		return this.getDelegate().containsKey(key);
	}

	/**
	 * @see java.util.Hashtable#containsValue(java.lang.Object)
	 */
	@Override
	public boolean containsValue(Object value) {

		return this.getDelegate().containsValue(value);
	}

	/**
	 * @see java.util.Hashtable#entrySet()
	 */
	@Override
	public Set<Map.Entry<K, V>> entrySet() {

		return new Set<Map.Entry<K, V>>() {

			Set<Map.Entry<K, V>> delegateSet = IndirectEMap.this.getDelegate().entrySet();

			public int size() {

				return this.delegateSet.size();
			}

			public boolean isEmpty() {

				return this.delegateSet.isEmpty();
			}

			public boolean contains(Object o) {

				return this.delegateSet.contains(o);
			}

			public Iterator<Map.Entry<K, V>> iterator() {

				return new Iterator<Map.Entry<K, V>>() {

					Iterator<Map.Entry<K, V>> delegateIterator = delegateSet.iterator();
					Map.Entry<K, V> currentEntry;

					public boolean hasNext() {

						return this.delegateIterator.hasNext();
					}

					public Map.Entry<K, V> next() {

						this.currentEntry = this.delegateIterator.next();
						return this.currentEntry;
					}

					public void remove() {

						raiseRemoveChangeEvent(currentEntry.getKey(), currentEntry.getValue());
						this.delegateIterator.remove();
					}
				};
			}

			public Object[] toArray() {

				return this.delegateSet.toArray();
			}

			public <T> T[] toArray(T a[]) {

				return this.delegateSet.toArray(a);
			}

			public boolean add(Map.Entry<K, V> entry) {

				return this.delegateSet.add(entry);
			}

			@SuppressWarnings("unchecked")
			public boolean remove(Object object) {

				if (!(object instanceof Map.Entry)) {
					return false;
				}
				return IndirectEMap.this.remove(((Map.Entry<K, V>) object).getKey());
			}

			public boolean containsAll(Collection<?> collection) {

				return this.delegateSet.containsAll(collection);
			}

			public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {

				return this.delegateSet.addAll(collection);
			}

			public boolean retainAll(Collection<?> collection) {

				boolean result = false;
				Iterator<Map.Entry<K, V>> entries = delegateSet.iterator();
				while (entries.hasNext()) {
					Map.Entry<K, V> entry = entries.next();
					if (!collection.contains(entry)) {
						entries.remove();
						raiseRemoveChangeEvent(entry.getKey(), entry.getValue());
						result = true;
					}
				}
				return result;
			}

			@SuppressWarnings("unchecked")
			public boolean removeAll(Collection<?> collection) {

				boolean result = false;
				for (Object object : collection) {
					if (!(object instanceof Map.Entry)) {
						continue;
					}
					Object removed = IndirectEMap.this.remove(((Map.Entry<K, V>) object).getKey());
					if (removed != null) {
						result = true;
					}
				}
				return result;
			}

			public void clear() {

				IndirectEMap.this.clear();
			}

			@Override
			public boolean equals(Object o) {

				return this.delegateSet.equals(o);
			}

			@Override
			public int hashCode() {

				return this.delegateSet.hashCode();
			}
		};
	}

	/**
	 * @see java.util.Hashtable#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {

		return this.getDelegate().equals(o);
	}

	/**
	 * @see java.util.Hashtable#get(java.lang.Object)
	 */
	@Override
	public V get(Object key) {

		return this.getDelegate().get(key);
	}

	/**
	 * Check whether the contents have been read from the database. If they have not, read them and set the delegate.
	 */
	protected synchronized EMap<K, V> getDelegate() {

		if (delegate == null) {
			delegate = this.buildDelegate();
		}
		return delegate;
	}

	/**
	 * Return the mapping attribute name, used to raise change events.
	 */
	public String getEclipseLinkAttributeName() {

		return attributeName;
	}

	/**
	 * Return the property change listener for change tracking.
	 */
	public PropertyChangeListener getEclipseLinkPropertyChangeListener() {

		return changeListener;
	}

	/**
	 * PUBLIC: Return the valueHolder.
	 */
	public synchronized ValueHolderInterface getValueHolder() {

		// PERF: lazy initialize value holder and vector as are normally set after
		// creation.
		if (valueHolder == null) {
			valueHolder = new ValueHolder(new EclipseLinkEMap<K, V>(initialCapacity));
		}
		return valueHolder;
	}

	/**
	 * @see java.util.Hashtable#hashCode()
	 */
	@Override
	public int hashCode() {

		return this.getDelegate().hashCode();
	}

	/**
	 * Return if the collection has a property change listener for change tracking.
	 */
	public boolean hasEclipseLinkPropertyChangeListener() {

		return this.changeListener != null;
	}

	/**
	 * Initialize the instance.
	 */
	protected void initialize(int initialCapacity, float loadFactor) {

		this.delegate = null;
		this.loadFactor = loadFactor;
		this.initialCapacity = initialCapacity;
		this.valueHolder = null;
	}

	/**
	 * Initialize the instance.
	 */
	protected void initialize(Map<K, V> map) {

		this.delegate = null;
		BasicEMap<K, V> temp = new BasicEMap<K, V>(map);

		this.valueHolder = new ValueHolder(temp);
	}

	/**
	 * @see java.util.Hashtable#isEmpty()
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
	 * @see java.util.Hashtable#keySet()
	 */
	@Override
	public Set<K> keySet() {

		return new Set<K>() {

			Set<K> delegateSet = IndirectEMap.this.getDelegate().keySet();

			public int size() {

				return this.delegateSet.size();
			}

			public boolean isEmpty() {

				return this.delegateSet.isEmpty();
			}

			public boolean contains(Object o) {

				return this.delegateSet.contains(o);
			}

			public Iterator<K> iterator() {

				return new Iterator<K>() {

					Iterator<K> delegateIterator = delegateSet.iterator();
					K currentKey;

					public boolean hasNext() {

						return this.delegateIterator.hasNext();
					}

					public K next() {

						this.currentKey = this.delegateIterator.next();
						return this.currentKey;
					}

					public void remove() {

						IndirectEMap.this.raiseRemoveChangeEvent(currentKey, IndirectEMap.this.getDelegate().get(
								currentKey));
						this.delegateIterator.remove();
					}
				};
			}

			public Object[] toArray() {

				return this.delegateSet.toArray();
			}

			public <T> T[] toArray(T a[]) {

				return this.delegateSet.toArray(a);
			}

			public boolean add(K key) {

				return this.delegateSet.add(key);
			}

			public boolean remove(Object object) {

				return IndirectEMap.this.remove(object);
			}

			public boolean containsAll(Collection<?> collection) {

				return this.delegateSet.containsAll(collection);
			}

			public boolean addAll(Collection<? extends K> collection) {

				return this.delegateSet.addAll(collection);
			}

			public boolean retainAll(Collection<?> collection) {

				boolean result = false;
				Iterator<K> keys = delegateSet.iterator();
				while (keys.hasNext()) {
					K key = keys.next();
					if (!collection.contains(key)) {
						keys.remove();
						IndirectEMap.this.raiseRemoveChangeEvent(key, IndirectEMap.this.getDelegate().get(key));
						result = true;
					}
				}
				return result;
			}

			public boolean removeAll(Collection<?> collection) {

				boolean result = false;
				for (Object object : collection) {
					if (IndirectEMap.this.remove(object)) {
						result = true;
					}
				}
				return result;
			}

			public void clear() {

				IndirectEMap.this.clear();
			}

			@Override
			public boolean equals(Object o) {

				return this.delegateSet.equals(o);
			}

			@Override
			public int hashCode() {

				return this.delegateSet.hashCode();
			}
		};

	}

	/**
	 * @see java.util.Hashtable#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public synchronized V put(K key, V value) {

		V oldValue = this.getDelegate().put(key, value);
		if (oldValue != null) {
			raiseRemoveChangeEvent(key, oldValue);
		}
		raiseAddChangeEvent(key, value);
		return oldValue;
	}

	@Override
	public synchronized void putAll(Map<? extends K, ? extends V> map) {

		// Must trigger add events if tracked or uow.
		if (hasEclipseLinkPropertyChangeListener()) {
			Iterator<? extends K> objects = map.keySet().iterator();
			while (objects.hasNext()) {
				K key = objects.next();
				this.put(key, map.get(key));
			}
		} else {
			this.getDelegate().putAll(map);
		}
	}

	/**
	 * @see java.util.Hashtable#rehash()
	 */
	protected void rehash() {

		throw new InternalError("unsupported");
	}

	/**
	 * Raise the add change event and relationship maintainence.
	 */
	protected void raiseAddChangeEvent(Object key, Object value) {
		// this is where relationship maintenance would go
	}

	/**
	 * Raise the remove change event.
	 */
	protected void raiseRemoveChangeEvent(Object key, Object value) {
		// this is where relationship maintenance would go
	}

	@Override
	public Map.Entry<K, V> remove(int index) {

		Map.Entry<K, V> removed = this.getDelegate().remove(index);
		if (removed != null) {
			raiseRemoveChangeEvent(null, removed);
		}
		return removed;
	}

	@Override
	public boolean remove(Object object) {

		boolean removed = this.getDelegate().remove(object);
		if (removed) {
			raiseRemoveChangeEvent(null, object);
		}
		return removed;
	}

	@Override
	public boolean removeAll(Collection<?> collection) {

		boolean removed = this.getDelegate().removeAll(collection);
		if (removed) {
			// TODO raise correct events
			raiseRemoveChangeEvent(null, null);
		}
		return removed;
	}

	@Override
	public V removeKey(Object key) {

		V removed = this.getDelegate().removeKey(key);
		if (removed != null) {
			raiseRemoveChangeEvent(key, removed);
		}
		return removed;
	}

	/**
	 * Set the mapping attribute name, used to raise change events. This is required if the change listener is set.
	 */
	public void setEclipseLinkAttributeName(String attributeName) {

		this.attributeName = attributeName;
	}

	/**
	 * Set the property change listener for change tracking.
	 */
	public void setEclipseLinkPropertyChangeListener(PropertyChangeListener changeListener) {

		this.changeListener = changeListener;
	}

	/**
	 * PUBLIC: Set the value holder.
	 */
	public void setValueHolder(ValueHolderInterface valueHolder) {

		this.delegate = null;
		this.valueHolder = valueHolder;
	}

	/**
	 * @see java.util.Hashtable#size()
	 */
	@Override
	public int size() {

		return this.getDelegate().size();
	}

	/**
	 * PUBLIC: Use the Hashtable.toString(); but wrap it with braces to indicate there is a bit of indirection. Don't
	 * allow this method to trigger a database read.
	 * 
	 * @see java.util.Hashtable#toString()
	 */
	@Override
	public String toString() {

		if (ValueHolderInterface.shouldToStringInstantiate) {
			return this.getDelegate().toString();
		}
		if (this.isInstantiated()) {
			return "{" + this.getDelegate().toString() + "}";
		} else {
			return "{" + Helper.getShortClassName(this.getClass()) + ": not instantiated}";
		}
	}

	@Override
	public Iterator<Map.Entry<K, V>> iterator() {

		// Must wrap the interator to raise the remove event.
		return new Iterator<Map.Entry<K, V>>() {

			Iterator<Map.Entry<K, V>> delegateIterator = IndirectEMap.this.getDelegate().iterator();
			Map.Entry<K, V> currentObject;

			public boolean hasNext() {

				return this.delegateIterator.hasNext();
			}

			public Map.Entry<K, V> next() {

				this.currentObject = this.delegateIterator.next();
				return this.currentObject;
			}

			public void remove() {

				this.delegateIterator.remove();
				Map.Entry<K, V> currentEntry = this.currentObject;
				IndirectEMap.this.raiseRemoveChangeEvent(currentEntry.getKey(), currentEntry.getValue());
			}
		};
	}

	/**
	 * @see java.util.Hashtable#values()
	 */
	@Override
	public Collection<V> values() {

		return new Collection<V>() {

			protected Collection<V> delegateCollection = IndirectEMap.this.getDelegate().values();

			public int size() {

				return delegateCollection.size();
			}

			public boolean isEmpty() {

				return delegateCollection.isEmpty();
			}

			public boolean contains(Object o) {

				return delegateCollection.contains(o);
			}

			public Iterator<V> iterator() {

				return new Iterator<V>() {

					Iterator<V> delegateIterator = delegateCollection.iterator();
					V currentValue;

					public boolean hasNext() {

						return this.delegateIterator.hasNext();
					}

					public V next() {

						this.currentValue = this.delegateIterator.next();
						return this.currentValue;
					}

					public void remove() {

						Iterator<Map.Entry<K, V>> iterator = IndirectEMap.this.getDelegate().entrySet().iterator();
						while (iterator.hasNext()) {
							Map.Entry<K, V> entry = iterator.next();
							if (entry.getValue().equals(currentValue)) {
								IndirectEMap.this.raiseRemoveChangeEvent(entry.getKey(), entry.getValue());
							}

						}
						this.delegateIterator.remove();
					}
				};
			}

			public Object[] toArray() {

				return this.delegateCollection.toArray();
			}

			public <T> T[] toArray(T a[]) {

				return this.delegateCollection.toArray(a);
			}

			public boolean add(V value) {

				return this.delegateCollection.add(value);
			}

			public boolean remove(Object object) {

				Iterator<Map.Entry<K, V>> iterator = IndirectEMap.this.getDelegate().entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry<K, V> entry = iterator.next();
					if (entry.getValue().equals(object)) {
						IndirectEMap.this.raiseRemoveChangeEvent(entry.getKey(), entry.getValue());
					}
					return true;
				}
				return false;
			}

			public boolean containsAll(Collection<?> collection) {

				return this.delegateCollection.containsAll(collection);
			}

			public boolean addAll(Collection<? extends V> collection) {

				return this.delegateCollection.addAll(collection);
			}

			public boolean removeAll(Collection<?> collection) {

				boolean result = false;
				for (Object name : collection) {
					if (remove(name)) {
						result = true;
					}
				}
				return result;
			}

			public boolean retainAll(Collection<?> collection) {

				boolean result = false;
				for (Iterator<Map.Entry<K, V>> iterator = IndirectEMap.this.entrySet().iterator(); iterator.hasNext();) {
					Map.Entry<K, V> entry = iterator.next();
					if (!collection.contains(entry.getValue())) {
						iterator.remove();
						result = true;
					}
				}
				return result;
			}

			public void clear() {

				IndirectEMap.this.clear();
			}

			@Override
			public boolean equals(Object o) {

				return this.delegateCollection.equals(o);
			}

			@Override
			public int hashCode() {

				return this.delegateCollection.hashCode();
			}

		};
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#add(int, java.lang.Object)
	 */
	@Override
	public void add(int index, Map.Entry<K, V> object) {

		this.getDelegate().add(index, object);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#add(java.lang.Object)
	 */
	@Override
	public boolean add(Map.Entry<K, V> object) {

		return this.getDelegate().add(object);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#addAll(java.util.Collection)
	 */
	@Override
	public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {

		return this.getDelegate().addAll(collection);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#addAll(int, java.util.Collection)
	 */
	@Override
	public boolean addAll(int index, Collection<? extends Map.Entry<K, V>> collection) {

		return this.getDelegate().addAll(index, collection);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#containsAll(java.util.Collection)
	 */
	@Override
	public boolean containsAll(Collection<?> collection) {

		return this.getDelegate().containsAll(collection);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#get(int)
	 */
	@Override
	public Entry<K, V> get(int index) {

		return (Entry<K, V>) this.getDelegate().get(index);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#indexOf(java.lang.Object)
	 */
	@Override
	public int indexOf(Object object) {

		return this.getDelegate().indexOf(object);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#indexOfKey(java.lang.Object)
	 */
	@Override
	public int indexOfKey(Object key) {

		return this.getDelegate().indexOfKey(key);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#lastIndexOf(java.lang.Object)
	 */
	@Override
	public int lastIndexOf(Object object) {

		return this.getDelegate().lastIndexOf(object);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#listIterator()
	 */
	@Override
	public ListIterator<Map.Entry<K, V>> listIterator() {

		return this.getDelegate().listIterator();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#listIterator(int)
	 */
	@Override
	public ListIterator<Map.Entry<K, V>> listIterator(int index) {

		return this.getDelegate().listIterator(index);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#map()
	 */
	@Override
	public Map<K, V> map() {

		return this.getDelegate().map();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#move(int, int)
	 */
	@Override
	public Map.Entry<K, V> move(int targetIndex, int sourceIndex) {

		return this.getDelegate().move(targetIndex, sourceIndex);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#move(int, java.lang.Object)
	 */
	@Override
	public void move(int index, Map.Entry<K, V> object) {

		this.getDelegate().move(index, object);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#putAll(org.eclipse.emf.common.util.EMap)
	 */
	@Override
	public void putAll(EMap<? extends K, ? extends V> map) {

		this.getDelegate().putAll(map);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#retainAll(java.util.Collection)
	 */
	@Override
	public boolean retainAll(Collection<?> collection) {

		return this.getDelegate().retainAll(collection);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#set(int, java.lang.Object)
	 */
	@Override
	public Map.Entry<K, V> set(int index, Map.Entry<K, V> object) {

		return this.getDelegate().set(index, object);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#subList(int, int)
	 */
	@Override
	public List<Map.Entry<K, V>> subList(int start, int end) {

		return this.getDelegate().subList(start, end);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#toArray()
	 */
	@Override
	public Object[] toArray() {

		return this.getDelegate().toArray();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#toArray(java.lang.Object[])
	 */
	@Override
	public <T> T[] toArray(T[] array) {

		return this.getDelegate().toArray(array);
	}

	public boolean eAdd(Map.Entry<K, V> entry) {

		EMap<K, V> delegate = this.getDelegate();
		return EmfHelper.getInstance().addToEMap(delegate, entry);
	}

	@SuppressWarnings("unchecked")
	public void addUnique(Map.Entry<K, V> object) {

		((InternalEList<Map.Entry<K, V>>) this.getDelegate()).addUnique(object);
	}

	@SuppressWarnings("unchecked")
	public void addUnique(int index, Map.Entry<K, V> object) {

		((InternalEList<Map.Entry<K, V>>) this.getDelegate()).addUnique(index, object);
	}

	@SuppressWarnings("unchecked")
	public NotificationChain basicAdd(Map.Entry<K, V> object, NotificationChain notifications) {

		return ((InternalEList<Map.Entry<K, V>>) this.getDelegate()).basicAdd(object, notifications);
	}

	@SuppressWarnings("unchecked")
	public Map.Entry<K, V> basicGet(int index) {

		return ((InternalEList<Map.Entry<K, V>>) this.getDelegate()).basicGet(index);
	}

	@SuppressWarnings("unchecked")
	public Iterator<Map.Entry<K, V>> basicIterator() {

		return ((InternalEList<Map.Entry<K, V>>) this.getDelegate()).basicIterator();
	}

	@SuppressWarnings("unchecked")
	public List<Map.Entry<K, V>> basicList() {

		return ((InternalEList<Map.Entry<K, V>>) this.getDelegate()).basicList();
	}

	@SuppressWarnings("unchecked")
	public ListIterator<Map.Entry<K, V>> basicListIterator() {

		return ((InternalEList<Map.Entry<K, V>>) this.getDelegate()).basicListIterator();
	}

	@SuppressWarnings("unchecked")
	public ListIterator<Map.Entry<K, V>> basicListIterator(int index) {

		return ((InternalEList<Map.Entry<K, V>>) this.getDelegate()).basicListIterator(index);
	}

	@SuppressWarnings("unchecked")
	public NotificationChain basicRemove(Object object, NotificationChain notifications) {

		return ((InternalEList<Map.Entry<K, V>>) this.getDelegate()).basicRemove(object, notifications);
	}

	@SuppressWarnings("unchecked")
	public Map.Entry<K, V> setUnique(int index, Map.Entry<K, V> object) {

		return ((InternalEList<Map.Entry<K, V>>) this.getDelegate()).setUnique(index, object);
	}

	@SuppressWarnings("unchecked")
	public boolean isSet() {

		return ((InternalEList.Unsettable<Map.Entry<K, V>>) this.getDelegate()).isSet();
	}

	@SuppressWarnings("unchecked")
	public void unset() {

		((InternalEList.Unsettable<Map.Entry<K, V>>) this.getDelegate()).unset();
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

	public boolean addAllUnique(Collection<? extends java.util.Map.Entry<K, V>> collection) {
		return false;
	}

	public boolean addAllUnique(int index, Collection<? extends java.util.Map.Entry<K, V>> collection) {
		return ((InternalEList.Unsettable<Map.Entry<K, V>>) getDelegate()).addAllUnique(index, collection);
	}

	public boolean basicContains(Object object) {
		return ((InternalEList.Unsettable<Map.Entry<K, V>>) getDelegate()).basicContains(object);
	}

	public boolean basicContainsAll(Collection<?> collection) {
		return ((InternalEList.Unsettable<Map.Entry<K, V>>) getDelegate()).basicContainsAll(collection);
	}

	public int basicIndexOf(Object object) {
		return ((InternalEList.Unsettable<Map.Entry<K, V>>) getDelegate()).basicIndexOf(object);
	}

	public int basicLastIndexOf(Object object) {
		return ((InternalEList.Unsettable<Map.Entry<K, V>>) getDelegate()).basicLastIndexOf(object);
	}

	public Object[] basicToArray() {
		return ((InternalEList.Unsettable<Map.Entry<K, V>>) getDelegate()).basicToArray();
	}

	public <T> T[] basicToArray(T[] array) {
		return ((InternalEList.Unsettable<Map.Entry<K, V>>) getDelegate()).basicToArray(array);
	}

}