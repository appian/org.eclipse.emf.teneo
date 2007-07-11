/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEStructuralFeature.java,v 1.13 2007/07/11 17:15:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.ForeignKey;
import org.eclipse.emf.teneo.annotations.pannotation.Column;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PAnnotated EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getPaEClass <em>Pa EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getAnnotatedEStructuralFeature <em>Annotated EStructural Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getForeignKey <em>Foreign Key</em>}</li>
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
	 * If the meaning of the '<em>Pa EClass</em>' container reference isn't clear, there really should be more of a
	 * description here...
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
	 * Returns the value of the '<em><b>Annotated EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated EStructural Feature</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EStructural Feature</em>' reference.
	 * @see #setAnnotatedEStructuralFeature(EStructuralFeature)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_AnnotatedEStructuralFeature()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="teneo/internal/PersistenceMapping ignore='true'"
	 * @generated
	 */
	EStructuralFeature getAnnotatedEStructuralFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getAnnotatedEStructuralFeature <em>Annotated EStructural Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EStructural Feature</em>' reference.
	 * @see #getAnnotatedEStructuralFeature()
	 * @generated
	 */
	void setAnnotatedEStructuralFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference.
	 * @see #setForeignKey(ForeignKey)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_ForeignKey()
	 * @model containment="true"
	 * @generated
	 */
	ForeignKey getForeignKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getForeignKey <em>Foreign Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' containment reference.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(ForeignKey value);

	/**
	 * Convenience function for obtaining the first available Column annotation.
	 */
	public Column getColumn();

} // PAnnotatedEStructuralFeature
