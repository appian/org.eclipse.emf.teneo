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
 * $Id: PlayImExportAction.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.teneo.samples.emf.sample.play.PlayType;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests by reading a play.xml file storing it in the database, then retrieve it again, store it in an xml file
 * and compare the data in this xml file with the original.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public abstract class PlayImExportAction extends PlayAction {
	/** Creates a supplier, a product, relates then, saves and retrieves them again. */
	public void doAction(TestStore store) {
		try {
			URL fromUrl = PlayType.class.getResource("data" + File.separator + "original_play.xml");
			final File fromFile = new File(fromUrl.getFile());
	
			URL toUrl = PlayType.class.getResource("data");
			final File parentFile = new File(toUrl.getFile());
			final File toFile = new File(parentFile, "new_play.xml");
			if (toFile.exists()) toFile.delete();
			toFile.createNewFile();
			imExport(fromFile, toFile, store);
		    	// and compare the result
	    		compareResult("original_play.xml", "new_play.xml", true);
		} catch (IOException e) {
			throw new StoreTestException("IOException ", e);
		}
	}
	
	/** Import/export, from and to */
	protected abstract void imExport(File fromFile, File toFile, TestStore store);
	
}
