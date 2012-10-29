/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright> 
 *
 * $Id: QuickStart.java,v 1.7 2010/11/11 10:28:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test;

import java.util.Properties;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.DocumentRoot;
import org.eclipse.bpmn2.RootElement;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.dd.dc.DcPackage;
import org.eclipse.dd.di.DiPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Session;
import org.hibernate.cfg.Environment;

/**
 * To do quick tests outside of the main testbed
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class QuickTest {

	/** The main method */
	public static void main(String[] args) {
		// the name of the database, this database should exist but does not
		// need to contain tables
		String dbName = "test";
		final HbDataStore hbds = doQuickStart(dbName); // ignore return

		final Session session = hbds.getSessionFactory().openSession();
		final DocumentRoot docRoot = Bpmn2Factory.eINSTANCE.createDocumentRoot();
		final RootElement rootElement = Bpmn2Factory.eINSTANCE.createRootElement();
		rootElement.setId("1");
		docRoot.setRootElement(rootElement);
		session.beginTransaction();
		session.saveOrUpdate(docRoot);
		session.getTransaction().commit();

	}

	/**
	 * The method performing the real action. This method is used by other tutorials therefore has it
	 * been made public and expects the database name and returns an instance of the HbDataStore.
	 */
	public static HbDataStore doQuickStart(String dbName) {

		// The hibernate properties can be set by having a hibernate.properties
		// file in the root of
		// the classpath.
		// Another approach is setting the properties in the HbDataStore.
		// For more information see section 3.1 of the Hibernate manual
		final Properties props = new Properties();
		// props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		// props.setProperty(Environment.USER, "root");
		// props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/" +
		// dbName);
		// props.setProperty(Environment.PASS, "root");
		// props.setProperty(Environment.DIALECT,
		// org.hibernate.dialect.MySQLInnoDBDialect.class.getName());

		props.setProperty(Environment.DRIVER, "org.hsqldb.jdbcDriver");
		props.setProperty(Environment.USER, "sa");
		props.setProperty(Environment.URL, "jdbc:hsqldb:mem:library");
		props.setProperty(Environment.PASS, "");
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.HSQLDialect.class.getName());

		props.setProperty(PersistenceOptions.JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS, "false");
		props.setProperty(PersistenceOptions.MAP_DOCUMENT_ROOT, "true");
		props.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
		props.setProperty(PersistenceOptions.AUTO_ADD_REFERENCED_EPACKAGES, "true");

		// the name of the session factory
		String hbName = "test";
		// create the HbDataStore using the name
		final HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);

		// set the properties
		hbds.setDataStoreProperties(props);

		// sets its epackages stored in this datastore
		hbds.setEPackages(new EPackage[] { Bpmn2Package.eINSTANCE, BpmnDiPackage.eINSTANCE,
				DcPackage.eINSTANCE, DiPackage.eINSTANCE });

		// initialize, also creates the database tables
		try {
			hbds.initialize();
		} finally {
			// print the generated mapping
			System.err.println(hbds.getMappingXML());
		}

		return hbds;
	}
}