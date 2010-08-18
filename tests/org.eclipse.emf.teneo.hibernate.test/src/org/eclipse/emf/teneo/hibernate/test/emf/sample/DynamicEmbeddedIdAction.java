/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DynamicAction.java,v 1.4 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.mapping.SerializableDynamicEObjectImpl;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.HsqldbTestDatabaseAdapter;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class DynamicEmbeddedIdAction extends AbstractTestAction {
	
	private static EPackage embeddedIdEPackage;

	private static EClass nameEClass = null;
	private static EAttribute firstName = null;
	private static EAttribute lastName = null;

	private static EClass personEClass = null;
	private static EReference nameRef = null;
	
	static {
		final EcoreFactory efactory = EcoreFactory.eINSTANCE;
		final EcorePackage epackage = EcorePackage.eINSTANCE;
		{
			nameEClass = efactory.createEClass();
			nameEClass.setName("Name");
			EAnnotation teneoAnnotation = efactory.createEAnnotation();
			teneoAnnotation.setSource("teneo.jpa");
			teneoAnnotation.getDetails().put("value", "@Embeddable");
			nameEClass.getEAnnotations().add(teneoAnnotation);

			firstName = efactory.createEAttribute();
			firstName.setName("firstName");
			firstName.setEType(epackage.getEString());
			nameEClass.getEStructuralFeatures().add(firstName);
			lastName = efactory.createEAttribute();
			lastName.setName("lastName");
			lastName.setEType(epackage.getEString());
			nameEClass.getEStructuralFeatures().add(lastName);

			personEClass = efactory.createEClass();
			personEClass.setName("Person");

			nameRef = efactory.createEReference();
			nameRef.setName("name");
			nameRef.setEType(nameEClass);
			nameRef.setContainment(true);
			EAnnotation teneoAnnotation2 = efactory.createEAnnotation();
			teneoAnnotation2.setSource("teneo.jpa");
			teneoAnnotation2.getDetails().put("value", "@EmbeddedId");
			nameRef.getEAnnotations().add(teneoAnnotation2);
			personEClass.getEStructuralFeatures().add(nameRef);

			embeddedIdEPackage = efactory.createEPackage();
			embeddedIdEPackage.setName("elv");
			embeddedIdEPackage.setNsPrefix("elv");
			embeddedIdEPackage.setNsURI("http:///www.elver.org/" + DynamicEmbeddedIdAction.class.getName());
			embeddedIdEPackage.getEClassifiers().add(nameEClass);
			embeddedIdEPackage.getEClassifiers().add(personEClass);
			EPackage.Registry.INSTANCE.put(embeddedIdEPackage.getNsURI(), embeddedIdEPackage);
		}

	}
	
	public DynamicEmbeddedIdAction() {
		super(embeddedIdEPackage);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store){
		{

			EObject name = new SerializableDynamicEObjectImpl(nameEClass);
			name.eSet(firstName, "Martin");
			name.eSet(lastName, "Taal");
			EObject person = EcoreUtil.create(personEClass);
			person.eSet(nameRef, name);
			store.beginTransaction();
			store.store(person);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			List<?> persons = store.query("select e from Person e");
			assertEquals(1, persons.size());
			for (Object person : persons) {
				EObject eobject = (EObject) person;
				assertTrue(eobject.eClass() == personEClass);
			}
			store.commitTransaction();
		}
		
		{
			store.beginTransaction();
			SerializableDynamicEObjectImpl name = new SerializableDynamicEObjectImpl(nameEClass);
			name.eSet(firstName, "Martin");
			name.eSet(lastName, "Taal");
			final SerializableDynamicEObjectImpl person = (SerializableDynamicEObjectImpl)store.getObject("Person", name);
			assertTrue(person != null);
			store.commitTransaction();
		}
	}
}