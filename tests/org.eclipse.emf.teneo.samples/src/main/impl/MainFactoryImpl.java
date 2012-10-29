/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainFactoryImpl.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
 */
package main.impl;

import main.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class MainFactoryImpl extends EFactoryImpl implements MainFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static MainFactory init() {
		try {
			MainFactory theMainFactory = (MainFactory) EPackage.Registry.INSTANCE
					.getEFactory("http:///main.ecore");
			if (theMainFactory != null) {
				return theMainFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MainPackage.CHILD_OBJECT2:
			return createChildObject2();
		case MainPackage.CHILD_OBJECT1:
			return createChildObject1();
		case MainPackage.BASE_OBJECT:
			return createBaseObject();
		case MainPackage.BASE_GROUP:
			return createBaseGroup();
		case MainPackage.BASE_COMPONENT:
			return createBaseComponent();
		case MainPackage.CHILD_OBJECT3:
			return createChildObject3();
		case MainPackage.CHILD_OBJECT4:
			return createChildObject4();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChildObject2 createChildObject2() {
		ChildObject2Impl childObject2 = new ChildObject2Impl();
		return childObject2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChildObject1 createChildObject1() {
		ChildObject1Impl childObject1 = new ChildObject1Impl();
		return childObject1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BaseObject createBaseObject() {
		BaseObjectImpl baseObject = new BaseObjectImpl();
		return baseObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BaseGroup createBaseGroup() {
		BaseGroupImpl baseGroup = new BaseGroupImpl();
		return baseGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BaseComponent createBaseComponent() {
		BaseComponentImpl baseComponent = new BaseComponentImpl();
		return baseComponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChildObject3 createChildObject3() {
		ChildObject3Impl childObject3 = new ChildObject3Impl();
		return childObject3;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChildObject4 createChildObject4() {
		ChildObject4Impl childObject4 = new ChildObject4Impl();
		return childObject4;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MainPackage getMainPackage() {
		return (MainPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	public static MainPackage getPackage() {
		return MainPackage.eINSTANCE;
	}

} // MainFactoryImpl
