/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz329275Package.java,v 1.1 2010/11/04 05:22:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz329275;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Factory
 * @model kind="package"
 * @generated
 */
public interface Bz329275Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz329275";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz329275";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz329275";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz329275Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz329275.impl.Bz329275PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.impl.Bz329275PackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Un Settable String No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UN_SETTABLE_STRING_NO_DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Standard String No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STANDARD_STRING_NO_DEFAULT = 3;

	/**
	 * The feature id for the '<em><b>Un Settable String With Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UN_SETTABLE_STRING_WITH_DEFAULT = 4;

	/**
	 * The feature id for the '<em><b>Standard String Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STANDARD_STRING_DEFAULT = 5;

	/**
	 * The feature id for the '<em><b>Un Settable Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UN_SETTABLE_ENUM = 6;

	/**
	 * The feature id for the '<em><b>Standard Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STANDARD_ENUM = 7;

	/**
	 * The feature id for the '<em><b>Un Settable Primitive No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UN_SETTABLE_PRIMITIVE_NO_DEFAULT = 8;

	/**
	 * The feature id for the '<em><b>Standard Primitive No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STANDARD_PRIMITIVE_NO_DEFAULT = 9;

	/**
	 * The feature id for the '<em><b>Un Settable Primitive With Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UN_SETTABLE_PRIMITIVE_WITH_DEFAULT = 10;

	/**
	 * The feature id for the '<em><b>Standard Primitive With Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STANDARD_PRIMITIVE_WITH_DEFAULT = 11;

	/**
	 * The feature id for the '<em><b>Un Settable Object Primitive With Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT = 12;

	/**
	 * The feature id for the '<em><b>Standard Object Primitive With Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT = 13;

	/**
	 * The feature id for the '<em><b>Un Settable Object Primitive No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT = 14;

	/**
	 * The feature id for the '<em><b>Standard Object Primitive No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT = 15;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.impl.Bz329275PackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getVersion()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringNoDefault <em>Un Settable String No Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un Settable String No Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringNoDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_UnSettableStringNoDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardStringNoDefault <em>Standard String No Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard String No Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardStringNoDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_StandardStringNoDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringWithDefault <em>Un Settable String With Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un Settable String With Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringWithDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_UnSettableStringWithDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardStringDefault <em>Standard String Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard String Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardStringDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_StandardStringDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableEnum <em>Un Settable Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un Settable Enum</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableEnum()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_UnSettableEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardEnum <em>Standard Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Enum</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardEnum()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_StandardEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveNoDefault <em>Un Settable Primitive No Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un Settable Primitive No Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveNoDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_UnSettablePrimitiveNoDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardPrimitiveNoDefault <em>Standard Primitive No Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Primitive No Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardPrimitiveNoDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_StandardPrimitiveNoDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveWithDefault <em>Un Settable Primitive With Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un Settable Primitive With Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveWithDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_UnSettablePrimitiveWithDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardPrimitiveWithDefault <em>Standard Primitive With Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Primitive With Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardPrimitiveWithDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_StandardPrimitiveWithDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveWithDefault <em>Un Settable Object Primitive With Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un Settable Object Primitive With Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveWithDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_UnSettableObjectPrimitiveWithDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardObjectPrimitiveWithDefault <em>Standard Object Primitive With Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Object Primitive With Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardObjectPrimitiveWithDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_StandardObjectPrimitiveWithDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveNoDefault <em>Un Settable Object Primitive No Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un Settable Object Primitive No Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveNoDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_UnSettableObjectPrimitiveNoDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardObjectPrimitiveNoDefault <em>Standard Object Primitive No Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Object Primitive No Default</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardObjectPrimitiveNoDefault()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_StandardObjectPrimitiveNoDefault();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz329275Factory getBz329275Factory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz329275.impl.Bz329275PackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ID = eINSTANCE.getItem_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__VERSION = eINSTANCE.getItem_Version();

		/**
		 * The meta object literal for the '<em><b>Un Settable String No Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__UN_SETTABLE_STRING_NO_DEFAULT = eINSTANCE.getItem_UnSettableStringNoDefault();

		/**
		 * The meta object literal for the '<em><b>Standard String No Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__STANDARD_STRING_NO_DEFAULT = eINSTANCE.getItem_StandardStringNoDefault();

		/**
		 * The meta object literal for the '<em><b>Un Settable String With Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__UN_SETTABLE_STRING_WITH_DEFAULT = eINSTANCE.getItem_UnSettableStringWithDefault();

		/**
		 * The meta object literal for the '<em><b>Standard String Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__STANDARD_STRING_DEFAULT = eINSTANCE.getItem_StandardStringDefault();

		/**
		 * The meta object literal for the '<em><b>Un Settable Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__UN_SETTABLE_ENUM = eINSTANCE.getItem_UnSettableEnum();

		/**
		 * The meta object literal for the '<em><b>Standard Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__STANDARD_ENUM = eINSTANCE.getItem_StandardEnum();

		/**
		 * The meta object literal for the '<em><b>Un Settable Primitive No Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__UN_SETTABLE_PRIMITIVE_NO_DEFAULT = eINSTANCE.getItem_UnSettablePrimitiveNoDefault();

		/**
		 * The meta object literal for the '<em><b>Standard Primitive No Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__STANDARD_PRIMITIVE_NO_DEFAULT = eINSTANCE.getItem_StandardPrimitiveNoDefault();

		/**
		 * The meta object literal for the '<em><b>Un Settable Primitive With Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__UN_SETTABLE_PRIMITIVE_WITH_DEFAULT = eINSTANCE.getItem_UnSettablePrimitiveWithDefault();

		/**
		 * The meta object literal for the '<em><b>Standard Primitive With Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__STANDARD_PRIMITIVE_WITH_DEFAULT = eINSTANCE.getItem_StandardPrimitiveWithDefault();

		/**
		 * The meta object literal for the '<em><b>Un Settable Object Primitive With Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT = eINSTANCE.getItem_UnSettableObjectPrimitiveWithDefault();

		/**
		 * The meta object literal for the '<em><b>Standard Object Primitive With Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT = eINSTANCE.getItem_StandardObjectPrimitiveWithDefault();

		/**
		 * The meta object literal for the '<em><b>Un Settable Object Primitive No Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT = eINSTANCE.getItem_UnSettableObjectPrimitiveNoDefault();

		/**
		 * The meta object literal for the '<em><b>Standard Object Primitive No Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT = eINSTANCE.getItem_StandardObjectPrimitiveNoDefault();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum
		 * @see org.eclipse.emf.teneo.samples.issues.bz329275.impl.Bz329275PackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

	}

} //Bz329275Package
