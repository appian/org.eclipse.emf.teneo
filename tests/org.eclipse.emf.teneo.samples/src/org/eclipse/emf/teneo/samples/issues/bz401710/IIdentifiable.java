/**
 */
package org.eclipse.emf.teneo.samples.issues.bz401710;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IIdentifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz401710.Bz401710Package#getIIdentifiable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IIdentifiable extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.Bz401710Package#getIIdentifiable_Id()
	 * @model annotation="teneo.jpa value='@Id @Column(name=\"BDS_ID\", nullable=\"false\")'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Bds Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bds Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bds Version</em>' attribute.
	 * @see #setBdsVersion(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.Bz401710Package#getIIdentifiable_BdsVersion()
	 * @model annotation="teneo.jpa value='@Column(name=\"BDS_VERSION\") @Version'"
	 * @generated
	 */
	long getBdsVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable#getBdsVersion <em>Bds Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bds Version</em>' attribute.
	 * @see #getBdsVersion()
	 * @generated
	 */
	void setBdsVersion(long value);

} // IIdentifiable
