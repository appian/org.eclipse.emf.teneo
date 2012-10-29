/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Resrc Filetype</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.ResrcFiletype#getFiletypeExtension <em>Filetype Extension</em>}</li>
 * <li>{@link lobj.ResrcFiletype#getFiletypeDesc <em>Filetype Desc</em>}</li>
 * <li>{@link lobj.ResrcFiletype#isImage <em>Image</em>}</li>
 * <li>{@link lobj.ResrcFiletype#isApplet <em>Applet</em>}</li>
 * <li>{@link lobj.ResrcFiletype#getFiletypeImageSmall <em>Filetype Image Small</em>}</li>
 * <li>{@link lobj.ResrcFiletype#getFiletypeImageBif <em>Filetype Image Bif</em>}</li>
 * <li>{@link lobj.ResrcFiletype#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getResrcFiletype()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface ResrcFiletype extends EObject {
	/**
	 * Returns the value of the '<em><b>Filetype Extension</b></em>' attribute. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Filetype Extension</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Filetype Extension</em>' attribute.
	 * @see #setFiletypeExtension(String)
	 * @see lobj.LobjPackage#getResrcFiletype_FiletypeExtension()
	 * @model extendedMetaData="kind='element'"
	 * @generated
	 */
	String getFiletypeExtension();

	/**
	 * Sets the value of the '{@link lobj.ResrcFiletype#getFiletypeExtension
	 * <em>Filetype Extension</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Filetype Extension</em>' attribute.
	 * @see #getFiletypeExtension()
	 * @generated
	 */
	void setFiletypeExtension(String value);

	/**
	 * Returns the value of the '<em><b>Filetype Desc</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filetype Desc</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Filetype Desc</em>' attribute.
	 * @see #setFiletypeDesc(String)
	 * @see lobj.LobjPackage#getResrcFiletype_FiletypeDesc()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getFiletypeDesc();

	/**
	 * Sets the value of the '{@link lobj.ResrcFiletype#getFiletypeDesc <em>Filetype Desc</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Filetype Desc</em>' attribute.
	 * @see #getFiletypeDesc()
	 * @generated
	 */
	void setFiletypeDesc(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(boolean)
	 * @see lobj.LobjPackage#getResrcFiletype_Image()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	boolean isImage();

	/**
	 * Sets the value of the '{@link lobj.ResrcFiletype#isImage <em>Image</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Image</em>' attribute.
	 * @see #isImage()
	 * @generated
	 */
	void setImage(boolean value);

	/**
	 * Returns the value of the '<em><b>Applet</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applet</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Applet</em>' attribute.
	 * @see #setApplet(boolean)
	 * @see lobj.LobjPackage#getResrcFiletype_Applet()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	boolean isApplet();

	/**
	 * Sets the value of the '{@link lobj.ResrcFiletype#isApplet <em>Applet</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Applet</em>' attribute.
	 * @see #isApplet()
	 * @generated
	 */
	void setApplet(boolean value);

	/**
	 * Returns the value of the '<em><b>Filetype Image Small</b></em>' attribute. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Filetype Image Small</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Filetype Image Small</em>' attribute.
	 * @see #setFiletypeImageSmall(String)
	 * @see lobj.LobjPackage#getResrcFiletype_FiletypeImageSmall()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getFiletypeImageSmall();

	/**
	 * Sets the value of the '{@link lobj.ResrcFiletype#getFiletypeImageSmall
	 * <em>Filetype Image Small</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Filetype Image Small</em>' attribute.
	 * @see #getFiletypeImageSmall()
	 * @generated
	 */
	void setFiletypeImageSmall(String value);

	/**
	 * Returns the value of the '<em><b>Filetype Image Bif</b></em>' attribute. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Filetype Image Bif</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Filetype Image Bif</em>' attribute.
	 * @see #setFiletypeImageBif(String)
	 * @see lobj.LobjPackage#getResrcFiletype_FiletypeImageBif()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getFiletypeImageBif();

	/**
	 * Sets the value of the '{@link lobj.ResrcFiletype#getFiletypeImageBif
	 * <em>Filetype Image Bif</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Filetype Image Bif</em>' attribute.
	 * @see #getFiletypeImageBif()
	 * @generated
	 */
	void setFiletypeImageBif(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see lobj.LobjPackage#getResrcFiletype_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.ResrcFiletype#getId <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ResrcFiletype
