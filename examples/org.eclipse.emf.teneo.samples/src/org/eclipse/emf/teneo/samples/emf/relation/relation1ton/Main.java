/**
 * <copyright>
 * </copyright>
 *
 * $Id: Main.java,v 1.1 2006/07/11 16:57:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1ton;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnecr <em>Onecr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnecn <em>Onecn</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnenr <em>Onenr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getOnenn <em>Onenn</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwocr <em>Twocr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwocn <em>Twocn</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwonr <em>Twonr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwonn <em>Twonn</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getMain()
 * @model extendedMetaData="name='Main' kind='elementOnly'"
 * @generated
 */
public interface Main extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getMain_Name()
	 * @model default="c1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getName <em>Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Onecr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onecr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onecr</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getMain_Onecr()
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCR" containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='onecr'"
	 * @generated
	 */
	EList getOnecr();

	/**
	 * Returns the value of the '<em><b>Onecn</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onecn</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onecn</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getMain_Onecn()
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCN" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='onecn'"
	 * @generated
	 */
	EList getOnecn();

	/**
	 * Returns the value of the '<em><b>Onenr</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onenr</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onenr</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getMain_Onenr()
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNR" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='onenr'"
	 * @generated
	 */
	EList getOnenr();

	/**
	 * Returns the value of the '<em><b>Onenn</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onenn</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onenn</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getMain_Onenn()
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNN" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='onenn'"
	 * @generated
	 */
	EList getOnenn();

	/**
	 * Returns the value of the '<em><b>Twocr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Twocr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twocr</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getMain_Twocr()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR#getMain
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR" opposite="main" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='twocr'"
	 * @generated
	 */
	EList getTwocr();

	/**
	 * Returns the value of the '<em><b>Twocn</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Twocn</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twocn</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getMain_Twocn()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN#getMain
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN" opposite="main" containment="true" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='twocn'"
	 * @generated
	 */
	EList getTwocn();

	/**
	 * Returns the value of the '<em><b>Twonr</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Twonr</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twonr</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getMain_Twonr()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR#getMain
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR" opposite="main" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='twonr'"
	 * @generated
	 */
	EList getTwonr();

	/**
	 * Returns the value of the '<em><b>Twonn</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Twonn</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twonn</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getMain_Twonn()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN#getMain
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN" opposite="main" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='twonn'"
	 * @generated
	 */
	EList getTwonn();

} // Main
