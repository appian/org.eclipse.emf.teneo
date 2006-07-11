/**
 * <copyright>
 * </copyright>
 *
 * $Id: A.java,v 1.1 2006/07/11 16:57:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getDoub <em>Doub</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getLon <em>Lon</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getMyB <em>My B</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#getA()
 * @model extendedMetaData="name='myA' kind='elementOnly'"
 * @generated
 */
public interface A extends EObject{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#getA_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Doub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doub</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doub</em>' attribute.
	 * @see #isSetDoub()
	 * @see #unsetDoub()
	 * @see #setDoub(double)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#getA_Doub()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='doub'"
	 * @generated
	 */
	double getDoub();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getDoub <em>Doub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doub</em>' attribute.
	 * @see #isSetDoub()
	 * @see #unsetDoub()
	 * @see #getDoub()
	 * @generated
	 */
	void setDoub(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getDoub <em>Doub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoub()
	 * @see #getDoub()
	 * @see #setDoub(double)
	 * @generated
	 */
	void unsetDoub();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getDoub <em>Doub</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Doub</em>' attribute is set.
	 * @see #unsetDoub()
	 * @see #getDoub()
	 * @see #setDoub(double)
	 * @generated
	 */
	boolean isSetDoub();

	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #isSetLon()
	 * @see #unsetLon()
	 * @see #setLon(long)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#getA_Lon()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='lon'"
	 * @generated
	 */
	long getLon();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #isSetLon()
	 * @see #unsetLon()
	 * @see #getLon()
	 * @generated
	 */
	void setLon(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLon()
	 * @see #getLon()
	 * @see #setLon(long)
	 * @generated
	 */
	void unsetLon();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getLon <em>Lon</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lon</em>' attribute is set.
	 * @see #unsetLon()
	 * @see #getLon()
	 * @see #setLon(long)
	 * @generated
	 */
	boolean isSetLon();

	/**
	 * Returns the value of the '<em><b>My B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My B</em>' reference.
	 * @see #setMyB(B)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#getA_MyB()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='myB'"
	 * @generated
	 */
	B getMyB();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A#getMyB <em>My B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My B</em>' reference.
	 * @see #getMyB()
	 * @generated
	 */
	void setMyB(B value);

} // A
