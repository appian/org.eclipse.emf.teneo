/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.elistfactory;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

public class ExtendedMetaDataUtil {

	private static ExtendedMetaData extendedMetaData = null;

	public static ExtendedMetaData getExtendedMetaData(final EClassifier eClassifier) {
		if (extendedMetaData == null) {
			extendedMetaData = new BasicExtendedMetaData(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		}
		EPackage ePackage = eClassifier.getEPackage();
		if (extendedMetaData.getPackage(ePackage.getNsURI()) == null) {
			populateExtendedMetaData(extendedMetaData, Collections.singletonList(ePackage));
		}
		if (extendedMetaData.getPackage(ExtendedMetaData.XML_SCHEMA_URI) == null) {
			extendedMetaData.putPackage(ExtendedMetaData.XML_SCHEMA_URI, extendedMetaData
					.getPackage(XMLTypePackage.eNS_URI));
		}
		return extendedMetaData;
	}

	private static void populateExtendedMetaData(final ExtendedMetaData extendedMetaData, final List<EPackage> ePackages) {
		for (EPackage package1 : ePackages) {
			EPackage ePackage = package1;
			if (ePackage != null) {
				if (!EcorePackage.eNS_URI.equals(ePackage.getNsURI())) {
					extendedMetaData.putPackage(ePackage.getNsURI(), ePackage);
				}
				populateExtendedMetaData(extendedMetaData, ePackage.getESubpackages());
			}
		}
	}
}
