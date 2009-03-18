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
package org.eclipse.emf.teneo.eclipselink.examples.library.orm.tests;

import java.util.List;

import javax.persistence.EntityManager;

import junit.framework.AssertionFailedError;

import org.eclipse.emf.teneo.eclipselink.examples.library.Address;
import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory;
import org.eclipse.emf.teneo.eclipselink.examples.library.Cover;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryFactory;
import org.eclipse.emf.teneo.eclipselink.examples.library.Publisher;
import org.eclipse.emf.teneo.eclipselink.examples.library.Style;
import org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType;
import org.eclipse.emf.teneo.eclipselink.examples.library.Translator;
import org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;
import org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryFactoryImpl;

public abstract class LibraryJPATest extends JPATest {

	public LibraryJPATest(String name) {
		super(name);
	}

	@Override
	protected String getPersistenceUnitName() {
		return "library";
	}

	@Override
	protected void cleanDatabase(EntityManager em) {
		// delete does not cascade so order is important
		em.createQuery("delete from Publisher o").executeUpdate();
		em.createQuery("delete from StringToBookMapEntry o").executeUpdate();
		em.createQuery("delete from BookStylesMapEntry o").executeUpdate();
		em.createQuery("delete from Cover o").executeUpdate();
		em.createQuery("delete from Book o").executeUpdate();
		em.createQuery("delete from Translator o").executeUpdate();
		em.createQuery("delete from Writer o").executeUpdate();
		em.createQuery("delete from TypeWriter o").executeUpdate();
		em.createQuery("delete from Address o").executeUpdate();
		em.createQuery("delete from Library o").executeUpdate();
		em.createQuery("delete from Style o").executeUpdate();
	}

	protected static final LibraryFactory factory = LibraryFactoryImpl.eINSTANCE;

	protected static void assertBookListContains(List<Book> books, Book firstBook) {
		for (Book each : books) {
			try {
				assertBooksEqual(each, firstBook);
				return; // found
			} catch (AssertionFailedError e) {
			}
		}
	}

	protected static void assertBooksEqual(Book expectedBook, Book actualBook) {
		assertEquals("author", expectedBook.getAuthor(), actualBook.getAuthor());
		assertEquals("title", expectedBook.getTitle(), actualBook.getTitle());
		assertEquals("category", expectedBook.getCategory(), actualBook.getCategory());
		assertEquals("pages", expectedBook.getPages(), actualBook.getPages());
	}

	protected Book createAnonymousBookForWriter(EntityManager em, Writer writer) {
		Book book = createAnonymousBook(em);
		book.setAuthor(writer);
		writer.getBooks().add(book);
		return book;
	}

	protected Book createAnonymousBook(EntityManager em) {
		Book book = factory.createBook();
		em.persist(book);
		book.setCategory(BookCategory.BIOGRAPHY);
		book.setPages(100);
		book.setTitle(getAnonymousString());
		return book;
	}

	protected Book createAnonymousBookWithCover(EntityManager em) {
		Book book = createAnonymousBook(em);
		Cover cover = factory.createCover();
		cover.setColored(true);
		book.setCover(cover);
		return book;
	}

	protected Writer createAnonymousWriter(EntityManager em) {
		Writer writer = factory.createWriter();
		em.persist(writer);
		writer.setName(getAnonymousString());
		return writer;
	}

	protected Library createAnonymousLibrary(EntityManager em) {
		Library library = factory.createLibrary();
		em.persist(library);
		library.setName(getAnonymousString());
		return library;
	}

	protected Writer createAnonymousWriterWithOneBook(EntityManager em) {
		Writer writer = createAnonymousWriter(em);
		createAnonymousBookForWriter(em, writer);
		return writer;
	}

	protected Writer createAnonymousWriterWithAddress(EntityManager em) {
		Writer writer = createAnonymousWriter(em);
		createAnonymousAddressForWriter(em, writer);
		return writer;
	}

	protected Address createAnonymousAddressForWriter(EntityManager em, Writer writer) {
		Address address = factory.createAddress();
		address.setTown(getAnonymousString());
		em.persist(address);
		writer.setAddress(address);
		return address;
	}

	protected Publisher createAnonymousPublisher(EntityManager em) {
		Publisher publisher = factory.createPublisher();
		publisher.setName(getAnonymousString());
		em.persist(publisher);
		return publisher;
	}

	protected Book createAnonymousBookWithTranslator(EntityManager em) {
		Book book = createAnonymousBook(em);
		book.setTranslator(createAnonymousTranslator(em));
		return book;
	}

	protected Translator createAnonymousTranslator(EntityManager em) {
		Translator translator = factory.createTranslator();
		translator.setName(getAnonymousString());
		translator.setLocation("Stuttgart");
		em.persist(translator);
		return translator;
	}

	protected Book createAnonymousBookWithStyles(EntityManager em) {
		Book book = createAnonymousBook(em);
		Style style1 = createAnonymousStyle(em);
		Style style2 = createAnonymousStyle(em);
		book.getStyles().put(style1.getName(), style1);
		book.getStyles().put(style2.getName(), style2);
		return book;
	}

	protected Style createAnonymousStyle(EntityManager em) {
		Style style = factory.createStyle();
		style.setName(getAnonymousString());
		em.persist(style);
		return style;
	}

	protected TypeWriter createAnonymousTypewriter(EntityManager em) {
		TypeWriter twriter = factory.createTypeWriter();
		twriter.setMaker(getAnonymousString());
		twriter.setType(TWriterType.COMPUTER);
		em.persist(twriter);
		return twriter;
	}

	protected Writer createAnonymousWriterWithTypeWriter(EntityManager em) {
		Writer writer = createAnonymousWriter(em);
		TypeWriter twriter = createAnonymousTypewriter(em);
		writer.getTypewriters().add(twriter);
		return writer;
	}

	protected Library setupLibraryEnvironment(EntityManager em) {

		Library library = createAnonymousLibrary(em);

		Book book = createAnonymousBookWithStyles(em);
		library.getBooks().put(book.getTitle(), book);

		Translator translator = createAnonymousTranslator(em);
		book.setTranslator(translator);

		Writer writer = createAnonymousWriterWithAddress(em);
		library.getWriters().add(writer);

		Publisher publisher = createAnonymousPublisher(em);
		writer.getPublishers().add(publisher);
		publisher.getWriters().add(writer);

		return library;
	}

	protected Writer findWriterWithName(EntityManager em, String name) {
		return (Writer) em.createQuery("select o from Writer o where o.name = :name").setParameter("name", name)
				.getSingleResult();
	}

	protected Book findBookWithTitle(EntityManager em, String title) {
		return (Book) em.createQuery("select o from Book o where o.title = :title").setParameter("title", title)
				.getSingleResult();
	}

	protected Library findLibraryWithName(EntityManager em, String name) {
		return (Library) em.createQuery("select o from Library o where o.name = :name").setParameter("name", name)
				.getSingleResult();
	}

	protected Publisher findPublisherWithName(EntityManager em, String name) {
		return (Publisher) em.createQuery("select o from Publisher o where o.name = :name").setParameter("name", name)
				.getSingleResult();
	}

	protected TypeWriter findTypeWriterWithMaker(EntityManager em, String maker) {

		return (TypeWriter) em.createQuery("select o from TypeWriter o where o.maker = :maker").setParameter("maker",
				maker).getSingleResult();
	}

}
