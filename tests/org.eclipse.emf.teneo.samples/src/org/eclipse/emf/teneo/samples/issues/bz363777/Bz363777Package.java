/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz363777;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Factory
 * @model kind="package"
 * @generated
 */
public interface Bz363777Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz363777";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz363777";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz363777";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz363777Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz363777.impl.Bz363777PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChanelMapToChanelMapServiceImpl <em>Chanel Map To Chanel Map Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChanelMapToChanelMapServiceImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.Bz363777PackageImpl#getChanelMapToChanelMapService()
	 * @generated
	 */
	int CHANEL_MAP_TO_CHANEL_MAP_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANEL_MAP_TO_CHANEL_MAP_SERVICE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANEL_MAP_TO_CHANEL_MAP_SERVICE__KEY = 1;

	/**
	 * The number of structural features of the '<em>Chanel Map To Chanel Map Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANEL_MAP_TO_CHANEL_MAP_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChannelMapImpl <em>Channel Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChannelMapImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.Bz363777PackageImpl#getChannelMap()
	 * @generated
	 */
	int CHANNEL_MAP = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_MAP__KEY = 0;

	/**
	 * The number of structural features of the '<em>Channel Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_MAP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChannelMapServiceImpl <em>Channel Map Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChannelMapServiceImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.Bz363777PackageImpl#getChannelMapService()
	 * @generated
	 */
	int CHANNEL_MAP_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_MAP_SERVICE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Channel Map Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_MAP_SERVICE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz363777.impl.NEImpl <em>NE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.NEImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.Bz363777PackageImpl#getNE()
	 * @generated
	 */
	int NE = 3;

	/**
	 * The feature id for the '<em><b>Map Channels</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE__MAP_CHANNELS = 0;

	/**
	 * The number of structural features of the '<em>NE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Chanel Map To Chanel Map Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chanel Map To Chanel Map Service</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueType="org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMapService"
	 *        keyType="org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap"
	 *        extendedMetaData="kind='empty'"
	 * @generated
	 */
	EClass getChanelMapToChanelMapService();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getChanelMapToChanelMapService()
	 * @generated
	 */
	EReference getChanelMapToChanelMapService_Value();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getChanelMapToChanelMapService()
	 * @generated
	 */
	EReference getChanelMapToChanelMapService_Key();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap <em>Channel Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap
	 * @generated
	 */
	EClass getChannelMap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap#getKey()
	 * @see #getChannelMap()
	 * @generated
	 */
	EAttribute getChannelMap_Key();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMapService <em>Channel Map Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Map Service</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMapService
	 * @generated
	 */
	EClass getChannelMapService();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMapService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMapService#getName()
	 * @see #getChannelMapService()
	 * @generated
	 */
	EAttribute getChannelMapService_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz363777.NE <em>NE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NE</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.NE
	 * @generated
	 */
	EClass getNE();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.issues.bz363777.NE#getMapChannels <em>Map Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Map Channels</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.NE#getMapChannels()
	 * @see #getNE()
	 * @generated
	 */
	EReference getNE_MapChannels();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz363777Factory getBz363777Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChanelMapToChanelMapServiceImpl <em>Chanel Map To Chanel Map Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChanelMapToChanelMapServiceImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.Bz363777PackageImpl#getChanelMapToChanelMapService()
		 * @generated
		 */
		EClass CHANEL_MAP_TO_CHANEL_MAP_SERVICE = eINSTANCE.getChanelMapToChanelMapService();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANEL_MAP_TO_CHANEL_MAP_SERVICE__VALUE = eINSTANCE.getChanelMapToChanelMapService_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANEL_MAP_TO_CHANEL_MAP_SERVICE__KEY = eINSTANCE.getChanelMapToChanelMapService_Key();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChannelMapImpl <em>Channel Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChannelMapImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.Bz363777PackageImpl#getChannelMap()
		 * @generated
		 */
		EClass CHANNEL_MAP = eINSTANCE.getChannelMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_MAP__KEY = eINSTANCE.getChannelMap_Key();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChannelMapServiceImpl <em>Channel Map Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.ChannelMapServiceImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.Bz363777PackageImpl#getChannelMapService()
		 * @generated
		 */
		EClass CHANNEL_MAP_SERVICE = eINSTANCE.getChannelMapService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_MAP_SERVICE__NAME = eINSTANCE.getChannelMapService_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz363777.impl.NEImpl <em>NE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.NEImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz363777.impl.Bz363777PackageImpl#getNE()
		 * @generated
		 */
		EClass NE = eINSTANCE.getNE();

		/**
		 * The meta object literal for the '<em><b>Map Channels</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NE__MAP_CHANNELS = eINSTANCE.getNE_MapChannels();

	}

} //Bz363777Package
