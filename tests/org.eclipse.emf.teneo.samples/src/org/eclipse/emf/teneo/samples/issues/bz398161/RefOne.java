/**
 */
package org.eclipse.emf.teneo.samples.issues.bz398161;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref One</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getRefTwo <em>Ref Two</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getStringVal <em>String Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Package#getRefOne()
 * @model extendedMetaData="name='RefOne' kind='elementOnly'"
 * @generated
 */
public interface RefOne extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Package#getRefOne_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@Id\n\t\t\t\t\t\t@GeneratedValue\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getId <em>Id</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getId <em>Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Ref Two</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Two</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Two</em>' containment reference.
	 * @see #isSetRefTwo()
	 * @see #unsetRefTwo()
	 * @see #setRefTwo(RefTwo)
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Package#getRefOne_RefTwo()
	 * @model containment="true" unsettable="true" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@JoinColumn(name=\"prodr_num\",columnDefinition = \"CHARACTER(6) NOT NULL\")\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='refTwo'"
	 * @generated
	 */
	RefTwo getRefTwo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getRefTwo <em>Ref Two</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Two</em>' containment reference.
	 * @see #isSetRefTwo()
	 * @see #unsetRefTwo()
	 * @see #getRefTwo()
	 * @generated
	 */
	void setRefTwo(RefTwo value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getRefTwo <em>Ref Two</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefTwo()
	 * @see #getRefTwo()
	 * @see #setRefTwo(RefTwo)
	 * @generated
	 */
	void unsetRefTwo();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getRefTwo <em>Ref Two</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ref Two</em>' containment reference is set.
	 * @see #unsetRefTwo()
	 * @see #getRefTwo()
	 * @see #setRefTwo(RefTwo)
	 * @generated
	 */
	boolean isSetRefTwo();

	/**
	 * Returns the value of the '<em><b>String Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Val</em>' attribute.
	 * @see #isSetStringVal()
	 * @see #unsetStringVal()
	 * @see #setStringVal(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Package#getRefOne_StringVal()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@Column(name=\"stringVal\",columnDefinition = \"CHARACTER(64) NOT NULL\")\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='stringVal'"
	 * @generated
	 */
	String getStringVal();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getStringVal <em>String Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Val</em>' attribute.
	 * @see #isSetStringVal()
	 * @see #unsetStringVal()
	 * @see #getStringVal()
	 * @generated
	 */
	void setStringVal(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getStringVal <em>String Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStringVal()
	 * @see #getStringVal()
	 * @see #setStringVal(String)
	 * @generated
	 */
	void unsetStringVal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefOne#getStringVal <em>String Val</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>String Val</em>' attribute is set.
	 * @see #unsetStringVal()
	 * @see #getStringVal()
	 * @see #setStringVal(String)
	 * @generated
	 */
	boolean isSetStringVal();

} // RefOne
