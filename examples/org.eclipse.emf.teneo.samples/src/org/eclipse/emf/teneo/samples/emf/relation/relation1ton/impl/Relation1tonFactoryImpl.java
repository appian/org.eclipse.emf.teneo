/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation1tonFactoryImpl.java,v 1.2 2006/07/22 13:01:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonFactory;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Relation1tonFactoryImpl extends EFactoryImpl implements Relation1tonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Relation1tonFactory init() {
		try {
			Relation1tonFactory theRelation1tonFactory = (Relation1tonFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/relation/relation1ton"); 
			if (theRelation1tonFactory != null) {
				return theRelation1tonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Relation1tonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation1tonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Relation1tonPackage.MAIN: return createMain();
			case Relation1tonPackage.ONE_CN: return createOneCN();
			case Relation1tonPackage.ONE_CR: return createOneCR();
			case Relation1tonPackage.ONE_NN: return createOneNN();
			case Relation1tonPackage.ONE_NR: return createOneNR();
			case Relation1tonPackage.TWO_CN: return createTwoCN();
			case Relation1tonPackage.TWO_CR: return createTwoCR();
			case Relation1tonPackage.TWO_NN: return createTwoNN();
			case Relation1tonPackage.TWO_NR: return createTwoNR();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main createMain() {
		MainImpl main = new MainImpl();
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneCN createOneCN() {
		OneCNImpl oneCN = new OneCNImpl();
		return oneCN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneCR createOneCR() {
		OneCRImpl oneCR = new OneCRImpl();
		return oneCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneNN createOneNN() {
		OneNNImpl oneNN = new OneNNImpl();
		return oneNN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneNR createOneNR() {
		OneNRImpl oneNR = new OneNRImpl();
		return oneNR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoCN createTwoCN() {
		TwoCNImpl twoCN = new TwoCNImpl();
		return twoCN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoCR createTwoCR() {
		TwoCRImpl twoCR = new TwoCRImpl();
		return twoCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoNN createTwoNN() {
		TwoNNImpl twoNN = new TwoNNImpl();
		return twoNN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoNR createTwoNR() {
		TwoNRImpl twoNR = new TwoNRImpl();
		return twoNR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation1tonPackage getRelation1tonPackage() {
		return (Relation1tonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static Relation1tonPackage getPackage() {
		return Relation1tonPackage.eINSTANCE;
	}

} //Relation1tonFactoryImpl
