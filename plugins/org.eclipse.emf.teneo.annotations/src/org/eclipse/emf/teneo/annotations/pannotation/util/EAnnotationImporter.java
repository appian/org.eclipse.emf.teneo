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
 * $Id: EAnnotationImporter.java,v 1.2 2006/07/04 21:56:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.pannotation.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;

/**
 * Create PAnnotation starting from EAnnotation. The importer is designed so to report as many errors as possible before
 * failing.
 * 
 * <p>
 * The encoding of EAnnotation in PAnnotation considers only EAnnotations whose source has 'org.elver.annotation.' as
 * prefix.
 * 
 * <p>
 * A (non-subordinate) EAnnotation with source org.elver.annotation.X is mapped to a PAnnotation of name X, if such a
 * PAnnotation exists and is treated as error otherwise.
 * 
 * <br/> example: an EAnnotation with source org.elver.annotation.Transient is mapped to a Version PAnnotation.
 * 
 * <p>
 * The details of the mapped EAnnotation map to the structural features of the resulting PAnnotation. If the the
 * EAnnotation has a detail k=v the corresponding PAnnotation will have its feature of name k sets to value v. If a
 * feature named k is not present in the annotation eclass an error is issued. The features for which a corresponding
 * detail has not been specified take their default value.
 * 
 * <br/> example: the EAnnotation (in emfatic syntax) <code>@Entity(name="E")</code> is mapped to an Entity PAnnotation <code>p</code> with <code>p.getName() = "E"</code>.
 * 
 * <p>
 * A parsing of the detail value take place when converting a detail to a feature value. Such parsing involves the
 * invocation of {@link EcoreUtil#createFromString(org.eclipse.emf.ecore.EDataType, java.lang.String)} and (for many
 * valued features) tokenization using whitespace delimiter.
 * 
 * <br/> example: the EAnnotation (in emfatic syntax) <code>@ManyToOne(cascade="PERSIST REMOVE")</code> is mapped to a ManyToOne PAnnotation <code>p</code> such that
 *                             <code>p.getCascade()</code> results in a list containing
 *                             <code>CascadeType.PERSIST_LITERAL</code> and <code>CascadeType.REMOVE_LITERAL</code>.
 * 
 * <p>
 * The source of an EAnnotation consists of three parts:
 * </p>
 * <ol>
 * <li>Source: http://annotation.elver.org/</li>
 * <li>An ejb3 annotation part, for example Table or AttributeOverride</li>
 * <li>A subordinate key, for a subordinate annotation (for example Column within a Columns ann.) a key is used to
 * identify the annotation to which subordinate ann. belong.</li>
 * </ol>
 * 
 * <p>
 * Whenever the detail <code>k=v</code> refers to an EReference <code>r</code> (i.e. k is the name of an EReference
 * in the corresponding annotation) the value <code>v</code> is interpreted as the id of a subordinate annotation of
 * type <code>r.getEType()</code> defined on the same EModelElement. In this casethe EReference is set to the result
 * of mapping such subordinate annotation.
 * <p>
 * It results in an error the case that no subordinate annotation is defined with the specified id.
 * <p>
 * It results in a warning a subordinate EAnnotation that is not referenced by any annotation.
 * 
 * <br/> example: the EAnnotations (in uml eannotation syntax) http://annotation.elver.org/JoinColumns value="c1 c2"
 * http://annotation.elver.org/JoinColumn/c1 name="column1" http://annotation.elver.org/JoinColumn/c2 name="column2" are
 * mapped (when defined on the same EModelElement) to a JoinColumns PAnnotation with two JoinColumn annotations with
 * names column1 and name column2..
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 */
public class EAnnotationImporter {

	public interface Handler {

		void handle(PAnnotation target);

		void warning(String msg, EAnnotation source);

		void error(String msg, EAnnotation source);
	}

	/** Prefix for PAnntation encoding annotation source */
	public static final String ANNOTATION_URI_PREFIX = "http://annotation.elver.org/";

	/** Prefix for EJB PAnntation encoding annotation source */
	public static final String ANNOTATION_URI_PREFIX_EJB = "http://ejb.elver.org/";

	/** Prefix for Hibernate PAnntation encoding annotation source */
	public static final String ANNOTATION_URI_PREFIX_HB = "http://hibernate.elver.org/";

