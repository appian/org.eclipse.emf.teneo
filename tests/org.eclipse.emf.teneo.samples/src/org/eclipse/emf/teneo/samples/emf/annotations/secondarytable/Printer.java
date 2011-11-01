/**
 * <copyright>
 * </copyright>
 *
 * $Id: Printer.java,v 1.3 2006/09/13 10:39:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.secondarytable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Printer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getMake <em>Make</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getTonerMake <em>Toner Make</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getTonerModel <em>Toner Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytablePackage#getPrinter()
 * @model annotation="teneo.jpa appinfo='\n\t\t\t\t@SecondaryTable(name=\"THETONER\" pkJoinColumns={@PrimaryKeyJoinColumn(name=\"PRINTER_ID\")})\n\t\t'"
 *        extendedMetaData="name='Printer' kind='elementOnly'"
 * @generated
 */
public interface Printer extends EObject {
	/**
	 * Returns the value of the '<em><b>Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Make</em>' attribute.
	 * @see #setMake(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytablePackage#getPrinter_Make()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='make'"
	 * @generated
	 */
	String getMake();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getMake <em>Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make</em>' attribute.
	 * @see #getMake()
	 * @generated
	 */
	void setMake(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytablePackage#getPrinter_Model()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='model'"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Toner Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toner Make</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toner Make</em>' attribute.
	 * @see #setTonerMake(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytablePackage#getPrinter_TonerMake()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='@Column(table=\"THETONER\")'"
	 *        extendedMetaData="kind='element' name='tonerMake'"
	 * @generated
	 */
	String getTonerMake();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getTonerMake <em>Toner Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toner Make</em>' attribute.
	 * @see #getTonerMake()
	 * @generated
	 */
	void setTonerMake(String value);

	/**
	 * Returns the value of the '<em><b>Toner Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toner Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toner Model</em>' attribute.
	 * @see #setTonerModel(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytablePackage#getPrinter_TonerModel()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='@Column(table=\"THETONER\")'"
	 *        extendedMetaData="kind='element' name='tonerModel'"
	 * @generated
	 */
	String getTonerModel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.Printer#getTonerModel <em>Toner Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toner Model</em>' attribute.
	 * @see #getTonerModel()
	 * @generated
	 */
	void setTonerModel(String value);

} // Printer
