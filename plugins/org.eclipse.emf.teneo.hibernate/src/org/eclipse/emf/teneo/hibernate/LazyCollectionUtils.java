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
 * $Id: LazyCollectionUtils.java,v 1.1 2010/03/24 17:32:39 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.type.PersistentStoreAdapter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.collection.AbstractPersistentCollection;
import org.hibernate.collection.PersistentCollection;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.hql.ast.util.SessionFactoryHelper;
import org.hibernate.persister.collection.QueryableCollection;
import org.hibernate.type.Type;

/**
 * A utility class providing methods related to lazy loading of collections.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class LazyCollectionUtils {

	public static <E> Iterator<E> getPagedLoadingIterator(Collection<E> coll,
			int pageSize) {
		if (!isLazyLoadableCollection(coll)) {
			return coll.iterator();
		}
		final PersistableDelegateList<?> persistableList = (PersistableDelegateList<?>) coll;
		final AbstractPersistentCollection persistentCollection = (AbstractPersistentCollection) persistableList
				.getDelegate();
		final SessionImplementor session = persistentCollection.getSession();
		final PagingIterator<E> pagingIterator = new PagingIterator<E>();
		pagingIterator.setCollection(coll);
		pagingIterator.setPageSize(pageSize);
		pagingIterator.setSession((Session)session);
		return pagingIterator;
	}

	public static int size(Collection<?> coll) {
		if (!isLazyLoadableCollection(coll)) {
			return coll.size();
		}
		final PersistableDelegateList<?> persistableList = (PersistableDelegateList<?>) coll;
		final AbstractPersistentCollection persistentCollection = (AbstractPersistentCollection) persistableList
				.getDelegate();
		final SessionImplementor session = persistentCollection.getSession();
		final Object owner = persistentCollection.getOwner();
		final EStructuralFeature eFeature = persistableList
				.getEStructuralFeature();
		PersistentStoreAdapter adapter = null;
		if (owner instanceof EObject) {
			adapter = HbUtil.getPersistentStoreAdapter(((EObject) owner));
			final Integer size = adapter.getCollectionSize(eFeature);
			if (size != null) {
				return size;
			}
		}
		final QueryableCollection persister = new SessionFactoryHelper(session
				.getFactory()).getCollectionPersister(persistentCollection
				.getRole());
		final Type collectionElementType = persister.getElementType();
		// it seems that hibernate gets confused when there is a filter defined
		// on
		// the session, see the EmployeeAction test which fails in this case
		if (collectionElementType.isEntityType()
				&& session.getEnabledFilters().isEmpty()) {
			final int size = ((Number) ((Session) session).createFilter(
					persistentCollection, "select count(*)").uniqueResult())
					.intValue();
			if (adapter != null) {
				adapter.setCollectionSize(eFeature, size);
			}
			return size;
		}
		
		// no other way 
		return coll.size();
	}
	
	public static <E> boolean isLazyLoadableCollection(Collection<E> coll) {
		boolean lazyLoadable = coll instanceof PersistableDelegateList<?>;
		if (!lazyLoadable) {
			return false;
		}
		final PersistableDelegateList<?> persistableList = (PersistableDelegateList<?>) coll;
		lazyLoadable &= persistableList.getDelegate() instanceof AbstractPersistentCollection;
		if (!lazyLoadable) {
			return false;
		}
		final AbstractPersistentCollection persistentCollection = (AbstractPersistentCollection) persistableList
				.getDelegate();
		final SessionImplementor session = persistentCollection.getSession();
		// if not a valid session then go away
		if (session == null
				|| !session.isOpen()
				|| !session.getPersistenceContext().containsCollection(
						persistentCollection)) {
			return false;
		}
		return true;
	}
	
	public static class PagingIterator<E> implements Iterator<E> {
		
		private Session session;
		private int pageSize;
		private Boolean hasNext = null;
		private int currentIteratorIndex = 0;
		private int currentPageStart = 0;
		private List<E> content;
		private Object collection;
		
		
		public boolean hasNext() {
			if (hasNext != null) {
				return hasNext;
			}
			
			if (content.size() < pageSize) {
				hasNext = false;
				return hasNext;
			}
			
			// load the next page to see if there is any content
			hasNext = !loadNextPage().isEmpty();
			
			return hasNext;
		}
		
		public E next() {
			if (currentIteratorIndex < content.size()) {
				return content.get(currentIteratorIndex++);
			}
			
			// load the next page
			final List<E> content = loadNextPage();
			if (content.isEmpty()) {
				throw new NoSuchElementException();
			}
			currentIteratorIndex = 0;
			hasNext = null;
			currentPageStart += content.size();
			return content.get(currentIteratorIndex++);
		}

		@SuppressWarnings("unchecked")
		private List<E> loadNextPage() {
			final Query query = session.createFilter( collection, "" ); // the trivial filter
			query.setMaxResults(pageSize);
			query.setFirstResult(currentPageStart);
			return (List<E>)query.list();
		}
		
		public void remove() {
			throw new UnsupportedOperationException("Removal is not supported by the paging iterator");
		}

		public Session getSession() {
			return session;
		}

		public void setSession(Session session) {
			this.session = session;
		}

		public int getPageSize() {
			return pageSize;
		}

		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}

		public Object getCollection() {
			return collection;
		}

		public void setCollection(Object collection) {
			this.collection = collection;
		}
		
		
	}
}