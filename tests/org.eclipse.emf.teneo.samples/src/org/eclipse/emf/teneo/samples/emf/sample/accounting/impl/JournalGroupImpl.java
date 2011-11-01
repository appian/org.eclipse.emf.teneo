/**
 * <copyright>
 * </copyright>
 *
 * $Id: JournalGroupImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
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
	protected EList<JournalGroup> journalGroups = null;

	/**
	 * The cached value of the '{@link #getJournalStatements() <em>Journal Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<JournalStatement> journalStatements = null;

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
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.JOURNAL_GROUP;
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
	public EList<JournalGroup> getJournalGroups() {
		if (journalGroups == null) {
			journalGroups = new EObjectContainmentEList<JournalGroup>(JournalGroup.class, this, AccountingPackage.JOURNAL_GROUP__JOURNAL_GROUPS);
		}
		return journalGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JournalStatement> getJournalStatements() {
		if (journalStatements == null) {
			journalStatements = new EObjectContainmentEList<JournalStatement>(JournalStatement.class, this, AccountingPackage.JOURNAL_GROUP__JOURNAL_STATEMENTS);
		}
		return journalStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_GROUPS:
				return ((InternalEList<?>)getJournalGroups()).basicRemove(otherEnd, msgs);
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_STATEMENTS:
				return ((InternalEList<?>)getJournalStatements()).basicRemove(otherEnd, msgs);
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
			case AccountingPackage.JOURNAL_GROUP__NAME:
				return getName();
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_GROUPS:
				return getJournalGroups();
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_STATEMENTS:
				return getJournalStatements();
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
			case AccountingPackage.JOURNAL_GROUP__NAME:
				setName((String)newValue);
				return;
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_GROUPS:
				getJournalGroups().clear();
				getJournalGroups().addAll((Collection<? extends JournalGroup>)newValue);
				return;
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_STATEMENTS:
				getJournalStatements().clear();
				getJournalStatements().addAll((Collection<? extends JournalStatement>)newValue);
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
			case AccountingPackage.JOURNAL_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_GROUPS:
				return journalGroups != null && !journalGroups.isEmpty();
			case AccountingPackage.JOURNAL_GROUP__JOURNAL_STATEMENTS:
				return journalStatements != null && !journalStatements.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JournalGroupImpl
