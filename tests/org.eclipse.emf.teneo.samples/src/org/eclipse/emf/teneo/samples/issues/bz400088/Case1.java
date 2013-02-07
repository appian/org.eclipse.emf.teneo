/**
 */
package org.eclipse.emf.teneo.samples.issues.bz400088;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getCase2 <em>Case2</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getBdsId <em>Bds Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getCase1()
 * @model extendedMetaData="name='Case1' kind='elementOnly'"
 *        annotation="teneo.jpa value='@Table(name=\"ROBTEST_CASE1\") @Entity(name=\"com.example.robtest.Case1\") @DiscriminatorValue(\"com.example.robtest.Case1\")'"
 * @generated
 */
public interface Case1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Case2</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getCase1 <em>Case1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case2</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getCase1_Case2()
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Case2#getCase1
	 * @model opposite="case1"
	 *        extendedMetaData="kind='element' name='case2'"
	 *        annotation="teneo.jpa value='@JoinTable(name=\"ROBTEST_CASE1_CASE2\") @Column(name=\"CASE2\") @ForeignKey(name=\"CASE1_CASE2\")'"
	 * @generated
	 */
	EList<Case2> getCase2();

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getCase1_BdsId()
	 * @model annotation="teneo.jpa value='@Id @Column(name=\"BDS_ID\", nullable=\"false\")'"
	 * @generated
	 */
	Long getBdsId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getBdsId <em>Bds Id</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getCase1_BdsVersion()
	 * @model annotation="teneo.jpa value='@Column(name=\"BDS_VERSION\") @Version'"
	 *        annotation="bds isVersion='true'"
	 * @generated
	 */
	Long getBdsVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Case1#getBdsVersion <em>Bds Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bds Version</em>' attribute.
	 * @see #getBdsVersion()
	 * @generated
	 */
	void setBdsVersion(Long value);

} // Case1
