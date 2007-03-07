/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMType.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see datacore.DatacorePackage#getCSMType()
 * @model abstract="true"
 * @generated
 */
public interface CSMType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueStringReprasentationRequired="true"
	 * @generated
	 */
	CSMValue createCSMValue(String valueStringReprasentation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isValid(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Interval createCSMInterval(String min, String max, boolean includeMin, boolean includeMax, String increment);

} // CSMType
