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
 * $Id: PlayAction.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
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
 * Tests by reading a play.xml file storing it in the database, then retrieve it again, store it in an xml file
 * and compare the data in this xml file with the original.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public class PlayAction extends AbstractTestAction 
{
	public PlayAction() 
	{
		super(PlayPackage.eINSTANCE);
	}
	
	/** Creates a supplier, a product, relates then, saves and retrieves them again. */
	public void doAction(TestStore store)
	{
		// read play.xml as a resource!
		PlayType play = null;
		try
		{
			// read from the resource
			{
				// a file handle to the current class
				// the play.xml is in the model directory
				URL xmlUrl = PlayType.class.getResource("data" + File.separator + "small_play.xml");
				final File playxmlFile = new File(xmlUrl.getFile());
				final Resource resource = new XMLResourceImpl(URI.createFileURI(playxmlFile.getAbsolutePath()));
				resource.load(Collections.EMPTY_MAP);
				play = (PlayType)resource.getContents().get(0);
				resource.unload();
			}
			
			// store the play in the database
	    	{
		        store.beginTransaction();
		        store.store(play);
		        /*
		        apparently jpox started to find the element name group a reserved word which was 
		        not allowed anymore in the where clause.
		        List list = store.query("SELECT FROM org.eclipse.emf.teneo.test.emf.sample.play.impl.SceneTypeImpl WHERE " + 
		        		" group.contains(sceneGroup) && sceneGroup.speech == speech &&" +
		        		" speech.group.contains(puckSpeaker) && puckSpeaker.speaker==\"PUCK\"" +
		        		" VARIABLES org.eclipse.emf.teneo.test.emf.sample.play.impl.SceneTypeImplgroup sceneGroup; " +
		        		" org.eclipse.emf.teneo.test.emf.sample.play.impl.SpeechTypeImpl speech; " +
		        		" org.eclipse.emf.teneo.test.emf.sample.play.impl.SpeechTypeImplgroup puckSpeaker");
		        assertEquals(6, list.size());
		        */
			    store.commitTransaction();
			    play = null;
	    	}
	    	
	    	// read from the relational store
	    	// and save it in a xml file
	    	{
				URL playTypeUrl = PlayType.class.getResource("data");
				final File parentFile = new File(playTypeUrl.getFile());
				final File xmlFile = new File(parentFile, "small_new_play.xml");

				if (xmlFile.exists()) xmlFile.delete();
				xmlFile.createNewFile();

				store.beginTransaction();
	    		final PlayType myplay = (PlayType)store.getObject(PlayType.class);
				
				final Resource resource = new XMLResourceImpl(URI.createFileURI(xmlFile.getAbsolutePath()));
				resource.getContents().add(myplay);
				resource.save(Collections.EMPTY_MAP);
	    		store.commitTransaction();
	    	}
	    	
	    	// now compare the two resources
    		compareResult("small_play.xml", "small_new_play.xml", true);
		}
		catch (Exception e)
		{
			throw new StoreTestException("Exception when loading play.xml", e);
		}
	}	
	
	/** Compare the original and the generated xml file */
	protected void compareResult(String fileNameOne, String fileNameTwo, boolean asXML) throws IOException
	{
		// a file handle to the current class
		// the play.xml is in the model directory
		URL newUrl = PlayType.class.getResource("data" + File.separator + fileNameTwo);
		final File new_play = new File(newUrl.getFile());
		URL originalUrl = PlayType.class.getResource("data" + File.separator + fileNameOne);
		final File original_play = new File(originalUrl.getFile());
		
		final Resource original_resource;
		if (asXML)
		{
			original_resource = new XMLResourceImpl(URI.createFileURI(original_play.getAbsolutePath()));
		}
		else
		{
			original_resource = new XMIResourceImpl(URI.createFileURI(original_play.getAbsolutePath()));
		}
		original_resource.load(Collections.EMPTY_MAP);
		final Iterator original_iterator = original_resource.getAllContents();

		final Resource new_resource;
		if (asXML)
		{
			new_resource = new XMLResourceImpl(URI.createFileURI(new_play.getAbsolutePath()));
		}
		else
		{
			new_resource = new XMIResourceImpl(URI.createFileURI(new_play.getAbsolutePath()));
		}
		new_resource.load(Collections.EMPTY_MAP);
		final Iterator new_iterator = new_resource.getAllContents();
		
		// rough structural test
		while (original_iterator.hasNext())
		{
			assertTrue("The new_play.xml has less nodes", new_iterator.hasNext());
			
			final EObject original_object = (EObject)original_iterator.next();
			final EObject new_object = (EObject)new_iterator.next();
			assertEquals(original_object.getClass(), new_object.getClass());
		}
		assertTrue("The original_play.xml has less nodes", !new_iterator.hasNext());
	}
}
