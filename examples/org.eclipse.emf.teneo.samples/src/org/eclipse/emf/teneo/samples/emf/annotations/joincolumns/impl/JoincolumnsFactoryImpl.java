/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoincolumnsFactoryImpl.java,v 1.1 2006/09/29 12:30:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Parent;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoincolumnsFactoryImpl extends EFactoryImpl implements JoincolumnsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JoincolumnsFactory init() {
		try {
			JoincolumnsFactory theJoincolumnsFactory = (JoincolumnsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/joincolumns"); 
			if (theJoincolumnsFactory != null) {
				return theJoincolumnsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JoincolumnsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoincolumnsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JoincolumnsPackage.PARENT: return createParent();
			case JoincolumnsPackage.CHILD: return createChild();
			case JoincolumnsPackage.PERSON: return createPerson();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parent createParent() {
		ParentImpl parent = new ParentImpl();
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Child createChild() {
		ChildImpl child = new ChildImpl();
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoincolumnsPackage getJoincolumnsPackage() {
		return (JoincolumnsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static JoincolumnsPackage getPackage() {
		return JoincolumnsPackage.eINSTANCE;
	}

} //JoincolumnsFactoryImpl
