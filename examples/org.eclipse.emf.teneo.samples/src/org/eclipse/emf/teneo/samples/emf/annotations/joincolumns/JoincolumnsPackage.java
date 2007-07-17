/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoincolumnsPackage.java,v 1.2 2007/07/17 17:37:32 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.joincolumns;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsFactory
 * @model kind="package"
 * @generated
 */
public interface JoincolumnsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "joincolumns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/joincolumns";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "joincolumns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoincolumnsPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.JoincolumnsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.PersonImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.JoincolumnsPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FRIENDS = 2;

	/**
	 * The feature id for the '<em><b>Opposite Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OPPOSITE_FRIENDS = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.ParentImpl <em>Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.ParentImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.JoincolumnsPackageImpl#getParent()
	 * @generated
	 */
	int PARENT = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__FRIENDS = PERSON__FRIENDS;

	/**
	 * The feature id for the '<em><b>Opposite Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__OPPOSITE_FRIENDS = PERSON__OPPOSITE_FRIENDS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__CHILDREN = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.ChildImpl <em>Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.ChildImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.JoincolumnsPackageImpl#getChild()
	 * @generated
	 */
	int CHILD = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__FRIENDS = PERSON__FRIENDS;

	/**
	 * The feature id for the '<em><b>Opposite Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__OPPOSITE_FRIENDS = PERSON__OPPOSITE_FRIENDS;

	/**
	 * The number of structural features of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.HouseImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.JoincolumnsPackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Visitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__VISITORS = 1;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Parent
	 * @generated
	 */
	EClass getParent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Parent#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Parent#getChildren()
	 * @see #getParent()
	 * @generated
	 */
	EReference getParent_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Child
	 * @generated
	 */
	EClass getChild();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getFriends <em>Friends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Friends</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getFriends()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Friends();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getOppositeFriends <em>Opposite Friends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opposite Friends</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getOppositeFriends()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_OppositeFriends();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.House#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.House#getOwner()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Owner();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.House#getVisitors <em>Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Visitors</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.House#getVisitors()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Visitors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JoincolumnsFactory getJoincolumnsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.ParentImpl <em>Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.ParentImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.JoincolumnsPackageImpl#getParent()
		 * @generated
		 */
		EClass PARENT = eINSTANCE.getParent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT__CHILDREN = eINSTANCE.getParent_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.ChildImpl <em>Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.ChildImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.JoincolumnsPackageImpl#getChild()
		 * @generated
		 */
		EClass CHILD = eINSTANCE.getChild();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.PersonImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.JoincolumnsPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Friends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__FRIENDS = eINSTANCE.getPerson_Friends();

		/**
		 * The meta object literal for the '<em><b>Opposite Friends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__OPPOSITE_FRIENDS = eINSTANCE.getPerson_OppositeFriends();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.HouseImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.JoincolumnsPackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__OWNER = eINSTANCE.getHouse_Owner();

		/**
		 * The meta object literal for the '<em><b>Visitors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__VISITORS = eINSTANCE.getHouse_Visitors();

	}

} //JoincolumnsPackage
