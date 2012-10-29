/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Resrc Meta</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.ResrcMeta#getFilename <em>Filename</em>}</li>
 * <li>{@link lobj.ResrcMeta#getParameters <em>Parameters</em>}</li>
 * <li>{@link lobj.ResrcMeta#getHeight <em>Height</em>}</li>
 * <li>{@link lobj.ResrcMeta#getWidth <em>Width</em>}</li>
 * <li>{@link lobj.ResrcMeta#getCreationDate <em>Creation Date</em>}</li>
 * <li>{@link lobj.ResrcMeta#getLastModified <em>Last Modified</em>}</li>
 * <li>{@link lobj.ResrcMeta#getTitle <em>Title</em>}</li>
 * <li>{@link lobj.ResrcMeta#getDescription <em>Description</em>}</li>
 * <li>{@link lobj.ResrcMeta#getKeywords <em>Keywords</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getResrcMeta()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface ResrcMeta extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see lobj.LobjPackage#getResrcMeta_Filename()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link lobj.ResrcMeta#getFilename <em>Filename</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see lobj.LobjPackage#getResrcMeta_Parameters()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link lobj.ResrcMeta#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see lobj.LobjPackage#getResrcMeta_Height()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link lobj.ResrcMeta#getHeight <em>Height</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see lobj.LobjPackage#getResrcMeta_Width()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link lobj.ResrcMeta#getWidth <em>Width</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see lobj.LobjPackage#getResrcMeta_CreationDate()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link lobj.ResrcMeta#getCreationDate <em>Creation Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(Date)
	 * @see lobj.LobjPackage#getResrcMeta_LastModified()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getLastModified();

	/**
	 * Sets the value of the '{@link lobj.ResrcMeta#getLastModified <em>Last Modified</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Date value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see lobj.LobjPackage#getResrcMeta_Title()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link lobj.ResrcMeta#getTitle <em>Title</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see lobj.LobjPackage#getResrcMeta_Description()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link lobj.ResrcMeta#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Keywords</em>' attribute.
	 * @see #setKeywords(String)
	 * @see lobj.LobjPackage#getResrcMeta_Keywords()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getKeywords();

	/**
	 * Sets the value of the '{@link lobj.ResrcMeta#getKeywords <em>Keywords</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Keywords</em>' attribute.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(String value);

} // ResrcMeta
