/**
 * <copyright>
 * </copyright>
 *
 * $Id: PageParams.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nav;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nav.PageParams#getRenderParam <em>Render Param</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nav.PageParams#getPageHeader <em>Page Header</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.nav.NavPackage#getPageParams()
 * @model extendedMetaData="name='PageParams' kind='elementOnly'"
 * @generated
 */
public interface PageParams extends EObject {
	/**
	 * Returns the value of the '<em><b>Render Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.nav.RenderParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Render Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Render Param</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavPackage#getPageParams_RenderParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='render-param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RenderParam> getRenderParam();

	/**
	 * Returns the value of the '<em><b>Page Header</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Header</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Header</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavPackage#getPageParams_PageHeader()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='page-header' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getPageHeader();

} // PageParams
