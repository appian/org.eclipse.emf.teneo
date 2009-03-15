/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceUnitMetadata.java,v 1.1 2009/03/15 23:45:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Unit Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         Metadata that applies to the persistence unit and not just to 
 *         the mapping file in which it is contained. 
 * 
 *         If the xml-mapping-metadata-complete element is specified then 
 *         the complete set of mapping metadata for the persistence unit 
 *         is contained in the XML mapping files for the persistence unit.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata#getXmlMappingMetadataComplete <em>Xml Mapping Metadata Complete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata#getPersistenceUnitDefaults <em>Persistence Unit Defaults</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getPersistenceUnitMetadata()
 * @model extendedMetaData="name='persistence-unit-metadata' kind='elementOnly'"
 * @generated
 */
public interface PersistenceUnitMetadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Xml Mapping Metadata Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Mapping Metadata Complete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Mapping Metadata Complete</em>' containment reference.
	 * @see #setXmlMappingMetadataComplete(EmptyType)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getPersistenceUnitMetadata_XmlMappingMetadataComplete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xml-mapping-metadata-complete' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getXmlMappingMetadataComplete();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata#getXmlMappingMetadataComplete <em>Xml Mapping Metadata Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Mapping Metadata Complete</em>' containment reference.
	 * @see #getXmlMappingMetadataComplete()
	 * @generated
	 */
	void setXmlMappingMetadataComplete(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Persistence Unit Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Unit Defaults</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Unit Defaults</em>' containment reference.
	 * @see #setPersistenceUnitDefaults(PersistenceUnitDefaults)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getPersistenceUnitMetadata_PersistenceUnitDefaults()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persistence-unit-defaults' namespace='##targetNamespace'"
	 * @generated
	 */
	PersistenceUnitDefaults getPersistenceUnitDefaults();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata#getPersistenceUnitDefaults <em>Persistence Unit Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Unit Defaults</em>' containment reference.
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	void setPersistenceUnitDefaults(PersistenceUnitDefaults value);

} // PersistenceUnitMetadata
