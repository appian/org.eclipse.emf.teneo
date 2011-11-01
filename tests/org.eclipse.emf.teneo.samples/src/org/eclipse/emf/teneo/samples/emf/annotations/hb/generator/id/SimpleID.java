/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleID.java,v 1.5 2009/02/25 20:08:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id;

import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID#getAutoID <em>Auto ID</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID#getGenerated <em>Generated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdPackage#getSimpleID()
 * @model extendedMetaData="name='SimpleID' kind='elementOnly'"
 * @generated
 */
public interface SimpleID extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto ID</em>' attribute.
	 * @see #isSetAutoID()
	 * @see #unsetAutoID()
	 * @see #setAutoID(long)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdPackage#getSimpleID_AutoID()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        annotation="teneo.hibernate appinfo='\n\t\t\t\t\t\t@Id @GeneratedValue @Column(name=\"AUTOD\")\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='autoID'"
	 * @generated
	 */
	long getAutoID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID#getAutoID <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto ID</em>' attribute.
	 * @see #isSetAutoID()
	 * @see #unsetAutoID()
	 * @see #getAutoID()
	 * @generated
	 */
	void setAutoID(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID#getAutoID <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoID()
	 * @see #getAutoID()
	 * @see #setAutoID(long)
	 * @generated
	 */
	void unsetAutoID();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID#getAutoID <em>Auto ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto ID</em>' attribute is set.
	 * @see #unsetAutoID()
	 * @see #getAutoID()
	 * @see #setAutoID(long)
	 * @generated
	 */
	boolean isSetAutoID();

	/**
	 * Returns the value of the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated</em>' attribute.
	 * @see #isSetGenerated()
	 * @see #unsetGenerated()
	 * @see #setGenerated(long)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdPackage#getSimpleID_Generated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="teneo.hibernate appinfo='@Version @Generated(ALWAYS)'"
	 *        extendedMetaData="kind='element' name='generated'"
	 * @generated
	 */
	long getGenerated();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID#getGenerated <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated</em>' attribute.
	 * @see #isSetGenerated()
	 * @see #unsetGenerated()
	 * @see #getGenerated()
	 * @generated
	 */
	void setGenerated(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID#getGenerated <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenerated()
	 * @see #getGenerated()
	 * @see #setGenerated(long)
	 * @generated
	 */
	void unsetGenerated();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.SimpleID#getGenerated <em>Generated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Generated</em>' attribute is set.
	 * @see #unsetGenerated()
	 * @see #getGenerated()
	 * @see #setGenerated(long)
	 * @generated
	 */
	boolean isSetGenerated();

} // SimpleID