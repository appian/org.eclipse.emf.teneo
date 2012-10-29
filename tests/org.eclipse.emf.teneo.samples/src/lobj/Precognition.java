/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Precognition</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.Precognition#getPrecog <em>Precog</em>}</li>
 * <li>{@link lobj.Precognition#getInternalRefs <em>Internal Refs</em>}</li>
 * <li>{@link lobj.Precognition#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getPrecognition()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Precognition extends EObject {
	/**
	 * Returns the value of the '<em><b>Precog</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precog</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Precog</em>' attribute.
	 * @see #setPrecog(String)
	 * @see lobj.LobjPackage#getPrecognition_Precog()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getPrecog();

	/**
	 * Sets the value of the '{@link lobj.Precognition#getPrecog <em>Precog</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Precog</em>' attribute.
	 * @see #getPrecog()
	 * @generated
	 */
	void setPrecog(String value);

	/**
	 * Returns the value of the '<em><b>Internal Refs</b></em>' containment reference list. The list
	 * contents are of type {@link lobj.InternalRef}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Refs</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Internal Refs</em>' containment reference list.
	 * @see lobj.LobjPackage#getPrecognition_InternalRefs()
	 * @model type="lobj.InternalRef" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getInternalRefs();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see lobj.LobjPackage#getPrecognition_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.Precognition#getId <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Precognition
