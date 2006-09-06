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
 * $Id: PersistenceMappingBuilder.java,v 1.5 2006/09/06 17:25:59 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.util.BasicPamodelBuilder;
import org.eclipse.emf.teneo.annotations.pamodel.util.EannotationPamodelBuilder;
import org.eclipse.emf.teneo.annotations.parser.EAnnotationParserImporter;
import org.eclipse.emf.teneo.annotations.xml.XmlPersistenceMapper;

/**
 * Receives a list of ecore files and generates a mapping model using different strategies. The mapping model is
 * returned.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class PersistenceMappingBuilder {

	/** The logger */
	protected static final Log log = LogFactory.getLog(PersistenceMappingBuilder.class);

	/** The instance to use */
	public static final PersistenceMappingBuilder INSTANCE = new PersistenceMappingBuilder();

	/** Receives a list of ecore files and returns a Mapping */
	public PAnnotatedModel buildMapping(String[] ecoreFiles, PersistenceOptions po) {
		// note options are set in call to buildPersistenceMapping(epackages)

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new EcoreResourceFactoryImpl());
		ArrayList epackages = new ArrayList();
		for (int i = 0; i < ecoreFiles.length; i++) {

			log.debug("Reading ecore file: " + ecoreFiles[i]);

			Resource res = resourceSet.getResource(URI.createFileURI(ecoreFiles[i]), true);

			Iterator it = res.getAllContents();
			while (it.hasNext()) {
				final Object obj = it.next();
				if (obj instanceof EPackage) {
					EPackage epack = (EPackage) obj;
					EPackage epackImpl = EPackage.Registry.INSTANCE.getEPackage(epack.getNsURI());
					if (epackImpl != null) {
						epackages.add(epackImpl);
					}
				}
			}
		}

		return buildMapping((EPackage[]) epackages.toArray(new EPackage[epackages.size()]), po);
	}

	/** Builds a persistence mapping for one or more epackages */
	public PAnnotatedModel buildMapping(EPackage[] epackages, PersistenceOptions po) {
		// create the pamodel

		// DCB: Introduce indirection so that extensions to annotation processing mechanism
		// can provide their own model builder.
		BasicPamodelBuilder pamodelBuilder = getModelBuilder();
		log.debug("Creating pamodel for the following epackages");
		for (int i = 0; i < epackages.length; i++) {
			log.debug(epackages[i].getName());
			pamodelBuilder.addRecurse(epackages[i]);
		}

		log.debug("Create base pannotated model");
		PAnnotatedModel pam = pamodelBuilder.getPAnnotatedModel();

		if (po.isIgnoreEAnnotations()) {
			log.debug("Ignoring eannotations");
		} else {
			log.debug("Import eannotations");
			// DCB: Introduce indirection so that extensions to annotation processing mechanism
			// can provide their own model builder.
			EannotationPamodelBuilder epb = getAnnotationModelBuilder();
			epb.setPAnnotatedModel(pam);
			epb.processCurrentPAnnotatedModel();
		}

		if (po.isIgnoreEAnnotations()) {
			log.debug("Ignoring annotations");
		} else {
			log.debug("Parse annotations");
			getEAnnotationParserImporter().process(pam);
		}

		if (po.getPersistenceXmlPath() != null) {
			final InputStream in = this.getClass().getClassLoader().getResourceAsStream(po.getPersistenceXmlPath());
			if (in == null) {
				throw new RuntimeException("Could not find persistence XML resource in classpath: \""
						+ po.getPersistenceXmlPath() + "\".");
			}
			final XmlPersistenceMapper xmlPersistenceMapper = getXmlPersistenceMapper();
			xmlPersistenceMapper.setXmlMapping(in);
			xmlPersistenceMapper.applyPersistenceMapping(pam);
		}

		log.debug("Add default annotations");
		// DCB: Introduce indirection so that extensions to annotation processing mechanism
		// can provide their own default annotation.
		getDefaultAnnotator().map(pam, po);

		log.debug("Returning created pamodel");
		return pam;
	}
	
	// DCB: New methods to allow for extension
	protected DefaultAnnotator getDefaultAnnotator() {
		return new DefaultAnnotator();
	}

	protected BasicPamodelBuilder getModelBuilder() {
		return new BasicPamodelBuilder();
	}

	/** Return the EAnnotationImporter */
	protected EannotationPamodelBuilder getAnnotationModelBuilder() {
		return new EannotationPamodelBuilder();
	}

	/** Return a java annotation parser */
	protected EAnnotationParserImporter getEAnnotationParserImporter() {
		return new EAnnotationParserImporter();
	}

	/**
	 * Returns an XmlPersistenceMapper.
	 */
	protected XmlPersistenceMapper getXmlPersistenceMapper() {
		return new XmlPersistenceMapper();
	}
}
