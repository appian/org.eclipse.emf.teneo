/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEStructuralFeature.java,v 1.17 2010/07/19 11:48:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.CollectionTable;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.ElementCollection;
import org.eclipse.emf.teneo.annotations.pannotation.ForeignKey;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.ListIndexColumn;
import org.eclipse.emf.teneo.annotations.pannotation.MapsId;
import org.eclipse.emf.teneo.annotations.pannotation.OrderColumn;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>PAnnotated EStructural Feature</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getPaEClass <em>Pa EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getModelEStructuralFeature <em>Model EStructural Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getListIndexColumn <em>List Index Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getCollectionTable <em>Collection Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getElementCollection <em>Element Collection</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getMapsId <em>Maps Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getOrderColumn <em>Order Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EClassCommutes TransientNotAnnotated'"
 * @generated
 */
public interface PAnnotatedEStructuralFeature extends PAnnotatedETypedElement {
	/**
	 * Returns the value of the '<em><b>Pa EClass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPaEStructuralFeatures <em>Pa EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pa EClass</em>' container reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pa EClass</em>' container reference.
	 * @see #setPaEClass(PAnnotatedEClass)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_PaEClass()
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPaEStructuralFeatures
	 * @model opposite="paEStructuralFeatures" transient="false"
	 *        annotation="teneo/internal/PersistenceMapping ignore='true'"
	 * @generated
	 */
	PAnnotatedEClass getPaEClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getPaEClass <em>Pa EClass</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pa EClass</em>' container reference.
	 * @see #getPaEClass()
	 * @generated
	 */
	void setPaEClass(PAnnotatedEClass value);

	/**
	 * Returns the value of the '<em><b>Model EStructural Feature</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated EStructural Feature</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Model EStructural Feature</em>' reference.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_ModelEStructuralFeature()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="teneo/internal/PersistenceMapping ignore='true'"
	 * @generated
	 */
	EStructuralFeature getModelEStructuralFeature();

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Foreign Key</em>' containment reference.
	 * @see #setForeignKey(ForeignKey)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_ForeignKey()
	 * @model containment="true"
	 * @generated
	 */
	ForeignKey getForeignKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getForeignKey <em>Foreign Key</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' containment reference.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(ForeignKey value);

	/**
	 * Returns the value of the '<em><b>List Index Column</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Index Column</em>' containment reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>List Index Column</em>' containment reference.
	 * @see #setListIndexColumn(ListIndexColumn)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_ListIndexColumn()
	 * @model containment="true" ordered="false" annotation=
	 *        "elver.jpa annotationName='JoinColumns' annotationClass='javax.persistence.JoinColumns'"
	 * @generated
	 */
	ListIndexColumn getListIndexColumn();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getListIndexColumn
	 * <em>List Index Column</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *          the new value of the '<em>List Index Column</em>' containment reference.
	 * @see #getListIndexColumn()
	 * @generated
	 */
	void setListIndexColumn(ListIndexColumn value);

	/**
	 * Returns the value of the '<em><b>Collection Table</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Table</em>' containment reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Collection Table</em>' containment reference.
	 * @see #setCollectionTable(CollectionTable)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_CollectionTable()
	 * @model containment="true"
	 * @generated
	 */
	CollectionTable getCollectionTable();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getCollectionTable
	 * <em>Collection Table</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *          the new value of the '<em>Collection Table</em>' containment reference.
	 * @see #getCollectionTable()
	 * @generated
	 */
	void setCollectionTable(CollectionTable value);

	/**
	 * Returns the value of the '<em><b>Element Collection</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Collection</em>' containment reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Element Collection</em>' containment reference.
	 * @see #setElementCollection(ElementCollection)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_ElementCollection()
	 * @model containment="true"
	 * @generated
	 */
	ElementCollection getElementCollection();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getElementCollection
	 * <em>Element Collection</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *          the new value of the '<em>Element Collection</em>' containment reference.
	 * @see #getElementCollection()
	 * @generated
	 */
	void setElementCollection(ElementCollection value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(Id)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_Id()
	 * @model containment="true"
	 * @generated
	 */
	Id getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Id value);

	/**
	 * Returns the value of the '<em><b>Maps Id</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Maps Id</em>' containment reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps Id</em>' containment reference.
	 * @see #setMapsId(MapsId)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_MapsId()
	 * @model containment="true"
	 * @generated
	 */
	MapsId getMapsId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getMapsId <em>Maps Id</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps Id</em>' containment reference.
	 * @see #getMapsId()
	 * @generated
	 */
	void setMapsId(MapsId value);

	/**
	 * Returns the value of the '<em><b>Order Column</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Column</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Order Column</em>' containment reference.
	 * @see #setOrderColumn(OrderColumn)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_OrderColumn()
	 * @model containment="true"
	 * @generated
	 */
	OrderColumn getOrderColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getOrderColumn <em>Order Column</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Column</em>' containment reference.
	 * @see #getOrderColumn()
	 * @generated
	 */
	void setOrderColumn(OrderColumn value);

	/**
	 * Convenience function for obtaining the first available Column annotation.
	 */
	public Column getColumn();

} // PAnnotatedEStructuralFeature
