/**
 * <copyright>
 * </copyright>
 *
 * $Id: AutoID.java,v 1.1 2008/10/27 13:18:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz250239;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz250239.AutoID#getAutoID <em>Auto ID</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz250239.AutoID#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz250239.Bz250239Package#getAutoID()
 * @model
 * @generated
 */
public interface AutoID extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto ID</em>' attribute.
	 * @see #setAutoID(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.Bz250239Package#getAutoID_AutoID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 * @generated
	 */
	long getAutoID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.AutoID#getAutoID <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto ID</em>' attribute.
	 * @see #getAutoID()
	 * @generated
	 */
	void setAutoID(long value);

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.Bz250239Package#getAutoID_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.AutoID#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AutoID
