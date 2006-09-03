package org.eclipse.emf.teneo.annotations.xml;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * SAX ContentHandler for processing XML annotations. Used internally by {@link XmlPersistenceMapper}.
 * 
 * @author <a href="lmfridael@elver.org">Laurens Fridael</a>
 * 
 */
class XmlAnnotationContentHandler extends DefaultHandler {
	// EAnnotation source.
	private static final String COLLECTION_SOURCE = "http://annotation.elver.org/internal/Collection";

	// Parse states

	// Document root.
	private static final int ROOT = 0;

	// <persistence-mapping>
	private static final int PERSISTENCE_MAPPING = 1;

	// <epackage>
	private static final int EPACKAGE = 2;

	// Annotation element for an <epackage>.
	private static final int EPACKAGE_ANNOTATION = 3;

	// <eclass>
	private static final int ECLASS = 4;

	// Annotation element for an <eclass>.
	private static final int ECLASS_ANNOTATION = 5;

	// <eattribute>, <ereference> or <property>.
	private static final int ESTRUCTURALFEATURE = 6;

	// Annotation element for an <eattribute>, <ereference> or <property>.
	private static final int ESTRUCTURALFEATURE_ANNOTATION = 7;

	// Annotation element inside another annotation.
	private static final int NESTED_ANNOTATION = 8;

	// Value for an annotation element.
	private static final int ANNOTATION_VALUE = 9;

	// The pattern to split the XML element names against.
	private static Pattern XML_NAME_PATTERN = Pattern.compile("-");

	/**
	 * Converts an XML element name to an Ecore name.
	 */
	private static String convertElementNameToECoreName(String elementName, boolean camelCase) {
		final String[] elementNameParts = XML_NAME_PATTERN.split(elementName);
		final StringBuffer featureName = new StringBuffer();
		for (int i = 0; i < elementNameParts.length; i++) {
			String part = elementNameParts[i];
			if (!camelCase || i > 0) {
				part = part.substring(0, 1).toUpperCase() + part.substring(1);
			}
			featureName.append(part);
		}
		return featureName.toString();
	}

	private static String convertElementNameToEClassName(String elementName) {
		return convertElementNameToECoreName(elementName, false);
	}

	private static String convertElementNameToEStructuralFeatureName(String elementName) {
		return convertElementNameToECoreName(elementName, true);
	}

	// The PAnnotatedModel that will be populated.
	private final PAnnotatedModel pAnnotatedModel;

	// The PAnnotatedEPackage to which the XML annotations will be applied.
	private PAnnotatedEPackage pAnnotatedEPackage;

	// The current PAnnotatedEClass.
	private PAnnotatedEClass pAnnotatedEClass;

	// The current PAnnotatedEStructuralFeature of pAnnotatedEClass.
	private PAnnotatedEStructuralFeature pAnnotatedEStructuralFeature;

	// Stack of PAnnotations.
	private Stack pAnnotations = new Stack();

	// The current EAttribute of the current pAnnotation. Used only for EDataTypes.
	private EAttribute pAnnotationEAttribute;

	// Stack of parse states.
	private Stack parseStates = new Stack();

	XmlAnnotationContentHandler(PAnnotatedModel pAnnotatedModel) {
		this.pAnnotatedModel = pAnnotatedModel;
		parseStates.push(new Integer(ROOT));
	}

	/**
	 * Returns the current parse state.
	 */
	private int getParseState() {
		assert (parseStates.size() >= 1) : "Parse state stack must contain at least one element.";
		return ((Integer) parseStates.peek()).intValue();
	}

	private PAnnotation getPAnnotation() {
		return (PAnnotation) pAnnotations.peek();
	}

