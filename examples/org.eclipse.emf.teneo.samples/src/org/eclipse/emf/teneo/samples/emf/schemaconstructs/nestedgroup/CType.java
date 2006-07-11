/**
 * <copyright>
 * </copyright>
 *
 * $Id: CType.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.CType#getCname <em>Cname</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.CType#getCvalue <em>Cvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.NestedgroupPackage#getCType()
 * @model extendedMetaData="name='cType' kind='elementOnly'"
 * @generated
 */
public interface CType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cname</em>' attribute.
	 * @see #setCname(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.NestedgroupPackage#getCType_Cname()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='cname'"
	 * @generated
	 */
	String getCname();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.CType#getCname <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cname</em>' attribute.
	 * @see #getCname()
	 * @generated
	 */
	void setCname(String value);

	/**
	 * Returns the value of the '<em><b>Cvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cvalue</em>' attribute.
	 * @see #isSetCvalue()
	 * @see #unsetCvalue()
	 * @see #setCvalue(double)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.NestedgroupPackage#getCType_Cvalue()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='cvalue'"
	 * @generated
	 */
	double getCvalue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.CType#getCvalue <em>Cvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cvalue</em>' attribute.
	 * @see #isSetCvalue()
	 * @see #unsetCvalue()
	 * @see #getCvalue()
	 * @generated
	 */
	void setCvalue(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.CType#getCvalue <em>Cvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCvalue()
	 * @see #getCvalue()
	 * @see #setCvalue(double)
	 * @generated
	 */
	void unsetCvalue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.CType#getCvalue <em>Cvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cvalue</em>' attribute is set.
	 * @see #unsetCvalue()
	 * @see #getCvalue()
	 * @see #setCvalue(double)
	 * @generated
	 */
	boolean isSetCvalue();

} // CType
