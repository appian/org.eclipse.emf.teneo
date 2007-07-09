/**
 * <copyright>
 * </copyright>
 *
 * $Id: AppleFactoryImpl.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package tc.apple.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tc.apple.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppleFactoryImpl extends EFactoryImpl implements AppleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppleFactory init() {
		try {
			AppleFactory theAppleFactory = (AppleFactory)EPackage.Registry.INSTANCE.getEFactory("tc-apple.xsd"); 
			if (theAppleFactory != null) {
				return theAppleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AppleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApplePackage.APPLES_ROOT: return createApplesRoot();
			case ApplePackage.APPLE_STEM: return createAppleStem();
			case ApplePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ApplePackage.FRUIT: return createFruit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplesRoot createApplesRoot() {
		ApplesRootImpl applesRoot = new ApplesRootImpl();
		return applesRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppleStem createAppleStem() {
		AppleStemImpl appleStem = new AppleStemImpl();
		return appleStem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fruit createFruit() {
		FruitImpl fruit = new FruitImpl();
		return fruit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplePackage getApplePackage() {
		return (ApplePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApplePackage getPackage() {
		return ApplePackage.eINSTANCE;
	}

} //AppleFactoryImpl
