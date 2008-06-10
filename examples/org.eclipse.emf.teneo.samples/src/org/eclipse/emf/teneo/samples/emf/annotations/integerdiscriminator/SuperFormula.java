/**
 * <copyright>
 * </copyright>
 *
 * $Id: SuperFormula.java,v 1.1 2008/06/10 08:25:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.SuperFormula#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.IntegerdiscriminatorPackage#getSuperFormula()
 * @model annotation="teneo.jpa value='@Inheritance(strategy = InheritanceType.SINGLE_TABLE)\n@DiscriminatorValue(\"1\")\n@DiscriminatorFormula(value=\u201ccase when name like \'R%\' then 0 when name like \'G%\' then 1 else 2 end\u201c)'"
 * @generated
 */
public interface SuperFormula extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.IntegerdiscriminatorPackage#getSuperFormula_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.SuperFormula#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SuperFormula
