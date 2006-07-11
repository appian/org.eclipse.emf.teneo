/**
 * <copyright>
 * </copyright>
 *
 * $Id: PVersionObject.java,v 1.1 2006/07/11 16:57:12 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.transientsuper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PVersion Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject#getVersionNumber <em>Version Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.TransientsuperPackage#getPVersionObject()
 * @model
 * @generated
 */
public interface PVersionObject extends PBaseObject {
	/**
	 * Returns the value of the '<em><b>Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Number</em>' attribute.
	 * @see #setVersionNumber(int)
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.TransientsuperPackage#getPVersionObject_VersionNumber()
	 * @model unique="false"
	 * @generated
	 */
	int getVersionNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject#getVersionNumber <em>Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Number</em>' attribute.
	 * @see #getVersionNumber()
	 * @generated
	 */
	void setVersionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.TransientsuperPackage#getPVersionObject_Comment()
	 * @model unique="false"
	 *        annotation="http://ejb.elver.org/Column length='4000'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.transientsuper.PVersionObject#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // PVersionObject
