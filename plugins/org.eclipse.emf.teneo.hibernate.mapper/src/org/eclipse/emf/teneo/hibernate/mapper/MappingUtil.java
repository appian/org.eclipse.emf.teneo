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
 * $Id: MappingUtil.java,v 1.3 2007/08/10 16:41:00 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import org.eclipse.emf.teneo.annotations.mapper.BasicPamodelBuilder;
import org.eclipse.emf.teneo.annotations.mapper.EClassAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.EDataTypeAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.EFeatureAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.ManyToOneReferenceAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.OneToManyAttributeAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.OneToManyReferenceAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.OneToOneReferenceAnnotator;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.parser.EAnnotationParserImporter;
import org.eclipse.emf.teneo.annotations.xml.XmlPersistenceMapper;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionUtil;
import org.eclipse.emf.teneo.hibernate.annotations.HbAnnotationModelBuilder;
import org.eclipse.emf.teneo.hibernate.annotations.HbEAnnotationParserImporter;
import org.eclipse.emf.teneo.hibernate.annotations.HbEClassAnnotator;
import org.eclipse.emf.teneo.hibernate.annotations.HbEDataTypeAnnotator;
import org.eclipse.emf.teneo.hibernate.annotations.HbEFeatureAnnotator;
import org.eclipse.emf.teneo.hibernate.annotations.HbManyToOneReferenceAnnotator;
import org.eclipse.emf.teneo.hibernate.annotations.HbOneToManyAttributeAnnotator;
import org.eclipse.emf.teneo.hibernate.annotations.HbOneToManyReferenceAnnotator;
import org.eclipse.emf.teneo.hibernate.annotations.HbOneToOneReferenceAnnotator;
import org.eclipse.emf.teneo.hibernate.annotations.HbXmlPersistenceMapper;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement;

/**
 * Contains some utility methods.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class MappingUtil {

	/**
	 * Determine the collection element set, bag or list. Only used in case Teneo operates for
	 * non-emf code
	 */
	public static String getCollectionElement(HbAnnotatedETypeElement hbFeature) {
		final boolean hasOrderBy =
				hbFeature instanceof PAnnotatedEReference && ((PAnnotatedEReference) hbFeature).getOrderBy() != null;

		if (!hbFeature.getOneToMany().isList() || hasOrderBy) {
			return "set";
		} else if (hbFeature.getOneToMany().isList() && !hbFeature.getOneToMany().isIndexed()) {
			return "bag";
		} else {
			return "list";
		}
	}

	/** Registers default hb extensions */
	public static void registerHbExtensions(ExtensionManager extensionManager) {
		extensionManager.registerExtension(ExtensionUtil.createExtension(BasicPamodelBuilder.class,
			HbAnnotationModelBuilder.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(EAnnotationParserImporter.class,
			HbEAnnotationParserImporter.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(XmlPersistenceMapper.class,
			HbXmlPersistenceMapper.class));
		extensionManager.registerExtension(ExtensionUtil
			.createExtension(EClassAnnotator.class, HbEClassAnnotator.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(EFeatureAnnotator.class,
			HbEFeatureAnnotator.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(OneToManyAttributeAnnotator.class,
			HbOneToManyAttributeAnnotator.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(EDataTypeAnnotator.class,
			HbEDataTypeAnnotator.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(OneToManyReferenceAnnotator.class,
			HbOneToManyReferenceAnnotator.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(OneToOneReferenceAnnotator.class,
			HbOneToOneReferenceAnnotator.class));
		extensionManager.registerExtension(ExtensionUtil.createExtension(ManyToOneReferenceAnnotator.class,
			HbManyToOneReferenceAnnotator.class));

	}
}