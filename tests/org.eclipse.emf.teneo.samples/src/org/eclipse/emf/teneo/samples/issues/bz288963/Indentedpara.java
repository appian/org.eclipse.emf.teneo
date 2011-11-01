/**
 * <copyright>
 * </copyright>
 *
 * $Id: Indentedpara.java,v 1.1 2009/09/12 04:47:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz288963;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indentedpara</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz288963.Indentedpara#getIndentSpace <em>Indent Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getIndentedpara()
 * @model extendedMetaData="name='indentedpara' kind='empty'"
 * @generated
 */
public interface Indentedpara extends Paragraph {
	/**
	 * Returns the value of the '<em><b>Indent Space</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indent Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indent Space</em>' attribute.
	 * @see #isSetIndentSpace()
	 * @see #unsetIndentSpace()
	 * @see #setIndentSpace(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package#getIndentedpara_IndentSpace()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='IndentSpace'"
	 * @generated
	 */
	long getIndentSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Indentedpara#getIndentSpace <em>Indent Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indent Space</em>' attribute.
	 * @see #isSetIndentSpace()
	 * @see #unsetIndentSpace()
	 * @see #getIndentSpace()
	 * @generated
	 */
	void setIndentSpace(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Indentedpara#getIndentSpace <em>Indent Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndentSpace()
	 * @see #getIndentSpace()
	 * @see #setIndentSpace(long)
	 * @generated
	 */
	void unsetIndentSpace();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Indentedpara#getIndentSpace <em>Indent Space</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indent Space</em>' attribute is set.
	 * @see #unsetIndentSpace()
	 * @see #getIndentSpace()
	 * @see #setIndentSpace(long)
	 * @generated
	 */
	boolean isSetIndentSpace();

} // Indentedpara
