/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DynamicAction.java,v 1.4 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.auditing;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.sample.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Simple testcase to test auditing.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.17 $
 */
public class SimpleLibraryAuditingAction extends AbstractTestAction {
	/**
	 * Constructor.
	 * 
	 * @param arg0
	 */
	public SimpleLibraryAuditingAction() {
		super(LibraryPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.ENABLE_AUDITING, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final LibraryFactory factory = LibraryFactory.eINSTANCE;
		{
			store.beginTransaction();
			final Library library = factory.createLibrary();
			library.setName("library");
			for (int i = 0; i < 3; i++) {
				final Writer writer = factory.createWriter();
				writer.setName("George " + i);
				library.getWriters().add(writer);
				for (int j = 0; j < 3; j++) {
					final Book book = factory.createBook();
					book.setTitle("title " + i + " " + j);
					book.setPages(i * j);
					book.setCategory(BookCategory.get(j));
					writer.getBooks().add(book);
					library.getBooks().add(book);
				}
			}
			store.store(library);
			store.commitTransaction();
		}

	}
}