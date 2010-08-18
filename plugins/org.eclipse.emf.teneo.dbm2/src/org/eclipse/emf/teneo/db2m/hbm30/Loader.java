/**
 * <copyright>
 * </copyright>
 *
 * $Id: Loader.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Loader#getQueryRef <em>Query Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getLoader()
 * @model extendedMetaData="name='loader' kind='empty'"
 * @generated
 */
public interface Loader extends EObject {
	/**
	 * Returns the value of the '<em><b>Query Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Ref</em>' attribute.
	 * @see #setQueryRef(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getLoader_QueryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='query-ref'"
	 * @generated
	 */
	String getQueryRef();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Loader#getQueryRef <em>Query Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Ref</em>' attribute.
	 * @see #getQueryRef()
	 * @generated
	 */
	void setQueryRef(String value);

} // Loader
