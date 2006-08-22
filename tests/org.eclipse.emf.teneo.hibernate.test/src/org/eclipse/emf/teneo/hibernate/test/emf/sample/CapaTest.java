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
 * $Id: CapaTest.java,v 1.3 2006/08/22 22:25:46 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.emf.sample.capa.CapaFactory;
import org.eclipse.emf.teneo.samples.emf.sample.capa.MachineList;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.CapaAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.Session;

/**
 * Tests the capa sample to reattach an object
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class CapaTest extends AbstractActionTest {

	private static CapaAction testAction = new CapaAction() {
		
		/** Reattach machinelist and check */
		protected void checkReAttach(CapaFactory factory, TestStore store, MachineList ml) {
			final HibernateTestStore hts = (HibernateTestStore)store;
			hts.refresh();
			hts.beginTransaction();
			final Session sess = hts.getSession();
			sess.update(ml);
	        ml.getMachines().add(getNewMachine(factory, "test"));
			
			//ml.getMachines().add(getNewMachine(factory, "id4"));
			hts.commitTransaction();
		}

	};

	public CapaTest() {
		super(testAction);
	}
}