	/** work around for EMF bug ??? Ignore details with this key */
	public static final String IGNORE_DETAIL_KEY = "appinfo";

	/**
	 * @return true if and only if the given source is the source of a PAnnotation
	 */
	public static boolean isPAnnotationSource(String source) {
		return source != null
				&& (source.startsWith(ANNOTATION_URI_PREFIX) || source.startsWith(ANNOTATION_URI_PREFIX_EJB) || source
						.startsWith(ANNOTATION_URI_PREFIX_HB));
	}

	/** Returns the correct prefix to use */
	private static String getPrefix(String source) {
		if (source.indexOf(ANNOTATION_URI_PREFIX) != -1) {
			return ANNOTATION_URI_PREFIX;
		} else if (source.indexOf(ANNOTATION_URI_PREFIX_EJB) != -1) {
			return ANNOTATION_URI_PREFIX_EJB;
		} else if (source.indexOf(ANNOTATION_URI_PREFIX_HB) != -1) {
			return ANNOTATION_URI_PREFIX_HB;
		} else {
			return ANNOTATION_URI_PREFIX;
		}
	}

	/**
	 * @return Returns the PAnnotation EClass identified by the given source.
	 */
	public static EClass getPAnnotationEClass(String source) {
		if (!isPAnnotationSource(source))
			return null;

		// DCB: Provide package in which the desired class can be found. This allows
		// for extensions to the Elver annotation processing mechanisms.
		return getEClass(source, getPrefix(source), PannotationPackage.eINSTANCE);
	}

	/**
	 * DCB: Factored some common code that can be used by annotation processing extensions
	 * 
	 * @return Returns the PAnnotation EClass identified by the given source in the given package
	 */
	protected static EClass getEClass(String source, String prefix, EPackage ePackage) {
		String annotationName = source.substring(prefix.length());

		// get rid of the subordinate part if present
		int subOrdinateIndex = annotationName.indexOf('/');
		if (subOrdinateIndex != -1) { // subannotation, skip the sub part
			annotationName = annotationName.substring(0, subOrdinateIndex);
		}

		// DCB: Don't assume use of PannotationPackage, but use the EPackage passed in as a param
		EClassifier eClassifier = ePackage.getEClassifier(annotationName);
		return eClassifier instanceof EClass ? (EClass) eClassifier : null;
	}

	/**
	 * @return Returns the PAnnotation EClass identified by the given annotation source.
	 */
	public static EClass getPAnnotationEClass(EAnnotation eAnnotation) {
		return getPAnnotationEClass(eAnnotation.getSource());
	}

	/**
	 * DCB: Renamed method for two reasons: (A) Consistency with other static method names (B) Allows me to use
	 * isSubordinate for extensions to annotation processing mechanism
	 * 
	 * @return Returns true if and only if the given annotation defines a detail with key SUBORDINATE_ID_KEY. Such
	 *         annotations are inteded to be referenced by other annotations.
	 */
	public static boolean isPAnnotationSubordinate(EAnnotation eAnnotation) {
		if (!isPAnnotationSource(eAnnotation.getSource())) {
			return false;
		}

		String annotationName = eAnnotation.getSource().substring(getPrefix(eAnnotation.getSource()).length());
		return annotationName.indexOf('/') != -1;
	}

	/**
	 * DCB: Renamed method to be consistent with other static method names. Also, factored out common code into
	 * alternate method that allows for a custom prefix specification, thus allowing for extensions to the annotation
	 * processing mechanism.
	 * 
	 * @return Return the id of the given annotation if this is a subordinate annotation. Returns <code>null</code>
	 *         otherwise.
	 */
	public static String getPAnnotationSubordinateId(EAnnotation eAnnotation) {
		return getSubordinateId(eAnnotation, getPrefix(eAnnotation.getSource()));
	}

	/**
	 * DCB: Factored out code from the old "getSubordinateId" method and parameterized the prefix
	 * 
	 * @return Return the id of the given annotation if this is a subordinate annotation. Returns <code>null</code>
	 *         otherwise
	 */
	protected static String getSubordinateId(EAnnotation eAnnotation, String prefix) {
		// get the subordinate part
		String source = eAnnotation.getSource();
		int subOrdinateIndex = source.indexOf('/', prefix.length());
		assert (subOrdinateIndex != -1);
		return source.substring(subOrdinateIndex + 1);
	}

