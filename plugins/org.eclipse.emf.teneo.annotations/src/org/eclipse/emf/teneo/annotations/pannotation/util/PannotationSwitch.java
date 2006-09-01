/**
 * <copyright>
 * </copyright>
 *
 * $Id: PannotationSwitch.java,v 1.7 2006/09/01 06:56:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverride;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue;
import org.eclipse.emf.teneo.annotations.pannotation.Embeddable;
import org.eclipse.emf.teneo.annotations.pannotation.Embedded;
import org.eclipse.emf.teneo.annotations.pannotation.EmbeddedId;
import org.eclipse.emf.teneo.annotations.pannotation.Entity;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.IdClass;
import org.eclipse.emf.teneo.annotations.pannotation.Indexed;
import org.eclipse.emf.teneo.annotations.pannotation.Inheritance;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumns;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.Lob;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToOne;
import org.eclipse.emf.teneo.annotations.pannotation.MapKey;
import org.eclipse.emf.teneo.annotations.pannotation.MappedSuperclass;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;
import org.eclipse.emf.teneo.annotations.pannotation.OrderBy;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumns;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTables;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Temporal;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;
import org.eclipse.emf.teneo.annotations.pannotation.Unique;
import org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint;
import org.eclipse.emf.teneo.annotations.pannotation.Version;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage
 * @generated
 */
public class PannotationSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PannotationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PannotationSwitch() {
		if (modelPackage == null) {
			modelPackage = PannotationPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PannotationPackage.PANNOTATION: {
				PAnnotation pAnnotation = (PAnnotation)theEObject;
				Object result = casePAnnotation(pAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.ATTRIBUTE_OVERRIDE: {
				AttributeOverride attributeOverride = (AttributeOverride)theEObject;
				Object result = caseAttributeOverride(attributeOverride);
				if (result == null) result = casePAnnotation(attributeOverride);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.ATTRIBUTE_OVERRIDES: {
				AttributeOverrides attributeOverrides = (AttributeOverrides)theEObject;
				Object result = caseAttributeOverrides(attributeOverrides);
				if (result == null) result = casePAnnotation(attributeOverrides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.ASSOCIATION_OVERRIDE: {
				AssociationOverride associationOverride = (AssociationOverride)theEObject;
				Object result = caseAssociationOverride(associationOverride);
				if (result == null) result = casePAnnotation(associationOverride);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.ASSOCIATION_OVERRIDES: {
				AssociationOverrides associationOverrides = (AssociationOverrides)theEObject;
				Object result = caseAssociationOverrides(associationOverrides);
				if (result == null) result = casePAnnotation(associationOverrides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.BASIC: {
				Basic basic = (Basic)theEObject;
				Object result = caseBasic(basic);
				if (result == null) result = casePAnnotation(basic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.COLUMN: {
				Column column = (Column)theEObject;
				Object result = caseColumn(column);
				if (result == null) result = casePAnnotation(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.DISCRIMINATOR_COLUMN: {
				DiscriminatorColumn discriminatorColumn = (DiscriminatorColumn)theEObject;
				Object result = caseDiscriminatorColumn(discriminatorColumn);
				if (result == null) result = casePAnnotation(discriminatorColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.DISCRIMINATOR_VALUE: {
				DiscriminatorValue discriminatorValue = (DiscriminatorValue)theEObject;
				Object result = caseDiscriminatorValue(discriminatorValue);
				if (result == null) result = casePAnnotation(discriminatorValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.EMBEDDABLE: {
				Embeddable embeddable = (Embeddable)theEObject;
				Object result = caseEmbeddable(embeddable);
				if (result == null) result = casePAnnotation(embeddable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.EMBEDDED: {
				Embedded embedded = (Embedded)theEObject;
				Object result = caseEmbedded(embedded);
				if (result == null) result = casePAnnotation(embedded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.EMBEDDED_ID: {
				EmbeddedId embeddedId = (EmbeddedId)theEObject;
				Object result = caseEmbeddedId(embeddedId);
				if (result == null) result = casePAnnotation(embeddedId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				Object result = caseEntity(entity);
				if (result == null) result = casePAnnotation(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.ENUMERATED: {
				Enumerated enumerated = (Enumerated)theEObject;
				Object result = caseEnumerated(enumerated);
				if (result == null) result = casePAnnotation(enumerated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.GENERATED_VALUE: {
				GeneratedValue generatedValue = (GeneratedValue)theEObject;
				Object result = caseGeneratedValue(generatedValue);
				if (result == null) result = casePAnnotation(generatedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.ID: {
				Id id = (Id)theEObject;
				Object result = caseId(id);
				if (result == null) result = casePAnnotation(id);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.ID_CLASS: {
				IdClass idClass = (IdClass)theEObject;
				Object result = caseIdClass(idClass);
				if (result == null) result = casePAnnotation(idClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.INHERITANCE: {
				Inheritance inheritance = (Inheritance)theEObject;
				Object result = caseInheritance(inheritance);
				if (result == null) result = casePAnnotation(inheritance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.JOIN_COLUMN: {
				JoinColumn joinColumn = (JoinColumn)theEObject;
				Object result = caseJoinColumn(joinColumn);
				if (result == null) result = casePAnnotation(joinColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.JOIN_COLUMNS: {
				JoinColumns joinColumns = (JoinColumns)theEObject;
				Object result = caseJoinColumns(joinColumns);
				if (result == null) result = casePAnnotation(joinColumns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.JOIN_TABLE: {
				JoinTable joinTable = (JoinTable)theEObject;
				Object result = caseJoinTable(joinTable);
				if (result == null) result = casePAnnotation(joinTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.LOB: {
				Lob lob = (Lob)theEObject;
				Object result = caseLob(lob);
				if (result == null) result = casePAnnotation(lob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.MANY_TO_MANY: {
				ManyToMany manyToMany = (ManyToMany)theEObject;
				Object result = caseManyToMany(manyToMany);
				if (result == null) result = casePAnnotation(manyToMany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.MANY_TO_ONE: {
				ManyToOne manyToOne = (ManyToOne)theEObject;
				Object result = caseManyToOne(manyToOne);
				if (result == null) result = casePAnnotation(manyToOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.MAP_KEY: {
				MapKey mapKey = (MapKey)theEObject;
				Object result = caseMapKey(mapKey);
				if (result == null) result = casePAnnotation(mapKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.MAPPED_SUPERCLASS: {
				MappedSuperclass mappedSuperclass = (MappedSuperclass)theEObject;
				Object result = caseMappedSuperclass(mappedSuperclass);
				if (result == null) result = casePAnnotation(mappedSuperclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.ONE_TO_MANY: {
				OneToMany oneToMany = (OneToMany)theEObject;
				Object result = caseOneToMany(oneToMany);
				if (result == null) result = casePAnnotation(oneToMany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.ONE_TO_ONE: {
				OneToOne oneToOne = (OneToOne)theEObject;
				Object result = caseOneToOne(oneToOne);
				if (result == null) result = casePAnnotation(oneToOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.ORDER_BY: {
				OrderBy orderBy = (OrderBy)theEObject;
				Object result = caseOrderBy(orderBy);
				if (result == null) result = casePAnnotation(orderBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMN: {
				PrimaryKeyJoinColumn primaryKeyJoinColumn = (PrimaryKeyJoinColumn)theEObject;
				Object result = casePrimaryKeyJoinColumn(primaryKeyJoinColumn);
				if (result == null) result = casePAnnotation(primaryKeyJoinColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS: {
				PrimaryKeyJoinColumns primaryKeyJoinColumns = (PrimaryKeyJoinColumns)theEObject;
				Object result = casePrimaryKeyJoinColumns(primaryKeyJoinColumns);
				if (result == null) result = casePAnnotation(primaryKeyJoinColumns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.SECONDARY_TABLE: {
				SecondaryTable secondaryTable = (SecondaryTable)theEObject;
				Object result = caseSecondaryTable(secondaryTable);
				if (result == null) result = casePAnnotation(secondaryTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.SECONDARY_TABLES: {
				SecondaryTables secondaryTables = (SecondaryTables)theEObject;
				Object result = caseSecondaryTables(secondaryTables);
				if (result == null) result = casePAnnotation(secondaryTables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.SEQUENCE_GENERATOR: {
				SequenceGenerator sequenceGenerator = (SequenceGenerator)theEObject;
				Object result = caseSequenceGenerator(sequenceGenerator);
				if (result == null) result = casePAnnotation(sequenceGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.TABLE: {
				Table table = (Table)theEObject;
				Object result = caseTable(table);
				if (result == null) result = casePAnnotation(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.TABLE_GENERATOR: {
				TableGenerator tableGenerator = (TableGenerator)theEObject;
				Object result = caseTableGenerator(tableGenerator);
				if (result == null) result = casePAnnotation(tableGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.TEMPORAL: {
				Temporal temporal = (Temporal)theEObject;
				Object result = caseTemporal(temporal);
				if (result == null) result = casePAnnotation(temporal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.TRANSIENT: {
				Transient transient_ = (Transient)theEObject;
				Object result = caseTransient(transient_);
				if (result == null) result = casePAnnotation(transient_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.UNIQUE_CONSTRAINT: {
				UniqueConstraint uniqueConstraint = (UniqueConstraint)theEObject;
				Object result = caseUniqueConstraint(uniqueConstraint);
				if (result == null) result = casePAnnotation(uniqueConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.VERSION: {
				Version version = (Version)theEObject;
				Object result = caseVersion(version);
				if (result == null) result = casePAnnotation(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.INDEXED: {
				Indexed indexed = (Indexed)theEObject;
				Object result = caseIndexed(indexed);
				if (result == null) result = casePAnnotation(indexed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PannotationPackage.UNIQUE: {
				Unique unique = (Unique)theEObject;
				Object result = caseUnique(unique);
				if (result == null) result = casePAnnotation(unique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>PAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>PAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePAnnotation(PAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Attribute Override</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Attribute Override</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeOverride(AttributeOverride object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Attribute Overrides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Attribute Overrides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeOverrides(AttributeOverrides object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasic(Basic object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Discriminator Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Discriminator Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiscriminatorColumn(DiscriminatorColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Discriminator Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Discriminator Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiscriminatorValue(DiscriminatorValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Embeddable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEmbeddable(Embeddable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Mapped Superclass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Mapped Superclass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMappedSuperclass(MappedSuperclass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Embedded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Embedded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEmbedded(Embedded object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Embedded Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Embedded Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEmbeddedId(EmbeddedId object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Enumerated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Enumerated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumerated(Enumerated object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Generated Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Generated Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGeneratedValue(GeneratedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseId(Id object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Id Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Id Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdClass(IdClass object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInheritance(Inheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Join Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Join Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJoinColumn(JoinColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Join Columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Join Columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJoinColumns(JoinColumns object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Join Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Join Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJoinTable(JoinTable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Lob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Lob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLob(Lob object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Many To Many</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Many To Many</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseManyToMany(ManyToMany object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Many To One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Many To One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseManyToOne(ManyToOne object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Map Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Map Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMapKey(MapKey object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>One To Many</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>One To Many</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOneToMany(OneToMany object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>One To One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>One To One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOneToOne(OneToOne object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Order By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Order By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrderBy(OrderBy object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Primary Key Join Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Primary Key Join Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimaryKeyJoinColumn(PrimaryKeyJoinColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Primary Key Join Columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Primary Key Join Columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimaryKeyJoinColumns(PrimaryKeyJoinColumns object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Secondary Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Secondary Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSecondaryTable(SecondaryTable object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Secondary Tables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Secondary Tables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSecondaryTables(SecondaryTables object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Sequence Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Sequence Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSequenceGenerator(SequenceGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Table Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Table Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTableGenerator(TableGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Temporal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Temporal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemporal(Temporal object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Transient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Transient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransient(Transient object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Unique Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Unique Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUniqueConstraint(UniqueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Indexed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Indexed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIndexed(Indexed object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Unique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Unique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnique(Unique object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Association Override</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Association Override</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssociationOverride(AssociationOverride object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Association Overrides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Association Overrides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssociationOverrides(AssociationOverrides object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //PannotationSwitch
