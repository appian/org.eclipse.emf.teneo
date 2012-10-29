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
 * $Id: DurationAction.java,v 1.3 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests xsd duration type.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class DurationAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public DurationAction() {
		super(DurationPackage.eINSTANCE);
	}

	/** Creates simple types and tests against */
	@Override
	public void doAction(TestStore store) {
		// test a simple type
		final DurationFactory factory = DurationFactory.eINSTANCE;
		try {
			final DatatypeFactory dtf = DatatypeFactory.newInstance();
			{

				store.beginTransaction();
				for (int i = 0; i < 5; i++) {
					final DurationTest dt = factory.createDurationTest();
					dt.setName(i + "");
					final Duration duration = dtf.newDurationDayTime(true, i, i, i, i);
					dt.setDuration(duration);
					for (int j = 0; j < i; j++) {
						final Duration dur = dtf.newDurationYearMonth(true, j, j);
						dt.getDurations().add(dur);
					}
					store.store(dt);
				}
				store.commitTransaction();
			}
			store.refresh();
			{
				@SuppressWarnings("unchecked")
				final List<DurationTest> durations = (List<DurationTest>) store
						.getObjects(DurationTest.class);
				for (DurationTest dt : durations) {
					final int index = Integer.parseInt(dt.getName());
					final Duration d = dt.getDuration();
					assertEquals(index, d.getDays());
					assertEquals(index, d.getHours());
					assertEquals(index, d.getMinutes());
					assertEquals(index, d.getSeconds());
					assertEquals(0, d.getYears());
					assertEquals(0, d.getMonths());

					for (int j = 0; j < dt.getDurations().size(); j++) {
						final Duration dur = dt.getDurations().get(j);
						assertEquals(j, dur.getYears());
						assertEquals(j, dur.getMonths());
						assertEquals(0, dur.getDays());
						assertEquals(0, dur.getHours());
						assertEquals(0, dur.getMinutes());
						assertEquals(0, dur.getSeconds());
					}
					assertEquals(index, dt.getDurations().size());

				}
			}
		} catch (Exception e) {
			throw new StoreTestException(e.getMessage(), e);
		}
	}
}
