/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotation.java,v 1.7 2011/02/21 06:40:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import java.util.List;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PAnnotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.PAnnotation#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.PAnnotation#isGenerated <em>Generated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPAnnotation()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CompatibleEModelElementType AnnotationIsSupported'"
 * @generated
 */
public interface PAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EModel Element</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EModel Element</em>' reference.
	 * @see #setEModelElement(EModelElement)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPAnnotation_EModelElement()
	 * @model required="true"
	 *        annotation="teneo/internal/PersistenceMapping ignore='true'"
	 * @generated
	 */
	EModelElement getEModelElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.PAnnotation#getEModelElement <em>EModel Element</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>EModel Element</em>' reference.
	 * @see #getEModelElement()
	 * @generated
	 */
	void setEModelElement(EModelElement value);

	/**
	 * Returns the value of the '<em><b>Generated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated</em>' attribute.
	 * @see #setGenerated(boolean)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPAnnotation_Generated()
	 * @model default="true"
	 * @generated
	 */
	boolean isGenerated();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.PAnnotation#isGenerated <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated</em>' attribute.
	 * @see #isGenerated()
	 * @generated
	 */
	void setGenerated(boolean value);

	/** Return the java annotation, any importStatements are added to the passed list */
	String getJavaAnnotation(List<String> importStatements);

	/** Return the class name of the annotation */
	String getAnnotationClassName();
} // PAnnotation
