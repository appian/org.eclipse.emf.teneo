/**
 * <copyright>
 * </copyright>
 *
 * $Id: Book.java,v 1.1 2009/09/12 04:47:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz288963;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getCitation <em>Citation</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getParalist <em>Paralist</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getSelfdef <em>Selfdef</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getBook()
 * @model extendedMetaData="name='book' kind='elementOnly'"
 * @generated
 */
public interface Book extends EObject {
	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Citation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference.
	 * @see #setCitation(Book)
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getBook_Citation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citation'"
	 * @generated
	 */
	Book getCitation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getCitation <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' containment reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(Book value);

	/**
	 * Returns the value of the '<em><b>Paralist</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz288963.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paralist</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paralist</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getBook_Paralist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paralist'"
	 * @generated
	 */
	EList<Paragraph> getParalist();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getBook_Id()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Selfdef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selfdef</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selfdef</em>' attribute.
	 * @see #setSelfdef(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getBook_Selfdef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='selfdef'"
	 * @generated
	 */
	String getSelfdef();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getSelfdef <em>Selfdef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selfdef</em>' attribute.
	 * @see #getSelfdef()
	 * @generated
	 */
	void setSelfdef(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.issues.bz288963.Booktype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Booktype
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(Booktype)
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getBook_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Booktype getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Booktype
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(Booktype value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(Booktype)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(Booktype)
	 * @generated
	 */
	boolean isSetType();

} // Book
