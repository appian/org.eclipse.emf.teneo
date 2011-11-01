/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.PresentationBlock#getLod <em>Lod</em>}</li>
 *   <li>{@link lobj.PresentationBlock#getRendering <em>Rendering</em>}</li>
 *   <li>{@link lobj.PresentationBlock#getBlock <em>Block</em>}</li>
 *   <li>{@link lobj.PresentationBlock#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getPresentationBlock()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface PresentationBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Lod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod</em>' attribute.
	 * @see #isSetLod()
	 * @see #unsetLod()
	 * @see #setLod(int)
	 * @see lobj.LobjPackage#getPresentationBlock_Lod()
	 * @model unique="false" unsettable="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	int getLod();

	/**
	 * Sets the value of the '{@link lobj.PresentationBlock#getLod <em>Lod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod</em>' attribute.
	 * @see #isSetLod()
	 * @see #unsetLod()
	 * @see #getLod()
	 * @generated
	 */
	void setLod(int value);

	/**
	 * Unsets the value of the '{@link lobj.PresentationBlock#getLod <em>Lod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLod()
	 * @see #getLod()
	 * @see #setLod(int)
	 * @generated
	 */
	void unsetLod();

	/**
	 * Returns whether the value of the '{@link lobj.PresentationBlock#getLod <em>Lod</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lod</em>' attribute is set.
	 * @see #unsetLod()
	 * @see #getLod()
	 * @see #setLod(int)
	 * @generated
	 */
	boolean isSetLod();

	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendering</em>' attribute.
	 * @see #setRendering(String)
	 * @see lobj.LobjPackage#getPresentationBlock_Rendering()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getRendering();

	/**
	 * Sets the value of the '{@link lobj.PresentationBlock#getRendering <em>Rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering</em>' attribute.
	 * @see #getRendering()
	 * @generated
	 */
	void setRendering(String value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' reference.
	 * @see #setBlock(Block)
	 * @see lobj.LobjPackage#getPresentationBlock_Block()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link lobj.PresentationBlock#getBlock <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see lobj.LobjPackage#getPresentationBlock_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.PresentationBlock#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PresentationBlock
