/**
 * <copyright>
 * </copyright>
 *
 * $Id: FirstAddressHolder.java,v 1.1 2006/07/11 16:56:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>First Address Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.FirstAddressHolder#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage#getFirstAddressHolder()
 * @model extendedMetaData="name='firstAddress:holder' kind='simple'"
 * @generated
 */
public interface FirstAddressHolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage#getFirstAddressHolder_Value()
	 * @model type="org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address" resolveProxies="false"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	EList getValue();

} // FirstAddressHolder
