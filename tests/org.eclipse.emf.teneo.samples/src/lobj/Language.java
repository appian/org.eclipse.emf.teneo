/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Language</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.Language#getLanguage <em>Language</em>}</li>
 * <li>{@link lobj.Language#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getLanguage()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Language extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see lobj.LobjPackage#getLanguage_Language()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link lobj.Language#getLanguage <em>Language</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see lobj.LobjPackage#getLanguage_Code()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link lobj.Language#getCode <em>Code</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Language
