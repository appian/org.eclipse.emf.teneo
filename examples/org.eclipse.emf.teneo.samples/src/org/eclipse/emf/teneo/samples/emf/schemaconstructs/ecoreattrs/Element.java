/**
 * <copyright>
 * </copyright>
 *
 * $Id: Element.java,v 1.2 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element#getNameMap <em>Name Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.EcoreattrsPackage#getElement()
 * @model extendedMetaData="name='element' kind='elementOnly'"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Map</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Map</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Map</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.EcoreattrsPackage#getElement_NameMap()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true"
	 *        extendedMetaData="kind='group' name='names:group'"
	 * @generated
	 */
	FeatureMap getNameMap();

	/**
	 * Returns the value of the '<em><b>Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Names</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' containment reference.
	 * @see #setNames(NameList)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.EcoreattrsPackage#getElement_Names()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='names' group='#names:group'"
	 * @generated
	 */
	NameList getNames();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element#getNames <em>Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Names</em>' containment reference.
	 * @see #getNames()
	 * @generated
	 */
	void setNames(NameList value);

} // Element
