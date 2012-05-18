/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.maps;

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

} // Images
