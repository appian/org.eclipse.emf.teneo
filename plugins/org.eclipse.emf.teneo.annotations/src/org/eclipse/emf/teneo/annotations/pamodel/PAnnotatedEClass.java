/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEClass.java,v 1.5 2006/08/31 23:47:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue;
import org.eclipse.emf.teneo.annotations.pannotation.Embeddable;
import org.eclipse.emf.teneo.annotations.pannotation.Entity;
import org.eclipse.emf.teneo.annotations.pannotation.IdClass;
import org.eclipse.emf.teneo.annotations.pannotation.Inheritance;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.annotations.pannotation.MappedSuperclass;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumns;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTables;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PAnnotated EClass</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPaEPackage <em>Pa EPackage</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAnnotatedEClass <em>Annotated EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPaEStructuralFeatures <em>Pa EStructural Features</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAttributeOverrides <em>Attribute Overrides</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getDiscriminatorValue <em>Discriminator Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getMappedSuperclass <em>Mapped Superclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getIdClass <em>Id Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPrimaryKeyJoinColumns <em>Primary Key Join Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getSecondaryTables <em>Secondary Tables</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAssociationOverrides <em>Association Overrides</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getParsedAttributeOverrides <em>Parsed Attribute Overrides</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getParsedAssociationOverrides <em>Parsed Association Overrides</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getParsedSecondaryTables <em>Parsed Secondary Tables</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getParsedPrimaryKeyJoinColumns <em>Parsed Primary Key Join Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameEFeatures EPackageCommutes ProperPrimaryKey EntityOrEmbeddableOrMappedSuper\tOverriddenAreDefined ProperInheritance ProperDiscriminator SingleTableForSingleStrategy ProperPKJoin'"
 * @generated
 */
public interface PAnnotatedEClass extends PAnnotatedEModelElement {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * Returns the value of the '<em><b>Pa EPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getPaEClasses <em>Pa EClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pa EPackage</em>' container reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pa EPackage</em>' container reference.
	 * @see #setPaEPackage(PAnnotatedEPackage)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_PaEPackage()
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getPaEClasses
	 * @model opposite="paEClasses"
	 *        annotation="http://annotation.elver.org/internal/PersistenceMapping ignore='true'"
	 * @generated
	 */
	PAnnotatedEPackage getPaEPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPaEPackage <em>Pa EPackage</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pa EPackage</em>' container reference.
	 * @see #getPaEPackage()
	 * @generated
	 */
	void setPaEPackage(PAnnotatedEPackage value);

	/**
	 * Returns the value of the '<em><b>Annotated EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated EClass</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated EClass</em>' reference.
	 * @see #setAnnotatedEClass(EClass)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_AnnotatedEClass()
	 * @model required="true"
	 *        annotation="http://annotation.elver.org/internal/PersistenceMapping ignore='true'"
	 * @generated
	 */
	EClass getAnnotatedEClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAnnotatedEClass <em>Annotated EClass</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated EClass</em>' reference.
	 * @see #getAnnotatedEClass()
	 * @generated
	 */
	void setAnnotatedEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Pa EStructural Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getPaEClass <em>Pa EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pa EStructural Features</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pa EStructural Features</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_PaEStructuralFeatures()
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature#getPaEClass
	 * @model type="org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature" opposite="paEClass" containment="true"
	 *        annotation="http://annotation.elver.org/internal/PersistenceMapping ignore='true'"
	 * @generated
	 */
	EList getPaEStructuralFeatures();

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
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_AttributeOverrides()
	 * @model containment="true"
	 * @generated
	 */
	AttributeOverrides getAttributeOverrides();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAttributeOverrides <em>Attribute Overrides</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Overrides</em>' containment reference.
	 * @see #getAttributeOverrides()
	 * @generated
	 */
	void setAttributeOverrides(AttributeOverrides value);

	/**
	 * Returns the value of the '<em><b>Discriminator Column</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Discriminator Column</em>' containment reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column</em>' containment reference.
	 * @see #setDiscriminatorColumn(DiscriminatorColumn)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_DiscriminatorColumn()
	 * @model containment="true"
	 * @generated
	 */
	DiscriminatorColumn getDiscriminatorColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getDiscriminatorColumn <em>Discriminator Column</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column</em>' containment reference.
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	void setDiscriminatorColumn(DiscriminatorColumn value);

	/**
	 * Returns the value of the '<em><b>Discriminator Value</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Discriminator Value</em>' containment reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Value</em>' containment reference.
	 * @see #setDiscriminatorValue(DiscriminatorValue)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_DiscriminatorValue()
	 * @model containment="true"
	 * @generated
	 */
	DiscriminatorValue getDiscriminatorValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getDiscriminatorValue <em>Discriminator Value</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Value</em>' containment reference.
	 * @see #getDiscriminatorValue()
	 * @generated
	 */
	void setDiscriminatorValue(DiscriminatorValue value);

	/**
	 * Returns the value of the '<em><b>Embeddable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embeddable</em>' containment reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embeddable</em>' containment reference.
	 * @see #setEmbeddable(Embeddable)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_Embeddable()
	 * @model containment="true"
	 * @generated
	 */
	Embeddable getEmbeddable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getEmbeddable <em>Embeddable</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embeddable</em>' containment reference.
	 * @see #getEmbeddable()
	 * @generated
	 */
	void setEmbeddable(Embeddable value);

