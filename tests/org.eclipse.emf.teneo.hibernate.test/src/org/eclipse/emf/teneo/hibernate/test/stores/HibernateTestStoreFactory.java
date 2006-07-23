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
 * $Id: HibernateTestStoreFactory.java,v 1.2 2006/07/23 19:20:57 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.stores;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.hibernate.test.stores.adapters.HibernateTestDBAdapter;
import org.eclipse.emf.teneo.test.stores.AbstractTestStoreFactory;
import org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Creates a test store.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class HibernateTestStoreFactory extends AbstractTestStoreFactory {

	/** Creates the actual specific test store */
	protected TestStore createStoreInstance(TestDatabaseAdapter adapter, EPackage[] epackages, String mappingFileLocation,
			Properties props, InheritanceType inheritanceType) {
		return new HibernateTestStore((HibernateTestDBAdapter) adapter, epackages, props, inheritanceType);
	}
}
