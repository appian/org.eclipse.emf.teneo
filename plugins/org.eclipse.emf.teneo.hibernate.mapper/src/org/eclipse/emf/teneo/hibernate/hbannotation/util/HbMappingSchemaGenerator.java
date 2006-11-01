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
 *   Douglas Bitting
 * </copyright>
 *
 * $Id: HbMappingSchemaGenerator.java,v 1.1 2006/11/01 16:18:43 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import java.io.FileWriter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.annotations.StoreAnnotationsException;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.annotations.xml.PersistenceMappingSchemaGenerator;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage;

/**
 * Generates the xsd for the hibernate mapping.
 */
public class HbMappingSchemaGenerator extends PersistenceMappingSchemaGenerator {

	/** The main method */
	public static void main(String[] args) {
		final HbMappingSchemaGenerator pmsg = new HbMappingSchemaGenerator();
		pmsg.setAnnotationEPackages(new EPackage[] { HbAnnotationPackage.eINSTANCE, PannotationPackage.eINSTANCE });
		pmsg.setModelEPackage(HbModelPackage.eINSTANCE);
		pmsg.setNameSpace("http://www.eclipse.org/emft/teneo");
		try {
			final FileWriter fw = new FileWriter("/home/mtaal/mytmp/persistence-mapping.xsd");
			fw.write(pmsg.generate());
			fw.close();
		} catch (Exception e) {
			throw new StoreAnnotationsException("Exception while generating mapping.xsd", e);
		}
	}
	

	/** Return the PAnnotatedEClass */
	protected EClass getPAnnotatedEPackage() {
		return (EClass) getModelEPackage().getEClassifier("HbAnnotatedEPackage");
	}

	/** Return the PAnnotatedEClass */
	protected EClass getPAnnotatedEClass() {
		return (EClass) getModelEPackage().getEClassifier("HbAnnotatedEClass");
	}

	/** Return the PAnnotatedEReference */
	protected EClass getPAnnotatedEReference() {
		return (EClass) getModelEPackage().getEClassifier("HbAnnotatedEReference");
	}

	/** Return the PAnnotatedEAttribute */
	protected EClass getPAnnotatedEAttribute() {
		return (EClass) getModelEPackage().getEClassifier("HbAnnotatedEAttribute");
	}

	/** Return the PAnnotatedEDataType */
	protected EClass getPAnnotatedEDataType() {
		return (EClass) getModelEPackage().getEClassifier("HbAnnotatedEDataType");
	}

	/** get rid of the hb- prefix */
	protected String convertToXmlName(String name) {
		String result = super.convertToXmlName(name);
		if (result.compareTo("hb-column") == 0) {
			return "columns"; // prevents a specific nameclash
		}
		if (result.startsWith("hb-")) {
			return result.substring(3);
		}
		return result;
	}
}