/**
 * <copyright>
 * </copyright>
 *
 * $Id: TWriter.java,v 1.1 2007/07/09 14:02:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.transientotm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>TWriter</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter#getName <em>Name</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter#getBook <em>Book</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmPackage#getTWriter()
 * @model extendedMetaData="name='TWriter' kind='elementOnly'"
 * @generated
 */
public interface TWriter extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmPackage#getTWriter_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Book</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Book</em>' reference.
	 * @see #setBook(TBook)
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmPackage#getTWriter_Book()
	 * @model extendedMetaData="kind='element' name='book'"
	 * @generated
	 */
	TBook getBook();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter#getBook <em>Book</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Book</em>' reference.
	 * @see #getBook()
	 * @generated
	 */
	void setBook(TBook value);

} // TWriter
