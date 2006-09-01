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
 * $Id: PlayImExportAction.java,v 1.2 2006/09/01 08:57:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.teneo.samples.emf.sample.play.PlayType;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests by reading a play.xml file storing it in the database, then retrieve it again, store it in an xml file
 * and compare the data in this xml file with the original.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ 
*/
public abstract class PlayImExportAction extends PlayAction {
	/** Creates a supplier, a product, relates then, saves and retrieves them again. */
	public void doAction(TestStore store) {
		try {
			final ByteArrayOutputStream bos = new ByteArrayOutputStream();
			imExport(PlayType.class.getResourceAsStream("data" + File.separator + "original_play.xml"), 
					bos, store);
			
		    // and compare the result
	    	compareResult("original_play.xml", bos.toByteArray(), true);
		} catch (IOException e) {
			throw new StoreTestException("IOException ", e);
		}
	}
	
	/** Import/export, from and to */
	protected abstract void imExport(InputStream is, OutputStream os, TestStore store);
	
}
