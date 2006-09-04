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
 * $Id: JPOXMappingGenerator.java,v 1.6 2006/09/04 15:42:17 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable;
import org.eclipse.emf.teneo.simpledom.Document;
import org.eclipse.emf.teneo.simpledom.DocumentHelper;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Generates a jpox mapping file based on the pamodel.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class JPOXMappingGenerator {
	
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(JPOXMappingGenerator.class);

	/** The suffix used for an order column in a list */
	protected static final String ORDER_COLUMN_SUFFIX = "_IDX";

	/** The suffix used for an id column in a list */
	protected static final String ID_COLUMN_SUFFIX = "_ID";

	/**
	 * List of unique column names over all eclasses/structural features
	 */
	protected ArrayList uniqueNames = new ArrayList();

	/** The mapping context used */
	private MappingContext mappingContext;

	/** The constructor, creates all mappers etc. */
	public JPOXMappingGenerator() {
		mappingContext = new MappingContext();
	}

	/** Method gets a created annotatedModel and creates a jpox mapping file */
	public synchronized String generate(PAnnotatedModel annotatedModel) {
		// create the result xml
		Document mappingDoc = new Document();

		mappingDoc.setDocType("<!DOCTYPE jdo SYSTEM \"file:/javax/jdo/jdo.dtd\">");
		// mappingDoc.setDocType(documentFactory.createDocType("jdo",
		// "-//Sun Microsystems, Inc.//DTD Java Data Objects Metadata 2.0//EN",
		// "http://java.sun.com/dtd/jdo_2_0.dtd") );

		
		Element rootElement = new Element();
		rootElement.setName("jdo");
		mappingDoc.setRoot(rootElement);

		// create an array of epackages to register to the runtime
		ArrayList epackages = new ArrayList();
		for (Iterator it = annotatedModel.getPaEPackages().iterator(); it.hasNext();) {
			PAnnotatedEPackage aPackage = (PAnnotatedEPackage) it.next();
			epackages.add(aPackage.getAnnotatedElement());
		}
		ERuntime.INSTANCE.register((EPackage[]) epackages.toArray(new EPackage[epackages.size()]));

		// group the eclasses by their impl. java package, this is required because
		// class tags should be all grouped in one package
		HashMap aClassesByPackage = new HashMap();
		for (Iterator it = annotatedModel.getPaEPackages().iterator(); it.hasNext();) {
			PAnnotatedEPackage aPackage = (PAnnotatedEPackage) it.next();
			log.info("Generating jdo for epackage " + aPackage.getAnnotatedElement().getName());
			for (Iterator aClassIterator = aPackage.getPaEClasses().iterator(); aClassIterator.hasNext();) {
				PAnnotatedEClass aClass = (PAnnotatedEClass) aClassIterator.next();
				Class implClass = ERuntime.INSTANCE.getInstanceClass((EClass) aClass.getAnnotatedElement());
				
				if (implClass == null || aClass.getAnnotatedEClass().isInterface()) continue; // ignore abstract classes

				Package implPackage = implClass.getPackage();
				ArrayList aclasses = (ArrayList) aClassesByPackage.get(implPackage);
				if (aclasses == null) {
					aclasses = new ArrayList();
					aClassesByPackage.put(implPackage, aclasses);
				}
				aclasses.add(aClass);
			}
		}

		// now walk through the packages
		Iterator packs = aClassesByPackage.keySet().iterator();
		while (packs.hasNext()) {
			Package implPackage = (Package) packs.next();
			ArrayList aclasses = (ArrayList) aClassesByPackage.get(implPackage);

			Element packElement = DocumentHelper.createElement("package");
			packElement.addAttribute("name", implPackage.getName());
			rootElement.add(packElement);

			if (aclasses.size() > 0) {
				for (Iterator aClassIt = aclasses.iterator(); aClassIt.hasNext();) {
					processClassAnnotation(packElement, (PAnnotatedEClass) aClassIt.next());
				}
			}
		}

		log.debug("JDO generation finished");
		return mappingDoc.emitXML();
	}

	/** Handles the mapping of one aClass */
	private void processClassAnnotation(Element container, PAnnotatedEClass aClass) {

		// ignore non-annotated eclasses
		if (aClass.getEntity() == null && 
				aClass.getMappedSuperclass() == null && aClass.getEmbeddable() == null) {
			return;
		}
		
		if (aClass.getAnnotatedEClass().isInterface()) {
			//final Element classElement = container.addElement("interface");
			//classElement.addAttribute("name", aClass.getAnnotatedEClass().getInstanceClassName());	
			log.debug(aClass.getAnnotatedEClass().getName() + " is interface, no explicit mapping");
			return;
		}

		EClass eclass = (EClass) aClass.getAnnotatedElement();
		log.debug("Generating for eclass: " + eclass.getName());

		// NOTE: very rough test!
		if (eclass.getName().compareTo("DocumentRoot") == 0) return;

		Class implClass = ERuntime.INSTANCE.getInstanceClass(eclass);
		if (implClass == null) {
			log.warn("EClass " + eclass.getName() + " does not have a concrete representation. "
					+ "This is not a problem for abstract eclasses");
			return;
		}

		log.debug("Impl class: " + implClass);

		// now the eclass itself
		Element classElement = container.addElement("class");
		classElement.addAttribute("name", implClass.getName()).addAttribute("requires-extent", "true").addAttribute(
				"persistence-modifier", "persistence-capable").addAttribute("detachable", "true");

		if (aClass.getEmbeddable() != null) {
			classElement.addAttribute("embedded-only", "true");
		}

		if (aClass.getIdClass() != null) {
			classElement.addAttribute("objectid-class", aClass.getIdClass().getValue());
		}

		// now do the implements subnode
		ArrayList interfaces = new ArrayList();
		collectImplements(aClass, interfaces);
		for (Iterator it = interfaces.iterator(); it.hasNext();) {
			Class iclass = (Class) it.next();
			Element impl = classElement.addElement("implements");
			impl.addAttribute("name", iclass.getName());
			log.debug("Added implements " + iclass.getName());
		}

		// process the inheritance annotation
		mappingContext.getInheritanceMapper().map(aClass, classElement);
		
		if (aClass.getTable() != null) {
			mappingContext.getTableMapper().map(aClass.getTable(), classElement);
		}

		if (aClass.hasIdAnnotatedFeature()) {
			log.debug("Has id field");
			classElement.addAttribute("identity-type", "application");
		} else {
			log.debug("No explicit id field");
			classElement.addAttribute("identity-type", "datastore");
		}

		if (aClass.getSecondaryTables() != null && aClass.getSecondaryTables().size() > 0) {
			for (Iterator it = aClass.getSecondaryTables().iterator(); it.hasNext();) {
				final SecondaryTable st = (SecondaryTable)it.next();
				final Element joinElement = classElement.addElement("join");
				joinElement.addAttribute("table", st.getName());
				for (Iterator kit = st.getPkJoinColumns().iterator(); kit.hasNext();) {
					final PrimaryKeyJoinColumn pkjc = (PrimaryKeyJoinColumn)kit.next();
					joinElement.addElement("column"). 
						addAttribute("name", pkjc.getName());
				}
			}
		}

		if (aClass.hasVersionAnnotatedFeature()) {
			PAnnotatedEAttribute versionAttribute = null;
			for (Iterator it = aClass.getPaEStructuralFeatures().iterator(); it.hasNext();) {
				PAnnotatedEStructuralFeature aStructuralFeature = (PAnnotatedEStructuralFeature) it.next();
				if (aStructuralFeature instanceof PAnnotatedEAttribute) {
					PAnnotatedEAttribute pae = (PAnnotatedEAttribute) aStructuralFeature;
					if (pae.getVersion() != null) {
						versionAttribute = pae;
					}
				}
			}
			Element version = classElement.addElement("version");
			version.addAttribute("strategy", "version-number");
			// TOOD can the version attribute also be overridden??? Seems not logical
			if (versionAttribute.getColumn() != null) {
				mappingContext.getColumnMapper().map(versionAttribute.getColumn(), version);
			}
		}

		mappingContext.setCurrentAClass(aClass);
		mappingContext.getEClassFeatureMapper().map(aClass, classElement);
		mappingContext.setCurrentAClass(null);
		mappingContext.assertEmpty();
	}

	/** Collect the implemented interfaces minus the interfaces implemented by mapped 
	 * superclasses.
	 */
	private void collectImplements(PAnnotatedEClass aClass, ArrayList result) {
		collectImplements(aClass.getAnnotatedEClass().getInstanceClass(), result);
		for (int i = 0; i < aClass.getAnnotatedEClass().getESuperTypes().size(); i++) {
			final EClass ec = (EClass)aClass.getAnnotatedEClass().getESuperTypes().get(i);
			final PAnnotatedEClass ac = aClass.getPaModel().getPAnnotated(ec);
			if (ac != null && ac.getTransient() == null && !ec.isInterface()) {
				final ArrayList inheritedInterfaces = new ArrayList();
				collectImplements(ec.getInstanceClass(), inheritedInterfaces);
				result.removeAll(inheritedInterfaces);
			}
		}
	}
	
	/** Collects all implemented interfaces */
	private void collectImplements(Class iclass, ArrayList result) {
		if (result.contains(iclass)) return;
		result.add(iclass);
		Class[] interfaces = iclass.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			collectImplements(interfaces[i], result);
		}
	}
}