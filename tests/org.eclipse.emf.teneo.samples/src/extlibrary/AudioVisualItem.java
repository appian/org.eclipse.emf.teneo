/**
 * <copyright>
 * </copyright>
 *
 * $Id: AudioVisualItem.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Visual Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extlibrary.AudioVisualItem#getTitle <em>Title</em>}</li>
 *   <li>{@link extlibrary.AudioVisualItem#getMinutesLength <em>Minutes Length</em>}</li>
 *   <li>{@link extlibrary.AudioVisualItem#isDamaged <em>Damaged</em>}</li>
 * </ul>
 * </p>
 *
 * @see extlibrary.ExtlibraryPackage#getAudioVisualItem()
 * @model abstract="true"
 * @generated
 */
public interface AudioVisualItem extends CirculatingItem {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see extlibrary.ExtlibraryPackage#getAudioVisualItem_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link extlibrary.AudioVisualItem#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Minutes Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minutes Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes Length</em>' attribute.
	 * @see #setMinutesLength(int)
	 * @see extlibrary.ExtlibraryPackage#getAudioVisualItem_MinutesLength()
	 * @model required="true"
	 * @generated
	 */
	int getMinutesLength();

	/**
	 * Sets the value of the '{@link extlibrary.AudioVisualItem#getMinutesLength <em>Minutes Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes Length</em>' attribute.
	 * @see #getMinutesLength()
	 * @generated
	 */
	void setMinutesLength(int value);

	/**
	 * Returns the value of the '<em><b>Damaged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damaged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damaged</em>' attribute.
	 * @see #setDamaged(boolean)
	 * @see extlibrary.ExtlibraryPackage#getAudioVisualItem_Damaged()
	 * @model
	 * @generated
	 */
	boolean isDamaged();

	/**
	 * Sets the value of the '{@link extlibrary.AudioVisualItem#isDamaged <em>Damaged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damaged</em>' attribute.
	 * @see #isDamaged()
	 * @generated
	 */
	void setDamaged(boolean value);

} // AudioVisualItem