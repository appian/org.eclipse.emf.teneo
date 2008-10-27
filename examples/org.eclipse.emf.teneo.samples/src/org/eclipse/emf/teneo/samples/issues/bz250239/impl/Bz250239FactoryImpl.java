/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz250239FactoryImpl.java,v 1.1 2008/10/27 13:18:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz250239.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.bz250239.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz250239FactoryImpl extends EFactoryImpl implements Bz250239Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz250239Factory init() {
		try {
			Bz250239Factory theBz250239Factory = (Bz250239Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/bz250239"); 
			if (theBz250239Factory != null) {
				return theBz250239Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz250239FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz250239FactoryImpl() {
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
			case Bz250239Package.IDENTITY_ID: return createIdentityID();
			case Bz250239Package.SIMPLE_ID: return createSimpleID();
			case Bz250239Package.TABLE_ID: return createTableID();
			case Bz250239Package.TABLE_GENERATOR_ID: return createTableGeneratorID();
			case Bz250239Package.AUTO_ID: return createAutoID();
			case Bz250239Package.OTHER_TABLE_GENERATOR_ID: return createOtherTableGeneratorID();
			case Bz250239Package.SEQUENCE_ID: return createSequenceID();
			case Bz250239Package.SEQUENCE_STYLE_ID: return createSequenceStyleID();
			case Bz250239Package.REAL_SEQUENCE_ID: return createRealSequenceID();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityID createIdentityID() {
		IdentityIDImpl identityID = new IdentityIDImpl();
		return identityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleID createSimpleID() {
		SimpleIDImpl simpleID = new SimpleIDImpl();
		return simpleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableID createTableID() {
		TableIDImpl tableID = new TableIDImpl();
		return tableID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableGeneratorID createTableGeneratorID() {
		TableGeneratorIDImpl tableGeneratorID = new TableGeneratorIDImpl();
		return tableGeneratorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoID createAutoID() {
		AutoIDImpl autoID = new AutoIDImpl();
		return autoID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherTableGeneratorID createOtherTableGeneratorID() {
		OtherTableGeneratorIDImpl otherTableGeneratorID = new OtherTableGeneratorIDImpl();
		return otherTableGeneratorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceID createSequenceID() {
		SequenceIDImpl sequenceID = new SequenceIDImpl();
		return sequenceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceStyleID createSequenceStyleID() {
		SequenceStyleIDImpl sequenceStyleID = new SequenceStyleIDImpl();
		return sequenceStyleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealSequenceID createRealSequenceID() {
		RealSequenceIDImpl realSequenceID = new RealSequenceIDImpl();
		return realSequenceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz250239Package getBz250239Package() {
		return (Bz250239Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz250239Package getPackage() {
		return Bz250239Package.eINSTANCE;
	}

} //Bz250239FactoryImpl
