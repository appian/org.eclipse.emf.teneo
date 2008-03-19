/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationElement.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.top;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The navigation element describes one element of the navigation hierarchy of a portal application. Navigation elements are arranged in a tree that reflects the structure of the navigation hierarchy that is created in the portal when the PAA is deployed. During PAA deployment, the portal administrator specifies where the navigation ofthe PAA is inserted into the existing navigation hierarchy of the portal. In most cases, a navigation element is associated with a page layout  (specified by the layout-element-ref attribute) that will be displayed when the navigation element is selected. The navigation-content subelements specify how application artifacts are linked to the navigation element, e.g., how content spots in the layout template for this navigation element are filled.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getPageParams <em>Page Params</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.top.TopPackage#getNavigationElement()
 * @model extendedMetaData="name='NavigationElement' kind='elementOnly'"
 * @generated
 */
public interface NavigationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.emf.teneo.samples.issues.top.TopPackage#getNavigationElement_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.teneo.samples.issues.top.TopPackage#getNavigationElement_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Page Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Params</em>' containment reference.
	 * @see #setPageParams(PageParams)
	 * @see org.eclipse.emf.teneo.samples.issues.top.TopPackage#getNavigationElement_PageParams()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page-params' namespace='##targetNamespace'"
	 * @generated
	 */
	PageParams getPageParams();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getPageParams <em>Page Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Params</em>' containment reference.
	 * @see #getPageParams()
	 * @generated
	 */
	void setPageParams(PageParams value);

	/**
	 * Returns the value of the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Name</em>' attribute.
	 * @see #setUniqueName(String)
	 * @see org.eclipse.emf.teneo.samples.issues.top.TopPackage#getNavigationElement_UniqueName()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uniqueName'"
	 * @generated
	 */
	String getUniqueName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.top.NavigationElement#getUniqueName <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Name</em>' attribute.
	 * @see #getUniqueName()
	 * @generated
	 */
	void setUniqueName(String value);

} // NavigationElement
