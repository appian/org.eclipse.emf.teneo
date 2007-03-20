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
 * $Id: SchoolLibraryAction.java,v 1.10 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.Book;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.LibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.Writer;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.impl.BookImpl;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.impl.WriterImpl;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.SchoolBook;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.SchoolLibrary;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.SchoollibraryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.SchoollibraryPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the schoollibrary example which has some more inheritance structures.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.10 $
 */
public class SchoolLibraryAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public SchoolLibraryAction() {
		super(new EPackage[] { LibraryPackage.eINSTANCE, SchoollibraryPackage.eINSTANCE });
	}

	/** Creates simple types and tests against */
	public void doAction(TestStore store) {
		// test a simple type
		final LibraryFactory libFactory = LibraryFactory.eINSTANCE;
		final SchoollibraryFactory schoolFactory = SchoollibraryFactory.eINSTANCE;
		{
			store.beginTransaction();

			SchoolLibrary sl = schoolFactory.createSchoolLibrary();
			sl.setName("Primary School Library");

			Writer teacher = libFactory.createWriter();
			teacher.setName("mr. Mathematics");

			SchoolBook sb = schoolFactory.createSchoolBook();
			sb.setCategory(BookCategory.MYSTERY_LITERAL);
			sb.setTitle("Mathematics Level 1");
			sb.setPages(243);
			sb.setValue(34.59f);
			sb.setAuthor(teacher);

			SchoolBook sb2 = schoolFactory.createSchoolBook();
			sb2.setCategory(BookCategory.SCIENCE_FICTION_LITERAL);
			sb2.setTitle("Mathematics Level 2");
			sb2.setPages(244);
			sb2.setValue(35.70f);
			sb2.setAuthor(teacher);

			sl.getBooks().add(sb);
			sl.getBooks().add(sb2);
			sl.getWriters().add(teacher);
			sl.setLocation("Schoolbuilding 1");
			store.store(sb);
			store.store(sb2);
			store.store(sl);
			store.commitTransaction();
		}

		// now use a resource to read!
		try {
			final Resource res = store.getResource(getQuery1());
			res.load(Collections.EMPTY_MAP);
			assertEquals(3, res.getContents().size());
			Iterator it = res.getContents().iterator();
			int cntTeachers = 0;
			int cntBooks = 0;
			while (it.hasNext()) {
				Object obj = it.next();
				if (obj instanceof Writer) cntTeachers++;
				if (obj instanceof Book) cntBooks++;
			}
			assertEquals(1, cntTeachers);
			assertEquals(2, cntBooks);
			res.unload();
		} catch (IOException e) {
			throw new StoreTestException("Exception", e);
		}

		try {
			final Resource res = store.getResource(getQuery2());
			res.load(Collections.EMPTY_MAP);
			assertEquals(1, res.getContents().size());
			Writer writ = (Writer) res.getContents().get(0);
			// in case of direct load into a resource the containers are not set correctly, only 
			// if the container was loaded earlier then this is done.
			//assertTrue(hasContainer((InternalEObject) writ));
			writ.getBooks().remove(0);
			res.save(Collections.EMPTY_MAP);
			res.unload();
		} catch (IOException e) {
			throw new StoreTestException("Exception", e);
		}

		// test result
		try {
			final Resource res = store.getResource(getQuery3());
			res.load(Collections.EMPTY_MAP);
			assertEquals(3, res.getContents().size());
			Iterator it = res.getContents().iterator();
			int cntTeachers = 0;
			int cntBooks = 0;
			int bookNoWriter = 0;
			Writer checkWriter1 = null;
			Writer checkWriter2 = null;
			while (it.hasNext()) {
				Object obj = it.next();
				if (obj instanceof Writer) {
					assertEquals(1, ((Writer) obj).getBooks().size());
					checkWriter1 = (Writer) obj;
					cntTeachers++;
				}
				if (obj instanceof Book) {
					if (((Book) obj).getAuthor() == null) {
						bookNoWriter++;
					} else {
						checkWriter2 = ((Book) obj).getAuthor();
					}
					cntBooks++;
					if (obj instanceof SchoolBook) {
						SchoolBook sb = (SchoolBook)obj;
						if (sb.getValue() < 35f ) {
							assertEquals(34.59f, sb.getValue(), 0.001); 
						} else {
							assertEquals(35.70f, sb.getValue(), 0.001); 							
						}
					}
				}
			}
			assertEquals(1, cntTeachers);
			assertEquals(2, cntBooks);
			assertEquals(1, bookNoWriter);
			assertTrue(checkWriter1 != null);
			assertTrue(checkWriter2 == checkWriter1);
			res.unload();
		} catch (IOException e) {
			throw new StoreTestException("Exception", e);
		}

		// now use a resource to read!
//		try {
//			final Resource res = store.getResource(getQuery4());
//			res.load(Collections.EMPTY_MAP);
//			Iterator it = res.getContents().iterator();
//			while (it.hasNext()) {
//				Book obj = (Book)it.next();
//				if (obj.getAuthor() != null) {
//					assertEquals(obj.eResource(), obj.getAuthor().eResource());
//				}
//			}
//			res.unload();
//		} catch (IOException e) {
//			throw new StoreTestException("Exception", e);
//		}

		try {
			Resource res = store.getResource();
			res.load(Collections.EMPTY_MAP);
			// 1 in case multiple inheritance is not supported
			assertEquals(1, res.getContents().size());
			final Library lib = (Library) res.getContents().get(0);
			assertEquals(2, lib.getBooks().size());
			res.unload();

		} catch (IOException e) {
			throw new StoreTestException("Exception", e);
		}
	}

	/** Returns one test query */
	protected String getQuery1() {
		return "query1=SELECT FROM " + WriterImpl.class.getName() + "&query2=SELECT FROM " + BookImpl.class.getName();
		// "query1=FROM " + Writer.class.getName() + "&query2=FROM " + Book.class.getName()
	}

	/** Returns one test query */
	protected String getQuery2() {
		return "query1=SELECT FROM " + WriterImpl.class.getName();
		// "query1=FROM " + Writer.class.getName();
	}

	/** Returns one test query */
	protected String getQuery3() {
		return "query1=SELECT FROM " + WriterImpl.class.getName() + "&query2=SELECT FROM " + BookImpl.class.getName();
		// "query1=FROM " + Writer.class.getName() + "&query2=FROM " + Book.class.getName();
	}

	/** Returns one test query */
	protected String getQuery4() {
		return "query1=SELECT FROM " + BookImpl.class.getName();
		// "query1=FROM " + Writer.class.getName() + "&query2=FROM " + Book.class.getName();
	}

	/** Container present */
	protected boolean hasContainer(InternalEObject obj) {
		return true;
	}
}
