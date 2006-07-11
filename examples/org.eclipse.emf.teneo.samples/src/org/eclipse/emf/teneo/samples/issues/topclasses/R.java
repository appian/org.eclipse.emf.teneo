/**
 * <copyright>
 * </copyright>
 *
 * $Id: R.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.topclasses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>R</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.topclasses.R#getPlist <em>Plist</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.topclasses.R#getMlist <em>Mlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage#getR()
 * @model extendedMetaData="name='R' kind='elementOnly'"
 * @generated
 */
public interface R extends AbstractSuper {
	/**
	 * Returns the value of the '<em><b>Plist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plist</em>' containment reference.
	 * @see #setPlist(PList)
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage#getR_Plist()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='plist'"
	 * @generated
	 */
	PList getPlist();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.topclasses.R#getPlist <em>Plist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plist</em>' containment reference.
	 * @see #getPlist()
	 * @generated
	 */
	void setPlist(PList value);

	/**
	 * Returns the value of the '<em><b>Mlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mlist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlist</em>' containment reference.
	 * @see #setMlist(MList)
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage#getR_Mlist()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='mlist'"
	 * @generated
	 */
	MList getMlist();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.topclasses.R#getMlist <em>Mlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mlist</em>' containment reference.
	 * @see #getMlist()
	 * @generated
	 */
	void setMlist(MList value);

} // R
