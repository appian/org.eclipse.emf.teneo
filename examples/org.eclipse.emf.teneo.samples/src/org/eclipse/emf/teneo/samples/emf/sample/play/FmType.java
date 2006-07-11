/**
 * <copyright>
 * </copyright>
 *
 * $Id: FmType.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fm Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.FmType#getP <em>P</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getFmType()
 * @model extendedMetaData="name='fm_._type' kind='elementOnly'"
 * @generated
 */
public interface FmType extends EObject {
	/**
	 * Returns the value of the '<em><b>P</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getFmType_P()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getP();

} // FmType
