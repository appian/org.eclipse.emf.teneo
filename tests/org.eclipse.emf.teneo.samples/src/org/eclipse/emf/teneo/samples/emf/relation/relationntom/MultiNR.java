/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultiNR.java,v 1.2 2007/02/08 23:09:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relationntom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi NR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage#getMultiNR()
 * @model extendedMetaData="name='MultiNR' kind='elementOnly'"
 * @generated
 */
public interface MultiNR extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage#getMultiNR_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getMultinr <em>Multinr</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage#getMultiNR_Main()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getMultinr
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main" opposite="multinr" required="true"
	 *        extendedMetaData="kind='element' name='main'"
	 * @generated
	 */
	EList<Main> getMain();

} // MultiNR
