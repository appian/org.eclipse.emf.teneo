/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleType.java,v 1.3 2007/07/18 16:11:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes;

import java.math.BigDecimal;
import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#isBoo <em>Boo</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getByt <em>Byt</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getDoubl <em>Doubl</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getFloat <em>Float</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getInte <em>Inte</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLon <em>Lon</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getShor <em>Shor</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getEnu <em>Enu</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getDat <em>Dat</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLimitedstring <em>Limitedstring</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLimitedDecimal <em>Limited Decimal</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getExtraLimitedString <em>Extra Limited String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType()
 * @model extendedMetaData="name='SimpleType' kind='elementOnly'"
 * @generated
 */
public interface SimpleType extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_Code()
	 * @model default="c1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getCode <em>Code</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	void unsetCode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getCode <em>Code</em>}' attribute is set.
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
	 * @see #setBoo(boolean)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_Boo()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='boo'"
	 * @generated
	 */
	boolean isBoo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#isBoo <em>Boo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boo</em>' attribute.
	 * @see #isSetBoo()
	 * @see #unsetBoo()
	 * @see #isBoo()
	 * @generated
	 */
	void setBoo(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#isBoo <em>Boo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoo()
	 * @see #isBoo()
	 * @see #setBoo(boolean)
	 * @generated
	 */
	void unsetBoo();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#isBoo <em>Boo</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boo</em>' attribute is set.
	 * @see #unsetBoo()
	 * @see #isBoo()
	 * @see #setBoo(boolean)
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
	 * @see #setByt(byte)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_Byt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte" required="true"
	 *        extendedMetaData="kind='element' name='byt'"
	 * @generated
	 */
	byte getByt();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getByt <em>Byt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byt</em>' attribute.
	 * @see #isSetByt()
	 * @see #unsetByt()
	 * @see #getByt()
	 * @generated
	 */
	void setByt(byte value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getByt <em>Byt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetByt()
	 * @see #getByt()
	 * @see #setByt(byte)
	 * @generated
	 */
	void unsetByt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getByt <em>Byt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Byt</em>' attribute is set.
	 * @see #unsetByt()
	 * @see #getByt()
	 * @see #setByt(byte)
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
	 * @see #setDoubl(double)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_Doubl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='doubl'"
	 * @generated
	 */
	double getDoubl();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getDoubl <em>Doubl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doubl</em>' attribute.
	 * @see #isSetDoubl()
	 * @see #unsetDoubl()
	 * @see #getDoubl()
	 * @generated
	 */
	void setDoubl(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getDoubl <em>Doubl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoubl()
	 * @see #getDoubl()
	 * @see #setDoubl(double)
	 * @generated
	 */
	void unsetDoubl();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getDoubl <em>Doubl</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Doubl</em>' attribute is set.
	 * @see #unsetDoubl()
	 * @see #getDoubl()
	 * @see #setDoubl(double)
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
	 * @see #setFloat(float)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_Float()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='element' name='float'"
	 * @generated
	 */
	float getFloat();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getFloat <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float</em>' attribute.
	 * @see #isSetFloat()
	 * @see #unsetFloat()
	 * @see #getFloat()
	 * @generated
	 */
	void setFloat(float value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getFloat <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFloat()
	 * @see #getFloat()
	 * @see #setFloat(float)
	 * @generated
	 */
	void unsetFloat();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getFloat <em>Float</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Float</em>' attribute is set.
	 * @see #unsetFloat()
	 * @see #getFloat()
	 * @see #setFloat(float)
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
	 * @see #setInte(int)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_Inte()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='inte'"
	 * @generated
	 */
	int getInte();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getInte <em>Inte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inte</em>' attribute.
	 * @see #isSetInte()
	 * @see #unsetInte()
	 * @see #getInte()
	 * @generated
	 */
	void setInte(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getInte <em>Inte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInte()
	 * @see #getInte()
	 * @see #setInte(int)
	 * @generated
	 */
	void unsetInte();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getInte <em>Inte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inte</em>' attribute is set.
	 * @see #unsetInte()
	 * @see #getInte()
	 * @see #setInte(int)
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
	 * @see #setLon(long)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_Lon()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='lon'"
	 * @generated
	 */
	long getLon();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #isSetLon()
	 * @see #unsetLon()
	 * @see #getLon()
	 * @generated
	 */
	void setLon(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLon()
	 * @see #getLon()
	 * @see #setLon(long)
	 * @generated
	 */
	void unsetLon();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLon <em>Lon</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lon</em>' attribute is set.
	 * @see #unsetLon()
	 * @see #getLon()
	 * @see #setLon(long)
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
	 * @see #setShor(short)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_Shor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short" required="true"
	 *        extendedMetaData="kind='element' name='shor'"
	 * @generated
	 */
	short getShor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getShor <em>Shor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shor</em>' attribute.
	 * @see #isSetShor()
	 * @see #unsetShor()
	 * @see #getShor()
	 * @generated
	 */
	void setShor(short value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getShor <em>Shor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShor()
	 * @see #getShor()
	 * @see #setShor(short)
	 * @generated
	 */
	void unsetShor();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getShor <em>Shor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shor</em>' attribute is set.
	 * @see #unsetShor()
	 * @see #getShor()
	 * @see #setShor(short)
	 * @generated
	 */
	boolean isSetShor();

	/**
	 * Returns the value of the '<em><b>Enu</b></em>' attribute.
	 * The default value is <code>"Enum1"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enu</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum
	 * @see #isSetEnu()
	 * @see #unsetEnu()
	 * @see #setEnu(SimpleEnum)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_Enu()
	 * @model default="Enum1" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='enu'"
	 * @generated
	 */
	SimpleEnum getEnu();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getEnu <em>Enu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enu</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum
	 * @see #isSetEnu()
	 * @see #unsetEnu()
	 * @see #getEnu()
	 * @generated
	 */
	void setEnu(SimpleEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getEnu <em>Enu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnu()
	 * @see #getEnu()
	 * @see #setEnu(SimpleEnum)
	 * @generated
	 */
	void unsetEnu();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getEnu <em>Enu</em>}' attribute is set.
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
	 * @see #setDat(Date)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_Dat()
	 * @model dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.Date" required="true"
	 *        extendedMetaData="kind='element' name='dat'"
	 * @generated
	 */
	Date getDat();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getDat <em>Dat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dat</em>' attribute.
	 * @see #getDat()
	 * @generated
	 */
	void setDat(Date value);

	/**
	 * Returns the value of the '<em><b>Limitedstring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limitedstring</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limitedstring</em>' attribute.
	 * @see #setLimitedstring(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_Limitedstring()
	 * @model dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.LimitedString" required="true"
	 *        extendedMetaData="kind='element' name='limitedstring'"
	 * @generated
	 */
	String getLimitedstring();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLimitedstring <em>Limitedstring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limitedstring</em>' attribute.
	 * @see #getLimitedstring()
	 * @generated
	 */
	void setLimitedstring(String value);

	/**
	 * Returns the value of the '<em><b>Limited Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limited Decimal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limited Decimal</em>' attribute.
	 * @see #isSetLimitedDecimal()
	 * @see #unsetLimitedDecimal()
	 * @see #setLimitedDecimal(BigDecimal)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_LimitedDecimal()
	 * @model unsettable="true" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.LimitedDecimal" required="true"
	 *        extendedMetaData="kind='element' name='limitedDecimal'"
	 * @generated
	 */
	BigDecimal getLimitedDecimal();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLimitedDecimal <em>Limited Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limited Decimal</em>' attribute.
	 * @see #isSetLimitedDecimal()
	 * @see #unsetLimitedDecimal()
	 * @see #getLimitedDecimal()
	 * @generated
	 */
	void setLimitedDecimal(BigDecimal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLimitedDecimal <em>Limited Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLimitedDecimal()
	 * @see #getLimitedDecimal()
	 * @see #setLimitedDecimal(BigDecimal)
	 * @generated
	 */
	void unsetLimitedDecimal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLimitedDecimal <em>Limited Decimal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Limited Decimal</em>' attribute is set.
	 * @see #unsetLimitedDecimal()
	 * @see #getLimitedDecimal()
	 * @see #setLimitedDecimal(BigDecimal)
	 * @generated
	 */
	boolean isSetLimitedDecimal();

	/**
	 * Returns the value of the '<em><b>Extra Limited String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Limited String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Limited String</em>' attribute.
	 * @see #setExtraLimitedString(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleType_ExtraLimitedString()
	 * @model dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.ExtraLimitedString" required="true"
	 *        extendedMetaData="kind='element' name='extraLimitedString'"
	 * @generated
	 */
	String getExtraLimitedString();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getExtraLimitedString <em>Extra Limited String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Limited String</em>' attribute.
	 * @see #getExtraLimitedString()
	 * @generated
	 */
	void setExtraLimitedString(String value);

} // SimpleType
