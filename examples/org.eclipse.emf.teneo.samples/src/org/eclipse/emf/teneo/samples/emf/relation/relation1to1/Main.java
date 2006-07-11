/**
 * <copyright>
 * </copyright>
 *
 * $Id: Main.java,v 1.1 2006/07/11 16:57:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1to1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getContainedonewayrequired <em>Containedonewayrequired</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getContainedoneWaynotrequired <em>Containedone Waynotrequired</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedonewayrequired <em>Notcontainedonewayrequired</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedonewaynotrequired <em>Notcontainedonewaynotrequired</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowaynotrequired <em>Notcontainedtwowaynotrequired</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowayrequirednr <em>Notcontainedtwowayrequirednr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowaynotrequirednr <em>Notcontainedtwowaynotrequirednr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getMain()
 * @model extendedMetaData="name='Main' kind='elementOnly'"
 * @generated
 */
public interface Main extends EObject{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"c1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getMain_Name()
	 * @model default="c1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Containedonewayrequired</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containedonewayrequired</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containedonewayrequired</em>' containment reference.
	 * @see #setContainedonewayrequired(ContainedChildR)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getMain_Containedonewayrequired()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='containedonewayrequired'"
	 * @generated
	 */
	ContainedChildR getContainedonewayrequired();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getContainedonewayrequired <em>Containedonewayrequired</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containedonewayrequired</em>' containment reference.
	 * @see #getContainedonewayrequired()
	 * @generated
	 */
	void setContainedonewayrequired(ContainedChildR value);

	/**
	 * Returns the value of the '<em><b>Containedone Waynotrequired</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containedone Waynotrequired</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containedone Waynotrequired</em>' containment reference.
	 * @see #setContainedoneWaynotrequired(ContainedChildNR)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getMain_ContainedoneWaynotrequired()
	 * @model containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='containedoneWaynotrequired'"
	 * @generated
	 */
	ContainedChildNR getContainedoneWaynotrequired();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getContainedoneWaynotrequired <em>Containedone Waynotrequired</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containedone Waynotrequired</em>' containment reference.
	 * @see #getContainedoneWaynotrequired()
	 * @generated
	 */
	void setContainedoneWaynotrequired(ContainedChildNR value);

	/**
	 * Returns the value of the '<em><b>Notcontainedonewayrequired</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notcontainedonewayrequired</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notcontainedonewayrequired</em>' reference.
	 * @see #setNotcontainedonewayrequired(NotContainedChildR)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getMain_Notcontainedonewayrequired()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='notcontainedonewayrequired'"
	 * @generated
	 */
	NotContainedChildR getNotcontainedonewayrequired();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedonewayrequired <em>Notcontainedonewayrequired</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notcontainedonewayrequired</em>' reference.
	 * @see #getNotcontainedonewayrequired()
	 * @generated
	 */
	void setNotcontainedonewayrequired(NotContainedChildR value);

	/**
	 * Returns the value of the '<em><b>Notcontainedonewaynotrequired</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notcontainedonewaynotrequired</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notcontainedonewaynotrequired</em>' reference.
	 * @see #setNotcontainedonewaynotrequired(NotContainedChildNR)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getMain_Notcontainedonewaynotrequired()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='notcontainedonewaynotrequired'"
	 * @generated
	 */
	NotContainedChildNR getNotcontainedonewaynotrequired();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedonewaynotrequired <em>Notcontainedonewaynotrequired</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notcontainedonewaynotrequired</em>' reference.
	 * @see #getNotcontainedonewaynotrequired()
	 * @generated
	 */
	void setNotcontainedonewaynotrequired(NotContainedChildNR value);

	/**
	 * Returns the value of the '<em><b>Notcontainedtwowaynotrequired</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notcontainedtwowaynotrequired</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notcontainedtwowaynotrequired</em>' reference.
	 * @see #setNotcontainedtwowaynotrequired(NotContainedChildNRT)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getMain_Notcontainedtwowaynotrequired()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT#getMain
	 * @model opposite="main" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='notcontainedtwowaynotrequired'"
	 * @generated
	 */
	NotContainedChildNRT getNotcontainedtwowaynotrequired();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowaynotrequired <em>Notcontainedtwowaynotrequired</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notcontainedtwowaynotrequired</em>' reference.
	 * @see #getNotcontainedtwowaynotrequired()
	 * @generated
	 */
	void setNotcontainedtwowaynotrequired(NotContainedChildNRT value);

	/**
	 * Returns the value of the '<em><b>Notcontainedtwowayrequirednr</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notcontainedtwowayrequirednr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notcontainedtwowayrequirednr</em>' reference.
	 * @see #setNotcontainedtwowayrequirednr(NotContainedChildRTNR)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getMain_Notcontainedtwowayrequirednr()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR#getMain
	 * @model opposite="main" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='notcontainedtwowayrequirednr'"
	 * @generated
	 */
	NotContainedChildRTNR getNotcontainedtwowayrequirednr();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowayrequirednr <em>Notcontainedtwowayrequirednr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notcontainedtwowayrequirednr</em>' reference.
	 * @see #getNotcontainedtwowayrequirednr()
	 * @generated
	 */
	void setNotcontainedtwowayrequirednr(NotContainedChildRTNR value);

	/**
	 * Returns the value of the '<em><b>Notcontainedtwowaynotrequirednr</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notcontainedtwowaynotrequirednr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notcontainedtwowaynotrequirednr</em>' reference.
	 * @see #setNotcontainedtwowaynotrequirednr(NotContainedChildNRTNR)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#getMain_Notcontainedtwowaynotrequirednr()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR#getMain
	 * @model opposite="main" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='notcontainedtwowaynotrequirednr'"
	 * @generated
	 */
	NotContainedChildNRTNR getNotcontainedtwowaynotrequirednr();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main#getNotcontainedtwowaynotrequirednr <em>Notcontainedtwowaynotrequirednr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notcontainedtwowaynotrequirednr</em>' reference.
	 * @see #getNotcontainedtwowaynotrequirednr()
	 * @generated
	 */
	void setNotcontainedtwowaynotrequirednr(NotContainedChildNRTNR value);

} // Main
