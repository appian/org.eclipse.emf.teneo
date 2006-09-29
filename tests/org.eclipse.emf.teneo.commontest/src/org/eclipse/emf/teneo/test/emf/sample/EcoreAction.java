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
 * $Id: EcoreAction.java,v 1.1 2006/09/29 12:30:28 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests persisting of ecore models in a relational store.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public class EcoreAction extends AbstractTestAction {
	
	/** Constructor */
	public EcoreAction() {
		super(EcorePackage.eINSTANCE);
	}

	/** Creates a supplier, a product, relates then, saves and retrieves them again. */
	public void doAction(TestStore store) {
		
		// read ecore as a resource
		try {
			// read from the resource
			{
				// a file handle to the current class
				// the play.xml is in the model directory
				final Resource resource = new XMIResourceImpl();
				resource.load(this.getClass().getResourceAsStream("library.ecore"), Collections.EMPTY_MAP);
				resource.load(Collections.EMPTY_MAP);
				//EPackage epack = (EPackage)resource.getContents().get(0);
				// resource.unload();
				store.beginTransaction();
				store.store(EcorePackage.eINSTANCE);
				store.commitTransaction();
			}

			// read from the relational store
			// and save it in a xml byte array
			byte[] bytes;
			{
				store.beginTransaction();
				final List result = store.getObjects(EPackage.class);
				final ByteArrayOutputStream bos = new ByteArrayOutputStream();
				final Resource resource = new XMIResourceImpl();
				resource.getContents().addAll(result);
				resource.save(bos, Collections.EMPTY_MAP);
				bytes = bos.toByteArray();
				store.commitTransaction();
			}

			// now compare the two resources
			compareResult("library.ecore", bytes);

		} catch (Exception e) {
			throw new StoreTestException("Exception when testing persistence of ecore", e);
		}
	}

	/** Compare the original and the generated xml file */
	protected void compareResult(String fileNameOne, byte[] bytes) throws IOException {
		final InputStream isOne = this.getClass().getResourceAsStream(fileNameOne);

		final Resource original_resource = new XMIResourceImpl();
		original_resource.load(isOne, Collections.EMPTY_MAP);
		final Iterator original_iterator = original_resource.getAllContents();

		final Resource new_resource = new XMIResourceImpl();
		new_resource.load(new ByteArrayInputStream(bytes), Collections.EMPTY_MAP);
		final Iterator new_iterator = new_resource.getAllContents();

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
