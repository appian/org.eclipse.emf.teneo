/**
 * <copyright>
 * </copyright>
 *
 * $Id: Item2.java,v 1.1 2010/08/19 08:34:51 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321773;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item2#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item2#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Bz321773Package#getItem2()
 * @model extendedMetaData="name='Item2' kind='elementOnly'"
 * @generated
 */
public interface Item2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Bz321773Package#getItem2_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@SequenceGenerator(name=\"seq2\", sequenceName=\"secondSeq\", allocationSize=25)\n\t\t\t\t\t\t@GeneratedValue(strategy=SEQUENCE, generator=\"seq2\")\n\t\t\t\t\t\t@Id\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item2#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item2#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item2#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Bz321773Package#getItem2_Data()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Data'"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz321773.Item2#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // Item2
