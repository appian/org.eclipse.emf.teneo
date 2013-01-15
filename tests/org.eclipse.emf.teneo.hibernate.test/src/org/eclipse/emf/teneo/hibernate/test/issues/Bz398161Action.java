/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import javax.persistence.PersistenceException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Factory;
import org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Package;
import org.eclipse.emf.teneo.samples.issues.bz398161.RefOne;
import org.eclipse.emf.teneo.samples.issues.bz398161.RefTwo;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.tool.hbm2ddl.SchemaValidator;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz398161Action extends AbstractTestAction {

	private Bz398161Factory factory = Bz398161Factory.eINSTANCE;

	public Bz398161Action() {
		super(new EPackage[] { Bz398161Package.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			RefOne refOne = factory.createRefOne();
			RefTwo refTwo = factory.createRefTwo();
			refOne.setRefTwo(refTwo);
			refTwo.setNumber("abc");
			store.store(refTwo);
			store.store(refOne);
			store.commitTransaction();
		}
		{
			// the not-null in the columndefinition is applied correctly
			try {
				store.beginTransaction();
				RefOne refOne = factory.createRefOne();
				store.store(refOne);
				store.commitTransaction();
				fail();
			} catch (PersistenceException e) {
				assertTrue(e.getCause() instanceof ConstraintViolationException);
			} catch (ConstraintViolationException e) {
			}
		}

		// validate the schema
		final HibernateTestStore hbStore = (HibernateTestStore) store;
		SchemaValidator validator = new SchemaValidator(hbStore.getEmfDataStore()
				.getHibernateConfiguration());
		validator.validate();
	}
}
