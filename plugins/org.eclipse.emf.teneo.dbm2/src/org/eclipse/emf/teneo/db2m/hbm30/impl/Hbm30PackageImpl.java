/**
 * <copyright>
 * </copyright>
 *
 * $Id: Hbm30PackageImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Factory;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hbm30PackageImpl extends EPackageImpl implements Hbm30Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "hbm30.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeMapKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialectScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discriminatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hibernateMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idbagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexManyToAnyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexManyToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinedSubclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyManyToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyToAnyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapKeyManyToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedCompositeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnDiscriminatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnScalarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlDeleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlDeleteAllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlInsertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timestampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuplizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionSubclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cachemodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fetchEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fetchJoinSelectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flushmodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generatedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generatedNeverAlwaysEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum includeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lazyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lazyFalseProxyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lazyTrueFalseExtraEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lockmodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notfoundEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum onDeleteTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum optimisticLockTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum outerjoinEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum polymorphismTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unsavedValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unsavedValueType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unsavedValueType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cachemodeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType entityModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fetchJoinSelectObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fetchObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType flushmodeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType generatedNeverAlwaysObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType generatedObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType includeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lazyFalseProxyObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lazyObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lazyTrueFalseExtraObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lockmodeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType notfoundObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType onDeleteTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType optimisticLockTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outerjoinObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType polymorphismTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsavedValueTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsavedValueTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsavedValueTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType usageTypeObjectEDataType = null;

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Hbm30PackageImpl() {
		super(eNS_URI, Hbm30Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Hbm30Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Hbm30Package init() {
		if (isInited) return (Hbm30Package)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI);

		// Obtain or create and register package
		Hbm30PackageImpl theHbm30Package = (Hbm30PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Hbm30PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Hbm30PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theHbm30Package.loadPackage();

		// Fix loaded packages
		theHbm30Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theHbm30Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Hbm30Package.eNS_URI, theHbm30Package);
		return theHbm30Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAny() {
		if (anyEClass == null) {
			anyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(0);
		}
		return anyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAny_Meta() {
        return (EReference)getAny().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAny_MetaValue() {
        return (EReference)getAny().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAny_Column() {
        return (EReference)getAny().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAny_Column1() {
        return (EReference)getAny().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_Access() {
        return (EAttribute)getAny().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_Cascade() {
        return (EAttribute)getAny().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_IdType() {
        return (EAttribute)getAny().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_Index() {
        return (EAttribute)getAny().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_Insert() {
        return (EAttribute)getAny().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_Lazy() {
        return (EAttribute)getAny().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_MetaType() {
        return (EAttribute)getAny().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_Name() {
        return (EAttribute)getAny().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_Node() {
        return (EAttribute)getAny().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_OptimisticLock() {
        return (EAttribute)getAny().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAny_Update() {
        return (EAttribute)getAny().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArray() {
		if (arrayEClass == null) {
			arrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(1);
		}
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_Meta() {
        return (EReference)getArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Subselect() {
        return (EAttribute)getArray().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_Cache() {
        return (EReference)getArray().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_Synchronize() {
        return (EReference)getArray().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Comment() {
        return (EAttribute)getArray().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_Key() {
        return (EReference)getArray().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_Index() {
        return (EReference)getArray().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_ListIndex() {
        return (EReference)getArray().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_Element() {
        return (EReference)getArray().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_OneToMany() {
        return (EReference)getArray().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_ManyToMany() {
        return (EReference)getArray().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_CompositeElement() {
        return (EReference)getArray().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_ManyToAny() {
        return (EReference)getArray().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_Loader() {
        return (EReference)getArray().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_SqlInsert() {
        return (EReference)getArray().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_SqlUpdate() {
        return (EReference)getArray().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_SqlDelete() {
        return (EReference)getArray().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_SqlDeleteAll() {
        return (EReference)getArray().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Access() {
        return (EAttribute)getArray().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_BatchSize() {
        return (EAttribute)getArray().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Cascade() {
        return (EAttribute)getArray().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Catalog() {
        return (EAttribute)getArray().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Check() {
        return (EAttribute)getArray().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_CollectionType() {
        return (EAttribute)getArray().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_ElementClass() {
        return (EAttribute)getArray().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_EmbedXml() {
        return (EAttribute)getArray().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Fetch() {
        return (EAttribute)getArray().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Inverse() {
        return (EAttribute)getArray().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Mutable() {
        return (EAttribute)getArray().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Name() {
        return (EAttribute)getArray().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Node() {
        return (EAttribute)getArray().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_OptimisticLock() {
        return (EAttribute)getArray().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_OuterJoin() {
        return (EAttribute)getArray().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Persister() {
        return (EAttribute)getArray().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Schema() {
        return (EAttribute)getArray().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Subselect1() {
        return (EAttribute)getArray().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Table() {
        return (EAttribute)getArray().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Where() {
        return (EAttribute)getArray().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBag() {
		if (bagEClass == null) {
			bagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(2);
		}
		return bagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_Meta() {
        return (EReference)getBag().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Subselect() {
        return (EAttribute)getBag().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_Cache() {
        return (EReference)getBag().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_Synchronize() {
        return (EReference)getBag().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Comment() {
        return (EAttribute)getBag().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_Key() {
        return (EReference)getBag().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_Element() {
        return (EReference)getBag().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_OneToMany() {
        return (EReference)getBag().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_ManyToMany() {
        return (EReference)getBag().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_CompositeElement() {
        return (EReference)getBag().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_ManyToAny() {
        return (EReference)getBag().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_Loader() {
        return (EReference)getBag().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_SqlInsert() {
        return (EReference)getBag().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_SqlUpdate() {
        return (EReference)getBag().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_SqlDelete() {
        return (EReference)getBag().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_SqlDeleteAll() {
        return (EReference)getBag().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBag_Filter() {
        return (EReference)getBag().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Access() {
        return (EAttribute)getBag().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_BatchSize() {
        return (EAttribute)getBag().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Cascade() {
        return (EAttribute)getBag().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Catalog() {
        return (EAttribute)getBag().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Check() {
        return (EAttribute)getBag().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_CollectionType() {
        return (EAttribute)getBag().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_EmbedXml() {
        return (EAttribute)getBag().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Fetch() {
        return (EAttribute)getBag().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Inverse() {
        return (EAttribute)getBag().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Lazy() {
        return (EAttribute)getBag().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Mutable() {
        return (EAttribute)getBag().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Name() {
        return (EAttribute)getBag().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Node() {
        return (EAttribute)getBag().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_OptimisticLock() {
        return (EAttribute)getBag().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_OrderBy() {
        return (EAttribute)getBag().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_OuterJoin() {
        return (EAttribute)getBag().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Persister() {
        return (EAttribute)getBag().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Schema() {
        return (EAttribute)getBag().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Subselect1() {
        return (EAttribute)getBag().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Table() {
        return (EAttribute)getBag().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBag_Where() {
        return (EAttribute)getBag().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCache() {
		if (cacheEClass == null) {
			cacheEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(3);
		}
		return cacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Include() {
        return (EAttribute)getCache().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Region() {
        return (EAttribute)getCache().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Usage() {
        return (EAttribute)getCache().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		if (classEClass == null) {
			classEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(6);
		}
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Meta() {
        return (EReference)getClass_().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Subselect() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Cache() {
        return (EReference)getClass_().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Synchronize() {
        return (EReference)getClass_().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Comment() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Tuplizer() {
        return (EReference)getClass_().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Id() {
        return (EReference)getClass_().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_CompositeId() {
        return (EReference)getClass_().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Discriminator() {
        return (EReference)getClass_().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_NaturalId() {
        return (EReference)getClass_().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Version() {
        return (EReference)getClass_().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Timestamp() {
        return (EReference)getClass_().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Group() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Property() {
        return (EReference)getClass_().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_ManyToOne() {
        return (EReference)getClass_().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OneToOne() {
        return (EReference)getClass_().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Component() {
        return (EReference)getClass_().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_DynamicComponent() {
        return (EReference)getClass_().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Properties() {
        return (EReference)getClass_().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Any() {
        return (EReference)getClass_().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Map() {
        return (EReference)getClass_().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Set() {
        return (EReference)getClass_().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_List() {
        return (EReference)getClass_().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Bag() {
        return (EReference)getClass_().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Idbag() {
        return (EReference)getClass_().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Array() {
        return (EReference)getClass_().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_PrimitiveArray() {
        return (EReference)getClass_().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Join() {
        return (EReference)getClass_().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Subclass() {
        return (EReference)getClass_().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_JoinedSubclass() {
        return (EReference)getClass_().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_UnionSubclass() {
        return (EReference)getClass_().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Loader() {
        return (EReference)getClass_().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SqlInsert() {
        return (EReference)getClass_().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SqlUpdate() {
        return (EReference)getClass_().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SqlDelete() {
        return (EReference)getClass_().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Filter() {
        return (EReference)getClass_().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Resultset() {
        return (EReference)getClass_().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Group1() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Query() {
        return (EReference)getClass_().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SqlQuery() {
        return (EReference)getClass_().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Abstract() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_BatchSize() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Catalog() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Check() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_DiscriminatorValue() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_DynamicInsert() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_DynamicUpdate() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_EntityName() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Lazy() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Mutable() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Name() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Node() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_OptimisticLock() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Persister() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Polymorphism() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Proxy() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Rowid() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Schema() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_SelectBeforeUpdate() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Subselect1() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Table() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Where() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollection() {
		if (collectionEClass == null) {
			collectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(7);
		}
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Meta() {
        return (EReference)getCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Subselect() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Cache() {
        return (EReference)getCollection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Synchronize() {
        return (EReference)getCollection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Comment() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Key() {
        return (EReference)getCollection().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Element() {
        return (EReference)getCollection().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_OneToMany() {
        return (EReference)getCollection().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_ManyToMany() {
        return (EReference)getCollection().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_CompositeElement() {
        return (EReference)getCollection().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_ManyToAny() {
        return (EReference)getCollection().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Loader() {
        return (EReference)getCollection().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_SqlInsert() {
        return (EReference)getCollection().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_SqlUpdate() {
        return (EReference)getCollection().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_SqlDelete() {
        return (EReference)getCollection().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_SqlDeleteAll() {
        return (EReference)getCollection().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Filter() {
        return (EReference)getCollection().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Access() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_BatchSize() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Cascade() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Catalog() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Check() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_CollectionType() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_EmbedXml() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Fetch() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Inverse() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Lazy() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Mutable() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Name() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Node() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_OptimisticLock() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_OrderBy() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_OuterJoin() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Persister() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Schema() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Subselect1() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Table() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Where() {
        return (EAttribute)getCollection().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionId() {
		if (collectionIdEClass == null) {
			collectionIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(8);
		}
		return collectionIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionId_Meta() {
        return (EReference)getCollectionId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionId_Column() {
        return (EReference)getCollectionId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionId_Generator() {
        return (EReference)getCollectionId().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionId_Column1() {
        return (EAttribute)getCollectionId().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionId_Length() {
        return (EAttribute)getCollectionId().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionId_Type() {
        return (EAttribute)getCollectionId().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		if (columnEClass == null) {
			columnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(9);
		}
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Comment() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Check() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Default() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Index() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Length() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Name() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_NotNull() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Precision() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Scale() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_SqlType() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Unique() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_UniqueKey() {
        return (EAttribute)getColumn().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		if (componentEClass == null) {
			componentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(10);
		}
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Meta() {
        return (EReference)getComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Tuplizer() {
        return (EReference)getComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Parent() {
        return (EReference)getComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Group() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Property() {
        return (EReference)getComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ManyToOne() {
        return (EReference)getComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OneToOne() {
        return (EReference)getComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Component() {
        return (EReference)getComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_DynamicComponent() {
        return (EReference)getComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Any() {
        return (EReference)getComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Map() {
        return (EReference)getComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Set() {
        return (EReference)getComponent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_List() {
        return (EReference)getComponent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Bag() {
        return (EReference)getComponent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Array() {
        return (EReference)getComponent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_PrimitiveArray() {
        return (EReference)getComponent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Access() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Class() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Insert() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Lazy() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Node() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_OptimisticLock() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Unique() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Update() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeElement() {
		if (compositeElementEClass == null) {
			compositeElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(11);
		}
		return compositeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeElement_Meta() {
        return (EReference)getCompositeElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeElement_Parent() {
        return (EReference)getCompositeElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeElement_Group() {
        return (EAttribute)getCompositeElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeElement_Property() {
        return (EReference)getCompositeElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeElement_ManyToOne() {
        return (EReference)getCompositeElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeElement_Any() {
        return (EReference)getCompositeElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeElement_NestedCompositeElement() {
        return (EReference)getCompositeElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeElement_Class() {
        return (EAttribute)getCompositeElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeElement_Node() {
        return (EAttribute)getCompositeElement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeId() {
		if (compositeIdEClass == null) {
			compositeIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(12);
		}
		return compositeIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeId_Meta() {
        return (EReference)getCompositeId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeId_Group() {
        return (EAttribute)getCompositeId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeId_KeyProperty() {
        return (EReference)getCompositeId().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeId_KeyManyToOne() {
        return (EReference)getCompositeId().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeId_Access() {
        return (EAttribute)getCompositeId().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeId_Class() {
        return (EAttribute)getCompositeId().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeId_Mapped() {
        return (EAttribute)getCompositeId().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeId_Name() {
        return (EAttribute)getCompositeId().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeId_Node() {
        return (EAttribute)getCompositeId().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeId_UnsavedValue() {
        return (EAttribute)getCompositeId().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeIndex() {
		if (compositeIndexEClass == null) {
			compositeIndexEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(13);
		}
		return compositeIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeIndex_Group() {
        return (EAttribute)getCompositeIndex().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeIndex_KeyProperty() {
        return (EReference)getCompositeIndex().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeIndex_KeyManyToOne() {
        return (EReference)getCompositeIndex().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeIndex_Class() {
        return (EAttribute)getCompositeIndex().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeMapKey() {
		if (compositeMapKeyEClass == null) {
			compositeMapKeyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(14);
		}
		return compositeMapKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeMapKey_Group() {
        return (EAttribute)getCompositeMapKey().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMapKey_KeyProperty() {
        return (EReference)getCompositeMapKey().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMapKey_KeyManyToOne() {
        return (EReference)getCompositeMapKey().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeMapKey_Class() {
        return (EAttribute)getCompositeMapKey().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseObject() {
		if (databaseObjectEClass == null) {
			databaseObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(15);
		}
		return databaseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseObject_Definition() {
        return (EReference)getDatabaseObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseObject_Create() {
        return (EAttribute)getDatabaseObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseObject_Drop() {
        return (EAttribute)getDatabaseObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseObject_DialectScope() {
        return (EReference)getDatabaseObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		if (definitionEClass == null) {
			definitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(16);
		}
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinition_Class() {
        return (EAttribute)getDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialectScope() {
		if (dialectScopeEClass == null) {
			dialectScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(17);
		}
		return dialectScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialectScope_Value() {
        return (EAttribute)getDialectScope().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialectScope_Name() {
        return (EAttribute)getDialectScope().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscriminator() {
		if (discriminatorEClass == null) {
			discriminatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(18);
		}
		return discriminatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscriminator_Column() {
        return (EReference)getDiscriminator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminator_Formula() {
        return (EAttribute)getDiscriminator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminator_Column1() {
        return (EAttribute)getDiscriminator().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminator_Force() {
        return (EAttribute)getDiscriminator().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminator_Formula1() {
        return (EAttribute)getDiscriminator().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminator_Insert() {
        return (EAttribute)getDiscriminator().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminator_Length() {
        return (EAttribute)getDiscriminator().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminator_NotNull() {
        return (EAttribute)getDiscriminator().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscriminator_Type() {
        return (EAttribute)getDiscriminator().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicComponent() {
		if (dynamicComponentEClass == null) {
			dynamicComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(19);
		}
		return dynamicComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicComponent_Group() {
        return (EAttribute)getDynamicComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_Property() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_ManyToOne() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_OneToOne() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_Component() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_DynamicComponent() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_Any() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_Map() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_Set() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_List() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_Bag() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_Array() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicComponent_PrimitiveArray() {
        return (EReference)getDynamicComponent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicComponent_Access() {
        return (EAttribute)getDynamicComponent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicComponent_Insert() {
        return (EAttribute)getDynamicComponent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicComponent_Name() {
        return (EAttribute)getDynamicComponent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicComponent_Node() {
        return (EAttribute)getDynamicComponent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicComponent_OptimisticLock() {
        return (EAttribute)getDynamicComponent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicComponent_Unique() {
        return (EAttribute)getDynamicComponent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicComponent_Update() {
        return (EAttribute)getDynamicComponent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		if (elementEClass == null) {
			elementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(20);
		}
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Group() {
        return (EAttribute)getElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Column() {
        return (EReference)getElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Formula() {
        return (EAttribute)getElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Column1() {
        return (EAttribute)getElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Formula1() {
        return (EAttribute)getElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Length() {
        return (EAttribute)getElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Node() {
        return (EAttribute)getElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_NotNull() {
        return (EAttribute)getElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Precision() {
        return (EAttribute)getElement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Scale() {
        return (EAttribute)getElement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Type() {
        return (EAttribute)getElement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Unique() {
        return (EAttribute)getElement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		if (filterEClass == null) {
			filterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(27);
		}
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Value() {
        return (EAttribute)getFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Condition() {
        return (EAttribute)getFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Name() {
        return (EAttribute)getFilter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterDef() {
		if (filterDefEClass == null) {
			filterDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(28);
		}
		return filterDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterDef_Mixed() {
        return (EAttribute)getFilterDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterDef_Group() {
        return (EAttribute)getFilterDef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterDef_FilterParam() {
        return (EReference)getFilterDef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterDef_Condition() {
        return (EAttribute)getFilterDef().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterDef_Name() {
        return (EAttribute)getFilterDef().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterParam() {
		if (filterParamEClass == null) {
			filterParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(29);
		}
		return filterParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterParam_Name() {
        return (EAttribute)getFilterParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterParam_Type() {
        return (EAttribute)getFilterParam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerator() {
		if (generatorEClass == null) {
			generatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(36);
		}
		return generatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_Param() {
        return (EReference)getGenerator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerator_Class() {
        return (EAttribute)getGenerator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHibernateMapping() {
		if (hibernateMappingEClass == null) {
			hibernateMappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(37);
		}
		return hibernateMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_Meta() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_Typedef() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_Import() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateMapping_Group() {
        return (EAttribute)getHibernateMapping().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_Class() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_Subclass() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_JoinedSubclass() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_UnionSubclass() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_Resultset() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateMapping_Group1() {
        return (EAttribute)getHibernateMapping().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_Query() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_SqlQuery() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_FilterDef() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateMapping_DatabaseObject() {
        return (EReference)getHibernateMapping().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateMapping_AutoImport() {
        return (EAttribute)getHibernateMapping().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateMapping_Catalog() {
        return (EAttribute)getHibernateMapping().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateMapping_DefaultAccess() {
        return (EAttribute)getHibernateMapping().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateMapping_DefaultCascade() {
        return (EAttribute)getHibernateMapping().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateMapping_DefaultLazy() {
        return (EAttribute)getHibernateMapping().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateMapping_Package() {
        return (EAttribute)getHibernateMapping().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateMapping_Schema() {
        return (EAttribute)getHibernateMapping().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getId() {
		if (idEClass == null) {
			idEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(38);
		}
		return idEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getId_Meta() {
        return (EReference)getId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getId_Column() {
        return (EReference)getId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getId_Type() {
        return (EReference)getId().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getId_Generator() {
        return (EReference)getId().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getId_Access() {
        return (EAttribute)getId().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getId_Column1() {
        return (EAttribute)getId().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getId_Length() {
        return (EAttribute)getId().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getId_Name() {
        return (EAttribute)getId().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getId_Node() {
        return (EAttribute)getId().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getId_Type1() {
        return (EAttribute)getId().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getId_UnsavedValue() {
        return (EAttribute)getId().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdbag() {
		if (idbagEClass == null) {
			idbagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(39);
		}
		return idbagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_Meta() {
        return (EReference)getIdbag().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Subselect() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_Cache() {
        return (EReference)getIdbag().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_Synchronize() {
        return (EReference)getIdbag().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Comment() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_CollectionId() {
        return (EReference)getIdbag().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_Key() {
        return (EReference)getIdbag().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_Element() {
        return (EReference)getIdbag().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_ManyToMany() {
        return (EReference)getIdbag().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_CompositeElement() {
        return (EReference)getIdbag().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_ManyToAny() {
        return (EReference)getIdbag().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_Loader() {
        return (EReference)getIdbag().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_SqlInsert() {
        return (EReference)getIdbag().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_SqlUpdate() {
        return (EReference)getIdbag().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_SqlDelete() {
        return (EReference)getIdbag().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_SqlDeleteAll() {
        return (EReference)getIdbag().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdbag_Filter() {
        return (EReference)getIdbag().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Access() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_BatchSize() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Cascade() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Catalog() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Check() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_CollectionType() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_EmbedXml() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Fetch() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Lazy() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Mutable() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Name() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Node() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_OptimisticLock() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_OrderBy() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_OuterJoin() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Persister() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Schema() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Subselect1() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Table() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdbag_Where() {
        return (EAttribute)getIdbag().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		if (importEClass == null) {
			importEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(40);
		}
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Class() {
        return (EAttribute)getImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Rename() {
        return (EAttribute)getImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndex() {
		if (indexEClass == null) {
			indexEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(43);
		}
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndex_Column() {
        return (EReference)getIndex().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndex_Column1() {
        return (EAttribute)getIndex().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndex_Length() {
        return (EAttribute)getIndex().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndex_Type() {
        return (EAttribute)getIndex().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexManyToAny() {
		if (indexManyToAnyEClass == null) {
			indexManyToAnyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(44);
		}
		return indexManyToAnyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexManyToAny_Column() {
        return (EReference)getIndexManyToAny().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexManyToAny_Column1() {
        return (EReference)getIndexManyToAny().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexManyToAny_IdType() {
        return (EAttribute)getIndexManyToAny().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexManyToAny_MetaType() {
        return (EAttribute)getIndexManyToAny().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexManyToMany() {
		if (indexManyToManyEClass == null) {
			indexManyToManyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(45);
		}
		return indexManyToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexManyToMany_Column() {
        return (EReference)getIndexManyToMany().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexManyToMany_Class() {
        return (EAttribute)getIndexManyToMany().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexManyToMany_Column1() {
        return (EAttribute)getIndexManyToMany().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexManyToMany_EntityName() {
        return (EAttribute)getIndexManyToMany().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexManyToMany_ForeignKey() {
        return (EAttribute)getIndexManyToMany().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		if (joinEClass == null) {
			joinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(46);
		}
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Subselect() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Comment() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_Key() {
        return (EReference)getJoin().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Group() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_Property() {
        return (EReference)getJoin().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_ManyToOne() {
        return (EReference)getJoin().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_Component() {
        return (EReference)getJoin().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_DynamicComponent() {
        return (EReference)getJoin().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_Any() {
        return (EReference)getJoin().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_SqlInsert() {
        return (EReference)getJoin().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_SqlUpdate() {
        return (EReference)getJoin().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_SqlDelete() {
        return (EReference)getJoin().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Catalog() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Fetch() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Inverse() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Optional() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Schema() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Subselect1() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoin_Table() {
        return (EAttribute)getJoin().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinedSubclass() {
		if (joinedSubclassEClass == null) {
			joinedSubclassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(47);
		}
		return joinedSubclassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Meta() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Subselect() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Synchronize() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Comment() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Tuplizer() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Key() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Group() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Property() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_ManyToOne() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_OneToOne() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Component() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_DynamicComponent() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Properties() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Any() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Map() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Set() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_List() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Bag() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Idbag() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Array() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_PrimitiveArray() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_JoinedSubclass() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Loader() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_SqlInsert() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_SqlUpdate() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_SqlDelete() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Resultset() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Group1() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_Query() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedSubclass_SqlQuery() {
        return (EReference)getJoinedSubclass().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Abstract() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_BatchSize() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Catalog() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Check() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_DynamicInsert() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_DynamicUpdate() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_EntityName() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Extends() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Lazy() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Name() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Node() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Persister() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Proxy() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Schema() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_SelectBeforeUpdate() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Subselect1() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinedSubclass_Table() {
        return (EAttribute)getJoinedSubclass().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKey() {
		if (keyEClass == null) {
			keyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(48);
		}
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKey_Column() {
        return (EReference)getKey().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_Column1() {
        return (EAttribute)getKey().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_ForeignKey() {
        return (EAttribute)getKey().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_NotNull() {
        return (EAttribute)getKey().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_OnDelete() {
        return (EAttribute)getKey().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_PropertyRef() {
        return (EAttribute)getKey().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_Unique() {
        return (EAttribute)getKey().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_Update() {
        return (EAttribute)getKey().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyManyToOne() {
		if (keyManyToOneEClass == null) {
			keyManyToOneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(49);
		}
		return keyManyToOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyManyToOne_Meta() {
        return (EReference)getKeyManyToOne().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyManyToOne_Column() {
        return (EReference)getKeyManyToOne().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyManyToOne_Access() {
        return (EAttribute)getKeyManyToOne().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyManyToOne_Class() {
        return (EAttribute)getKeyManyToOne().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyManyToOne_Column1() {
        return (EAttribute)getKeyManyToOne().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyManyToOne_EntityName() {
        return (EAttribute)getKeyManyToOne().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyManyToOne_ForeignKey() {
        return (EAttribute)getKeyManyToOne().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyManyToOne_Lazy() {
        return (EAttribute)getKeyManyToOne().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyManyToOne_Name() {
        return (EAttribute)getKeyManyToOne().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyProperty() {
		if (keyPropertyEClass == null) {
			keyPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(50);
		}
		return keyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyProperty_Meta() {
        return (EReference)getKeyProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyProperty_Column() {
        return (EReference)getKeyProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyProperty_Type() {
        return (EReference)getKeyProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyProperty_Access() {
        return (EAttribute)getKeyProperty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyProperty_Column1() {
        return (EAttribute)getKeyProperty().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyProperty_Length() {
        return (EAttribute)getKeyProperty().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyProperty_Name() {
        return (EAttribute)getKeyProperty().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyProperty_Node() {
        return (EAttribute)getKeyProperty().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyProperty_Type1() {
        return (EAttribute)getKeyProperty().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		if (listEClass == null) {
			listEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(57);
		}
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Meta() {
        return (EReference)getList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Subselect() {
        return (EAttribute)getList().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Cache() {
        return (EReference)getList().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Synchronize() {
        return (EReference)getList().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Comment() {
        return (EAttribute)getList().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Key() {
        return (EReference)getList().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Index() {
        return (EReference)getList().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_ListIndex() {
        return (EReference)getList().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Element() {
        return (EReference)getList().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_OneToMany() {
        return (EReference)getList().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_ManyToMany() {
        return (EReference)getList().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_CompositeElement() {
        return (EReference)getList().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_ManyToAny() {
        return (EReference)getList().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Loader() {
        return (EReference)getList().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_SqlInsert() {
        return (EReference)getList().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_SqlUpdate() {
        return (EReference)getList().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_SqlDelete() {
        return (EReference)getList().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_SqlDeleteAll() {
        return (EReference)getList().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Filter() {
        return (EReference)getList().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Access() {
        return (EAttribute)getList().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_BatchSize() {
        return (EAttribute)getList().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Cascade() {
        return (EAttribute)getList().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Catalog() {
        return (EAttribute)getList().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Check() {
        return (EAttribute)getList().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_CollectionType() {
        return (EAttribute)getList().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_EmbedXml() {
        return (EAttribute)getList().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Fetch() {
        return (EAttribute)getList().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Inverse() {
        return (EAttribute)getList().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Lazy() {
        return (EAttribute)getList().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Mutable() {
        return (EAttribute)getList().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Name() {
        return (EAttribute)getList().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Node() {
        return (EAttribute)getList().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_OptimisticLock() {
        return (EAttribute)getList().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_OuterJoin() {
        return (EAttribute)getList().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Persister() {
        return (EAttribute)getList().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Schema() {
        return (EAttribute)getList().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Subselect1() {
        return (EAttribute)getList().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Table() {
        return (EAttribute)getList().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_Where() {
        return (EAttribute)getList().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListIndex() {
		if (listIndexEClass == null) {
			listIndexEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(58);
		}
		return listIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListIndex_Column() {
        return (EReference)getListIndex().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListIndex_Base() {
        return (EAttribute)getListIndex().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListIndex_Column1() {
        return (EAttribute)getListIndex().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadCollection() {
		if (loadCollectionEClass == null) {
			loadCollectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(59);
		}
		return loadCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadCollection_Group() {
        return (EAttribute)getLoadCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadCollection_ReturnProperty() {
        return (EReference)getLoadCollection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadCollection_Alias() {
        return (EAttribute)getLoadCollection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadCollection_LockMode() {
        return (EAttribute)getLoadCollection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadCollection_Role() {
        return (EAttribute)getLoadCollection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoader() {
		if (loaderEClass == null) {
			loaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(60);
		}
		return loaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoader_QueryRef() {
        return (EAttribute)getLoader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyToAny() {
		if (manyToAnyEClass == null) {
			manyToAnyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(63);
		}
		return manyToAnyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToAny_MetaValue() {
        return (EReference)getManyToAny().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToAny_Column() {
        return (EReference)getManyToAny().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToAny_Column1() {
        return (EReference)getManyToAny().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToAny_IdType() {
        return (EAttribute)getManyToAny().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToAny_MetaType() {
        return (EAttribute)getManyToAny().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyToMany() {
		if (manyToManyEClass == null) {
			manyToManyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(64);
		}
		return manyToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToMany_Meta() {
        return (EReference)getManyToMany().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Group() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToMany_Column() {
        return (EReference)getManyToMany().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Formula() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToMany_Filter() {
        return (EReference)getManyToMany().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Class() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Column1() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_EmbedXml() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_EntityName() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Fetch() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_ForeignKey() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Formula1() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Lazy() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Node() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_NotFound() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_OuterJoin() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_PropertyRef() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Unique() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToMany_Where() {
        return (EAttribute)getManyToMany().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyToOne() {
		if (manyToOneEClass == null) {
			manyToOneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(65);
		}
		return manyToOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToOne_Meta() {
        return (EReference)getManyToOne().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Group() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToOne_Column() {
        return (EReference)getManyToOne().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Formula() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Access() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Cascade() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Class() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Column1() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_EmbedXml() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_EntityName() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Fetch() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_ForeignKey() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Formula1() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Index() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Insert() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Lazy() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Name() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Node() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_NotFound() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_NotNull() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_OptimisticLock() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_OuterJoin() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_PropertyRef() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Unique() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_UniqueKey() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOne_Update() {
        return (EAttribute)getManyToOne().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMap() {
		if (mapEClass == null) {
			mapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(66);
		}
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Meta() {
        return (EReference)getMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Subselect() {
        return (EAttribute)getMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Cache() {
        return (EReference)getMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Synchronize() {
        return (EReference)getMap().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Comment() {
        return (EAttribute)getMap().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Key() {
        return (EReference)getMap().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_MapKey() {
        return (EReference)getMap().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_CompositeMapKey() {
        return (EReference)getMap().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_MapKeyManyToMany() {
        return (EReference)getMap().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Index() {
        return (EReference)getMap().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_CompositeIndex() {
        return (EReference)getMap().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_IndexManyToMany() {
        return (EReference)getMap().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_IndexManyToAny() {
        return (EReference)getMap().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Element() {
        return (EReference)getMap().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_OneToMany() {
        return (EReference)getMap().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_ManyToMany() {
        return (EReference)getMap().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_CompositeElement() {
        return (EReference)getMap().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_ManyToAny() {
        return (EReference)getMap().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Loader() {
        return (EReference)getMap().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_SqlInsert() {
        return (EReference)getMap().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_SqlUpdate() {
        return (EReference)getMap().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_SqlDelete() {
        return (EReference)getMap().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_SqlDeleteAll() {
        return (EReference)getMap().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Filter() {
        return (EReference)getMap().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Access() {
        return (EAttribute)getMap().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_BatchSize() {
        return (EAttribute)getMap().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Cascade() {
        return (EAttribute)getMap().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Catalog() {
        return (EAttribute)getMap().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Check() {
        return (EAttribute)getMap().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_CollectionType() {
        return (EAttribute)getMap().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_EmbedXml() {
        return (EAttribute)getMap().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Fetch() {
        return (EAttribute)getMap().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Inverse() {
        return (EAttribute)getMap().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Lazy() {
        return (EAttribute)getMap().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Mutable() {
        return (EAttribute)getMap().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Name() {
        return (EAttribute)getMap().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Node() {
        return (EAttribute)getMap().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_OptimisticLock() {
        return (EAttribute)getMap().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_OrderBy() {
        return (EAttribute)getMap().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_OuterJoin() {
        return (EAttribute)getMap().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Persister() {
        return (EAttribute)getMap().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Schema() {
        return (EAttribute)getMap().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Sort() {
        return (EAttribute)getMap().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Subselect1() {
        return (EAttribute)getMap().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Table() {
        return (EAttribute)getMap().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Where() {
        return (EAttribute)getMap().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapKey() {
		if (mapKeyEClass == null) {
			mapKeyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(67);
		}
		return mapKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKey_Group() {
        return (EAttribute)getMapKey().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapKey_Column() {
        return (EReference)getMapKey().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKey_Formula() {
        return (EAttribute)getMapKey().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKey_Column1() {
        return (EAttribute)getMapKey().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKey_Formula1() {
        return (EAttribute)getMapKey().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKey_Length() {
        return (EAttribute)getMapKey().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKey_Node() {
        return (EAttribute)getMapKey().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKey_Type() {
        return (EAttribute)getMapKey().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapKeyManyToMany() {
		if (mapKeyManyToManyEClass == null) {
			mapKeyManyToManyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(68);
		}
		return mapKeyManyToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKeyManyToMany_Group() {
        return (EAttribute)getMapKeyManyToMany().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapKeyManyToMany_Column() {
        return (EReference)getMapKeyManyToMany().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKeyManyToMany_Formula() {
        return (EAttribute)getMapKeyManyToMany().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKeyManyToMany_Class() {
        return (EAttribute)getMapKeyManyToMany().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKeyManyToMany_Column1() {
        return (EAttribute)getMapKeyManyToMany().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKeyManyToMany_EntityName() {
        return (EAttribute)getMapKeyManyToMany().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKeyManyToMany_ForeignKey() {
        return (EAttribute)getMapKeyManyToMany().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapKeyManyToMany_Formula1() {
        return (EAttribute)getMapKeyManyToMany().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeta() {
		if (metaEClass == null) {
			metaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(69);
		}
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Value() {
        return (EAttribute)getMeta().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Attribute() {
        return (EAttribute)getMeta().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Inherit() {
        return (EAttribute)getMeta().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaValue() {
		if (metaValueEClass == null) {
			metaValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(70);
		}
		return metaValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaValue_Class() {
        return (EAttribute)getMetaValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaValue_Value() {
        return (EAttribute)getMetaValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalId() {
		if (naturalIdEClass == null) {
			naturalIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(71);
		}
		return naturalIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNaturalId_Group() {
        return (EAttribute)getNaturalId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNaturalId_Property() {
        return (EReference)getNaturalId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNaturalId_ManyToOne() {
        return (EReference)getNaturalId().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNaturalId_Component() {
        return (EReference)getNaturalId().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNaturalId_DynamicComponent() {
        return (EReference)getNaturalId().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNaturalId_Any() {
        return (EReference)getNaturalId().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNaturalId_Mutable() {
        return (EAttribute)getNaturalId().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedCompositeElement() {
		if (nestedCompositeElementEClass == null) {
			nestedCompositeElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(72);
		}
		return nestedCompositeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedCompositeElement_Parent() {
        return (EReference)getNestedCompositeElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedCompositeElement_Group() {
        return (EAttribute)getNestedCompositeElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedCompositeElement_Property() {
        return (EReference)getNestedCompositeElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedCompositeElement_ManyToOne() {
        return (EReference)getNestedCompositeElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedCompositeElement_Any() {
        return (EReference)getNestedCompositeElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedCompositeElement_NestedCompositeElement() {
        return (EReference)getNestedCompositeElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedCompositeElement_Access() {
        return (EAttribute)getNestedCompositeElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedCompositeElement_Class() {
        return (EAttribute)getNestedCompositeElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedCompositeElement_Name() {
        return (EAttribute)getNestedCompositeElement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedCompositeElement_Node() {
        return (EAttribute)getNestedCompositeElement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToMany() {
		if (oneToManyEClass == null) {
			oneToManyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(77);
		}
		return oneToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_Class() {
        return (EAttribute)getOneToMany().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_EmbedXml() {
        return (EAttribute)getOneToMany().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_EntityName() {
        return (EAttribute)getOneToMany().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_Node() {
        return (EAttribute)getOneToMany().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToMany_NotFound() {
        return (EAttribute)getOneToMany().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToOne() {
		if (oneToOneEClass == null) {
			oneToOneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(78);
		}
		return oneToOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToOne_Meta() {
        return (EReference)getOneToOne().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Formula() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Access() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Cascade() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Class() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Constrained() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_EmbedXml() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_EntityName() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Fetch() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_ForeignKey() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Formula1() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Lazy() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Name() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_Node() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_OuterJoin() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOne_PropertyRef() {
        return (EAttribute)getOneToOne().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParam() {
		if (paramEClass == null) {
			paramEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(83);
		}
		return paramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParam_Value() {
        return (EAttribute)getParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParam_Name() {
        return (EAttribute)getParam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParent() {
		if (parentEClass == null) {
			parentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(84);
		}
		return parentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParent_Name() {
        return (EAttribute)getParent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveArray() {
		if (primitiveArrayEClass == null) {
			primitiveArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(87);
		}
		return primitiveArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_Meta() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Subselect() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_Cache() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_Synchronize() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Comment() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_Key() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_Index() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_ListIndex() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_Element() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_Loader() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_SqlInsert() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_SqlUpdate() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_SqlDelete() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveArray_SqlDeleteAll() {
        return (EReference)getPrimitiveArray().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Access() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_BatchSize() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Catalog() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Check() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_CollectionType() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_EmbedXml() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Fetch() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Mutable() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Name() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Node() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_OptimisticLock() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_OuterJoin() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Persister() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Schema() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Subselect1() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Table() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveArray_Where() {
        return (EAttribute)getPrimitiveArray().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		if (propertiesEClass == null) {
			propertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(88);
		}
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperties_Group() {
        return (EAttribute)getProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Property() {
        return (EReference)getProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_ManyToOne() {
        return (EReference)getProperties().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Component() {
        return (EReference)getProperties().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_DynamicComponent() {
        return (EReference)getProperties().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperties_Insert() {
        return (EAttribute)getProperties().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperties_Name() {
        return (EAttribute)getProperties().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperties_Node() {
        return (EAttribute)getProperties().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperties_OptimisticLock() {
        return (EAttribute)getProperties().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperties_Unique() {
        return (EAttribute)getProperties().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperties_Update() {
        return (EAttribute)getProperties().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		if (propertyEClass == null) {
			propertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(89);
		}
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Meta() {
        return (EReference)getProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Group() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Column() {
        return (EReference)getProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Formula() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Type() {
        return (EReference)getProperty().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Access() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Column1() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Formula1() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Generated() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Index() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Insert() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Lazy() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Length() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Node() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_NotNull() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_OptimisticLock() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Precision() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Scale() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type1() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Unique() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_UniqueKey() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Update() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		if (queryEClass == null) {
			queryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(90);
		}
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Mixed() {
        return (EAttribute)getQuery().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Group() {
        return (EAttribute)getQuery().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_QueryParam() {
        return (EReference)getQuery().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Cacheable() {
        return (EAttribute)getQuery().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_CacheMode() {
        return (EAttribute)getQuery().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_CacheRegion() {
        return (EAttribute)getQuery().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Comment() {
        return (EAttribute)getQuery().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_FetchSize() {
        return (EAttribute)getQuery().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_FlushMode() {
        return (EAttribute)getQuery().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Name() {
        return (EAttribute)getQuery().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_ReadOnly() {
        return (EAttribute)getQuery().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Timeout() {
        return (EAttribute)getQuery().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParam() {
		if (queryParamEClass == null) {
			queryParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(91);
		}
		return queryParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_Name() {
        return (EAttribute)getQueryParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_Type() {
        return (EAttribute)getQueryParam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultset() {
		if (resultsetEClass == null) {
			resultsetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(92);
		}
		return resultsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultset_Group() {
        return (EAttribute)getResultset().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultset_ReturnScalar() {
        return (EReference)getResultset().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultset_Return() {
        return (EReference)getResultset().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultset_ReturnJoin() {
        return (EReference)getResultset().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultset_LoadCollection() {
        return (EReference)getResultset().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultset_Name() {
        return (EAttribute)getResultset().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		if (returnEClass == null) {
			returnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(93);
		}
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturn_Group() {
        return (EAttribute)getReturn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_ReturnDiscriminator() {
        return (EReference)getReturn().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_ReturnProperty() {
        return (EReference)getReturn().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturn_Alias() {
        return (EAttribute)getReturn().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturn_Class() {
        return (EAttribute)getReturn().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturn_EntityName() {
        return (EAttribute)getReturn().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturn_LockMode() {
        return (EAttribute)getReturn().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnColumn() {
		if (returnColumnEClass == null) {
			returnColumnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(94);
		}
		return returnColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnColumn_Name() {
        return (EAttribute)getReturnColumn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnDiscriminator() {
		if (returnDiscriminatorEClass == null) {
			returnDiscriminatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(95);
		}
		return returnDiscriminatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnDiscriminator_Column() {
        return (EAttribute)getReturnDiscriminator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnJoin() {
		if (returnJoinEClass == null) {
			returnJoinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(96);
		}
		return returnJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnJoin_Group() {
        return (EAttribute)getReturnJoin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnJoin_ReturnProperty() {
        return (EReference)getReturnJoin().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnJoin_Alias() {
        return (EAttribute)getReturnJoin().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnJoin_LockMode() {
        return (EAttribute)getReturnJoin().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnJoin_Property() {
        return (EAttribute)getReturnJoin().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnProperty() {
		if (returnPropertyEClass == null) {
			returnPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(97);
		}
		return returnPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnProperty_ReturnColumn() {
        return (EReference)getReturnProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnProperty_Column() {
        return (EAttribute)getReturnProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnProperty_Name() {
        return (EAttribute)getReturnProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnScalar() {
		if (returnScalarEClass == null) {
			returnScalarEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(98);
		}
		return returnScalarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnScalar_Column() {
        return (EAttribute)getReturnScalar().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnScalar_Type() {
        return (EAttribute)getReturnScalar().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet() {
		if (setEClass == null) {
			setEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(99);
		}
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Meta() {
        return (EReference)getSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Subselect() {
        return (EAttribute)getSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Cache() {
        return (EReference)getSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Synchronize() {
        return (EReference)getSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Comment() {
        return (EAttribute)getSet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Key() {
        return (EReference)getSet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Element() {
        return (EReference)getSet().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_OneToMany() {
        return (EReference)getSet().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_ManyToMany() {
        return (EReference)getSet().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_CompositeElement() {
        return (EReference)getSet().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_ManyToAny() {
        return (EReference)getSet().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Loader() {
        return (EReference)getSet().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_SqlInsert() {
        return (EReference)getSet().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_SqlUpdate() {
        return (EReference)getSet().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_SqlDelete() {
        return (EReference)getSet().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_SqlDeleteAll() {
        return (EReference)getSet().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Filter() {
        return (EReference)getSet().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Access() {
        return (EAttribute)getSet().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_BatchSize() {
        return (EAttribute)getSet().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Cascade() {
        return (EAttribute)getSet().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Catalog() {
        return (EAttribute)getSet().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Check() {
        return (EAttribute)getSet().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_CollectionType() {
        return (EAttribute)getSet().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_EmbedXml() {
        return (EAttribute)getSet().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Fetch() {
        return (EAttribute)getSet().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Inverse() {
        return (EAttribute)getSet().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Lazy() {
        return (EAttribute)getSet().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Mutable() {
        return (EAttribute)getSet().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Name() {
        return (EAttribute)getSet().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Node() {
        return (EAttribute)getSet().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_OptimisticLock() {
        return (EAttribute)getSet().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_OrderBy() {
        return (EAttribute)getSet().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_OuterJoin() {
        return (EAttribute)getSet().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Persister() {
        return (EAttribute)getSet().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Schema() {
        return (EAttribute)getSet().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Sort() {
        return (EAttribute)getSet().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Subselect1() {
        return (EAttribute)getSet().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Table() {
        return (EAttribute)getSet().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Where() {
        return (EAttribute)getSet().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqlDelete() {
		if (sqlDeleteEClass == null) {
			sqlDeleteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(102);
		}
		return sqlDeleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlDelete_Value() {
        return (EAttribute)getSqlDelete().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlDelete_Callable() {
        return (EAttribute)getSqlDelete().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqlDeleteAll() {
		if (sqlDeleteAllEClass == null) {
			sqlDeleteAllEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(103);
		}
		return sqlDeleteAllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlDeleteAll_Value() {
        return (EAttribute)getSqlDeleteAll().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlDeleteAll_Callable() {
        return (EAttribute)getSqlDeleteAll().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqlInsert() {
		if (sqlInsertEClass == null) {
			sqlInsertEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(104);
		}
		return sqlInsertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlInsert_Value() {
        return (EAttribute)getSqlInsert().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlInsert_Callable() {
        return (EAttribute)getSqlInsert().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqlQuery() {
		if (sqlQueryEClass == null) {
			sqlQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(105);
		}
		return sqlQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_Mixed() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_Group() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlQuery_ReturnScalar() {
        return (EReference)getSqlQuery().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlQuery_Return() {
        return (EReference)getSqlQuery().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlQuery_ReturnJoin() {
        return (EReference)getSqlQuery().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlQuery_LoadCollection() {
        return (EReference)getSqlQuery().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlQuery_Synchronize() {
        return (EReference)getSqlQuery().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqlQuery_QueryParam() {
        return (EReference)getSqlQuery().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_Cacheable() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_CacheMode() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_CacheRegion() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_Callable() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_Comment() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_FetchSize() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_FlushMode() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_Name() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_ReadOnly() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_ResultsetRef() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlQuery_Timeout() {
        return (EAttribute)getSqlQuery().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqlUpdate() {
		if (sqlUpdateEClass == null) {
			sqlUpdateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(106);
		}
		return sqlUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlUpdate_Value() {
        return (EAttribute)getSqlUpdate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqlUpdate_Callable() {
        return (EAttribute)getSqlUpdate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubclass() {
		if (subclassEClass == null) {
			subclassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(107);
		}
		return subclassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Meta() {
        return (EReference)getSubclass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Tuplizer() {
        return (EReference)getSubclass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Synchronize() {
        return (EReference)getSubclass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_Group() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Property() {
        return (EReference)getSubclass().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_ManyToOne() {
        return (EReference)getSubclass().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_OneToOne() {
        return (EReference)getSubclass().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Component() {
        return (EReference)getSubclass().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_DynamicComponent() {
        return (EReference)getSubclass().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Any() {
        return (EReference)getSubclass().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Map() {
        return (EReference)getSubclass().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Set() {
        return (EReference)getSubclass().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_List() {
        return (EReference)getSubclass().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Bag() {
        return (EReference)getSubclass().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Idbag() {
        return (EReference)getSubclass().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Array() {
        return (EReference)getSubclass().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_PrimitiveArray() {
        return (EReference)getSubclass().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Join() {
        return (EReference)getSubclass().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Subclass() {
        return (EReference)getSubclass().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Loader() {
        return (EReference)getSubclass().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_SqlInsert() {
        return (EReference)getSubclass().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_SqlUpdate() {
        return (EReference)getSubclass().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_SqlDelete() {
        return (EReference)getSubclass().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Resultset() {
        return (EReference)getSubclass().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_Group1() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_Query() {
        return (EReference)getSubclass().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubclass_SqlQuery() {
        return (EReference)getSubclass().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_Abstract() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_BatchSize() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_DiscriminatorValue() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_DynamicInsert() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_DynamicUpdate() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_EntityName() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_Extends() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_Lazy() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_Name() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_Node() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_Persister() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_Proxy() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubclass_SelectBeforeUpdate() {
        return (EAttribute)getSubclass().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronize() {
		if (synchronizeEClass == null) {
			synchronizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(108);
		}
		return synchronizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronize_Table() {
        return (EAttribute)getSynchronize().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimestamp() {
		if (timestampEClass == null) {
			timestampEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(109);
		}
		return timestampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimestamp_Meta() {
        return (EReference)getTimestamp().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimestamp_Access() {
        return (EAttribute)getTimestamp().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimestamp_Column() {
        return (EAttribute)getTimestamp().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimestamp_Generated() {
        return (EAttribute)getTimestamp().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimestamp_Name() {
        return (EAttribute)getTimestamp().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimestamp_Node() {
        return (EAttribute)getTimestamp().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimestamp_Source() {
        return (EAttribute)getTimestamp().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimestamp_UnsavedValue() {
        return (EAttribute)getTimestamp().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuplizer() {
		if (tuplizerEClass == null) {
			tuplizerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(110);
		}
		return tuplizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuplizer_Class() {
        return (EAttribute)getTuplizer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuplizer_EntityMode() {
        return (EAttribute)getTuplizer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (typeEClass == null) {
			typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(111);
		}
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Param() {
        return (EReference)getType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
        return (EAttribute)getType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedef() {
		if (typedefEClass == null) {
			typedefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(112);
		}
		return typedefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedef_Param() {
        return (EReference)getTypedef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedef_Class() {
        return (EAttribute)getTypedef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedef_Name() {
        return (EAttribute)getTypedef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionSubclass() {
		if (unionSubclassEClass == null) {
			unionSubclassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(113);
		}
		return unionSubclassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Meta() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Subselect() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Synchronize() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Comment() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Tuplizer() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Group() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Property() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_ManyToOne() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_OneToOne() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Component() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_DynamicComponent() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Properties() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Any() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Map() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Set() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_List() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Bag() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Idbag() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Array() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_PrimitiveArray() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_UnionSubclass() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Loader() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_SqlInsert() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_SqlUpdate() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_SqlDelete() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Resultset() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Group1() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_Query() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionSubclass_SqlQuery() {
        return (EReference)getUnionSubclass().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Abstract() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_BatchSize() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Catalog() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Check() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_DynamicInsert() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_DynamicUpdate() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_EntityName() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Extends() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Lazy() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Name() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Node() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Persister() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Proxy() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Schema() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_SelectBeforeUpdate() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Subselect1() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionSubclass_Table() {
        return (EAttribute)getUnionSubclass().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		if (versionEClass == null) {
			versionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(122);
		}
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Meta() {
        return (EReference)getVersion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Column() {
        return (EReference)getVersion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Access() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Column1() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Generated() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Insert() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Name() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Node() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Type() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_UnsavedValue() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCachemode() {
		if (cachemodeEEnum == null) {
			cachemodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(4);
		}
		return cachemodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityModeType() {
		if (entityModeTypeEEnum == null) {
			entityModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(21);
		}
		return entityModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFetch() {
		if (fetchEEnum == null) {
			fetchEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(23);
		}
		return fetchEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFetchJoinSelect() {
		if (fetchJoinSelectEEnum == null) {
			fetchJoinSelectEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(24);
		}
		return fetchJoinSelectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlushmode() {
		if (flushmodeEEnum == null) {
			flushmodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(30);
		}
		return flushmodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenerated() {
		if (generatedEEnum == null) {
			generatedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(32);
		}
		return generatedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeneratedNeverAlways() {
		if (generatedNeverAlwaysEEnum == null) {
			generatedNeverAlwaysEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(33);
		}
		return generatedNeverAlwaysEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIncludeType() {
		if (includeTypeEEnum == null) {
			includeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(41);
		}
		return includeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLazy() {
		if (lazyEEnum == null) {
			lazyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(51);
		}
		return lazyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLazyFalseProxy() {
		if (lazyFalseProxyEEnum == null) {
			lazyFalseProxyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(52);
		}
		return lazyFalseProxyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLazyTrueFalseExtra() {
		if (lazyTrueFalseExtraEEnum == null) {
			lazyTrueFalseExtraEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(55);
		}
		return lazyTrueFalseExtraEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLockmode() {
		if (lockmodeEEnum == null) {
			lockmodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(61);
		}
		return lockmodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNotfound() {
		if (notfoundEEnum == null) {
			notfoundEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(73);
		}
		return notfoundEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOnDeleteType() {
		if (onDeleteTypeEEnum == null) {
			onDeleteTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(75);
		}
		return onDeleteTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOptimisticLockType() {
		if (optimisticLockTypeEEnum == null) {
			optimisticLockTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(79);
		}
		return optimisticLockTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOuterjoin() {
		if (outerjoinEEnum == null) {
			outerjoinEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(81);
		}
		return outerjoinEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPolymorphismType() {
		if (polymorphismTypeEEnum == null) {
			polymorphismTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(85);
		}
		return polymorphismTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceType() {
		if (sourceTypeEEnum == null) {
			sourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(100);
		}
		return sourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnsavedValueType() {
		if (unsavedValueTypeEEnum == null) {
			unsavedValueTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(114);
		}
		return unsavedValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnsavedValueType1() {
		if (unsavedValueType1EEnum == null) {
			unsavedValueType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(115);
		}
		return unsavedValueType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnsavedValueType2() {
		if (unsavedValueType2EEnum == null) {
			unsavedValueType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(116);
		}
		return unsavedValueType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUsageType() {
		if (usageTypeEEnum == null) {
			usageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(120);
		}
		return usageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCachemodeObject() {
		if (cachemodeObjectEDataType == null) {
			cachemodeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(5);
		}
		return cachemodeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEntityModeTypeObject() {
		if (entityModeTypeObjectEDataType == null) {
			entityModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(22);
		}
		return entityModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFetchJoinSelectObject() {
		if (fetchJoinSelectObjectEDataType == null) {
			fetchJoinSelectObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(25);
		}
		return fetchJoinSelectObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFetchObject() {
		if (fetchObjectEDataType == null) {
			fetchObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(26);
		}
		return fetchObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFlushmodeObject() {
		if (flushmodeObjectEDataType == null) {
			flushmodeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(31);
		}
		return flushmodeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGeneratedNeverAlwaysObject() {
		if (generatedNeverAlwaysObjectEDataType == null) {
			generatedNeverAlwaysObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(34);
		}
		return generatedNeverAlwaysObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGeneratedObject() {
		if (generatedObjectEDataType == null) {
			generatedObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(35);
		}
		return generatedObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIncludeTypeObject() {
		if (includeTypeObjectEDataType == null) {
			includeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(42);
		}
		return includeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLazyFalseProxyObject() {
		if (lazyFalseProxyObjectEDataType == null) {
			lazyFalseProxyObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(53);
		}
		return lazyFalseProxyObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLazyObject() {
		if (lazyObjectEDataType == null) {
			lazyObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(54);
		}
		return lazyObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLazyTrueFalseExtraObject() {
		if (lazyTrueFalseExtraObjectEDataType == null) {
			lazyTrueFalseExtraObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(56);
		}
		return lazyTrueFalseExtraObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLockmodeObject() {
		if (lockmodeObjectEDataType == null) {
			lockmodeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(62);
		}
		return lockmodeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNotfoundObject() {
		if (notfoundObjectEDataType == null) {
			notfoundObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(74);
		}
		return notfoundObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOnDeleteTypeObject() {
		if (onDeleteTypeObjectEDataType == null) {
			onDeleteTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(76);
		}
		return onDeleteTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOptimisticLockTypeObject() {
		if (optimisticLockTypeObjectEDataType == null) {
			optimisticLockTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(80);
		}
		return optimisticLockTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOuterjoinObject() {
		if (outerjoinObjectEDataType == null) {
			outerjoinObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(82);
		}
		return outerjoinObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPolymorphismTypeObject() {
		if (polymorphismTypeObjectEDataType == null) {
			polymorphismTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(86);
		}
		return polymorphismTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSourceTypeObject() {
		if (sourceTypeObjectEDataType == null) {
			sourceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(101);
		}
		return sourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnsavedValueTypeObject() {
		if (unsavedValueTypeObjectEDataType == null) {
			unsavedValueTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(117);
		}
		return unsavedValueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnsavedValueTypeObject1() {
		if (unsavedValueTypeObject1EDataType == null) {
			unsavedValueTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(118);
		}
		return unsavedValueTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnsavedValueTypeObject2() {
		if (unsavedValueTypeObject2EDataType == null) {
			unsavedValueTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(119);
		}
		return unsavedValueTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUsageTypeObject() {
		if (usageTypeObjectEDataType == null) {
			usageTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(Hbm30Package.eNS_URI).getEClassifiers().get(121);
		}
		return usageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hbm30Factory getHbm30Factory() {
		return (Hbm30Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.emf.teneo.db2m.hbm30." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Hbm30PackageImpl
