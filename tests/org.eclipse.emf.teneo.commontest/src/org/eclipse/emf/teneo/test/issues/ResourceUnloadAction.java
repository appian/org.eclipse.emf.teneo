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
 * $Id: ResourceUnloadAction.java,v 1.1 2008/04/16 21:07:53 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.samples.issues.resourceunload.Book;
import org.eclipse.emf.teneo.samples.issues.resourceunload.Library;
import org.eclipse.emf.teneo.samples.issues.resourceunload.ResourceunloadFactory;
import org.eclipse.emf.teneo.samples.issues.resourceunload.ResourceunloadPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests specific unload behavior, see the emft newsgroup for posts with the topic [Teneo] Unload()
 * questions
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class ResourceUnloadAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public ResourceUnloadAction() {
		super(ResourceunloadPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final ResourceunloadFactory factory = ResourceunloadFactory.eINSTANCE;

		// create a book, writer and library
		try {
			{
				Resource res = store.getResource();
				res.load(null);

				final Book book = factory.createBook();
				book.setTitle("Fellowship of the Ring");

				final Library library = factory.createLibrary();
				library.setName("Science Fiction");
				library.getBooks().add(book);

				res.getContents().add(library);
				res.save(null);
			}

			// walk through the structure starting from the library
			{
				final String qry =
						"query1=select b from " + Book.class.getName() + " as b&query2=select l from " +
								Library.class.getName() + " as l";
				Resource res = store.getResource(qry);
				res.load(null);
				Library lib = null;
				for (Object o : res.getContents()) {
					if (o instanceof Library) {
						lib = (Library) o;
					}
				}

				assertNotNull(lib);
				final Book b = lib.getBooks().get(0);
				assertTrue(lib.getBooks().size() > 0);
				assertTrue(b.eContainer() == lib);
				assertTrue(res.getContents().contains(b));
				res.unload();
				assertTrue(lib.getBooks().size() > 0);
				assertTrue(b.eContainer() == lib);
				assertTrue(!res.getContents().contains(b));
			}
		} catch (IOException e) {
			throw new StoreTestException("IOException during save", e);
		}
	}
}
