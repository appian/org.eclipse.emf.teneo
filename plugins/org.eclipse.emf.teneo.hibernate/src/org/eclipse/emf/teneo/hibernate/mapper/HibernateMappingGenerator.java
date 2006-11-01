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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: HibernateMappingGenerator.java,v 1.3 2006/11/01 11:39:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.simpledom.Document;
import org.eclipse.emf.teneo.simpledom.DocumentHelper;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * The main starting point for generating a hibernate mapping from a PAnnotated model.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class HibernateMappingGenerator {

	/** The logger */
	private static final Log logger = LogFactory.getLog(HibernateMappingGenerator.class);

	/** The list of processed annotated classes */
	private Set processedPAClasses = null;

	/** the mapping context */
	private final MappingContext hbmContext;

	/**
	 * Instantiate an Hibernate mapping generator using the given context and the given entity mapper.
	 */
	HibernateMappingGenerator(final MappingContext hbmContext) {
		this.hbmContext = hbmContext;
	}

	/**
	 * Instantiate an Hibernate mapping generator using the given context and the given entity mapper.
	 */
	public HibernateMappingGenerator(PersistenceOptions po) {
		this.hbmContext = new MappingContext();
		this.hbmContext.setMappingProperties(po);
	}

	/**
	 * Register the entity names in context.
	 */
	private void initEntityNames(MappingContext hbmContext, PAnnotatedModel paModel) {
		for (Iterator ip = paModel.getPaEPackages().iterator(); ip.hasNext();) {
			for (Iterator ic = ((PAnnotatedEPackage) ip.next()).getPaEClasses().iterator(); ic.hasNext();) {
				PAnnotatedEClass paClass = (PAnnotatedEClass) ic.next();
				if (paClass.getEntity() != null)
					hbmContext.setEntityName(paClass.getAnnotatedEClass(), getEntityName(paClass));
			}
		}
	}

	/**
	 * @return Returns the entity name for the given paClass
	 */
	private String getEntityName(PAnnotatedEClass paClass) {
		String name = paClass.getEntity().getName();
		if (name == null)
			// TODO sure we do not need package here?
			// MT: I think for 99.9% of the cases there are no name clashes but it is possible to
			// that a package name is required to make things unique. This can be done in a next release as an
			// optional feature.
			name = StoreUtil.getEClassURI(paClass.getAnnotatedEClass(), hbmContext.getQualifyEntityNames());
		return name;
	}

	/** Generate a hibernate mapping xml document from the pamodel */
	public Document generate(PAnnotatedModel paModel) throws MappingException {
		if (logger.isDebugEnabled())
			logger.debug("Geneting Hibernate mapping for " + paModel);
		try {
			hbmContext.beginDocument(createDocument());
			initEntityNames(hbmContext, paModel);
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
		return mappingDoc;
	}

	/** Process all annotated classes of the pamodel */
	protected void processPersistentClasses(PAnnotatedModel paModel) {
		try {
			processedPAClasses = new HashSet();
			for (Iterator pi = paModel.getPaEPackages().iterator(); pi.hasNext();) {
				PAnnotatedEPackage paPackage = (PAnnotatedEPackage) pi.next();
				for (Iterator ci = paPackage.getPaEClasses().iterator(); ci.hasNext();) {
					PAnnotatedEClass paEClass = (PAnnotatedEClass) ci.next();
					processPAClass(paEClass);
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
				if (paEClass.getAnnotatedEClass().getInstanceClass() == Map.Entry.class &&
						paEClass.getEntity() == null) {
					logger.debug("Ignoring " + paEClass.getAnnotatedEClass().getName() + " ignored, is a map entry");
					paEClass.setTransient(PannotationFactory.eINSTANCE.createTransient());
					return;
				}

				hbmContext.getEntityMapper().processEntity(paEClass);

			} else if (logger.isDebugEnabled())
				logger.debug("Skipping non-persistent class " + paEClass);
		}
	}
}