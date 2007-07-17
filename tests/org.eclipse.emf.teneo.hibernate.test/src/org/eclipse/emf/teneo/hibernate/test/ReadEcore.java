/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * ReadEcore.java,v 1.6 2007/03/18 19:18:50 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

/**
 * Reads an ecore file and creates an annotated mapping
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */
public class ReadEcore {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			final ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new EcoreResourceFactoryImpl());
			final ArrayList epackages = new ArrayList();
			final String[] ecores = new String[] { "consumer.ecore" };
			for (String ecore : ecores) {
				final Resource res =
						resourceSet
							.getResource(
								URI
									.createFileURI("/home/mtaal/mydata/dev/workspaces/nextspace/org.eclipse.emf.teneo.hibernate.test/test/" +
											ecore), true);
				res.load(new HashMap());

				Iterator it = res.getAllContents();
				while (it.hasNext()) {
					final Object obj = it.next();
					if (obj instanceof EPackage) {
						EPackage epack = (EPackage) obj;
						if (EPackage.Registry.INSTANCE.getEPackage(epack.getNsURI()) == null) {
							EPackage.Registry.INSTANCE.put(epack.getNsURI(), epack);
						}
						epackages.add(epack);
					}
				}
			}

			final EPackage[] epacks = (EPackage[]) epackages.toArray(new EPackage[epackages.size()]);

			final Properties props = new Properties();
			// props.setProperty(PersistenceOptions.PERSISTENCE_XML, "test.persistence.xml");
			// props.setProperty(PersistenceOptions.MAXIMUM_SQL_NAME_LENGTH, "25");

			System.err.println(HbHelper.INSTANCE.generateMapping(epacks, props));
			initDataStore(epacks);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	/** Initialise database and hibernate with the mapping */
	private static HbDataStore initDataStore(EPackage[] epacks) {
		HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore("test");
		final Properties props = new Properties();
		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.setProperty(Environment.USER, "root");
		props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/test");
		props.setProperty(Environment.PASS, "root");
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQLInnoDBDialect.class.getName());
		props.setProperty(PersistenceOptions.MAXIMUM_SQL_NAME_LENGTH, "100");
		props.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");

		hbds.setHibernateProperties(props);
		hbds.setPersistenceProperties(props);

		// sets its epackages stored in this datastore
		hbds.setEPackages(epacks);

		// initialize, also creates the database tables
		hbds.initialize();

		SessionFactory sessionFactory = hbds.getSessionFactory();
		return hbds;
	}
}
