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
 * $Id: LibrarySessionControllerAddContentAction.java,v 1.6 2008/02/28 07:08:57 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.teneo.hibernate.resource.SessionController;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.resource.StoreResource;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd using a session controller and multiple resources.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class LibrarySessionControllerAddContentAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public LibrarySessionControllerAddContentAction() {
		super(LibraryPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	@SuppressWarnings("unchecked")
	public void doAction(TestStore store) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;
		final ResourceSet resourceSet = new ResourceSetImpl();

		SessionController sc = new SessionController();
		sc.setHbDataStore(((HibernateTestStore) store).getEmfDataStore());
		SessionController.registerSessionController("testsc", sc);

		final HashMap options = new HashMap();
		options.put(StoreResource.LOAD_STRATEGY_PARAM, StoreResource.ADD_TO_CONTENTS);

		// create a book, writer and library
		try {
			{
				HibernateResource res1 = (HibernateResource) getResource(resourceSet, null);
				HibernateResource res2 = (HibernateResource) getResource(resourceSet, null);
				sc.getSessionWrapper().beginTransaction();
				res1.load(options);
				res2.load(options);
				sc.getSessionWrapper().commitTransaction();

				final Writer writer = factory.createWriter();
				writer.setName("JRR Tolkien");
				res2.getContents().add(writer);

				final Book book = factory.createBook();
				book.setAuthor(writer);
				book.setPages(510);
				book.setTitle("Fellowship of the Ring");
				book.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);
				final Book book2 = factory.createBook();
				book2.setAuthor(writer);
				book2.setPages(500);
				book2.setTitle("The Hobbit");
				book2.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);

				final Library library = factory.createLibrary();
				library.setName("Science Fiction");
				library.getBooks().add(book);
				library.getBooks().add(book2);
				library.getWriters().add(writer);

				res2.getContents().add(library);

				res1.getContents().add(book);
				res1.getContents().add(book2);

				sc.getSessionWrapper().beginTransaction();
				res1.save(null);
				res2.save(null);
				res1.save(null);
				res1.unload();
				res2.unload();
				res1.getResourceSet().getResources().remove(res1);
				res2.getResourceSet().getResources().remove(res2);
				sc.getSessionWrapper().commitTransaction();
				sc.getSessionWrapper().clear();
			}
			SessionController.deRegisterSessionController("testsc");

			sc = new SessionController();
			sc.setHbDataStore(((HibernateTestStore) store).getEmfDataStore());
			SessionController.registerSessionController("testsc", sc);

			{
				HibernateResource res1 = (HibernateResource) getResource(resourceSet, "query1=select b from Book b");
				HibernateResource res2 = (HibernateResource) getResource(resourceSet, "query1=select w from Writer w");
				sc.getSessionWrapper().beginTransaction();
				res1.load(options);
				assertTrue(res1.getContents().get(1) instanceof Writer);
				assertEquals(3, res1.getContents().size());
				res2.load(options);
				assertEquals(2, res1.getContents().size());
				sc.getSessionWrapper().commitTransaction();

				int cnt = 0;
				final ArrayList tempList = new ArrayList(res1.getContents());
				for (Iterator it = tempList.iterator(); it.hasNext();) {
					final Object obj = it.next();
					final Book book = (Book) obj;
					assertTrue(book.eResource() == res1);
					assertTrue(book.getAuthor().eResource() == res2);
					assertTrue(book.getAuthor().getBooks().size() == 2);
					assertTrue(res2.getContents().contains(book.getAuthor()));
					cnt++;
				}
				assertEquals(2, cnt);
				// assertEquals(1, res2.getContents().size());
				sc.getSessionWrapper().beginTransaction();
				res1.save(Collections.EMPTY_MAP);
				res2.save(Collections.EMPTY_MAP);
				sc.getSessionWrapper().commitTransaction();
				res1.unload();
				res2.unload();
				res1.getResourceSet().getResources().remove(res1);
				res2.getResourceSet().getResources().remove(res2);
			}

			{
				HibernateResource res1 = (HibernateResource) getResource(resourceSet, "query1=select w from Writer w");
				sc.getSessionWrapper().beginTransaction();
				res1.load(options);
				assertTrue(res1.getContents().get(0) instanceof Writer);
				assertEquals(1, res1.getContents().size());
				res1.listByQuery("select b from Book b", true);
				assertEquals(3, res1.getContents().size());
				assertTrue(res1.getContents().get(1) instanceof Book);
				assertTrue(res1.getContents().get(2) instanceof Book);
				final Writer writ = (Writer) res1.getContents().get(0);
				assertTrue(writ.getBooks().contains(res1.getContents().get(1)));
				res1.save(Collections.EMPTY_MAP);
				sc.getSessionWrapper().commitTransaction();
				res1.unload();
				res1.getResourceSet().getResources().remove(res1);
				sc.getSessionWrapper().clear();
			}
			SessionController.deRegisterSessionController("testsc");

			sc = new SessionController();
			sc.setHbDataStore(((HibernateTestStore) store).getEmfDataStore());
			SessionController.registerSessionController("testsc", sc);

			{
				// check load of books into lazy load
				HibernateResource res1 = (HibernateResource) getResource(resourceSet, "query1=select w from Writer w");
				sc.getSessionWrapper().beginTransaction();
				res1.load(options);
				assertTrue(res1.getContents().get(0) instanceof Writer);
				assertEquals(1, res1.getContents().size());
				Writer writ = (Writer) res1.getContents().get(0);
				assertEquals(2, writ.getBooks().size());
				assertTrue(res1.getContents().contains(writ.getBooks().get(0)));
				assertTrue(res1.getContents().contains(writ.getBooks().get(1)));
				sc.getSessionWrapper().commitTransaction();
				res1.unload();
				res1.getResourceSet().getResources().remove(res1);
			}

		} catch (Exception e) {
			throw new StoreTestException("Exception during save", e);
		} finally {
			SessionController.deRegisterSessionController("testsc");
		}
	}

	/** Base method to get a resource belonging to the session of this test case */
	public Resource getResource(ResourceSet rs, String extraParam) {
		String uriStr = "hibernate://?" + HibernateResource.SESSION_CONTROLLER_PARAM + "=testsc";
		if (extraParam != null) {
			uriStr += "&" + extraParam;
		}
		final URI uri = URI.createURI(uriStr);
		final Resource res = rs.createResource(uri);
		return res;
	}
}
