/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataSourceDefinitions.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.DataSourceDefinitions#getOwnerClass <em>Owner Class</em>}</li>
 *   <li>{@link datacore.DataSourceDefinitions#getReport <em>Report</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getDataSourceDefinitions()
 * @model
 * @generated
 */
public interface DataSourceDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacore.CSMClass#getDatasourceDefinition <em>Datasource Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Class</em>' container reference.
	 * @see #setOwnerClass(CSMClass)
	 * @see datacore.DatacorePackage#getDataSourceDefinitions_OwnerClass()
	 * @see datacore.CSMClass#getDatasourceDefinition
	 * @model opposite="datasourceDefinition"
	 * @generated
	 */
	CSMClass getOwnerClass();

	/**
	 * Sets the value of the '{@link datacore.DataSourceDefinitions#getOwnerClass <em>Owner Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Class</em>' container reference.
	 * @see #getOwnerClass()
	 * @generated
	 */
	void setOwnerClass(CSMClass value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report</em>' attribute.
	 * @see #setReport(String)
	 * @see datacore.DatacorePackage#getDataSourceDefinitions_Report()
	 * @model
	 * @generated
	 */
	String getReport();

	/**
	 * Sets the value of the '{@link datacore.DataSourceDefinitions#getReport <em>Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report</em>' attribute.
	 * @see #getReport()
	 * @generated
	 */
	void setReport(String value);

} // DataSourceDefinitions
