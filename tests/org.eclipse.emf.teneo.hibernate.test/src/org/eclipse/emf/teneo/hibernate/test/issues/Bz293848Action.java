/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;
import org.hibernate.Session;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz293848Action extends AbstractTestAction {

	private static EPackage ePackage = readEPackage();

	public static EPackage readEPackage() {
		try {
			XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
			final java.net.URL url = Bz293848Action.class
					.getResource("/org/eclipse/emf/teneo/hibernate/test/issues/xx301.xsd");
			Collection<EObject> eCoreObjects = xsdEcoreBuilder.generate(URI.createURI(url.toURI().toString()));
			for (EObject ecoreObject : eCoreObjects) {
				if (ecoreObject instanceof EPackage) {
					final EPackage localEPackage = (EPackage) ecoreObject;
					EPackage.Registry.INSTANCE.put(localEPackage.getNsURI(), localEPackage);
					return localEPackage;
				}
			}
		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw new IllegalStateException(e);
		}
		throw new IllegalArgumentException("No epackages found");
	}

	public Bz293848Action() {
		super(new EPackage[] { ePackage });
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
			final EClass comTypeEClass = (EClass) ePackage.getEClassifier("ComType");
			final EClass locationTypeEClass = (EClass) ePackage.getEClassifier("LocationType");
			final EClass departmentEClass = (EClass) ePackage.getEClassifier("Department");
			final EClass personTypeEClass = (EClass) ePackage.getEClassifier("PersonType");
			final EFactory eFactory = ePackage.getEFactoryInstance();

			final EObject com = eFactory.create(comTypeEClass);
			final EObject location = eFactory.create(locationTypeEClass);
			final EObject department = eFactory.create(departmentEClass);
			final EObject person = eFactory.create(personTypeEClass);

			setValue(person, "lastName", "Taal");
			setValue(person, "firstName", "Martin");
			setValue(person, "age", new BigInteger("5"));

			setValue(department, "booktype", "test");
			setValue(department, "bookname", "test");

			setValue(location, "zip", department);
			setValue(location, "address", "address");

			setValue(com, "employees", person);
			setValue(com, "name", "test");
			setValue(com, "location", location);

			store.beginTransaction();
			store.store(com);
			store.store(person);
			store.store(department);
			store.store(location);
			store.commitTransaction();
		}

		{
			store.beginTransaction();

			Session session = ((HibernateTestStore) store).getSession();

			// List<?> list = session.createQuery("from ComType").list();

			// the following statement performs this sql:
			// select comtype0_.e_id as e1_0_0_, comtype0_.e_version as e3_0_0_, comtype0_."LOCATIONTYPE_LOCATION_E_ID"
			// as LOCATION4_0_0_, comtype0_."NAME" as NAME5_0_0_ from "COMTYPE" comtype0_ where comtype0_.e_id=?
			EObject company = (EObject) session.get("ComType", new Long(1));

			final EObject location = (EObject) company.eGet(company.eClass().getEStructuralFeature("location"));

			// the following statement executes this sql:
			// select locationty0_.e_id as e1_2_0_, locationty0_.e_version as e3_2_0_,
			// locationty0_."DEPARTMENT_ZIP_E_ID" as DEPARTMENT4_2_0_, locationty0_."ADDRESS" as ADDRESS5_2_0_,
			// locationty0_.econtainer_class as econtainer6_2_0_, locationty0_.e_container as e7_2_0_,
			// locationty0_.e_container_feature_name as e8_2_0_ from "LOCATIONTYPE" locationty0_ where
			// locationty0_.e_id=?
			final String address = (String) location.eGet(location.eClass().getEStructuralFeature("address"));

			// the following statement executes this sql:
			// select employees0_."COMTYPE_EMPLOYEES_E_ID" as COMTYPE7_1_, employees0_.e_id as e1_1_,
			// employees0_."COMTYPE_EMPLOYEES_IDX" as COMTYPE8_1_, employees0_.e_id as e1_3_0_, employees0_.e_version as
			// e3_3_0_, employees0_."LASTNAME" as LASTNAME4_3_0_, employees0_."AGE" as AGE5_3_0_,
			// employees0_."FIRSTNAME" as FIRSTNAME6_3_0_, employees0_.econtainer_class as econtainer9_3_0_,
			// employees0_.e_container as e10_3_0_, employees0_.e_container_feature_name as e11_3_0_ from "PERSONTYPE"
			// employees0_ where employees0_."COMTYPE_EMPLOYEES_E_ID"=?
			final EObject employee = (EObject) ((List) company
					.eGet(company.eClass().getEStructuralFeature("employees"))).get(0);
			final String lastName = (String) employee.eGet(employee.eClass().getEStructuralFeature("lastName"));

			store.commitTransaction();
		}

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
