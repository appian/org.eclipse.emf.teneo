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
 * $Id: JPOXTestStoreFactory.java,v 1.5 2007/02/01 12:34:05 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.stores;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.test.stores.AbstractTestStoreFactory;
import org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * The jpox store factory
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class JPOXTestStoreFactory extends AbstractTestStoreFactory {

	/** Creates the actual specific test store */
	protected TestStore createStoreInstance(TestDatabaseAdapter adapter, EPackage[] epackages,
			String mappingFileLocation, Properties props, InheritanceType inheritanceType) {
		return new JPOXTestStore(adapter, epackages, mappingFileLocation, props, inheritanceType);
	}
}
