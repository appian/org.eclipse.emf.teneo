/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz277546Package.java,v 1.2 2009/05/23 10:49:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz277546;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.emf.teneo.samples.issues.bz277546.Bz277546Factory
 * @model kind="package"
 * @generated
 */
public interface Bz277546Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz277546";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz277546";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz277546";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz277546Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz277546.impl.Bz277546PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz277546.impl.AnotherVersionImpl <em>Another Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.AnotherVersionImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.Bz277546PackageImpl#getAnotherVersion()
	 * @generated
	 */
	int ANOTHER_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTHER_VERSION__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTHER_VERSION__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Another Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTHER_VERSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz277546.impl.DateVersionImpl <em>Date Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.DateVersionImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.Bz277546PackageImpl#getDateVersion()
	 * @generated
	 */
	int DATE_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VERSION__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VERSION__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Date Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VERSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz277546.impl.SimpleVersionImpl <em>Simple Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.SimpleVersionImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.Bz277546PackageImpl#getSimpleVersion()
	 * @generated
	 */
	int SIMPLE_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VERSION__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VERSION__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Simple Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VERSION_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '<em>The Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.Bz277546PackageImpl#getTheDate()
	 * @generated
	 */
	int THE_DATE = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz277546.AnotherVersion <em>Another Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Another Version</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.AnotherVersion
	 * @generated
	 */
	EClass getAnotherVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz277546.AnotherVersion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.AnotherVersion#getId()
	 * @see #getAnotherVersion()
	 * @generated
	 */
	EAttribute getAnotherVersion_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz277546.AnotherVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.AnotherVersion#getVersion()
	 * @see #getAnotherVersion()
	 * @generated
	 */
	EAttribute getAnotherVersion_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz277546.DateVersion <em>Date Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Version</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.DateVersion
	 * @generated
	 */
	EClass getDateVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz277546.DateVersion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.DateVersion#getId()
	 * @see #getDateVersion()
	 * @generated
	 */
	EAttribute getDateVersion_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz277546.DateVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.DateVersion#getVersion()
	 * @see #getDateVersion()
	 * @generated
	 */
	EAttribute getDateVersion_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion <em>Simple Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Version</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion
	 * @generated
	 */
	EClass getSimpleVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion#getId()
	 * @see #getSimpleVersion()
	 * @generated
	 */
	EAttribute getSimpleVersion_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion#getVersion()
	 * @see #getSimpleVersion()
	 * @generated
	 */
	EAttribute getSimpleVersion_Version();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>The Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>The Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        extendedMetaData="name='theDate'"
	 * @generated
	 */
	EDataType getTheDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz277546Factory getBz277546Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz277546.impl.AnotherVersionImpl <em>Another Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.AnotherVersionImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.Bz277546PackageImpl#getAnotherVersion()
		 * @generated
		 */
		EClass ANOTHER_VERSION = eINSTANCE.getAnotherVersion();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTHER_VERSION__ID = eINSTANCE.getAnotherVersion_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTHER_VERSION__VERSION = eINSTANCE.getAnotherVersion_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz277546.impl.DateVersionImpl <em>Date Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.DateVersionImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.Bz277546PackageImpl#getDateVersion()
		 * @generated
		 */
		EClass DATE_VERSION = eINSTANCE.getDateVersion();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_VERSION__ID = eINSTANCE.getDateVersion_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_VERSION__VERSION = eINSTANCE.getDateVersion_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz277546.impl.SimpleVersionImpl <em>Simple Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.SimpleVersionImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.Bz277546PackageImpl#getSimpleVersion()
		 * @generated
		 */
		EClass SIMPLE_VERSION = eINSTANCE.getSimpleVersion();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VERSION__ID = eINSTANCE.getSimpleVersion_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VERSION__VERSION = eINSTANCE.getSimpleVersion_Version();

		/**
		 * The meta object literal for the '<em>The Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.eclipse.emf.teneo.samples.issues.bz277546.impl.Bz277546PackageImpl#getTheDate()
		 * @generated
		 */
		EDataType THE_DATE = eINSTANCE.getTheDate();

	}

} //Bz277546Package
