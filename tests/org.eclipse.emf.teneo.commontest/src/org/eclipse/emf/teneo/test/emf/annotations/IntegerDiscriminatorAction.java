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
 * $Id: IntegerDiscriminatorAction.java,v 1.1 2008/06/10 06:44:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.IntegerdiscriminatorFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.IntegerdiscriminatorPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.OtherSub;
import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.Sub;
import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.Super;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for integer discriminator, see bugzilla:
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=235945
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class IntegerDiscriminatorAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public IntegerDiscriminatorAction() {
		super(IntegerdiscriminatorPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final IntegerdiscriminatorFactory factory = IntegerdiscriminatorFactory.eINSTANCE;
		{
			store.beginTransaction();

			final Super sup1 = factory.createSuper();
			sup1.setName("test1");
			final Super sup2 = factory.createSuper();
			sup2.setName("test2");
			final Sub sub = factory.createSub();
			sub.setName("sub");
			final OtherSub oSub = factory.createOtherSub();
			oSub.setName("osub");
			store.store(sup1);
			store.store(sup2);
			store.store(sub);
			store.store(oSub);
			store.commitTransaction();
		}

		// read back and check it
		{
			store.beginTransaction();
			// note 4 because polymorphic so the Sub and OtherSub count as a Sup
			store.checkNumber(Super.class, 4);
			store.checkNumber(Sub.class, 1);
			store.checkNumber(OtherSub.class, 1);
			store.commitTransaction();
		}
	}
}