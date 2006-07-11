/**
 * <copyright>
 * </copyright>
 *
 * $Id: JournalGroupImpl.java,v 1.1 2006/07/11 16:56:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journal Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalGroupImpl#getJournalGroups <em>Journal Groups</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.impl.JournalGroupImpl#getJournalStatements <em>Journal Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JournalGroupImpl extends EObjectImpl implements JournalGroup {
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
	 * The cached value of the '{@link #getJournalGroups() <em>Journal Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalGroups()
	 * @generated
	 * @ordered
	 */
	protected EList journalGroups = null;

	/**
	 * The cached value of the '{@link #getJournalStatements() <em>Journal Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalStatements()
	 * @generated
	 * @ordered
	 */
	protected EList journalStatements = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JournalGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AccountingPackage.eINSTANCE.getJournalGroup();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.JOURNAL_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getJournalGroups() {
		if (journalGroups == null) {
			journalGroups = new EObjectContainmentEList(JournalGroup.class, this, AccountingPackage.JOURNAL_GROUP__JOURNAL_GROUPS);
		}
		return journalGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getJournalStatements() {
		if (journalStatements == null) {
			journalStatements = new EObjectContainmentEList(JournalStatement.class, this, AccountingPackage.JOURNAL_GROUP__JOURNAL_STATEMENTS);
		}
		return journalStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case AccountingPackage.JOURNAL_GROUP__JOURNAL_GROUPS:
					return ((InternalEList)getJournalGroups()).basicRemove(otherEnd, msgs);
				case AccountingPackage.JOURNAL_GROUP__JOURNAL_STATEMENTS:
					return ((InternalEList)getJournalStatements()).basicRemove(otherEnd, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case AccountingPackage.JOURNAL_GROUP__NAME:
				return getName();
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_GROUPS:
				return getJournalGroups();
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_STATEMENTS:
				return getJournalStatements();
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
			case AccountingPackage.JOURNAL_GROUP__NAME:
				setName((String)newValue);
				return;
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_GROUPS:
				getJournalGroups().clear();
				getJournalGroups().addAll((Collection)newValue);
				return;
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_STATEMENTS:
				getJournalStatements().clear();
				getJournalStatements().addAll((Collection)newValue);
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
			case AccountingPackage.JOURNAL_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_GROUPS:
				getJournalGroups().clear();
				return;
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_STATEMENTS:
				getJournalStatements().clear();
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
			case AccountingPackage.JOURNAL_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_GROUPS:
				return journalGroups != null && !journalGroups.isEmpty();
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_STATEMENTS:
				return journalStatements != null && !journalStatements.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JournalGroupImpl
