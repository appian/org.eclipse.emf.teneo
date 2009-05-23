/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleVersion.java,v 1.1.2.1 2009/05/23 10:33:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz277546;

import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz277546.Bz277546Package#getSimpleVersion()
 * @model extendedMetaData="name='SimpleVersion' kind='elementOnly'"
 * @generated
 */
public interface SimpleVersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.Bz277546Package#getSimpleVersion_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="teneo.hibernate appinfo='\n\t\t\t\t\t\t@Id @GeneratedValue\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Date)
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.Bz277546Package#getSimpleVersion_Version()
	 * @model dataType="org.eclipse.emf.teneo.samples.issues.bz277546.TheDate" required="true"
	 *        annotation="teneo.hibernate appinfo='@Version  @Temporal(TIMESTAMP)'"
	 *        extendedMetaData="kind='element' name='version'"
	 * @generated
	 */
	Date getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Date value);

} // SimpleVersion
