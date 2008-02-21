/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * ReadEcore.java,v 1.6 2007/03/18 19:18:50 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpox.test;

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
import org.eclipse.emf.teneo.jpox.JpoxHelper;

/**
 * Reads an ecore file and creates an annotated mapping
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
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
			final String[] ecores = new String[] { "/home/mtaal/mytmp/executable.ecore" };
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

			System.err.println(JpoxHelper.INSTANCE.generateMapping(epacks, new Properties()));
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
}
