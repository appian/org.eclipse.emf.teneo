/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Block Meta</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.BlockMeta#getLod <em>Lod</em>}</li>
 * <li>{@link lobj.BlockMeta#getRendering <em>Rendering</em>}</li>
 * <li>{@link lobj.BlockMeta#getBlocktype <em>Blocktype</em>}</li>
 * <li>{@link lobj.BlockMeta#getCreationDate <em>Creation Date</em>}</li>
 * <li>{@link lobj.BlockMeta#getLastModified <em>Last Modified</em>}</li>
 * <li>{@link lobj.BlockMeta#getSimpleDidacMeta <em>Simple Didac Meta</em>}</li>
 * <li>{@link lobj.BlockMeta#getDefLang <em>Def Lang</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getBlockMeta()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface BlockMeta extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Lod</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lod</em>' attribute.
	 * @see #isSetLod()
	 * @see #unsetLod()
	 * @see #setLod(int)
	 * @see lobj.LobjPackage#getBlockMeta_Lod()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	int getLod();

	/**
	 * Sets the value of the '{@link lobj.BlockMeta#getLod <em>Lod</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Lod</em>' attribute.
	 * @see #isSetLod()
	 * @see #unsetLod()
	 * @see #getLod()
	 * @generated
	 */
	void setLod(int value);

	/**
	 * Unsets the value of the '{@link lobj.BlockMeta#getLod <em>Lod</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetLod()
	 * @see #getLod()
	 * @see #setLod(int)
	 * @generated
	 */
	void unsetLod();

	/**
	 * Returns whether the value of the '{@link lobj.BlockMeta#getLod <em>Lod</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Lod</em>' attribute is set.
	 * @see #unsetLod()
	 * @see #getLod()
	 * @see #setLod(int)
	 * @generated
	 */
	boolean isSetLod();

	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendering</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Rendering</em>' attribute.
	 * @see #setRendering(String)
	 * @see lobj.LobjPackage#getBlockMeta_Rendering()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getRendering();

	/**
	 * Sets the value of the '{@link lobj.BlockMeta#getRendering <em>Rendering</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Rendering</em>' attribute.
	 * @see #getRendering()
	 * @generated
	 */
	void setRendering(String value);

	/**
	 * Returns the value of the '<em><b>Blocktype</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocktype</em>' reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Blocktype</em>' reference.
	 * @see #setBlocktype(Blocktype)
	 * @see lobj.LobjPackage#getBlockMeta_Blocktype()
	 * @model resolveProxies="false" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Blocktype getBlocktype();

	/**
	 * Sets the value of the '{@link lobj.BlockMeta#getBlocktype <em>Blocktype</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Blocktype</em>' reference.
	 * @see #getBlocktype()
	 * @generated
	 */
	void setBlocktype(Blocktype value);

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
	 * @see lobj.LobjPackage#getBlockMeta_CreationDate()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link lobj.BlockMeta#getCreationDate <em>Creation Date</em>}'
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
	 * @see lobj.LobjPackage#getBlockMeta_LastModified()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getLastModified();

	/**
	 * Sets the value of the '{@link lobj.BlockMeta#getLastModified <em>Last Modified</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Date value);

	/**
	 * Returns the value of the '<em><b>Simple Didac Meta</b></em>' containment reference list. The
	 * list contents are of type {@link lobj.SimpleDidacMeta}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Didac Meta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Simple Didac Meta</em>' containment reference list.
	 * @see lobj.LobjPackage#getBlockMeta_SimpleDidacMeta()
	 * @model type="lobj.SimpleDidacMeta" containment="true" extendedMetaData="kind='element'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getSimpleDidacMeta();

	/**
	 * Returns the value of the '<em><b>Def Lang</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Lang</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Def Lang</em>' reference.
	 * @see #setDefLang(Language)
	 * @see lobj.LobjPackage#getBlockMeta_DefLang()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	Language getDefLang();

	/**
	 * Sets the value of the '{@link lobj.BlockMeta#getDefLang <em>Def Lang</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Def Lang</em>' reference.
	 * @see #getDefLang()
	 * @generated
	 */
	void setDefLang(Language value);

} // BlockMeta
