/**
 * <copyright>
 * </copyright>
 *
 * $Id: PList.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.topclasses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PList</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.topclasses.PList#getP <em>P</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage#getPList()
 * @model extendedMetaData="name='PList' kind='elementOnly'"
 * @generated
 */
public interface PList extends AbstractSuper {
	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.topclasses.P}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage#getPList_P()
	 * @model type="org.eclipse.emf.teneo.samples.issues.topclasses.P" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='p'"
	 * @generated
	 */
	EList getP();

} // PList
