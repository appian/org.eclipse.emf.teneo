/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleTypeImpl.java,v 1.1 2006/07/11 16:57:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl#isBoo <em>Boo</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl#getByt <em>Byt</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl#getDoubl <em>Doubl</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl#getInte <em>Inte</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl#getLon <em>Lon</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl#getShor <em>Shor</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl#getEnu <em>Enu</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl#getDat <em>Dat</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl#getLimitedstring <em>Limitedstring</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleTypeImpl extends EObjectImpl implements SimpleType {
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
	protected boolean codeESet = false;

	/**
	 * The default value of the '{@link #isBoo() <em>Boo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoo() <em>Boo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoo()
	 * @generated
	 * @ordered
	 */
	protected boolean boo = BOO_EDEFAULT;

	/**
	 * This is true if the Boo attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean booESet = false;

	/**
	 * The default value of the '{@link #getByt() <em>Byt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByt()
	 * @generated
	 * @ordered
	 */
	protected static final byte BYT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getByt() <em>Byt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByt()
	 * @generated
	 * @ordered
	 */
	protected byte byt = BYT_EDEFAULT;

	/**
	 * This is true if the Byt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bytESet = false;

	/**
	 * The default value of the '{@link #getDoubl() <em>Doubl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubl()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUBL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDoubl() <em>Doubl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubl()
	 * @generated
	 * @ordered
	 */
	protected double doubl = DOUBL_EDEFAULT;

	/**
	 * This is true if the Doubl attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean doublESet = false;

	/**
	 * The default value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected float float_ = FLOAT_EDEFAULT;

	/**
	 * This is true if the Float attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean floatESet = false;

	/**
	 * The default value of the '{@link #getInte() <em>Inte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInte()
	 * @generated
	 * @ordered
	 */
	protected static final int INTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInte() <em>Inte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInte()
	 * @generated
	 * @ordered
	 */
	protected int inte = INTE_EDEFAULT;

	/**
	 * This is true if the Inte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inteESet = false;

	/**
	 * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected static final long LON_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected long lon = LON_EDEFAULT;

	/**
	 * This is true if the Lon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lonESet = false;

	/**
	 * The default value of the '{@link #getShor() <em>Shor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShor()
	 * @generated
	 * @ordered
	 */
	protected static final short SHOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShor() <em>Shor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShor()
	 * @generated
	 * @ordered
	 */
	protected short shor = SHOR_EDEFAULT;

	/**
	 * This is true if the Shor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shorESet = false;

	/**
	 * The default value of the '{@link #getEnu() <em>Enu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnu()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleEnum ENU_EDEFAULT = SimpleEnum.ENUM1_LITERAL;

	/**
	 * The cached value of the '{@link #getEnu() <em>Enu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnu()
	 * @generated
	 * @ordered
	 */
	protected SimpleEnum enu = ENU_EDEFAULT;

	/**
	 * This is true if the Enu attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enuESet = false;

	/**
	 * The default value of the '{@link #getDat() <em>Dat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDat()
	 * @generated
	 * @ordered
	 */
	protected static final Date DAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDat() <em>Dat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDat()
	 * @generated
	 * @ordered
	 */
	protected Date dat = DAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimitedstring() <em>Limitedstring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitedstring()
	 * @generated
	 * @ordered
	 */
	protected static final String LIMITEDSTRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimitedstring() <em>Limitedstring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitedstring()
	 * @generated
	 * @ordered
	 */
	protected String limitedstring = LIMITEDSTRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimpletypesPackage.Literals.SIMPLE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE__CODE, oldCode, code, !oldCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE__CODE, oldCode, CODE_EDEFAULT, oldCodeESet));
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
	public boolean isBoo() {
		return boo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoo(boolean newBoo) {
		boolean oldBoo = boo;
		boo = newBoo;
		boolean oldBooESet = booESet;
		booESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE__BOO, oldBoo, boo, !oldBooESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoo() {
		boolean oldBoo = boo;
		boolean oldBooESet = booESet;
		boo = BOO_EDEFAULT;
		booESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE__BOO, oldBoo, BOO_EDEFAULT, oldBooESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoo() {
		return booESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getByt() {
		return byt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByt(byte newByt) {
		byte oldByt = byt;
		byt = newByt;
		boolean oldBytESet = bytESet;
		bytESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE__BYT, oldByt, byt, !oldBytESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetByt() {
		byte oldByt = byt;
		boolean oldBytESet = bytESet;
		byt = BYT_EDEFAULT;
		bytESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE__BYT, oldByt, BYT_EDEFAULT, oldBytESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetByt() {
		return bytESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDoubl() {
		return doubl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubl(double newDoubl) {
		double oldDoubl = doubl;
		doubl = newDoubl;
		boolean oldDoublESet = doublESet;
		doublESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE__DOUBL, oldDoubl, doubl, !oldDoublESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDoubl() {
		double oldDoubl = doubl;
		boolean oldDoublESet = doublESet;
		doubl = DOUBL_EDEFAULT;
		doublESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE__DOUBL, oldDoubl, DOUBL_EDEFAULT, oldDoublESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDoubl() {
		return doublESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFloat() {
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat(float newFloat) {
		float oldFloat = float_;
		float_ = newFloat;
		boolean oldFloatESet = floatESet;
		floatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE__FLOAT, oldFloat, float_, !oldFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFloat() {
		float oldFloat = float_;
		boolean oldFloatESet = floatESet;
		float_ = FLOAT_EDEFAULT;
		floatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE__FLOAT, oldFloat, FLOAT_EDEFAULT, oldFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFloat() {
		return floatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInte() {
		return inte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInte(int newInte) {
		int oldInte = inte;
		inte = newInte;
		boolean oldInteESet = inteESet;
		inteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE__INTE, oldInte, inte, !oldInteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInte() {
		int oldInte = inte;
		boolean oldInteESet = inteESet;
		inte = INTE_EDEFAULT;
		inteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE__INTE, oldInte, INTE_EDEFAULT, oldInteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInte() {
		return inteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLon() {
		return lon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLon(long newLon) {
		long oldLon = lon;
		lon = newLon;
		boolean oldLonESet = lonESet;
		lonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE__LON, oldLon, lon, !oldLonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLon() {
		long oldLon = lon;
		boolean oldLonESet = lonESet;
		lon = LON_EDEFAULT;
		lonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE__LON, oldLon, LON_EDEFAULT, oldLonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLon() {
		return lonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getShor() {
		return shor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShor(short newShor) {
		short oldShor = shor;
		shor = newShor;
		boolean oldShorESet = shorESet;
		shorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE__SHOR, oldShor, shor, !oldShorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShor() {
		short oldShor = shor;
		boolean oldShorESet = shorESet;
		shor = SHOR_EDEFAULT;
		shorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE__SHOR, oldShor, SHOR_EDEFAULT, oldShorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShor() {
		return shorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleEnum getEnu() {
		return enu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnu(SimpleEnum newEnu) {
		SimpleEnum oldEnu = enu;
		enu = newEnu == null ? ENU_EDEFAULT : newEnu;
		boolean oldEnuESet = enuESet;
		enuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE__ENU, oldEnu, enu, !oldEnuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnu() {
		SimpleEnum oldEnu = enu;
		boolean oldEnuESet = enuESet;
		enu = ENU_EDEFAULT;
		enuESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE__ENU, oldEnu, ENU_EDEFAULT, oldEnuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnu() {
		return enuESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDat() {
		return dat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDat(Date newDat) {
		Date oldDat = dat;
		dat = newDat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE__DAT, oldDat, dat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLimitedstring() {
		return limitedstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitedstring(String newLimitedstring) {
		String oldLimitedstring = limitedstring;
		limitedstring = newLimitedstring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE__LIMITEDSTRING, oldLimitedstring, limitedstring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpletypesPackage.SIMPLE_TYPE__CODE:
				return getCode();
			case SimpletypesPackage.SIMPLE_TYPE__BOO:
				return isBoo() ? Boolean.TRUE : Boolean.FALSE;
			case SimpletypesPackage.SIMPLE_TYPE__BYT:
				return new Byte(getByt());
			case SimpletypesPackage.SIMPLE_TYPE__DOUBL:
				return new Double(getDoubl());
			case SimpletypesPackage.SIMPLE_TYPE__FLOAT:
				return new Float(getFloat());
			case SimpletypesPackage.SIMPLE_TYPE__INTE:
				return new Integer(getInte());
			case SimpletypesPackage.SIMPLE_TYPE__LON:
				return new Long(getLon());
			case SimpletypesPackage.SIMPLE_TYPE__SHOR:
				return new Short(getShor());
			case SimpletypesPackage.SIMPLE_TYPE__ENU:
				return getEnu();
			case SimpletypesPackage.SIMPLE_TYPE__DAT:
				return getDat();
			case SimpletypesPackage.SIMPLE_TYPE__LIMITEDSTRING:
				return getLimitedstring();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpletypesPackage.SIMPLE_TYPE__CODE:
				setCode((String)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE__BOO:
				setBoo(((Boolean)newValue).booleanValue());
				return;
			case SimpletypesPackage.SIMPLE_TYPE__BYT:
				setByt(((Byte)newValue).byteValue());
				return;
			case SimpletypesPackage.SIMPLE_TYPE__DOUBL:
				setDoubl(((Double)newValue).doubleValue());
				return;
			case SimpletypesPackage.SIMPLE_TYPE__FLOAT:
				setFloat(((Float)newValue).floatValue());
				return;
			case SimpletypesPackage.SIMPLE_TYPE__INTE:
				setInte(((Integer)newValue).intValue());
				return;
			case SimpletypesPackage.SIMPLE_TYPE__LON:
				setLon(((Long)newValue).longValue());
				return;
			case SimpletypesPackage.SIMPLE_TYPE__SHOR:
				setShor(((Short)newValue).shortValue());
				return;
			case SimpletypesPackage.SIMPLE_TYPE__ENU:
				setEnu((SimpleEnum)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE__DAT:
				setDat((Date)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE__LIMITEDSTRING:
				setLimitedstring((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimpletypesPackage.SIMPLE_TYPE__CODE:
				unsetCode();
				return;
			case SimpletypesPackage.SIMPLE_TYPE__BOO:
				unsetBoo();
				return;
			case SimpletypesPackage.SIMPLE_TYPE__BYT:
				unsetByt();
				return;
			case SimpletypesPackage.SIMPLE_TYPE__DOUBL:
				unsetDoubl();
				return;
			case SimpletypesPackage.SIMPLE_TYPE__FLOAT:
				unsetFloat();
				return;
			case SimpletypesPackage.SIMPLE_TYPE__INTE:
				unsetInte();
				return;
			case SimpletypesPackage.SIMPLE_TYPE__LON:
				unsetLon();
				return;
			case SimpletypesPackage.SIMPLE_TYPE__SHOR:
				unsetShor();
				return;
			case SimpletypesPackage.SIMPLE_TYPE__ENU:
				unsetEnu();
				return;
			case SimpletypesPackage.SIMPLE_TYPE__DAT:
				setDat(DAT_EDEFAULT);
				return;
			case SimpletypesPackage.SIMPLE_TYPE__LIMITEDSTRING:
				setLimitedstring(LIMITEDSTRING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimpletypesPackage.SIMPLE_TYPE__CODE:
				return isSetCode();
			case SimpletypesPackage.SIMPLE_TYPE__BOO:
				return isSetBoo();
			case SimpletypesPackage.SIMPLE_TYPE__BYT:
				return isSetByt();
			case SimpletypesPackage.SIMPLE_TYPE__DOUBL:
				return isSetDoubl();
			case SimpletypesPackage.SIMPLE_TYPE__FLOAT:
				return isSetFloat();
			case SimpletypesPackage.SIMPLE_TYPE__INTE:
				return isSetInte();
			case SimpletypesPackage.SIMPLE_TYPE__LON:
				return isSetLon();
			case SimpletypesPackage.SIMPLE_TYPE__SHOR:
				return isSetShor();
			case SimpletypesPackage.SIMPLE_TYPE__ENU:
				return isSetEnu();
			case SimpletypesPackage.SIMPLE_TYPE__DAT:
				return DAT_EDEFAULT == null ? dat != null : !DAT_EDEFAULT.equals(dat);
			case SimpletypesPackage.SIMPLE_TYPE__LIMITEDSTRING:
				return LIMITEDSTRING_EDEFAULT == null ? limitedstring != null : !LIMITEDSTRING_EDEFAULT.equals(limitedstring);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (code: ");
		if (codeESet) result.append(code); else result.append("<unset>");
		result.append(", boo: ");
		if (booESet) result.append(boo); else result.append("<unset>");
		result.append(", byt: ");
		if (bytESet) result.append(byt); else result.append("<unset>");
		result.append(", doubl: ");
		if (doublESet) result.append(doubl); else result.append("<unset>");
		result.append(", float: ");
		if (floatESet) result.append(float_); else result.append("<unset>");
		result.append(", inte: ");
		if (inteESet) result.append(inte); else result.append("<unset>");
		result.append(", lon: ");
		if (lonESet) result.append(lon); else result.append("<unset>");
		result.append(", shor: ");
		if (shorESet) result.append(shor); else result.append("<unset>");
		result.append(", enu: ");
		if (enuESet) result.append(enu); else result.append("<unset>");
		result.append(", dat: ");
		result.append(dat);
		result.append(", limitedstring: ");
		result.append(limitedstring);
		result.append(')');
		return result.toString();
	}

} //SimpleTypeImpl
