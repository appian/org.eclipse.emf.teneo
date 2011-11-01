/**
 * <copyright>
 * </copyright>
 *
 * $Id: statesByCountry.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>states By Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getCountry <em>Country</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getAllStates <em>All States</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSixImportantStates <em>Six Important States</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getZipUnion <em>Zip Union</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getZipUnions <em>Zip Unions</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleUnion <em>Simple Union</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleUnions <em>Simple Unions</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleStringUnion <em>Simple String Union</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleStringUnions <em>Simple String Unions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage#getstatesByCountry()
 * @model extendedMetaData="name='CountryStates' kind='elementOnly'"
 * @generated
 */
public interface statesByCountry extends EObject{
	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage#getstatesByCountry_Country()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Country'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>All States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All States</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All States</em>' attribute.
	 * @see #setAllStates(List<String>)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage#getstatesByCountry_AllStates()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.StateList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='AllStates'"
	 * @generated
	 */
	List<String> getAllStates();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getAllStates <em>All States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All States</em>' attribute.
	 * @see #getAllStates()
	 * @generated
	 */
	void setAllStates(List<String> value);

	/**
	 * Returns the value of the '<em><b>Six Important States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Six Important States</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Six Important States</em>' attribute.
	 * @see #setSixImportantStates(List<String>)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage#getstatesByCountry_SixImportantStates()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.SixStatesList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='SixImportantStates'"
	 * @generated
	 */
	List<String> getSixImportantStates();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSixImportantStates <em>Six Important States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Six Important States</em>' attribute.
	 * @see #getSixImportantStates()
	 * @generated
	 */
	void setSixImportantStates(List<String> value);

	/**
	 * Returns the value of the '<em><b>Zip Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip Union</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip Union</em>' attribute.
	 * @see #setZipUnion(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage#getstatesByCountry_ZipUnion()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ZipUnionType" required="true"
	 *        extendedMetaData="kind='element' name='zipUnion'"
	 * @generated
	 */
	String getZipUnion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getZipUnion <em>Zip Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip Union</em>' attribute.
	 * @see #getZipUnion()
	 * @generated
	 */
	void setZipUnion(String value);

	/**
	 * Returns the value of the '<em><b>Zip Unions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip Unions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip Unions</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage#getstatesByCountry_ZipUnions()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ZipUnionsType" required="true"
	 *        extendedMetaData="kind='element' name='zipUnions'"
	 * @generated
	 */
	EList<String> getZipUnions();

	/**
	 * Returns the value of the '<em><b>Simple Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Union</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Union</em>' attribute.
	 * @see #setSimpleUnion(Object)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage#getstatesByCountry_SimpleUnion()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.SimpleUnionType" required="true"
	 *        extendedMetaData="kind='element' name='simpleUnion'"
	 * @generated
	 */
	Object getSimpleUnion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleUnion <em>Simple Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Union</em>' attribute.
	 * @see #getSimpleUnion()
	 * @generated
	 */
	void setSimpleUnion(Object value);

	/**
	 * Returns the value of the '<em><b>Simple Unions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Unions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Unions</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage#getstatesByCountry_SimpleUnions()
	 * @model type="java.lang.Object" unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.SimpleUnionType" required="true"
	 *        extendedMetaData="kind='element' name='simpleUnions'"
	 * @generated
	 */
	EList<Object> getSimpleUnions();

	/**
	 * Returns the value of the '<em><b>Simple String Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple String Union</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple String Union</em>' attribute.
	 * @see #setSimpleStringUnion(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage#getstatesByCountry_SimpleStringUnion()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.SimpleStringUnionType" required="true"
	 *        extendedMetaData="kind='element' name='simpleStringUnion'"
	 * @generated
	 */
	String getSimpleStringUnion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleStringUnion <em>Simple String Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple String Union</em>' attribute.
	 * @see #getSimpleStringUnion()
	 * @generated
	 */
	void setSimpleStringUnion(String value);

	/**
	 * Returns the value of the '<em><b>Simple String Unions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple String Unions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple String Unions</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage#getstatesByCountry_SimpleStringUnions()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.SimpleStringUnionType" required="true"
	 *        extendedMetaData="kind='element' name='simpleStringUnions'"
	 * @generated
	 */
	EList<String> getSimpleStringUnions();

} // statesByCountry
