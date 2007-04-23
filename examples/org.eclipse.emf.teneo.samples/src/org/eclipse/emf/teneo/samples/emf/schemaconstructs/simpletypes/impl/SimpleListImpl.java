/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleListImpl.java,v 1.5 2007/04/23 02:36:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getBoo <em>Boo</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getByt <em>Byt</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getDoubl <em>Doubl</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getFloa <em>Floa</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getInte <em>Inte</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getLong <em>Long</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getShor <em>Shor</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getEnu <em>Enu</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getDat <em>Dat</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getLimitedstring <em>Limitedstring</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getIntArray <em>Int Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getDoubleArray <em>Double Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getStringArray <em>String Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getByteArray <em>Byte Array</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleListImpl extends EObjectImpl implements SimpleList {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = "c1";

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * This is true if the Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeESet;

	/**
	 * The cached value of the '{@link #getBoo() <em>Boo</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoo()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> boo;

	/**
	 * The cached value of the '{@link #getByt() <em>Byt</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByt()
	 * @generated
	 * @ordered
	 */
	protected EList<Byte> byt;

	/**
	 * The cached value of the '{@link #getDoubl() <em>Doubl</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubl()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> doubl;

	/**
	 * The cached value of the '{@link #getFloa() <em>Floa</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloa()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> floa;

	/**
	 * The cached value of the '{@link #getInte() <em>Inte</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInte()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> inte;

	/**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> long_;

	/**
	 * The cached value of the '{@link #getShor() <em>Shor</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShor()
	 * @generated
	 * @ordered
	 */
	protected EList<Short> shor;

	/**
	 * The cached value of the '{@link #getEnu() <em>Enu</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnu()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleEnum> enu;

	/**
	 * The cached value of the '{@link #getDat() <em>Dat</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDat()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> dat;

	/**
	 * The cached value of the '{@link #getLimitedstring() <em>Limitedstring</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitedstring()
	 * @generated
	 * @ordered
	 */
	protected EList<String> limitedstring;

	/**
	 * The default value of the '{@link #getIntArray() <em>Int Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntArray()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INT_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntArray() <em>Int Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntArray()
	 * @generated
	 * @ordered
	 */
	protected int[] intArray = INT_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoubleArray() <em>Double Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleArray()
	 * @generated
	 * @ordered
	 */
	protected static final double[] DOUBLE_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoubleArray() <em>Double Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleArray()
	 * @generated
	 * @ordered
	 */
	protected double[] doubleArray = DOUBLE_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringArray() <em>String Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringArray()
	 * @generated
	 * @ordered
	 */
	protected static final String[] STRING_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringArray() <em>String Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringArray()
	 * @generated
	 * @ordered
	 */
	protected String[] stringArray = STRING_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getByteArray() <em>Byte Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteArray()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BYTE_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByteArray() <em>Byte Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteArray()
	 * @generated
	 * @ordered
	 */
	protected byte[] byteArray = BYTE_ARRAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpletypesPackage.Literals.SIMPLE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		boolean oldCodeESet = codeESet;
		codeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_LIST__CODE, oldCode, code, !oldCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCode() {
		String oldCode = code;
		boolean oldCodeESet = codeESet;
		code = CODE_EDEFAULT;
		codeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_LIST__CODE, oldCode, CODE_EDEFAULT, oldCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCode() {
		return codeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getBoo() {
		if (boo == null) {
			boo = new EDataTypeEList<Boolean>(Boolean.class, this, SimpletypesPackage.SIMPLE_LIST__BOO);
		}
		return boo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Byte> getByt() {
		if (byt == null) {
			byt = new EDataTypeEList<Byte>(Byte.class, this, SimpletypesPackage.SIMPLE_LIST__BYT);
		}
		return byt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getDoubl() {
		if (doubl == null) {
			doubl = new EDataTypeEList<Double>(Double.class, this, SimpletypesPackage.SIMPLE_LIST__DOUBL);
		}
		return doubl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getFloa() {
		if (floa == null) {
			floa = new EDataTypeEList<Float>(Float.class, this, SimpletypesPackage.SIMPLE_LIST__FLOA);
		}
		return floa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getInte() {
		if (inte == null) {
			inte = new EDataTypeEList<Integer>(Integer.class, this, SimpletypesPackage.SIMPLE_LIST__INTE);
		}
		return inte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getLong() {
		if (long_ == null) {
			long_ = new EDataTypeEList<Long>(Long.class, this, SimpletypesPackage.SIMPLE_LIST__LONG);
		}
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Short> getShor() {
		if (shor == null) {
			shor = new EDataTypeEList<Short>(Short.class, this, SimpletypesPackage.SIMPLE_LIST__SHOR);
		}
		return shor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleEnum> getEnu() {
		if (enu == null) {
			enu = new EDataTypeEList<SimpleEnum>(SimpleEnum.class, this, SimpletypesPackage.SIMPLE_LIST__ENU);
		}
		return enu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Date> getDat() {
		if (dat == null) {
			dat = new EDataTypeEList<Date>(Date.class, this, SimpletypesPackage.SIMPLE_LIST__DAT);
		}
		return dat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLimitedstring() {
		if (limitedstring == null) {
			limitedstring = new EDataTypeEList<String>(String.class, this, SimpletypesPackage.SIMPLE_LIST__LIMITEDSTRING);
		}
		return limitedstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] getIntArray() {
		return intArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntArray(int[] newIntArray) {
		int[] oldIntArray = intArray;
		intArray = newIntArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_LIST__INT_ARRAY, oldIntArray, intArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double[] getDoubleArray() {
		return doubleArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleArray(double[] newDoubleArray) {
		double[] oldDoubleArray = doubleArray;
		doubleArray = newDoubleArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_LIST__DOUBLE_ARRAY, oldDoubleArray, doubleArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getStringArray() {
		return stringArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringArray(String[] newStringArray) {
		String[] oldStringArray = stringArray;
		stringArray = newStringArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_LIST__STRING_ARRAY, oldStringArray, stringArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getByteArray() {
		return byteArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteArray(byte[] newByteArray) {
		byte[] oldByteArray = byteArray;
		byteArray = newByteArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_LIST__BYTE_ARRAY, oldByteArray, byteArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpletypesPackage.SIMPLE_LIST__CODE:
				return getCode();
			case SimpletypesPackage.SIMPLE_LIST__BOO:
				return getBoo();
			case SimpletypesPackage.SIMPLE_LIST__BYT:
				return getByt();
			case SimpletypesPackage.SIMPLE_LIST__DOUBL:
				return getDoubl();
			case SimpletypesPackage.SIMPLE_LIST__FLOA:
				return getFloa();
			case SimpletypesPackage.SIMPLE_LIST__INTE:
				return getInte();
			case SimpletypesPackage.SIMPLE_LIST__LONG:
				return getLong();
			case SimpletypesPackage.SIMPLE_LIST__SHOR:
				return getShor();
			case SimpletypesPackage.SIMPLE_LIST__ENU:
				return getEnu();
			case SimpletypesPackage.SIMPLE_LIST__DAT:
				return getDat();
			case SimpletypesPackage.SIMPLE_LIST__LIMITEDSTRING:
				return getLimitedstring();
			case SimpletypesPackage.SIMPLE_LIST__INT_ARRAY:
				return getIntArray();
			case SimpletypesPackage.SIMPLE_LIST__DOUBLE_ARRAY:
				return getDoubleArray();
			case SimpletypesPackage.SIMPLE_LIST__STRING_ARRAY:
				return getStringArray();
			case SimpletypesPackage.SIMPLE_LIST__BYTE_ARRAY:
				return getByteArray();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpletypesPackage.SIMPLE_LIST__CODE:
				setCode((String)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__BOO:
				getBoo().clear();
				getBoo().addAll((Collection<? extends Boolean>)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__BYT:
				getByt().clear();
				getByt().addAll((Collection<? extends Byte>)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__DOUBL:
				getDoubl().clear();
				getDoubl().addAll((Collection<? extends Double>)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__FLOA:
				getFloa().clear();
				getFloa().addAll((Collection<? extends Float>)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__INTE:
				getInte().clear();
				getInte().addAll((Collection<? extends Integer>)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__LONG:
				getLong().clear();
				getLong().addAll((Collection<? extends Long>)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__SHOR:
				getShor().clear();
				getShor().addAll((Collection<? extends Short>)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__ENU:
				getEnu().clear();
				getEnu().addAll((Collection<? extends SimpleEnum>)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__DAT:
				getDat().clear();
				getDat().addAll((Collection<? extends Date>)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__LIMITEDSTRING:
				getLimitedstring().clear();
				getLimitedstring().addAll((Collection<? extends String>)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__INT_ARRAY:
				setIntArray((int[])newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__DOUBLE_ARRAY:
				setDoubleArray((double[])newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__STRING_ARRAY:
				setStringArray((String[])newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__BYTE_ARRAY:
				setByteArray((byte[])newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimpletypesPackage.SIMPLE_LIST__CODE:
				unsetCode();
				return;
			case SimpletypesPackage.SIMPLE_LIST__BOO:
				getBoo().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__BYT:
				getByt().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__DOUBL:
				getDoubl().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__FLOA:
				getFloa().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__INTE:
				getInte().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__LONG:
				getLong().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__SHOR:
				getShor().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__ENU:
				getEnu().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__DAT:
				getDat().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__LIMITEDSTRING:
				getLimitedstring().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__INT_ARRAY:
				setIntArray(INT_ARRAY_EDEFAULT);
				return;
			case SimpletypesPackage.SIMPLE_LIST__DOUBLE_ARRAY:
				setDoubleArray(DOUBLE_ARRAY_EDEFAULT);
				return;
			case SimpletypesPackage.SIMPLE_LIST__STRING_ARRAY:
				setStringArray(STRING_ARRAY_EDEFAULT);
				return;
			case SimpletypesPackage.SIMPLE_LIST__BYTE_ARRAY:
				setByteArray(BYTE_ARRAY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimpletypesPackage.SIMPLE_LIST__CODE:
				return isSetCode();
			case SimpletypesPackage.SIMPLE_LIST__BOO:
				return boo != null && !boo.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__BYT:
				return byt != null && !byt.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__DOUBL:
				return doubl != null && !doubl.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__FLOA:
				return floa != null && !floa.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__INTE:
				return inte != null && !inte.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__LONG:
				return long_ != null && !long_.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__SHOR:
				return shor != null && !shor.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__ENU:
				return enu != null && !enu.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__DAT:
				return dat != null && !dat.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__LIMITEDSTRING:
				return limitedstring != null && !limitedstring.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__INT_ARRAY:
				return INT_ARRAY_EDEFAULT == null ? intArray != null : !INT_ARRAY_EDEFAULT.equals(intArray);
			case SimpletypesPackage.SIMPLE_LIST__DOUBLE_ARRAY:
				return DOUBLE_ARRAY_EDEFAULT == null ? doubleArray != null : !DOUBLE_ARRAY_EDEFAULT.equals(doubleArray);
			case SimpletypesPackage.SIMPLE_LIST__STRING_ARRAY:
				return STRING_ARRAY_EDEFAULT == null ? stringArray != null : !STRING_ARRAY_EDEFAULT.equals(stringArray);
			case SimpletypesPackage.SIMPLE_LIST__BYTE_ARRAY:
				return BYTE_ARRAY_EDEFAULT == null ? byteArray != null : !BYTE_ARRAY_EDEFAULT.equals(byteArray);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (code: ");
		if (codeESet) result.append(code); else result.append("<unset>");
		result.append(", boo: ");
		result.append(boo);
		result.append(", byt: ");
		result.append(byt);
		result.append(", doubl: ");
		result.append(doubl);
		result.append(", floa: ");
		result.append(floa);
		result.append(", inte: ");
		result.append(inte);
		result.append(", long: ");
		result.append(long_);
		result.append(", shor: ");
		result.append(shor);
		result.append(", enu: ");
		result.append(enu);
		result.append(", dat: ");
		result.append(dat);
		result.append(", limitedstring: ");
		result.append(limitedstring);
		result.append(", intArray: ");
		result.append(intArray);
		result.append(", doubleArray: ");
		result.append(doubleArray);
		result.append(", stringArray: ");
		result.append(stringArray);
		result.append(", byteArray: ");
		result.append(byteArray);
		result.append(')');
		return result.toString();
	}

} //SimpleListImpl
