/**
 * <copyright>
 * </copyright>
 *
 * $Id: TimestampImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.SourceType;
import org.eclipse.emf.teneo.db2m.hbm30.Timestamp;
import org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timestamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TimestampImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TimestampImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TimestampImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TimestampImpl#getGenerated <em>Generated</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TimestampImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TimestampImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TimestampImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.TimestampImpl#getUnsavedValue <em>Unsaved Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimestampImpl extends EObjectImpl implements Timestamp {
	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected EList<Meta> meta;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected String access = ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected String column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final GeneratedNeverAlways GENERATED_EDEFAULT = GeneratedNeverAlways.NEVER;

	/**
	 * The cached value of the '{@link #getGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerated()
	 * @generated
	 * @ordered
	 */
	protected GeneratedNeverAlways generated = GENERATED_EDEFAULT;

	/**
	 * This is true if the Generated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean generatedESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final SourceType SOURCE_EDEFAULT = SourceType.VM;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SourceType source = SOURCE_EDEFAULT;

	/**
	 * This is true if the Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceESet;

	/**
	 * The default value of the '{@link #getUnsavedValue() <em>Unsaved Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsavedValue()
	 * @generated
	 * @ordered
	 */
	protected static final UnsavedValueType1 UNSAVED_VALUE_EDEFAULT = UnsavedValueType1.NULL;

	/**
	 * The cached value of the '{@link #getUnsavedValue() <em>Unsaved Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsavedValue()
	 * @generated
	 * @ordered
	 */
	protected UnsavedValueType1 unsavedValue = UNSAVED_VALUE_EDEFAULT;

	/**
	 * This is true if the Unsaved Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unsavedValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimestampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getTimestamp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.TIMESTAMP__META);
		}
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(String newAccess) {
		String oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.TIMESTAMP__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(String newColumn) {
		String oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.TIMESTAMP__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedNeverAlways getGenerated() {
		return generated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerated(GeneratedNeverAlways newGenerated) {
		GeneratedNeverAlways oldGenerated = generated;
		generated = newGenerated == null ? GENERATED_EDEFAULT : newGenerated;
		boolean oldGeneratedESet = generatedESet;
		generatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.TIMESTAMP__GENERATED, oldGenerated, generated, !oldGeneratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGenerated() {
		GeneratedNeverAlways oldGenerated = generated;
		boolean oldGeneratedESet = generatedESet;
		generated = GENERATED_EDEFAULT;
		generatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.TIMESTAMP__GENERATED, oldGenerated, GENERATED_EDEFAULT, oldGeneratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenerated() {
		return generatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.TIMESTAMP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.TIMESTAMP__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SourceType newSource) {
		SourceType oldSource = source;
		source = newSource == null ? SOURCE_EDEFAULT : newSource;
		boolean oldSourceESet = sourceESet;
		sourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.TIMESTAMP__SOURCE, oldSource, source, !oldSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSource() {
		SourceType oldSource = source;
		boolean oldSourceESet = sourceESet;
		source = SOURCE_EDEFAULT;
		sourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.TIMESTAMP__SOURCE, oldSource, SOURCE_EDEFAULT, oldSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
		return sourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsavedValueType1 getUnsavedValue() {
		return unsavedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsavedValue(UnsavedValueType1 newUnsavedValue) {
		UnsavedValueType1 oldUnsavedValue = unsavedValue;
		unsavedValue = newUnsavedValue == null ? UNSAVED_VALUE_EDEFAULT : newUnsavedValue;
		boolean oldUnsavedValueESet = unsavedValueESet;
		unsavedValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.TIMESTAMP__UNSAVED_VALUE, oldUnsavedValue, unsavedValue, !oldUnsavedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnsavedValue() {
		UnsavedValueType1 oldUnsavedValue = unsavedValue;
		boolean oldUnsavedValueESet = unsavedValueESet;
		unsavedValue = UNSAVED_VALUE_EDEFAULT;
		unsavedValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.TIMESTAMP__UNSAVED_VALUE, oldUnsavedValue, UNSAVED_VALUE_EDEFAULT, oldUnsavedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnsavedValue() {
		return unsavedValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.TIMESTAMP__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hbm30Package.TIMESTAMP__META:
				return getMeta();
			case Hbm30Package.TIMESTAMP__ACCESS:
				return getAccess();
			case Hbm30Package.TIMESTAMP__COLUMN:
				return getColumn();
			case Hbm30Package.TIMESTAMP__GENERATED:
				return getGenerated();
			case Hbm30Package.TIMESTAMP__NAME:
				return getName();
			case Hbm30Package.TIMESTAMP__NODE:
				return getNode();
			case Hbm30Package.TIMESTAMP__SOURCE:
				return getSource();
			case Hbm30Package.TIMESTAMP__UNSAVED_VALUE:
				return getUnsavedValue();
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
			case Hbm30Package.TIMESTAMP__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.TIMESTAMP__ACCESS:
				setAccess((String)newValue);
				return;
			case Hbm30Package.TIMESTAMP__COLUMN:
				setColumn((String)newValue);
				return;
			case Hbm30Package.TIMESTAMP__GENERATED:
				setGenerated((GeneratedNeverAlways)newValue);
				return;
			case Hbm30Package.TIMESTAMP__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.TIMESTAMP__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.TIMESTAMP__SOURCE:
				setSource((SourceType)newValue);
				return;
			case Hbm30Package.TIMESTAMP__UNSAVED_VALUE:
				setUnsavedValue((UnsavedValueType1)newValue);
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
			case Hbm30Package.TIMESTAMP__META:
				getMeta().clear();
				return;
			case Hbm30Package.TIMESTAMP__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case Hbm30Package.TIMESTAMP__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case Hbm30Package.TIMESTAMP__GENERATED:
				unsetGenerated();
				return;
			case Hbm30Package.TIMESTAMP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.TIMESTAMP__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.TIMESTAMP__SOURCE:
				unsetSource();
				return;
			case Hbm30Package.TIMESTAMP__UNSAVED_VALUE:
				unsetUnsavedValue();
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
			case Hbm30Package.TIMESTAMP__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.TIMESTAMP__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case Hbm30Package.TIMESTAMP__COLUMN:
				return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
			case Hbm30Package.TIMESTAMP__GENERATED:
				return isSetGenerated();
			case Hbm30Package.TIMESTAMP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.TIMESTAMP__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.TIMESTAMP__SOURCE:
				return isSetSource();
			case Hbm30Package.TIMESTAMP__UNSAVED_VALUE:
				return isSetUnsavedValue();
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
		result.append(" (access: ");
		result.append(access);
		result.append(", column: ");
		result.append(column);
		result.append(", generated: ");
		if (generatedESet) result.append(generated); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", node: ");
		result.append(node);
		result.append(", source: ");
		if (sourceESet) result.append(source); else result.append("<unset>");
		result.append(", unsavedValue: ");
		if (unsavedValueESet) result.append(unsavedValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimestampImpl
