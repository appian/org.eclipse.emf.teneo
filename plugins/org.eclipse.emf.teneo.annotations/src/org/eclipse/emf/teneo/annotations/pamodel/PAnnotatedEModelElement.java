/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEModelElement.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import java.util.List;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PAnnotated EModel Element</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement#getAnnotatedElement <em>Annotated Element</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement#getTransient <em>Transient</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEModelElement()
 * @model abstract="true" annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PAnnotationElementCommutes'"
 * @generated
 */
public interface PAnnotatedEModelElement extends EObject {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Element</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Annotated Element</em>' reference.
	 * @see #setAnnotatedElement(ENamedElement)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEModelElement_AnnotatedElement()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	ENamedElement getAnnotatedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement#getAnnotatedElement <em>Annotated Element</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Annotated Element</em>' reference.
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	void setAnnotatedElement(ENamedElement value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' containment reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Transient</em>' containment reference.
	 * @see #setTransient(Transient)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEModelElement_Transient()
	 * @model containment="true"
	 * @generated
	 */
	Transient getTransient();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement#getTransient <em>Transient</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Transient</em>' containment reference.
	 * @see #getTransient()
	 * @generated
	 */
	void setTransient(Transient value);

	/**
	 * @return Returns the PAnnotatedModel containing this element.
	 */
	PAnnotatedModel getPaModel();

	/**
	 * @return Returns the list of annotations defined on this annotated element
	 */
	List getAnnotations();

} // PAnnotatedEModelElement
