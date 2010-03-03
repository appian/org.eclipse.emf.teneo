/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright> 
 *
 * $Id: Dynamic.java,v 1.4 2010/03/03 13:26:20 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.examples;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Book;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.BookCategory;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryFactory;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Writer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Dynamic Tutorial
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class Dynamic {

	/** The main method */
	public static void main(String[] args) {

		// first do the quick start with the correct dbname
		HbDataStore hbds = QuickStart.doQuickStart("DynamicLibrary");

		final EcoreFactory efactory = EcoreFactory.eINSTANCE;
		final EcorePackage epackage = EcorePackage.eINSTANCE;

		// This tutorial will create a new type of book which inherits from the
		// standard
		// Book

		// create the SchoolBook EClass
		EClass schoolBookEClass = efactory.createEClass();
		schoolBookEClass.setName("SchoolBook");

		// create a new attribute for this EClass
		EAttribute level = efactory.createEAttribute();
		level.setName("level");
		level.setEType(epackage.getEInt());
		schoolBookEClass.getEStructuralFeatures().add(level);

		// Set the supertype of SchoolBook to the Book
		schoolBookEClass.getESuperTypes().add(ExtlibraryPackage.eINSTANCE.getBook());

		// create a course
		EClass courseEClass = efactory.createEClass();
		courseEClass.setName("Course");

		// give the Course a name
		EAttribute courseName = efactory.createEAttribute();
		courseName.setName("courseName");
		courseName.setEType(epackage.getEString());
		courseEClass.getEStructuralFeatures().add(courseName);

		// A course always uses one SchoolBook
		EReference courseBook = efactory.createEReference();
		courseBook.setName("courseBook");
		courseBook.setEType(schoolBookEClass);
		courseBook.setContainment(false);
		courseEClass.getEStructuralFeatures().add(courseBook);

		// Create a new EPackage and add the new EClasses
		EPackage schoolPackage = efactory.createEPackage();
		schoolPackage.setName("elv");
		schoolPackage.setNsPrefix("elv");
		schoolPackage.setNsURI("http:///www.elver.org/School");
		schoolPackage.getEClassifiers().add(courseEClass);
		schoolPackage.getEClassifiers().add(schoolBookEClass);
		EPackage.Registry.INSTANCE.put(schoolPackage.getNsURI(), schoolPackage);

		// Now reset the epackages in the datastore
		hbds.setEPackages(new EPackage[] { ExtlibraryPackage.eINSTANCE, schoolPackage });

		// recreate the database
		hbds.initialize();

		// print the hibernate.hbm.xml for demo purposes
		System.err.println(hbds.getMappingXML());

		// Now create an author, is used below
		Writer writer = ExtlibraryFactory.eINSTANCE.createWriter();
		writer.setName("Teacher");

		// now create a schoolBook
		// NOTE: because schoolBook inherits from Book, the create method will
		// return a Book
		Book bk = (Book) schoolPackage.getEFactoryInstance().create(schoolBookEClass);
		bk.setAuthor(writer);
		bk.setTitle("Biografie van Multatuli");
		bk.setCategory(BookCategory.BIOGRAPHY);
		bk.setPages(500);
		bk.eSet(level, new Integer(1));

		// and create a course
		EObject course = schoolPackage.getEFactoryInstance().create(courseEClass);
		course.eSet(courseName, "Dutch Literature Level 1");
		course.eSet(courseBook, bk);

		final SessionFactory sessionFactory = hbds.getSessionFactory();

		// now persist them all

		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		session.save(bk);
		session.save(writer);
		session.save(course);
		tx.commit();

		// Now query for the books, at least one of them should be a SchoolBook
		tx.begin();
		Query qry = session.createQuery("from Book");
		List<?> list = qry.list();
		Book schoolBook = null;
		for (Iterator<?> it = list.iterator(); it.hasNext();) {
			Book book = (Book) it.next();
			if (book.eClass() == schoolBookEClass) {
				if (schoolBook != null) {
					throw new Error("More than one schoolbook? Was the database not empty?");
				}
				schoolBook = book;
			}
		}
		if (schoolBook == null) {
			throw new Error("No schoolbook??");
		}

		// now query for all courses the right name
		qry = session.createQuery("from Course where courseName='Dutch Literature Level 1'");
		list = qry.list();
		EObject eobject = (EObject) list.get(0);
		if (eobject.eClass() != courseEClass) {
			throw new Error("No Course?");
		}
		// the schoolBook should be the book of the course
		Book courseBk = (Book) eobject.eGet(courseBook);
		if (courseBk != schoolBook) {
			throw new Error("No schoolbook?");
		}
		// and the dynamic feature level should be 1
		if (((Integer) courseBk.eGet(level)).intValue() != 1) {
			throw new Error("Incorrect level?");
		}

		tx.commit();
		session.close();

		URI uri1 = URI.createURI("hibernate://?dsname=Library&query1=FROM Course");
		Resource res1 = new ResourceSetImpl().createResource(uri1);
		try {
			res1.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		eobject = res1.getContents().get(0);
		ChangeRecorder cr = new ChangeRecorder(res1);
		eobject.eSet(courseName, "English 1");
		System.out.println(eobject);

		ChangeDescription changeDescription = cr.endRecording();

		EMap<EObject, EList<FeatureChange>> objectChanges = changeDescription.getObjectChanges();
		System.out.println("change size: " + objectChanges.size());
		course.eSet(courseName, "Dutch Literature Level 1");
	}
}
