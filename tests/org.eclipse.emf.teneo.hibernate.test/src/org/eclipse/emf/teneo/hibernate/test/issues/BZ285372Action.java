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
 * $Id: BZ285372Action.java,v 1.1 2009/08/23 16:04:42 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.emf.test.databinding.emfdb.EmfdbFactory;
import org.eclipse.emf.test.databinding.emfdb.EmfdbPackage;
import org.eclipse.emf.test.databinding.emfdb.Family;
import org.eclipse.emf.test.databinding.emfdb.Person;

/**
 * Testcase for bugzilla 285372
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class BZ285372Action extends AbstractTestAction {
	public BZ285372Action() {
		super(new EPackage[] { EmfdbPackage.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		final HibernateTestStore testStore = (HibernateTestStore) store;
		// Create EditingDomain etc
		final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		final BasicCommandStack commandStack = new BasicCommandStack();
		AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack);

		// Create resource & test
		final URI uri = URI.createURI("hibernate://?" + HibernateResource.DS_NAME_PARAM + "="
				+ testStore.getDataStore().getName());
		try {
			final Resource resource = editingDomain.getResourceSet().createResource(uri);
			resource.load(Collections.EMPTY_MAP);

			// Create a new family
			final Family family = EmfdbFactory.eINSTANCE.createFamily();
			resource.getContents().add(family);
			resource.save(Collections.EMPTY_MAP);

			// Add a child to the family (Family contains child)
			final Person child = EmfdbFactory.eINSTANCE.createPerson();
			final Command command1 = AddCommand.create(editingDomain, family, EmfdbPackage.Literals.FAMILY__PERSONS,
					child);
			editingDomain.getCommandStack().execute(command1);
			resource.save(Collections.EMPTY_MAP);

			// Add a mother to the family (Family contains mother)
			// Add reference of mother to child (Child references mother)
			final Person mother = EmfdbFactory.eINSTANCE.createPerson();
			final CompoundCommand command2 = new CompoundCommand();
			command2.append(AddCommand.create(editingDomain, family, EmfdbPackage.Literals.FAMILY__PERSONS, mother));
			command2.append(AddCommand.create(editingDomain, child, EmfdbPackage.Literals.PERSON__PARENTS, mother));
			editingDomain.getCommandStack().execute(command2);
			resource.save(Collections.EMPTY_MAP);

			// Undo command stack to remove mother from Family containment and from Person reference
			editingDomain.getCommandStack().undo();
			resource.save(Collections.EMPTY_MAP);

			// Redo command stack to re-add mother to Family containment and to Person reference
			editingDomain.getCommandStack().redo();
			resource.save(Collections.EMPTY_MAP); // <-- ERROR here

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}