/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleTypeObjectImpl.java,v 1.2 2006/07/22 13:01:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl#getBoo <em>Boo</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl#getByt <em>Byt</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl#getDoubl <em>Doubl</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl#getInte <em>Inte</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl#getLon <em>Lon</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl#getShor <em>Shor</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl#getEnu <em>Enu</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl#getDat <em>Dat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleTypeObjectImpl extends EObjectImpl implements SimpleTypeObject {
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
	 * The default value of the '{@link #getBoo() <em>Boo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoo()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoo() <em>Boo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoo()
	 * @generated
	 * @ordered
	 */
	protected Boolean boo = BOO_EDEFAULT;

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
	protected static final Byte BYT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByt() <em>Byt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByt()
	 * @generated
	 * @ordered
	 */
	protected Byte byt = BYT_EDEFAULT;

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
	protected static final Double DOUBL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoubl() <em>Doubl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubl()
	 * @generated
	 * @ordered
	 */
	protected Double doubl = DOUBL_EDEFAULT;

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
	protected static final Float FLOAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected Float float_ = FLOAT_EDEFAULT;

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
	protected static final Integer INTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInte() <em>Inte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInte()
	 * @generated
	 * @ordered
	 */
	protected Integer inte = INTE_EDEFAULT;

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
	protected static final Long LON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected Long lon = LON_EDEFAULT;

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
	protected static final Short SHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShor() <em>Shor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShor()
	 * @generated
	 * @ordered
	 */
	protected Short shor = SHOR_EDEFAULT;

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
	protected static final SimpleEnum ENU_EDEFAULT = (SimpleEnum)SimpletypesFactory.eINSTANCE.createFromString(SimpletypesPackage.eINSTANCE.getSimpleEnumObject(), "Enum1");

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
	 * This is true if the Dat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean datESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimpletypesPackage.Literals.SIMPLE_TYPE_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__CODE, oldCode, code, !oldCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__CODE, oldCode, CODE_EDEFAULT, oldCodeESet));
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
	public Boolean getBoo() {
		return boo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoo(Boolean newBoo) {
		Boolean oldBoo = boo;
		boo = newBoo;
		boolean oldBooESet = booESet;
		booESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__BOO, oldBoo, boo, !oldBooESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoo() {
		Boolean oldBoo = boo;
		boolean oldBooESet = booESet;
		boo = BOO_EDEFAULT;
		booESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__BOO, oldBoo, BOO_EDEFAULT, oldBooESet));
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
	public Byte getByt() {
		return byt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByt(Byte newByt) {
		Byte oldByt = byt;
		byt = newByt;
		boolean oldBytESet = bytESet;
		bytESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__BYT, oldByt, byt, !oldBytESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetByt() {
		Byte oldByt = byt;
		boolean oldBytESet = bytESet;
		byt = BYT_EDEFAULT;
		bytESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__BYT, oldByt, BYT_EDEFAULT, oldBytESet));
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
	public Double getDoubl() {
		return doubl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubl(Double newDoubl) {
		Double oldDoubl = doubl;
		doubl = newDoubl;
		boolean oldDoublESet = doublESet;
		doublESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__DOUBL, oldDoubl, doubl, !oldDoublESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDoubl() {
		Double oldDoubl = doubl;
		boolean oldDoublESet = doublESet;
		doubl = DOUBL_EDEFAULT;
		doublESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__DOUBL, oldDoubl, DOUBL_EDEFAULT, oldDoublESet));
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
	public Float getFloat() {
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat(Float newFloat) {
		Float oldFloat = float_;
		float_ = newFloat;
		boolean oldFloatESet = floatESet;
		floatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__FLOAT, oldFloat, float_, !oldFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFloat() {
		Float oldFloat = float_;
		boolean oldFloatESet = floatESet;
		float_ = FLOAT_EDEFAULT;
		floatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__FLOAT, oldFloat, FLOAT_EDEFAULT, oldFloatESet));
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
	public Integer getInte() {
		return inte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInte(Integer newInte) {
		Integer oldInte = inte;
		inte = newInte;
		boolean oldInteESet = inteESet;
		inteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__INTE, oldInte, inte, !oldInteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInte() {
		Integer oldInte = inte;
		boolean oldInteESet = inteESet;
		inte = INTE_EDEFAULT;
		inteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__INTE, oldInte, INTE_EDEFAULT, oldInteESet));
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
	public Long getLon() {
		return lon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLon(Long newLon) {
		Long oldLon = lon;
		lon = newLon;
		boolean oldLonESet = lonESet;
		lonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__LON, oldLon, lon, !oldLonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLon() {
		Long oldLon = lon;
		boolean oldLonESet = lonESet;
		lon = LON_EDEFAULT;
		lonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__LON, oldLon, LON_EDEFAULT, oldLonESet));
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
	public Short getShor() {
		return shor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShor(Short newShor) {
		Short oldShor = shor;
		shor = newShor;
		boolean oldShorESet = shorESet;
		shorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__SHOR, oldShor, shor, !oldShorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShor() {
		Short oldShor = shor;
		boolean oldShorESet = shorESet;
		shor = SHOR_EDEFAULT;
		shorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__SHOR, oldShor, SHOR_EDEFAULT, oldShorESet));
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
		enu = newEnu;
		boolean oldEnuESet = enuESet;
		enuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__ENU, oldEnu, enu, !oldEnuESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__ENU, oldEnu, ENU_EDEFAULT, oldEnuESet));
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
		boolean oldDatESet = datESet;
		datESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__DAT, oldDat, dat, !oldDatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDat() {
		Date oldDat = dat;
		boolean oldDatESet = datESet;
		dat = DAT_EDEFAULT;
		datESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_TYPE_OBJECT__DAT, oldDat, DAT_EDEFAULT, oldDatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDat() {
		return datESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__CODE:
				return getCode();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__BOO:
				return getBoo();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__BYT:
				return getByt();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__DOUBL:
				return getDoubl();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__FLOAT:
				return getFloat();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__INTE:
				return getInte();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__LON:
				return getLon();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__SHOR:
				return getShor();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__ENU:
				return getEnu();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__DAT:
				return getDat();
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
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__CODE:
				setCode((String)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__BOO:
				setBoo((Boolean)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__BYT:
				setByt((Byte)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__DOUBL:
				setDoubl((Double)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__FLOAT:
				setFloat((Float)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__INTE:
				setInte((Integer)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__LON:
				setLon((Long)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__SHOR:
				setShor((Short)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__ENU:
				setEnu((SimpleEnum)newValue);
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__DAT:
				setDat((Date)newValue);
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
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__CODE:
				unsetCode();
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__BOO:
				unsetBoo();
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__BYT:
				unsetByt();
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__DOUBL:
				unsetDoubl();
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__FLOAT:
				unsetFloat();
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__INTE:
				unsetInte();
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__LON:
				unsetLon();
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__SHOR:
				unsetShor();
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__ENU:
				unsetEnu();
				return;
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__DAT:
				unsetDat();
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
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__CODE:
				return isSetCode();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__BOO:
				return isSetBoo();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__BYT:
				return isSetByt();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__DOUBL:
				return isSetDoubl();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__FLOAT:
				return isSetFloat();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__INTE:
				return isSetInte();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__LON:
				return isSetLon();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__SHOR:
				return isSetShor();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__ENU:
				return isSetEnu();
			case SimpletypesPackage.SIMPLE_TYPE_OBJECT__DAT:
				return isSetDat();
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
		if (datESet) result.append(dat); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SimpleTypeObjectImpl
