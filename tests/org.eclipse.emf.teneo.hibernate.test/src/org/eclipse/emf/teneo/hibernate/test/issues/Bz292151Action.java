/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.bz292151.Bz292151Factory;
import org.eclipse.emf.teneo.samples.issues.bz292151.Bz292151Package;
import org.eclipse.emf.teneo.samples.issues.bz292151.Sub1;
import org.eclipse.emf.teneo.samples.issues.bz292151.Sub2;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class Bz292151Action extends AbstractTestAction {

	public Bz292151Action() {
		super(new EPackage[] { Bz292151Package.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_PROXY, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			final Sub1 sub1 = Bz292151Factory.eINSTANCE.createSub1();
			sub1.setA1("test");
			final Sub2 sub2 = Bz292151Factory.eINSTANCE.createSub2();
			sub2.setA1(sub1);
			store.store(sub1);
			store.store(sub2);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Sub1 sub1 = store.getObject(Sub1.class);
			final Sub2 sub2 = store.getObject(Sub2.class);
			assertEquals(sub2.getA1(), sub1);
			store.commitTransaction();
		}
	}
}
