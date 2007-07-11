/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: MappingUtil.java,v 1.1 2007/07/11 14:40:45 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import org.eclipse.emf.teneo.annotations.mapper.BasicPamodelBuilder;
import org.eclipse.emf.teneo.annotations.mapper.DefaultAnnotator;
import org.eclipse.emf.teneo.annotations.parser.EAnnotationParserImporter;
import org.eclipse.emf.teneo.annotations.xml.XmlPersistenceMapper;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionUtil;
import org.eclipse.emf.teneo.hibernate.annotations.HbAnnotationModelBuilder;
import org.eclipse.emf.teneo.hibernate.annotations.HbEAnnotationParserImporter;
import org.eclipse.emf.teneo.hibernate.annotations.HbXmlPersistenceMapper;
import org.eclipse.emf.teneo.hibernate.annotations.HibernateDefaultAnnotator;

/**
 * Contains some utility methods.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class MappingUtil {

	/** Registers default hb extensions */
	public static void registerHbExtensions(ExtensionManager extensionManager) {
		extensionManager.registerExtension(ExtensionUtil.createExtension(BasicPamodelBuilder.class,
			HbAnnotationModelBuilder.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(DefaultAnnotator.class,
			HibernateDefaultAnnotator.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(EAnnotationParserImporter.class,
			HbEAnnotationParserImporter.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(XmlPersistenceMapper.class,
			HbXmlPersistenceMapper.class));
	}
}