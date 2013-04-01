/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleTypeObject.java,v 1.3 2007/07/18 16:11:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getBoo <em>Boo</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getByt <em>Byt</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDoubl <em>Doubl</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getFloat <em>Float</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getInte <em>Inte</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getLon <em>Lon</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getShor <em>Shor</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getEnu <em>Enu</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDat <em>Dat</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleTypeObject()
 * @model extendedMetaData="name='SimpleTypeObject' kind='elementOnly'"
 * @generated
 */
public interface SimpleTypeObject extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleTypeObject_Code()
	 * @model default="c1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getCode <em>Code</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	void unsetCode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getCode <em>Code</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Boo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boo</em>' attribute.
	 * @see #isSetBoo()
	 * @see #unsetBoo()
	 * @see #setBoo(Boolean)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleTypeObject_Boo()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject" required="true"
	 *        extendedMetaData="kind='element' name='boo'"
	 * @generated
	 */
	Boolean getBoo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getBoo <em>Boo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boo</em>' attribute.
	 * @see #isSetBoo()
	 * @see #unsetBoo()
	 * @see #getBoo()
	 * @generated
	 */
	void setBoo(Boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getBoo <em>Boo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoo()
	 * @see #getBoo()
	 * @see #setBoo(Boolean)
	 * @generated
	 */
	void unsetBoo();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getBoo <em>Boo</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boo</em>' attribute is set.
	 * @see #unsetBoo()
	 * @see #getBoo()
	 * @see #setBoo(Boolean)
	 * @generated
	 */
	boolean isSetBoo();

	/**
	 * Returns the value of the '<em><b>Byt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byt</em>' attribute.
	 * @see #isSetByt()
	 * @see #unsetByt()
	 * @see #setByt(Byte)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleTypeObject_Byt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.ByteObject" required="true"
	 *        extendedMetaData="kind='element' name='byt'"
	 * @generated
	 */
	Byte getByt();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getByt <em>Byt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byt</em>' attribute.
	 * @see #isSetByt()
	 * @see #unsetByt()
	 * @see #getByt()
	 * @generated
	 */
	void setByt(Byte value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getByt <em>Byt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetByt()
	 * @see #getByt()
	 * @see #setByt(Byte)
	 * @generated
	 */
	void unsetByt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getByt <em>Byt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Byt</em>' attribute is set.
	 * @see #unsetByt()
	 * @see #getByt()
	 * @see #setByt(Byte)
	 * @generated
	 */
	boolean isSetByt();

	/**
	 * Returns the value of the '<em><b>Doubl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doubl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doubl</em>' attribute.
	 * @see #isSetDoubl()
	 * @see #unsetDoubl()
	 * @see #setDoubl(Double)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleTypeObject_Doubl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DoubleObject" required="true"
	 *        extendedMetaData="kind='element' name='doubl'"
	 * @generated
	 */
	Double getDoubl();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDoubl <em>Doubl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doubl</em>' attribute.
	 * @see #isSetDoubl()
	 * @see #unsetDoubl()
	 * @see #getDoubl()
	 * @generated
	 */
	void setDoubl(Double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDoubl <em>Doubl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoubl()
	 * @see #getDoubl()
	 * @see #setDoubl(Double)
	 * @generated
	 */
	void unsetDoubl();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDoubl <em>Doubl</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Doubl</em>' attribute is set.
	 * @see #unsetDoubl()
	 * @see #getDoubl()
	 * @see #setDoubl(Double)
	 * @generated
	 */
	boolean isSetDoubl();

	/**
	 * Returns the value of the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' attribute.
	 * @see #isSetFloat()
	 * @see #unsetFloat()
	 * @see #setFloat(Float)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleTypeObject_Float()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.FloatObject" required="true"
	 *        extendedMetaData="kind='element' name='float'"
	 * @generated
	 */
	Float getFloat();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getFloat <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float</em>' attribute.
	 * @see #isSetFloat()
	 * @see #unsetFloat()
	 * @see #getFloat()
	 * @generated
	 */
	void setFloat(Float value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getFloat <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFloat()
	 * @see #getFloat()
	 * @see #setFloat(Float)
	 * @generated
	 */
	void unsetFloat();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getFloat <em>Float</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Float</em>' attribute is set.
	 * @see #unsetFloat()
	 * @see #getFloat()
	 * @see #setFloat(Float)
	 * @generated
	 */
	boolean isSetFloat();

	/**
	 * Returns the value of the '<em><b>Inte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inte</em>' attribute.
	 * @see #isSetInte()
	 * @see #unsetInte()
	 * @see #setInte(Integer)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleTypeObject_Inte()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject" required="true"
	 *        extendedMetaData="kind='element' name='inte'"
	 * @generated
	 */
	Integer getInte();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getInte <em>Inte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inte</em>' attribute.
	 * @see #isSetInte()
	 * @see #unsetInte()
	 * @see #getInte()
	 * @generated
	 */
	void setInte(Integer value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getInte <em>Inte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInte()
	 * @see #getInte()
	 * @see #setInte(Integer)
	 * @generated
	 */
	void unsetInte();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getInte <em>Inte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inte</em>' attribute is set.
	 * @see #unsetInte()
	 * @see #getInte()
	 * @see #setInte(Integer)
	 * @generated
	 */
	boolean isSetInte();

	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #isSetLon()
	 * @see #unsetLon()
	 * @see #setLon(Long)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleTypeObject_Lon()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.LongObject" required="true"
	 *        extendedMetaData="kind='element' name='lon'"
	 * @generated
	 */
	Long getLon();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #isSetLon()
	 * @see #unsetLon()
	 * @see #getLon()
	 * @generated
	 */
	void setLon(Long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLon()
	 * @see #getLon()
	 * @see #setLon(Long)
	 * @generated
	 */
	void unsetLon();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getLon <em>Lon</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lon</em>' attribute is set.
	 * @see #unsetLon()
	 * @see #getLon()
	 * @see #setLon(Long)
	 * @generated
	 */
	boolean isSetLon();

	/**
	 * Returns the value of the '<em><b>Shor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shor</em>' attribute.
	 * @see #isSetShor()
	 * @see #unsetShor()
	 * @see #setShor(Short)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleTypeObject_Shor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.ShortObject" required="true"
	 *        extendedMetaData="kind='element' name='shor'"
	 * @generated
	 */
	Short getShor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getShor <em>Shor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shor</em>' attribute.
	 * @see #isSetShor()
	 * @see #unsetShor()
	 * @see #getShor()
	 * @generated
	 */
	void setShor(Short value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getShor <em>Shor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShor()
	 * @see #getShor()
	 * @see #setShor(Short)
	 * @generated
	 */
	void unsetShor();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getShor <em>Shor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shor</em>' attribute is set.
	 * @see #unsetShor()
	 * @see #getShor()
	 * @see #setShor(Short)
	 * @generated
	 */
	boolean isSetShor();

	/**
	 * Returns the value of the '<em><b>Enu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enu</em>' attribute.
	 * @see #isSetEnu()
	 * @see #unsetEnu()
	 * @see #setEnu(SimpleEnum)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleTypeObject_Enu()
	 * @model unsettable="true" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnumObject" required="true"
	 *        annotation="teneo.jpa appinfo='@Enumerated(STRING)'"
	 *        extendedMetaData="kind='element' name='enu'"
	 * @generated
	 */
	SimpleEnum getEnu();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getEnu <em>Enu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enu</em>' attribute.
	 * @see #isSetEnu()
	 * @see #unsetEnu()
	 * @see #getEnu()
	 * @generated
	 */
	void setEnu(SimpleEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getEnu <em>Enu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnu()
	 * @see #getEnu()
	 * @see #setEnu(SimpleEnum)
	 * @generated
	 */
	void unsetEnu();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getEnu <em>Enu</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enu</em>' attribute is set.
	 * @see #unsetEnu()
	 * @see #getEnu()
	 * @see #setEnu(SimpleEnum)
	 * @generated
	 */
	boolean isSetEnu();

	/**
	 * Returns the value of the '<em><b>Dat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dat</em>' attribute.
	 * @see #isSetDat()
	 * @see #unsetDat()
	 * @see #setDat(Date)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleTypeObject_Dat()
	 * @model unsettable="true" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.Date" required="true"
	 *        extendedMetaData="kind='element' name='dat'"
	 * @generated
	 */
	Date getDat();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDat <em>Dat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dat</em>' attribute.
	 * @see #isSetDat()
	 * @see #unsetDat()
	 * @see #getDat()
	 * @generated
	 */
	void setDat(Date value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDat <em>Dat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDat()
	 * @see #getDat()
	 * @see #setDat(Date)
	 * @generated
	 */
	void unsetDat();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDat <em>Dat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dat</em>' attribute is set.
	 * @see #unsetDat()
	 * @see #getDat()
	 * @see #setDat(Date)
	 * @generated
	 */
	boolean isSetDat();

} // SimpleTypeObject
