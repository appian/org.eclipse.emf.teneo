/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMRepresentation.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.CSMRepresentation#getParent <em>Parent</em>}</li>
 *   <li>{@link datacore.CSMRepresentation#getChildren <em>Children</em>}</li>
 *   <li>{@link datacore.CSMRepresentation#isValid <em>Valid</em>}</li>
 *   <li>{@link datacore.CSMRepresentation#getRepresentationRoot <em>Representation Root</em>}</li>
 *   <li>{@link datacore.CSMRepresentation#getOwnerCSMClass <em>Owner CSM Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getCSMRepresentation()
 * @model abstract="true"
 * @generated
 */
public interface CSMRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacore.CSMRepresentation#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CSMRepresentation)
	 * @see datacore.DatacorePackage#getCSMRepresentation_Parent()
	 * @see datacore.CSMRepresentation#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	CSMRepresentation getParent();

	/**
	 * Sets the value of the '{@link datacore.CSMRepresentation#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CSMRepresentation value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link datacore.CSMRepresentation}.
	 * It is bidirectional and its opposite is '{@link datacore.CSMRepresentation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see datacore.DatacorePackage#getCSMRepresentation_Children()
	 * @see datacore.CSMRepresentation#getParent
	 * @model type="datacore.CSMRepresentation" opposite="parent" containment="true"
	 * @generated
	 */
	EList<CSMRepresentation> getChildren();

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see datacore.DatacorePackage#getCSMRepresentation_Valid()
	 * @model
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link datacore.CSMRepresentation#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Representation Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacore.CSMRepresentationRoot#getRepresentationTree <em>Representation Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Root</em>' container reference.
	 * @see #setRepresentationRoot(CSMRepresentationRoot)
	 * @see datacore.DatacorePackage#getCSMRepresentation_RepresentationRoot()
	 * @see datacore.CSMRepresentationRoot#getRepresentationTree
	 * @model opposite="representationTree"
	 * @generated
	 */
	CSMRepresentationRoot getRepresentationRoot();

	/**
	 * Sets the value of the '{@link datacore.CSMRepresentation#getRepresentationRoot <em>Representation Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Root</em>' container reference.
	 * @see #getRepresentationRoot()
	 * @generated
	 */
	void setRepresentationRoot(CSMRepresentationRoot value);

	/**
	 * Returns the value of the '<em><b>Owner CSM Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacore.CSMClass#getClassRepresentations <em>Class Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner CSM Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner CSM Class</em>' container reference.
	 * @see #setOwnerCSMClass(CSMClass)
	 * @see datacore.DatacorePackage#getCSMRepresentation_OwnerCSMClass()
	 * @see datacore.CSMClass#getClassRepresentations
	 * @model opposite="classRepresentations"
	 * @generated
	 */
	CSMClass getOwnerCSMClass();

	/**
	 * Sets the value of the '{@link datacore.CSMRepresentation#getOwnerCSMClass <em>Owner CSM Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner CSM Class</em>' container reference.
	 * @see #getOwnerCSMClass()
	 * @generated
	 */
	void setOwnerCSMClass(CSMClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void scrap();

} // CSMRepresentation