	/**
	 * Returns the value of the '<em><b>Mapped Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped Superclass</em>' containment reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Superclass</em>' containment reference.
	 * @see #setMappedSuperclass(MappedSuperclass)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_MappedSuperclass()
	 * @model containment="true"
	 * @generated
	 */
	MappedSuperclass getMappedSuperclass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getMappedSuperclass <em>Mapped Superclass</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Superclass</em>' containment reference.
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	void setMappedSuperclass(MappedSuperclass value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(Entity)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_Entity()
	 * @model containment="true"
	 *        annotation="http://annotation.elver.org/internal/PersistenceMapping ignore='true'"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Class</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Class</em>' containment reference.
	 * @see #setIdClass(IdClass)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_IdClass()
	 * @model containment="true"
	 * @generated
	 */
	IdClass getIdClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getIdClass <em>Id Class</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Class</em>' containment reference.
	 * @see #getIdClass()
	 * @generated
	 */
	void setIdClass(IdClass value);

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance</em>' containment reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' containment reference.
	 * @see #setInheritance(Inheritance)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_Inheritance()
	 * @model containment="true"
	 * @generated
	 */
	Inheritance getInheritance();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getInheritance <em>Inheritance</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance</em>' containment reference.
	 * @see #getInheritance()
	 * @generated
	 */
	void setInheritance(Inheritance value);

	/**
	 * Returns the value of the '<em><b>Primary Key Join Columns</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Join Columns</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Primary Key Join Columns</em>' containment reference.
	 * @see #setPrimaryKeyJoinColumns(PrimaryKeyJoinColumns)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_PrimaryKeyJoinColumns()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryKeyJoinColumns getPrimaryKeyJoinColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPrimaryKeyJoinColumns <em>Primary Key Join Columns</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key Join Columns</em>' containment reference.
	 * @see #getPrimaryKeyJoinColumns()
	 * @generated
	 */
	void setPrimaryKeyJoinColumns(PrimaryKeyJoinColumns value);

	/**
	 * Returns the value of the '<em><b>Secondary Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Tables</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Tables</em>' containment reference.
	 * @see #setSecondaryTables(SecondaryTables)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_SecondaryTables()
	 * @model containment="true"
	 * @generated
	 */
	SecondaryTables getSecondaryTables();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getSecondaryTables <em>Secondary Tables</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Tables</em>' containment reference.
	 * @see #getSecondaryTables()
	 * @generated
	 */
	void setSecondaryTables(SecondaryTables value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(Table)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_Table()
	 * @model containment="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

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
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_TableGenerator()
	 * @model containment="true"
	 * @generated
	 */
	TableGenerator getTableGenerator();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getTableGenerator <em>Table Generator</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Generator</em>' containment reference.
	 * @see #getTableGenerator()
	 * @generated
	 */
	void setTableGenerator(TableGenerator value);

	/**
	 * Returns the value of the '<em><b>Association Overrides</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Association Overrides</em>' containment reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Overrides</em>' containment reference.
	 * @see #setAssociationOverrides(AssociationOverrides)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_AssociationOverrides()
	 * @model containment="true"
	 * @generated
	 */
	AssociationOverrides getAssociationOverrides();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getAssociationOverrides <em>Association Overrides</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Overrides</em>' containment reference.
	 * @see #getAssociationOverrides()
	 * @generated
	 */
	void setAssociationOverrides(AssociationOverrides value);

	/**
	 * Returns the value of the '<em><b>Parsed Attribute Overrides</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsed Attribute Overrides</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsed Attribute Overrides</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_ParsedAttributeOverrides()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride" containment="true"
	 * @generated
	 */
	EList getParsedAttributeOverrides();

	/**
	 * Returns the value of the '<em><b>Parsed Association Overrides</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsed Association Overrides</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsed Association Overrides</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_ParsedAssociationOverrides()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride" containment="true"
	 * @generated
	 */
	EList getParsedAssociationOverrides();

	/**
	 * Returns the value of the '<em><b>Parsed Secondary Tables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsed Secondary Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsed Secondary Tables</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_ParsedSecondaryTables()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable" containment="true"
	 * @generated
	 */
	EList getParsedSecondaryTables();

	/**
	 * Returns the value of the '<em><b>Parsed Primary Key Join Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsed Primary Key Join Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsed Primary Key Join Columns</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEClass_ParsedPrimaryKeyJoinColumns()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn" containment="true"
	 * @generated
	 */
	EList getParsedPrimaryKeyJoinColumns();

	/**
	 * @return Returns the List of PAnnotatedEAttributes belonging to this PAnnotatedEClass for which an Id PAnnotation
	 *         is present.
	 */
	List getPaIdAttributes();

	/** Returns true if the eclass has an PAnnotatedEStructuralFeature with an id annotation */
	boolean hasIdAnnotatedFeature();

	/** Returns true if the eclass has an PAnnotatedEStructuralFeature with an version annotation */
	boolean hasVersionAnnotatedFeature();

	/**
	 * @return Returns the PAnnotatedEntity that is MappedSuperclass of this PAnnotatedEClass, <code>null</code> if it
	 *         has none. TODO support multiple mapped superclasses.
	 */
	PAnnotatedEClass getPaMappedSuper();

	/**
	 * @return Returns the PAnnotatedEntity that is a super entity of this PAnnotatedEClass, <code>null</code> if this
	 *         is a root entity.
	 */
	PAnnotatedEClass getPaSuperEntity();

	/**
	 * @return Returns the inheritance strategy for this entity. If this element has an inheritance annotation, return
	 *         the specified inheritance type; if this element has a superentity, returns the super entity inheritance
	 *         type. In any other case returns SINGLE_TABLE.
	 */
	InheritanceType getInheritanceStrategy();
} // PAnnotatedEClass
