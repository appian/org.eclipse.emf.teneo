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
 * $Id: AllGenerateTests.java,v 1.3 2006/08/31 23:47:14 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.annotations;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.jpox.test.generate.JPOXGenerateTest;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.annotations.BasicAction;
import org.eclipse.emf.teneo.test.emf.annotations.BookAction;
import org.eclipse.emf.teneo.test.emf.annotations.CascadeNotallAction;
import org.eclipse.emf.teneo.test.emf.annotations.CompositeIdAction;
import org.eclipse.emf.teneo.test.emf.annotations.DuplicatesAction;
import org.eclipse.emf.teneo.test.emf.annotations.IdAction;
import org.eclipse.emf.teneo.test.emf.annotations.InheritanceAnnotationAction;
import org.eclipse.emf.teneo.test.emf.annotations.JoinColumnsAction;
import org.eclipse.emf.teneo.test.emf.annotations.LazyLibraryAction;
import org.eclipse.emf.teneo.test.emf.annotations.LobAction;
import org.eclipse.emf.teneo.test.emf.annotations.ManyToManyAction;
import org.eclipse.emf.teneo.test.emf.annotations.MappedSuperClassAction;
import org.eclipse.emf.teneo.test.emf.annotations.SecondaryTableActionJDO;
import org.eclipse.emf.teneo.test.emf.annotations.SetAction;
import org.eclipse.emf.teneo.test.emf.annotations.SetNMAction;
import org.eclipse.emf.teneo.test.emf.annotations.SetResourceAction;
import org.eclipse.emf.teneo.test.emf.annotations.ToOneAction;
import org.eclipse.emf.teneo.test.emf.annotations.UniqueConstraintsAction;

/**
 * All generate tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class AllGenerateTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.annotations",
				JPOXTestbed.instance().getConfigurations());

		suite.addTest(new JPOXGenerateTest(SecondaryTableActionJDO.class));
		suite.addTest(new JPOXGenerateTest(LobAction.class));
		suite.addTest(new JPOXGenerateTest(JoinColumnsAction.class));
		suite.addTest(new JPOXGenerateTest(CascadeNotallAction.class));
		suite.addTest(new JPOXGenerateTest(CompositeIdAction.class));
		suite.addTest(new JPOXGenerateTest(ToOneAction.class));
		suite.addTest(new JPOXGenerateTest(LazyLibraryAction.class));
		suite.addTest(new JPOXGenerateTest(ManyToManyAction.class));
		suite.addTest(new JPOXGenerateTest(UniqueConstraintsAction.class));

		suite.addTest(new JPOXGenerateTest(MappedSuperClassAction.class));
		suite.addTest(new JPOXGenerateTest(BasicAction.class));
		suite.addTest(new JPOXGenerateTest(BookAction.class));
		suite.addTest(new JPOXGenerateTest(InheritanceAnnotationAction.class));
		suite.addTest(new JPOXGenerateTest(IdAction.class));
		suite.addTest(new JPOXGenerateTest(DuplicatesAction.class));
		suite.addTest(new JPOXGenerateTest(SetNMAction.class));
		suite.addTest(new JPOXGenerateTest(SetResourceAction.class));
		suite.addTest(new JPOXGenerateTest(SetAction.class));
		
		// fails because of jpox bug, see: http://www.jpox.org/servlet/jira/browse/CORE-2567
		// suite.addTest(new JPOXGenerateTest(EmbeddedAction.class));
		// suite.addTest(new JPOXGenerateTest(AttributeOverridesAction.class));
		// not supported by jpox
		return suite;
	}

}
