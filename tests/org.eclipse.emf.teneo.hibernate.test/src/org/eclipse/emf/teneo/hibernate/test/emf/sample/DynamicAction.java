/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DynamicAction.java,v 1.4 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.emf.sample.dynamic.DynamicFactory;
import org.eclipse.emf.teneo.samples.emf.sample.dynamic.DynamicPackage;
import org.eclipse.emf.teneo.samples.emf.sample.dynamic.Person;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.HsqldbTestDatabaseAdapter;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.17 $
 */
public class DynamicAction extends AbstractTestAction {
	/**
	 * Constructor.
	 * 
	 * @param arg0
	 */
	public DynamicAction() {
		super(DynamicPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.SET_PROXY, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final DynamicFactory factory = DynamicFactory.eINSTANCE;
		final EcoreFactory efactory = EcoreFactory.eINSTANCE;
		final EcorePackage epackage = EcorePackage.eINSTANCE;

		// just create one person and save hime

		{
			store.beginTransaction();
			Person p = factory.createPerson();
			p.setName("martin");
			p.getAge().add(new Integer(37));
			store.store(p);
			store.commitTransaction();
		}

		// add new attributes to person
		// if (false) {
		// final EAttribute hairColor = efactory.createEAttribute();
		// hairColor.setName("hairColor");
		// hairColor.setEType(epackage.getEString());
		// DynamicPackage.eINSTANCE.getPerson().getEStructuralFeatures().add(hairColor);
		//
		// store.updateSchema();
		//
		// store.beginTransaction();
		// Person p = factory.createPerson();
		// p.setName("davide");
		// p.getAge().add(new Integer(32));
		// p.eSet(hairColor, "black");
		// store.store(p);
		// store.commitTransaction();
		// store.beginTransaction();
		// // and read martin and set his haircolor also
		// final List<?> list = store.getObjects(Person.class);
		// assertEquals(2, list.size());
		// for (Object name : list) {
		// Person person = (Person) name;
		// if (person.getName().compareTo("martin") == 0) {
		// person.eSet(hairColor, "blond");
		// store.store(person);
		// } else if (person.getName().compareTo("davide") == 0) {
		// assertEquals("black", (String) person.eGet(hairColor));
		// } else {
		// fail("Person with name: " + person.getName() + " not expected");
		// }
		// }
		// store.commitTransaction();
		// }

		// add a new eclass which inherits from person
		EClass employeeClass = null;
		EClass specialEmployeeClass = null;
		EAttribute employeeManager = null;
		EReference employeeDepartment = null;
		EClass departmentClass = null;

		EClass officeClass = null;
		EAttribute officeName = null;
		EReference officeAddressRef = null;

		EClass officeAddressClass = null;
		EAttribute addressName = null;

		EReference departmentManager = null;
		EPackage companyPackage = null;
		EAttribute departmentName = null;
		EAttribute departmentType = null;
		EReference departmentOffice = null;
		EReference employeeOffices = null;
		EEnumLiteral el1 = null;
		{
			employeeClass = efactory.createEClass();
			employeeClass.setName("Employee");

			employeeManager = efactory.createEAttribute();
			employeeManager.setName("manager");
			employeeManager.setEType(epackage.getEBoolean());
			employeeManager.setUnique(false);
			employeeClass.getEStructuralFeatures().add(employeeManager);

			employeeClass.getESuperTypes().add(DynamicPackage.eINSTANCE.getPerson());

			specialEmployeeClass = efactory.createEClass();
			specialEmployeeClass.setName("SpecialEmployee");
			specialEmployeeClass.getESuperTypes().add(employeeClass);

			departmentClass = efactory.createEClass();
			departmentClass.setName("Department");

			departmentName = efactory.createEAttribute();
			departmentName.setName("name");
			departmentName.setEType(epackage.getEString());
			departmentClass.getEStructuralFeatures().add(departmentName);

			departmentManager = efactory.createEReference();
			departmentManager.setName("manager");
			departmentManager.setEType(employeeClass);
			departmentManager.setUpperBound(ETypedElement.UNBOUNDED_MULTIPLICITY);
			departmentManager.setContainment(true);
			departmentClass.getEStructuralFeatures().add(departmentManager);

			employeeDepartment = efactory.createEReference();
			employeeDepartment.setName("department");
			employeeDepartment.setEType(departmentClass);
			employeeDepartment.setUnique(false);
			// will result in extra loads
			// employeeDepartment.setContainment(true);
			employeeClass.getEStructuralFeatures().add(employeeDepartment);

			officeAddressClass = efactory.createEClass();
			officeAddressClass.setName("Address");

			addressName = efactory.createEAttribute();
			addressName.setName("name");
			addressName.setEType(epackage.getEString());
			officeAddressClass.getEStructuralFeatures().add(addressName);

			officeClass = efactory.createEClass();
			officeClass.setName("Office");

			officeName = efactory.createEAttribute();
			officeName.setName("name");
			officeName.setEType(epackage.getEString());
			final EAnnotation idAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			idAnnotation.setSource("teneo.jpa");
			idAnnotation.getDetails().put("value", "@Id");
			officeName.getEAnnotations().add(idAnnotation);
			officeClass.getEStructuralFeatures().add(officeName);

			officeAddressRef = efactory.createEReference();
			officeAddressRef.setName("address");
			officeAddressRef.setEType(officeAddressClass);
			officeClass.getEStructuralFeatures().add(officeAddressRef);

			departmentOffice = efactory.createEReference();
			departmentOffice.setName("office");
			departmentOffice.setEType(officeClass);
			departmentOffice.setContainment(true);
			departmentClass.getEStructuralFeatures().add(departmentOffice);

			employeeOffices = efactory.createEReference();
			employeeOffices.setName("offices");
			employeeOffices.setEType(officeClass);
			employeeOffices.setContainment(false);
			employeeOffices.setUpperBound(-1);
			specialEmployeeClass.getEStructuralFeatures().add(employeeOffices);

			final EEnum dt = efactory.createEEnum();
			dt.setName("DepartmentType");
			el1 = efactory.createEEnumLiteral();
			el1.setName("division");
			el1.setValue(0);
			dt.getELiterals().add(el1);
			final EEnumLiteral el2 = efactory.createEEnumLiteral();
			el2.setName("office");
			el2.setValue(1);
			dt.getELiterals().add(el2);
			departmentType = efactory.createEAttribute();
			departmentType.setName("departmentType");
			departmentType.setEType(dt);
			departmentClass.getEStructuralFeatures().add(departmentType);

			companyPackage = efactory.createEPackage();
			companyPackage.setName("elv");
			companyPackage.setNsPrefix("elv");
			companyPackage.setNsURI("http:///www.elver.org/DynamicTest");
			companyPackage.getEClassifiers().add(employeeClass);
			companyPackage.getEClassifiers().add(specialEmployeeClass);
			companyPackage.getEClassifiers().add(departmentClass);
			companyPackage.getEClassifiers().add(officeClass);
			companyPackage.getEClassifiers().add(officeAddressClass);
			companyPackage.getEClassifiers().add(dt);
			EPackage.Registry.INSTANCE.put(companyPackage.getNsURI(), companyPackage);
			store.addEPackage(companyPackage);
			store.updateSchema();
			// System.err.println(store.getMappingXML());
		}

		// return from here in case of hsqldb because hsqldb does
		// not support db reconfiguration
		if (store.getDatabaseAdapter() instanceof HsqldbTestDatabaseAdapter) {
			return;
		}

		// System.err.println(store.getMappingXML());

		// Now create three employee
		{
			store.beginTransaction();

			EObject office = EcoreUtil.create(officeClass);
			office.eSet(officeName, "Marketing Office");
			store.store(office);

			List<EObject> offices = new ArrayList<EObject>();
			{
				EObject office1 = EcoreUtil.create(officeClass);
				office1.eSet(officeName, "Office1");
				store.store(office1);

				EObject office2 = EcoreUtil.create(officeClass);
				office2.eSet(officeName, "Office2");
				store.store(office2);
				offices.add(office1);
				offices.add(office2);
			}

			EObject department = EcoreUtil.create(departmentClass);
			department.eSet(departmentName, "Marketing");
			department.eSet(departmentType, el1);
			department.eSet(departmentOffice, office);
			store.store(department);

			Person employee = (Person) EcoreUtil.create(employeeClass);
			employee.setName("employee1");
			employee.eSet(employeeManager, new Boolean(true));
			employee.eSet(employeeDepartment, department);
			store.store(employee);

			Person specialEmployee = (Person) EcoreUtil.create(specialEmployeeClass);
			specialEmployee.eSet(employeeOffices, offices);
			specialEmployee.setName("specialEmployee1");
			store.store(specialEmployee);

			Person employee2 = (Person) EcoreUtil.create(employeeClass);
			employee2.setName("employee2");
			employee2.eSet(employeeManager, new Boolean(true));
			employee2.eSet(employeeDepartment, department);
			store.store(employee2);
			Person employee3 = (Person) EcoreUtil.create(employeeClass);
			employee3.setName("employee3");
			employee3.eSet(employeeManager, new Boolean(false));
			employee3.eSet(employeeDepartment, department);
			store.store(employee3);
			store.commitTransaction();

			// the dynamiceobjectimpl should not be present in the mapping xml
			// assertTrue(((HibernateTestStore)
			// store).getMappingXML().indexOf(DynamicEObjectImpl.class.getName())
			// ==
			// -1);
		}

		// read them all (incl. the person), create a department and add the
		// managers
		{
			store.beginTransaction();
			List<?> employees = store.query("select e from Employee e");
			assertEquals(4, employees.size());
			for (Object name : employees) {
				EObject eobject = (EObject) name;
				assertTrue(eobject.eClass() == employeeClass || eobject.eClass() == specialEmployeeClass);
			}

			EObject officeAddress = EcoreUtil.create(officeAddressClass);
			officeAddress.eSet(addressName, "Software Development Address");

			EObject office = EcoreUtil.create(officeClass);
			office.eSet(officeName, "Software Development Office");
			office.eSet(officeAddressRef, officeAddress);
			store.store(office);

			EObject department = EcoreUtil.create(departmentClass);
			department.eSet(departmentName, "Software Development");
			department.eSet(departmentType, el1);
			department.eSet(departmentOffice, office);
			final ArrayList<Person> departmentManagers = new ArrayList<Person>();
			for (int i = 0; i < employees.size(); i++) {
				Person employ = (Person) employees.get(i);
				if (((Boolean) employ.eGet(employeeManager)).booleanValue()) {
					departmentManagers.add(employ);
				}
			}
			assertEquals(2, departmentManagers.size());
			department.eSet(departmentManager, departmentManagers);
			store.store(department);
			store.commitTransaction();
		}

		// do a polymorphic query
		// if (false) {
		// store.beginTransaction();
		// List<?> employees = store.query("select p from Person p");
		// assertEquals(4, employees.size());
		// int cntEmployee = 0;
		// for (Object name : employees) {
		// EObject eobject = (EObject) name;
		//
		// if (eobject.eClass() == employeeClass) {
		// cntEmployee++;
		// final Object dep = eobject.eGet(employeeDepartment);
		// assertTrue(dep == null || dep instanceof
		// org.hibernate.proxy.HibernateProxy);
		// }
		// }
		// assertEquals(3, cntEmployee);
		// store.commitTransaction();
		// }

		if (true) {
			store.beginTransaction();
			final HibernateTestStore hbStore = (HibernateTestStore) store;
			final EObject eobject = companyPackage.getEFactoryInstance().create(employeeClass);
			hbStore.getSession().load(eobject, getTestId());
			final Object dep = eobject.eGet(employeeDepartment);
			assertTrue(dep == null || dep instanceof org.hibernate.proxy.HibernateProxy);
			if (dep != null) {
				((EObject) dep).eGet(departmentOffice);
			}
			store.commitTransaction();
		}

		// now delete the department, there should now be only one employee left
		{
			store.beginTransaction();
			// note query on name does not work as this test is also used by the
			// EAV mapping
			// which does not support querying
			List<?> list = store.query("select d from Department d");
			assertEquals(2, list.size());
			// get the software development one
			EObject department = null;
			for (Object obj : list) {
				final EObject possibleDepartment = (EObject) obj;
				if (possibleDepartment.eGet(departmentName).equals("Software Development")) {
					department = possibleDepartment;
					break;
				}
			}
			assertNotNull(department);
			List<?> managers = (List<?>) department.eGet(departmentManager);
			assertEquals(2, managers.size());
			assertTrue(((Person) managers.get(0)).eClass() == employeeClass);
			assertTrue(((Person) managers.get(1)).eClass() == employeeClass);
			assertTrue(department.eClass() == departmentClass);

			final EObject off = (EObject) department.eGet(departmentOffice);
			assertTrue(off instanceof org.hibernate.proxy.HibernateProxy);
			final String offName = (String) off.eGet(officeName);
			final String depName = (String) department.eGet(departmentName);
			assertTrue(offName.startsWith(depName));
			assertTrue(off.eGet(officeAddressRef) != null);

			store.deleteObject(department);
			store.commitTransaction();
		}

		store.checkNumber(Person.class, 3);
		{
			store.beginTransaction();
			List<?> list = store.query("select e from Employee e");
			assertEquals(2, list.size());
			Person person = (Person) list.get(0);
			assertTrue(person.eClass() == employeeClass || person.eClass() == specialEmployeeClass);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			List<?> list = store.query("select e from SpecialEmployee e");
			assertEquals(1, list.size());
			Person person = (Person) list.get(0);
			assertTrue(person.eClass() == specialEmployeeClass);
			final List<?> officesObj = (List<?>) person.eGet(employeeOffices);
			assertTrue(officesObj.size() == 2);
			assertTrue(((EObject) officesObj.get(0)).eClass() == officeClass);
			assertTrue(((EObject) officesObj.get(1)).eClass() == officeClass);
			store.commitTransaction();
		}

		try {
			final Resource res = store.getResource();

			EObject office = EcoreUtil.create(officeClass);
			office.eSet(officeName, "Marketing Office 2");
			res.getContents().add(office);
			res.save(Collections.emptyMap());
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	protected long getTestId() {
		return 4;
	}
}