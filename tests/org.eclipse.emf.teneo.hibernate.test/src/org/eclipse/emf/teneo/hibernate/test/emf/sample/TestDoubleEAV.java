/**
 * <copyright>
 *
 * Copyright (c) 2010 Tiger Yu and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Tiger Yu - Initial Implementation
 *   Martin Taal - Adapted for Teneo test suite
 * </copyright>
 *
 * $Id: TestDoubleEAV.java,v 1.1 2010/01/26 07:54:14 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Test case for EAV and precision/scale setting
 * 
 * @author mtaal
 */
public class TestDoubleEAV extends AbstractTestAction {
	private static final String NS = "http://www.eclipse.org/eav/test/test";
	private static EPackage ePackage;

	private static EPackage createSchema() {
		if (EPackage.Registry.INSTANCE.getEPackage(NS) != null) {
			return EPackage.Registry.INSTANCE.getEPackage(NS);
		}
		final EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
		final EcorePackage ecorePackage = EcorePackage.eINSTANCE;

		EClass testTypeEClass = ecoreFactory.createEClass();
		testTypeEClass.setName("TestType");

		EAttribute element = ecoreFactory.createEAttribute();
		element.setName("element");
		element.setEType(ecorePackage.getEDouble());
		testTypeEClass.getEStructuralFeatures().add(element);

		EAttribute element2 = ecoreFactory.createEAttribute();
		element2.setName("elementTwo");
		element2.setEType(ecorePackage.getEBigDecimal());
		testTypeEClass.getEStructuralFeatures().add(element2);

		// create a package that represents company
		ePackage = ecoreFactory.createEPackage();
		ePackage.setName("test");
		ePackage.setNsPrefix("test");
		ePackage.setNsURI(NS);
		ePackage.getEClassifiers().add(testTypeEClass);

		EPackage.Registry.INSTANCE.put(NS, ePackage);

		return ePackage;
	}

	public TestDoubleEAV() {
		super(new EPackage[] { createSchema() });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.EAV_MAPPING, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		final EFactory eFactory = ePackage.getEFactoryInstance();
		final EClass testTypeEClass = (EClass) ePackage.getEClassifier("TestType");

		final EObject test = eFactory.create(testTypeEClass);
		setValue(test, "element", new Double(2.3));
		setValue(test, "elementTwo", new BigDecimal("10.23132"));

		store.beginTransaction();
		// In the next statement com.microsoft.sqlserver.jdbc.SQLServerException: Error converting data type nvarchar to
		// decimal.
		// will be thrown for MS SQLServer 2008 through sqljdbc4-2.0.jar
		store.store(test);
		store.commitTransaction();

		store.beginTransaction();
		List<?> list = store.query("from TestType");
		EObject testObj = (EObject) list.get(0);
		EStructuralFeature elementFeature = testObj.eClass().getEStructuralFeature("element");
		System.out.println(testObj.eGet(elementFeature));
		store.commitTransaction();

		// test closing the datastore
		final String dsName = store.getDataStore().getName();
		((HbDataStore) store.getDataStore()).close();

		// it should be removed from the HBHelper
		assertTrue(null == HbHelper.INSTANCE.getDataStore(dsName));
	}

	private void setValue(EObject eObject, String eFeatureName, Object value) {
		final EStructuralFeature eFeature = eObject.eClass().getEStructuralFeature(eFeatureName);
		if (eFeature.isMany()) {
			((List) eObject.eGet(eFeature)).add(value);
		} else {
			eObject.eSet(eFeature, value);
		}
	}

}
