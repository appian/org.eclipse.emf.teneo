/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AllTests.java,v 1.10 2010/02/15 05:20:06 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test;

import org.eclipse.emf.teneo.hibernate.test.emf.annotations.AnyAction;
import org.eclipse.emf.teneo.hibernate.test.emf.annotations.BZ290969Action;
import org.eclipse.emf.teneo.hibernate.test.emf.annotations.EAVCascadeDeleteAction;
import org.eclipse.emf.teneo.hibernate.test.emf.annotations.EAVMappingAction;
import org.eclipse.emf.teneo.hibernate.test.emf.annotations.EAVMappingAllAction;
import org.eclipse.emf.teneo.hibernate.test.emf.annotations.EMapEAVAction;
import org.eclipse.emf.teneo.hibernate.test.emf.annotations.HbIdAction;
import org.eclipse.emf.teneo.hibernate.test.emf.annotations.HbSequenceIdAction;
import org.eclipse.emf.teneo.hibernate.test.emf.annotations.HibernateAction;
import org.eclipse.emf.teneo.hibernate.test.emf.annotations.IdTypeTestOneAction;
import org.eclipse.emf.teneo.hibernate.test.emf.annotations.JoinColumnsTest;
import org.eclipse.emf.teneo.hibernate.test.emf.annotations.UserTypeAction;
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
import org.eclipse.emf.teneo.test.emf.annotations.EntityAction;
import org.eclipse.emf.teneo.test.emf.annotations.ExternalAction;
import org.eclipse.emf.teneo.test.emf.annotations.ExtraLazyAction;
import org.eclipse.emf.teneo.test.emf.annotations.ForcedIdBagAction;
import org.eclipse.emf.teneo.test.emf.annotations.HbMapKeysAction;
import org.eclipse.emf.teneo.test.emf.annotations.IdAction;
import org.eclipse.emf.teneo.test.emf.annotations.IdBagAction;
import org.eclipse.emf.teneo.test.emf.annotations.InheritanceAnnotationAction;
import org.eclipse.emf.teneo.test.emf.annotations.InheritanceAnnotationTablePerClassAction;
import org.eclipse.emf.teneo.test.emf.annotations.IntegerDiscriminatorAction;
import org.eclipse.emf.teneo.test.emf.annotations.LazyLibraryAction;
import org.eclipse.emf.teneo.test.emf.annotations.LobAction;
import org.eclipse.emf.teneo.test.emf.annotations.ManyToManyAction;
import org.eclipse.emf.teneo.test.emf.annotations.MapKeyAction;
import org.eclipse.emf.teneo.test.emf.annotations.MappedSuperClassAction;
import org.eclipse.emf.teneo.test.emf.annotations.NaturalIdAction;
import org.eclipse.emf.teneo.test.emf.annotations.OnetoonePKAction;
import org.eclipse.emf.teneo.test.emf.annotations.OverrideSecondaryAction;
import org.eclipse.emf.teneo.test.emf.annotations.PKeyJoinAction;
import org.eclipse.emf.teneo.test.emf.annotations.SecondarytableHibernateAction;
import org.eclipse.emf.teneo.test.emf.annotations.SetAction;
import org.eclipse.emf.teneo.test.emf.annotations.SetNMAction;
import org.eclipse.emf.teneo.test.emf.annotations.SetResourceAction;
import org.eclipse.emf.teneo.test.emf.annotations.ToOneAction;
import org.eclipse.emf.teneo.test.emf.annotations.TransientAction;
import org.eclipse.emf.teneo.test.emf.annotations.UniqueConstraintsAction;
import org.eclipse.emf.teneo.test.emf.annotations.VariousAction;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Runs all hibernate tests.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.10 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("All tests for hibernate");
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.sample.AllTests
				.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.detach.AllTests
				.suite());
		suite
				.addTest(org.eclipse.emf.teneo.hibernate.test.emf.annotations.AllTests
						.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.elist.AllTests
				.suite());
		suite
				.addTest(org.eclipse.emf.teneo.hibernate.test.emf.relation.AllTests
						.suite());
		suite
				.addTest(org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs.AllTests
						.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.issues.AllTests
				.suite());
		return suite;
	}
}
