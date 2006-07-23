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
 * $Id: AllGenerateTests.java,v 1.3 2006/07/23 19:28:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.relation;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.jpox.test.generate.JPOXGenerateTest;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.relation.Relation1to1Action;
import org.eclipse.emf.teneo.test.emf.relation.Relation1tonAction;
import org.eclipse.emf.teneo.test.emf.relation.RelationntomAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class AllGenerateTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.samples.emf.detach", JPOXTestbed.instance()
				.getConfigurations());

		suite.addTest(new JPOXGenerateTest(Relation1to1Action.class));
		suite.addTest(new JPOXGenerateTest(Relation1tonAction.class));
		suite.addTest(new JPOXGenerateTest(RelationntomAction.class));
		return suite;
	}
}
