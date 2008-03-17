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
 * $Id: StoreController.java,v 1.2 2008/03/17 19:30:36 mtaal Exp $
 */
package org.eclipse.gmf.examples.mindmap.diagram.db;

import java.io.IOException;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.HbSessionDataStore;
import org.eclipse.emf.teneo.hibernate.mapping.property.EListPropertyHandler;
import org.eclipse.emf.teneo.hibernate.mapping.property.EReferencePropertyHandler;
import org.eclipse.gmf.examples.mindmap.MindmapPackage;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.hibernate.Session;

/**
 * This class manages one Hibernate Datastore, it offers static access to a
 * singleton DataStore. It initializes the datastore using the GMF and Ecore
 * epackages and the properties in the teneo.properties.
 * 
 * @author mtaal@elver.org
 */
public class StoreController {

	// This database uri ensures that the Hibernate XML Resource is used and
	// that the
	// Map and the Diagram are loaded in the top of the resource. The dsname
	// parameter
	// is the name of the datastore initialized below.
	public static final URI DATABASE_URI = URI
			.createURI("hbxml://?dsname=mindmap&query1=from Map&query2=from Diagram");

	// provide easy access to the datastore
	private static StoreController instance = new StoreController();

	public static StoreController getInstance() {
		return instance;
	}

	private HbSessionDataStore dataStore = null;
	private boolean initialized = false;

	public Session getSession() {
		return getDataStore().getSessionFactory().openSession();
	}

	public HbSessionDataStore getDataStore() {
		if (dataStore == null) {
			dataStore = initializeDataStore();
		}

		return dataStore;
	}

	public void closeDataStore() {
		getDataStore().close();
	}

	public HbSessionDataStore initializeDataStore() {
		if (initialized) {
			return dataStore;
		}

		// create and register the datastore using the mindmap name
		final HbSessionDataStore localDataStore = new HbSessionDataStore();
		localDataStore.setName("mindmap");
		HbHelper.INSTANCE.register(localDataStore);

		// now register the epackages. There are four epackages:
		// 1) the model itself
		// 2) the GMF model
		// 3) the ecore model because GMF depends on it
		// 4) and the ecore XML type package
		final EPackage[] ePackages = new EPackage[] { MindmapPackage.eINSTANCE,
				NotationPackage.eINSTANCE, EcorePackage.eINSTANCE,
				XMLTypePackage.eINSTANCE };
		localDataStore.setEPackages(ePackages);

		// load the properties from the teneo.properties file
		try {
			final Properties props = new Properties();
			props.load(this.getClass().getResourceAsStream("teneo.properties"));

			// handle multiple inheritance in the GMF model
			props.setProperty(PersistenceOptions.PERSISTENCE_XML,
					"annotations.xml");

			localDataStore.setProperties(props);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}

		// solve a specific issue with the GMF model
		localDataStore.getExtensionManager().registerExtension(
				EListPropertyHandler.class.getName(),
				GMFEListPropertyHandler.class.getName());

		localDataStore.initialize();

		// print the hibernate mapping
		System.err.println(localDataStore.getMappingXML());
		initialized = true;

		return localDataStore;
	}
}
