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
 * $Id: ResourceAction.java,v 1.6 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.samples.issues.resource.Head;
import org.eclipse.emf.teneo.samples.issues.resource.Person;
import org.eclipse.emf.teneo.samples.issues.resource.ResourceFactory;
import org.eclipse.emf.teneo.samples.issues.resource.ResourcePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests setting resource when a single ref. relation is loaded.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class ResourceAction extends AbstractTestAction {

	/**
	 * 
	 * 
	 * @param arg0
	 */
	public ResourceAction() {
		super(new EPackage[] { ResourcePackage.eINSTANCE });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#hibernateEnabled()
	 */
	protected boolean hibernateEnabled() {
		return true;
	}

	/** Creates simple types and tests against */
	@Override
	public void doAction(TestStore store) {
		// test a simple type
		final ResourceFactory factory = ResourceFactory.eINSTANCE;
		{
			store.beginTransaction();
			Person person = factory.createPerson();
			person.setName("me");
			Head head = factory.createHead();
			head.setHair("blond");
			person.setHead(head);
			store.store(person);
			store.store(head);
			store.commitTransaction();
		}

		// now use a resource to read!
		try {
			final Resource res = store.getResource("query1=select p from Person p");
			res.load(Collections.EMPTY_MAP);
			Iterator<?> it = res.getContents().iterator();
			while (it.hasNext()) {
				Object o = it.next();
				if (!(o instanceof Person)) {
					continue;
				}
				Person obj = (Person) o;
				assertEquals(obj.eResource(), obj.getHead().eResource());
				assertTrue(obj.eResource() != null);
			}
			res.unload();
		} catch (IOException e) {
			throw new StoreTestException("Exception", e);
		}
	}
}
