/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMXML.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSMXML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.CSMXML#getElements <em>Elements</em>}</li>
 *   <li>{@link datacore.CSMXML#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getCSMXML()
 * @model
 * @generated
 */
public interface CSMXML extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link datacore.CSMElement}.
	 * It is bidirectional and its opposite is '{@link datacore.CSMElement#getCsmXML <em>Csm XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see datacore.DatacorePackage#getCSMXML_Elements()
	 * @see datacore.CSMElement#getCsmXML
	 * @model type="datacore.CSMElement" opposite="csmXML" containment="true"
	 * @generated
	 */
	EList<CSMElement> getElements();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link datacore.CSMType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see datacore.DatacorePackage#getCSMXML_Types()
	 * @model type="datacore.CSMType" containment="true"
	 * @generated
	 */
	EList<CSMType> getTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model csmClassRequired="true"
	 * @generated
	 */
	CSMInstance createCSMInstance(CSMClass csmClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSMClass createCSMClass(EFactory factory, EClass eClass);

} // CSMXML