	/**
	 * DCB: Renamed method to be consistent with names of other static methods. Also, instead of hard-coding the
	 * "collection" pannotation eclasses, pull this information from the ECore metadata. This makes use of a new
	 * annotation (http://annotation.elver.org/internal/Collection) with two details (i.e., parameters): name and
	 * packageNS. If packageNS is not specified, then PannotationPackage.eNS_URI is assumed.
	 * 
	 * @return Returns the "collection" pannotation eclass that has elements of the given eclass. Returns null if no
	 *         such pannotation exists exists.
	 */
	private static EClass getPAnnotationCollectionEClass(EClass annotationEClass) {
		if (null == annotationEClass || !PannotationPackage.eINSTANCE.getPAnnotation().isSuperTypeOf(annotationEClass))
			return null;
		EAnnotation annotation = annotationEClass.getEAnnotation("http://annotation.elver.org/internal/Collection");
		if (null == annotation) {
			return null;
		}
		String name = (String) annotation.getDetails().get("name");
		String pkgNS = (String) annotation.getDetails().get("packageNS");
		pkgNS = (null == pkgNS) ? PannotationPackage.eNS_URI : pkgNS;
		EPackage ePkg = EPackage.Registry.INSTANCE.getEPackage(pkgNS);
		return (null == ePkg) ? null : (EClass) ePkg.eResource().getEObject("//" + name);
	}

	/**
	 * DCB: Renamed method to be consistent with names of other static methods. Also, instead of hard-coding a reference
	 * to the valueFeature, this is retrieved via ECore introspection, which allows extensions to the annotation
	 * processing mechanisms to leverage this functionality. This assumes that the valueFeature will be named "value."
	 * 
	 * @return Create a new "collection" PAnnotation that has collEAnnoationEClass as EClass and componentPAnnotations
	 *         as members.
	 * @throws IllegalArgumentException
	 *             if the given EClass is not a "collection" EClass.
	 */
	private static PAnnotation createPAnnotationCollection(EClass collAnnotationEClass, List memberPAnnotations) {
		if (!PannotationPackage.eINSTANCE.getPAnnotation().isSuperTypeOf(collAnnotationEClass))
			throw new IllegalArgumentException(collAnnotationEClass.getName() + " is not a \"collection\" PAnnotation.");
		EStructuralFeature valueFeature = collAnnotationEClass.getEStructuralFeature("value");
		if (null == valueFeature) {
			throw new IllegalArgumentException(collAnnotationEClass.getName() + " is not a \"collection\" PAnnotation.");
		}
		PAnnotation coll = (PAnnotation) EcoreUtil.create(collAnnotationEClass);
		((List) coll.eGet(valueFeature)).addAll(memberPAnnotations);
		return coll;
	}

	/** List of current non subordinate annotations */
	private List mainAnnotations = null;

	/** Mantains the subordinate annotations by id for the current annotations list. */
	private Map subAnnotationsById = null;

	/**
	 * Mantain the set of annotation that will be gathered in a single collection annotation during the import
	 */
	private Map collectibleAnnotationsByType = null;

	/**
	 * Mantains the set of defined but not yet processed subordinate annotations defined in the current annotation list.
	 */
	private Set unprocessedSubAnnotations;

	/** Handler of the import result */
	private Handler pannotationHandler;

	public EAnnotationImporter(Handler handler) {
		this.pannotationHandler = handler;
	}

	/**
	 * Report a warning
	 */
	protected void warning(String msg, EAnnotation annotation) {
		pannotationHandler.warning(msg, annotation);
	}

	/**
	 * Report an error
	 */
	protected void error(String msg, EAnnotation annotation) {
		pannotationHandler.error(msg, annotation);
	}

	/**
	 * Report a newly built PAnnotation.
	 */
	protected void report(PAnnotation pAnnotation) {
		pannotationHandler.handle(pAnnotation);
	}

