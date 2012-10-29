/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Resrc File</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.ResrcFile#getFile <em>File</em>}</li>
 * <li>{@link lobj.ResrcFile#getFile_tn <em>File tn</em>}</li>
 * <li>{@link lobj.ResrcFile#getOriginalextension <em>Originalextension</em>}</li>
 * <li>{@link lobj.ResrcFile#getFilesize <em>Filesize</em>}</li>
 * <li>{@link lobj.ResrcFile#getResrcHref <em>Resrc Href</em>}</li>
 * <li>{@link lobj.ResrcFile#getAccesscontrol <em>Accesscontrol</em>}</li>
 * <li>{@link lobj.ResrcFile#getResrcFiletype <em>Resrc Filetype</em>}</li>
 * <li>{@link lobj.ResrcFile#getSource <em>Source</em>}</li>
 * <li>{@link lobj.ResrcFile#getHypertextContent <em>Hypertext Content</em>}</li>
 * <li>{@link lobj.ResrcFile#getResrcMeta <em>Resrc Meta</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getResrcFile()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface ResrcFile extends LearningObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(byte[])
	 * @see lobj.LobjPackage#getResrcFile_File()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	byte[] getFile();

	/**
	 * Sets the value of the '{@link lobj.ResrcFile#getFile <em>File</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(byte[] value);

	/**
	 * Returns the value of the '<em><b>File tn</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File tn</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File tn</em>' attribute.
	 * @see #setFile_tn(byte[])
	 * @see lobj.LobjPackage#getResrcFile_File_tn()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	byte[] getFile_tn();

	/**
	 * Sets the value of the '{@link lobj.ResrcFile#getFile_tn <em>File tn</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>File tn</em>' attribute.
	 * @see #getFile_tn()
	 * @generated
	 */
	void setFile_tn(byte[] value);

	/**
	 * Returns the value of the '<em><b>Originalextension</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originalextension</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Originalextension</em>' attribute.
	 * @see #setOriginalextension(String)
	 * @see lobj.LobjPackage#getResrcFile_Originalextension()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getOriginalextension();

	/**
	 * Sets the value of the '{@link lobj.ResrcFile#getOriginalextension <em>Originalextension</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Originalextension</em>' attribute.
	 * @see #getOriginalextension()
	 * @generated
	 */
	void setOriginalextension(String value);

	/**
	 * Returns the value of the '<em><b>Filesize</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filesize</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Filesize</em>' attribute.
	 * @see #setFilesize(int)
	 * @see lobj.LobjPackage#getResrcFile_Filesize()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	int getFilesize();

	/**
	 * Sets the value of the '{@link lobj.ResrcFile#getFilesize <em>Filesize</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Filesize</em>' attribute.
	 * @see #getFilesize()
	 * @generated
	 */
	void setFilesize(int value);

	/**
	 * Returns the value of the '<em><b>Resrc Href</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resrc Href</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resrc Href</em>' attribute.
	 * @see #setResrcHref(String)
	 * @see lobj.LobjPackage#getResrcFile_ResrcHref()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getResrcHref();

	/**
	 * Sets the value of the '{@link lobj.ResrcFile#getResrcHref <em>Resrc Href</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Resrc Href</em>' attribute.
	 * @see #getResrcHref()
	 * @generated
	 */
	void setResrcHref(String value);

	/**
	 * Returns the value of the '<em><b>Accesscontrol</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesscontrol</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Accesscontrol</em>' containment reference.
	 * @see #setAccesscontrol(AccessControl)
	 * @see lobj.LobjPackage#getResrcFile_Accesscontrol()
	 * @model containment="true" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessControl getAccesscontrol();

	/**
	 * Sets the value of the '{@link lobj.ResrcFile#getAccesscontrol <em>Accesscontrol</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Accesscontrol</em>' containment reference.
	 * @see #getAccesscontrol()
	 * @generated
	 */
	void setAccesscontrol(AccessControl value);

	/**
	 * Returns the value of the '<em><b>Resrc Filetype</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resrc Filetype</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resrc Filetype</em>' reference.
	 * @see #setResrcFiletype(ResrcFiletype)
	 * @see lobj.LobjPackage#getResrcFile_ResrcFiletype()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	ResrcFiletype getResrcFiletype();

	/**
	 * Sets the value of the '{@link lobj.ResrcFile#getResrcFiletype <em>Resrc Filetype</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Resrc Filetype</em>' reference.
	 * @see #getResrcFiletype()
	 * @generated
	 */
	void setResrcFiletype(ResrcFiletype value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Source)
	 * @see lobj.LobjPackage#getResrcFile_Source()
	 * @model containment="true" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link lobj.ResrcFile#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Hypertext Content</b></em>' reference list. The list contents
	 * are of type {@link lobj.HypertextContent}. It is bidirectional and its opposite is '
	 * {@link lobj.HypertextContent#getResrcFile <em>Resrc File</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypertext Content</em>' reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hypertext Content</em>' reference list.
	 * @see lobj.LobjPackage#getResrcFile_HypertextContent()
	 * @see lobj.HypertextContent#getResrcFile
	 * @model type="lobj.HypertextContent" opposite="resrcFile"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getHypertextContent();

	/**
	 * Returns the value of the '<em><b>Resrc Meta</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resrc Meta</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resrc Meta</em>' containment reference.
	 * @see #setResrcMeta(ResrcMeta)
	 * @see lobj.LobjPackage#getResrcFile_ResrcMeta()
	 * @model containment="true" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	ResrcMeta getResrcMeta();

	/**
	 * Sets the value of the '{@link lobj.ResrcFile#getResrcMeta <em>Resrc Meta</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Resrc Meta</em>' containment reference.
	 * @see #getResrcMeta()
	 * @generated
	 */
	void setResrcMeta(ResrcMeta value);

} // ResrcFile
