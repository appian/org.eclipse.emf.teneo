/**
 * <copyright>
 * </copyright>
 *
 * $Id: VersionHolderImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package temporal.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import temporal.Temporal;
import temporal.TemporalPackage;
import temporal.VersionHolder;

import temporal.mod.TemporalBaseEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link temporal.impl.VersionHolderImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link temporal.impl.VersionHolderImpl#getIndexOfContinuity <em>Index Of Continuity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionHolderImpl extends TemporalBaseEObjectImpl implements VersionHolder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemporalPackage.Literals.VERSION_HOLDER;
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
	@SuppressWarnings("unchecked")
	public EList getVersions() {
		return (EList)eGet(TemporalPackage.Literals.VERSION_HOLDER__VERSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndexOfContinuity() {
		return ((Integer)eGet(TemporalPackage.Literals.VERSION_HOLDER__INDEX_OF_CONTINUITY, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexOfContinuity(int newIndexOfContinuity) {
		eSet(TemporalPackage.Literals.VERSION_HOLDER__INDEX_OF_CONTINUITY, new Integer(newIndexOfContinuity));
	}

} //VersionHolderImpl
