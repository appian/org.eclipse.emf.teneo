/**
 * <copyright>
 * </copyright>
 *
 * $Id: TwoCR.java,v 1.1 2006/07/11 16:57:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1ton;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two CR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getTwoCR()
 * @model extendedMetaData="name='TwoCR' kind='elementOnly'"
 * @generated
 */
public interface TwoCR extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getTwoCR_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwocr <em>Twocr</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' container reference.
	 * @see #setMain(Main)
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#getTwoCR_Main()
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main#getTwocr
	 * @model opposite="twocr"
	 * @generated
	 */
	Main getMain();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR#getMain <em>Main</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' container reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(Main value);

} // TwoCR
