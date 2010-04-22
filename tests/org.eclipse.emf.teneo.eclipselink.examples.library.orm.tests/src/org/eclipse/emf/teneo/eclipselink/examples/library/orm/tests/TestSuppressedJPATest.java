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

import org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesFactory;
import org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test;
import org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.TestEmbedded;

public class TestSuppressedJPATest extends JPATest {

	public TestSuppressedJPATest() {
		super("Suppressed Interface Test");
	}

	@Override
	protected String getPersistenceUnitName() {
		return "library";
	}

	@Override
	protected void cleanDatabase(EntityManager em) {
		// delete does not cascade so order is important
		// em.createQuery("delete from Identifiable o").executeUpdate();
	}

	protected static final SuppressinterfacesFactory factory = SuppressinterfacesFactory.eINSTANCE;

	public void testPersistence() throws Exception {

		beginTransaction();
		createTest();
		commitTransaction();

		beginTransaction();
		final List<?> list = em.createQuery("select e from Identifiable e").getResultList();
		assertEquals(1, list.size());
		final Test test = (Test) list.get(0);

		assertTrue(test.getTestEmbedded() != null);
		assertEquals("name", test.getTestEmbedded().getNameEmbedded());
		commitTransaction();
	}

	protected Test createTest() {
		Test test = factory.createTest();
		test.setName("test");
		TestEmbedded testEmbedded = factory.createTestEmbedded();
		testEmbedded.setNameEmbedded("name");
		test.setTestEmbedded(testEmbedded);
		em.persist(test);
		return test;
	}
}
