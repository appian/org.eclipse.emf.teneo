/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEAttribute.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.Lob;
import org.eclipse.emf.teneo.annotations.pannotation.Temporal;
import org.eclipse.emf.teneo.annotations.pannotation.Type;
import org.eclipse.emf.teneo.annotations.pannotation.Version;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PAnnotated EAttribute</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getAnnotatedEAttribute <em>Annotated EAttribute</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getBasic <em>Basic</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getEnumerated <em>Enumerated</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getGeneratedValue <em>Generated Value</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getId <em>Id</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getLob <em>Lob</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getTemporal <em>Temporal</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getVersion <em>Version</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NotAnnotatedAsBasic GeneratedOnId
 *        DefinedGenerator IdOnEntityOrMappedSuper'"
 * @generated
 */
public interface PAnnotatedEAttribute extends PAnnotatedEStructuralFeature {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Annotated EAttribute</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated EAttribute</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Annotated EAttribute</em>' reference.
	 * @see #setAnnotatedEAttribute(EAttribute)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEAttribute_AnnotatedEAttribute()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getAnnotatedEAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getAnnotatedEAttribute <em>Annotated EAttribute</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Annotated EAttribute</em>' reference.
	 * @see #getAnnotatedEAttribute()
	 * @generated
	 */
	void setAnnotatedEAttribute(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Basic</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Basic</em>' containment reference.
	 * @see #setBasic(Basic)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEAttribute_Basic()
	 * @model containment="true"
	 * @generated
	 */
	Basic getBasic();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getBasic <em>Basic</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Basic</em>' containment reference.
	 * @see #getBasic()
	 * @generated
	 */
	void setBasic(Basic value);

	/**
	 * Returns the value of the '<em><b>Enumerated</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerated</em>' containment reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enumerated</em>' containment reference.
	 * @see #setEnumerated(Enumerated)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEAttribute_Enumerated()
	 * @model containment="true"
	 * @generated
	 */
	Enumerated getEnumerated();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getEnumerated <em>Enumerated</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Enumerated</em>' containment reference.
	 * @see #getEnumerated()
	 * @generated
	 */
	void setEnumerated(Enumerated value);

	/**
	 * Returns the value of the '<em><b>Generated Value</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Value</em>' containment reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Generated Value</em>' containment reference.
	 * @see #setGeneratedValue(GeneratedValue)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEAttribute_GeneratedValue()
	 * @model containment="true"
	 * @generated
	 */
	GeneratedValue getGeneratedValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getGeneratedValue <em>Generated Value</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Generated Value</em>' containment reference.
	 * @see #getGeneratedValue()
	 * @generated
	 */
	void setGeneratedValue(GeneratedValue value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(Id)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEAttribute_Id()
	 * @model containment="true"
	 * @generated
	 */
	Id getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getId <em>Id</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Id value);

	/**
	 * Returns the value of the '<em><b>Lob</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lob</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lob</em>' containment reference.
	 * @see #setLob(Lob)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEAttribute_Lob()
	 * @model containment="true"
	 * @generated
	 */
	Lob getLob();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getLob <em>Lob</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Lob</em>' containment reference.
	 * @see #getLob()
	 * @generated
	 */
	void setLob(Lob value);

	/**
	 * Returns the value of the '<em><b>Temporal</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Temporal</em>' containment reference.
	 * @see #setTemporal(Temporal)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEAttribute_Temporal()
	 * @model containment="true"
	 * @generated
	 */
	Temporal getTemporal();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getTemporal <em>Temporal</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Temporal</em>' containment reference.
	 * @see #getTemporal()
	 * @generated
	 */
	void setTemporal(Temporal value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(Version)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEAttribute_Version()
	 * @model containment="true"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getVersion <em>Version</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage#getPAnnotatedEAttribute_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute#getType <em>Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns true if the eattribute requires an additional mapping for the isset member which is generated by emf.
	 */
	boolean requiresIsSetMapping();

} // PAnnotatedEAttribute
