/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.1 2006/07/11 16:57:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getPhones <em>Phones</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getOffice <em>Office</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getMobile <em>Mobile</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getFax <em>Fax</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getHome <em>Home</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapPackage#getPerson()
 * @model extendedMetaData="name='Person' kind='elementOnly'"
 * @generated
 */
public interface Person extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapPackage#getPerson_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Phones</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phones</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phones</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapPackage#getPerson_Phones()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='phones:1'"
	 * @generated
	 */
	FeatureMap getPhones();

	/**
	 * Returns the value of the '<em><b>Office</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapPackage#getPerson_Office()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='office' group='#phones:1'"
	 * @generated
	 */
	EList getOffice();

	/**
	 * Returns the value of the '<em><b>Mobile</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobile</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapPackage#getPerson_Mobile()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mobile' group='#phones:1'"
	 * @generated
	 */
	EList getMobile();

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fax</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fax</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapPackage#getPerson_Fax()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fax' group='#phones:1'"
	 * @generated
	 */
	EList getFax();

	/**
	 * Returns the value of the '<em><b>Home</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapPackage#getPerson_Home()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='home' group='#phones:1'"
	 * @generated
	 */
	EList getHome();

} // Person
