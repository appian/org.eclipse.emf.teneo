/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEStructuralFeature.java,v 1.4 2006/07/26 12:43:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.Columns;
import org.eclipse.emf.teneo.annotations.pannotation.IdBag;
import org.eclipse.emf.teneo.annotations.pannotation.Indexed;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumns;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Unique;

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
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getJoinColumns <em>Join Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getIdBag <em>Id Bag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getIndexed <em>Indexed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getUnique <em>Unique</em>}</li>
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
	 * Returns the value of the '<em><b>Attribute Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Attribute Overrides</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Overrides</em>' containment reference.
	 * @see #setAttributeOverrides(AttributeOverrides)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_AttributeOverrides()
	 * @model containment="true"
	 * @generated
	 */
	AttributeOverrides getAttributeOverrides();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getAttributeOverrides <em>Attribute Overrides</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Overrides</em>' containment reference.
	 * @see #getAttributeOverrides()
	 * @generated
	 */
	void setAttributeOverrides(AttributeOverrides value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference.
	 * @see #setColumns(Columns)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_Columns()
	 * @model containment="true"
	 * @generated
	 */
	Columns getColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getColumns <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' containment reference.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(Columns value);

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
	 * Returns the value of the '<em><b>Join Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Columns</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Columns</em>' containment reference.
	 * @see #setJoinColumns(JoinColumns)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_JoinColumns()
	 * @model containment="true"
	 * @generated
	 */
	JoinColumns getJoinColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getJoinColumns <em>Join Columns</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Columns</em>' containment reference.
	 * @see #getJoinColumns()
	 * @generated
	 */
	void setJoinColumns(JoinColumns value);

	/**
	 * Returns the value of the '<em><b>Id Bag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Bag</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Bag</em>' containment reference.
	 * @see #setIdBag(IdBag)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_IdBag()
	 * @model containment="true"
	 * @generated
	 */
	IdBag getIdBag();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getIdBag <em>Id Bag</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Bag</em>' containment reference.
	 * @see #getIdBag()
	 * @generated
	 */
	void setIdBag(IdBag value);

	/**
	 * Returns the value of the '<em><b>Indexed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexed</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexed</em>' containment reference.
	 * @see #setIndexed(Indexed)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_Indexed()
	 * @model containment="true"
	 * @generated
	 */
	Indexed getIndexed();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getIndexed <em>Indexed</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexed</em>' containment reference.
	 * @see #getIndexed()
	 * @generated
	 */
	void setIndexed(Indexed value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' containment reference.
	 * @see #setUnique(Unique)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEStructuralFeature_Unique()
	 * @model containment="true"
	 * @generated
	 */
	Unique getUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getUnique <em>Unique</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' containment reference.
	 * @see #getUnique()
	 * @generated
	 */
	void setUnique(Unique value);

	/**
	 * Returns the name of the (secondary) table where this feature is stored or null if the feature is stored in the
	 * primary table.
	 */
	public String getTableName();

	/**
	 * Convenience function for obtaining the first available Column annotation.
	 */
	public Column getColumn();

} // PAnnotatedEStructuralFeature
