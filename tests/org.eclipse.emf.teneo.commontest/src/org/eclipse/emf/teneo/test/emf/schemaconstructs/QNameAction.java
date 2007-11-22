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
 * $Id: QNameAction.java,v 1.2 2007/11/22 11:42:50 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import javax.xml.namespace.QName;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.qname.Mytest;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.qname.QnameFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.qname.QnamePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Simple test for: qname
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class QNameAction extends AbstractTestAction {

	/** The number of test objects created */
	private static final int NO_TEST_OBJECTS = 5;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public QNameAction() {
		super(QnamePackage.eINSTANCE);
	}

	/** Creates simple types and tests against */
	@Override
	public void doAction(TestStore store) {
		final QnameFactory factory = QnameFactory.eINSTANCE;

		// store an all type
		{
			store.beginTransaction();
			Mytest mytest = factory.createMytest();
			mytest.setDescription("test");
			for (int i = 0; i < NO_TEST_OBJECTS; i++) {
				QName qName = new QName("http://www.elver.org/" + i, "local" + i, "prefix" + i);
				mytest.getNames().add(qName);
			}
			mytest.setName(new QName("http://www.springsite.com", "name", "e"));
			store.store(mytest);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final Mytest mytest = store.getObject(Mytest.class);
			assertEquals(mytest.getNames().size(), NO_TEST_OBJECTS);
			for (int i = 0; i < NO_TEST_OBJECTS; i++) {
				final QName qName = mytest.getNames().get(i);
				assertEquals(qName.getNamespaceURI(), "http://www.elver.org/" + i);
				assertEquals(qName.getLocalPart(), "local" + i);
				assertEquals(qName.getPrefix(), "prefix" + i);
			}
			assertEquals(mytest.getName().getNamespaceURI(), "http://www.springsite.com");
			assertEquals(mytest.getName().getLocalPart(), "name");
			assertEquals(mytest.getName().getPrefix(), "e");
			store.commitTransaction();
		}
	}
}