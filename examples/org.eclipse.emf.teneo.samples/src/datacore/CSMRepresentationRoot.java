/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMRepresentationRoot.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSM Representation Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.CSMRepresentationRoot#getName <em>Name</em>}</li>
 *   <li>{@link datacore.CSMRepresentationRoot#getModelName <em>Model Name</em>}</li>
 *   <li>{@link datacore.CSMRepresentationRoot#getCsmInstance <em>Csm Instance</em>}</li>
 *   <li>{@link datacore.CSMRepresentationRoot#getRepresentationTree <em>Representation Tree</em>}</li>
 *   <li>{@link datacore.CSMRepresentationRoot#getValueDescriptors <em>Value Descriptors</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getCSMRepresentationRoot()
 * @model
 * @generated
 */
public interface CSMRepresentationRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see datacore.DatacorePackage#getCSMRepresentationRoot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link datacore.CSMRepresentationRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see datacore.DatacorePackage#getCSMRepresentationRoot_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link datacore.CSMRepresentationRoot#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Csm Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacore.CSMInstance#getCsmReprasentation <em>Csm Reprasentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csm Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csm Instance</em>' container reference.
	 * @see #setCsmInstance(CSMInstance)
	 * @see datacore.DatacorePackage#getCSMRepresentationRoot_CsmInstance()
	 * @see datacore.CSMInstance#getCsmReprasentation
	 * @model opposite="csmReprasentation"
	 * @generated
	 */
	CSMInstance getCsmInstance();

	/**
	 * Sets the value of the '{@link datacore.CSMRepresentationRoot#getCsmInstance <em>Csm Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csm Instance</em>' container reference.
	 * @see #getCsmInstance()
	 * @generated
	 */
	void setCsmInstance(CSMInstance value);

	/**
	 * Returns the value of the '<em><b>Representation Tree</b></em>' containment reference.
	 * The default value is <code>""</code>.
	 * It is bidirectional and its opposite is '{@link datacore.CSMRepresentation#getRepresentationRoot <em>Representation Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Tree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Tree</em>' containment reference.
	 * @see #setRepresentationTree(CSMRepresentation)
	 * @see datacore.DatacorePackage#getCSMRepresentationRoot_RepresentationTree()
	 * @see datacore.CSMRepresentation#getRepresentationRoot
	 * @model opposite="representationRoot" containment="true"
	 * @generated
	 */
	CSMRepresentation getRepresentationTree();

	/**
	 * Sets the value of the '{@link datacore.CSMRepresentationRoot#getRepresentationTree <em>Representation Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Tree</em>' containment reference.
	 * @see #getRepresentationTree()
	 * @generated
	 */
	void setRepresentationTree(CSMRepresentation value);

	/**
	 * Returns the value of the '<em><b>Value Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link datacore.CSMRepresentationRootDescriptor}.
	 * It is bidirectional and its opposite is '{@link datacore.CSMRepresentationRootDescriptor#getRepresentationRoot <em>Representation Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Descriptors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Descriptors</em>' containment reference list.
	 * @see datacore.DatacorePackage#getCSMRepresentationRoot_ValueDescriptors()
	 * @see datacore.CSMRepresentationRootDescriptor#getRepresentationRoot
	 * @model type="datacore.CSMRepresentationRootDescriptor" opposite="representationRoot" containment="true"
	 * @generated
	 */
	EList<CSMRepresentationRootDescriptor> getValueDescriptors();

} // CSMRepresentationRoot
