/**
 * <copyright>
 * </copyright>
 *
 * $Id: Library.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getLibrary <em>Library</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getAbstractBookDefinitionGroup <em>Abstract Book Definition Group</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getAbstractBookDefinition <em>Abstract Book Definition</em>}</li>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getLibrary()
 * @model extendedMetaData="name='Library' kind='elementOnly'"
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getLibrary_Library()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Library> getLibrary();

	/**
	 * Returns the value of the '<em><b>Abstract Book Definition Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Book Definition Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Book Definition Group</em>' attribute list.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getLibrary_AbstractBookDefinitionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='abstract-book-definition:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractBookDefinitionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Book Definition</b></em>' containment reference list.
	 * The list contents are of type {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Book Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Book Definition</em>' containment reference list.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getLibrary_AbstractBookDefinition()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-book-definition' namespace='##targetNamespace' group='abstract-book-definition:group'"
	 * @generated
	 */
	EList<BookDefinition> getAbstractBookDefinition();

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
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getLibrary_UniqueName()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uniqueName'"
	 * @generated
	 */
	String getUniqueName();

	/**
	 * Sets the value of the '{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getUniqueName <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Name</em>' attribute.
	 * @see #getUniqueName()
	 * @generated
	 */
	void setUniqueName(String value);

} // Library
