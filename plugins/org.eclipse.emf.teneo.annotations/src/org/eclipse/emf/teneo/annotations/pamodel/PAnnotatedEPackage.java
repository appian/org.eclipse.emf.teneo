/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEPackage.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PAnnotated EPackage</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getPaModel <em>Pa Model</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getAnnotatedEPackage <em>Annotated EPackage</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getPaEClasses <em>Pa EClasses</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getSequenceGenerator <em>Sequence Generator</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getTableGenerator <em>Table Generator</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEPackage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtMostOneEClass'"
 * @generated
 */
public interface PAnnotatedEPackage extends PAnnotatedEModelElement {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Pa Model</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel#getPaEPackages <em>Pa EPackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pa Model</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pa Model</em>' container reference.
	 * @see #setPaModel(PAnnotatedModel)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEPackage_PaModel()
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel#getPaEPackages
	 * @model opposite="paEPackages"
	 * @generated
	 */
	PAnnotatedModel getPaModel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getPaModel <em>Pa Model</em>}'
	 * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Pa Model</em>' container reference.
	 * @see #getPaModel()
	 * @generated
	 */
	void setPaModel(PAnnotatedModel value);

	/**
	 * Returns the value of the '<em><b>Annotated EPackage</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated EPackage</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Annotated EPackage</em>' reference.
	 * @see #setAnnotatedEPackage(EPackage)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEPackage_AnnotatedEPackage()
	 * @model required="true"
	 * @generated
	 */
	EPackage getAnnotatedEPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getAnnotatedEPackage <em>Annotated EPackage</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Annotated EPackage</em>' reference.
	 * @see #getAnnotatedEPackage()
	 * @generated
	 */
	void setAnnotatedEPackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Pa EClasses</b></em>' containment reference list. The list contents are of
	 * type {@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass}. It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPaEPackage <em>Pa EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pa EClasses</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pa EClasses</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEPackage_PaEClasses()
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass#getPaEPackage
	 * @model type="org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass" opposite="paEPackage" containment="true"
	 * @generated
	 */
	EList getPaEClasses();

	/**
	 * Returns the value of the '<em><b>Sequence Generator</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Generator</em>' containment reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sequence Generator</em>' containment reference.
	 * @see #setSequenceGenerator(SequenceGenerator)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEPackage_SequenceGenerator()
	 * @model containment="true"
	 * @generated
	 */
	SequenceGenerator getSequenceGenerator();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getSequenceGenerator <em>Sequence Generator</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sequence Generator</em>' containment reference.
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	void setSequenceGenerator(SequenceGenerator value);

	/**
	 * Returns the value of the '<em><b>Table Generator</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Generator</em>' containment reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Table Generator</em>' containment reference.
	 * @see #setTableGenerator(TableGenerator)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEPackage_TableGenerator()
	 * @model containment="true"
	 * @generated
	 */
	TableGenerator getTableGenerator();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage#getTableGenerator <em>Table Generator</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Table Generator</em>' containment reference.
	 * @see #getTableGenerator()
	 * @generated
	 */
	void setTableGenerator(TableGenerator value);

} // PAnnotatedEPackage
