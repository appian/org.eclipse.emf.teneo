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
 * $Id: AbstractReferenceAction.java,v 1.6 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.io.IOException;
import java.util.Properties;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.issues.abstractreference.AbstractreferenceFactory;
import org.eclipse.emf.teneo.samples.issues.abstractreference.AbstractreferencePackage;
import org.eclipse.emf.teneo.samples.issues.abstractreference.Person;
import org.eclipse.emf.teneo.samples.issues.abstractreference.USCity;
import org.eclipse.emf.teneo.samples.issues.abstractreference.USOfficeAddress;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests reference relations between abstract relations. This failed during compute references, the
 * test is therefore very light.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class AbstractReferenceAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public AbstractReferenceAction() {
		super(AbstractreferencePackage.eINSTANCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#hibernateEnabled()
	 */
	protected boolean hibernateEnabled() {
		return true;
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
		final AbstractreferenceFactory factory = AbstractreferenceFactory.eINSTANCE;

		// create a book, writer and library
		try {
			{
				Resource res = store.getResource();
				res.load(null);

				final USOfficeAddress uoa = factory.createUSOfficeAddress();
				uoa.setName("my uoa");
				uoa.setLocation("my location");
				uoa.setState("state");

				USCity city = factory.createUSCity();
				city.setName("my city");
				city.setState("mystate");
				uoa.getCountry().add(city);

				res.getContents().add(uoa);
				res.save(null);

				Person person = factory.createPerson();
				person.setName("myname");
				person.getAddress().add(uoa);

				res.getContents().add(person);
				res.save(null);
			}

			{
				Resource res = store.getResource();
				res.load(null);
				assertEquals(2, res.getContents().size());
				// assert(res.getContents().get(0) instanceof Person);
				res.unload();
			}

			{
				USOfficeAddress uoa = store.getObject(USOfficeAddress.class);
				Object[] eobjs = store.getCrossReferencers(uoa, true);
				assertEquals(1, eobjs.length);
			}
		} catch (IOException e) {
			throw new StoreTestException("IOException during save", e);
		}

	}
}
