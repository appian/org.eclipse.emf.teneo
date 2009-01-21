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
package org.eclipse.emf.teneo.eclipselink.examples.library.orm.tests.resource;

import javax.persistence.EntityManager;

import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryFactory;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;
import org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum;
import org.eclipse.emf.teneo.eclipselink.examples.library.forum.ForumFactory;

public class TestModelFactory {

	private Library library;

	private Writer writer;

	private Book book;

	public Library createLibraryModel() {

		if (library == null) {
			// create and populate library model instance
			library = LibraryFactory.eINSTANCE.createLibrary();
			library.setName("myLibrary");
			writer = LibraryFactory.eINSTANCE.createWriter();
			writer.setName("myWriter");
			library.getWriters().add(writer);
			book = LibraryFactory.eINSTANCE.createBook();
			book.setTitle("myBook");
			library.getBooks().put(book.getTitle(), book);
		}

		return library;
	}

	public Forum createForumModel() {

		// create and populate forum model instance
		Forum forum = ForumFactory.eINSTANCE.createForum();
		forum.setName("myForum");
		if (writer != null) {
			forum.getRatedAuthors().add(writer);
		}
		if (book != null) {
			forum.getFeaturedBooks().add(book);
		}

		return forum;
	}

	public void destroyLibraryModel(EntityManager entityManager) {

		if (library != null) {
			// begin transaction
			entityManager.getTransaction().begin();

			// delete library model from database; delete does not cascade so order is
			// important
			entityManager.createQuery("delete from StringToBookMapEntryImpl o").executeUpdate();
			entityManager.createQuery("delete from BookStylesMapEntryImpl o").executeUpdate();
			entityManager.createQuery("delete from Cover o").executeUpdate();
			entityManager.createQuery("delete from Book o").executeUpdate();
			entityManager.createQuery("delete from Publisher o").executeUpdate();
			entityManager.createQuery("delete from Translator o").executeUpdate();
			entityManager.createQuery("delete from Writer o").executeUpdate();
			entityManager.createQuery("delete from TypeWriter o").executeUpdate();
			entityManager.createQuery("delete from Address o").executeUpdate();
			entityManager.createQuery("delete from Library o").executeUpdate();
			entityManager.createQuery("delete from Style o").executeUpdate();

			// commit and end transaction
			entityManager.getTransaction().commit();

			// dispose library model
			library = null;
			writer = null;
			book = null;
		}
	}
}
