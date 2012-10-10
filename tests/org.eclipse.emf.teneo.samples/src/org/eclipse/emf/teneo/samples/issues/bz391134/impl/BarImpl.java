/**
 */
package org.eclipse.emf.teneo.samples.issues.bz391134.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.teneo.samples.issues.bz391134.Bar;
import org.eclipse.emf.teneo.samples.issues.bz391134.Bz391134Package;
import org.eclipse.emf.teneo.samples.issues.bz391134.Foo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz391134.impl.BarImpl#getFoo <em>Foo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BarImpl extends EObjectImpl implements Bar {
	/**
	 * The cached value of the '{@link #getFoo() <em>Foo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoo()
	 * @generated
	 * @ordered
	 */
	protected EList<Foo> foo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz391134Package.Literals.BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Foo> getFoo() {
		if (foo == null) {
			foo = new EObjectResolvingEList<Foo>(Foo.class, this, Bz391134Package.BAR__FOO);
		}
		return foo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz391134Package.BAR__FOO:
				return getFoo();
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
			case Bz391134Package.BAR__FOO:
				getFoo().clear();
				getFoo().addAll((Collection<? extends Foo>)newValue);
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
			case Bz391134Package.BAR__FOO:
				getFoo().clear();
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
			case Bz391134Package.BAR__FOO:
				return foo != null && !foo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BarImpl
