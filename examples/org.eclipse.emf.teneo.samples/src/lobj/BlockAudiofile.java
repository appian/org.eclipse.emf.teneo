/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockAudiofile.java,v 1.1 2007/03/28 13:56:50 mtaal Exp $
 */
package lobj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Audiofile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.BlockAudiofile#getFile <em>File</em>}</li>
 *   <li>{@link lobj.BlockAudiofile#getOriginalextension <em>Originalextension</em>}</li>
 *   <li>{@link lobj.BlockAudiofile#getFilesize <em>Filesize</em>}</li>
 *   <li>{@link lobj.BlockAudiofile#getResrcHref <em>Resrc Href</em>}</li>
 *   <li>{@link lobj.BlockAudiofile#getResrcFiletype <em>Resrc Filetype</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getBlockAudiofile()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface BlockAudiofile extends LearningObject {
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
	 * @see lobj.LobjPackage#getBlockAudiofile_File()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	byte[] getFile();

	/**
	 * Sets the value of the '{@link lobj.BlockAudiofile#getFile <em>File</em>}' attribute.
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
	 * @see lobj.LobjPackage#getBlockAudiofile_Originalextension()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getOriginalextension();

	/**
	 * Sets the value of the '{@link lobj.BlockAudiofile#getOriginalextension <em>Originalextension</em>}' attribute.
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
	 * @see lobj.LobjPackage#getBlockAudiofile_Filesize()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	int getFilesize();

	/**
	 * Sets the value of the '{@link lobj.BlockAudiofile#getFilesize <em>Filesize</em>}' attribute.
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
	 * @see lobj.LobjPackage#getBlockAudiofile_ResrcHref()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getResrcHref();

	/**
	 * Sets the value of the '{@link lobj.BlockAudiofile#getResrcHref <em>Resrc Href</em>}' attribute.
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
	 * @see lobj.LobjPackage#getBlockAudiofile_ResrcFiletype()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	ResrcFiletype getResrcFiletype();

	/**
	 * Sets the value of the '{@link lobj.BlockAudiofile#getResrcFiletype <em>Resrc Filetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resrc Filetype</em>' reference.
	 * @see #getResrcFiletype()
	 * @generated
	 */
	void setResrcFiletype(ResrcFiletype value);

} // BlockAudiofile
