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
 * $Id: CapaAction.java,v 1.5 2008/02/28 07:08:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.teneo.samples.emf.sample.capa.CapaFactory;
import org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage;
import org.eclipse.emf.teneo.samples.emf.sample.capa.Machine;
import org.eclipse.emf.teneo.samples.emf.sample.capa.MachineList;
import org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay;
import org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the capa, detach and update
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class CapaAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public CapaAction() {
		super(CapaPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	@SuppressWarnings("unchecked")
	public void doAction(TestStore store) {
		final CapaFactory factory = CapaFactory.eINSTANCE;
		MachineList ml = factory.createMachineList();
		{
			store.beginTransaction();
			Machine m = getNewMachine(factory, "id0");
			WorkWeek ww = factory.createWorkWeek();
			ww.getDays().add(factory.createWorkDay());
			ww.getDays().add(factory.createWorkDay());
			ww.getDays().add(factory.createWorkDay());
			ww.getDays().add(factory.createWorkDay());
			ww.getDays().add(factory.createWorkDay());
			ww.getDays().add(factory.createWorkDay());
			ww.getDays().add(factory.createWorkDay());
			m.setWorkWeek(ww);
			ml.getMachines().add(m);
			store.store(ml);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			ml = (MachineList) store.getObject(MachineList.class);
			store.commitTransaction();
		}

		checkReAttach(factory, store, ml);
	}

	/** Creates a machine */
	@SuppressWarnings("unchecked")
	protected Machine getNewMachine(CapaFactory factory, String id) {
		final Machine m = factory.createMachine();
		final WorkWeek wk = factory.createWorkWeek();
		wk.getDays().addAll(getWorkDays(factory));
		m.setWorkWeek(wk);
		m.setMachineId(id);
		// m.setMachineSearchString("search");
		// m.setTaskSearchString("tss");
		return m;
	}

	/** Returns a list of workdays */
	private List<WorkDay> getWorkDays(CapaFactory factory) {
		final ArrayList<WorkDay> list = new ArrayList<WorkDay>();
		for (int i = 1; i < 8; i++) {
			final WorkDay wd = factory.createWorkDay();
			// wd.setDayOfWeek(i);
			// wd.setDuration(8);
			// wd.setStartTime(8);
			list.add(wd);
		}
		return list;
	}

	/** Reattach machinelist and check */
	protected void checkReAttach(CapaFactory factory, TestStore store, MachineList ml) {

	}
}
