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
 * $Id: BasicAction.java,v 1.4 2008/02/28 07:08:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.basic.Basic;
import org.eclipse.emf.teneo.samples.emf.annotations.basic.BasicFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.basic.BasicPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class BasicAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public BasicAction() {
		super(BasicPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final BasicFactory factory = BasicFactory.eINSTANCE;
		{
			store.beginTransaction();

			final Basic basic = factory.createBasic();
			// do not set optional as it is optional
			// basic.setMyOptionalBasic("optional");
			basic.setMyTransient("transient");
			basic.setMyVersion(100);
			store.store(basic);
			store.commitTransaction();
		}

		// read back and check it
		{
			store.beginTransaction();
			final Basic basic = (Basic) store.getObject(Basic.class);
			assertTrue("Transient field should not be set", basic.getMyTransient() == null);
			store.commitTransaction();
		}
	}
}