/**
 * <copyright>
 * </copyright>
 *
 * $Id: TemporalImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package temporal.impl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import temporal.Temporal;
import temporal.TemporalPackage;
import temporal.VersionHolder;

import temporal.mod.TemporalUtil;
import temporal.mod.TemporalBaseEObjectImpl;
import temporal.mod.TemporalDateProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link temporal.impl.TemporalImpl#getDate <em>Date</em>}</li>
 *   <li>{@link temporal.impl.TemporalImpl#getTouchedAttributes <em>Touched Attributes</em>}</li>
 *   <li>{@link temporal.impl.TemporalImpl#isContinuity <em>Continuity</em>}</li>
 *   <li>{@link temporal.impl.TemporalImpl#getVersionHolder <em>Version Holder</em>}</li>
 *   <li>{@link temporal.impl.TemporalImpl#getVersionHolderContainment <em>Version Holder Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemporalImpl extends TemporalBaseEObjectImpl implements Temporal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemporalPackage.Literals.TEMPORAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return (Date)eGet(TemporalPackage.Literals.TEMPORAL__DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		eSet(TemporalPackage.Literals.TEMPORAL__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getTouchedAttributes() {
		return (byte[])eGet(TemporalPackage.Literals.TEMPORAL__TOUCHED_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTouchedAttributes(byte[] newTouchedAttributes) {
		eSet(TemporalPackage.Literals.TEMPORAL__TOUCHED_ATTRIBUTES, newTouchedAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContinuity() {
		return ((Boolean)eGet(TemporalPackage.Literals.TEMPORAL__CONTINUITY, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuity(boolean newContinuity) {
		eSet(TemporalPackage.Literals.TEMPORAL__CONTINUITY, new Boolean(newContinuity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionHolder getVersionHolder() {
		return (VersionHolder)eGet(TemporalPackage.Literals.TEMPORAL__VERSION_HOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionHolder(VersionHolder newVersionHolder) {
		eSet(TemporalPackage.Literals.TEMPORAL__VERSION_HOLDER, newVersionHolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionHolder getVersionHolderContainment() {
		return (VersionHolder)eGet(TemporalPackage.Literals.TEMPORAL__VERSION_HOLDER_CONTAINMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionHolderContainment(VersionHolder newVersionHolderContainment) {
		eSet(TemporalPackage.Literals.TEMPORAL__VERSION_HOLDER_CONTAINMENT, newVersionHolderContainment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temporal versionAt(Date date) {
		return TemporalUtil.versionAt(this, date);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temporal createVersion() {
		return TemporalUtil.createVersion(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDateWithinVersion(Date date) {
		return TemporalUtil.isDateWithinVersion(this, date);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temporal continuity() {
		return TemporalUtil.continuity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temporal currentVersion() {
		return TemporalUtil.currentVersion(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList versions() {
		return TemporalUtil.versions(this);
	}

} //TemporalImpl
