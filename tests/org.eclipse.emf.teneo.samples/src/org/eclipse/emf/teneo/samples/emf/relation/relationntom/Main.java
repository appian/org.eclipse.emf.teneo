/**
 * <copyright>
 * </copyright>
 *
 * $Id: Main.java,v 1.2 2007/02/08 23:09:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relationntom;

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
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getMultinr <em>Multinr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getMultirn <em>Multirn</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getMultinn <em>Multinn</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage#getMain()
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
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage#getMain_Name()
	 * @model default="c1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main#getName <em>Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Multinr</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multinr</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multinr</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage#getMain_Multinr()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR#getMain
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR" opposite="main" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='multinr'"
	 * @generated
	 */
	EList<MultiNR> getMultinr();

	/**
	 * Returns the value of the '<em><b>Multirn</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multirn</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multirn</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage#getMain_Multirn()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN#getMain
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN" opposite="main" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='multirn'"
	 * @generated
	 */
	EList<MultiRN> getMultirn();

	/**
	 * Returns the value of the '<em><b>Multinn</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multinn</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multinn</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage#getMain_Multinn()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN#getMain
	 * @model type="org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN" opposite="main" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='multinn'"
	 * @generated
	 */
	EList<MultiNN> getMultinn();

} // Main
