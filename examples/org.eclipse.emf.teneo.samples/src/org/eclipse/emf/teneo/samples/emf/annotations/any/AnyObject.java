/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnyObject.java,v 1.2.2.2 2009/06/30 07:30:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.any;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getGlobalInt <em>Global Int</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getGlobalString <em>Global String</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getAnyOne <em>Any One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getAny1 <em>Any1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getAnyObject()
 * @model extendedMetaData="name='AnyObject' kind='elementOnly'"
 * @generated
 */
public interface AnyObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getAnyObject_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='@Id'"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Global Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Int</em>' attribute.
	 * @see #isSetGlobalInt()
	 * @see #unsetGlobalInt()
	 * @see #setGlobalInt(int)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getAnyObject_GlobalInt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='globalInt' namespace='##targetNamespace'"
	 * @generated
	 */
	int getGlobalInt();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getGlobalInt <em>Global Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Int</em>' attribute.
	 * @see #isSetGlobalInt()
	 * @see #unsetGlobalInt()
	 * @see #getGlobalInt()
	 * @generated
	 */
	void setGlobalInt(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getGlobalInt <em>Global Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGlobalInt()
	 * @see #getGlobalInt()
	 * @see #setGlobalInt(int)
	 * @generated
	 */
	void unsetGlobalInt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getGlobalInt <em>Global Int</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Global Int</em>' attribute is set.
	 * @see #unsetGlobalInt()
	 * @see #getGlobalInt()
	 * @see #setGlobalInt(int)
	 * @generated
	 */
	boolean isSetGlobalInt();

	/**
	 * Returns the value of the '<em><b>Global String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global String</em>' attribute.
	 * @see #setGlobalString(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getAnyObject_GlobalString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='globalString' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGlobalString();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getGlobalString <em>Global String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global String</em>' attribute.
	 * @see #getGlobalString()
	 * @generated
	 */
	void setGlobalString(String value);

	/**
	 * Returns the value of the '<em><b>Any One</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any One</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any One</em>' containment reference.
	 * @see #setAnyOne(EObject)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getAnyObject_AnyOne()
	 * @model containment="true" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@Any( metaColumn = @Column( name =\n\t\t\t\t\t\t\"any_type\" ), fetch=FetchType.EAGER\n\t\t\t\t\t\t)\n\t\t\t\t\t\t@AnyMetaDef(idType =\n\t\t\t\t\t\t\"string\",metaType = \"string\") \n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='anyOne'"
	 * @generated
	 */
	EObject getAnyOne();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject#getAnyOne <em>Any One</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any One</em>' containment reference.
	 * @see #getAnyOne()
	 * @generated
	 */
	void setAnyOne(EObject value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getAnyObject_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@Any( metaColumn = @Column( name =\n\t\t\t\t\t\t\"any_type\" ), fetch=FetchType.EAGER\n\t\t\t\t\t\t)\n\t\t\t\t\t\t@AnyMetaDef(idType =\n\t\t\t\t\t\t\"string\",metaType = \"string\") \n\t\t\t\t\t'"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getAnyObject_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:5'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Any1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any1</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getAnyObject_Any1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t\t@Any( metaColumn = @Column( name =\n\t\t\t\t\t\t\t\"any_type\" ), fetch=FetchType.EAGER\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t@AnyMetaDef(idType =\n\t\t\t\t\t\t\t\"string\",metaType = \"string\") \n\t\t\t\t\t'"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':6' processing='lax' group='#group:5'"
	 * @generated
	 */
	FeatureMap getAny1();

} // AnyObject
