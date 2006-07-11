/**
 * <copyright>
 * </copyright>
 *
 * $Id: XMLDeviant.java,v 1.1 2006/07/11 16:57:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Deviant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getNumPosts <em>Num Posts</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getFirstSubscribed <em>First Subscribed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getMailReader <em>Mail Reader</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionPackage#getXMLDeviant()
 * @model extendedMetaData="name='XML-Deviant' kind='elementOnly'"
 * @generated
 */
public interface XMLDeviant extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Posts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Posts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Posts</em>' attribute.
	 * @see #setNumPosts(BigInteger)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionPackage#getXMLDeviant_NumPosts()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='numPosts'"
	 * @generated
	 */
	BigInteger getNumPosts();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getNumPosts <em>Num Posts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Posts</em>' attribute.
	 * @see #getNumPosts()
	 * @generated
	 */
	void setNumPosts(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #isSetSignature()
	 * @see #unsetSignature()
	 * @see #setSignature(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionPackage#getXMLDeviant_Signature()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='signature'"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #isSetSignature()
	 * @see #unsetSignature()
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignature()
	 * @see #getSignature()
	 * @see #setSignature(String)
	 * @generated
	 */
	void unsetSignature();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getSignature <em>Signature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signature</em>' attribute is set.
	 * @see #unsetSignature()
	 * @see #getSignature()
	 * @see #setSignature(String)
	 * @generated
	 */
	boolean isSetSignature();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionPackage#getXMLDeviant_Email()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='email'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>First Subscribed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Subscribed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Subscribed</em>' attribute.
	 * @see #setFirstSubscribed(Object)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionPackage#getXMLDeviant_FirstSubscribed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='firstSubscribed'"
	 * @generated
	 */
	Object getFirstSubscribed();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getFirstSubscribed <em>First Subscribed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Subscribed</em>' attribute.
	 * @see #getFirstSubscribed()
	 * @generated
	 */
	void setFirstSubscribed(Object value);

	/**
	 * Returns the value of the '<em><b>Mail Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mail Reader</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail Reader</em>' attribute.
	 * @see #setMailReader(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.RestrictionPackage#getXMLDeviant_MailReader()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mailReader'"
	 * @generated
	 */
	String getMailReader();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.restriction.XMLDeviant#getMailReader <em>Mail Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail Reader</em>' attribute.
	 * @see #getMailReader()
	 * @generated
	 */
	void setMailReader(String value);

} // XMLDeviant
