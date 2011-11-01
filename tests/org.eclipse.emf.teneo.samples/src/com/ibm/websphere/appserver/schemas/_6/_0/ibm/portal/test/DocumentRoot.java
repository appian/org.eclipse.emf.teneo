/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getAbstractBookDefinition <em>Abstract Book Definition</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getAdultBooks <em>Adult Books</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getBooksinlib <em>Booksinlib</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getChildrenBooks <em>Children Books</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getPublisherDefinition <em>Publisher Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract Book Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Book Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Book Definition</em>' containment reference.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getDocumentRoot_AbstractBookDefinition()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-book-definition' namespace='##targetNamespace'"
	 * @generated
	 */
	BookDefinition getAbstractBookDefinition();

	/**
	 * Returns the value of the '<em><b>Adult Books</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adult Books</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adult Books</em>' containment reference.
	 * @see #setAdultBooks(AdultBooks)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getDocumentRoot_AdultBooks()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='adult-books' namespace='##targetNamespace' affiliation='abstract-book-definition'"
	 * @generated
	 */
	AdultBooks getAdultBooks();

	/**
	 * Sets the value of the '{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getAdultBooks <em>Adult Books</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adult Books</em>' containment reference.
	 * @see #getAdultBooks()
	 * @generated
	 */
	void setAdultBooks(AdultBooks value);

	/**
	 * Returns the value of the '<em><b>Booksinlib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booksinlib</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booksinlib</em>' containment reference.
	 * @see #setBooksinlib(BooksInLib)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getDocumentRoot_Booksinlib()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='booksinlib' namespace='##targetNamespace'"
	 * @generated
	 */
	BooksInLib getBooksinlib();

	/**
	 * Sets the value of the '{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getBooksinlib <em>Booksinlib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booksinlib</em>' containment reference.
	 * @see #getBooksinlib()
	 * @generated
	 */
	void setBooksinlib(BooksInLib value);

	/**
	 * Returns the value of the '<em><b>Children Books</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Books</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Books</em>' containment reference.
	 * @see #setChildrenBooks(ChildrenBooks)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getDocumentRoot_ChildrenBooks()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='children-books' namespace='##targetNamespace' affiliation='abstract-book-definition'"
	 * @generated
	 */
	ChildrenBooks getChildrenBooks();

	/**
	 * Sets the value of the '{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getChildrenBooks <em>Children Books</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children Books</em>' containment reference.
	 * @see #getChildrenBooks()
	 * @generated
	 */
	void setChildrenBooks(ChildrenBooks value);

	/**
	 * Returns the value of the '<em><b>Publisher Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Definition</em>' containment reference.
	 * @see #setPublisherDefinition(PublisherDefinition)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getDocumentRoot_PublisherDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher-definition' namespace='##targetNamespace' affiliation='abstract-book-definition'"
	 * @generated
	 */
	PublisherDefinition getPublisherDefinition();

	/**
	 * Sets the value of the '{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getPublisherDefinition <em>Publisher Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Definition</em>' containment reference.
	 * @see #getPublisherDefinition()
	 * @generated
	 */
	void setPublisherDefinition(PublisherDefinition value);

} // DocumentRoot
