/**
 * <copyright>
 * </copyright>
 *
 * $Id: TemporalPackage.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package temporal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see temporal.TemporalFactory
 * @model kind="package"
 * @generated
 */
public interface TemporalPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "temporal";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http:///temporal.ecore";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "temporal";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	TemporalPackage eINSTANCE = temporal.impl.TemporalPackageImpl.init();

	/**
	 * The meta object id for the '{@link temporal.impl.TemporalImpl <em>Temporal</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see temporal.impl.TemporalImpl
	 * @see temporal.impl.TemporalPackageImpl#getTemporal()
	 * @generated
	 */
	int TEMPORAL = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__DATE = 0;

	/**
	 * The feature id for the '<em><b>Touched Attributes</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__TOUCHED_ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Continuity</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__CONTINUITY = 2;

	/**
	 * The feature id for the '<em><b>Version Holder</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__VERSION_HOLDER = 3;

	/**
	 * The feature id for the '<em><b>Version Holder Containment</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__VERSION_HOLDER_CONTAINMENT = 4;

	/**
	 * The number of structural features of the '<em>Temporal</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link temporal.impl.VersionHolderImpl <em>Version Holder</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see temporal.impl.VersionHolderImpl
	 * @see temporal.impl.TemporalPackageImpl#getVersionHolder()
	 * @generated
	 */
	int VERSION_HOLDER = 1;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION_HOLDER__VERSIONS = 0;

	/**
	 * The feature id for the '<em><b>Index Of Continuity</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION_HOLDER__INDEX_OF_CONTINUITY = 1;

	/**
	 * The number of structural features of the '<em>Version Holder</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION_HOLDER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>EBoolean Array</em>' data type. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see temporal.impl.TemporalPackageImpl#getEBooleanArray()
	 * @generated
	 */
	int EBOOLEAN_ARRAY = 2;

	/**
	 * Returns the meta object for class '{@link temporal.Temporal <em>Temporal</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Temporal</em>'.
	 * @see temporal.Temporal
	 * @generated
	 */
	EClass getTemporal();

	/**
	 * Returns the meta object for the attribute '{@link temporal.Temporal#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see temporal.Temporal#getDate()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Date();

	/**
	 * Returns the meta object for the attribute '{@link temporal.Temporal
	 * <em>Touched Attributes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Touched Attributes</em>'.
	 * @see temporal.Temporal
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_TouchedAttributes();

	/**
	 * Returns the meta object for the attribute '{@link temporal.Temporal#isContinuity
	 * <em>Continuity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Continuity</em>'.
	 * @see temporal.Temporal#isContinuity()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Continuity();

	/**
	 * Returns the meta object for the reference '{@link temporal.Temporal <em>Version Holder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Version Holder</em>'.
	 * @see temporal.Temporal
	 * @see #getTemporal()
	 * @generated
	 */
	EReference getTemporal_VersionHolder();

	/**
	 * Returns the meta object for the containment reference '{@link temporal.Temporal
	 * <em>Version Holder Containment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Version Holder Containment</em>'.
	 * @see temporal.Temporal
	 * @see #getTemporal()
	 * @generated
	 */
	EReference getTemporal_VersionHolderContainment();

	/**
	 * Returns the meta object for class '{@link temporal.VersionHolder <em>Version Holder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Version Holder</em>'.
	 * @see temporal.VersionHolder
	 * @generated
	 */
	EClass getVersionHolder();

	/**
	 * Returns the meta object for the reference list '{@link temporal.VersionHolder#getVersions
	 * <em>Versions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Versions</em>'.
	 * @see temporal.VersionHolder#getVersions()
	 * @see #getVersionHolder()
	 * @generated
	 */
	EReference getVersionHolder_Versions();

	/**
	 * Returns the meta object for the attribute '{@link temporal.VersionHolder#getIndexOfContinuity
	 * <em>Index Of Continuity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Index Of Continuity</em>'.
	 * @see temporal.VersionHolder#getIndexOfContinuity()
	 * @see #getVersionHolder()
	 * @generated
	 */
	EAttribute getVersionHolder_IndexOfContinuity();

	/**
	 * Returns the meta object for data type '<em>EBoolean Array</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>EBoolean Array</em>'.
	 * @model instanceClass="boolean[]"
	 * @generated
	 */
	EDataType getEBooleanArray();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TemporalFactory getTemporalFactory();

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
		 * The meta object literal for the '{@link temporal.impl.TemporalImpl <em>Temporal</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see temporal.impl.TemporalImpl
		 * @see temporal.impl.TemporalPackageImpl#getTemporal()
		 * @generated
		 */
		EClass TEMPORAL = eINSTANCE.getTemporal();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TEMPORAL__DATE = eINSTANCE.getTemporal_Date();

		/**
		 * The meta object literal for the '<em><b>Touched Attributes</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TEMPORAL__TOUCHED_ATTRIBUTES = eINSTANCE.getTemporal_TouchedAttributes();

		/**
		 * The meta object literal for the '<em><b>Continuity</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TEMPORAL__CONTINUITY = eINSTANCE.getTemporal_Continuity();

		/**
		 * The meta object literal for the '<em><b>Version Holder</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TEMPORAL__VERSION_HOLDER = eINSTANCE.getTemporal_VersionHolder();

		/**
		 * The meta object literal for the '<em><b>Version Holder Containment</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TEMPORAL__VERSION_HOLDER_CONTAINMENT = eINSTANCE
				.getTemporal_VersionHolderContainment();

		/**
		 * The meta object literal for the '{@link temporal.impl.VersionHolderImpl
		 * <em>Version Holder</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see temporal.impl.VersionHolderImpl
		 * @see temporal.impl.TemporalPackageImpl#getVersionHolder()
		 * @generated
		 */
		EClass VERSION_HOLDER = eINSTANCE.getVersionHolder();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VERSION_HOLDER__VERSIONS = eINSTANCE.getVersionHolder_Versions();

		/**
		 * The meta object literal for the '<em><b>Index Of Continuity</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VERSION_HOLDER__INDEX_OF_CONTINUITY = eINSTANCE.getVersionHolder_IndexOfContinuity();

		/**
		 * The meta object literal for the '<em>EBoolean Array</em>' data type. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see temporal.impl.TemporalPackageImpl#getEBooleanArray()
		 * @generated
		 */
		EDataType EBOOLEAN_ARRAY = eINSTANCE.getEBooleanArray();

	}

} // TemporalPackage