	/**
	 * @return A newly instantiated PAnnotation whose type is given by the source of the argument annotation and whose
	 *         eModelElement is given by the argument annotation eModelElement. Returns null if such PAnnotation cannot
	 *         be created.
	 * @throws EAnnotationImportException
	 */
	protected PAnnotation createPAnnotation(EAnnotation eAnnotation) throws EAnnotationImportException {
		// DCB: Introduce indirection so that the annotation processing mechanism can be extended.
		EClass pAnnotationEClass = getElverAnnotationEClass(eAnnotation);
		if (pAnnotationEClass == null) {
			error("Unknown annotation type", eAnnotation);
			throw new EAnnotationImportException("Unknown annotation type");
		}
		PAnnotation pAnnotation = (PAnnotation) EcoreUtil.create(pAnnotationEClass);
		pAnnotation.setEModelElement(eAnnotation.getEModelElement());
		return pAnnotation;
	}

	/**
	 * @return Returns the result of converting the String value to the given data type.
	 * @throws EAnnotationImportException
	 */
	protected Object convertValue(EDataType eType, String value) throws EAnnotationImportException {
		try {
			return EcoreUtil.createFromString(eType, value);
		} catch (IllegalArgumentException e) {
			throw new EAnnotationImportException("Cannot convert '" + value + "' to '" + eType.getName() + "' type", e);
		}
	}

	/**
	 * @return Returns the result of converting the String value to the given data type.
	 * @throws EAnnotationImportException
	 */
	protected PAnnotation convertValue(EClass eType, String value) throws EAnnotationImportException {
		EAnnotation refEAnnotation = (EAnnotation) subAnnotationsById.get(value);
		if (refEAnnotation == null)
			throw new EAnnotationImportException("Cannot find referenced annotation of id '" + value + "'");
		unprocessedSubAnnotations.remove(refEAnnotation);
		PAnnotation refPAnnotation = createPAnnotation(refEAnnotation);
		// TODO drop reference to eModelElement in subordinates?
		refPAnnotation.setEModelElement(null);
		if (refPAnnotation.eClass() != eType)
			throw new EAnnotationImportException("Found type '" + refPAnnotation.eClass().getName()
					+ "' when expection type '" + eType.getName() + "'");
		initPAnnotation(refPAnnotation, refEAnnotation);
		return refPAnnotation;
	}

	protected Object convertValue(EClassifier eType, String value) throws EAnnotationImportException {
		return (eType instanceof EDataType) ? convertValue((EDataType) eType, value) : convertValue((EClass) eType,
				value);
	}

	/**
	 * Initialize the eFeature value of the given pAnnotation to the parsed value.
	 * 
	 * @throws EAnnotationImportException
	 */
	protected void initFeature(PAnnotation pAnnotation, EStructuralFeature eFeature, String value)
			throws EAnnotationImportException {
		EClassifier eType = eFeature.getEType();
		if (!eFeature.isMany()) {
			pAnnotation.eSet(eFeature, convertValue(eType, value));
		} else {
			String[] sources = (eFeature.isMany()) ? value.split("\\s+") : new String[] { value };
			List referenced = new ArrayList(sources.length);
			for (int i = 0; i < sources.length; i++)
				referenced.add(convertValue(eType, sources[i]));
			((List) pAnnotation.eGet(eFeature)).addAll(referenced);
		}
	}

	// DCB: Design for extension
	// Methods allows for easy overridding to add persistence-specific annotations
	// These methods all provide indirection to existing methods so that extensions can
	// plug in and/or override as necessary
	protected boolean isElverAnnotationSource(String source) {
		return EAnnotationImporter.isPAnnotationSource(source);
	}

	protected boolean isElverSubordinate(EAnnotation eAnnotation) {
		return EAnnotationImporter.isPAnnotationSubordinate(eAnnotation);
	}

	protected String getElverSubordinateId(EAnnotation eAnnotation) {
		return EAnnotationImporter.getPAnnotationSubordinateId(eAnnotation);
	}

	protected EClass getElverAnnotationEClass(EAnnotation eAnnotation) {
		return EAnnotationImporter.getPAnnotationEClass(eAnnotation);
	}

	protected EClass getElverCollectionEClass(EClass eClass) {
		return EAnnotationImporter.getPAnnotationCollectionEClass(eClass);
	}

	protected PAnnotation createElverCollection(EClass collAnnotationEClass, List memberPAnnotations) {
		return EAnnotationImporter.createPAnnotationCollection(collAnnotationEClass, memberPAnnotations);
	}

