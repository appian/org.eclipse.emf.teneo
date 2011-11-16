/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz363777.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.bz363777.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz363777FactoryImpl extends EFactoryImpl implements Bz363777Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz363777Factory init() {
		try {
			Bz363777Factory theBz363777Factory = (Bz363777Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/bz363777"); 
			if (theBz363777Factory != null) {
				return theBz363777Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz363777FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz363777FactoryImpl() {
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
			case Bz363777Package.CHANEL_MAP_TO_CHANEL_MAP_SERVICE: return (EObject)createChanelMapToChanelMapService();
			case Bz363777Package.CHANNEL_MAP: return createChannelMap();
			case Bz363777Package.CHANNEL_MAP_SERVICE: return createChannelMapService();
			case Bz363777Package.NE: return createNE();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<ChannelMap, ChannelMapService> createChanelMapToChanelMapService() {
		ChanelMapToChanelMapServiceImpl chanelMapToChanelMapService = new ChanelMapToChanelMapServiceImpl();
		return chanelMapToChanelMapService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelMap createChannelMap() {
		ChannelMapImpl channelMap = new ChannelMapImpl();
		return channelMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelMapService createChannelMapService() {
		ChannelMapServiceImpl channelMapService = new ChannelMapServiceImpl();
		return channelMapService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NE createNE() {
		NEImpl ne = new NEImpl();
		return ne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz363777Package getBz363777Package() {
		return (Bz363777Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz363777Package getPackage() {
		return Bz363777Package.eINSTANCE;
	}

} //Bz363777FactoryImpl
