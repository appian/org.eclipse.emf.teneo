/**
 * <copyright>
 * </copyright>
 *
 * $Id: DidacMeta.java,v 1.1 2006/11/23 06:12:07 mtaal Exp $
 */
package lobj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Didac Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.DidacMeta#getGoal <em>Goal</em>}</li>
 *   <li>{@link lobj.DidacMeta#getPrecognition <em>Precognition</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getDidacMeta()
 * @model extendedMetaData="name='didacMeta' kind='elementOnly'"
 * @generated
 */
public interface DidacMeta extends SimpleDidacMeta {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see #setGoal(String)
	 * @see lobj.LobjPackage#getDidacMeta_Goal()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='goal'"
	 * @generated
	 */
	String getGoal();

	/**
	 * Sets the value of the '{@link lobj.DidacMeta#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(String value);

	/**
	 * Returns the value of the '<em><b>Precognition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precognition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precognition</em>' containment reference.
	 * @see #setPrecognition(Precognition)
	 * @see lobj.LobjPackage#getDidacMeta_Precognition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precognition' namespace='##targetNamespace'"
	 * @generated
	 */
	Precognition getPrecognition();

	/**
	 * Sets the value of the '{@link lobj.DidacMeta#getPrecognition <em>Precognition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precognition</em>' containment reference.
	 * @see #getPrecognition()
	 * @generated
	 */
	void setPrecognition(Precognition value);

} // DidacMeta