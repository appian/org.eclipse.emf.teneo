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
 * $Id: AllTests.java,v 1.5 2006/09/06 21:59:07 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.annotations;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.annotations.BasicAction;
import org.eclipse.emf.teneo.test.emf.annotations.BookAction;
import org.eclipse.emf.teneo.test.emf.annotations.CascadeNotallAction;
import org.eclipse.emf.teneo.test.emf.annotations.CompositeIdAction;
import org.eclipse.emf.teneo.test.emf.annotations.DuplicatesAction;
import org.eclipse.emf.teneo.test.emf.annotations.EDataTypeAction;
import org.eclipse.emf.teneo.test.emf.annotations.IdAction;
import org.eclipse.emf.teneo.test.emf.annotations.InheritanceAnnotationAction;
import org.eclipse.emf.teneo.test.emf.annotations.LazyLibraryAction;
import org.eclipse.emf.teneo.test.emf.annotations.LobAction;
import org.eclipse.emf.teneo.test.emf.annotations.ManyToManyAction;
import org.eclipse.emf.teneo.test.emf.annotations.MappedSuperClassAction;
import org.eclipse.emf.teneo.test.emf.annotations.SecondaryTableActionJDO;
import org.eclipse.emf.teneo.test.emf.annotations.SetNMAction;
import org.eclipse.emf.teneo.test.emf.annotations.SetResourceAction;
import org.eclipse.emf.teneo.test.emf.annotations.ToOneAction;
import org.eclipse.emf.teneo.test.emf.annotations.UniqueConstraintsAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.annotations",
				JPOXTestbed.instance().getConfigurations());
		suite.addTestSuite(EDataTypeAction.class);

		suite.addTestSuite(SecondaryTableActionJDO.class);
		suite.addTestSuite(CascadeNotallAction.class);

		suite.addTestSuite(DuplicatesAction.class);

		suite.addTestSuite(BookAction.class);
		suite.addTestSuite(MappedSuperClassAction.class);

		suite.addTestSuite(LobAction.class);
		suite.addTestSuite(CompositeIdAction.class);

		suite.addTestSuite(UniqueConstraintsAction.class);
		suite.addTestSuite(ToOneAction.class);
		suite.addTestSuite(BasicAction.class);
		suite.addTestSuite(InheritanceAnnotationAction.class);
		suite.addTestSuite(LazyLibraryAction.class);
		suite.addTestSuite(IdAction.class);
		suite.addTestSuite(SetNMAction.class);
		suite.addTestSuite(SetResourceAction.class);
		suite.addTestSuite(ManyToManyAction.class);

		/*
		 *  // fails because of jpox bug, see: http://www.jpox.org/servlet/jira/browse/CORE-2567
		 * suite.addTestSuite(EmbeddedAction.class); suite.addTestSuite(AttributeOverridesAction.class); // set is not
		 * supported by jpox suite.addTestSuite(SetAction.class);
		 * 
		 * JoinColumns is not supported by jpox suite.addTestSuite(JoinColumnsAction.class);
		 * 
		 */
		return suite;
	}

}
