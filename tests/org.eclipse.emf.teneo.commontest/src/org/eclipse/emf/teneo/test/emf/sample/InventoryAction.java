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
 * $Id: InventoryAction.java,v 1.5 2008/02/28 07:08:14 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.sample.inv.InventoryFactory;
import org.eclipse.emf.teneo.samples.emf.sample.inv.InventoryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.inv.PDeclaration;
import org.eclipse.emf.teneo.samples.emf.sample.inv.PType;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/** 
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $ 
 */
public class InventoryAction extends AbstractTestAction {
	public InventoryAction() {
		super(InventoryPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "true");
		return props;
	}

	/** Creates a supplier, a product, relates then, saves and retrieves them again. */
	@Override
	@SuppressWarnings("unchecked")
	public void doAction(TestStore store) {
		final InventoryFactory factory = InventoryFactory.eINSTANCE;
		{
			store.beginTransaction();
			PType pt = factory.createPType();
			pt.setName("myname");

			PType ptChild = factory.createPType();
			ptChild.setName("child");
			ptChild.setBase(pt);

			PType ptOther = factory.createPType();
			ptOther.setName("other");
			pt.getSubNOTypes().add(ptOther);

			PDeclaration pd = factory.createPDeclaration();
			pd.setName("pd");
			pt.getInfoReferences().add(pd);
			PDeclaration pd1 = factory.createPDeclaration();
			pd1.setName("pd1");
			pt.getInfoReferences().add(pd1);
			pt.getInfoReferences().add(pd);

			store.store(pt);
			store.store(ptChild);
			store.store(ptOther);
			store.commitTransaction();
		}

		store.checkNumber(PType.class, 3);

		{
			store.beginTransaction();
			List list = store.query(PType.class, "name", "myname", 1);
			PType pt = (PType) list.get(0);
			assertEquals(((PType) pt.getSubNOTypes().get(0)).getName(), "other");
			assertEquals(((PType) pt.getSubTypes().get(0)).getName(), "child");
			pt.getInfoReferences().add(pt.getInfoReferences().get(0));
			store.store(pt);
			store.commitTransaction();
		}
	}
}