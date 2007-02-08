/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEDataTypeImpl.java,v 1.3 2007/02/08 23:12:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
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
 * An implementation of the model object '<em><b>PAnnotated EData Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEDataTypeImpl#getAnnotatedEDataType <em>Annotated EData Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEDataTypeImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEDataTypeImpl#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEDataTypeImpl#getGeneratedValue <em>Generated Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEDataTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEDataTypeImpl#getLob <em>Lob</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEDataTypeImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEDataTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEDataTypeImpl#getPaEPackage <em>Pa EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PAnnotatedEDataTypeImpl extends PAnnotatedETypedElementImpl implements PAnnotatedEDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The cached value of the '{@link #getAnnotatedEDataType() <em>Annotated EData Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedEDataType()
	 * @generated
	 * @ordered
	 */
	protected EDataType annotatedEDataType = null;

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
	protected PAnnotatedEDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PamodelPackage.Literals.PANNOTATED_EDATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnnotatedEDataType() {
		if (annotatedEDataType != null && annotatedEDataType.eIsProxy()) {
			InternalEObject oldAnnotatedEDataType = (InternalEObject)annotatedEDataType;
			annotatedEDataType = (EDataType)eResolveProxy(oldAnnotatedEDataType);
			if (annotatedEDataType != oldAnnotatedEDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PamodelPackage.PANNOTATED_EDATA_TYPE__ANNOTATED_EDATA_TYPE, oldAnnotatedEDataType, annotatedEDataType));
			}
		}
		return annotatedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType basicGetAnnotatedEDataType() {
		return annotatedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedEDataType(EDataType newAnnotatedEDataType) {
		EDataType oldAnnotatedEDataType = annotatedEDataType;
		annotatedEDataType = newAnnotatedEDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__ANNOTATED_EDATA_TYPE, oldAnnotatedEDataType, annotatedEDataType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__BASIC, oldBasic, newBasic);
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
				msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__BASIC, null, msgs);
			if (newBasic != null)
				msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__BASIC, null, msgs);
			msgs = basicSetBasic(newBasic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__BASIC, newBasic, newBasic));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__ENUMERATED, oldEnumerated, newEnumerated);
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
				msgs = ((InternalEObject)enumerated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__ENUMERATED, null, msgs);
			if (newEnumerated != null)
				msgs = ((InternalEObject)newEnumerated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__ENUMERATED, null, msgs);
			msgs = basicSetEnumerated(newEnumerated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__ENUMERATED, newEnumerated, newEnumerated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__GENERATED_VALUE, oldGeneratedValue, newGeneratedValue);
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
				msgs = ((InternalEObject)generatedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__GENERATED_VALUE, null, msgs);
			if (newGeneratedValue != null)
				msgs = ((InternalEObject)newGeneratedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__GENERATED_VALUE, null, msgs);
			msgs = basicSetGeneratedValue(newGeneratedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__GENERATED_VALUE, newGeneratedValue, newGeneratedValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__ID, oldId, newId);
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
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__ID, newId, newId));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__LOB, oldLob, newLob);
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
				msgs = ((InternalEObject)lob).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__LOB, null, msgs);
			if (newLob != null)
				msgs = ((InternalEObject)newLob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__LOB, null, msgs);
			msgs = basicSetLob(newLob, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__LOB, newLob, newLob));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__TEMPORAL, oldTemporal, newTemporal);
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
				msgs = ((InternalEObject)temporal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__TEMPORAL, null, msgs);
			if (newTemporal != null)
				msgs = ((InternalEObject)newTemporal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__TEMPORAL, null, msgs);
			msgs = basicSetTemporal(newTemporal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__TEMPORAL, newTemporal, newTemporal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EDATA_TYPE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedEPackage getPaEPackage() {
		if (eContainerFeatureID != PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE) return null;
		return (PAnnotatedEPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaEPackage(PAnnotatedEPackage newPaEPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPaEPackage, PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaEPackage(PAnnotatedEPackage newPaEPackage) {
		if (newPaEPackage != eInternalContainer() || (eContainerFeatureID != PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE && newPaEPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPaEPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPaEPackage != null)
				msgs = ((InternalEObject)newPaEPackage).eInverseAdd(this, PamodelPackage.PANNOTATED_EPACKAGE__PA_EDATA_TYPES, PAnnotatedEPackage.class, msgs);
			msgs = basicSetPaEPackage(newPaEPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE, newPaEPackage, newPaEPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPaEPackage((PAnnotatedEPackage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_EDATA_TYPE__BASIC:
				return basicSetBasic(null, msgs);
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ENUMERATED:
				return basicSetEnumerated(null, msgs);
			case PamodelPackage.PANNOTATED_EDATA_TYPE__GENERATED_VALUE:
				return basicSetGeneratedValue(null, msgs);
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ID:
				return basicSetId(null, msgs);
			case PamodelPackage.PANNOTATED_EDATA_TYPE__LOB:
				return basicSetLob(null, msgs);
			case PamodelPackage.PANNOTATED_EDATA_TYPE__TEMPORAL:
				return basicSetTemporal(null, msgs);
			case PamodelPackage.PANNOTATED_EDATA_TYPE__VERSION:
				return basicSetVersion(null, msgs);
			case PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE:
				return basicSetPaEPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE:
				return eInternalContainer().eInverseRemove(this, PamodelPackage.PANNOTATED_EPACKAGE__PA_EDATA_TYPES, PAnnotatedEPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ANNOTATED_EDATA_TYPE:
				if (resolve) return getAnnotatedEDataType();
				return basicGetAnnotatedEDataType();
			case PamodelPackage.PANNOTATED_EDATA_TYPE__BASIC:
				return getBasic();
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ENUMERATED:
				return getEnumerated();
			case PamodelPackage.PANNOTATED_EDATA_TYPE__GENERATED_VALUE:
				return getGeneratedValue();
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ID:
				return getId();
			case PamodelPackage.PANNOTATED_EDATA_TYPE__LOB:
				return getLob();
			case PamodelPackage.PANNOTATED_EDATA_TYPE__TEMPORAL:
				return getTemporal();
			case PamodelPackage.PANNOTATED_EDATA_TYPE__VERSION:
				return getVersion();
			case PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE:
				return getPaEPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ANNOTATED_EDATA_TYPE:
				setAnnotatedEDataType((EDataType)newValue);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__BASIC:
				setBasic((Basic)newValue);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ENUMERATED:
				setEnumerated((Enumerated)newValue);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__GENERATED_VALUE:
				setGeneratedValue((GeneratedValue)newValue);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ID:
				setId((Id)newValue);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__LOB:
				setLob((Lob)newValue);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__TEMPORAL:
				setTemporal((Temporal)newValue);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__VERSION:
				setVersion((Version)newValue);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE:
				setPaEPackage((PAnnotatedEPackage)newValue);
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
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ANNOTATED_EDATA_TYPE:
				setAnnotatedEDataType((EDataType)null);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__BASIC:
				setBasic((Basic)null);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ENUMERATED:
				setEnumerated((Enumerated)null);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__GENERATED_VALUE:
				setGeneratedValue((GeneratedValue)null);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ID:
				setId((Id)null);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__LOB:
				setLob((Lob)null);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__TEMPORAL:
				setTemporal((Temporal)null);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__VERSION:
				setVersion((Version)null);
				return;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE:
				setPaEPackage((PAnnotatedEPackage)null);
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
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ANNOTATED_EDATA_TYPE:
				return annotatedEDataType != null;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__BASIC:
				return basic != null;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ENUMERATED:
				return enumerated != null;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__GENERATED_VALUE:
				return generatedValue != null;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__ID:
				return id != null;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__LOB:
				return lob != null;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__TEMPORAL:
				return temporal != null;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__VERSION:
				return version != null;
			case PamodelPackage.PANNOTATED_EDATA_TYPE__PA_EPACKAGE:
				return getPaEPackage() != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEModelElementImpl#basicGetAnnotatedElement()
	 */
	public ENamedElement basicGetAnnotatedElement() {
		return annotatedEDataType;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEModelElementImpl#setAnnotatedElement(org.eclipse.emf.ecore.ENamedElement)
	 */
	public void setAnnotatedElement(ENamedElement newAnnotatedElement) {
		annotatedEDataType = (EDataType)newAnnotatedElement;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement#getPaModel()
	 */
	public PAnnotatedModel getPaModel() {
		return getPaEPackage().getPaModel();
	}
} //PAnnotatedEDataTypeImpl