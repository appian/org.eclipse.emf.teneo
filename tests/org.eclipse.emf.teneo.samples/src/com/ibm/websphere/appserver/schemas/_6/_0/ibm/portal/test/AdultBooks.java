/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdultBooks.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Adult Books</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getTitle <em>
 * Title</em>}</li>
 * <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getCheckedout
 * <em>Checkedout</em>}</li>
 * <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getUserid <em>
 * Userid</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getAdultBooks()
 * @model extendedMetaData="name='AdultBooks' kind='elementOnly'"
 * @generated
 */
public interface AdultBooks extends BookDefinition {
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
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getAdultBooks_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getTitle
	 * <em>Title</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Checkedout</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkedout</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Checkedout</em>' attribute.
	 * @see #setCheckedout(String)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getAdultBooks_Checkedout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='checkedout' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCheckedout();

	/**
	 * Sets the value of the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getCheckedout
	 * <em>Checkedout</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Checkedout</em>' attribute.
	 * @see #getCheckedout()
	 * @generated
	 */
	void setCheckedout(String value);

	/**
	 * Returns the value of the '<em><b>Userid</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userid</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Userid</em>' attribute.
	 * @see #setUserid(String)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getAdultBooks_Userid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='userid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserid();

	/**
	 * Sets the value of the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getUserid
	 * <em>Userid</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Userid</em>' attribute.
	 * @see #getUserid()
	 * @generated
	 */
	void setUserid(String value);

} // AdultBooks
