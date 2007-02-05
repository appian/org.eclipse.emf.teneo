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
 * $Id: PersistenceMappingBuilder.java,v 1.9 2007/02/05 14:37:57 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.StoreAnnotationsException;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.util.BasicPamodelBuilder;
import org.eclipse.emf.teneo.annotations.parser.EAnnotationParserImporter;
import org.eclipse.emf.teneo.annotations.xml.XmlPersistenceMapper;

/**
 * Receives a list of ecore files and generates a mapping model using different strategies. The mapping model is
 * returned.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
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

		log.debug("Deprecated eannotations with http://annotations.elver.org or http://ejb.elver.org are ignored.");
//		if (po.isIgnoreEAnnotations()) {
//			log.debug("Ignoring eannotations");
//		} else {
//			log.debug("Import eannotations");
//			// DCB: Introduce indirection so that extensions to annotation processing mechanism
//			// can provide their own model builder.
//			EannotationPamodelBuilder epb = getAnnotationModelBuilder();
//			epb.setPAnnotatedModel(pam);
//			epb.processCurrentPAnnotatedModel();
//		}

		if (po.isIgnoreEAnnotations()) {
			log.debug("Ignoring annotations");
		} else {
			log.debug("Parse annotations");
			getEAnnotationParserImporter().process(pam);
		}

		if (po.getPersistenceXmlPath() != null) {
			try {
				final InputStream in = this.getClass().getClassLoader().getResourceAsStream(po.getPersistenceXmlPath());
				if (in == null) {
					throw new RuntimeException("Could not find persistence XML resource in classpath: \""
							+ po.getPersistenceXmlPath() + "\".");
				}
				final XmlPersistenceMapper xmlPersistenceMapper = getXmlPersistenceMapper();
				xmlPersistenceMapper.setXmlMapping(in);
				xmlPersistenceMapper.applyPersistenceMapping(pam);
				in.close();
				final InputStream[] iss = getAdditionalXMLMappings();
				for (int i = 0; i < iss.length; i++) {
					xmlPersistenceMapper.setXmlMapping(iss[i]);
					xmlPersistenceMapper.applyPersistenceMapping(pam);
					iss[i].close();
				}
			} catch (IOException e) {
				throw new StoreAnnotationsException("Exception while loading xml persistence mappings", e);
			}
		}

		// now the annotations on the edatatype should be copied to the annotations on the 
		// eattribute, overwrite may not occur!
		processEDataTypeAnnotations(pam);
		
		log.debug("Add default annotations");
		// DCB: Introduce indirection so that extensions to annotation processing mechanism
		// can provide their own default annotation.
		pam.setInitialized(true);
		getDefaultAnnotator().map(pam, po);

		log.debug("Returning created pamodel");
		return pam;
	}
	
	/** For each pannotated eattribute find the pannotated edatatype and copy the values of the
	 * estructuralfeature if not yet set in the eattribute
	 */
	protected void processEDataTypeAnnotations(PAnnotatedModel pam) {
		log.debug("Copying annotations on edatatypes over eattribute annotations!");
		for (Iterator pit = pam.getPaEPackages().iterator(); pit.hasNext();) {
			final PAnnotatedEPackage pep = (PAnnotatedEPackage)pit.next();
			for (Iterator cit = pep.getPaEClasses().iterator(); cit.hasNext();) {
				final PAnnotatedEClass pec = (PAnnotatedEClass)cit.next();
				for (Iterator fit = pec.getPaEStructuralFeatures().iterator(); fit.hasNext();) {
					final PAnnotatedEStructuralFeature pef = (PAnnotatedEStructuralFeature)fit.next();
					if (pef instanceof PAnnotatedEAttribute) {
						final PAnnotatedEAttribute pea = (PAnnotatedEAttribute)pef;
						final EDataType et = (EDataType)pea.getAnnotatedEAttribute().getEAttributeType();
						final PAnnotatedEDataType ped = pam.getPAnnotated(et);
						if (ped == null) continue; // not an explicit modeled edatatype
						for (Iterator eit = ped.eClass().getEAllStructuralFeatures().iterator(); eit.hasNext();) {
							final EStructuralFeature esf = (EStructuralFeature)eit.next();
							final EStructuralFeature asf = pea.eClass().getEStructuralFeature(esf.getName());
							if (asf != null && !pea.eIsSet(asf) && ped.eIsSet(esf)) {
								log.debug("Copying value for feature " + esf.getName() +
										" from edatatype " + et.getName() + " to " + pea.getAnnotatedEAttribute().getName());
								
								final Object obj = ped.eGet(esf);
								if (obj instanceof Collection) { 
									pea.eSet(asf, EcoreUtil.copyAll((Collection)obj));
								} else if (obj instanceof EObject) {
									pea.eSet(asf, EcoreUtil.copy((EObject)obj));
								} else {
									throw new StoreAnnotationsException("Class " + obj.getClass().getName() + " not supported should be eobject or collection");
								}
							}
						}
					}
				}
			}
		}
	}
	
	// DCB: New methods to allow for extension
	protected DefaultAnnotator getDefaultAnnotator() {
		return new DefaultAnnotator();
	}

	protected BasicPamodelBuilder getModelBuilder() {
		return new BasicPamodelBuilder();
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
	
	/** Additional inputstreams for xml mappings */
	protected InputStream[] getAdditionalXMLMappings(){
		return new InputStream[0];
	}
}
