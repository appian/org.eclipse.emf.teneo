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
 * $Id: LazyCollectionUtils.java,v 1.6 2010/04/03 09:21:12 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.hibernate.mapping.eav.EAVDelegatingEcoreEList;
import org.eclipse.emf.teneo.hibernate.mapping.eav.EAVValueHolder;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.type.PersistentStoreAdapter;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.collection.AbstractPersistentCollection;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.hql.ast.util.SessionFactoryHelper;
import org.hibernate.persister.collection.QueryableCollection;
import org.hibernate.type.Type;

/**
 * A utility class providing methods related to lazy loading of collections.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class LazyCollectionUtils {

	/**
	 * Returns an iterator which loads the underlying data from the collection
	 * in pages (controlled by the pageSize parameter). Note if the collection
	 * is not lazy loadable then a normal iterator is returned. This is checked
	 * using the {@link #isLazyLoadableCollection(Collection)} method.
	 * 
	 * Note: this method can only handle collections of EObjects so not collections
	 * of primitive typed objects. Paged iteration of these collections is not 
	 * supported by Hibernate.
	 * 
	 * @param coll
	 *            the collection to iterate lazily over
	 * @param pageSize
	 *            the pageSize, this determines the pagesize of the page of data
	 *            read each time from the database
	 * @return a paging iterator or if not a lazy loadable collection a normal
	 *         iterator
	 * @see PagingIterator
	 */
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
		pagingIterator.setCollection(persistentCollection);
		pagingIterator.setPageSize(pageSize);
		pagingIterator.setSession((Session) session);

		final QueryableCollection persister = new SessionFactoryHelper(session
				.getFactory()).getCollectionPersister(persistentCollection
				.getRole());
		pagingIterator.setEavCollection(coll instanceof EAVDelegatingEcoreEList<?>);
		pagingIterator.setIndexColumnNames(persister.getIndexColumnNames());
		return pagingIterator;
	}

	/**
	 * Reads the size of a collection in a lazy manner, i.e. will try to not
	 * load the collection from the database. The size is cached in the object,
	 * so subsequent calls to this method will not result in additional database
	 * queries. This until the collection changes then the cache is cleared.
	 * 
	 * Note if the collection can not be lazy loaded (see the
	 * {@link #isLazyLoadableCollection(Collection)}) then the size method is
	 * called on the collection. This method call is probably not lazy.
	 * 
	 * @param coll
	 *            the collection to get the size from
	 * @return the size of the collection
	 */
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
			adapter = StoreUtil.getPersistentStoreAdapter(((EObject) owner));
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

	/**
	 * Determines if a collection can be lazy loaded. A lazy loadable collection
	 * must be a {@link PersistableDelegateList} which has a
	 * {@link AbstractPersistentCollection} as the delegate list which also must
	 * have an open Hibernate session.
	 * 
	 * @param coll
	 *            the collection for which to determine if it can be lazy loaded
	 * @return false if not lazy loadable, true otherwise
	 */
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

	/**
	 * A paging iterator reads the underlying data from the database in pages.
	 * Everytime the iterator reaches the end of a page it reads the next page
	 * from the database.
	 * 
	 * @author mtaal
	 */
	public static class PagingIterator<E> implements Iterator<E> {

		private Session session;
		private int pageSize;
		private Boolean hasNext = null;
		private int currentIteratorIndex = 0;
		private int nextPageStart = 0;
		private List<E> content;
		private Object collection;
		private String[] indexColumnNames;
		private String orderBy = "";
		private boolean eavCollection;

		public boolean hasNext() {
			if (content == null) {
				setPageInformation();
			}

			if (currentIteratorIndex < content.size()) {
				return true;
			}

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
				return convert(content.get(currentIteratorIndex++));
			}

			// load the next page
			setPageInformation();
			if (content.isEmpty()) {
				throw new NoSuchElementException();
			}
			return convert(content.get(currentIteratorIndex++));
		}

		@SuppressWarnings("unchecked")
		private E convert(E value) {
			if (value instanceof EAVValueHolder) {
				return (E) ((EAVValueHolder) value).getValue();
			}
			return value;
		}

		private void setPageInformation() {
			content = loadNextPage();
			currentIteratorIndex = 0;
			hasNext = null;
			nextPageStart += content.size();
		}

		@SuppressWarnings("unchecked")
		private List<E> loadNextPage() {
			final Query query;
			if (isEavCollection()) {
				query = session.createFilter(collection,
						" order by this.listIndex ");
			} else {
				query = session.createFilter(collection, orderBy);
			}
			query.setMaxResults(pageSize);
			query.setFirstResult(nextPageStart);
			return (List<E>) query.list();
		}

		public void remove() {
			throw new UnsupportedOperationException(
					"Removal is not supported by the paging iterator");
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

		public String[] getIndexColumnNames() {
			return indexColumnNames;
		}

		public void setIndexColumnNames(String[] indexColumnNames) {
			this.indexColumnNames = indexColumnNames;
			final StringBuilder sb = new StringBuilder();
			if (indexColumnNames != null) {
				for (String indexColumnName : indexColumnNames) {
					if (sb.length() == 0) {
						sb.append(" order by ");
					} else {
						sb.append(", ");
					}
					sb.append(indexColumnName.replaceAll("`", "").replaceAll(
							"\"", ""));
				}
			}
			orderBy = sb.toString();
		}

		public String getOrderBy() {
			return orderBy;
		}

		/**
		 * Note the parameter must include the term: order by. Refer to properties of
		 * the collection content using the this keyword.
		 * 
		 * @param orderBy the order by clause including the order by keyword, for example: order by this.name
		 */
		public void setOrderBy(String orderBy) {
			this.orderBy = orderBy;
		}

		public boolean isEavCollection() {
			return eavCollection;
		}

		public void setEavCollection(boolean eavCollection) {
			this.eavCollection = eavCollection;
		}

	}
}