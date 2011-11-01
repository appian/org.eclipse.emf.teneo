/**
 * <copyright>
 * </copyright>
 *
 * $Id: PublisherDefinition.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition#getTitle <em>Title</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition#getResourceLink <em>Resource Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getPublisherDefinition()
 * @model extendedMetaData="name='PublisherDefinition' kind='elementOnly'"
 * @generated
 */
public interface PublisherDefinition extends BookDefinition {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getPublisherDefinition_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Resource Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Link</em>' containment reference.
	 * @see #setResourceLink(BookDefinitionResourceLink)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getPublisherDefinition_ResourceLink()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource-link' namespace='##targetNamespace'"
	 * @generated
	 */
	BookDefinitionResourceLink getResourceLink();

	/**
	 * Sets the value of the '{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition#getResourceLink <em>Resource Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Link</em>' containment reference.
	 * @see #getResourceLink()
	 * @generated
	 */
	void setResourceLink(BookDefinitionResourceLink value);

} // PublisherDefinition
