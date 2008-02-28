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
 * $Id: PMController.java,v 1.3 2008/02/28 07:09:03 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.resource;

import java.util.Hashtable;

import javax.jdo.PersistenceManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.jpox.JpoxDataStore;
import org.eclipse.emf.teneo.jpox.JpoxStoreException;

/**
 * A pm controller handles one pm. The pm controller can be registered and 
 * retrieved by name. The pm controller is used by resources to share one pm over
 * different resources. The resources get the pm controller name as a parameter
 * in the uri.
 * 
 * This class offers the registry functionality as well as a default implementation of the 
 * pm controller.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class PMController {
	/** The logger */
	private static Log log = LogFactory.getLog(PMController.class);

	/** The static map of pm controllers */
	private static Hashtable pmControllers = new Hashtable();
	
	/** Register a pm controller */
	public static synchronized void registerPMController(String name, PMController sc) {
		if (pmControllers.get(name) != null) {
			throw new JpoxStoreException("There is already a pm controller registered with the name: " + name);
		}
		log.debug("Registering pm controller: " + name);
		pmControllers.put(name, sc);
	}

	/** Deregisters a pm controller */
	public static synchronized void deRegisterPMController(String name) {
		if (pmControllers.get(name) == null) {
			throw new JpoxStoreException("There is no pm controller registered with the name: " + name);
		}
		log.debug("De-Registering pm controller: " + name);
		pmControllers.remove(name);
	}
	
	/** Returns a pm controller using the name */
	public static synchronized PMController getPMController(String name) {
		return (PMController)pmControllers.get(name);
	}
	
	/** The local pm */
	protected PersistenceManager pm;
	
	/** The hb datastore from which the pms are retrieved */
	protected JpoxDataStore jpoxDataStore;
	
	/**
	 * @return the hbDataStore
	 */
	public JpoxDataStore getJpoxDataStore() {
		return jpoxDataStore;
	}

	/**
	 * @param hbDataStore the hbDataStore to set
	 */
	public void setJpoxDataStore(JpoxDataStore jpoxDataStore) {
		this.jpoxDataStore = jpoxDataStore;
	}

	/**
	 * @return the pm
	 */
	public PersistenceManager getPM() {
		if (pm == null) {
			pm = jpoxDataStore.getPMF().getPersistenceManager();
		}
		return pm;
	}
}