	/**
	 * Sets the list of visible annotations used used the import process.
	 */
	protected void setFocusOn(List eAnnotations) {
		if (mainAnnotations != null)
			throw new IllegalStateException("Processing annotation list started before previous was complete");

		mainAnnotations = new ArrayList();
		subAnnotationsById = new HashMap();
		unprocessedSubAnnotations = new HashSet();
		collectibleAnnotationsByType = new HashMap();
		for (Iterator i = eAnnotations.iterator(); i.hasNext();) {
			EAnnotation eAnnotation = (EAnnotation) i.next();
			// DCB: Make use of new methods (i.e., indirection) to allow behaviors to be customized
			// for annotation processing extensions
			if (isElverAnnotationSource(eAnnotation.getSource())) { // ignore otherwise
				if (isElverSubordinate(eAnnotation)) {
					subAnnotationsById.put(getElverSubordinateId(eAnnotation), eAnnotation);
				} else {
					// the collection pannotation is retrieved, each annotation which can be specified individually or
					// as part
					// of a collection is identified here

					// DCB: Leverage indirection for DFX
					EClass containerPAnnotationEClass = getElverCollectionEClass(getElverAnnotationEClass(eAnnotation));
					if (containerPAnnotationEClass != null
							&& PannotationPackage.eINSTANCE.isTarget(containerPAnnotationEClass, eAnnotation
									.getEModelElement().eClass())) {
						List collectibleAnnotations = (List) collectibleAnnotationsByType
								.get(containerPAnnotationEClass);
						if (collectibleAnnotations == null) {
							collectibleAnnotations = new ArrayList();
							collectibleAnnotationsByType.put(containerPAnnotationEClass, collectibleAnnotations);
						}
						collectibleAnnotations.add(eAnnotation);
					} else {
						mainAnnotations.add(eAnnotation);
					}
				}
			}
		}

		// check for duplicate annotations
		Set usedAnnotations = new HashSet(collectibleAnnotationsByType.keySet());
		for (ListIterator i = mainAnnotations.listIterator(); i.hasNext();) {
			EAnnotation eAnnotation = (EAnnotation) i.next();
			// DCB: Indirection for DFX
			if (!usedAnnotations.add(getElverAnnotationEClass(eAnnotation))) {
				error("Duplicate annotation", eAnnotation);
				// drop duplicate
				i.remove();
			}
		}
	}

	/**
	 * Reset the list of "in scope" annotations used in the import process.
	 */
	protected void unsetFocus() {
		if (mainAnnotations == null)
			throw new IllegalStateException("Processing annotation list concluded before starting");
		mainAnnotations = null;
		subAnnotationsById = null;
		collectibleAnnotationsByType = null;
		// report unprocessed
		for (Iterator i = unprocessedSubAnnotations.iterator(); i.hasNext();) {
			warning("Unreferenced subordinate annotation", (EAnnotation) i.next());
		}
		unprocessedSubAnnotations = null;
	}

	/**
	 * Init the given pAnnotation content according to the given eAnnotation.
	 * 
	 * @throws EAnnotationImportException
	 *             if the conversion fails.
	 */
	protected void initPAnnotation(PAnnotation pAnnotation, EAnnotation eAnnotation) throws EAnnotationImportException {
		// DCB: Indirection for DFX
		if (pAnnotation.eClass() != getElverAnnotationEClass(eAnnotation)) {
			error("Trying to initialize " + pAnnotation + " from " + eAnnotation.getSource(), eAnnotation);
			throw new EAnnotationImportException("Trying to initialize " + pAnnotation + " from "
					+ eAnnotation.getSource() + " in " + eAnnotation.getSource());
		}
		final EClass pAnnotationEClass = pAnnotation.eClass();
		for (Iterator i = eAnnotation.getDetails().entrySet().iterator(); i.hasNext();) {
			Map.Entry pAnnotationDetails = (Map.Entry) i.next();
			String fName = (String) pAnnotationDetails.getKey();
			if (!fName.equals(IGNORE_DETAIL_KEY)) {
				String fValue = (String) pAnnotationDetails.getValue();
				EStructuralFeature eFeature = pAnnotationEClass.getEStructuralFeature(fName);
				if (eFeature == null) {
					error("Illegal attribute '" + fName + "'", eAnnotation);
					throw new EAnnotationImportException("Illegal attribute '" + fName + "' in "
							+ eAnnotation.getSource());
				} else if (!eFeature.isTransient() && !eFeature.isDerived()) {
					try {
						initFeature(pAnnotation, eFeature, fValue);
					} catch (EAnnotationImportException e) {
						error("Error setting feature '" + eFeature.getName() + "' [" + e.getMessage() + "]",
								eAnnotation);
						throw e;
					}
				}
			}
		}
	}

