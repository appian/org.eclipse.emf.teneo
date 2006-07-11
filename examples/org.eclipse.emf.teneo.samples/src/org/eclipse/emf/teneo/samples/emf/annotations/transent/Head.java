/**
 * <copyright>
 * </copyright>
 *
 * $Id: Head.java,v 1.1 2006/07/11 16:56:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.transent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.transent.Head#getMyID <em>My ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.transent.TransentPackage#getHead()
 * @model annotation="http://annotation.elver.org/Transient appinfo='true'"
 *        extendedMetaData="name='Head' kind='elementOnly'"
 * @generated
 */
public interface Head extends EObject {
	/**
	 * Returns the value of the '<em><b>My ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My ID</em>' attribute.
	 * @see #isSetMyID()
	 * @see #unsetMyID()
	 * @see #setMyID(long)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.transent.TransentPackage#getHead_MyID()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="http://annotation.elver.org/Id appinfo='true'"
	 *        extendedMetaData="kind='element' name='myID'"
	 * @generated
	 */
	long getMyID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.transent.Head#getMyID <em>My ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My ID</em>' attribute.
	 * @see #isSetMyID()
	 * @see #unsetMyID()
	 * @see #getMyID()
	 * @generated
	 */
	void setMyID(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.transent.Head#getMyID <em>My ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMyID()
	 * @see #getMyID()
	 * @see #setMyID(long)
	 * @generated
	 */
	void unsetMyID();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.transent.Head#getMyID <em>My ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>My ID</em>' attribute is set.
	 * @see #unsetMyID()
	 * @see #getMyID()
	 * @see #setMyID(long)
	 * @generated
	 */
	boolean isSetMyID();

} // Head
