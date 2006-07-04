/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEAttributeImpl.java,v 1.1 2006/07/04 21:37:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.Columns;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.IdBag;
import org.eclipse.emf.teneo.annotations.pannotation.Indexed;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumns;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.Lob;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Temporal;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;
import org.eclipse.emf.teneo.annotations.pannotation.Type;
import org.eclipse.emf.teneo.annotations.pannotation.Unique;
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
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEAttributeImpl#getType <em>Type</em>}</li>
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
	public static final String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = null;

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
		return PamodelPackage.eINSTANCE.getPAnnotatedEAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotatedEAttribute() {
		if (annotatedEAttribute != null && annotatedEAttribute.eIsProxy()) {
			EAttribute oldAnnotatedEAttribute = annotatedEAttribute;
			annotatedEAttribute = (EAttribute)eResolveProxy((InternalEObject)annotatedEAttribute);
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
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			Type oldType = type;
			type = (Type)eResolveProxy((InternalEObject)type);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PamodelPackage.PANNOTATED_EATTRIBUTE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PamodelPackage.PANNOTATED_EATTRIBUTE__PA_ECLASS:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, PamodelPackage.PANNOTATED_EATTRIBUTE__PA_ECLASS, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PamodelPackage.PANNOTATED_EATTRIBUTE__TRANSIENT:
					return basicSetTransient(null, msgs);
				case PamodelPackage.PANNOTATED_EATTRIBUTE__PA_ECLASS:
					return eBasicSetContainer(null, PamodelPackage.PANNOTATED_EATTRIBUTE__PA_ECLASS, msgs);
				case PamodelPackage.PANNOTATED_EATTRIBUTE__ATTRIBUTE_OVERRIDES:
					return basicSetAttributeOverrides(null, msgs);
				case PamodelPackage.PANNOTATED_EATTRIBUTE__COLUMNS:
					return basicSetColumns(null, msgs);
				case PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_TABLE:
					return basicSetJoinTable(null, msgs);
				case PamodelPackage.PANNOTATED_EATTRIBUTE__ONE_TO_MANY:
					return basicSetOneToMany(null, msgs);
				case PamodelPackage.PANNOTATED_EATTRIBUTE__SEQUENCE_GENERATOR:
					return basicSetSequenceGenerator(null, msgs);
				case PamodelPackage.PANNOTATED_EATTRIBUTE__TABLE_GENERATOR:
					return basicSetTableGenerator(null, msgs);
				case PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_COLUMNS:
					return basicSetJoinColumns(null, msgs);
				case PamodelPackage.PANNOTATED_EATTRIBUTE__ID_BAG:
					return basicSetIdBag(null, msgs);
				case PamodelPackage.PANNOTATED_EATTRIBUTE__INDEXED:
					return basicSetIndexed(null, msgs);
				case PamodelPackage.PANNOTATED_EATTRIBUTE__UNIQUE:
					return basicSetUnique(null, msgs);
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
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case PamodelPackage.PANNOTATED_EATTRIBUTE__PA_ECLASS:
					return eContainer.eInverseRemove(this, PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES, PAnnotatedEClass.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ELEMENT:
				if (resolve) return getAnnotatedElement();
				return basicGetAnnotatedElement();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TRANSIENT:
				return getTransient();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__PA_ECLASS:
				return getPaEClass();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ESTRUCTURAL_FEATURE:
				if (resolve) return getAnnotatedEStructuralFeature();
				return basicGetAnnotatedEStructuralFeature();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ATTRIBUTE_OVERRIDES:
				return getAttributeOverrides();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__COLUMNS:
				return getColumns();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_TABLE:
				return getJoinTable();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ONE_TO_MANY:
				return getOneToMany();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__SEQUENCE_GENERATOR:
				return getSequenceGenerator();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TABLE_GENERATOR:
				return getTableGenerator();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_COLUMNS:
				return getJoinColumns();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ID_BAG:
				return getIdBag();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__INDEXED:
				return getIndexed();
			case PamodelPackage.PANNOTATED_EATTRIBUTE__UNIQUE:
				return getUnique();
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
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ELEMENT:
				setAnnotatedElement((ENamedElement)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TRANSIENT:
				setTransient((Transient)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__PA_ECLASS:
				setPaEClass((PAnnotatedEClass)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ESTRUCTURAL_FEATURE:
				setAnnotatedEStructuralFeature((EStructuralFeature)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ATTRIBUTE_OVERRIDES:
				setAttributeOverrides((AttributeOverrides)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__COLUMNS:
				setColumns((Columns)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_TABLE:
				setJoinTable((JoinTable)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ONE_TO_MANY:
				setOneToMany((OneToMany)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_COLUMNS:
				setJoinColumns((JoinColumns)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ID_BAG:
				setIdBag((IdBag)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__INDEXED:
				setIndexed((Indexed)newValue);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__UNIQUE:
				setUnique((Unique)newValue);
				return;
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
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TYPE:
				setType((Type)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ELEMENT:
				setAnnotatedElement((ENamedElement)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TRANSIENT:
				setTransient((Transient)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__PA_ECLASS:
				setPaEClass((PAnnotatedEClass)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ESTRUCTURAL_FEATURE:
				setAnnotatedEStructuralFeature((EStructuralFeature)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ATTRIBUTE_OVERRIDES:
				setAttributeOverrides((AttributeOverrides)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__COLUMNS:
				setColumns((Columns)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_TABLE:
				setJoinTable((JoinTable)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ONE_TO_MANY:
				setOneToMany((OneToMany)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_COLUMNS:
				setJoinColumns((JoinColumns)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ID_BAG:
				setIdBag((IdBag)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__INDEXED:
				setIndexed((Indexed)null);
				return;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__UNIQUE:
				setUnique((Unique)null);
				return;
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
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TYPE:
				setType((Type)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ELEMENT:
				return basicGetAnnotatedElement() != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TRANSIENT:
				return transient_ != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__PA_ECLASS:
				return getPaEClass() != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ANNOTATED_ESTRUCTURAL_FEATURE:
				return basicGetAnnotatedEStructuralFeature() != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ATTRIBUTE_OVERRIDES:
				return attributeOverrides != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__COLUMNS:
				return columns != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_TABLE:
				return joinTable != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ONE_TO_MANY:
				return oneToMany != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__SEQUENCE_GENERATOR:
				return sequenceGenerator != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TABLE_GENERATOR:
				return tableGenerator != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__JOIN_COLUMNS:
				return joinColumns != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__ID_BAG:
				return idBag != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__INDEXED:
				return indexed != null;
			case PamodelPackage.PANNOTATED_EATTRIBUTE__UNIQUE:
				return unique != null;
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
			case PamodelPackage.PANNOTATED_EATTRIBUTE__TYPE:
				return type != null;
		}
		return eDynamicIsSet(eFeature);
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
