/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractContent.java,v 1.1 2006/11/23 06:12:08 mtaal Exp $
 */
package lobj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.AbstractContent#getHeading <em>Heading</em>}</li>
 *   <li>{@link lobj.AbstractContent#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getAbstractContent()
 * @model abstract="true"
 *        extendedMetaData="name='abstractContent' kind='elementOnly'"
 * @generated
 */
public interface AbstractContent extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #setHeading(String)
	 * @see lobj.LobjPackage#getAbstractContent_Heading()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='heading'"
	 * @generated
	 */
	String getHeading();

	/**
	 * Sets the value of the '{@link lobj.AbstractContent#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(Language)
	 * @see lobj.LobjPackage#getAbstractContent_Language()
	 * @model extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link lobj.AbstractContent#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

} // AbstractContent