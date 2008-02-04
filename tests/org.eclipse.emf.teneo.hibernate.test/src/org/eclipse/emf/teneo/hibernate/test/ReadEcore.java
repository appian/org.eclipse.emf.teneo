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
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.QualifyingEntityNameStrategy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

/**
 * Reads an ecore file and creates an annotated mapping
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.15 $
 */
public class ReadEcore {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			if (false) {
				final ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",
					new EcoreResourceFactoryImpl());
				final ArrayList epackages = new ArrayList();
				final String[] ecores = new String[] { "/home/mtaal/mytmp/gensec.ecore" };
				for (String ecore : ecores) {
					final Resource res = resourceSet.getResource(URI.createFileURI(ecore), true);
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

				EPackage[] epacks = (EPackage[]) epackages.toArray(new EPackage[epackages.size()]);
			}
// epacks =
// new EPackage[] { _1Package.eINSTANCE, _0Package.eINSTANCE,
// customs.ru.common.aggregate.types._3._0._1._1Package.eINSTANCE,
// customs.ru.common.leaf.types._3._0._1._1Package.eINSTANCE,
// customs.ru.esad.common.aggregate.types._3._0._1._1Package.eINSTANCE,
// customs.ru.esad.common.leaf.types._3._0._1._1Package.eINSTANCE,
// customs.ru.information.customs.documents.dt.sout._3._0._1._1Package.eINSTANCE,
// customs.ru.esaddts.common.aggregate.types._3._0._1._1Package.eINSTANCE,
// customs.ru.ekts.common.aggregate.types._3._0._1._1Package.eINSTANCE,
// customs.ru.information.customs.documents.kt.sout._3._0._1._1Package.eINSTANCE };

// final Properties props = new Properties();
// props.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
// props.put(PersistenceOptions.JOIN_TABLE_NAMING_STRATEGY, "ejb3");
// props.setProperty(PersistenceOptions.PERSISTENCE_XML, "test.persistence.xml");
// props.setProperty(PersistenceOptions.MAXIMUM_SQL_NAME_LENGTH, "25");

// System.err.println(HbHelper.INSTANCE.generateMapping(epacks, props));
// HbDataStore hbds = initSimpleDataStore(new EPackage[] { GensecPackage.eINSTANCE });
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	/** Initialise database and hibernate with the mapping */
	private static HbDataStore initSimpleDataStore(EPackage[] epacks) {
		HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore("test");
		final Properties props = new Properties();
		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.setProperty(Environment.USER, "root");
		props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/test");
		props.setProperty(Environment.PASS, "root");
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQLInnoDBDialect.class.getName());
// props.setProperty(PersistenceOptions.MAPPING_FILE_PATH,
// "/org/eclipse/emf/teneo/hibernate/test/claim.hbm.xml");
// props.setProperty(PersistenceOptions.ID_FEATURE_AS_PRIMARY_KEY, "false");
		props.setProperty(PersistenceOptions.MAXIMUM_SQL_NAME_LENGTH, "25");

		hbds.setPersistenceProperties(props);
		hbds.setHibernateProperties(props);
		hbds.setEPackages(epacks);
		// initialize, also creates the database tables
		try {
			hbds.initialize();
		} finally {
			System.err.println(hbds.getMappingXML());
		}
		return hbds;
	}

	/** Initialise database and hibernate with the mapping */
	private static HbDataStore initDataStore(EPackage[] epacks) {
		HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore("test");
		final Properties props = new Properties();
		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.setProperty(Environment.USER, "root");
		props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/claim");
		props.setProperty(Environment.PASS, "root");
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQLInnoDBDialect.class.getName());
		props.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
		hbds.setHibernateProperties(props);
		props.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
		props.put(PersistenceOptions.JOIN_TABLE_NAMING_STRATEGY, "ejb3");
		props.put(PersistenceOptions.JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS, "true");
		hbds.getExtensionManager().registerExtension(EntityNameStrategy.class.getName(),
			QualifyingEntityNameStrategy.class.getName());
// props.setProperty(PersistenceOptions.PERSISTENCE_XML,
// "org/eclipse/emf/teneo/hibernate/test/test.persistence.xml");
		props.setProperty(PersistenceOptions.MAXIMUM_SQL_NAME_LENGTH, "25");
		hbds.setPersistenceProperties(props);

		// sets its epackages stored in this datastore
		hbds.setEPackages(new EPackage[] { EcorePackage.eINSTANCE, XMLTypePackage.eINSTANCE });

		// initialize, also creates the database tables
		try {
			hbds.initialize();

			Session s = hbds.getSessionFactory().openSession();
			s.beginTransaction();
			for (EPackage epack : epacks) {
				s.save(epack);
			}
			s.getTransaction().commit();

			s = hbds.getSessionFactory().openSession();
			final List l = s.createQuery("select e from ecore.EPackage e").list();
			final EPackage[] newEpacks = new EPackage[l.size()];
			int i = 0;
			for (Object o : l) {
				final EPackage epack = (EPackage) o;
				newEpacks[i++] = epack;
			}

			initSecondDataStore(newEpacks);

		} finally {
			System.err.println(hbds.getMappingXML());
		}

		SessionFactory sessionFactory = hbds.getSessionFactory();
		return hbds;
	}

	private static HbDataStore initSecondDataStore(EPackage[] epacks) {
		HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore("test2");
		final Properties props = new Properties();
		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.setProperty(Environment.USER, "root");
		props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/test");
		props.setProperty(Environment.PASS, "root");
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQLInnoDBDialect.class.getName());
		props.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
		hbds.setHibernateProperties(props);
		props.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");
		props.put(PersistenceOptions.JOIN_TABLE_NAMING_STRATEGY, "ejb3");
		props.put(PersistenceOptions.JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS, "true");
		hbds.getExtensionManager().registerExtension(EntityNameStrategy.class.getName(),
			QualifyingEntityNameStrategy.class.getName());
// props.setProperty(PersistenceOptions.PERSISTENCE_XML,
// "org/eclipse/emf/teneo/hibernate/test/test.persistence.xml");
		props.setProperty(PersistenceOptions.MAXIMUM_SQL_NAME_LENGTH, "25");
		hbds.setPersistenceProperties(props);

		// sets its epackages stored in this datastore
		hbds.setEPackages(epacks);

		// initialize, also creates the database tables
		try {
			hbds.initialize();
		} finally {
			System.err.println(hbds.getMappingXML());
		}

		SessionFactory sessionFactory = hbds.getSessionFactory();
		return hbds;
	}
}
