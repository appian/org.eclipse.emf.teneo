/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainPackage.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
 */
package main;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see main.MainFactory
 * @model kind="package"
 * @generated
 */
public interface MainPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "main";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http:///main.ecore";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "main";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	MainPackage eINSTANCE = main.impl.MainPackageImpl.init();

	/**
	 * The meta object id for the '{@link main.impl.BaseComponentImpl <em>Base Component</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see main.impl.BaseComponentImpl
	 * @see main.impl.MainPackageImpl#getBaseComponent()
	 * @generated
	 */
	int BASE_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_COMPONENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_COMPONENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_COMPONENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Base Component</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link main.impl.BaseObjectImpl <em>Base Object</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see main.impl.BaseObjectImpl
	 * @see main.impl.MainPackageImpl#getBaseObject()
	 * @generated
	 */
	int BASE_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__GROUP = BASE_COMPONENT__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__NAME = BASE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__ID = BASE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Object1</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__OBJECT1 = BASE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Object</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_FEATURE_COUNT = BASE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link main.impl.ChildObject2Impl <em>Child Object2</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see main.impl.ChildObject2Impl
	 * @see main.impl.MainPackageImpl#getChildObject2()
	 * @generated
	 */
	int CHILD_OBJECT2 = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT2__GROUP = BASE_OBJECT__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT2__NAME = BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT2__ID = BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Object1</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT2__OBJECT1 = BASE_OBJECT__OBJECT1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT2__LENGTH = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Object2</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT2_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link main.impl.ChildObject1Impl <em>Child Object1</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see main.impl.ChildObject1Impl
	 * @see main.impl.MainPackageImpl#getChildObject1()
	 * @generated
	 */
	int CHILD_OBJECT1 = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT1__GROUP = BASE_OBJECT__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT1__NAME = BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT1__ID = BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Object1</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT1__OBJECT1 = BASE_OBJECT__OBJECT1;

	/**
	 * The feature id for the '<em><b>Linked Object</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT1__LINKED_OBJECT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Object1</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT1_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link main.impl.BaseGroupImpl <em>Base Group</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see main.impl.BaseGroupImpl
	 * @see main.impl.MainPackageImpl#getBaseGroup()
	 * @generated
	 */
	int BASE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_GROUP__GROUP = BASE_COMPONENT__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_GROUP__NAME = BASE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_GROUP__ID = BASE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_GROUP__COMPONENTS = BASE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Group</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASE_GROUP_FEATURE_COUNT = BASE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link main.impl.ChildObject3Impl <em>Child Object3</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see main.impl.ChildObject3Impl
	 * @see main.impl.MainPackageImpl#getChildObject3()
	 * @generated
	 */
	int CHILD_OBJECT3 = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT3__GROUP = BASE_OBJECT__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT3__NAME = BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT3__ID = BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Object1</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT3__OBJECT1 = BASE_OBJECT__OBJECT1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT3__WIDTH = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Object3</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT3_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link main.impl.ChildObject4Impl <em>Child Object4</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see main.impl.ChildObject4Impl
	 * @see main.impl.MainPackageImpl#getChildObject4()
	 * @generated
	 */
	int CHILD_OBJECT4 = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT4__GROUP = BASE_OBJECT__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT4__NAME = BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT4__ID = BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Object1</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT4__OBJECT1 = BASE_OBJECT__OBJECT1;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT4__THICKNESS = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Object4</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILD_OBJECT4_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link main.ChildObject2 <em>Child Object2</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Child Object2</em>'.
	 * @see main.ChildObject2
	 * @generated
	 */
	EClass getChildObject2();

	/**
	 * Returns the meta object for the attribute '{@link main.ChildObject2#getLength <em>Length</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see main.ChildObject2#getLength()
	 * @see #getChildObject2()
	 * @generated
	 */
	EAttribute getChildObject2_Length();

	/**
	 * Returns the meta object for class '{@link main.ChildObject1 <em>Child Object1</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Child Object1</em>'.
	 * @see main.ChildObject1
	 * @generated
	 */
	EClass getChildObject1();

	/**
	 * Returns the meta object for the reference '{@link main.ChildObject1#getLinkedObject
	 * <em>Linked Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Linked Object</em>'.
	 * @see main.ChildObject1#getLinkedObject()
	 * @see #getChildObject1()
	 * @generated
	 */
	EReference getChildObject1_LinkedObject();

	/**
	 * Returns the meta object for class '{@link main.BaseObject <em>Base Object</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Base Object</em>'.
	 * @see main.BaseObject
	 * @generated
	 */
	EClass getBaseObject();

	/**
	 * Returns the meta object for the reference '{@link main.BaseObject#getObject1 <em>Object1</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Object1</em>'.
	 * @see main.BaseObject#getObject1()
	 * @see #getBaseObject()
	 * @generated
	 */
	EReference getBaseObject_Object1();

	/**
	 * Returns the meta object for class '{@link main.BaseGroup <em>Base Group</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Base Group</em>'.
	 * @see main.BaseGroup
	 * @generated
	 */
	EClass getBaseGroup();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link main.BaseGroup#getComponents <em>Components</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see main.BaseGroup#getComponents()
	 * @see #getBaseGroup()
	 * @generated
	 */
	EReference getBaseGroup_Components();

	/**
	 * Returns the meta object for class '{@link main.BaseComponent <em>Base Component</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Base Component</em>'.
	 * @see main.BaseComponent
	 * @generated
	 */
	EClass getBaseComponent();

	/**
	 * Returns the meta object for the container reference '{@link main.BaseComponent#getGroup
	 * <em>Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see main.BaseComponent#getGroup()
	 * @see #getBaseComponent()
	 * @generated
	 */
	EReference getBaseComponent_Group();

	/**
	 * Returns the meta object for the attribute '{@link main.BaseComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see main.BaseComponent#getName()
	 * @see #getBaseComponent()
	 * @generated
	 */
	EAttribute getBaseComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link main.BaseComponent#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see main.BaseComponent#getId()
	 * @see #getBaseComponent()
	 * @generated
	 */
	EAttribute getBaseComponent_Id();

	/**
	 * Returns the meta object for class '{@link main.ChildObject3 <em>Child Object3</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Child Object3</em>'.
	 * @see main.ChildObject3
	 * @generated
	 */
	EClass getChildObject3();

	/**
	 * Returns the meta object for the attribute '{@link main.ChildObject3#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see main.ChildObject3#getWidth()
	 * @see #getChildObject3()
	 * @generated
	 */
	EAttribute getChildObject3_Width();

	/**
	 * Returns the meta object for class '{@link main.ChildObject4 <em>Child Object4</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Child Object4</em>'.
	 * @see main.ChildObject4
	 * @generated
	 */
	EClass getChildObject4();

	/**
	 * Returns the meta object for the attribute '{@link main.ChildObject4#getThickness
	 * <em>Thickness</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Thickness</em>'.
	 * @see main.ChildObject4#getThickness()
	 * @see #getChildObject4()
	 * @generated
	 */
	EAttribute getChildObject4_Thickness();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MainFactory getMainFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link main.impl.ChildObject2Impl <em>Child Object2</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see main.impl.ChildObject2Impl
		 * @see main.impl.MainPackageImpl#getChildObject2()
		 * @generated
		 */
		EClass CHILD_OBJECT2 = eINSTANCE.getChildObject2();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHILD_OBJECT2__LENGTH = eINSTANCE.getChildObject2_Length();

		/**
		 * The meta object literal for the '{@link main.impl.ChildObject1Impl <em>Child Object1</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see main.impl.ChildObject1Impl
		 * @see main.impl.MainPackageImpl#getChildObject1()
		 * @generated
		 */
		EClass CHILD_OBJECT1 = eINSTANCE.getChildObject1();

		/**
		 * The meta object literal for the '<em><b>Linked Object</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHILD_OBJECT1__LINKED_OBJECT = eINSTANCE.getChildObject1_LinkedObject();

		/**
		 * The meta object literal for the '{@link main.impl.BaseObjectImpl <em>Base Object</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see main.impl.BaseObjectImpl
		 * @see main.impl.MainPackageImpl#getBaseObject()
		 * @generated
		 */
		EClass BASE_OBJECT = eINSTANCE.getBaseObject();

		/**
		 * The meta object literal for the '<em><b>Object1</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BASE_OBJECT__OBJECT1 = eINSTANCE.getBaseObject_Object1();

		/**
		 * The meta object literal for the '{@link main.impl.BaseGroupImpl <em>Base Group</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see main.impl.BaseGroupImpl
		 * @see main.impl.MainPackageImpl#getBaseGroup()
		 * @generated
		 */
		EClass BASE_GROUP = eINSTANCE.getBaseGroup();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BASE_GROUP__COMPONENTS = eINSTANCE.getBaseGroup_Components();

		/**
		 * The meta object literal for the '{@link main.impl.BaseComponentImpl <em>Base Component</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see main.impl.BaseComponentImpl
		 * @see main.impl.MainPackageImpl#getBaseComponent()
		 * @generated
		 */
		EClass BASE_COMPONENT = eINSTANCE.getBaseComponent();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BASE_COMPONENT__GROUP = eINSTANCE.getBaseComponent_Group();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASE_COMPONENT__NAME = eINSTANCE.getBaseComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASE_COMPONENT__ID = eINSTANCE.getBaseComponent_Id();

		/**
		 * The meta object literal for the '{@link main.impl.ChildObject3Impl <em>Child Object3</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see main.impl.ChildObject3Impl
		 * @see main.impl.MainPackageImpl#getChildObject3()
		 * @generated
		 */
		EClass CHILD_OBJECT3 = eINSTANCE.getChildObject3();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHILD_OBJECT3__WIDTH = eINSTANCE.getChildObject3_Width();

		/**
		 * The meta object literal for the '{@link main.impl.ChildObject4Impl <em>Child Object4</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see main.impl.ChildObject4Impl
		 * @see main.impl.MainPackageImpl#getChildObject4()
		 * @generated
		 */
		EClass CHILD_OBJECT4 = eINSTANCE.getChildObject4();

		/**
		 * The meta object literal for the '<em><b>Thickness</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHILD_OBJECT4__THICKNESS = eINSTANCE.getChildObject4_Thickness();

	}

} // MainPackage
