/**
 * <copyright>
 * </copyright>
 *
 * $Id: SequenceGeneratorImpl.java,v 1.10 2009/06/11 04:59:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Sequence Generator</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.SequenceGeneratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.SequenceGeneratorImpl#getSequenceName <em>Sequence Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.SequenceGeneratorImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.SequenceGeneratorImpl#getAllocationSize <em>Allocation Size</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.SequenceGeneratorImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.SequenceGeneratorImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceGeneratorImpl extends PAnnotationImpl implements SequenceGenerator {
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
	 * The default value of the '{@link #getSequenceName() <em>Sequence Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSequenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceName() <em>Sequence Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSequenceName()
	 * @generated
	 * @ordered
	 */
	protected String sequenceName = SEQUENCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_VALUE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected int initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * This is true if the Initial Value attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialValueESet;

	/**
	 * The default value of the '{@link #getAllocationSize() <em>Allocation Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAllocationSize()
	 * @generated
	 * @ordered
	 */
	protected static final int ALLOCATION_SIZE_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getAllocationSize() <em>Allocation Size</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAllocationSize()
	 * @generated
	 * @ordered
	 */
	protected int allocationSize = ALLOCATION_SIZE_EDEFAULT;

	/**
	 * This is true if the Allocation Size attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allocationSizeESet;

	/**
	 * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected String catalog = CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected String schema = SCHEMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PannotationPackage.Literals.SEQUENCE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.SEQUENCE_GENERATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(int newInitialValue) {
		int oldInitialValue = initialValue;
		initialValue = newInitialValue;
		boolean oldInitialValueESet = initialValueESet;
		initialValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.SEQUENCE_GENERATOR__INITIAL_VALUE, oldInitialValue, initialValue, !oldInitialValueESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitialValue() {
		int oldInitialValue = initialValue;
		boolean oldInitialValueESet = initialValueESet;
		initialValue = INITIAL_VALUE_EDEFAULT;
		initialValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PannotationPackage.SEQUENCE_GENERATOR__INITIAL_VALUE, oldInitialValue, INITIAL_VALUE_EDEFAULT, oldInitialValueESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitialValue() {
		return initialValueESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSequenceName() {
		return sequenceName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceName(String newSequenceName) {
		String oldSequenceName = sequenceName;
		sequenceName = newSequenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.SEQUENCE_GENERATOR__SEQUENCE_NAME, oldSequenceName, sequenceName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getAllocationSize() {
		return allocationSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationSize(int newAllocationSize) {
		int oldAllocationSize = allocationSize;
		allocationSize = newAllocationSize;
		boolean oldAllocationSizeESet = allocationSizeESet;
		allocationSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.SEQUENCE_GENERATOR__ALLOCATION_SIZE, oldAllocationSize, allocationSize, !oldAllocationSizeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllocationSize() {
		int oldAllocationSize = allocationSize;
		boolean oldAllocationSizeESet = allocationSizeESet;
		allocationSize = ALLOCATION_SIZE_EDEFAULT;
		allocationSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PannotationPackage.SEQUENCE_GENERATOR__ALLOCATION_SIZE, oldAllocationSize, ALLOCATION_SIZE_EDEFAULT, oldAllocationSizeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllocationSize() {
		return allocationSizeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(String newCatalog) {
		String oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.SEQUENCE_GENERATOR__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(String newSchema) {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.SEQUENCE_GENERATOR__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PannotationPackage.SEQUENCE_GENERATOR__NAME:
				return getName();
			case PannotationPackage.SEQUENCE_GENERATOR__SEQUENCE_NAME:
				return getSequenceName();
			case PannotationPackage.SEQUENCE_GENERATOR__INITIAL_VALUE:
				return getInitialValue();
			case PannotationPackage.SEQUENCE_GENERATOR__ALLOCATION_SIZE:
				return getAllocationSize();
			case PannotationPackage.SEQUENCE_GENERATOR__CATALOG:
				return getCatalog();
			case PannotationPackage.SEQUENCE_GENERATOR__SCHEMA:
				return getSchema();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PannotationPackage.SEQUENCE_GENERATOR__NAME:
				setName((String)newValue);
				return;
			case PannotationPackage.SEQUENCE_GENERATOR__SEQUENCE_NAME:
				setSequenceName((String)newValue);
				return;
			case PannotationPackage.SEQUENCE_GENERATOR__INITIAL_VALUE:
				setInitialValue((Integer)newValue);
				return;
			case PannotationPackage.SEQUENCE_GENERATOR__ALLOCATION_SIZE:
				setAllocationSize((Integer)newValue);
				return;
			case PannotationPackage.SEQUENCE_GENERATOR__CATALOG:
				setCatalog((String)newValue);
				return;
			case PannotationPackage.SEQUENCE_GENERATOR__SCHEMA:
				setSchema((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PannotationPackage.SEQUENCE_GENERATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PannotationPackage.SEQUENCE_GENERATOR__SEQUENCE_NAME:
				setSequenceName(SEQUENCE_NAME_EDEFAULT);
				return;
			case PannotationPackage.SEQUENCE_GENERATOR__INITIAL_VALUE:
				unsetInitialValue();
				return;
			case PannotationPackage.SEQUENCE_GENERATOR__ALLOCATION_SIZE:
				unsetAllocationSize();
				return;
			case PannotationPackage.SEQUENCE_GENERATOR__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case PannotationPackage.SEQUENCE_GENERATOR__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PannotationPackage.SEQUENCE_GENERATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PannotationPackage.SEQUENCE_GENERATOR__SEQUENCE_NAME:
				return SEQUENCE_NAME_EDEFAULT == null ? sequenceName != null : !SEQUENCE_NAME_EDEFAULT.equals(sequenceName);
			case PannotationPackage.SEQUENCE_GENERATOR__INITIAL_VALUE:
				return isSetInitialValue();
			case PannotationPackage.SEQUENCE_GENERATOR__ALLOCATION_SIZE:
				return isSetAllocationSize();
			case PannotationPackage.SEQUENCE_GENERATOR__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case PannotationPackage.SEQUENCE_GENERATOR__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", sequenceName: ");
		result.append(sequenceName);
		result.append(", initialValue: ");
		if (initialValueESet) result.append(initialValue); else result.append("<unset>");
		result.append(", allocationSize: ");
		if (allocationSizeESet) result.append(allocationSize); else result.append("<unset>");
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", schema: ");
		result.append(schema);
		result.append(')');
		return result.toString();
	}

} // SequenceGeneratorImpl
