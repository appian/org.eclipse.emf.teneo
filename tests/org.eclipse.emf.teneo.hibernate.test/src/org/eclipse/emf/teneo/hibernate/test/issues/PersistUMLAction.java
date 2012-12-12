/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class PersistUMLAction extends AbstractTestAction {

	public PersistUMLAction() {
		super(new EPackage[] { EcorePackage.eINSTANCE, TypesPackage.eINSTANCE, UMLPackage.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.ENABLE_AUDITING, "false");
		props.setProperty(PersistenceOptions.ID_COLUMN_NAME, "uuid");
		props.setProperty(PersistenceOptions.ALWAYS_VERSION, "false");
		props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_CONTAINMENT, "ALL");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			org.eclipse.uml2.uml.Package ePackage = UMLFactory.eINSTANCE.createPackage();
			ePackage.setName("com.test");

			org.eclipse.uml2.uml.Package ePackage2 = UMLFactory.eINSTANCE.createPackage();
			ePackage2.setName("middle");
			ePackage.getPackagedElements().add(ePackage2);

			org.eclipse.uml2.uml.Class clazz = UMLFactory.eINSTANCE.createClass();
			clazz.setName("Test");

			ePackage2.getPackagedElements().add(clazz);
			store.store(ePackage);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			List<?> list = store.query("from Package p where name = 'com.test'");
			org.eclipse.uml2.uml.Package ePackage = (org.eclipse.uml2.uml.Package) list.get(0);
			System.out.println(ePackage.getName());
			System.out.println("size : " + ePackage.getPackagedElements().size());
			store.commitTransaction();
		}
	}
}
