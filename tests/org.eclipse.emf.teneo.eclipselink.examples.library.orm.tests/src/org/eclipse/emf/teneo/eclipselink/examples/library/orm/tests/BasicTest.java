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

import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryFactory;
import org.eclipse.emf.teneo.eclipselink.examples.library.Style;

public class BasicTest extends LibraryJPATest {

	public BasicTest(String name) {
		super(name);
	}

	public void testBasicMapping() throws Exception {
		Style style = LibraryFactory.eINSTANCE.createStyle();
		String expectedStyle = getAnonymousString();
		style.setName(expectedStyle);
		em.getTransaction().begin();
		em.persist(style);
		em.getTransaction().commit();

		Style actualStyle = (Style) em.createQuery("select s from Style s where s.name = :name").setParameter("name",
				expectedStyle).getSingleResult();
		assertEquals("name", expectedStyle, actualStyle.getName());
	}
}
