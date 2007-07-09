/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * MappingUtil.java,v 1.8 2007/04/07 12:42:47 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.jpox.elist.GenericFeatureMapEntry;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeEObject;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeObject;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Generates a jpox mapping file based on the pamodel.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.12 $
 */

public class MappingUtil {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(MappingUtil.class);

	/** Returns the impl class name of an eclass */
	public static String getImplNameOfEClass(String eClassURI, MappingContext mappingContext) {
		final EClass eclass = mappingContext.getEntityNameStrategy().toEClass(eClassURI, mappingContext.getEpackages());
		if (eclass == null) {
			throw new JPOXMappingException("Uri: " + eClassURI + " does not translate to an eclass");
		}
		final Class<?> clazz = getImplClassOfEClass(eclass);
		if (clazz == null) {
			throw new JPOXMappingException("Uri: " + eClassURI + " does not translate to an instance class");
		}
		return clazz.getName();
	}

	/**
	 * Returns the impl class name of an eclass, if the eclass is an interface then the interface
	 * class is returned
	 */
	public static Class<?> getImplClassOfEClass(EClass eClass) {
		if (eClass.isInterface()) {
			return eClass.getInstanceClass();
		}
		return ERuntime.INSTANCE.getJavaClass(eClass);
	}

	/** Adds an anytype embedded element definition to the passed element */
	public static void addAnytypeMapping(Element field) {
		Element embeddedElement = field.addElement("element").addElement("embedded");
		Element fieldElement = embeddedElement.addElement("field");
		fieldElement.addAttribute("name", "classifier");
		fieldElement.addElement("column").addAttribute("name", "CLASSIFIER");
		fieldElement = embeddedElement.addElement("field");
		fieldElement.addAttribute("name", "value");
		fieldElement.addElement("column").addAttribute("name", "VALUE");
	}

	/** Adds a feature map entry mapping to the passed element */
	public static void addFeatureMapEntryMapping(Element field) {
		log.debug("Any feature entry, adding embedded tags");
		Element embeddedElement = field.addElement("element").addElement("embedded");
		Element fieldElement = embeddedElement.addElement("field");
		fieldElement.addAttribute("name", "featurePath");
		fieldElement.addElement("column").addAttribute("name", "FEATUREPATH");
		fieldElement = embeddedElement.addElement("field");
		fieldElement.addAttribute("name", "anyValue");
		fieldElement.addElement("column").addAttribute("name", "ANYVALUE");
	}

	/** Adds a generic feature map entry to the passed element */
	public static void addGenericFeatureMapEntryMapping(Element field, PAnnotatedEAttribute aAttribute, FetchType ft) {
		EAttribute eAttribute = aAttribute.getAnnotatedEAttribute();

		log.debug("Any feature entry, adding embedded tags");

		Element collection =
				field.addElement("collection").addAttribute("element-type", GenericFeatureMapEntry.class.getName());

		field.addElement("join");

		Element embeddedElement = field.addElement("element").addElement("embedded");
		Element fieldElement = embeddedElement.addElement("field").addAttribute("name", "featurePath");

		fieldElement =
				embeddedElement.addElement("field").addAttribute("name", "localAnyValue").addAttribute("embedded",
					"true");
		addExtensionImplementationClasses(fieldElement, false, false, eAttribute);

		fieldElement = embeddedElement.addElement("field").addAttribute("name", "localReferenceValue");
		if (!addExtensionImplementationClasses(fieldElement, true, false, eAttribute)) {
			fieldElement.addAttribute("embedded", "true");
		}
		fieldElement.addElement("foreign-key").addAttribute("delete-action", "restrict").addAttribute("update-action",
			"cascade");

		fieldElement = embeddedElement.addElement("field");
		fieldElement.addAttribute("name", "localContainmentReferenceValue").addAttribute("dependent", "true");
		fieldElement.addElement("foreign-key").addAttribute("delete-action", "cascade").addAttribute("update-action",
			"cascade");

		if (!addExtensionImplementationClasses(fieldElement, true, true, eAttribute)) {
			fieldElement.addAttribute("embedded", "true");
		}

		addEagerLazyLoading(collection, ft);
	}

