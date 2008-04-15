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

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"ListTest for org.eclipse.emf.teneo.eclipselink.examples.library");
		//$JUnit-BEGIN$
		suite.addTestSuite(EObjectTest.class);
		suite.addTestSuite(TypeWriterTypeTest.class);
		suite.addTestSuite(LibWriterEContainerTest.class);
		suite.addTestSuite(OneToOneTest.class);
		suite.addTestSuite(LibBookEContainerTest.class);
		suite.addTestSuite(WriterTypewriterTest.class);
		suite.addTestSuite(LibraryEnvironmentTest.class);
		suite.addTestSuite(ContainerTest.class);
		suite.addTestSuite(BookCoverTest.class);
		suite.addTestSuite(LibraryEContainerLibraryTest.class);
		suite.addTestSuite(EMapTest.class);
		suite.addTestSuite(EListEMapTest.class);
		suite.addTestSuite(BasicTest.class);
		suite.addTestSuite(LibraryEContainerTest.class);
		suite.addTestSuite(BookTranslatorTest.class);
		suite.addTestSuite(LibraryXMIPersistenceTest.class);
		suite.addTestSuite(WriterAddressTest.class);
		suite.addTestSuite(EListTest.class);
		suite.addTestSuite(WriterPublisherTest.class);
		suite.addTestSuite(PublisherWriterTest.class);
		suite.addTestSuite(EContainerReferenceTest.class);
		suite.addTestSuite(BookStylesTest.class);
		//$JUnit-END$
		return suite;
	}

}