/**
 * <copyright>
 * </copyright>
 *
 * $Id: VideoCassetteImpl.java,v 1.1 2006/08/14 05:08:59 mtaal Exp $
 */
package extlibrary.impl;

import extlibrary.ExtlibraryPackage;
import extlibrary.Person;
import extlibrary.VideoCassette;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Video Cassette</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link extlibrary.impl.VideoCassetteImpl#getCast <em>Cast</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class VideoCassetteImpl extends AudioVisualItemImpl implements VideoCassette {
	/**
	 * The cached value of the '{@link #getCast() <em>Cast</em>}' reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getCast()
	 * @generated
	 * @ordered
	 */
	protected EList cast = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VideoCassetteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExtlibraryPackage.Literals.VIDEO_CASSETTE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getCast() {
		if (cast == null) {
			cast = new EObjectResolvingEList(Person.class, this, ExtlibraryPackage.VIDEO_CASSETTE__CAST);
		}
		return cast;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtlibraryPackage.VIDEO_CASSETTE__CAST:
			return getCast();
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
		case ExtlibraryPackage.VIDEO_CASSETTE__CAST:
			getCast().clear();
			getCast().addAll((Collection) newValue);
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
		case ExtlibraryPackage.VIDEO_CASSETTE__CAST:
			getCast().clear();
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
		case ExtlibraryPackage.VIDEO_CASSETTE__CAST:
			return cast != null && !cast.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // VideoCassetteImpl