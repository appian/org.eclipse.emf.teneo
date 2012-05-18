/**
 * <copyright> Copyright (c) 2012 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * EmbeddedIdAction.java,v 1.3 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.jpa2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import junit.framework.Assert;

import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.CollectiontableFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.CollectiontablePackage;
import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.EmbeddedItem;
import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.Item;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

public class MapKeyTypesAction extends AbstractTestAction {

	private static final MapsFactory FACTORY = MapsFactory.eINSTANCE;

	public MapKeyTypesAction() {
		super(MapsPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		final Date dt1 = new Date();
		final Date dt2 = new Date(System.currentTimeMillis() + 10000);
		final String v1 = "ABC";
		final String v2 = "DEF";
		final EnumType t1 = EnumType.VAL1;
		final EnumType t2 = EnumType.VAL2;
		final String v3 = "GHI";
		final String v4 = "KLM";
		{
			store.beginTransaction();
			final Images images = FACTORY.createImages();
			images.getImageDateDescriptions().put(dt1, v1);
			images.getImageDateDescriptions().put(dt2, v2);
			images.getImageTypeNames().put(t1, v3);
			images.getImageTypeNames().put(t2, v4);
			store.store(images);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Images images = store.getObject(Images.class);
			
			Assert.assertTrue(images.getImageDateDescriptions().size() == 2);
			Assert.assertTrue(images.getImageDateDescriptions().get(dt1).equals(v1));
			Assert.assertTrue(images.getImageDateDescriptions().get(dt2).equals(v2));
			// keys are not the same object!
			Assert.assertTrue(images.getImageDateDescriptions().get(0).getKey() != dt1);
			Assert.assertTrue(images.getImageDateDescriptions().get(0).getKey() != dt2);
			
			Assert.assertTrue(images.getImageTypeNames().size() == 2);
			Assert.assertTrue(images.getImageTypeNames().get(t1).equals(v3));
			Assert.assertTrue(images.getImageTypeNames().get(t2).equals(v4));
			store.store(images);
			store.commitTransaction();
		}
	}
}
