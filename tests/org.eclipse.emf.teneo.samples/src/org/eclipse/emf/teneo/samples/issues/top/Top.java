/**
 * <copyright>
 * </copyright>
 *
 * $Id: Top.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.top;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.Top#getApplicationDefinition <em>Application Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.top.TopPackage#getTop()
 * @model extendedMetaData="name='Top' kind='elementOnly'"
 * @generated
 */
public interface Top extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Definition</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.top.TopPackage#getTop_ApplicationDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='application-definition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ApplicationDefinition> getApplicationDefinition();

} // Top
