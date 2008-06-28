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
 * $Id: ToOneAction.java,v 1.6 2008/06/28 22:41:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.toone.Address;
import org.eclipse.emf.teneo.samples.emf.annotations.toone.Arm;
import org.eclipse.emf.teneo.samples.emf.annotations.toone.Head;
import org.eclipse.emf.teneo.samples.emf.annotations.toone.Person;
import org.eclipse.emf.teneo.samples.emf.annotations.toone.TooneFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.toone.ToonePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class ToOneAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public ToOneAction() {
		super(ToonePackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final TooneFactory factory = TooneFactory.eINSTANCE;

		{
			store.beginTransaction();
			final Arm arm = factory.createArm();
			arm.setLength(50);
			final Address a = factory.createAddress();
			a.setCity("Amersfoort");
			final Person p = factory.createPerson();
			final Head h = factory.createHead();
			h.setHairColor("braun");

			p.setAddress(a);
			p.setHead(h);
			p.setLeftArm(arm);
			store.store(arm);
			store.store(p);
			store.commitTransaction();
		}

		// read back and check it
		{
			store.beginTransaction();
			final Person p = store.getObject(Person.class);
			store.deleteObject(p);
			store.commitTransaction();
		}

		store.checkNumber(Person.class, 0);
		store.checkNumber(Head.class, 0);
		store.checkNumber(Address.class, 1);
		store.checkNumber(Arm.class, 1);
	}
}