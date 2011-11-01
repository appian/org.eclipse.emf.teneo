/**
 * <copyright>
 * </copyright>
 *
 * $Id: Item.java,v 1.1 2010/11/04 05:22:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz329275;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringNoDefault <em>Un Settable String No Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardStringNoDefault <em>Standard String No Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringWithDefault <em>Un Settable String With Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardStringDefault <em>Standard String Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableEnum <em>Un Settable Enum</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardEnum <em>Standard Enum</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveNoDefault <em>Un Settable Primitive No Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardPrimitiveNoDefault <em>Standard Primitive No Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveWithDefault <em>Un Settable Primitive With Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardPrimitiveWithDefault <em>Standard Primitive With Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveWithDefault <em>Un Settable Object Primitive With Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardObjectPrimitiveWithDefault <em>Standard Object Primitive With Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveNoDefault <em>Un Settable Object Primitive No Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardObjectPrimitiveNoDefault <em>Standard Object Primitive No Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="teneo.jpa appinfo='@Id\n@GeneratedValue'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_Version()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="teneo.jpa appinfo='@Version'"
	 * @generated
	 */
	long getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(long)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(long)
	 * @generated
	 */
	boolean isSetVersion();

	/**
	 * Returns the value of the '<em><b>Un Settable String No Default</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Settable String No Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Settable String No Default</em>' attribute.
	 * @see #isSetUnSettableStringNoDefault()
	 * @see #unsetUnSettableStringNoDefault()
	 * @see #setUnSettableStringNoDefault(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_UnSettableStringNoDefault()
	 * @model default="" unsettable="true"
	 * @generated
	 */
	String getUnSettableStringNoDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringNoDefault <em>Un Settable String No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Settable String No Default</em>' attribute.
	 * @see #isSetUnSettableStringNoDefault()
	 * @see #unsetUnSettableStringNoDefault()
	 * @see #getUnSettableStringNoDefault()
	 * @generated
	 */
	void setUnSettableStringNoDefault(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringNoDefault <em>Un Settable String No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnSettableStringNoDefault()
	 * @see #getUnSettableStringNoDefault()
	 * @see #setUnSettableStringNoDefault(String)
	 * @generated
	 */
	void unsetUnSettableStringNoDefault();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringNoDefault <em>Un Settable String No Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Un Settable String No Default</em>' attribute is set.
	 * @see #unsetUnSettableStringNoDefault()
	 * @see #getUnSettableStringNoDefault()
	 * @see #setUnSettableStringNoDefault(String)
	 * @generated
	 */
	boolean isSetUnSettableStringNoDefault();

	/**
	 * Returns the value of the '<em><b>Standard String No Default</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard String No Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard String No Default</em>' attribute.
	 * @see #setStandardStringNoDefault(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_StandardStringNoDefault()
	 * @model default=""
	 * @generated
	 */
	String getStandardStringNoDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardStringNoDefault <em>Standard String No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard String No Default</em>' attribute.
	 * @see #getStandardStringNoDefault()
	 * @generated
	 */
	void setStandardStringNoDefault(String value);

	/**
	 * Returns the value of the '<em><b>Un Settable String With Default</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Settable String With Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Settable String With Default</em>' attribute.
	 * @see #isSetUnSettableStringWithDefault()
	 * @see #unsetUnSettableStringWithDefault()
	 * @see #setUnSettableStringWithDefault(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_UnSettableStringWithDefault()
	 * @model default="default" unsettable="true"
	 * @generated
	 */
	String getUnSettableStringWithDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringWithDefault <em>Un Settable String With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Settable String With Default</em>' attribute.
	 * @see #isSetUnSettableStringWithDefault()
	 * @see #unsetUnSettableStringWithDefault()
	 * @see #getUnSettableStringWithDefault()
	 * @generated
	 */
	void setUnSettableStringWithDefault(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringWithDefault <em>Un Settable String With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnSettableStringWithDefault()
	 * @see #getUnSettableStringWithDefault()
	 * @see #setUnSettableStringWithDefault(String)
	 * @generated
	 */
	void unsetUnSettableStringWithDefault();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableStringWithDefault <em>Un Settable String With Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Un Settable String With Default</em>' attribute is set.
	 * @see #unsetUnSettableStringWithDefault()
	 * @see #getUnSettableStringWithDefault()
	 * @see #setUnSettableStringWithDefault(String)
	 * @generated
	 */
	boolean isSetUnSettableStringWithDefault();

	/**
	 * Returns the value of the '<em><b>Standard String Default</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard String Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard String Default</em>' attribute.
	 * @see #setStandardStringDefault(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_StandardStringDefault()
	 * @model default="default"
	 * @generated
	 */
	String getStandardStringDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardStringDefault <em>Standard String Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard String Default</em>' attribute.
	 * @see #getStandardStringDefault()
	 * @generated
	 */
	void setStandardStringDefault(String value);

	/**
	 * Returns the value of the '<em><b>Un Settable Enum</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Settable Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Settable Enum</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum
	 * @see #isSetUnSettableEnum()
	 * @see #unsetUnSettableEnum()
	 * @see #setUnSettableEnum(TestEnum)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_UnSettableEnum()
	 * @model unsettable="true"
	 * @generated
	 */
	TestEnum getUnSettableEnum();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableEnum <em>Un Settable Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Settable Enum</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum
	 * @see #isSetUnSettableEnum()
	 * @see #unsetUnSettableEnum()
	 * @see #getUnSettableEnum()
	 * @generated
	 */
	void setUnSettableEnum(TestEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableEnum <em>Un Settable Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnSettableEnum()
	 * @see #getUnSettableEnum()
	 * @see #setUnSettableEnum(TestEnum)
	 * @generated
	 */
	void unsetUnSettableEnum();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableEnum <em>Un Settable Enum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Un Settable Enum</em>' attribute is set.
	 * @see #unsetUnSettableEnum()
	 * @see #getUnSettableEnum()
	 * @see #setUnSettableEnum(TestEnum)
	 * @generated
	 */
	boolean isSetUnSettableEnum();

	/**
	 * Returns the value of the '<em><b>Standard Enum</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Enum</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum
	 * @see #setStandardEnum(TestEnum)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_StandardEnum()
	 * @model
	 * @generated
	 */
	TestEnum getStandardEnum();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardEnum <em>Standard Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Enum</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum
	 * @see #getStandardEnum()
	 * @generated
	 */
	void setStandardEnum(TestEnum value);

	/**
	 * Returns the value of the '<em><b>Un Settable Primitive No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Settable Primitive No Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Settable Primitive No Default</em>' attribute.
	 * @see #isSetUnSettablePrimitiveNoDefault()
	 * @see #unsetUnSettablePrimitiveNoDefault()
	 * @see #setUnSettablePrimitiveNoDefault(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_UnSettablePrimitiveNoDefault()
	 * @model unsettable="true"
	 * @generated
	 */
	long getUnSettablePrimitiveNoDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveNoDefault <em>Un Settable Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Settable Primitive No Default</em>' attribute.
	 * @see #isSetUnSettablePrimitiveNoDefault()
	 * @see #unsetUnSettablePrimitiveNoDefault()
	 * @see #getUnSettablePrimitiveNoDefault()
	 * @generated
	 */
	void setUnSettablePrimitiveNoDefault(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveNoDefault <em>Un Settable Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnSettablePrimitiveNoDefault()
	 * @see #getUnSettablePrimitiveNoDefault()
	 * @see #setUnSettablePrimitiveNoDefault(long)
	 * @generated
	 */
	void unsetUnSettablePrimitiveNoDefault();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveNoDefault <em>Un Settable Primitive No Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Un Settable Primitive No Default</em>' attribute is set.
	 * @see #unsetUnSettablePrimitiveNoDefault()
	 * @see #getUnSettablePrimitiveNoDefault()
	 * @see #setUnSettablePrimitiveNoDefault(long)
	 * @generated
	 */
	boolean isSetUnSettablePrimitiveNoDefault();

	/**
	 * Returns the value of the '<em><b>Standard Primitive No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Primitive No Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Primitive No Default</em>' attribute.
	 * @see #setStandardPrimitiveNoDefault(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_StandardPrimitiveNoDefault()
	 * @model
	 * @generated
	 */
	long getStandardPrimitiveNoDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardPrimitiveNoDefault <em>Standard Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Primitive No Default</em>' attribute.
	 * @see #getStandardPrimitiveNoDefault()
	 * @generated
	 */
	void setStandardPrimitiveNoDefault(long value);

	/**
	 * Returns the value of the '<em><b>Un Settable Primitive With Default</b></em>' attribute.
	 * The default value is <code>"155"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Settable Primitive With Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Settable Primitive With Default</em>' attribute.
	 * @see #isSetUnSettablePrimitiveWithDefault()
	 * @see #unsetUnSettablePrimitiveWithDefault()
	 * @see #setUnSettablePrimitiveWithDefault(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_UnSettablePrimitiveWithDefault()
	 * @model default="155" unsettable="true"
	 * @generated
	 */
	long getUnSettablePrimitiveWithDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveWithDefault <em>Un Settable Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Settable Primitive With Default</em>' attribute.
	 * @see #isSetUnSettablePrimitiveWithDefault()
	 * @see #unsetUnSettablePrimitiveWithDefault()
	 * @see #getUnSettablePrimitiveWithDefault()
	 * @generated
	 */
	void setUnSettablePrimitiveWithDefault(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveWithDefault <em>Un Settable Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnSettablePrimitiveWithDefault()
	 * @see #getUnSettablePrimitiveWithDefault()
	 * @see #setUnSettablePrimitiveWithDefault(long)
	 * @generated
	 */
	void unsetUnSettablePrimitiveWithDefault();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettablePrimitiveWithDefault <em>Un Settable Primitive With Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Un Settable Primitive With Default</em>' attribute is set.
	 * @see #unsetUnSettablePrimitiveWithDefault()
	 * @see #getUnSettablePrimitiveWithDefault()
	 * @see #setUnSettablePrimitiveWithDefault(long)
	 * @generated
	 */
	boolean isSetUnSettablePrimitiveWithDefault();

	/**
	 * Returns the value of the '<em><b>Standard Primitive With Default</b></em>' attribute.
	 * The default value is <code>"155"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Primitive With Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Primitive With Default</em>' attribute.
	 * @see #setStandardPrimitiveWithDefault(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_StandardPrimitiveWithDefault()
	 * @model default="155"
	 * @generated
	 */
	long getStandardPrimitiveWithDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardPrimitiveWithDefault <em>Standard Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Primitive With Default</em>' attribute.
	 * @see #getStandardPrimitiveWithDefault()
	 * @generated
	 */
	void setStandardPrimitiveWithDefault(long value);

	/**
	 * Returns the value of the '<em><b>Un Settable Object Primitive With Default</b></em>' attribute.
	 * The default value is <code>"155"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Settable Object Primitive With Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Settable Object Primitive With Default</em>' attribute.
	 * @see #isSetUnSettableObjectPrimitiveWithDefault()
	 * @see #unsetUnSettableObjectPrimitiveWithDefault()
	 * @see #setUnSettableObjectPrimitiveWithDefault(Long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_UnSettableObjectPrimitiveWithDefault()
	 * @model default="155" unsettable="true"
	 * @generated
	 */
	Long getUnSettableObjectPrimitiveWithDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveWithDefault <em>Un Settable Object Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Settable Object Primitive With Default</em>' attribute.
	 * @see #isSetUnSettableObjectPrimitiveWithDefault()
	 * @see #unsetUnSettableObjectPrimitiveWithDefault()
	 * @see #getUnSettableObjectPrimitiveWithDefault()
	 * @generated
	 */
	void setUnSettableObjectPrimitiveWithDefault(Long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveWithDefault <em>Un Settable Object Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnSettableObjectPrimitiveWithDefault()
	 * @see #getUnSettableObjectPrimitiveWithDefault()
	 * @see #setUnSettableObjectPrimitiveWithDefault(Long)
	 * @generated
	 */
	void unsetUnSettableObjectPrimitiveWithDefault();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveWithDefault <em>Un Settable Object Primitive With Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Un Settable Object Primitive With Default</em>' attribute is set.
	 * @see #unsetUnSettableObjectPrimitiveWithDefault()
	 * @see #getUnSettableObjectPrimitiveWithDefault()
	 * @see #setUnSettableObjectPrimitiveWithDefault(Long)
	 * @generated
	 */
	boolean isSetUnSettableObjectPrimitiveWithDefault();

	/**
	 * Returns the value of the '<em><b>Standard Object Primitive With Default</b></em>' attribute.
	 * The default value is <code>"155"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Object Primitive With Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Object Primitive With Default</em>' attribute.
	 * @see #setStandardObjectPrimitiveWithDefault(Long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_StandardObjectPrimitiveWithDefault()
	 * @model default="155"
	 * @generated
	 */
	Long getStandardObjectPrimitiveWithDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardObjectPrimitiveWithDefault <em>Standard Object Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Object Primitive With Default</em>' attribute.
	 * @see #getStandardObjectPrimitiveWithDefault()
	 * @generated
	 */
	void setStandardObjectPrimitiveWithDefault(Long value);

	/**
	 * Returns the value of the '<em><b>Un Settable Object Primitive No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Settable Object Primitive No Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Settable Object Primitive No Default</em>' attribute.
	 * @see #isSetUnSettableObjectPrimitiveNoDefault()
	 * @see #unsetUnSettableObjectPrimitiveNoDefault()
	 * @see #setUnSettableObjectPrimitiveNoDefault(Long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_UnSettableObjectPrimitiveNoDefault()
	 * @model unsettable="true"
	 * @generated
	 */
	Long getUnSettableObjectPrimitiveNoDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveNoDefault <em>Un Settable Object Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Settable Object Primitive No Default</em>' attribute.
	 * @see #isSetUnSettableObjectPrimitiveNoDefault()
	 * @see #unsetUnSettableObjectPrimitiveNoDefault()
	 * @see #getUnSettableObjectPrimitiveNoDefault()
	 * @generated
	 */
	void setUnSettableObjectPrimitiveNoDefault(Long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveNoDefault <em>Un Settable Object Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnSettableObjectPrimitiveNoDefault()
	 * @see #getUnSettableObjectPrimitiveNoDefault()
	 * @see #setUnSettableObjectPrimitiveNoDefault(Long)
	 * @generated
	 */
	void unsetUnSettableObjectPrimitiveNoDefault();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getUnSettableObjectPrimitiveNoDefault <em>Un Settable Object Primitive No Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Un Settable Object Primitive No Default</em>' attribute is set.
	 * @see #unsetUnSettableObjectPrimitiveNoDefault()
	 * @see #getUnSettableObjectPrimitiveNoDefault()
	 * @see #setUnSettableObjectPrimitiveNoDefault(Long)
	 * @generated
	 */
	boolean isSetUnSettableObjectPrimitiveNoDefault();

	/**
	 * Returns the value of the '<em><b>Standard Object Primitive No Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Object Primitive No Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Object Primitive No Default</em>' attribute.
	 * @see #setStandardObjectPrimitiveNoDefault(Long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#getItem_StandardObjectPrimitiveNoDefault()
	 * @model
	 * @generated
	 */
	Long getStandardObjectPrimitiveNoDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz329275.Item#getStandardObjectPrimitiveNoDefault <em>Standard Object Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Object Primitive No Default</em>' attribute.
	 * @see #getStandardObjectPrimitiveNoDefault()
	 * @generated
	 */
	void setStandardObjectPrimitiveNoDefault(Long value);

} // Item
