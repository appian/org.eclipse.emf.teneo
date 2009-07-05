/**
 * <copyright>
 * </copyright>
 *
 * $Id: Foo.java,v 1.1 2009/07/05 00:09:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz282414;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getBagOfBars <em>Bag Of Bars</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getDnmSK <em>Dnm SK</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package#getFoo()
 * @model annotation="teneo.jpa appinfo='@Entity @Table( name=\"FOO_TABLE\"\n\t\t\t\t)'"
 *        extendedMetaData="name='Foo' kind='elementOnly'"
 * @generated
 */
public interface Foo extends EObject {
	/**
	 * Returns the value of the '<em><b>Bag Of Bars</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz282414.Bar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bag Of Bars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bag Of Bars</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package#getFoo_BagOfBars()
	 * @model containment="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@OneToMany(fetch=FetchType.LAZY, indexed=false)\n\t\t\t\t\t\t@JoinColumn(name=\"GRP_ID\", referencedColumnName=\"CLI_ID\")\n'"
	 *        extendedMetaData="kind='element' name='BagOfBars'"
	 * @generated
	 */
	EList<Bar> getBagOfBars();

	/**
	 * Returns the value of the '<em><b>Client Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Id</em>' attribute.
	 * @see #isSetClientId()
	 * @see #unsetClientId()
	 * @see #setClientId(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package#getFoo_ClientId()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="teneo.jpa appinfo='@Column(name=\"CLI_ID\",\n\t\t\t\t\tlength=\"8\")'"
	 *        extendedMetaData="kind='attribute' name='clientId'"
	 * @generated
	 */
	String getClientId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getClientId <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Id</em>' attribute.
	 * @see #isSetClientId()
	 * @see #unsetClientId()
	 * @see #getClientId()
	 * @generated
	 */
	void setClientId(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getClientId <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientId()
	 * @see #getClientId()
	 * @see #setClientId(String)
	 * @generated
	 */
	void unsetClientId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getClientId <em>Client Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Id</em>' attribute is set.
	 * @see #unsetClientId()
	 * @see #getClientId()
	 * @see #setClientId(String)
	 * @generated
	 */
	boolean isSetClientId();

	/**
	 * Returns the value of the '<em><b>Dnm SK</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dnm SK</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dnm SK</em>' attribute.
	 * @see #isSetDnmSK()
	 * @see #unsetDnmSK()
	 * @see #setDnmSK(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package#getFoo_DnmSK()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t@Id @Column(name=\"DNM_SK\", nullable=\"false\",insertable = true,\n\t\t\t\t\tupdatable = false)\n\t\t\t\t\t@GeneratedValue\n\t\t\t\t'"
	 *        extendedMetaData="kind='attribute' name='dnmSK'"
	 * @generated
	 */
	long getDnmSK();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getDnmSK <em>Dnm SK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dnm SK</em>' attribute.
	 * @see #isSetDnmSK()
	 * @see #unsetDnmSK()
	 * @see #getDnmSK()
	 * @generated
	 */
	void setDnmSK(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getDnmSK <em>Dnm SK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDnmSK()
	 * @see #getDnmSK()
	 * @see #setDnmSK(long)
	 * @generated
	 */
	void unsetDnmSK();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.Foo#getDnmSK <em>Dnm SK</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dnm SK</em>' attribute is set.
	 * @see #unsetDnmSK()
	 * @see #getDnmSK()
	 * @see #setDnmSK(long)
	 * @generated
	 */
	boolean isSetDnmSK();

} // Foo
