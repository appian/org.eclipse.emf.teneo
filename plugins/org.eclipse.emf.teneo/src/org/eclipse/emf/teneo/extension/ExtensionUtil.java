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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ExtensionUtil.java,v 1.1 2007/07/11 14:41:06 mtaal Exp $
 */

package org.eclipse.emf.teneo.extension;

import org.eclipse.emf.teneo.annotations.mapper.BasicPamodelBuilder;
import org.eclipse.emf.teneo.annotations.mapper.DefaultAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.PersistenceMappingBuilder;
import org.eclipse.emf.teneo.annotations.parser.EAnnotationParserImporter;
import org.eclipse.emf.teneo.annotations.xml.XmlPersistenceMapper;
import org.eclipse.emf.teneo.classloader.ClassLoaderStrategy;
import org.eclipse.emf.teneo.classloader.ContextClassLoaderStrategy;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.ClassicSQLNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.EntityResolvingNameStrategy;

/**
 * Contains simple utility methods.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class ExtensionUtil {

	/** Creates a default extension */
	public static Extension createExtension(Class<?> extensionPoint, Class<?> clz) {
		final Extension extension = new Extension();
		extension.setPoint(extensionPoint.getName());
		extension.setClassName(clz.getName());
		extension.setDefaultExtension(true);
		return extension;
	}

	public static Extension createExtension(String pointClassName, boolean singleton) {
		final Extension extension = new Extension();
		extension.setPoint(pointClassName);
		extension.setClassName(pointClassName);
		extension.setDefaultExtension(true);
		extension.setSingleton(singleton);
		return extension;
	}

	/** Register a number of default Extensions */
	public static void registerDefaultExtensions(ExtensionManager em) {

		// the ones coming from this plugin
		em.registerExtension(createExtension(BasicPamodelBuilder.class, BasicPamodelBuilder.class));
		em.registerExtension(createExtension(DefaultAnnotator.class, DefaultAnnotator.class));
		em.registerExtension(createExtension(EAnnotationParserImporter.class, EAnnotationParserImporter.class));
		em.registerExtension(createExtension(PersistenceMappingBuilder.class, PersistenceMappingBuilder.class));
		em.registerExtension(createExtension(XmlPersistenceMapper.class, XmlPersistenceMapper.class));
		em.registerExtension(createExtension(ClassLoaderStrategy.class, ContextClassLoaderStrategy.class));
		em.registerExtension(createExtension(EntityNameStrategy.class, EntityResolvingNameStrategy.class));
		em.registerExtension(createExtension(SQLNameStrategy.class, ClassicSQLNameStrategy.class));

		// from the hibernate plugin
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.HbContext", true));

		// hibernate mapper
		em
			.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.HibernateMappingGenerator",
				false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.MappingContext", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.BasicMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.EmbeddedMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.EntityMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.FeatureMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.IdMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.ManyAttributeMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.ManyToManyMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.ManyToOneMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.MappingContext", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.OneToManyMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.hibernate.mapper.OneToOneMapper", false));

		// jpox mapping
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.association.EmbeddedMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.association.ManyToManyMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.association.ManyToOneMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.association.OneToManyMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.association.OneToOneMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.property.BasicMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.property.ColumnMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.property.EClassFeatureMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.property.IdMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.property.InheritanceMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.property.JoinColumnMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.property.ManyBasicMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.property.TableMapper", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.JPOXMappingGenerator", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.MappingContext", false));
		em.registerExtension(createExtension("org.eclipse.emf.teneo.jpox.mapper.NamingHandler", false));
	}
}