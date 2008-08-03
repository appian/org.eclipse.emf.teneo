/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.bz242995.Author;
import org.eclipse.emf.teneo.samples.issues.bz242995.Book;
import org.eclipse.emf.teneo.samples.issues.bz242995.BookCategory;
import org.eclipse.emf.teneo.samples.issues.bz242995.Library;
import org.eclipse.emf.teneo.samples.issues.bz242995.OneTimeWonder;
import org.eclipse.emf.teneo.samples.issues.bz242995.Writer;
import org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Factory;
import org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Package;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.proxy.HibernateProxy;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz242995Action extends AbstractTestAction {

	public Bz242995Action() {
		super(new EPackage[] { bz242995Package.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_PROXY, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			// Create a library.
			Library library = bz242995Factory.eINSTANCE.createLibrary();
			library.setName("My Library");
			// Make it persistent.
			// session.save(library);

			// Create a writer...
			Writer writer = bz242995Factory.eINSTANCE.createWriter();
			writer.setName("JRR Tolkien");
			store.store(writer);//

			// ...and one of his books.
			Book book = bz242995Factory.eINSTANCE.createBook();
			book.setAuthor(writer);
			book.setPages(305);
			book.setTitle("The Hobbit");
			book.setCategory(BookCategory.SCIENCE_FICTION);
			store.store(book);//
			// Add the Writer and Book to the Library. They are made
			// persistent automatically because the Library is already
			// persistent.
			library.getWriters().add(writer);
			library.getBooks().add(book);
			store.store(library);//

			Author theAuthor = bz242995Factory.eINSTANCE.createAuthor();
			theAuthor.setName("Arundati Roy");

			OneTimeWonder wonder = bz242995Factory.eINSTANCE.createOneTimeWonder();
			wonder.setName("God of small things");
			wonder.setTheAuthor(theAuthor);
			store.store(wonder);
			store.store(theAuthor);
			// Commit the changes to the database.
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			OneTimeWonder otw = store.getObject(OneTimeWonder.class);
			Author auth = otw.getTheAuthor();
			assertTrue(auth instanceof HibernateProxy);
			store.commitTransaction();
		}
	}
}
