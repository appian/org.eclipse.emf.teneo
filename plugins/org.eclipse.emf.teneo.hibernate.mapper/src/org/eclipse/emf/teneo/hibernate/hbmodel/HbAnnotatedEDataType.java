/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEDataType.java,v 1.5 2007/07/04 19:31:48 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Hb Annotated EData Type</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType#getHbTypeDef <em>Hb Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbmodelPackage#getHbAnnotatedEDataType()
 * @model
 * @generated
 */
public interface HbAnnotatedEDataType extends PAnnotatedEDataType, HbAnnotatedETypeElement {
	/**
	 * Returns the value of the '<em><b>Hb Type Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hb Type Def</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hb Type Def</em>' containment reference.
	 * @see #setHbTypeDef(TypeDef)
	 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbmodelPackage#getHbAnnotatedEDataType_HbTypeDef()
	 * @model containment="true"
	 * @generated
	 */
	TypeDef getHbTypeDef();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEDataType#getHbTypeDef <em>Hb Type Def</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hb Type Def</em>' containment reference.
	 * @see #getHbTypeDef()
	 * @generated
	 */
	void setHbTypeDef(TypeDef value);

} // HbAnnotatedEDataType
