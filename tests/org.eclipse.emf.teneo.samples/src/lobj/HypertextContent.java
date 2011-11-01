/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypertext Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.HypertextContent#getContent <em>Content</em>}</li>
 *   <li>{@link lobj.HypertextContent#getBlockAudiofile <em>Block Audiofile</em>}</li>
 *   <li>{@link lobj.HypertextContent#getResrcFile <em>Resrc File</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getHypertextContent()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface HypertextContent extends AbstractContent {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see lobj.LobjPackage#getHypertextContent_Content()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link lobj.HypertextContent#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Block Audiofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Audiofile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Audiofile</em>' containment reference.
	 * @see #setBlockAudiofile(BlockAudiofile)
	 * @see lobj.LobjPackage#getHypertextContent_BlockAudiofile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	BlockAudiofile getBlockAudiofile();

	/**
	 * Sets the value of the '{@link lobj.HypertextContent#getBlockAudiofile <em>Block Audiofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Audiofile</em>' containment reference.
	 * @see #getBlockAudiofile()
	 * @generated
	 */
	void setBlockAudiofile(BlockAudiofile value);

	/**
	 * Returns the value of the '<em><b>Resrc File</b></em>' reference list.
	 * The list contents are of type {@link lobj.ResrcFile}.
	 * It is bidirectional and its opposite is '{@link lobj.ResrcFile#getHypertextContent <em>Hypertext Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resrc File</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resrc File</em>' reference list.
	 * @see lobj.LobjPackage#getHypertextContent_ResrcFile()
	 * @see lobj.ResrcFile#getHypertextContent
	 * @model type="lobj.ResrcFile" opposite="hypertextContent"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getResrcFile();

} // HypertextContent
