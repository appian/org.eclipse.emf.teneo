/**
 * <copyright>
 * </copyright>
 *
 * $Id: MList.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.topclasses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MList</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.topclasses.MList#getM <em>M</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage#getMList()
 * @model extendedMetaData="name='MList' kind='elementOnly'"
 * @generated
 */
public interface MList extends AbstractSuper {
	/**
	 * Returns the value of the '<em><b>M</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.topclasses.M}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage#getMList_M()
	 * @model type="org.eclipse.emf.teneo.samples.issues.topclasses.M" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='m'"
	 * @generated
	 */
	EList getM();

} // MList