	/**
	 * @return Returns the PAnnotation "interpretation" of the given EAnnotation.
	 * @throws EAnnotationImportException
	 *             if the conversion fails.
	 */
	protected PAnnotation process(EAnnotation eAnnotation) throws EAnnotationImportException {
		PAnnotation pAnnotation = createPAnnotation(eAnnotation);
		if (!PannotationPackage.eINSTANCE.isTarget(pAnnotation.eClass(), eAnnotation.getEModelElement().eClass())) {
			error("Annotation type '" + pAnnotation.eClass().getName() + "' does not apply to EClass '"
					+ eAnnotation.getEModelElement().eClass() + "'", eAnnotation);
			throw new EAnnotationImportException("Non admitted annotation type");
		}
		initPAnnotation(pAnnotation, eAnnotation);
		return pAnnotation;
	}

	/**
	 * Sets the handler for the import process.
	 */
	public void setHandler(Handler handler) {
		pannotationHandler = handler;
	}

	/**
	 * Converts the given list of annotations reporting results (and errors) to the handler.
	 */
	public void process(List eAnnotations) {
		setFocusOn(eAnnotations);
		try {
			for (Iterator i = mainAnnotations.iterator(); i.hasNext();) {
				try {
					report(process((EAnnotation) i.next()));
				} catch (EAnnotationImportException e) {
					// ignore errors already reported
				}
			}
			for (Iterator i = collectibleAnnotationsByType.entrySet().iterator(); i.hasNext();) {
				Map.Entry entry = (Entry) i.next();
				EClass collAnnotationEClass = (EClass) entry.getKey();
				List componentEAnnotations = (List) entry.getValue();
				try {
					List componentPAnnotations = new ArrayList(componentEAnnotations.size());
					EModelElement targetElement = ((EAnnotation) componentEAnnotations.get(0)).getEModelElement();
					for (Iterator j = componentEAnnotations.iterator(); j.hasNext();)
						componentPAnnotations.add(process((EAnnotation) j.next()));
					// DCB: Indirection for DFX
					PAnnotation collAnnotation = createElverCollection(collAnnotationEClass, componentPAnnotations);
					collAnnotation.setEModelElement(targetElement);
					report(collAnnotation);
				} catch (EAnnotationImportException e) {
					// ignore errors already reported
				}
			}
		} finally {
			unsetFocus();
		}
	}

	/**
	 * Converts the list of annotations associated to the given model element reporting results (and errors) to the
	 * handler.
	 */
	public void process(EModelElement eModelElement) {
		final List annotations;
		if (eModelElement instanceof EAttribute) {
			annotations = getMergedAnnotations((EAttribute) eModelElement);
		} else {
			annotations = eModelElement.getEAnnotations();
		}
		process(annotations);
	}

	/**
	 * Obtains a list of EAnnotations for an EAttribute, merged with the EAnnotations of its EDataType.
	 */
	private List getMergedAnnotations(EAttribute eAttribute) {
		final List annotations = new ArrayList();
		annotations.addAll(eAttribute.getEAnnotations());
		EcoreUtil.Copier copier = null; // Copier is lazily constructed, because in the majority of cases we won't even
										// have any EAnnotations to copy.
		final List typeAnnotations = eAttribute.getEType().getEAnnotations();
		for (Iterator it = typeAnnotations.iterator(); it.hasNext();) {
			final EAnnotation annotation = (EAnnotation) it.next();
			if (eAttribute.getEAnnotation(annotation.getSource()) == null) {
				EClass pAnnotationEClass = getPAnnotationEClass(annotation.getSource());
				if (pAnnotationEClass != null
						&& PannotationPackage.eINSTANCE.isTarget(pAnnotationEClass, eAttribute.eClass())) {
					if (copier == null) {
						copier = new EcoreUtil.Copier();
					}
					final EAnnotation newAnnotation = (EAnnotation) copier.copy(annotation);
					newAnnotation.setEModelElement(eAttribute);
					annotations.add(newAnnotation);
				}
			}
		}
		return annotations;
	}
}
