/**
 * <copyright>
 *
 * Copyright (c) 2011 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: Bz336501Action.java,v 1.1 2011/02/21 05:47:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.bz336501.Bz336501Factory;
import org.eclipse.emf.teneo.samples.issues.bz336501.Bz336501Package;
import org.eclipse.emf.teneo.samples.issues.bz336501.Test;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the solution of https://bugs.eclipse.org/bugs/show_bug.cgi?id=336501
 * 
 * PersistenceOptions.DEFAULT_TEMPORAL_VALUE, "DATE" overrides @Temporal
 * annotation
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz336501Action extends AbstractTestAction {

	private static final Timestamp TIMESTAMP = new Timestamp(
			new Date().getTime());

	public Bz336501Action() {
		super(Bz336501Package.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.DEFAULT_TEMPORAL_VALUE, "DATE");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		final Bz336501Factory factory = Bz336501Factory.eINSTANCE;
		// System.err.println(store.getMappingXML());
		{
			store.beginTransaction();

			final Test test = factory.createTest();
			test.setName("test1");
			test.setDateOrTime(TIMESTAMP);
			test.getDateOrTimes().add(TIMESTAMP);
			test.getDateOrTimes().add(TIMESTAMP);
			store.store(test);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Test test = store.getObject(Test.class);
			// System.err.println(TIMESTAMP.getTime());
			// System.err.println(test.getDateOrTime().getTime());
			// NOTE: recheck when running mysql if milliseconds are actually
			// stored
			assertEquals(TIMESTAMP, test.getDateOrTime());
			assertEquals(TIMESTAMP, test.getDateOrTimes().get(0));
			assertEquals(TIMESTAMP, test.getDateOrTimes().get(1));
			assertEquals(2, test.getDateOrTimes().size());
		}
	}

}
