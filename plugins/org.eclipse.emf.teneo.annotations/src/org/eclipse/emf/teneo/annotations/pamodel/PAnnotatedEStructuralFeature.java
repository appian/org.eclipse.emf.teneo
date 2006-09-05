/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEStructuralFeature.java,v 1.8 2006/09/05 12:16:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PAnnotated EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getPaEClass <em>Pa EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getAnnotatedEStructuralFeature <em>Annotated EStructural Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getAttributeOverrides <em>Attribute Overrides</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getJoinColumns <em>Join Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EClassCommutes TransientNotAnnotated'"
 * @generated
 */
public interface PAnnotatedEStructuralFeature extends PAnnotatedEModelElement {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

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
	 * @model opposite="paEStructuralFeatures"
	 *        annotation="http://annotation.elver.org/internal/PersistenceMapping ignore='true'"
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
	 *        annotation="http://annotation.elver.org/internal/PersistenceMapping ignore='true'"
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
	 * Returns the value of the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Attribute Overrides</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Overrides</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_AttributeOverrides()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride" containment="true"
	 * @generated
	 */
	EList getAttributeOverrides();

	/**
	 * Returns the value of the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Table</em>' containment reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Table</em>' containment reference.
	 * @see #setJoinTable(JoinTable)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_JoinTable()
	 * @model containment="true"
	 * @generated
	 */
	JoinTable getJoinTable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getJoinTable <em>Join Table</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Table</em>' containment reference.
	 * @see #getJoinTable()
	 * @generated
	 */
	void setJoinTable(JoinTable value);

	/**
	 * Returns the value of the '<em><b>One To Many</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One To Many</em>' containment reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One To Many</em>' containment reference.
	 * @see #setOneToMany(OneToMany)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_OneToMany()
	 * @model containment="true"
	 * @generated
	 */
	OneToMany getOneToMany();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getOneToMany <em>One To Many</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>One To Many</em>' containment reference.
	 * @see #getOneToMany()
	 * @generated
	 */
	void setOneToMany(OneToMany value);

	/**
	 * Returns the value of the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Generator</em>' containment reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Generator</em>' containment reference.
	 * @see #setSequenceGenerator(SequenceGenerator)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_SequenceGenerator()
	 * @model containment="true"
	 * @generated
	 */
	SequenceGenerator getSequenceGenerator();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getSequenceGenerator <em>Sequence Generator</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Generator</em>' containment reference.
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	void setSequenceGenerator(SequenceGenerator value);

	/**
	 * Returns the value of the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Generator</em>' containment reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Generator</em>' containment reference.
	 * @see #setTableGenerator(TableGenerator)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_TableGenerator()
	 * @model containment="true"
	 * @generated
	 */
	TableGenerator getTableGenerator();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getTableGenerator <em>Table Generator</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Generator</em>' containment reference.
	 * @see #getTableGenerator()
	 * @generated
	 */
	void setTableGenerator(TableGenerator value);

	/**
	 * Returns the value of the '<em><b>Join Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Columns</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Columns</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_JoinColumns()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.JoinColumn" containment="true"
	 * @generated
	 */
	EList getJoinColumns();

	/**
	 * Convenience function for obtaining the first available Column annotation.
	 */
	public Column getColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getColumn <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' containment reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

} // PAnnotatedEStructuralFeature
