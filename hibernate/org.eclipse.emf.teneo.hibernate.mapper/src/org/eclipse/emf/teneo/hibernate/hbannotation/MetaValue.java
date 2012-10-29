/**
 * <copyright>
 * </copyright>
 *
 * $Id: MetaValue.java,v 1.1 2009/06/27 09:19:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Meta Value</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.teneo.hibernate.hbannotation.MetaValue#getTargetEntity <em>Target Entity
 * </em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.MetaValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getMetaValue()
 * @model
 * @generated
 */
public interface MetaValue extends HbAnnotation {
	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Entity</em>' attribute.
	 * @see #setTargetEntity(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getMetaValue_TargetEntity()
	 * @model
	 * @generated
	 */
	String getTargetEntity();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.hbannotation.MetaValue#getTargetEntity
	 * <em>Target Entity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Target Entity</em>' attribute.
	 * @see #getTargetEntity()
	 * @generated
	 */
	void setTargetEntity(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage#getMetaValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the ' {@link org.eclipse.emf.teneo.hibernate.hbannotation.MetaValue#getValue
	 * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // MetaValue
