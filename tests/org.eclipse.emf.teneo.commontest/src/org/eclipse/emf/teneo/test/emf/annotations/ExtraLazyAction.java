/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * LazyLibraryAction.java,v 1.9 2007/03/29 15:00:32 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.samples.emf.annotations.extralazy.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.extralazy.ExtralazyFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.extralazy.ExtralazyPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.extralazy.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests extra lazy fetch strategy.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class ExtraLazyAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public ExtraLazyAction() {
		super(ExtralazyPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final ExtralazyFactory factory = ExtralazyFactory.eINSTANCE;
		{
			Book b = factory.createBook();
			b.setTitle("book1");
			Writer w1 = factory.createWriter();
			w1.setName("name0");
			b.getAuthors().add(w1);
			Writer w2 = factory.createWriter();
			w2.setName("name1");
			b.getAuthors().add(w2);
			Writer w3 = factory.createWriter();
			w3.setName("name2");
			b.getAuthors().add(w3);
			store.beginTransaction();
			store.store(b);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			Book b = store.getObject(Book.class);
			final PersistableDelegateList<?> pList = (PersistableDelegateList<?>) b.getAuthors();
			assertFalse(pList.isInitialized());
			for (int i = 0; i < b.getAuthors().size(); i++) {
				assertFalse(pList.isInitialized());
				assertEquals(b.getAuthors().get(i).getName(), "name" + i);
			}
			assertFalse(pList.isInitialized());
			b.getAuthors().remove(2);
			assertTrue(pList.isInitialized());
			int i = 0;
			for (Writer writer : b.getAuthors()) {
				assertEquals(writer.getName(), "name" + i);
				i++;
			}
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			Book b = store.getObject(Book.class);
			final PersistableDelegateList<?> pList = (PersistableDelegateList<?>) b.getAuthors();
			assertFalse(pList.isInitialized());
			Writer w = factory.createWriter();
			w.setName("name3");
			b.getAuthors().add(w);
			assertTrue(pList.isInitialized());
			store.store(b);
			store.commitTransaction();
		}
	}
}