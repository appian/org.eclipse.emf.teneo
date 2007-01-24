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
 * $Id: ReadEcore.java,v 1.1 2007/01/24 23:28:46 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.test;

import java.io.InputStream;
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
import org.eclipse.emf.teneo.hibernate.HbHelper;

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
	public static void main(String[] args) {
		try {
			final ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new EcoreResourceFactoryImpl());
			final ArrayList epackages = new ArrayList();
			final Resource res = resourceSet.getResource(URI.createFileURI("/home/mtaal/mytmp/srd.ecore"), true);
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
	
			final EPackage[] epacks = (EPackage[])epackages.toArray(new EPackage[epackages.size()]);
			
			System.err.println(HbHelper.INSTANCE.generateMapping(epacks, new Properties()));
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
