/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Collection;

import lobj.Category;
import lobj.Course;
import lobj.LobjPackage;
import lobj.TitleMeta;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Category</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link lobj.impl.CategoryImpl#getTitleMeta <em>Title Meta</em>}</li>
 * <li>{@link lobj.impl.CategoryImpl#getCourse <em>Course</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CategoryImpl extends LearningObjectImpl implements Category {
	/**
	 * The cached value of the '{@link #getTitleMeta() <em>Title Meta</em>}' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTitleMeta()
	 * @generated
	 * @ordered
	 */
	protected EList titleMeta;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList course;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getTitleMeta() {
		if (titleMeta == null) {
			titleMeta = new EObjectContainmentEList(TitleMeta.class, this,
					LobjPackage.CATEGORY__TITLE_META);
		}
		return titleMeta;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getCourse() {
		if (course == null) {
			course = new EObjectContainmentEList(Course.class, this, LobjPackage.CATEGORY__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case LobjPackage.CATEGORY__TITLE_META:
			return ((InternalEList) getTitleMeta()).basicRemove(otherEnd, msgs);
		case LobjPackage.CATEGORY__COURSE:
			return ((InternalEList) getCourse()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LobjPackage.CATEGORY__TITLE_META:
			return getTitleMeta();
		case LobjPackage.CATEGORY__COURSE:
			return getCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LobjPackage.CATEGORY__TITLE_META:
			getTitleMeta().clear();
			getTitleMeta().addAll((Collection) newValue);
			return;
		case LobjPackage.CATEGORY__COURSE:
			getCourse().clear();
			getCourse().addAll((Collection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case LobjPackage.CATEGORY__TITLE_META:
			getTitleMeta().clear();
			return;
		case LobjPackage.CATEGORY__COURSE:
			getCourse().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LobjPackage.CATEGORY__TITLE_META:
			return titleMeta != null && !titleMeta.isEmpty();
		case LobjPackage.CATEGORY__COURSE:
			return course != null && !course.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CategoryImpl
