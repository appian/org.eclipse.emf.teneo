/**
 * <copyright>
 * </copyright>
 *
 * $Id: blockAudiofile.java,v 1.1 2006/11/23 06:12:08 mtaal Exp $
 */
package lobj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>block Audiofile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.blockAudiofile#getFile <em>File</em>}</li>
 *   <li>{@link lobj.blockAudiofile#getOriginalextension <em>Originalextension</em>}</li>
 *   <li>{@link lobj.blockAudiofile#getFilesize <em>Filesize</em>}</li>
 *   <li>{@link lobj.blockAudiofile#getResrcHref <em>Resrc Href</em>}</li>
 *   <li>{@link lobj.blockAudiofile#getResrcFiletype <em>Resrc Filetype</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getblockAudiofile()
 * @model extendedMetaData="name='blockAudiofile' kind='elementOnly'"
 * @generated
 */
public interface blockAudiofile extends LearningObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(byte[])
	 * @see lobj.LobjPackage#getblockAudiofile_File()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='attribute' name='file'"
	 * @generated
	 */
	byte[] getFile();

	/**
	 * Sets the value of the '{@link lobj.blockAudiofile#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(byte[] value);

	/**
	 * Returns the value of the '<em><b>Originalextension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originalextension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originalextension</em>' attribute.
	 * @see #setOriginalextension(String)
	 * @see lobj.LobjPackage#getblockAudiofile_Originalextension()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='originalextension'"
	 * @generated
	 */
	String getOriginalextension();

	/**
	 * Sets the value of the '{@link lobj.blockAudiofile#getOriginalextension <em>Originalextension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originalextension</em>' attribute.
	 * @see #getOriginalextension()
	 * @generated
	 */
	void setOriginalextension(String value);

	/**
	 * Returns the value of the '<em><b>Filesize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filesize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filesize</em>' attribute.
	 * @see #setFilesize(int)
	 * @see lobj.LobjPackage#getblockAudiofile_Filesize()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='filesize'"
	 * @generated
	 */
	int getFilesize();

	/**
	 * Sets the value of the '{@link lobj.blockAudiofile#getFilesize <em>Filesize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filesize</em>' attribute.
	 * @see #getFilesize()
	 * @generated
	 */
	void setFilesize(int value);

	/**
	 * Returns the value of the '<em><b>Resrc Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resrc Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resrc Href</em>' attribute.
	 * @see #setResrcHref(String)
	 * @see lobj.LobjPackage#getblockAudiofile_ResrcHref()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='resrcHref'"
	 * @generated
	 */
	String getResrcHref();

	/**
	 * Sets the value of the '{@link lobj.blockAudiofile#getResrcHref <em>Resrc Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resrc Href</em>' attribute.
	 * @see #getResrcHref()
	 * @generated
	 */
	void setResrcHref(String value);

	/**
	 * Returns the value of the '<em><b>Resrc Filetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resrc Filetype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resrc Filetype</em>' reference.
	 * @see #setResrcFiletype(ResrcFiletype)
	 * @see lobj.LobjPackage#getblockAudiofile_ResrcFiletype()
	 * @model extendedMetaData="kind='element' name='resrcFiletype' namespace='##targetNamespace'"
	 * @generated
	 */
	ResrcFiletype getResrcFiletype();

	/**
	 * Sets the value of the '{@link lobj.blockAudiofile#getResrcFiletype <em>Resrc Filetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resrc Filetype</em>' reference.
	 * @see #getResrcFiletype()
	 * @generated
	 */
	void setResrcFiletype(ResrcFiletype value);

} // blockAudiofile