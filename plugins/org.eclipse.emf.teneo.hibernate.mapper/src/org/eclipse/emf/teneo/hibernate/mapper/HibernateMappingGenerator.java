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
 *   Michael Kanaley, TIBCO Software Inc., custom type handling
 * </copyright>
 *
 * $Id: HibernateMappingGenerator.java,v 1.7 2007/01/30 10:51:47 mtaal Exp $
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
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.ecore.EModelResolver;
import org.eclipse.emf.teneo.hibernate.hbannotation.Parameter;
import org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage;
import org.eclipse.emf.teneo.simpledom.Document;
import org.eclipse.emf.teneo.simpledom.DocumentHelper;
import org.eclipse.emf.teneo.simpledom.Element;

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
		for (Iterator ip = paModel.getPaEPackages().iterator(); ip.hasNext();) {
			for (Iterator ic = ((PAnnotatedEPackage) ip.next()).getPaEClasses().iterator(); ic.hasNext();) {
				PAnnotatedEClass paClass = (PAnnotatedEClass) ic.next();

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
		if (logger.isDebugEnabled())
			logger.debug("Geneting Hibernate mapping for " + paModel);
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
				if (paEClass.getAnnotatedEClass().getInstanceClass() == Map.Entry.class && paEClass.getEntity() == null) {
					logger.debug("Ignoring " + paEClass.getAnnotatedEClass().getName() + " ignored, is a map entry");
					paEClass.setTransient(PannotationFactory.eINSTANCE.createTransient());
					return;
				}

				hbmContext.getEntityMapper().processEntity(paEClass);

			} else if (logger.isDebugEnabled())
				logger.debug("Skipping non-persistent class " + paEClass);
		}
	}

	/**
	 * Processes the typedef annotations and creates corresponding typedef instances in the mapping.
	 */
	protected void processTypedefs(PAnnotatedModel paModel) {
		// Walk thru all the packages looking for custom EDataTypes.
		for (Iterator pi = paModel.getPaEPackages().iterator(); pi.hasNext();) {
			HbAnnotatedEPackage paPackage = (HbAnnotatedEPackage) pi.next();

			// handle the typedefs
			for (Iterator it = paPackage.getHbTypeDef().iterator(); it.hasNext();) {
				final TypeDef td = (TypeDef) it.next();
				emitTypeDef(td);
			}

			// Walk thru all the classifiers of the given package.
			for (Iterator adatatypes = paPackage.getPaEDataTypes().iterator(); adatatypes.hasNext();) {
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
		for (Iterator it = td.getParameters().iterator(); it.hasNext();) {
			final Parameter param = (Parameter) it.next();
			target.addElement("param").addAttribute("name", param.getName()).addText(param.getValue());
		}
	}
}