	/** Adds the correct jpox extension based on the fetch type */
	public static void addEagerLazyLoading(Element field, FetchType ft) {
		if (ft.equals(FetchType.EAGER)) {
			field.addElement("extension").addAttribute("vendor-name", "jpox").addAttribute("key", "cache-lazy-loading")
				.addAttribute("value", "false");
		} else {
			field.addElement("extension").addAttribute("vendor-name", "jpox").addAttribute("key", "cache-lazy-loading")
				.addAttribute("value", "true");
			if (ft.equals(FetchType.EXTRA)) {
				field.addElement("extension").addAttribute("vendor-name", "jpox").addAttribute("key", "cache")
					.addAttribute("value", "false");
			}
		}
	}

	/** Returns true if the feature is a wildcard feature */
	public static boolean isWildcard(EStructuralFeature eStructuralFeature) {
		return StoreUtil.isWildCard(eStructuralFeature);
	}

	/** Returns true if the feature is a wildcard feature */
	public static boolean isGroup(EStructuralFeature eStructuralFeature) {
		return StoreUtil.isGroupFeature(eStructuralFeature);
	}

	/**
	 * Returns all the implementation classes which can be stored in a certain featuremap entry.
	 * Returns false if no impl. classes could be found
	 */
	private static boolean addExtensionImplementationClasses(Element element, boolean onlyEObject, boolean containment,
			EAttribute eattr) {
		ArrayList result = new ArrayList();
		ArrayList featureResult = new ArrayList();
		for (Object element2 : eattr.getEContainingClass().getEStructuralFeatures()) {
			EStructuralFeature efeature = (EStructuralFeature) element2;

			if (containment && efeature instanceof EReference && !((EReference) efeature).isContainment()) {
				continue;
			}

			if (!containment && onlyEObject && efeature instanceof EReference &&
					((EReference) efeature).isContainment()) {
				continue;
			}

			if (StoreUtil.isElementOfGroup(efeature, eattr)) {
				Class instanceClass = efeature.getEType().getInstanceClass();
				if (!onlyEObject && !EObject.class.isAssignableFrom(instanceClass) &&
						!String.class.isAssignableFrom(instanceClass) && efeature instanceof EAttribute) {
					if (!result.contains(instanceClass.getName())) {
						String name = instanceClass.getName();
						if (name.indexOf('.') == -1) { // assume
							log.warn("Primitive type " + name + " prepending java.lang.");
							name = "java.lang." + name.substring(0, 1).toUpperCase() + name.substring(1);
						}
						result.add(name);
						featureResult.add(efeature);
					}
				} else if (onlyEObject && efeature instanceof EReference) {
					Class implClass = ERuntime.INSTANCE.getJavaClass(((EReference) efeature).getEReferenceType());
					if (implClass != null && !result.contains(implClass.getName())) {
						result.add(implClass.getName());
						featureResult.add(efeature);
					}
				}
			}
		}

		// add extension to fieldelement
		String[] implClasses = (String[]) result.toArray(new String[result.size()]);
		EStructuralFeature[] features =
				(EStructuralFeature[]) featureResult.toArray(new EStructuralFeature[featureResult.size()]);
		StringBuffer resultStr = new StringBuffer();
		StringBuffer fResultStr = new StringBuffer();
		boolean foundImpl = implClasses.length > 0;
		if (implClasses.length > 0) {
			for (int i = 0; i < implClasses.length; i++) {
				if (resultStr.length() > 0) {
					resultStr.append(",");
					fResultStr.append(",");
				}
				resultStr.append(implClasses[i]);
				fResultStr.append(features[i].getName());
			}
		} else {
			if (onlyEObject) {
				resultStr.append(AnyTypeEObject.class.getName());
			} else {
				resultStr.append(AnyTypeObject.class.getName());
			}
		}

		element.addElement("extension").addAttribute("vendor-name", "jpox").addAttribute("key",
			"implementation-classes").addAttribute("value", resultStr.toString());

		element.addElement("extension").addAttribute("vendor-name", "teneo").addAttribute("key", "estructuralfeatures")
			.addAttribute("value", fResultStr.toString());
		return foundImpl;
	}
}