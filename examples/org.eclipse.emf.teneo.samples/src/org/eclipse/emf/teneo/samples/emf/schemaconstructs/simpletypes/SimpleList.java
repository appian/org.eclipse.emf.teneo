/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleList.java,v 1.4 2006/09/29 12:51:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getBoo <em>Boo</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getByt <em>Byt</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getDoubl <em>Doubl</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getFloa <em>Floa</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getInte <em>Inte</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getLong <em>Long</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getShor <em>Shor</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getDat <em>Dat</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getLimitedstring <em>Limitedstring</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getIntArray <em>Int Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getDoubleArray <em>Double Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getStringArray <em>String Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getByteArray <em>Byte Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList()
 * @model extendedMetaData="name='SimpleList' kind='elementOnly'"
 * @generated
 */
public interface SimpleList extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"c1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_Code()
	 * @model default="c1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	void unsetCode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	boolean isSetCode();

	/**
	 * Returns the value of the '<em><b>Boo</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boo</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boo</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_Boo()
	 * @model type="boolean" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='boo'"
	 * @generated
	 */
	EList getBoo();

	/**
	 * Returns the value of the '<em><b>Byt</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Byte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byt</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byt</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_Byt()
	 * @model type="java.lang.Byte" unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.Byte" required="true"
	 *        extendedMetaData="kind='element' name='byt'"
	 * @generated
	 */
	EList getByt();

	/**
	 * Returns the value of the '<em><b>Doubl</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doubl</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doubl</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_Doubl()
	 * @model type="java.lang.Double" unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.Double" required="true"
	 *        extendedMetaData="kind='element' name='doubl'"
	 * @generated
	 */
	EList getDoubl();

	/**
	 * Returns the value of the '<em><b>Floa</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floa</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floa</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_Floa()
	 * @model type="java.lang.Float" unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.Float" required="true"
	 *        extendedMetaData="kind='element' name='floa'"
	 * @generated
	 */
	EList getFloa();

	/**
	 * Returns the value of the '<em><b>Inte</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inte</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inte</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_Inte()
	 * @model type="java.lang.Integer" unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.Int" required="true"
	 *        extendedMetaData="kind='element' name='inte'"
	 * @generated
	 */
	EList getInte();

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_Long()
	 * @model type="java.lang.Long" unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.Long" required="true"
	 *        annotation="teneo.jpa appinfo='@JoinTable(name=\"longNum\")'"
	 *        extendedMetaData="kind='element' name='long'"
	 * @generated
	 */
	EList getLong();

	/**
	 * Returns the value of the '<em><b>Shor</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Short}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shor</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shor</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_Shor()
	 * @model type="short" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Short" required="true"
	 *        extendedMetaData="kind='element' name='shor'"
	 * @generated
	 */
	EList getShor();

	/**
	 * Returns the value of the '<em><b>Dat</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dat</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dat</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_Dat()
	 * @model type="java.util.Date" unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.Date" required="true"
	 *        extendedMetaData="kind='element' name='dat'"
	 * @generated
	 */
	EList getDat();

	/**
	 * Returns the value of the '<em><b>Limitedstring</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limitedstring</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limitedstring</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_Limitedstring()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.LimitedString" required="true"
	 *        extendedMetaData="kind='element' name='limitedstring'"
	 * @generated
	 */
	EList getLimitedstring();

	/**
	 * Returns the value of the '<em><b>Int Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Array</em>' attribute.
	 * @see #setIntArray(int[])
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_IntArray()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.IntArray" required="true"
	 *        extendedMetaData="kind='element' name='intArray'"
	 * @generated
	 */
	int[] getIntArray();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getIntArray <em>Int Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Array</em>' attribute.
	 * @see #getIntArray()
	 * @generated
	 */
	void setIntArray(int[] value);

	/**
	 * Returns the value of the '<em><b>Double Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Array</em>' attribute.
	 * @see #setDoubleArray(double[])
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_DoubleArray()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.DoubleArray" required="true"
	 *        extendedMetaData="kind='element' name='doubleArray'"
	 * @generated
	 */
	double[] getDoubleArray();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getDoubleArray <em>Double Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Array</em>' attribute.
	 * @see #getDoubleArray()
	 * @generated
	 */
	void setDoubleArray(double[] value);

	/**
	 * Returns the value of the '<em><b>String Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Array</em>' attribute.
	 * @see #setStringArray(String[])
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_StringArray()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.StringArray" required="true"
	 *        extendedMetaData="kind='element' name='stringArray'"
	 * @generated
	 */
	String[] getStringArray();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getStringArray <em>String Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Array</em>' attribute.
	 * @see #getStringArray()
	 * @generated
	 */
	void setStringArray(String[] value);

	/**
	 * Returns the value of the '<em><b>Byte Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Array</em>' attribute.
	 * @see #setByteArray(byte[])
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleList_ByteArray()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.ByteArray" required="true"
	 *        extendedMetaData="kind='element' name='byteArray'"
	 * @generated
	 */
	byte[] getByteArray();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getByteArray <em>Byte Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Array</em>' attribute.
	 * @see #getByteArray()
	 * @generated
	 */
	void setByteArray(byte[] value);

} // SimpleList
