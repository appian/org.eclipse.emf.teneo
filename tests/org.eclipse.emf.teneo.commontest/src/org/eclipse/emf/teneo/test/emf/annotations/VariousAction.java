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
 * $Id: VariousAction.java,v 1.3 2009/03/15 09:26:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.various.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.various.ImmutableCity;
import org.eclipse.emf.teneo.samples.emf.annotations.various.Parent;
import org.eclipse.emf.teneo.samples.emf.annotations.various.VariousFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.various.VariousPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for bz 239757, 239802, 239756
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class VariousAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public VariousAction() {
		super(VariousPackage.eINSTANCE);
	}

	/** Add an option to force to use an idbag */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(
				PersistenceOptions.SQL_DISCRIMINATOR_VERSION_IMMUTABLE_ECLASS,
				"false");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final VariousFactory factory = VariousFactory.eINSTANCE;
		{
			store.beginTransaction();
			final ImmutableCity c = factory.createImmutableCity();
			c.setName("test");
			final Parent p1 = createParent();
			store.store(p1);
			c.getParents().add(p1);
			final Parent p2 = createParent();
			store.store(p2);
			c.getParents().add(p2);
			store.store(c);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			final ImmutableCity c = store.getObject(ImmutableCity.class);
			c.setName("test2");
			store.store(c);
			store.commitTransaction();
		}
		// name should not have changed
		{
			store.beginTransaction();
			final ImmutableCity c = store.getObject(ImmutableCity.class);
			assertEquals("test", c.getName());
			store.store(c);
			for (Parent p : c.getParents()) {
				// 2 parents and 10 children
				assertEquals(12, p.getTotalPeople());
			}

			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final ImmutableCity c = store.getObject(ImmutableCity.class);
			c.getParents().remove(1);
			store.store(c);
			try {
				// collection change is not allowed
				store.commitTransaction();
				fail();
			} catch (Exception e) {
				store.rollbackTransaction();
			}
		}
	}

	private Parent createParent() {
		final VariousFactory factory = VariousFactory.eINSTANCE;
		final Parent p = factory.createParent();
		for (int i = 0; i < 5; i++) {
			final Child c = factory.createChild();
			p.getChildren().add(c);
		}
		return p;
	}
}