/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookDefinition.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getLocation <em>Location</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getBookDefinition()
 * @model abstract="true"
 *        extendedMetaData="name='BookDefinition' kind='elementOnly'"
 * @generated
 */
public interface BookDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getBookDefinition_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getBookDefinition_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Name</em>' attribute.
	 * @see #setUniqueName(String)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getBookDefinition_UniqueName()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uniqueName'"
	 * @generated
	 */
	String getUniqueName();

	/**
	 * Sets the value of the '{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getUniqueName <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Name</em>' attribute.
	 * @see #getUniqueName()
	 * @generated
	 */
	void setUniqueName(String value);

} // BookDefinition
