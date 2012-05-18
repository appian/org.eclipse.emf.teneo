/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Images</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.ImagesImpl#getImageFiles <em>Image Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImagesImpl extends EObjectImpl implements Images {
	/**
	 * The cached value of the '{@link #getImageFiles() <em>Image Files</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageFiles()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> imageFiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapsPackage.Literals.IMAGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getImageFiles() {
		if (imageFiles == null) {
			imageFiles = new EcoreEMap<String,String>(MapsPackage.Literals.STRING_TO_STRING_MAP_ENTRY, StringToStringMapEntryImpl.class, this, MapsPackage.IMAGES__IMAGE_FILES);
		}
		return imageFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MapsPackage.IMAGES__IMAGE_FILES:
				return ((InternalEList<?>)getImageFiles()).basicRemove(otherEnd, msgs);
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
			case MapsPackage.IMAGES__IMAGE_FILES:
				if (coreType) return getImageFiles();
				else return getImageFiles().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MapsPackage.IMAGES__IMAGE_FILES:
				((EStructuralFeature.Setting)getImageFiles()).set(newValue);
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
			case MapsPackage.IMAGES__IMAGE_FILES:
				getImageFiles().clear();
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
			case MapsPackage.IMAGES__IMAGE_FILES:
				return imageFiles != null && !imageFiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagesImpl
