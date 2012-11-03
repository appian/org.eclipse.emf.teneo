/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * SimpleTypeAction.java,v 1.7 2007/03/06 19:02:42 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.auditing;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.simplearray.SimpleList;
import org.eclipse.emf.teneo.samples.issues.simplearray.SimplearrayFactory;
import org.eclipse.emf.teneo.samples.issues.simplearray.SimplearrayPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests if simple types are stored/retrieved correctly.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.13 $
 */
public class SimpleArrayAuditingAction extends AbstractTestAction {

	public SimpleArrayAuditingAction() {
		super(SimplearrayPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.ENABLE_AUDITING, "true");
		return props;
	}

	/** Creates simple types and tests against */
	@Override
	public void doAction(TestStore store) {
		// test a simple type
		final SimplearrayFactory factory = SimplearrayFactory.eINSTANCE;
		{
			store.beginTransaction();
			final SimpleList stype = factory.createSimpleList();
			stype.setIntArray(new int[] { 0, 1, 2, 3, 4 });
			stype.setName("abc");
			store.store(stype);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final SimpleList stype = store.getObject(SimpleList.class);
			stype.setName("def");
			store.store(stype);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final SimpleList stype = store.getObject(SimpleList.class);
			stype.setIntArray(new int[] { 0, 1, 2, 3, 4, 5, 6 });
			stype.setName("abc");
			store.store(stype);
			store.commitTransaction();
		}
	}

	@Override
	public boolean supportAuditing() {
		return true;
	}
}
