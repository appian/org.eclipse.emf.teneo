/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Lu Node</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.LuNode#getLearningUnit <em>Learning Unit</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getLuNode()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface LuNode extends Node {
	/**
	 * Returns the value of the '<em><b>Learning Unit</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Learning Unit</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Learning Unit</em>' reference.
	 * @see #setLearningUnit(LearningUnit)
	 * @see lobj.LobjPackage#getLuNode_LearningUnit()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	LearningUnit getLearningUnit();

	/**
	 * Sets the value of the '{@link lobj.LuNode#getLearningUnit <em>Learning Unit</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Learning Unit</em>' reference.
	 * @see #getLearningUnit()
	 * @generated
	 */
	void setLearningUnit(LearningUnit value);

} // LuNode
