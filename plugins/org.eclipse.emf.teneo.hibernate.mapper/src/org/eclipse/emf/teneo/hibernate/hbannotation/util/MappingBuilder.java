/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Douglas Bitting </copyright> $Id:
 * MappingBuilder.java,v 1.3 2007/02/01 12:35:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import org.eclipse.emf.teneo.annotations.mapper.DefaultAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.PersistenceMappingBuilder;
import org.eclipse.emf.teneo.annotations.pamodel.util.BasicPamodelBuilder;
import org.eclipse.emf.teneo.annotations.parser.EAnnotationParserImporter;
import org.eclipse.emf.teneo.annotations.xml.XmlPersistenceMapper;

/**
 * This class simply provides the Hibernate-equivalent builders to the generic Elver annotation
 * processing mechanism.
 */
public class MappingBuilder extends PersistenceMappingBuilder {

	public static final MappingBuilder INSTANCE = new MappingBuilder();

	@Override
	protected BasicPamodelBuilder getModelBuilder() {
		return new HbAnnotationModelBuilder();
	}

	@Override
	protected DefaultAnnotator getDefaultAnnotator() {
		return new HibernateDefaultAnnotator();
	}

	/** Return a java annotation parser */
	@Override
	protected EAnnotationParserImporter getEAnnotationParserImporter() {
		return new HbEAnnotationParserImporter();
	}

	/** Overridden to use the local schema */
	@Override
	protected XmlPersistenceMapper getXmlPersistenceMapper() {
		return new LocalXmlPersistenceMapper();
	}

	/** Overridden to make use of another schema */
	private class LocalXmlPersistenceMapper extends XmlPersistenceMapper {
		// nothing here because is not needed

		/** Return the hb prefix */
		@Override
		protected String getPrefix() {
			return "hb";
		}

	}
}
