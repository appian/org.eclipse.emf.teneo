/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.maps;

import java.util.Date;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Images</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getImageFiles <em>Image Files</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getImageTypeNames <em>Image Type Names</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getImageDateDescriptions <em>Image Date Descriptions</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images#getPhotoParts <em>Photo Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage#getImages()
 * @model extendedMetaData="name='Images' kind='elementOnly'"
 * @generated
 */
public interface Images extends EObject {
	/**
	 * Returns the value of the '<em><b>Image Files</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Files</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Files</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage#getImages_ImageFiles()
	 * @model mapType="org.eclipse.emf.teneo.samples.emf.jpa2.maps.StringToStringMapEntry<org.eclipse.emf.ecore.xml.type.String, org.eclipse.emf.ecore.xml.type.String>"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@ElementCollection\n\t\t\t\t\t\t@MapKeyColumn(name=\"IMAGE_NAME\")\n\t\t\t\t\t\t@Column(name=\"IMAGE_FILENAME\")\n\t\t\t\t\t\t@CollectionTable(name=\"IMAGE_MAPPING\")\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='imageFiles'"
	 * @generated
	 */
	EMap<String, String> getImageFiles();

	/**
	 * Returns the value of the '<em><b>Image Type Names</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Type Names</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Type Names</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage#getImages_ImageTypeNames()
	 * @model mapType="org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumToStringMapEntry<org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType, org.eclipse.emf.ecore.xml.type.String>"
	 *        extendedMetaData="kind='element' name='imageTypeNames'"
	 * @generated
	 */
	EMap<EnumType, String> getImageTypeNames();

	/**
	 * Returns the value of the '<em><b>Image Date Descriptions</b></em>' map.
	 * The key is of type {@link java.util.Date},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Date Descriptions</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Date Descriptions</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage#getImages_ImageDateDescriptions()
	 * @model mapType="org.eclipse.emf.teneo.samples.emf.jpa2.maps.DateToStringMapEntry<org.eclipse.emf.teneo.samples.emf.jpa2.maps.MyDate, org.eclipse.emf.ecore.xml.type.String>"
	 *        extendedMetaData="kind='element' name='imageDateDescriptions'"
	 * @generated
	 */
	EMap<Date, String> getImageDateDescriptions();

	/**
	 * Returns the value of the '<em><b>Photo Parts</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoPart},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photo Parts</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo Parts</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage#getImages_PhotoParts()
	 * @model mapType="org.eclipse.emf.teneo.samples.emf.jpa2.maps.StringToPartMapEntry<org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoPart, org.eclipse.emf.ecore.xml.type.String>"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@MapKeyJoinColumn(name=\"PARTS_NAME\")\n\t\t\t\t\t\t@CollectionTable(name=\"PHOTOPARTS_MAP\")\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='photoParts'"
	 * @generated
	 */
	EMap<PhotoPart, String> getPhotoParts();

} // Images
