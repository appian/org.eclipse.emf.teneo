/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepresantationsPackage.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.represantations;

import datacore.DatacorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see datacore.represantations.RepresantationsFactory
 * @model kind="package"
 * @generated
 */
public interface RepresantationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "represantations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.arcsolutions.de/remarc/represantations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "represantations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepresantationsPackage eINSTANCE = datacore.represantations.impl.RepresantationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link datacore.represantations.impl.CSMFileRepresentationImpl <em>CSM File Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.represantations.impl.CSMFileRepresentationImpl
	 * @see datacore.represantations.impl.RepresantationsPackageImpl#getCSMFileRepresentation()
	 * @generated
	 */
	int CSM_FILE_REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_FILE_REPRESENTATION__PARENT = DatacorePackage.CSM_REPRESENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_FILE_REPRESENTATION__CHILDREN = DatacorePackage.CSM_REPRESENTATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_FILE_REPRESENTATION__VALID = DatacorePackage.CSM_REPRESENTATION__VALID;

	/**
	 * The feature id for the '<em><b>Representation Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_FILE_REPRESENTATION__REPRESENTATION_ROOT = DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT;

	/**
	 * The feature id for the '<em><b>Owner CSM Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_FILE_REPRESENTATION__OWNER_CSM_CLASS = DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_FILE_REPRESENTATION__LOCATION = DatacorePackage.CSM_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CSM File Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_FILE_REPRESENTATION_FEATURE_COUNT = DatacorePackage.CSM_REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link datacore.represantations.impl.CSMUrlRepresentationImpl <em>CSM Url Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.represantations.impl.CSMUrlRepresentationImpl
	 * @see datacore.represantations.impl.RepresantationsPackageImpl#getCSMUrlRepresentation()
	 * @generated
	 */
	int CSM_URL_REPRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_URL_REPRESENTATION__PARENT = DatacorePackage.CSM_REPRESENTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_URL_REPRESENTATION__CHILDREN = DatacorePackage.CSM_REPRESENTATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_URL_REPRESENTATION__VALID = DatacorePackage.CSM_REPRESENTATION__VALID;

	/**
	 * The feature id for the '<em><b>Representation Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_URL_REPRESENTATION__REPRESENTATION_ROOT = DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT;

	/**
	 * The feature id for the '<em><b>Owner CSM Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_URL_REPRESENTATION__OWNER_CSM_CLASS = DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_URL_REPRESENTATION__URL = DatacorePackage.CSM_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CSM Url Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_URL_REPRESENTATION_FEATURE_COUNT = DatacorePackage.CSM_REPRESENTATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link datacore.represantations.CSMFileRepresentation <em>CSM File Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM File Representation</em>'.
	 * @see datacore.represantations.CSMFileRepresentation
	 * @generated
	 */
	EClass getCSMFileRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link datacore.represantations.CSMFileRepresentation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see datacore.represantations.CSMFileRepresentation#getLocation()
	 * @see #getCSMFileRepresentation()
	 * @generated
	 */
	EAttribute getCSMFileRepresentation_Location();

	/**
	 * Returns the meta object for class '{@link datacore.represantations.CSMUrlRepresentation <em>CSM Url Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Url Representation</em>'.
	 * @see datacore.represantations.CSMUrlRepresentation
	 * @generated
	 */
	EClass getCSMUrlRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link datacore.represantations.CSMUrlRepresentation#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see datacore.represantations.CSMUrlRepresentation#getUrl()
	 * @see #getCSMUrlRepresentation()
	 * @generated
	 */
	EAttribute getCSMUrlRepresentation_Url();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepresantationsFactory getRepresantationsFactory();

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
		 * The meta object literal for the '{@link datacore.represantations.impl.CSMFileRepresentationImpl <em>CSM File Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.represantations.impl.CSMFileRepresentationImpl
		 * @see datacore.represantations.impl.RepresantationsPackageImpl#getCSMFileRepresentation()
		 * @generated
		 */
		EClass CSM_FILE_REPRESENTATION = eINSTANCE.getCSMFileRepresentation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_FILE_REPRESENTATION__LOCATION = eINSTANCE.getCSMFileRepresentation_Location();

		/**
		 * The meta object literal for the '{@link datacore.represantations.impl.CSMUrlRepresentationImpl <em>CSM Url Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.represantations.impl.CSMUrlRepresentationImpl
		 * @see datacore.represantations.impl.RepresantationsPackageImpl#getCSMUrlRepresentation()
		 * @generated
		 */
		EClass CSM_URL_REPRESENTATION = eINSTANCE.getCSMUrlRepresentation();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_URL_REPRESENTATION__URL = eINSTANCE.getCSMUrlRepresentation_Url();

	}

} //RepresantationsPackage
