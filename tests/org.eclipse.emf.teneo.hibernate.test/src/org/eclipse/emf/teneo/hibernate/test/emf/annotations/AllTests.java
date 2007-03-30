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
 * $Id: AllTests.java,v 1.27.2.3 2007/03/30 15:38:17 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.annotations.AssociationOverrideAction;
import org.eclipse.emf.teneo.test.emf.annotations.AttributeOverridesAction;
import org.eclipse.emf.teneo.test.emf.annotations.BasicAction;
import org.eclipse.emf.teneo.test.emf.annotations.BookAction;
import org.eclipse.emf.teneo.test.emf.annotations.CascadeNotallAction;
import org.eclipse.emf.teneo.test.emf.annotations.CompositeIdAction;
import org.eclipse.emf.teneo.test.emf.annotations.DuplicatesAction;
import org.eclipse.emf.teneo.test.emf.annotations.EDataTypeAction;
import org.eclipse.emf.teneo.test.emf.annotations.EmbeddedAction;
import org.eclipse.emf.teneo.test.emf.annotations.EmbeddedIdAction;
import org.eclipse.emf.teneo.test.emf.annotations.IdAction;
import org.eclipse.emf.teneo.test.emf.annotations.IdBagAction;
import org.eclipse.emf.teneo.test.emf.annotations.InheritanceAnnotationAction;
import org.eclipse.emf.teneo.test.emf.annotations.InheritanceAnnotationTablePerClassAction;
import org.eclipse.emf.teneo.test.emf.annotations.LazyLibraryAction;
import org.eclipse.emf.teneo.test.emf.annotations.LobAction;
import org.eclipse.emf.teneo.test.emf.annotations.ManyToManyAction;
import org.eclipse.emf.teneo.test.emf.annotations.MappedSuperClassAction;
import org.eclipse.emf.teneo.test.emf.annotations.PKeyJoinAction;
import org.eclipse.emf.teneo.test.emf.annotations.SecondarytableHibernateAction;
import org.eclipse.emf.teneo.test.emf.annotations.SetAction;
import org.eclipse.emf.teneo.test.emf.annotations.SetNMAction;
import org.eclipse.emf.teneo.test.emf.annotations.SetResourceAction;
import org.eclipse.emf.teneo.test.emf.annotations.ToOneAction;
import org.eclipse.emf.teneo.test.emf.annotations.TransientAction;
import org.eclipse.emf.teneo.test.emf.annotations.UniqueConstraintsAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.27.2.3 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.annotations",
				HibernateTestbed.instance().getConfigurations());

		suite.addTestSuite(UserTypeAction.class);

		suite.addTestSuite(InheritanceAnnotationAction.class);

		suite.addTestSuite(InheritanceAnnotationTablePerClassAction.class);
		
		suite.addTestSuite(UniqueConstraintsAction.class);

		suite.addTestSuite(SetAction.class);
		suite.addTestSuite(SetNMAction.class);
		
		suite.addTestSuite(IdAction.class);

		suite.addTestSuite(MappedSuperClassAction.class);

		suite.addTestSuite(CascadeNotallAction.class);

		suite.addTestSuite(ManyToManyAction.class);

		suite.addTestSuite(ToOneAction.class);

		suite.addTestSuite(IdBagAction.class);

		suite.addTestSuite(HbIdAction.class);

		suite.addTestSuite(JoinColumnsTest.class);

		suite.addTestSuite(DuplicatesAction.class);

		suite.addTestSuite(LazyLibraryAction.class);

		suite.addTestSuite(BookAction.class);

		suite.addTestSuite(EDataTypeAction.class);

		suite.addTestSuite(SecondarytableHibernateAction.class);
		suite.addTestSuite(AssociationOverrideAction.class);		

		suite.addTestSuite(TransientAction.class);
		suite.addTestSuite(BasicAction.class);

		suite.addTestSuite(CompositeIdAction.class);
		suite.addTestSuite(PKeyJoinAction.class);

		suite.addTestSuite(EmbeddedAction.class);

		suite.addTestSuite(SetResourceAction.class);
		suite.addTestSuite(AttributeOverridesAction.class);
		suite.addTestSuite(LobAction.class);
		suite.addTestSuite(EmbeddedIdAction.class);

		return suite;
	}

}
