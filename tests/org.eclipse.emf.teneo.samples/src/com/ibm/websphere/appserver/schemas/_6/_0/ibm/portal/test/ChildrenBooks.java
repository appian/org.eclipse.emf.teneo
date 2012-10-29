/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChildrenBooks.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Children Books</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getTitle <em>
 * Title</em>}</li>
 * <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getCartoon
 * <em>Cartoon</em>}</li>
 * <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getPopup <em>
 * Popup</em>}</li>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getPublisherDefinitionRef
 * <em>Publisher Definition Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getChildrenBooks()
 * @model extendedMetaData="name='ChildrenBooks' kind='elementOnly'"
 * @generated
 */
public interface ChildrenBooks extends BookDefinition {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getChildrenBooks_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getTitle
	 * <em>Title</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Cartoon</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cartoon</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cartoon</em>' attribute.
	 * @see #setCartoon(String)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getChildrenBooks_Cartoon()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='cartoon' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCartoon();

	/**
	 * Sets the value of the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getCartoon
	 * <em>Cartoon</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Cartoon</em>' attribute.
	 * @see #getCartoon()
	 * @generated
	 */
	void setCartoon(String value);

	/**
	 * Returns the value of the '<em><b>Popup</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Popup</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Popup</em>' attribute.
	 * @see #setPopup(String)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getChildrenBooks_Popup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='popup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPopup();

	/**
	 * Sets the value of the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getPopup
	 * <em>Popup</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Popup</em>' attribute.
	 * @see #getPopup()
	 * @generated
	 */
	void setPopup(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Definition Ref</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Definition Ref</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Publisher Definition Ref</em>' reference.
	 * @see #setPublisherDefinitionRef(PublisherDefinition)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getChildrenBooks_PublisherDefinitionRef()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='publisherDefinitionRef'"
	 * @generated
	 */
	PublisherDefinition getPublisherDefinitionRef();

	/**
	 * Sets the value of the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getPublisherDefinitionRef
	 * <em>Publisher Definition Ref</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Publisher Definition Ref</em>' reference.
	 * @see #getPublisherDefinitionRef()
	 * @generated
	 */
	void setPublisherDefinitionRef(PublisherDefinition value);

} // ChildrenBooks
