/**
 */
package org.eclipse.emf.teneo.samples.issues.bz400088;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getCase1 <em>Case1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getBdsId <em>Bds Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getCase2()
 * @model extendedMetaData="name='Case2' kind='elementOnly'"
 *        annotation="teneo.jpa value='@Table(name=\"ROBTEST_CASE2\") @Entity(name=\"com.example.robtest.Case2\") @DiscriminatorValue(\"com.example.robtest.Case2\")'"
 * @generated
 */
public interface Case2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Case1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getCase2 <em>Case2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case1</em>' reference.
	 * @see #setCase1(Case1)
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getCase2_Case1()
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getCase2
	 * @model opposite="case2"
	 *        extendedMetaData="kind='element' name='case1'"
	 *        annotation="teneo.jpa value='@Column(name=\"CASE\") @ForeignKey(name=\"CASE2_CASE1\")'"
	 * @generated
	 */
	Case1 getCase1();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getCase1 <em>Case1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case1</em>' reference.
	 * @see #getCase1()
	 * @generated
	 */
	void setCase1(Case1 value);

	/**
	 * Returns the value of the '<em><b>Bds Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bds Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bds Id</em>' attribute.
	 * @see #setBdsId(Long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getCase2_BdsId()
	 * @model annotation="teneo.jpa value='@Id @Column(name=\"BDS_ID\", nullable=\"false\")'"
	 * @generated
	 */
	Long getBdsId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getBdsId <em>Bds Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bds Id</em>' attribute.
	 * @see #getBdsId()
	 * @generated
	 */
	void setBdsId(Long value);

	/**
	 * Returns the value of the '<em><b>Bds Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bds Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bds Version</em>' attribute.
	 * @see #setBdsVersion(Long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getCase2_BdsVersion()
	 * @model annotation="teneo.jpa value='@Column(name=\"BDS_VERSION\") @Version'"
	 * @generated
	 */
	Long getBdsVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getBdsVersion <em>Bds Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bds Version</em>' attribute.
	 * @see #getBdsVersion()
	 * @generated
	 */
	void setBdsVersion(Long value);

} // Case2
