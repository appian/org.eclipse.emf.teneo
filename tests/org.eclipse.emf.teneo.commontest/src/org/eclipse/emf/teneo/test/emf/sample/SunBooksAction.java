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
 * $Id: SunBooksAction.java,v 1.4 2007/03/05 20:59:07 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.AuthorsType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BooksType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.CollectionType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksFactory;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;


/**
 * Tests the sun books example, is mainly used to test EList methods (move, set, contains, move, etc)
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $ 
*/
public class SunBooksAction extends AbstractTestAction 
{
	public SunBooksAction() 
	{
		super(SunBooksPackage.eINSTANCE);
	}
	
	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store)
	{
		final SunBooksFactory factory = SunBooksFactory.eINSTANCE;
        
		// create a book, writer and library
    	{
    		store.beginTransaction();
    		
    		BookType book = factory.createBookType();
    		{
	    		book.setBookCategory(BookCategoryType1.FICTION_LITERAL);
	    		book.setDescription("In this prequel story to George R. R. Martin's Award winning....");
	    		book.setName("The Hedge Knight");
	    		book.setISBN(97640110);
	    		book.setItemId("097640110K");
	    		book.setPrice("£6.99");
	    		
	    		PromotionType promotion = factory.createPromotionType();
	    		promotion.setDiscount("10%");
	    		book.setPromotion(promotion);
	    		
	    		book.setPublicationDate(store.getDate(new Date("10/10/2003")));
	    		
	    		AuthorsType author = factory.createAuthorsType();
	    		author.getAuthorName().add("George R.R. Martin");
	    		author.getAuthorName().add("Ben Avery");
	    		book.setAuthors(author);
    		}    		

    		BookType book1 = factory.createBookType();
    		{
	    		book1.setBookCategory(BookCategoryType1.FICTION_LITERAL);
	    		book1.setDescription("The first book in a brand new series from world-wide bestselling author of MAGICIAN, Raymond E. Feist....");
	    		book1.setName("Flight of the Nighthawks: Darkwar (Conclave of Shadows S.)");
	    		book1.setISBN(713374);
	    		book1.setItemId("000713374X");
	    		book1.setPrice("£12.53");
	    		
	    		PromotionType promotion = factory.createPromotionType();
	    		promotion.setNone("none");
	    		book1.setPromotion(promotion);
	    		
	    		book1.setPublicationDate(store.getDate(new Date("10/10/2003")));
	    		
	    		AuthorsType author = factory.createAuthorsType();
	    		author.getAuthorName().add("Raymond Feist");
	    		book1.setAuthors(author);
    		}    		

    		BookType book2 = factory.createBookType();
    		{
	    		book2.setBookCategory(BookCategoryType1.FICTION_LITERAL);
	    		book2.setDescription("Foundation marks the first of a series of tales set so far in the future that Earth is all....");
	    		book2.setName("Foundation (The Foundation Series)");
	    		book2.setISBN(586010807);
	    		book2.setItemId("0586010807");
	    		book2.setPrice("£5.59");
	    		
	    		PromotionType promotion = factory.createPromotionType();
	    		promotion.setNone("none");
	    		book2.setPromotion(promotion);
	    		
	    		book2.setPublicationDate(store.getDate(new Date("10/10/2003")));
	    		
	    		AuthorsType author = factory.createAuthorsType();
	    		author.getAuthorName().add("Isaac Asimov");
	    		book2.setAuthors(author);
    		}    		

    		// put the book in the collection
    		CollectionType coll = factory.createCollectionType();
    		BooksType booksType = factory.createBooksType();
    		booksType.getBook().add(book);
    		booksType.getBook().add(book1);
    		booksType.getBook().add(book2);
    		coll.setBooks(booksType);
    		store.store(coll);    		
	        store.commitTransaction();
    	}

    	// The following methods of the Elist are checked
    	// move
    	// isEmpty (false)
    	// get
    	// size
    	// contains
    	// containsAll
    	// iterator 
    	// listiterator
    	{
    		store.beginTransaction();
    		final CollectionType coll = (CollectionType)store.getObject(CollectionType.class);
    		final BooksType books = coll.getBooks();
    		
    		// get Isaacs book
    		BookType isaac = (BookType)books.getBook().get(2);
    		
    		// move Isaac to the first position 
    		books.getBook().move(0, 2);
    		assertTrue("Index of Isaacs book is " + books.getBook().indexOf(isaac), books.getBook().indexOf(isaac) == 0);
    		assertTrue(books.getBook().size() == 3); // move does not delete
    		
    		// check contains on false
    		assertFalse(books.getBook().contains(factory.createBookType()));
    		assertTrue(books.getBook().contains(books.getBook().get(0)));
    		
    		// is empty
    		assertFalse(books.getBook().isEmpty());
    		
    		ArrayList checkContains = new ArrayList();
    		Iterator it = books.getBook().iterator();
    		while (it.hasNext())
    		{
    			checkContains.add(it.next());
    		}
    		assertTrue(books.getBook().containsAll(checkContains));

    		assertTrue(books.getBook().size() == 3);
    		
    		ArrayList checkContains2 = new ArrayList();
    		ListIterator itList = books.getBook().listIterator();
    		while (itList.hasNext())
    		{
    			checkContains2.add(itList.next());
    		}
    		assertTrue(books.getBook().containsAll(checkContains2));
    		
    		List subList = books.getBook().subList(0, 2);
    		assertTrue(subList.size() == 2);
    		assertTrue(books.getBook().containsAll(subList));
    		
    		store.commitTransaction();    		
    	}
    	    	
    	// test remove(int) and removeAll
    	{
    		store.beginTransaction();
    		final CollectionType coll = (CollectionType)store.getObject(CollectionType.class);
    		final BooksType books = coll.getBooks();

    		// the first book should be Isaac, check the move
    		BookType isaacsBook = (BookType)books.getBook().get(0);
    		String authorName = (String)isaacsBook.getAuthors().getAuthorName().get(0);
    		assertTrue(authorName.compareTo("Isaac Asimov") == 0);
    		
    		assertTrue(books.getBook().size() == 3);
    		
    		books.getBook().remove(0); // remove Isaac
    		List removeList = new ArrayList(books.getBook().subList(0, 1));
    		books.getBook().removeAll(removeList);
    		
    		store.commitTransaction();
    	}

    	// add a new book using set
		BookType book4 = factory.createBookType();
		{
    		book4.setBookCategory(BookCategoryType1.FICTION_LITERAL);
    		book4.setDescription(" The second volume in the Foundation saga. Catastrophic event....");
    		book4.setName("Foundation and Empire (The Foundation Series)");
    		book4.setISBN(586013555);
    		book4.setItemId("0586013555");
    		book4.setPrice("£5.59");
    		
    		PromotionType promotion = factory.createPromotionType();
    		promotion.setNone("none");
    		book4.setPromotion(promotion);
    		
    		book4.setPublicationDate(store.getDate(new Date("10/10/2003")));
    		
    		AuthorsType author = factory.createAuthorsType();
    		author.getAuthorName().add("Isaac Asimov");
    		book4.setAuthors(author);
    		
    		store.beginTransaction();
    		final CollectionType coll = (CollectionType)store.getObject(CollectionType.class);
    		final BooksType books = coll.getBooks();
    		books.getBook().set(0, book4);
    		store.commitTransaction();
		}

		// add the first book again
		BookType book0 = factory.createBookType();
		{
    		book0.setBookCategory(BookCategoryType1.FICTION_LITERAL);
    		book0.setDescription("In this prequel story to George R. R. Martin's Award winning....");
    		book0.setName("The Hedge Knight");
    		book0.setISBN(97640110);
    		book0.setItemId("097640110K");
    		book0.setPrice("£6.99");
    		
    		PromotionType promotion = factory.createPromotionType();
    		promotion.setDiscount("10%");
    		book0.setPromotion(promotion);
    		
    		book0.setPublicationDate(store.getDate(new Date("10/10/2003")));
    		
    		AuthorsType author = factory.createAuthorsType();
    		author.getAuthorName().add("George R.R. Martin");
    		author.getAuthorName().add("Ben Avery");
    		book0.setAuthors(author);
    		
    		store.beginTransaction();
    		final CollectionType coll = (CollectionType)store.getObject(CollectionType.class);
    		final BooksType books = coll.getBooks();
    		books.getBook().add(book0);
    		store.commitTransaction();
		}    		
	
		// test remove(object)
    	{
    		store.beginTransaction();
    		final CollectionType coll = (CollectionType)store.getObject(CollectionType.class);
    		final BooksType books = coll.getBooks();
    		assertTrue(books.getBook().size() == 2);
    		BookType book = (BookType)books.getBook().get(0);
    		books.getBook().remove(book);
    		store.commitTransaction();
    	}
    	
    	// test clear
    	{
    		store.beginTransaction();
    		final CollectionType coll = (CollectionType)store.getObject(CollectionType.class);
    		final BooksType books = coll.getBooks();
    		assertTrue(books.getBook().size() == 1);
    		books.getBook().clear();
    		store.commitTransaction();
    	}
    	
    	// now everything should be zero
    	{
    		store.beginTransaction();
    		final CollectionType coll = (CollectionType)store.getObject(CollectionType.class);
    		final BooksType books = coll.getBooks();
    		assertTrue(books.getBook().size() == 0);
    		store.commitTransaction();
    	}

    	// these should all be gone
    	{    	
			store.beginTransaction();
			store.checkNumber(BookType.class, 0);
			store.checkNumber(AuthorsType.class, 0);
			store.checkNumber(PromotionType.class, 0);
			store.commitTransaction();
    	}    	
	}	
}