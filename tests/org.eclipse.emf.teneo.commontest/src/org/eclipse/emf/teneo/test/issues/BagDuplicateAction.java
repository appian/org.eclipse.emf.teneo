/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: BagDuplicateAction.java,v 1.3 2007/06/29 07:35:43 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.bagduplicate.BagduplicateFactory;
import org.eclipse.emf.teneo.samples.issues.bagduplicate.BagduplicatePackage;
import org.eclipse.emf.teneo.samples.issues.bagduplicate.Person;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests issue with bag
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class BagDuplicateAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public BagDuplicateAction() {
		super(BagduplicatePackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	@SuppressWarnings("unchecked")
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			Person father = BagduplicateFactory.eINSTANCE.createPerson();
			father.setName("father");
			Person mother = BagduplicateFactory.eINSTANCE.createPerson();
			mother.setName("mother");
			Person child1 = BagduplicateFactory.eINSTANCE.createPerson();
			child1.setName("child1");
			Person child2 = BagduplicateFactory.eINSTANCE.createPerson();
			child2.setName("child2");
			father.getChildren().add(child1);
			father.getChildren().add(child2);
			mother.getChildren().add(child1);
			mother.getChildren().add(child2);
			store.store(father);
			store.store(mother);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			Person father = (Person) store.query(Person.class, "name", "father", 1).get(0);
			Person mother = (Person) store.query(Person.class, "name", "mother", 1).get(0);
			assertEquals(2, father.getChildren().size());
			assertEquals(2, mother.getChildren().size());
			assertEquals(father.getChildren().get(0), mother.getChildren().get(0));
			assertEquals(father.getChildren().get(1), mother.getChildren().get(1));
			store.commitTransaction();
		}
	}
}
