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
 * $Id: EAVCascadeDeleteAction.java,v 1.1 2009/09/11 15:00:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import javax.persistence.RollbackException;

import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.City;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Library;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Pen;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.JDBCException;

/**
 * Tests cascading deletes between EAV and non EAV mapped entities.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class EAVCascadeDeleteAction extends AbstractTestAction {

	public EAVCascadeDeleteAction() {
		super(EavlibraryPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		// cascade delete from eav to non-eav to eav
		{
			store.beginTransaction();
			createStoreTestSet(store, "prefix1", true);
			store.commitTransaction();
		}
		{
			final Library l = store.getObject(Library.class);
			store.beginTransaction();
			store.checkNumber(Library.class, 1);
			store.checkNumber(Writer.class, 2);
			store.checkNumber(Pen.class, 4);

			store.deleteObject(l);
			store.commitTransaction();

			store.beginTransaction();
			store.checkNumber(Library.class, 0);
			store.checkNumber(Writer.class, 0);
			store.checkNumber(Pen.class, 0);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			createStoreTestSet(store, "prefix1", false);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			store.checkNumber(Writer.class, 2);
			store.checkNumber(Pen.class, 4);
			for (Writer w : store.getObjects(Writer.class)) {
				store.deleteObject(w);
			}
			store.commitTransaction();
			store.beginTransaction();
			store.checkNumber(Writer.class, 0);
			store.checkNumber(Pen.class, 0);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			createStoreTestSet(store, "prefix1", true);
			store.commitTransaction();
		}

		// check if the delete constraint works fine
		{
			store.beginTransaction();
			store.checkNumber(Library.class, 1);
			store.checkNumber(Writer.class, 2);
			store.checkNumber(Pen.class, 4);
			for (Writer w : store.getObjects(Writer.class)) {
				store.deleteObject(w);
			}
			try {
				store.commitTransaction();
				fail("Delete constraint not working");
			} catch (JDBCException e) {
				// perfect

			} catch (RollbackException e) {
				// perfect
			}
		}
	}

	/** Create test set */
	private void createStoreTestSet(TestStore store, String prefix, boolean withLibrary) {
		final EavlibraryFactory factory = EavlibraryFactory.eINSTANCE;
		final City c = factory.createCity();
		c.setName(prefix + "c");
		store.store(c);

		final Library l = factory.createLibrary();
		l.setName(prefix);

		final Writer w1 = factory.createWriter();
		w1.setName(prefix + "w1");
		w1.setCity(c);

		final Pen p1 = factory.createPen();
		p1.setName(prefix + "p1");
		final Pen p2 = factory.createPen();
		p2.setName(prefix + "p2");
		w1.getPens().add(p1);
		w1.getPens().add(p2);

		final Writer w2 = factory.createWriter();
		w2.setName(prefix + "w2");
		w2.setCity(c);
		final Pen p3 = factory.createPen();
		p3.setName(prefix + "p3");
		final Pen p4 = factory.createPen();
		p4.setName(prefix + "p4");
		w2.getPens().add(p3);
		w2.getPens().add(p4);

		if (withLibrary) {
			l.getWriters().add(w1);
			l.getWriters().add(w2);
			store.store(l);
		} else {
			store.store(w1);
			store.store(w2);
		}
	}

}
