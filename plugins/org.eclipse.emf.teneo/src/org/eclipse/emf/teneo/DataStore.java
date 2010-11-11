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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: DataStore.java,v 1.4 2010/11/11 10:28:03 mtaal Exp $
 */

package org.eclipse.emf.teneo;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.extension.ExtensionManager;

/**
 * Generic datastore interface used by hibernate and jpox.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public interface DataStore {

	/** @return the mapped epackages */
	EPackage[] getEPackages();

	/**
	 * Note: renamed from getProperties in a previous release.
	 * 
	 * @return the properties, the combination of jpox and hibernate properties
	 */
	Properties getDataStoreProperties();

	/** Return the extension manager */
	ExtensionManager getExtensionManager();

	/** Return the name */
	String getName();
}