	/**
	 * Applies an annotation on an EObject based on the given XML element name.
	 * 
	 */
	private void applyAnnotation(EObject pAnnotatedEModelElement, String elementName) throws SAXException {
		final String annotationEStructuralFeatureName = convertElementNameToEStructuralFeatureName(elementName);
		EStructuralFeature annotationEStructuralFeature = pAnnotatedEModelElement.eClass().getEStructuralFeature(
				annotationEStructuralFeatureName);
		final PAnnotation pAnnotation;
		if (annotationEStructuralFeature == null) {
			// Could not find a matching EStructuralFeature, so attempt to find an EStructuralFeature with a
			// matching collection type (AttributeOverrides, AssociationOverrides, etc.) instead.
			final String annotationEClassName = convertElementNameToEClassName(elementName);
			final EClass annotationEClass = (EClass) PannotationPackage.eINSTANCE.getEClassifier(annotationEClassName);
			pAnnotation = (PAnnotation) EcoreUtil.create(annotationEClass);
			final EAnnotation collectionEAnnotation = annotationEClass.getEAnnotation(COLLECTION_SOURCE);
			if (collectionEAnnotation == null) {
				throw new SAXException("Cannot handle element <" + elementName + ">");
			}
			final String name = (String) collectionEAnnotation.getDetails().get("name");
			final EClass collectionType = (EClass) PannotationPackage.eINSTANCE.getEClassifier(name);
			if (collectionType == null) {
				throw new SAXException("Could not find EClass \"" + name + "\" in PAnnotation EPackage.");
			}
			final List eStructuralFeatures = pAnnotatedEModelElement.eClass().getEAllStructuralFeatures();
			for (Iterator it = eStructuralFeatures.iterator(); it.hasNext();) {
				final EStructuralFeature esf = (EStructuralFeature) it.next();
				if (esf.getEType().equals(collectionType)) {
					annotationEStructuralFeature = esf;
					break;
				}
			}
			if (annotationEStructuralFeature == null) {
				throw new SAXException("Could not find EStructuralFeature with type \"" + collectionType.getName()
						+ "\".");
			} else {
				if (!pAnnotatedEModelElement.eIsSet(annotationEStructuralFeature)) {
					pAnnotatedEModelElement.eSet(annotationEStructuralFeature, EcoreUtil
							.create((EClass) annotationEStructuralFeature.getEType()));
				}
				final EObject collection = (EObject) pAnnotatedEModelElement.eGet(annotationEStructuralFeature);
				((List) collection.eGet(collection.eClass().getEStructuralFeature("value"))).add(pAnnotation);
			}

		} else {
			// Overwrite the existing annotation.
			pAnnotation = (PAnnotation) EcoreUtil.create((EClass) annotationEStructuralFeature.getEType());
			pAnnotatedEModelElement.eSet(annotationEStructuralFeature, pAnnotation);
		}
		assert (pAnnotation != null);
		pAnnotations.push(pAnnotation);
	}

	// --------------------------------------------------------------------
	// Implementation of ContentHandler interface.
	// --------------------------------------------------------------------

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// Change parse state.
		int newParseState;
		switch (getParseState()) {
		case ROOT:
			newParseState = PERSISTENCE_MAPPING;
			break;
		case PERSISTENCE_MAPPING:
			assert (localName.equals("epackage"));
			newParseState = EPACKAGE;
			break;
		case EPACKAGE:
			if (localName.equals("eclass")) {
				newParseState = ECLASS;
			} else {
				newParseState = EPACKAGE_ANNOTATION;
			}
			break;
		case ECLASS:
			if (localName.equals("eattribute") || localName.equals("ereference") || localName.equals("property")) {
				newParseState = ESTRUCTURALFEATURE;
			} else {
				newParseState = ECLASS_ANNOTATION;
			}
			break;
		case ESTRUCTURALFEATURE:
			newParseState = ESTRUCTURALFEATURE_ANNOTATION;
			break;
		case EPACKAGE_ANNOTATION:
		case ECLASS_ANNOTATION:
		case ESTRUCTURALFEATURE_ANNOTATION:
		case NESTED_ANNOTATION: {
			final String eStructuralFeatureName = convertElementNameToEStructuralFeatureName(localName);
			final EStructuralFeature annotationEStructuralFeature = getPAnnotation().eClass().getEStructuralFeature(
					eStructuralFeatureName);
			if (annotationEStructuralFeature.getEType() instanceof EClass) {
				newParseState = NESTED_ANNOTATION;
			} else {
				newParseState = ANNOTATION_VALUE;
			}
			break;
		}
		default:
			throw new AssertionError("Invalid parse state encountered.");
		}
		parseStates.push(new Integer(newParseState));

