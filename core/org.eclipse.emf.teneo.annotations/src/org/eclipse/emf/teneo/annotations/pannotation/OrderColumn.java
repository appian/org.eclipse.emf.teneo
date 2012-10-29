/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.annotations.pannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Order Column</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#isNullable <em>Nullable
 * </em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#isInsertable <em>Insertable
 * </em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#isUpdatable <em>Updatable
 * </em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#getColumnDefinition <em>
 * Column Definition</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getOrderColumn()
 * @model annotation="teneo/internal/Target 0='EStructuralFeature'" annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore constraints='ScalePrecisionForNumeric LengthForString'"
 * @generated
 */
public interface OrderColumn extends PAnnotation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getOrderColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute. The default value is
	 * <code>"true"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #isSetNullable()
	 * @see #unsetNullable()
	 * @see #setNullable(boolean)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getOrderColumn_Nullable()
	 * @model default="true" unsettable="true"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#isNullable <em>Nullable</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Nullable</em>' attribute.
	 * @see #isSetNullable()
	 * @see #unsetNullable()
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#isNullable <em>Nullable</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetNullable()
	 * @see #isNullable()
	 * @see #setNullable(boolean)
	 * @generated
	 */
	void unsetNullable();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#isNullable <em>Nullable</em>}'
	 * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Nullable</em>' attribute is set.
	 * @see #unsetNullable()
	 * @see #isNullable()
	 * @see #setNullable(boolean)
	 * @generated
	 */
	boolean isSetNullable();

	/**
	 * Returns the value of the '<em><b>Insertable</b></em>' attribute. The default value is
	 * <code>"true"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertable</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Insertable</em>' attribute.
	 * @see #setInsertable(boolean)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getOrderColumn_Insertable()
	 * @model default="true"
	 * @generated
	 */
	boolean isInsertable();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#isInsertable
	 * <em>Insertable</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Insertable</em>' attribute.
	 * @see #isInsertable()
	 * @generated
	 */
	void setInsertable(boolean value);

	/**
	 * Returns the value of the '<em><b>Updatable</b></em>' attribute. The default value is
	 * <code>"true"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updatable</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Updatable</em>' attribute.
	 * @see #setUpdatable(boolean)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getOrderColumn_Updatable()
	 * @model default="true"
	 * @generated
	 */
	boolean isUpdatable();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#isUpdatable
	 * <em>Updatable</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Updatable</em>' attribute.
	 * @see #isUpdatable()
	 * @generated
	 */
	void setUpdatable(boolean value);

	/**
	 * Returns the value of the '<em><b>Column Definition</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Definition</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Column Definition</em>' attribute.
	 * @see #setColumnDefinition(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getOrderColumn_ColumnDefinition()
	 * @model
	 * @generated
	 */
	String getColumnDefinition();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.annotations.pannotation.OrderColumn#getColumnDefinition
	 * <em>Column Definition</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Column Definition</em>' attribute.
	 * @see #getColumnDefinition()
	 * @generated
	 */
	void setColumnDefinition(String value);

} // OrderColumn
