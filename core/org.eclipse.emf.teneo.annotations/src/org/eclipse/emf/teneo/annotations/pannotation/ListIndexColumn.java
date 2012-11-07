/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListIndexColumn.java,v 1.1 2009/12/13 10:14:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>List Index Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.ListIndexColumn#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getListIndexColumn()
 * @model annotation="teneo/internal/Target 0='EStructuralFeature'"
 * @generated
 */
public interface ListIndexColumn extends PAnnotation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getListIndexColumn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.ListIndexColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ListIndexColumn
