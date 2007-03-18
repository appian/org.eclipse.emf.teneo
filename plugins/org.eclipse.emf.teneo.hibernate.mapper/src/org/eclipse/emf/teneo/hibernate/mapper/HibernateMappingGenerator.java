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
 *   Davide Marchignoli
 *   Michael Kanaley, TIBCO Software Inc., custom type handling
 * </copyright>
 *
 * $Id: HibernateMappingGenerator.java,v 1.12 2007/03/18 22:28:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.ecore.DefaultEClassNameStrategy;
import org.eclipse.emf.teneo.ecore.EModelResolver;
import org.eclipse.emf.teneo.hibernate.hbannotation.Parameter;
import org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage;
import org.eclipse.emf.teneo.simpledom.Document;
import org.eclipse.emf.teneo.simpledom.DocumentHelper;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * The main starting point for generating a hibernate mapping from a PAnnotated model.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class HibernateMappingGenerator {

	/** The logger */
	private static final Log log = LogFactory.getLog(HibernateMappingGenerator.class);

	/** The list of processed annotated classes */
	private Set<PAnnotatedEClass> processedPAClasses = null;

	/** the mapping context */
	private final MappingContext hbmContext;

	/**
	 * Instantiate an Hibernate mapping generator.
	 */
	HibernateMappingGenerator(final MappingContext hbmContext) {
		this.hbmContext = hbmContext;
	}

	/**
	 * Instantiate an Hibernate mapping generator.
	 */
	public HibernateMappingGenerator(PersistenceOptions po) {
		this.hbmContext = new MappingContext();
		this.hbmContext.setMappingProperties(po);
	}

	/**
	 * Instantiate an Hibernate mapping generator.
	 */
	public HibernateMappingGenerator(MappingContext mc, PersistenceOptions po) {
		this.hbmContext = mc;
		this.hbmContext.setMappingProperties(po);
	}

	/**
	 * Register the entity names in context.
	 */
	private void initEntityNames(MappingContext hbmContext, PAnnotatedModel paModel) {
		for (PAnnotatedEPackage pae : paModel.getPaEPackages()) {
			for (PAnnotatedEClass paClass : pae.getPaEClasses()) {
				if (paClass.getEntity() != null) {
					hbmContext.setEntityName(paClass.getAnnotatedEClass(), getEntityName(paClass));
				}
			}
		}
	}

	/**
	 * @return Returns the entity name for the given paClass
	 */
	private String getEntityName(PAnnotatedEClass paClass) {
		final EClass eclass = paClass.getAnnotatedEClass();
		if (false && hbmContext.isEasyEMFGenerated(eclass)) {
			return EModelResolver.instance().getJavaClass(eclass).getName();
		}

		String name = paClass.getEntity().getName();
		if (name == null) {
			// TODO sure we do not need package here?
			// MT: I think for 99.9% of the cases there are no name clashes but it is possible to
			// that a package name is required to make things unique. This can be done in a next release as an
			// optional feature.
			name = hbmContext.getEClassNameStrategy().toUniqueName(eclass);
		}
		return name;
	}

	/** Generate a hibernate mapping xml document from the pamodel */
	public Document generate(PAnnotatedModel paModel) throws MappingException {
		if (log.isDebugEnabled())
			log.debug("Geneting Hibernate mapping for " + paModel);
		try {
			hbmContext.beginDocument(createDocument());
			initEntityNames(hbmContext, paModel);
			processTypedefs(paModel);
			processPersistentClasses(paModel);
			return hbmContext.endDocument();
		} catch (MappingException exc) {
			throw new MappingException("Hibernate mapping generation failed", exc);
		}
	}

	/**
	 * Generate the hibernate mapping xml as a string
	 */
	public String generateToString(PAnnotatedModel annotatedModel) throws MappingException {
		return generate(annotatedModel).emitXML();
	}

	/**
	 * @return Returns an empty document used as template for the genration.
	 */
	protected Document createDocument() {
		Document mappingDoc = new Document();
		mappingDoc.setDocType("<!DOCTYPE hibernate-mapping PUBLIC \"-//Hibernate/Hibernate Mapping DTD 3.0//EN\" "
				+ "\"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd\">");
		mappingDoc.setRoot(DocumentHelper.createElement("hibernate-mapping"));
		// set auto-import is false if the default eclass naming strategy is not used
		if (!(hbmContext.getEClassNameStrategy() instanceof DefaultEClassNameStrategy)) {
			log.debug("Setting auto-import=false because eclassnamingstrategy is not the defaulteclassnamestrategy");
			mappingDoc.getRoot().addAttribute("auto-import", "false");
		}
		return mappingDoc;
	}

	/** Process all annotated classes of the pamodel */
	protected void processPersistentClasses(PAnnotatedModel paModel) {
		try {
			processedPAClasses = new HashSet<PAnnotatedEClass>();
			for (PAnnotatedEPackage paPackage : paModel.getPaEPackages()) {
				for (PAnnotatedEClass paEClass : paPackage.getPaEClasses()) {
					// here, we eliminate map.enties
					if(!hbmContext.isMapEMapAsTrueMap() || !StoreUtil.isMapEntry(paEClass.getAnnotatedEClass())) {
						processPAClass(paEClass);
					}
				}
			}
		} finally {
			processedPAClasses = null;
		}
	}

	/**
	 * Process the given class, ensures that processing order is consistent with inheritance order. The given paEClass
	 * is added to the processedPAClasses.
	 */
	protected void processPAClass(PAnnotatedEClass paEClass) {
		if (processedPAClasses.add(paEClass)) {
			if (paEClass.getEntity() != null) {
				// this is a persistent entity
				PAnnotatedEClass paSuperEntity = paEClass.getPaSuperEntity();
				if (paSuperEntity != null) {
					// enforce processing order consistent with inheritance order
					processPAClass(paSuperEntity);
				}

				// ignore the map entries which do not have an explicit entity
				if (paEClass.getAnnotatedEClass().getInstanceClass() == Map.Entry.class && paEClass.getEntity() == null) {
					log.debug("Ignoring " + paEClass.getAnnotatedEClass().getName() + " ignored, is a map entry");
					paEClass.setTransient(PannotationFactory.eINSTANCE.createTransient());
					return;
				}

				hbmContext.setCurrentEClass(paEClass.getAnnotatedEClass());
				hbmContext.getEntityMapper().processEntity(paEClass);

			} else if (log.isDebugEnabled())
				log.debug("Skipping non-persistent class " + paEClass);
		}
	}

	/**
	 * Processes the typedef annotations and creates corresponding typedef instances in the mapping.
	 */
	protected void processTypedefs(PAnnotatedModel paModel) {
		// Walk thru all the packages looking for custom EDataTypes.
		for (Iterator<PAnnotatedEPackage> pi = paModel.getPaEPackages().iterator(); pi.hasNext();) {
			HbAnnotatedEPackage paPackage = (HbAnnotatedEPackage) pi.next();

			// handle the typedefs
			for (TypeDef td : paPackage.getHbTypeDef()) {
				emitTypeDef(td);
			}

			// Walk thru all the classifiers of the given package.
			for (Iterator<PAnnotatedEDataType> adatatypes = paPackage.getPaEDataTypes().iterator(); adatatypes.hasNext();) {
				final HbAnnotatedEDataType hed = (HbAnnotatedEDataType) adatatypes.next();
				if (hed.getHbTypeDef() != null) {
					emitTypeDef(hed.getHbTypeDef());
				}
			}
		}
	}

	/** Emit a typedef */
	private void emitTypeDef(TypeDef td) {
		final Element target = this.hbmContext.getCurrent().addElement("typedef");
		target.addAttribute("name", td.getName());
		target.addAttribute("class", td.getTypeClass());
		for (Parameter param : td.getParameters()) {
			target.addElement("param").addAttribute("name", param.getName()).addText(param.getValue());
		}
	}
}