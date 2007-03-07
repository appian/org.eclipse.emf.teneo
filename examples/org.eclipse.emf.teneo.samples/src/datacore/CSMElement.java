/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMElement.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.CSMElement#getReferencedElements <em>Referenced Elements</em>}</li>
 *   <li>{@link datacore.CSMElement#getCsmXML <em>Csm XML</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getCSMElement()
 * @model abstract="true"
 * @generated
 */
public interface CSMElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Elements</b></em>' reference list.
	 * The list contents are of type {@link datacore.CSMElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Elements</em>' reference list.
	 * @see datacore.DatacorePackage#getCSMElement_ReferencedElements()
	 * @model type="datacore.CSMElement"
	 * @generated
	 */
	EList<CSMElement> getReferencedElements();

	/**
	 * Returns the value of the '<em><b>Csm XML</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacore.CSMXML#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csm XML</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csm XML</em>' container reference.
	 * @see #setCsmXML(CSMXML)
	 * @see datacore.DatacorePackage#getCSMElement_CsmXML()
	 * @see datacore.CSMXML#getElements
	 * @model opposite="elements"
	 * @generated
	 */
	CSMXML getCsmXML();

	/**
	 * Sets the value of the '{@link datacore.CSMElement#getCsmXML <em>Csm XML</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csm XML</em>' container reference.
	 * @see #getCsmXML()
	 * @generated
	 */
	void setCsmXML(CSMXML value);

} // CSMElement
