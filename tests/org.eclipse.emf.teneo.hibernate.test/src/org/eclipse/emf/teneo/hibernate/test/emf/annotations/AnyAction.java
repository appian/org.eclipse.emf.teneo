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
 * $Id: AnyAction.java,v 1.2.2.2 2009/06/30 07:29:26 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject;
import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.any.GlobalObjectType;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests simple @Any annotation on an ereference.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2.2.2 $
 */
public class AnyAction extends AbstractTestAction {
	private final AnyFactory factory = AnyFactory.eINSTANCE;

	public AnyAction() {
		super(AnyPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		final int testSize = 4;
		store.beginTransaction();
		{
			for (int i = 1; i < testSize; i++) {
				createTestData(store, i);
			}
		}
		store.commitTransaction();
		store.beginTransaction();
		{
			for (AnyObject ao : store.getObjects(AnyObject.class)) {
				if (Long.parseLong(ao.getId()) > testSize) {
					// ignore these ones
					continue;
				}
				testData(ao);
			}
		}
		store.commitTransaction();

	}

	private void testData(AnyObject ao) {
		final long index = Long.parseLong(ao.getId());
		final long otherIndex = Long.parseLong(((AnyObject) ao.getAnyOne())
				.getId());
		assertEquals(ao.getAny().get(0).getValue(), (int) index);
		assertEquals(ao.getAny().get(1).getValue(), "hello" + index);
		final GlobalObjectType ot = (GlobalObjectType) ao.getAny().get(2)
				.getValue();
		assertEquals(ot.getName(), "name" + index);

		assertEquals(otherIndex, (index * 10));

		assertEquals(((FeatureMap.Entry) (ao.getGroup().get(0)).getValue())
				.getValue(), (int) (index + 1));
		assertEquals(((FeatureMap.Entry) (ao.getGroup().get(1)).getValue())
				.getValue(), "hello" + (index + 1));

		assertEquals(((FeatureMap.Entry) (ao.getGroup().get(2)).getValue())
				.getValue(), ao.getAny().get(2).getValue());
	}

	private void createTestData(TestStore store, int index) {
		final GlobalObjectType objectType = factory.createGlobalObjectType();
		objectType.setName("name" + index);
		objectType.setId(index + "");
		store.store(objectType);

		final AnyObject ao = factory.createAnyObject();
		ao.setId("" + index);
		ao.getAny().add(AnyPackage.eINSTANCE.getAnyObject_GlobalInt(), index);
		ao.getAny().add(AnyPackage.eINSTANCE.getAnyObject_GlobalString(),
				"hello" + index);
		ao.getAny().add(AnyPackage.eINSTANCE.getDocumentRoot_GlobalObject(),
				objectType);

		final AnyObject ao2 = factory.createAnyObject();
		ao2.setId("" + (index * 10));

		ao.setAnyOne(ao2);
		ao.getGroup().add(
				createEntry(AnyPackage.eINSTANCE.getDocumentRoot_GlobalInt(),
						index + 1));
		ao.getGroup().add(
				createEntry(AnyPackage.eINSTANCE.getAnyObject_GlobalString(),
						"hello" + (index + 1)));
		ao.getGroup().add(
				createEntry(
						AnyPackage.eINSTANCE.getDocumentRoot_GlobalObject(),
						objectType));

		store.store(ao);
	}

	private FeatureMap.Entry createEntry(EStructuralFeature eFeature,
			Object value) {
		return FeatureMapUtil.createEntry(AnyPackage.eINSTANCE
				.getAnyObject_Any1(), FeatureMapUtil.createEntry(eFeature,
				value));
	}
}