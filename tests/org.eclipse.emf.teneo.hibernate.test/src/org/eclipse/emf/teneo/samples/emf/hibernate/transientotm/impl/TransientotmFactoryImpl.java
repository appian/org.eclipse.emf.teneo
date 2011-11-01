/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransientotmFactoryImpl.java,v 1.2 2010/02/06 20:50:47 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook;
import org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter;
import org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmFactory;
import org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransientotmFactoryImpl extends EFactoryImpl implements TransientotmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransientotmFactory init() {
		try {
			TransientotmFactory theTransientotmFactory = (TransientotmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/hibernate/transientotm"); 
			if (theTransientotmFactory != null) {
				return theTransientotmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransientotmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientotmFactoryImpl() {
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
			case TransientotmPackage.TBOOK: return createTBook();
			case TransientotmPackage.TWRITER: return createTWriter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBook createTBook() {
		TBookImpl tBook = new TBookImpl();
		return tBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TWriter createTWriter() {
		TWriterImpl tWriter = new TWriterImpl();
		return tWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientotmPackage getTransientotmPackage() {
		return (TransientotmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransientotmPackage getPackage() {
		return TransientotmPackage.eINSTANCE;
	}

} //TransientotmFactoryImpl
