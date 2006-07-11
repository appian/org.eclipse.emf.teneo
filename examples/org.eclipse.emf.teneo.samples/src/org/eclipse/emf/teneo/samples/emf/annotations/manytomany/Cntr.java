/**
 * <copyright>
 * </copyright>
 *
 * $Id: Cntr.java,v 1.1 2006/07/11 16:57:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.manytomany;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cntr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr#getRght <em>Rght</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr#getLft <em>Lft</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage#getCntr()
 * @model extendedMetaData="name='Cntr' kind='elementOnly'"
 * @generated
 */
public interface Cntr extends EObject {
	/**
	 * Returns the value of the '<em><b>Rght</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght#getCntr <em>Cntr</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rght</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rght</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage#getCntr_Rght()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght#getCntr
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght" opposite="cntr" resolveProxies="false" required="true"
	 *        annotation="http://annotation.elver.org/ManyToMany fetch='EAGER' cascade='MERGE PERSIST' targetEntity='Rght'"
	 *        annotation="http://annotation.elver.org/JoinTable name='RightCenter'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 *        extendedMetaData="kind='element' name='rght'"
	 * @generated
	 */
	EList getRght();

	/**
	 * Returns the value of the '<em><b>Lft</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft#getCntr <em>Cntr</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lft</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lft</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage#getCntr_Lft()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft#getCntr
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft" opposite="cntr" resolveProxies="false" required="true"
	 *        annotation="http://annotation.elver.org/ManyToMany fetch='EAGER' cascade='MERGE PERSIST' targetEntity='Lft'"
	 *        extendedMetaData="kind='element' name='lft'"
	 * @generated
	 */
	EList getLft();

} // Cntr
