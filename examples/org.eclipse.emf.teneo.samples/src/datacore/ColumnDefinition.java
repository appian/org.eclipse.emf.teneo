/**
 * <copyright>
 * </copyright>
 *
 * $Id: ColumnDefinition.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.ColumnDefinition#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link datacore.ColumnDefinition#getDatasetName <em>Dataset Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getColumnDefinition()
 * @model
 * @generated
 */
public interface ColumnDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see datacore.DatacorePackage#getColumnDefinition_ColumnName()
	 * @model
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link datacore.ColumnDefinition#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Dataset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataset Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Name</em>' attribute.
	 * @see #setDatasetName(String)
	 * @see datacore.DatacorePackage#getColumnDefinition_DatasetName()
	 * @model
	 * @generated
	 */
	String getDatasetName();

	/**
	 * Sets the value of the '{@link datacore.ColumnDefinition#getDatasetName <em>Dataset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset Name</em>' attribute.
	 * @see #getDatasetName()
	 * @generated
	 */
	void setDatasetName(String value);

} // ColumnDefinition
