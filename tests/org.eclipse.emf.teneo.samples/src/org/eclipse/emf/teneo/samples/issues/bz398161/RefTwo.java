/**
 */
package org.eclipse.emf.teneo.samples.issues.bz398161;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Two</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefTwo#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Package#getRefTwo()
 * @model extendedMetaData="name='RefTwo' kind='elementOnly'"
 * @generated
 */
public interface RefTwo extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Package#getRefTwo_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@Id\n\t\t\t\t\t\t@Column(name=\"prodr_num\",\n\t\t\t\t\t\tcolumnDefinition = \"CHARACTER(6)\", length=6)\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='number'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz398161.RefTwo#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

} // RefTwo
