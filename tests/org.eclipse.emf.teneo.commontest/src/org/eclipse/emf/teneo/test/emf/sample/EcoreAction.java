/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EcoreAction.java,v 1.2 2006/10/17 09:48:04 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests persisting of ecore models in a relational store.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ 
*/
public class EcoreAction extends AbstractTestAction {
	
	/** Constructor */
	public EcoreAction() {
		super(EcorePackage.eINSTANCE);
	}

	/** Reads the library model and persists it. */
	public void doAction(TestStore store) {
		
		if (store.getInheritanceType().equals(InheritanceType.SINGLE_TABLE_LITERAL)) {
			// ignore this as this fails any way
			return; 
		}
		
		// read ecore as a resource
		final Resource resourceOne = new XMIResourceImpl();
		try {
			// read from the resource
			{
				// a file handle to the current class
				// the play.xml is in the model directory
				resourceOne.load(this.getClass().getResourceAsStream("library.ecore"), Collections.EMPTY_MAP);
				resourceOne.load(Collections.EMPTY_MAP);
				//EPackage epack = (EPackage)resource.getContents().get(0);
				// resource.unload();
				store.beginTransaction();
				final EPackage epack = (EPackage)resourceOne.getContents().get(0);
				System.err.println(epack.getName());
				store.store(epack);
				store.commitTransaction();
			}

			// read from the relational store
			// and save it in a xml byte array
			final Resource resourceTwo = new XMIResourceImpl();
			{
				store.beginTransaction();
				final List result = store.getObjects(EPackage.class);
				// get the library ecore from the result 
				EPackage libEPack = null;
				for (int i = 0; i < result.size(); i++) {
					final EPackage epack = (EPackage)result.get(i);
					// very simple test on name, ouch!
					if (epack.getName().compareToIgnoreCase("library") == 0) {
						libEPack = epack;
					}
				}
				assertNotNull(libEPack);
				resourceTwo.getContents().add(libEPack);
				store.commitTransaction();
			}

			// now compare the two resources
			compareResult(resourceOne, resourceTwo);

		} catch (Exception e) {
			throw new StoreTestException("Exception when testing persistence of ecore", e);
		}
	}

	/** Compare the original and the generated xml file */
	protected void compareResult(Resource resourceOne, Resource ResourceTwo) throws IOException {
		final Iterator original_iterator = resourceOne.getAllContents();

		final Iterator new_iterator = ResourceTwo.getAllContents();

		// rough structural test
		while (original_iterator.hasNext()) {
			assertTrue(new_iterator.hasNext());

			final EObject original_object = (EObject) original_iterator.next();
			final EObject new_object = (EObject) new_iterator.next();
			assertEquals(original_object.getClass(), new_object.getClass());
		}
		assertTrue(!new_iterator.hasNext());
	}
}
