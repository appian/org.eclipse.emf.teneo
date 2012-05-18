/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Images</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.ImagesImpl#getImageFiles <em>Image Files</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.ImagesImpl#getImageTypeNames <em>Image Type Names</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.ImagesImpl#getImageDateDescriptions <em>Image Date Descriptions</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl.ImagesImpl#getPhotoParts <em>Photo Parts</em>}</li>
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
	 * The cached value of the '{@link #getImageTypeNames() <em>Image Type Names</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageTypeNames()
	 * @generated
	 * @ordered
	 */
	protected EMap<EnumType, String> imageTypeNames;
	/**
	 * The cached value of the '{@link #getImageDateDescriptions() <em>Image Date Descriptions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageDateDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EMap<Date, String> imageDateDescriptions;

	/**
	 * The cached value of the '{@link #getPhotoParts() <em>Photo Parts</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotoParts()
	 * @generated
	 * @ordered
	 */
	protected EMap<PhotoPart, String> photoParts;

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
	public EMap<EnumType, String> getImageTypeNames() {
		if (imageTypeNames == null) {
			imageTypeNames = new EcoreEMap<EnumType,String>(MapsPackage.Literals.ENUM_TO_STRING_MAP_ENTRY, EnumToStringMapEntryImpl.class, this, MapsPackage.IMAGES__IMAGE_TYPE_NAMES);
		}
		return imageTypeNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Date, String> getImageDateDescriptions() {
		if (imageDateDescriptions == null) {
			imageDateDescriptions = new EcoreEMap<Date,String>(MapsPackage.Literals.DATE_TO_STRING_MAP_ENTRY, DateToStringMapEntryImpl.class, this, MapsPackage.IMAGES__IMAGE_DATE_DESCRIPTIONS);
		}
		return imageDateDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<PhotoPart, String> getPhotoParts() {
		if (photoParts == null) {
			photoParts = new EcoreEMap<PhotoPart,String>(MapsPackage.Literals.STRING_TO_PART_MAP_ENTRY, StringToPartMapEntryImpl.class, this, MapsPackage.IMAGES__PHOTO_PARTS);
		}
		return photoParts;
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
			case MapsPackage.IMAGES__IMAGE_TYPE_NAMES:
				return ((InternalEList<?>)getImageTypeNames()).basicRemove(otherEnd, msgs);
			case MapsPackage.IMAGES__IMAGE_DATE_DESCRIPTIONS:
				return ((InternalEList<?>)getImageDateDescriptions()).basicRemove(otherEnd, msgs);
			case MapsPackage.IMAGES__PHOTO_PARTS:
				return ((InternalEList<?>)getPhotoParts()).basicRemove(otherEnd, msgs);
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
			case MapsPackage.IMAGES__IMAGE_TYPE_NAMES:
				if (coreType) return getImageTypeNames();
				else return getImageTypeNames().map();
			case MapsPackage.IMAGES__IMAGE_DATE_DESCRIPTIONS:
				if (coreType) return getImageDateDescriptions();
				else return getImageDateDescriptions().map();
			case MapsPackage.IMAGES__PHOTO_PARTS:
				if (coreType) return getPhotoParts();
				else return getPhotoParts().map();
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
			case MapsPackage.IMAGES__IMAGE_TYPE_NAMES:
				((EStructuralFeature.Setting)getImageTypeNames()).set(newValue);
				return;
			case MapsPackage.IMAGES__IMAGE_DATE_DESCRIPTIONS:
				((EStructuralFeature.Setting)getImageDateDescriptions()).set(newValue);
				return;
			case MapsPackage.IMAGES__PHOTO_PARTS:
				((EStructuralFeature.Setting)getPhotoParts()).set(newValue);
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
			case MapsPackage.IMAGES__IMAGE_TYPE_NAMES:
				getImageTypeNames().clear();
				return;
			case MapsPackage.IMAGES__IMAGE_DATE_DESCRIPTIONS:
				getImageDateDescriptions().clear();
				return;
			case MapsPackage.IMAGES__PHOTO_PARTS:
				getPhotoParts().clear();
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
			case MapsPackage.IMAGES__IMAGE_TYPE_NAMES:
				return imageTypeNames != null && !imageTypeNames.isEmpty();
			case MapsPackage.IMAGES__IMAGE_DATE_DESCRIPTIONS:
				return imageDateDescriptions != null && !imageDateDescriptions.isEmpty();
			case MapsPackage.IMAGES__PHOTO_PARTS:
				return photoParts != null && !photoParts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagesImpl
