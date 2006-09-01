/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotationPackage.java,v 1.3 2006/09/01 06:56:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationFactory
 * @model kind="package"
 *        annotation="teneo.mapping.source 1='http://hibernate.elver.org/'"
 * @generated
 */
public interface HbAnnotationPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hbannotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/2006/HbAnnotation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.teneo.hibernate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HbAnnotationPackage eINSTANCE = org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotation <em>Hb Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotation
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getHbAnnotation()
	 * @generated
	 */
	int HB_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATION__EMODEL_ELEMENT = PannotationPackage.PANNOTATION__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Hb Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HB_ANNOTATION_FEATURE_COUNT = PannotationPackage.PANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CollectionOfElementsImpl <em>Collection Of Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.CollectionOfElementsImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getCollectionOfElements()
	 * @generated
	 */
	int COLLECTION_OF_ELEMENTS = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.WhereImpl <em>Where</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.WhereImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getWhere()
	 * @generated
	 */
	int WHERE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CascadeImpl <em>Cascade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.CascadeImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getCascade()
	 * @generated
	 */
	int CASCADE = 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE__VALUE = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cascade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OF_ELEMENTS__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OF_ELEMENTS__TARGET_ELEMENT = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OF_ELEMENTS__FETCH = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Of Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OF_ELEMENTS_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.ColumnsImpl <em>Columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.ColumnsImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getColumns()
	 * @generated
	 */
	int COLUMNS = 3;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS__VALUE = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.MapKeyImpl <em>Map Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.MapKeyImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getMapKey()
	 * @generated
	 */
	int MAP_KEY = 4;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__COLUMNS = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.ParameterImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 6;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARAMETERS = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE__CLAUSE = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.IdBagImpl <em>Id Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.IdBagImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getIdBag()
	 * @generated
	 */
	int ID_BAG = 8;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG__GENERATOR = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG__TYPE = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Id Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_BAG_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.GenericGeneratorImpl <em>Generic Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.GenericGeneratorImpl
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getGenericGenerator()
	 * @generated
	 */
	int GENERIC_GENERATOR = 9;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GENERATOR__EMODEL_ELEMENT = HB_ANNOTATION__EMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GENERATOR__NAME = HB_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GENERATOR__STRATEGY = HB_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GENERATOR__PARAMETERS = HB_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generic Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_GENERATOR_FEATURE_COUNT = HB_ANNOTATION_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotation <em>Hb Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hb Annotation</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotation
	 * @generated
	 */
	EClass getHbAnnotation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements <em>Collection Of Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Of Elements</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements
	 * @generated
	 */
	EClass getCollectionOfElements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Element</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getTargetElement()
	 * @see #getCollectionOfElements()
	 * @generated
	 */
	EAttribute getCollectionOfElements_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements#getFetch()
	 * @see #getCollectionOfElements()
	 * @generated
	 */
	EAttribute getCollectionOfElements_Fetch();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Where
	 * @generated
	 */
	EClass getWhere();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Where#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clause</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Where#getClause()
	 * @see #getWhere()
	 * @generated
	 */
	EAttribute getWhere_Clause();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cascade</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Cascade
	 * @generated
	 */
	EClass getCascade();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cascade#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Cascade#getValue()
	 * @see #getCascade()
	 * @generated
	 */
	EAttribute getCascade_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Columns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columns</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Columns
	 * @generated
	 */
	EClass getColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Columns#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Columns#getValue()
	 * @see #getColumns()
	 * @generated
	 */
	EReference getColumns_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.MapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.MapKey
	 * @generated
	 */
	EClass getMapKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.hibernate.hbannotation.MapKey#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.MapKey#getColumns()
	 * @see #getMapKey()
	 * @generated
	 */
	EReference getMapKey_Columns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Type#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Type#getType()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Type#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.Type#getParameters()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.IdBag <em>Id Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Bag</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.IdBag
	 * @generated
	 */
	EClass getIdBag();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.IdBag#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.IdBag#getGenerator()
	 * @see #getIdBag()
	 * @generated
	 */
	EAttribute getIdBag_Generator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.IdBag#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.IdBag#getType()
	 * @see #getIdBag()
	 * @generated
	 */
	EAttribute getIdBag_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator <em>Generic Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Generator</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator
	 * @generated
	 */
	EClass getGenericGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getName()
	 * @see #getGenericGenerator()
	 * @generated
	 */
	EAttribute getGenericGenerator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getStrategy()
	 * @see #getGenericGenerator()
	 * @generated
	 */
	EAttribute getGenericGenerator_Strategy();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.GenericGenerator#getParameters()
	 * @see #getGenericGenerator()
	 * @generated
	 */
	EReference getGenericGenerator_Parameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HbAnnotationFactory getHbAnnotationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotation <em>Hb Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotation
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getHbAnnotation()
		 * @generated
		 */
		EClass HB_ANNOTATION = eINSTANCE.getHbAnnotation();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CollectionOfElementsImpl <em>Collection Of Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.CollectionOfElementsImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getCollectionOfElements()
		 * @generated
		 */
		EClass COLLECTION_OF_ELEMENTS = eINSTANCE.getCollectionOfElements();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_OF_ELEMENTS__TARGET_ELEMENT = eINSTANCE.getCollectionOfElements_TargetElement();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_OF_ELEMENTS__FETCH = eINSTANCE.getCollectionOfElements_Fetch();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.WhereImpl <em>Where</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.WhereImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getWhere()
		 * @generated
		 */
		EClass WHERE = eINSTANCE.getWhere();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHERE__CLAUSE = eINSTANCE.getWhere_Clause();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.CascadeImpl <em>Cascade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.CascadeImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getCascade()
		 * @generated
		 */
		EClass CASCADE = eINSTANCE.getCascade();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASCADE__VALUE = eINSTANCE.getCascade_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.ColumnsImpl <em>Columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.ColumnsImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getColumns()
		 * @generated
		 */
		EClass COLUMNS = eINSTANCE.getColumns();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNS__VALUE = eINSTANCE.getColumns_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.MapKeyImpl <em>Map Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.MapKeyImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getMapKey()
		 * @generated
		 */
		EClass MAP_KEY = eINSTANCE.getMapKey();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_KEY__COLUMNS = eINSTANCE.getMapKey_Columns();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.ParameterImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__PARAMETERS = eINSTANCE.getType_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.IdBagImpl <em>Id Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.IdBagImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getIdBag()
		 * @generated
		 */
		EClass ID_BAG = eINSTANCE.getIdBag();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BAG__GENERATOR = eINSTANCE.getIdBag_Generator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_BAG__TYPE = eINSTANCE.getIdBag_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.GenericGeneratorImpl <em>Generic Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.GenericGeneratorImpl
		 * @see org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl#getGenericGenerator()
		 * @generated
		 */
		EClass GENERIC_GENERATOR = eINSTANCE.getGenericGenerator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_GENERATOR__NAME = eINSTANCE.getGenericGenerator_Name();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_GENERATOR__STRATEGY = eINSTANCE.getGenericGenerator_Strategy();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_GENERATOR__PARAMETERS = eINSTANCE.getGenericGenerator_Parameters();

}

} //HbAnnotationPackage
