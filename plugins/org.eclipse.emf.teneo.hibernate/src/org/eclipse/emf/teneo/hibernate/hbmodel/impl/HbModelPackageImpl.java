/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbModelPackageImpl.java,v 1.5 2006/10/20 13:21:49 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel.impl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage;
import org.eclipse.emf.teneo.hibernate.hbannotation.impl.HbAnnotationPackageImpl;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEModelElement;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEPackage;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbModelFactory;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HbModelPackageImpl extends EPackageImpl implements HbModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hbAnnotatedETypeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hbAnnotatedEAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hbAnnotatedEClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hbAnnotatedEModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hbAnnotatedEPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hbAnnotatedEReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hbAnnotatedEDataTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HbModelPackageImpl() {
		super(eNS_URI, HbModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HbModelPackage init() {
		if (isInited) return (HbModelPackage)EPackage.Registry.INSTANCE.getEPackage(HbModelPackage.eNS_URI);

		// Obtain or create and register package
		HbModelPackageImpl theHbModelPackage = (HbModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof HbModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new HbModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PamodelPackage.eINSTANCE.eClass();
		PannotationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		HbAnnotationPackageImpl theHbAnnotationPackage = (HbAnnotationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HbAnnotationPackage.eNS_URI) instanceof HbAnnotationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HbAnnotationPackage.eNS_URI) : HbAnnotationPackage.eINSTANCE);

		// Create package meta-data objects
		theHbModelPackage.createPackageContents();
		theHbAnnotationPackage.createPackageContents();

		// Initialize created meta-data
		theHbModelPackage.initializePackageContents();
		theHbAnnotationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHbModelPackage.freeze();

		return theHbModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHbAnnotatedETypeElement() {
		return hbAnnotatedETypeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHbAnnotatedETypeElement_HbWhere() {
		return (EReference)hbAnnotatedETypeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHbAnnotatedETypeElement_HbCollectionOfElements() {
		return (EReference)hbAnnotatedETypeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHbAnnotatedETypeElement_HbMapKey() {
		return (EReference)hbAnnotatedETypeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHbAnnotatedETypeElement_HbColumns() {
		return (EReference)hbAnnotatedETypeElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHbAnnotatedETypeElement_HbCascade() {
		return (EReference)hbAnnotatedETypeElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHbAnnotatedETypeElement_HbIdBag() {
		return (EReference)hbAnnotatedETypeElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHbAnnotatedEAttribute() {
		return hbAnnotatedEAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHbAnnotatedEAttribute_HbType() {
		return (EReference)hbAnnotatedEAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHbAnnotatedEClass() {
		return hbAnnotatedEClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHbAnnotatedEClass_HbCache() {
		return (EReference)hbAnnotatedEClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHbAnnotatedEModelElement() {
		return hbAnnotatedEModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHbAnnotatedEPackage() {
		return hbAnnotatedEPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHbAnnotatedEPackage_HbGenericGenerators() {
		return (EReference)hbAnnotatedEPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHbAnnotatedEReference() {
		return hbAnnotatedEReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHbAnnotatedEReference_HbCache() {
		return (EReference)hbAnnotatedEReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHbAnnotatedEDataType() {
		return hbAnnotatedEDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHbAnnotatedEDataType_HbType() {
		return (EReference)hbAnnotatedEDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbModelFactory getHbModelFactory() {
		return (HbModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hbAnnotatedETypeElementEClass = createEClass(HB_ANNOTATED_ETYPE_ELEMENT);
		createEReference(hbAnnotatedETypeElementEClass, HB_ANNOTATED_ETYPE_ELEMENT__HB_WHERE);
		createEReference(hbAnnotatedETypeElementEClass, HB_ANNOTATED_ETYPE_ELEMENT__HB_COLLECTION_OF_ELEMENTS);
		createEReference(hbAnnotatedETypeElementEClass, HB_ANNOTATED_ETYPE_ELEMENT__HB_MAP_KEY);
		createEReference(hbAnnotatedETypeElementEClass, HB_ANNOTATED_ETYPE_ELEMENT__HB_COLUMNS);
		createEReference(hbAnnotatedETypeElementEClass, HB_ANNOTATED_ETYPE_ELEMENT__HB_CASCADE);
		createEReference(hbAnnotatedETypeElementEClass, HB_ANNOTATED_ETYPE_ELEMENT__HB_ID_BAG);

		hbAnnotatedEAttributeEClass = createEClass(HB_ANNOTATED_EATTRIBUTE);
		createEReference(hbAnnotatedEAttributeEClass, HB_ANNOTATED_EATTRIBUTE__HB_TYPE);

		hbAnnotatedEClassEClass = createEClass(HB_ANNOTATED_ECLASS);
		createEReference(hbAnnotatedEClassEClass, HB_ANNOTATED_ECLASS__HB_CACHE);

		hbAnnotatedEModelElementEClass = createEClass(HB_ANNOTATED_EMODEL_ELEMENT);

		hbAnnotatedEPackageEClass = createEClass(HB_ANNOTATED_EPACKAGE);
		createEReference(hbAnnotatedEPackageEClass, HB_ANNOTATED_EPACKAGE__HB_GENERIC_GENERATORS);

		hbAnnotatedEReferenceEClass = createEClass(HB_ANNOTATED_EREFERENCE);
		createEReference(hbAnnotatedEReferenceEClass, HB_ANNOTATED_EREFERENCE__HB_CACHE);

		hbAnnotatedEDataTypeEClass = createEClass(HB_ANNOTATED_EDATA_TYPE);
		createEReference(hbAnnotatedEDataTypeEClass, HB_ANNOTATED_EDATA_TYPE__HB_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PamodelPackage thePamodelPackage = (PamodelPackage)EPackage.Registry.INSTANCE.getEPackage(PamodelPackage.eNS_URI);
		HbAnnotationPackage theHbAnnotationPackage = (HbAnnotationPackage)EPackage.Registry.INSTANCE.getEPackage(HbAnnotationPackage.eNS_URI);
		PannotationPackage thePannotationPackage = (PannotationPackage)EPackage.Registry.INSTANCE.getEPackage(PannotationPackage.eNS_URI);

		// Add supertypes to classes
		hbAnnotatedETypeElementEClass.getESuperTypes().add(thePamodelPackage.getPAnnotatedEStructuralFeature());
		hbAnnotatedETypeElementEClass.getESuperTypes().add(this.getHbAnnotatedEModelElement());
		hbAnnotatedEAttributeEClass.getESuperTypes().add(thePamodelPackage.getPAnnotatedEAttribute());
		hbAnnotatedEAttributeEClass.getESuperTypes().add(this.getHbAnnotatedETypeElement());
		hbAnnotatedEClassEClass.getESuperTypes().add(thePamodelPackage.getPAnnotatedEClass());
		hbAnnotatedEModelElementEClass.getESuperTypes().add(thePamodelPackage.getPAnnotatedEModelElement());
		hbAnnotatedEPackageEClass.getESuperTypes().add(thePamodelPackage.getPAnnotatedEPackage());
		hbAnnotatedEReferenceEClass.getESuperTypes().add(thePamodelPackage.getPAnnotatedEReference());
		hbAnnotatedEReferenceEClass.getESuperTypes().add(this.getHbAnnotatedETypeElement());
		hbAnnotatedEDataTypeEClass.getESuperTypes().add(thePamodelPackage.getPAnnotatedEDataType());
		hbAnnotatedEDataTypeEClass.getESuperTypes().add(this.getHbAnnotatedETypeElement());

		// Initialize classes and features; add operations and parameters
		initEClass(hbAnnotatedETypeElementEClass, HbAnnotatedETypeElement.class, "HbAnnotatedETypeElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHbAnnotatedETypeElement_HbWhere(), theHbAnnotationPackage.getWhere(), null, "hbWhere", null, 0, 1, HbAnnotatedETypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHbAnnotatedETypeElement_HbCollectionOfElements(), theHbAnnotationPackage.getCollectionOfElements(), null, "hbCollectionOfElements", null, 0, 1, HbAnnotatedETypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHbAnnotatedETypeElement_HbMapKey(), theHbAnnotationPackage.getMapKey(), null, "hbMapKey", null, 0, 1, HbAnnotatedETypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHbAnnotatedETypeElement_HbColumns(), thePannotationPackage.getColumn(), null, "hbColumns", "", 0, -1, HbAnnotatedETypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHbAnnotatedETypeElement_HbCascade(), theHbAnnotationPackage.getCascade(), null, "hbCascade", null, 0, 1, HbAnnotatedETypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHbAnnotatedETypeElement_HbIdBag(), theHbAnnotationPackage.getIdBag(), null, "hbIdBag", null, 0, 1, HbAnnotatedETypeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hbAnnotatedEAttributeEClass, HbAnnotatedEAttribute.class, "HbAnnotatedEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHbAnnotatedEAttribute_HbType(), theHbAnnotationPackage.getType(), null, "hbType", null, 0, 1, HbAnnotatedEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hbAnnotatedEClassEClass, HbAnnotatedEClass.class, "HbAnnotatedEClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHbAnnotatedEClass_HbCache(), theHbAnnotationPackage.getCache(), null, "hbCache", null, 0, 1, HbAnnotatedEClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hbAnnotatedEModelElementEClass, HbAnnotatedEModelElement.class, "HbAnnotatedEModelElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hbAnnotatedEPackageEClass, HbAnnotatedEPackage.class, "HbAnnotatedEPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHbAnnotatedEPackage_HbGenericGenerators(), theHbAnnotationPackage.getGenericGenerator(), null, "hbGenericGenerators", null, 0, -1, HbAnnotatedEPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hbAnnotatedEReferenceEClass, HbAnnotatedEReference.class, "HbAnnotatedEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHbAnnotatedEReference_HbCache(), theHbAnnotationPackage.getCache(), null, "hbCache", null, 0, 1, HbAnnotatedEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hbAnnotatedEDataTypeEClass, HbAnnotatedEDataType.class, "HbAnnotatedEDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHbAnnotatedEDataType_HbType(), theHbAnnotationPackage.getType(), null, "hbType", null, 0, 1, HbAnnotatedEDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * {@see PamodelPackage#pAnnotationReference(EClass, EClass)}
	 */
	public EReference pAnnotationReference(EClass paElementEClass, EClass pAnnotationEClass) {
		if (PamodelPackage.eINSTANCE.getPAnnotatedEModelElement().isSuperTypeOf(paElementEClass) &&
			PannotationPackage.eINSTANCE.getPAnnotation().isSuperTypeOf(pAnnotationEClass))
			for (Iterator i = paElementEClass.getEAllReferences().iterator(); i.hasNext(); ) {
				EReference r = (EReference) i.next();
				if (r.getEReferenceType() == pAnnotationEClass)
					return r;
			}
		return null;
	}
} //HbModelPackageImpl
