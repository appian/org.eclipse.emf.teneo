/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEAttributeImpl.java,v 1.4 2006/08/24 22:12:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.Lob;
import org.eclipse.emf.teneo.annotations.pannotation.Temporal;
import org.eclipse.emf.teneo.annotations.pannotation.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PAnnotated EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEAttributeImpl#getAnnotatedEAttribute <em>Annotated EAttribute</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEAttributeImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEAttributeImpl#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEAttributeImpl#getGeneratedValue <em>Generated Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEAttributeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEAttributeImpl#getLob <em>Lob</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEAttributeImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEAttributeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PAnnotatedEAttributeImpl extends PAnnotatedEStructuralFeatureImpl implements PAnnotatedEAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The cached value of the '{@link #getAnnotatedEAttribute() <em>Annotated EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute annotatedEAttribute = null;

	/**
	 * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasic()
	 * @generated
	 * @ordered
	 */
	protected Basic basic = null;

	/**
	 * The cached value of the '{@link #getEnumerated() <em>Enumerated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerated()
	 * @generated
	 * @ordered
	 */
	protected Enumerated enumerated = null;

	/**
	 * The cached value of the '{@link #getGeneratedValue() <em>Generated Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedValue()
	 * @generated
	 * @ordered
	 */
	protected GeneratedValue generatedValue = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Id id = null;

	/**
	 * The cached value of the '{@link #getLob() <em>Lob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLob()
	 * @generated
	 * @ordered
	 */
	protected Lob lob = null;

	/**
	 * The cached value of the '{@link #getTemporal() <em>Temporal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporal()
	 * @generated
	 * @ordered
	 */
	protected Temporal temporal = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PAnnotatedEAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PamodelPackage.Literals.PANNOTATED_EATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotatedEAttribute() {
		if (annotatedEAttribute != null && annotatedEAttribute.eIsProxy()) {
			InternalEObject oldAnnotatedEAttribute = (InternalEObject)annotatedEAttribute;
			annotatedEAttribute = (EAttribute)eResolveProxy(oldAnnotatedEAttribute);
			if (annotatedEAttribute != oldAnnotatedEAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_EATTRIBUTE, oldAnnotatedEAttribute, annotatedEAttribute));
			}
		}
		return annotatedEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetAnnotatedEAttribute() {
		return annotatedEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAnnotatedEAttribute(EAttribute newAnnotatedEAttribute) {
		EAttribute oldAnnotatedEAttribute = annotatedEAttribute;
		annotatedEAttribute = newAnnotatedEAttribute;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_EATTRIBUTE, oldAnnotatedEAttribute, annotatedEAttribute));
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ESTRUCTURAL_FEATURE, oldAnnotatedEAttribute, annotatedEAttribute));
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ELEMENT, oldAnnotatedEAttribute, annotatedEAttribute));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic getBasic() {
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic(Basic newBasic, NotificationChain msgs) {
		Basic oldBasic = basic;
		basic = newBasic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__BASIC, oldBasic, newBasic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic(Basic newBasic) {
		if (newBasic != basic) {
			NotificationChain msgs = null;
			if (basic != null)
				msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__BASIC, null, msgs);
			if (newBasic != null)
				msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__BASIC, null, msgs);
			msgs = basicSetBasic(newBasic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__BASIC, newBasic, newBasic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerated getEnumerated() {
		return enumerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumerated(Enumerated newEnumerated, NotificationChain msgs) {
		Enumerated oldEnumerated = enumerated;
		enumerated = newEnumerated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__ENUMERATED, oldEnumerated, newEnumerated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerated(Enumerated newEnumerated) {
		if (newEnumerated != enumerated) {
			NotificationChain msgs = null;
			if (enumerated != null)
				msgs = ((InternalEObject)enumerated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__ENUMERATED, null, msgs);
			if (newEnumerated != null)
				msgs = ((InternalEObject)newEnumerated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__ENUMERATED, null, msgs);
			msgs = basicSetEnumerated(newEnumerated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__ENUMERATED, newEnumerated, newEnumerated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedValue getGeneratedValue() {
		return generatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratedValue(GeneratedValue newGeneratedValue, NotificationChain msgs) {
		GeneratedValue oldGeneratedValue = generatedValue;
		generatedValue = newGeneratedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__GENERATED_VALUE, oldGeneratedValue, newGeneratedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedValue(GeneratedValue newGeneratedValue) {
		if (newGeneratedValue != generatedValue) {
			NotificationChain msgs = null;
			if (generatedValue != null)
				msgs = ((InternalEObject)generatedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__GENERATED_VALUE, null, msgs);
			if (newGeneratedValue != null)
				msgs = ((InternalEObject)newGeneratedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__GENERATED_VALUE, null, msgs);
			msgs = basicSetGeneratedValue(newGeneratedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__GENERATED_VALUE, newGeneratedValue, newGeneratedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(Id newId, NotificationChain msgs) {
		Id oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__ID, oldId, newId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Id newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lob getLob() {
		return lob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLob(Lob newLob, NotificationChain msgs) {
		Lob oldLob = lob;
		lob = newLob;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__LOB, oldLob, newLob);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLob(Lob newLob) {
		if (newLob != lob) {
			NotificationChain msgs = null;
			if (lob != null)
				msgs = ((InternalEObject)lob).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__LOB, null, msgs);
			if (newLob != null)
				msgs = ((InternalEObject)newLob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__LOB, null, msgs);
			msgs = basicSetLob(newLob, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__LOB, newLob, newLob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temporal getTemporal() {
		return temporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporal(Temporal newTemporal, NotificationChain msgs) {
		Temporal oldTemporal = temporal;
		temporal = newTemporal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__TEMPORAL, oldTemporal, newTemporal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporal(Temporal newTemporal) {
		if (newTemporal != temporal) {
			NotificationChain msgs = null;
			if (temporal != null)
				msgs = ((InternalEObject)temporal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__TEMPORAL, null, msgs);
			if (newTemporal != null)
				msgs = ((InternalEObject)newTemporal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__TEMPORAL, null, msgs);
			msgs = basicSetTemporal(newTemporal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__TEMPORAL, newTemporal, newTemporal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(Version newVersion, NotificationChain msgs) {
		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EATTRIBUTE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_EATTRIBUTE__BASIC:
				return basicSetBasic(null, msgs);
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ENUMERATED:
				return basicSetEnumerated(null, msgs);
			case PamodelPackage.PANNOTATED_EATTRIBUTE__GENERATED_VALUE:
				return basicSetGeneratedValue(null, msgs);
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ID:
				return basicSetId(null, msgs);
			case PamodelPackage.PANNOTATED_EATTRIBUTE__LOB:
				return basicSetLob(null, msgs);
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TEMPORAL:
				return basicSetTemporal(null, msgs);
			case PamodelPackage.PANNOTATED_EATTRIBUTE__VERSION:
				return basicSetVersion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_EATTRIBUTE:
				if (resolve) return getAnnotatedEAttribute();
				return basicGetAnnotatedEAttribute();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__BASIC:
				return getBasic();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ENUMERATED:
				return getEnumerated();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__GENERATED_VALUE:
				return getGeneratedValue();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ID:
				return getId();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__LOB:
				return getLob();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TEMPORAL:
				return getTemporal();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__VERSION:
				return getVersion();
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
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_EATTRIBUTE:
				setAnnotatedEAttribute((EAttribute)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__BASIC:
				setBasic((Basic)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ENUMERATED:
				setEnumerated((Enumerated)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__GENERATED_VALUE:
				setGeneratedValue((GeneratedValue)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ID:
				setId((Id)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__LOB:
				setLob((Lob)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TEMPORAL:
				setTemporal((Temporal)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__VERSION:
				setVersion((Version)newValue);
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
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_EATTRIBUTE:
				setAnnotatedEAttribute((EAttribute)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__BASIC:
				setBasic((Basic)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ENUMERATED:
				setEnumerated((Enumerated)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__GENERATED_VALUE:
				setGeneratedValue((GeneratedValue)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ID:
				setId((Id)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__LOB:
				setLob((Lob)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TEMPORAL:
				setTemporal((Temporal)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__VERSION:
				setVersion((Version)null);
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
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_EATTRIBUTE:
				return annotatedEAttribute != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__BASIC:
				return basic != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ENUMERATED:
				return enumerated != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__GENERATED_VALUE:
				return generatedValue != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ID:
				return id != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__LOB:
				return lob != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TEMPORAL:
				return temporal != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__VERSION:
				return version != null;
		}
		return super.eIsSet(featureID);
	}

	public EStructuralFeature basicGetAnnotatedEStructuralFeature() {
		return basicGetAnnotatedEAttribute();
	}

	public void setAnnotatedEStructuralFeature(EStructuralFeature newEStructuralFeature) {
		setAnnotatedEAttribute((EAttribute) newEStructuralFeature);
	}

	/** 
	 * Returns true if the eattribute requires an additional mapping for the isset member which is generated
	 * by emf.
	 */
	public boolean requiresIsSetMapping() {
		return getAnnotatedEStructuralFeature().isUnsettable();
	}
	
} //PAnnotatedEAttributeImpl
