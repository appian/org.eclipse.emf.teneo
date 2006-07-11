/**
 * <copyright>
 * </copyright>
 *
 * $Id: M.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.topclasses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.topclasses.M#getP <em>P</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage#getM()
 * @model extendedMetaData="name='M' kind='elementOnly'"
 * @generated
 */
public interface M extends AbstractSuper {
	/**
	 * Returns the value of the '<em><b>P</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.topclasses.P}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.topclasses.P#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage#getM_P()
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.P#getM
	 * @model type="org.eclipse.emf.teneo.samples.issues.topclasses.P" opposite="m" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='p'"
	 * @generated
	 */
	EList getP();

} // M
