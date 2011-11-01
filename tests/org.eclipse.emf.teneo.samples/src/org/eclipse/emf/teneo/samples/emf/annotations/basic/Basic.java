/**
 * <copyright>
 * </copyright>
 *
 * $Id: Basic.java,v 1.2 2006/09/05 12:16:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.basic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.basic.Basic#getMyOptionalBasic <em>My Optional Basic</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.basic.Basic#getMyVersion <em>My Version</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.basic.Basic#getMyTransient <em>My Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.basic.BasicPackage#getBasic()
 * @model extendedMetaData="name='Basic' kind='elementOnly'"
 * @generated
 */
public interface Basic extends EObject {
	/**
	 * Returns the value of the '<em><b>My Optional Basic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Optional Basic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Optional Basic</em>' attribute.
	 * @see #setMyOptionalBasic(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.basic.BasicPackage#getBasic_MyOptionalBasic()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='@Basic(optional=\"true\")'"
	 *        extendedMetaData="kind='element' name='myOptionalBasic'"
	 * @generated
	 */
	String getMyOptionalBasic();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.basic.Basic#getMyOptionalBasic <em>My Optional Basic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Optional Basic</em>' attribute.
	 * @see #getMyOptionalBasic()
	 * @generated
	 */
	void setMyOptionalBasic(String value);

	/**
	 * Returns the value of the '<em><b>My Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Version</em>' attribute.
	 * @see #isSetMyVersion()
	 * @see #unsetMyVersion()
	 * @see #setMyVersion(long)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.basic.BasicPackage#getBasic_MyVersion()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="teneo.jpa appinfo='@Version'"
	 *        extendedMetaData="kind='element' name='myVersion'"
	 * @generated
	 */
	long getMyVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.basic.Basic#getMyVersion <em>My Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Version</em>' attribute.
	 * @see #isSetMyVersion()
	 * @see #unsetMyVersion()
	 * @see #getMyVersion()
	 * @generated
	 */
	void setMyVersion(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.basic.Basic#getMyVersion <em>My Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMyVersion()
	 * @see #getMyVersion()
	 * @see #setMyVersion(long)
	 * @generated
	 */
	void unsetMyVersion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.basic.Basic#getMyVersion <em>My Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>My Version</em>' attribute is set.
	 * @see #unsetMyVersion()
	 * @see #getMyVersion()
	 * @see #setMyVersion(long)
	 * @generated
	 */
	boolean isSetMyVersion();

	/**
	 * Returns the value of the '<em><b>My Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Transient</em>' attribute.
	 * @see #setMyTransient(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.basic.BasicPackage#getBasic_MyTransient()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='@Transient'"
	 *        extendedMetaData="kind='element' name='myTransient'"
	 * @generated
	 */
	String getMyTransient();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.basic.Basic#getMyTransient <em>My Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Transient</em>' attribute.
	 * @see #getMyTransient()
	 * @generated
	 */
	void setMyTransient(String value);

} // Basic
