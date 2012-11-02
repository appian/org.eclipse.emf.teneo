/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DynamicAction.java,v 1.4 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.hibernate.mapping.SerializableDynamicEObjectImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for bugzilla 321768
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class Bz321768Action extends AbstractTestAction {

	private static EPackage embeddedEPackage;

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
			{
				EAnnotation teneoAnnotation = efactory.createEAnnotation();
				teneoAnnotation.setSource("teneo.jpa");
				teneoAnnotation.getDetails().put("value", "@Embeddable");
				nameEClass.getEAnnotations().add(teneoAnnotation);
			}
			{
				EAnnotation teneoAnnotation = efactory.createEAnnotation();
				teneoAnnotation.setSource("teneo.jpa.auditing");
				teneoAnnotation.getDetails().put("value", "@Embeddable");
				nameEClass.getEAnnotations().add(teneoAnnotation);
			}

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
			{
				EAnnotation teneoAnnotation2 = efactory.createEAnnotation();
				teneoAnnotation2.setSource("teneo.jpa");
				teneoAnnotation2.getDetails().put("value", "@Embedded");
				nameRef.getEAnnotations().add(teneoAnnotation2);
			}
			{
				EAnnotation teneoAnnotation2 = efactory.createEAnnotation();
				teneoAnnotation2.setSource("teneo.jpa.auditing");
				teneoAnnotation2.getDetails().put("value", "@Embedded");
				nameRef.getEAnnotations().add(teneoAnnotation2);
			}
			personEClass.getEStructuralFeatures().add(nameRef);

			embeddedEPackage = efactory.createEPackage();
			embeddedEPackage.setName("elv");
			embeddedEPackage.setNsPrefix("elv");
			embeddedEPackage.setNsURI("http:///www.elver.org/" + Bz321768Action.class.getName());
			embeddedEPackage.getEClassifiers().add(nameEClass);
			embeddedEPackage.getEClassifiers().add(personEClass);
			EPackage.Registry.INSTANCE.put(embeddedEPackage.getNsURI(), embeddedEPackage);
		}

	}

	public Bz321768Action() {
		super(embeddedEPackage);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
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
				EObject name = (EObject) eobject.eGet(nameRef);
				assertTrue(name != null);
				assertEquals("Martin", name.eGet(firstName));
			}
			store.commitTransaction();
		}
	}
}