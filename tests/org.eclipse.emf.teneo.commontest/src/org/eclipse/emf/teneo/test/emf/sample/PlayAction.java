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
 * $Id: PlayAction.java,v 1.8 2007/07/04 19:28:21 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayType;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests by reading a play.xml file storing it in the database, then retrieve it again, store it in an xml file and
 * compare the data in this xml file with the original.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public class PlayAction extends AbstractTestAction {
	public PlayAction() {
		super(PlayPackage.eINSTANCE);
	}

	/** Creates a supplier, a product, relates then, saves and retrieves them again. */
	@Override
	@SuppressWarnings("unchecked")
	public void doAction(TestStore store) {
		// read play.xml as a resource!
		PlayType play = null;
		try {
			// read from the resource
			{
				// a file handle to the current class
				// the play.xml is in the model directory
				final Resource resource = new XMLResourceImpl();
				resource.load(PlayType.class.getResourceAsStream("data/small_play.xml"), Collections.EMPTY_MAP);
				resource.load(Collections.EMPTY_MAP);
				play = (PlayType) resource.getContents().get(0);
				// resource.unload();
			}

			// store the play in the database
			{
				store.beginTransaction();
				store.store(play);
				/*
				 * apparently jpox started to find the element name group a reserved word which was
				 * not allowed anymore in the where clause. List list = store.query("SELECT FROM
				 * org.eclipse.emf.teneo.test.emf.sample.play.impl.SceneTypeImpl WHERE " + "
				 * group.contains(sceneGroup) && sceneGroup.speech == speech &&" + "
				 * speech.group.contains(puckSpeaker) && puckSpeaker.speaker==\"PUCK\"" + "
				 * VARIABLES org.eclipse.emf.teneo.test.emf.sample.play.impl.SceneTypeImplgroup
				 * sceneGroup; " + " org.eclipse.emf.teneo.test.emf.sample.play.impl.SpeechTypeImpl
				 * speech; " + " org.eclipse.emf.teneo.test.emf.sample.play.impl.SpeechTypeImplgroup
				 * puckSpeaker"); assertEquals(6, list.size());
				 */
				store.commitTransaction();
				play = null;
			}

			// read from the relational store
			// and save it in a xml byte array
			byte[] bytes;
			{
				store.beginTransaction();
				final PlayType myplay = store.getObject(PlayType.class);
				final ByteArrayOutputStream bos = new ByteArrayOutputStream();
				final Resource resource = new XMLResourceImpl();
				resource.getContents().add(myplay);
				resource.save(bos, Collections.EMPTY_MAP);
				bytes = bos.toByteArray();
				store.commitTransaction();
			}

			// now compare the two resources
			compareResult("small_play.xml", bytes, true);
		} catch (Exception e) {
			throw new StoreTestException("Exception when loading play.xml", e);
		}
	}

	/** Compare the original and the generated xml file */
	@SuppressWarnings("unchecked")
	protected void compareResult(String fileNameOne, byte[] bytes, boolean asXML) throws IOException {
		final InputStream isOne = PlayType.class.getResourceAsStream("data/" + fileNameOne);

		final Resource original_resource;
		if (asXML) {
			original_resource = new XMLResourceImpl();
		} else {
			original_resource = new XMIResourceImpl();
		}
		original_resource.load(isOne, Collections.EMPTY_MAP);
		final Iterator original_iterator = original_resource.getAllContents();

		final Resource new_resource;
		if (asXML) {
			new_resource = new XMLResourceImpl();
		} else {
			new_resource = new XMIResourceImpl();
		}
		new_resource.load(new ByteArrayInputStream(bytes), Collections.EMPTY_MAP);
		final Iterator new_iterator = new_resource.getAllContents();

		// rough structural test
		while (original_iterator.hasNext()) {
			assertTrue("The new_play.xml has less nodes", new_iterator.hasNext());

			final EObject original_object = (EObject) original_iterator.next();
			final EObject new_object = (EObject) new_iterator.next();
			assertEquals(original_object.getClass(), new_object.getClass());
		}
		assertTrue("The original_play.xml has less nodes", !new_iterator.hasNext());
	}
}
