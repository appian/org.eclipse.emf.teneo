/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleAllType.java,v 1.1 2006/07/11 16:57:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple All Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getAaa <em>Aaa</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getBbb <em>Bbb</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getCcc <em>Ccc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage#getSimpleAllType()
 * @model extendedMetaData="name='simpleAll_._type' kind='elementOnly'"
 * @generated
 */
public interface SimpleAllType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aaa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aaa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aaa</em>' attribute.
	 * @see #setAaa(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage#getSimpleAllType_Aaa()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='aaa'"
	 * @generated
	 */
	String getAaa();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getAaa <em>Aaa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aaa</em>' attribute.
	 * @see #getAaa()
	 * @generated
	 */
	void setAaa(String value);

	/**
	 * Returns the value of the '<em><b>Bbb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bbb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bbb</em>' attribute.
	 * @see #setBbb(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage#getSimpleAllType_Bbb()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='bbb'"
	 * @generated
	 */
	String getBbb();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getBbb <em>Bbb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bbb</em>' attribute.
	 * @see #getBbb()
	 * @generated
	 */
	void setBbb(String value);

	/**
	 * Returns the value of the '<em><b>Ccc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ccc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ccc</em>' attribute.
	 * @see #setCcc(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage#getSimpleAllType_Ccc()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ccc'"
	 * @generated
	 */
	String getCcc();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getCcc <em>Ccc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ccc</em>' attribute.
	 * @see #getCcc()
	 * @generated
	 */
	void setCcc(String value);

} // SimpleAllType
