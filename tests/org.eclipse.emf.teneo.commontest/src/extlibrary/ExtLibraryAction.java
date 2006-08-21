/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: ExtLibraryAction.java,v 1.3 2006/08/21 11:31:55 mtaal Exp $
 */

package extlibrary;

import java.util.Date;

import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the extlibrary
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class ExtLibraryAction extends AbstractTestAction {
	
	/**
	 * Constructor
	 */
	public ExtLibraryAction() {
		super(ExtlibraryPackage.eINSTANCE);
	}

	/** Test */
	public void doAction(TestStore store) {
		final ExtlibraryFactory factory = ExtlibraryFactory.eINSTANCE;
		store.beginTransaction();
		final Writer wr = factory.createWriter();
		wr.setAddress("authorstreet");
		wr.setFirstName("John");
		wr.setLastName("Smith");
		wr.setName("Smith, John");
		final Book bk = factory.createBook();
		bk.setAuthor(wr);
		bk.setCategory(BookCategory.BIOGRAPHY_LITERAL);
		bk.setCopies(4);
		bk.setPages(100);
		bk.setPublicationDate(new Date());
		bk.setTitle("title");
		
		final Library lb2 = factory.createLibrary();
		lb2.setAddress("main street");
		lb2.setName("parent");

		final Library lb = factory.createLibrary();
		lb.setAddress("street");
		lb.setName("myname");
		lb.getBooks().add(bk);
		lb.getWriters().add(wr);
		lb.setParentBranch(lb2);
		
		final Employee em = factory.createEmployee();
		em.setAddress("employee street 4");
		em.setFirstName("martin");
		em.setLastName("taal");

		final Employee manager = factory.createEmployee();
		manager.setAddress("manager street 2");
		manager.setFirstName("John");
		manager.setLastName("the Boss");
		
		em.setManager(manager);
		
		lb.getEmployees().add(em);
		lb.getEmployees().add(manager);
		
		final Borrower bw = factory.createBorrower();
		bw.getBorrowed().add(bk);
		bw.setAddress("borrowstreet");
		bw.setFirstName("Jane");
		bw.setLastName("Smith");
		lb.getBorrowers().add(bw);
		
		store.store(lb);
		store.commitTransaction();
		
		store.beginTransaction();
		Lendable lendable = (Lendable)store.query("select from extlibrary.Lendable").get(0);
		assertTrue(lendable != null);
		store.commitTransaction();
	}
}
