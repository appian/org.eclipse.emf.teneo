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
 * $Id: HbExtraLazyPersistableEMap.java,v 1.3 2010/08/18 11:50:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.elist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.hibernate.LazyCollectionUtils;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.collection.internal.AbstractPersistentCollection;
import org.hibernate.collection.internal.PersistentList;
import org.hibernate.engine.spi.CollectionEntry;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.persister.collection.AbstractCollectionPersister;
import org.hibernate.type.EntityType;

/**
 * Extends the default hibernate persistable emap with extra lazy behavior.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class HbExtraLazyPersistableEMap<K, V> extends HibernatePersistableEMap<K, V> {

	private static final long serialVersionUID = 1L;

	/** Constructor */
	public HbExtraLazyPersistableEMap(InternalEObject owner, EReference eref, List<Entry<K, V>> list) {
		super(owner, eref, list);
	}

	@Override
	public Iterator<java.util.Map.Entry<K, V>> iterator() {
		return LazyCollectionUtils.getPagedLoadingIterator(this, LazyCollectionUtils.DEFAULT_PAGE_SIZE);
	}

	@Override
	public int size() {
		// if we are not loaded yet, we return the size of the buffered lazy
		// load delegate

		if (!isLoaded() && isHibernateListPresent()) {
			try {
				size = ((PersistentList) ((PersistableEList<?>) delegateEList).getDelegate()).size();
				return size;
			} catch (Throwable t) {
				// ignore on purpose, let the call to super handle it
			}
		}

		// didnt work, so we simply call the parent version
		return super.size();
	}

	@SuppressWarnings("unchecked")
	@Override
	public V get(Object key) {
		// do a lazy get
		if (key != null && !isLoaded() && isHibernateListPresent()) {
			final Session session = getSession();

			session.flush();

			// create a query
			final AbstractPersistentCollection collection = (AbstractPersistentCollection) getDelegate();
			final CollectionEntry collectionEntry = ((SessionImplementor) session)
					.getPersistenceContext().getCollectionEntry(collection);
			final AbstractCollectionPersister persister = (AbstractCollectionPersister) collectionEntry
					.getLoadedPersister();
			final String entityName = ((EntityType) persister.getCollectionMetadata().getElementType())
					.getAssociatedEntityName();
			final Query qry = session.createQuery("select e from " + entityName
					+ " as e where e.key=:key and e."
					+ StoreUtil.getExtraLazyInversePropertyName(getEStructuralFeature()) + "=:owner");
			qry.setParameter("key", key);
			qry.setParameter("owner", getOwner());
			final Object result = qry.uniqueResult();
			if (result instanceof Map.Entry<?, ?>) {
				final Map.Entry<K, V> entry = (Map.Entry<K, V>) result;
				return entry.getValue();
			}
			return null;
		}
		// TODO Auto-generated method stub
		return super.get(key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public V put(K key, V value) {
		if (!isLoaded() && isHibernateListPresent()) {
			final Map.Entry<K, V> entry = (Map.Entry<K, V>) get(key);
			if (entry != null && entry instanceof org.eclipse.emf.common.util.BasicEMap.Entry<?, ?>) {
				V result = putEntry((org.eclipse.emf.common.util.BasicEMap.Entry<K, V>) entry, value);
				didModify((org.eclipse.emf.common.util.BasicEMap.Entry<K, V>) entry, result);
				return result;
			} else {
				// we get here, create a new one and add it to the persistablelist...
				org.eclipse.emf.common.util.BasicEMap.Entry<K, V> newEntry = newEntry(hashOf(key), key,
						value);
				delegateEList.add(newEntry);
				return null;
			}
		}
		return super.put(key, value);
	}

	/** Needs to be implemented by concrete subclass */
	@Override
	protected EList<BasicEMap.Entry<K, V>> createDelegateEList(InternalEObject owner,
			EStructuralFeature feature, List<BasicEMap.Entry<K, V>> delegateORMList) {
		return new HbExtraLazyPersistableEList<Entry<K, V>>(owner, feature, delegateORMList) {
			private static final long serialVersionUID = 1L;

			@Override
			protected void didAdd(int index, Entry<K, V> newObject) {
				doPut(newObject);
			}

			@Override
			protected void didSet(int index, Entry<K, V> newObject, Entry<K, V> oldObject) {
				didRemove(index, oldObject);
				didAdd(index, newObject);
			}

			@Override
			protected void didRemove(int index, Entry<K, V> oldObject) {
				HbExtraLazyPersistableEMap.this.doRemove(oldObject);
			}

			@Override
			protected void didClear(int size, Object[] oldObjects) {
				doClear();
			}

			@Override
			protected void didMove(int index, Entry<K, V> movedObject, int oldIndex) {
				HbExtraLazyPersistableEMap.this.doMove(movedObject);
			}
		};
	}

	@Override
	public boolean remove(Object object) {
		// TODO Auto-generated method stub
		return super.remove(object);
	}

	@Override
	public boolean removeAll(Collection<?> collection) {
		// TODO Auto-generated method stub
		return super.removeAll(collection);
	}

	@Override
	public V removeKey(Object key) {
		// TODO Auto-generated method stub
		return super.removeKey(key);
	}

	private boolean isHibernateListPresent() {
		return getDelegate() instanceof AbstractPersistentCollection;
	}

	private Session getSession() {
		final AbstractPersistentCollection persistentCollection = (AbstractPersistentCollection) getDelegate();
		final SessionImplementor session = ((AbstractPersistentCollection) persistentCollection)
				.getSession();
		return (Session) session;
	}

}