		// Act upon the new parse state.
		switch (getParseState()) {
		case EPACKAGE: {
			final String namespaceUri = attributes.getValue("namespace-uri");
			final EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(namespaceUri);
			if (ePackage == null) {
				throw new SAXException("Could not find EPackage \"" + namespaceUri + "\".");
			}
			pAnnotatedEPackage = pAnnotatedModel.getPAnnotated(ePackage);
			if (pAnnotatedEPackage == null) {
				throw new SAXException("Could not find PAnnotatedEPackage \"" + namespaceUri + "\".");
			}
			break;
		}
		case ECLASS: {
			final String eClassName = attributes.getValue("name");
			final EClassifier eClassifier = pAnnotatedEPackage.getAnnotatedEPackage().getEClassifier(eClassName);
			if (eClassifier == null) {
				throw new SAXException("Could not find EClass \"" + eClassName + "\"");
			}
			if (!(eClassifier instanceof EClass)) {
				throw new SAXException("EClassifier \"" + eClassName + "\" is not an EClass.");
			}
			pAnnotatedEClass = pAnnotatedModel.getPAnnotated((EClass) eClassifier);
			break;
		}
		case ESTRUCTURALFEATURE: {
			final String eStructuralFeatureName = attributes.getValue("name");
			final EClass eClass = pAnnotatedEClass.getAnnotatedEClass();
			final EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(eStructuralFeatureName);
			if (eStructuralFeature == null) {
				throw new SAXException("Could not find EStructuralFeature \"" + eStructuralFeatureName
						+ "\" in EClass \"" + eClass.getName() + "\".");
			} else if (localName.equals("eattribute") && !(eStructuralFeature instanceof EAttribute)) {
				throw new SAXException("EStructuralFeature \"" + eStructuralFeatureName + "\" in EClass \""
						+ eClass.getName() + "\" is not an EAttribute.");
			} else if (localName.equals("ereference") && !(eStructuralFeature instanceof EReference)) {
				throw new SAXException("EStructuralFeature \"" + eStructuralFeatureName + "\" in EClass \""
						+ eClass.getName() + "\" is not an EReference.");
			}
			pAnnotatedEStructuralFeature = pAnnotatedModel.getPAnnotated(eStructuralFeature);
			break;
		}
		case EPACKAGE_ANNOTATION:
			applyAnnotation(pAnnotatedEPackage, localName);
			break;
		case ECLASS_ANNOTATION:
			applyAnnotation(pAnnotatedEClass, localName);
			break;
		case ESTRUCTURALFEATURE_ANNOTATION:
			applyAnnotation(pAnnotatedEStructuralFeature, localName);
			break;
		case NESTED_ANNOTATION: {
			final String eStructuralFeatureName = convertElementNameToEStructuralFeatureName(localName);
			final EReference annotationEStructuralFeature = (EReference) getPAnnotation().eClass()
					.getEStructuralFeature(eStructuralFeatureName);
			applyAnnotation(annotationEStructuralFeature, localName);
			break;
		}
		case ANNOTATION_VALUE: {
			final String eStructuralFeatureName = convertElementNameToEStructuralFeatureName(localName);
			pAnnotationEAttribute = (EAttribute) getPAnnotation().eClass()
					.getEStructuralFeature(eStructuralFeatureName);
			break;
		}
		}
	}

	public void characters(char[] ch, int start, int length) throws SAXException {
		final String value = new String(ch, start, length).trim();
		if (value.length() == 0) {
			return;
		}
		switch (getParseState()) {
		case EPACKAGE_ANNOTATION:
		case ECLASS_ANNOTATION:
		case ESTRUCTURALFEATURE_ANNOTATION:
		case NESTED_ANNOTATION: {
			final PAnnotation pAnnotation = getPAnnotation();
			// If we get here, we are dealing with a PAnnotation that has only one structural feature. I.e. there are no
			// child elements. Example: <discriminator-value>MyObject</discriminator-value>
			assert (pAnnotation.eClass().getEStructuralFeatures().size() == 1);
			final EAttribute eAttribute = (EAttribute) pAnnotation.eClass().getEStructuralFeatures().get(0);
			final Object valueObject = EcoreFactory.eINSTANCE.createFromString(eAttribute.getEAttributeType(), value);
			pAnnotation.eSet(eAttribute, valueObject);
			break;
		}
		case ANNOTATION_VALUE: {
			final EDataType eDataType = pAnnotationEAttribute.getEAttributeType();
			final Object valueObject = eDataType.getEPackage().getEFactoryInstance().createFromString(eDataType, value);
			getPAnnotation().eSet(pAnnotationEAttribute, valueObject);
			break;
		}
		}
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		switch (getParseState()) {
		case EPACKAGE_ANNOTATION:
		case ECLASS_ANNOTATION:
		case ESTRUCTURALFEATURE_ANNOTATION:
			pAnnotations.pop();
			break;
		case ANNOTATION_VALUE:
			pAnnotationEAttribute = null;
			break;
		}
		parseStates.pop();
	}

	// --------------------------------------------------------------------
	// Implementation of ErrorHandler interface.
	// --------------------------------------------------------------------

	public void error(SAXParseException e) throws SAXException {
		throw e;
	}

	public void fatalError(SAXParseException e) throws SAXException {
		throw e;
	}
}