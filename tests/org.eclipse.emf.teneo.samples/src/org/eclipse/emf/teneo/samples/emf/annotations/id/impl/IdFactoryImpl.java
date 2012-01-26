/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdFactoryImpl.java,v 1.5 2007/11/15 14:48:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.id.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.annotations.id.*;
import org.eclipse.emf.teneo.samples.emf.annotations.id.AutoID;
import org.eclipse.emf.teneo.samples.emf.annotations.id.IdFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.id.IdPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.id.IdentityID;
import org.eclipse.emf.teneo.samples.emf.annotations.id.SimpleID;
import org.eclipse.emf.teneo.samples.emf.annotations.id.TableGeneratorID;
import org.eclipse.emf.teneo.samples.emf.annotations.id.TableID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdFactoryImpl extends EFactoryImpl implements IdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdFactory init() {
		try {
			IdFactory theIdFactory = (IdFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/id"); 
			if (theIdFactory != null) {
				return theIdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdFactoryImpl() {
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
			case IdPackage.IDENTITY_ID: return createIdentityID();
			case IdPackage.SIMPLE_ID: return createSimpleID();
			case IdPackage.TABLE_ID: return createTableID();
			case IdPackage.TABLE_GENERATOR_ID: return createTableGeneratorID();
			case IdPackage.AUTO_ID: return createAutoID();
			case IdPackage.OTHER_TABLE_GENERATOR_ID: return createOtherTableGeneratorID();
			case IdPackage.SEQUENCE_ID: return createSequenceID();
			case IdPackage.SEQUENCE_STYLE_ID: return createSequenceStyleID();
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
	public IdPackage getIdPackage() {
		return (IdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IdPackage getPackage() {
		return IdPackage.eINSTANCE;
	}

} //IdFactoryImpl
