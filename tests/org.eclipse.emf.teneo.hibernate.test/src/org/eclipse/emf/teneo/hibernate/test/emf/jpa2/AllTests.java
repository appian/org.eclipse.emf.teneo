/**
 * <copyright> Copyright (c) 2012 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AllTests.java,v 1.36 2007/04/17 15:49:55 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.jpa2;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.109 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite(
				"Test for org.eclipse.emf.teneo.hibernate.test.emf.jpa2",
				HibernateTestbed.instance().getConfigurations());
		suite.addTestSuite(CollectionTableAction.class);
		suite.addTestSuite(JPA2AssociationOverrideAction.class);
		suite.addTestSuite(ElementCollectionAction.class);
		suite.addTestSuite(OrderColumnAction.class);
		suite.addTestSuite(MapsIdAction.class);
		suite.addTestSuite(OrphanRemovalAction.class);
		return suite;
	}
}
