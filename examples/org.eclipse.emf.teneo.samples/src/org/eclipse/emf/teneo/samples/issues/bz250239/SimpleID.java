/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleID.java,v 1.1 2008/10/27 13:18:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz250239;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz250239.SimpleID#getAutoID <em>Auto ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz250239.Bz250239Package#getSimpleID()
 * @model extendedMetaData="name='SimpleID' kind='elementOnly'"
 * @generated
 */
public interface SimpleID extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto ID</em>' attribute.
	 * @see #isSetAutoID()
	 * @see #unsetAutoID()
	 * @see #setAutoID(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz250239.Bz250239Package#getSimpleID_AutoID()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t@Id\n\t\t\t\t@GeneratedValue\n\t\t\t\t@Column(name=\"AUTOD\" nullable=\"false\")\n\t\t\t'"
	 *        extendedMetaData="kind='element' name='autoID'"
	 * @generated
	 */
	long getAutoID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.SimpleID#getAutoID <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto ID</em>' attribute.
	 * @see #isSetAutoID()
	 * @see #unsetAutoID()
	 * @see #getAutoID()
	 * @generated
	 */
	void setAutoID(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.SimpleID#getAutoID <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoID()
	 * @see #getAutoID()
	 * @see #setAutoID(long)
	 * @generated
	 */
	void unsetAutoID();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz250239.SimpleID#getAutoID <em>Auto ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto ID</em>' attribute is set.
	 * @see #unsetAutoID()
	 * @see #getAutoID()
	 * @see #setAutoID(long)
	 * @generated
	 */
	boolean isSetAutoID();

} // SimpleID
