/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookDefinitionResourceLink.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book Definition Resource Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinitionResourceLink#getBookSubject <em>Book Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getBookDefinitionResourceLink()
 * @model extendedMetaData="name='BookDefinitionResourceLink' kind='empty'"
 * @generated
 */
public interface BookDefinitionResourceLink extends ResourceLink {
	/**
	 * Returns the value of the '<em><b>Book Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book Subject</em>' attribute.
	 * @see #setBookSubject(String)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getBookDefinitionResourceLink_BookSubject()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bookSubject'"
	 * @generated
	 */
	String getBookSubject();

	/**
	 * Sets the value of the '{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinitionResourceLink#getBookSubject <em>Book Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Subject</em>' attribute.
	 * @see #getBookSubject()
	 * @generated
	 */
	void setBookSubject(String value);

} // BookDefinitionResourceLink
