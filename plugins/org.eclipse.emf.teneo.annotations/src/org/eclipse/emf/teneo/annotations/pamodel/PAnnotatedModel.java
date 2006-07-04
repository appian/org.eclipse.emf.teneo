/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedModel.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PAnnotated Model</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel#getPaEPackages <em>Pa EPackages</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtMostOnePackage DistinctGenerators'"
 * @generated
 */
public interface PAnnotatedModel extends EObject {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Pa EPackages</b></em>' containment reference list. The list contents are of
	 * type {@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage}. It is bidirectional and its opposite
	 * is '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getPaModel <em>Pa Model</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pa EPackages</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pa EPackages</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedModel_PaEPackages()
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getPaModel
	 * @model type="org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage" opposite="paModel" containment="true"
	 * @generated
	 */
	EList getPaEPackages();

	/**
	 * @return Returns the unique <code>PAnnotatedEModelElement</code> associated (via the
	 *         <code>annotatedElement</code> feature) to the given <code>EModelElement</code>.
	 */
	PAnnotatedEModelElement getPAnnotated(EModelElement e);

	/**
	 * @return Returns the unique <code>PAnnotatedEPackage</code> associated (via the <code>annotatedElement</code>
	 *         feature) to the given <code>EPackage</code>.
	 */
	PAnnotatedEPackage getPAnnotated(EPackage p);

	/**
	 * @return Returns the unique <code>PAnnotatedEClass</code> associated (via the <code>annotatedElement</code>
	 *         feature) to the given <code>EClass</code>.
	 */
	PAnnotatedEClass getPAnnotated(EClass c);

	/**
	 * @return Returns the unique <code>PAnnotatedEStructuralFeature</code> associated (via the
	 *         <code>annotatedElement</code> feature) to the given <code>EStructuralFeature</code>.
	 */
	PAnnotatedEStructuralFeature getPAnnotated(EStructuralFeature f);

	/**
	 * @return Returns the unique <code>PAnnotatedEAttribute</code> associated (via the <code>annotatedElement</code>
	 *         feature) to the given <code>EAttribute</code>.
	 */
	PAnnotatedEAttribute getPAnnotated(EAttribute f);

	/**
	 * @return Returns the unique <code>PAnnotatedEReference</code> associated (via the <code>annotatedElement</code>
	 *         feature) to the given <code>EReference</code>.
	 */
	PAnnotatedEReference getPAnnotated(EReference r);

	/**
	 * Returns a sequence generator on the basis of its name, if not found then an exception is thrown. efeature is
	 * passed for debugging purposes.
	 */
	public SequenceGenerator getSequenceGenerator(EStructuralFeature efeature, String name);

} // PAnnotatedModel
