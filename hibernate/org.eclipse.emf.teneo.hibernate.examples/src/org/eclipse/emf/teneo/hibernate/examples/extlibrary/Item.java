/**
 * <copyright>
 * </copyright>
 *
 * $Id: Item.java,v 1.2 2010/03/02 06:08:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.examples.extlibrary;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Item</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Item#getPublicationDate <em>
 * Publication Date</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getItem()
 * @model abstract="true"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication Date</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Publication Date</em>' attribute.
	 * @see #setPublicationDate(Date)
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getItem_PublicationDate()
	 * @model
	 * @generated
	 */
	Date getPublicationDate();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Item#getPublicationDate
	 * <em>Publication Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Publication Date</em>' attribute.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(Date value);

} // Item
