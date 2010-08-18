/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyToAny.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many To Any</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getMetaValue <em>Meta Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getIdType <em>Id Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getMetaType <em>Meta Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToAny()
 * @model extendedMetaData="name='many-to-any' kind='elementOnly'"
 * @generated
 */
public interface ManyToAny extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.MetaValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Value</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToAny_MetaValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meta-value'"
	 * @generated
	 */
	EList<MetaValue> getMetaValue();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference.
	 * @see #setColumn(Column)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToAny_Column()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='column'"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getColumn <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' containment reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Column1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column1</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToAny_Column1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='column'"
	 * @generated
	 */
	EList<Column> getColumn1();

	/**
	 * Returns the value of the '<em><b>Id Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Type</em>' attribute.
	 * @see #setIdType(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToAny_IdType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id-type'"
	 * @generated
	 */
	String getIdType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getIdType <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Type</em>' attribute.
	 * @see #getIdType()
	 * @generated
	 */
	void setIdType(String value);

	/**
	 * Returns the value of the '<em><b>Meta Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Type</em>' attribute.
	 * @see #setMetaType(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToAny_MetaType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='meta-type'"
	 * @generated
	 */
	String getMetaType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToAny#getMetaType <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Type</em>' attribute.
	 * @see #getMetaType()
	 * @generated
	 */
	void setMetaType(String value);

} // ManyToAny
