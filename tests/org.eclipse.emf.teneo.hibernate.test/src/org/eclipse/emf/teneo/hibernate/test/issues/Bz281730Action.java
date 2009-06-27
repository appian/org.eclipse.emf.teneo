/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Iterator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.HbMapperException;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.issues.library.LibraryPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.mapping.PersistentClass;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1.2.2 $
 */
public class Bz281730Action extends AbstractTestAction {

	public Bz281730Action() {
		super(new EPackage[] { LibraryPackage.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		final HibernateTestStore hts = (HibernateTestStore) store;

		final HbDataStore hds = (HbDataStore) hts.getDataStore();
		for (Iterator<?> it = hds.getHibernateConfiguration().getClassMappings(); it.hasNext();) {
			final PersistentClass pc = (PersistentClass) it.next();
			assertTrue(HbHelper.INSTANCE.getDataStore(pc) != null);
		}
		assertTrue(HbHelper.INSTANCE.getDataStore(hds.getName()) != null);

		HbHelper.INSTANCE.deRegisterDataStore(hds.getName());

		assertTrue(HbHelper.INSTANCE.getDataStore(hds.getName()) == null);
		for (Iterator<?> it = hds.getHibernateConfiguration().getClassMappings(); it.hasNext();) {
			final PersistentClass pc = (PersistentClass) it.next();
			try {
				HbHelper.INSTANCE.getDataStore(pc);
				fail();
			} catch (HbMapperException e) {
				// this is ok
			}
		}
	}
}
