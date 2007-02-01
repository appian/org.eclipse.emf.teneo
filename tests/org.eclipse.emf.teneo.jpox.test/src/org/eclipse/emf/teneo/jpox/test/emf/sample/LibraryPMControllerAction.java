/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: LibraryPMControllerAction.java,v 1.3 2007/02/01 12:34:04 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.sample;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.jpox.resource.JPOXResource;
import org.eclipse.emf.teneo.jpox.resource.PMController;
import org.eclipse.emf.teneo.jpox.test.stores.JPOXTestStore;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.samples.emf.sample.library.impl.BookImpl;
import org.eclipse.emf.teneo.samples.emf.sample.library.impl.WriterImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd using a session controller and multiple resources.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class LibraryPMControllerAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public LibraryPMControllerAction() {
		super(LibraryPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;
		final ResourceSet resourceSet = new ResourceSetImpl();

		PMController pmc = new PMController();
		pmc.setJpoxDataStore(((JPOXTestStore)store).getEmfDataStore());
		PMController.registerPMController("testsc", pmc);
		
		// create a book, writer and library
		try {
			{
				JPOXResource res1 = (JPOXResource)getResource(resourceSet, null);
				JPOXResource res2 = (JPOXResource)getResource(resourceSet, null);
				pmc.getPM().currentTransaction().begin();
				res1.load(null);
				res2.load(null);
				pmc.getPM().currentTransaction().commit();

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
				res1.getContents().add(book);
				res1.getContents().add(book2);
				
				final Library library = factory.createLibrary();
				res2.getContents().add(library);
				library.setName("Science Fiction");
				library.getBooks().add(book);
				library.getBooks().add(book2);
				library.getWriters().add(writer);

				pmc.getPM().currentTransaction().begin();
				res1.save(null);
				res2.save(null);
				res1.save(null);
				res1.unload();
				res2.unload();
				pmc.getPM().currentTransaction().commit();
			}
			PMController.deRegisterPMController("testsc");

			pmc = new PMController();
			pmc.setJpoxDataStore(((JPOXTestStore)store).getEmfDataStore());
			PMController.registerPMController("testsc", pmc);

			// walk through the structure starting from the library
			{
				JPOXResource res1 = (JPOXResource)getResource(resourceSet, "query1=select from " + BookImpl.class.getName());
				JPOXResource res2 = (JPOXResource)getResource(resourceSet, "query1=select from " + WriterImpl.class.getName());
				pmc.getPM().currentTransaction().begin();
				res1.load(null);
				res2.load(null);
				pmc.getPM().currentTransaction().commit();

				int cnt = 0;
				for (Iterator it = res1.getContents().iterator(); it.hasNext();) {
					final Object obj = it.next();
					final Book book = (Book)obj;
					assertTrue(book.eResource() == res1);
					assertTrue(book.getAuthor().eResource() == res2);
					assertTrue(book.getAuthor().getBooks().size() == 2);
					assertTrue(res2.getContents().contains(book.getAuthor()));
					cnt++;
				}
				assertEquals(2, cnt);
				//assertEquals(1, res2.getContents().size());
				pmc.getPM().currentTransaction().begin();
				res1.save(null);
				res2.save(null);
				pmc.getPM().currentTransaction().commit();				
				res1.unload();
				res2.unload();
			}

		} catch (Exception e) {
			throw new StoreTestException("Exception during save", e);
		} finally {
			PMController.deRegisterPMController("testsc");
		}
	}

	/** Base method to get a resource belonging to the session of this test case */
	public Resource getResource(ResourceSet rs, String extraParam) {
		String uriStr = "jpox://?" + JPOXResource.PM_CONTROLLER_PARAM + "=testsc";
		if (extraParam != null) {
			uriStr += "&" + extraParam;
		}
		final URI uri = URI.createURI(uriStr);
		final Resource res = rs.createResource(uri);
		return res;
	}
}