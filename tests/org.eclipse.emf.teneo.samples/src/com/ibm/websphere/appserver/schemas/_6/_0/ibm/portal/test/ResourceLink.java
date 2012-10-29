/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResourceLink.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Resource Link</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ResourceLink#getName <em>
 * Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getResourceLink()
 * @model abstract="true" extendedMetaData="name='ResourceLink' kind='empty'"
 * @generated
 */
public interface ResourceLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#getResourceLink_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ResourceLink#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ResourceLink
