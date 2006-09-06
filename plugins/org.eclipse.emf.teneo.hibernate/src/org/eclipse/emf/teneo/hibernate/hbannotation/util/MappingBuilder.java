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
 * $Id: MappingBuilder.java,v 1.4 2006/09/06 17:26:44 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import org.eclipse.emf.teneo.annotations.pamodel.util.BasicPamodelBuilder;
import org.eclipse.emf.teneo.annotations.pamodel.util.EannotationPamodelBuilder;
import org.eclipse.emf.teneo.annotations.parser.EAnnotationParserImporter;
import org.eclipse.emf.teneo.annotations.xml.XmlPersistenceMapper;
import org.eclipse.emf.teneo.mapper.DefaultAnnotator;
import org.eclipse.emf.teneo.mapper.PersistenceMappingBuilder;

/**
 * This class simply provides the Hibernate-equivalent builders to the
 * generic Elver annotation processing mechanism.
 */
public class MappingBuilder extends PersistenceMappingBuilder {

	public static final MappingBuilder INSTANCE = new MappingBuilder();
	
	protected EannotationPamodelBuilder getAnnotationModelBuilder() {
		return new HbAnnotationModelBuilder();
	}

	protected BasicPamodelBuilder getModelBuilder() {
		return new HbAnnotationModelBuilder(true);
	}

	protected DefaultAnnotator getDefaultAnnotator() {
		return new HibernateDefaultAnnotator();
	}
	
	/** Return a java annotation parser */
	protected EAnnotationParserImporter getEAnnotationParserImporter() {
		return new HbEAnnotationParserImporter();
	}

	/** Overridden to use the local schema */
	protected XmlPersistenceMapper getXmlPersistenceMapper() {
		return new LocalXmlPersistenceMapper();
	}

	/** Overridden to make use of another schema */
	private class LocalXmlPersistenceMapper extends XmlPersistenceMapper {
		// nothing here because is not needed
		
		/** Return the hb prefix */
		protected String getPrefix() {
			return "hb";
		}

	}
}
