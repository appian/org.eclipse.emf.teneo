/**
 * <copyright>
 * </copyright>
 *
 * $Id: PamodelFactoryImpl.java,v 1.1 2006/07/04 21:37:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelFactory;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PamodelFactoryImpl extends EFactoryImpl implements PamodelFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PamodelPackage.PANNOTATED_MODEL: return createPAnnotatedModel();
			case PamodelPackage.PANNOTATED_EPACKAGE: return createPAnnotatedEPackage();
			case PamodelPackage.PANNOTATED_ECLASS: return createPAnnotatedEClass();
			case PamodelPackage.PANNOTATED_EATTRIBUTE: return createPAnnotatedEAttribute();
			case PamodelPackage.PANNOTATED_EREFERENCE: return createPAnnotatedEReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedModel createPAnnotatedModel() {
		PAnnotatedModelImpl pAnnotatedModel = new PAnnotatedModelImpl();
		return pAnnotatedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedEPackage createPAnnotatedEPackage() {
		PAnnotatedEPackageImpl pAnnotatedEPackage = new PAnnotatedEPackageImpl();
		return pAnnotatedEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedEClass createPAnnotatedEClass() {
		PAnnotatedEClassImpl pAnnotatedEClass = new PAnnotatedEClassImpl();
		return pAnnotatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedEAttribute createPAnnotatedEAttribute() {
		PAnnotatedEAttributeImpl pAnnotatedEAttribute = new PAnnotatedEAttributeImpl();
		return pAnnotatedEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedEReference createPAnnotatedEReference() {
		PAnnotatedEReferenceImpl pAnnotatedEReference = new PAnnotatedEReferenceImpl();
		return pAnnotatedEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PamodelPackage getPamodelPackage() {
		return (PamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static PamodelPackage getPackage() {
		return PamodelPackage.eINSTANCE;
	}

} //PamodelFactoryImpl
