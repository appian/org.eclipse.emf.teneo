/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.1 2009/09/12 04:47:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz288963;

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
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getBook <em>Book</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getFootnote <em>Footnote</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getIndentedpara <em>Indentedpara</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getParagraph <em>Paragraph</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getDocumentRoot()
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getDocumentRoot_Mixed()
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Book</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book</em>' containment reference.
	 * @see #setBook(Book)
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getDocumentRoot_Book()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='book' namespace='##targetNamespace'"
	 * @generated
	 */
	Book getBook();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getBook <em>Book</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book</em>' containment reference.
	 * @see #getBook()
	 * @generated
	 */
	void setBook(Book value);

	/**
	 * Returns the value of the '<em><b>Footnote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footnote</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footnote</em>' containment reference.
	 * @see #setFootnote(Footnote)
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getDocumentRoot_Footnote()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Footnote' namespace='##targetNamespace'"
	 * @generated
	 */
	Footnote getFootnote();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getFootnote <em>Footnote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footnote</em>' containment reference.
	 * @see #getFootnote()
	 * @generated
	 */
	void setFootnote(Footnote value);

	/**
	 * Returns the value of the '<em><b>Indentedpara</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indentedpara</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indentedpara</em>' containment reference.
	 * @see #setIndentedpara(Indentedpara)
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getDocumentRoot_Indentedpara()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indentedpara' namespace='##targetNamespace'"
	 * @generated
	 */
	Indentedpara getIndentedpara();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getIndentedpara <em>Indentedpara</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indentedpara</em>' containment reference.
	 * @see #getIndentedpara()
	 * @generated
	 */
	void setIndentedpara(Indentedpara value);

	/**
	 * Returns the value of the '<em><b>Paragraph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph</em>' containment reference.
	 * @see #setParagraph(Paragraph)
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getDocumentRoot_Paragraph()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Paragraph' namespace='##targetNamespace'"
	 * @generated
	 */
	Paragraph getParagraph();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getParagraph <em>Paragraph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph</em>' containment reference.
	 * @see #getParagraph()
	 * @generated
	 */
	void setParagraph(Paragraph value);

} // DocumentRoot
