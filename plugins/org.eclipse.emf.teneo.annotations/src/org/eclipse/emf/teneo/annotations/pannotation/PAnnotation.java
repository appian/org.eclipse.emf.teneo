/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotation.java,v 1.4 2007/02/01 12:35:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PAnnotation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.PAnnotation#getEModelElement <em>EModel Element</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPAnnotation()
 * @model interface="true" abstract="true" annotation="http://www.eclipse.org/emf/2002/Ecore
 *        constraints='CompatibleEModelElementType AnnotationIsSupported'"
 * @generated
 */
public interface PAnnotation extends EObject {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * Returns the value of the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EModel Element</em>' reference isn't clear, there really should be more of a
	 * description here...
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

} // PAnnotation
