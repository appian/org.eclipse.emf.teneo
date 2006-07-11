/**
 * <copyright>
 * </copyright>
 *
 * $Id: Lft.java,v 1.1 2006/07/11 16:57:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.manytomany;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft#getCntr <em>Cntr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage#getLft()
 * @model extendedMetaData="name='Lft' kind='elementOnly'"
 * @generated
 */
public interface Lft extends EObject {
	/**
	 * Returns the value of the '<em><b>Cntr</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr#getLft <em>Lft</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cntr</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cntr</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.ManytomanyPackage#getLft_Cntr()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr#getLft
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr" opposite="lft" resolveProxies="false" required="true"
	 *        annotation="http://annotation.elver.org/ManyToMany fetch='LAZY' cascade='MERGE PERSIST' targetEntity='Cntr' mappedBy='lft'"
	 *        extendedMetaData="kind='element' name='cntr'"
	 * @generated
	 */
	EList getCntr();

} // Lft
