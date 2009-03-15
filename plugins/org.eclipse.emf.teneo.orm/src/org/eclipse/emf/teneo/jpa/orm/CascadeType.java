/**
 * <copyright>
 * </copyright>
 *
 * $Id: CascadeType.java,v 1.1 2009/03/15 23:45:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cascade Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         public enum CascadeType { ALL, PERSIST, MERGE, REMOVE, REFRESH};
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeAll <em>Cascade All</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadePersist <em>Cascade Persist</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeMerge <em>Cascade Merge</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeRemove <em>Cascade Remove</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeRefresh <em>Cascade Refresh</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getCascadeType()
 * @model extendedMetaData="name='cascade-type' kind='elementOnly'"
 * @generated
 */
public interface CascadeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cascade All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade All</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade All</em>' containment reference.
	 * @see #setCascadeAll(EmptyType)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getCascadeType_CascadeAll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-all' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getCascadeAll();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeAll <em>Cascade All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade All</em>' containment reference.
	 * @see #getCascadeAll()
	 * @generated
	 */
	void setCascadeAll(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Cascade Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade Persist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Persist</em>' containment reference.
	 * @see #setCascadePersist(EmptyType)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getCascadeType_CascadePersist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-persist' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getCascadePersist();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadePersist <em>Cascade Persist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Persist</em>' containment reference.
	 * @see #getCascadePersist()
	 * @generated
	 */
	void setCascadePersist(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Cascade Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade Merge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Merge</em>' containment reference.
	 * @see #setCascadeMerge(EmptyType)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getCascadeType_CascadeMerge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-merge' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getCascadeMerge();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeMerge <em>Cascade Merge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Merge</em>' containment reference.
	 * @see #getCascadeMerge()
	 * @generated
	 */
	void setCascadeMerge(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Cascade Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade Remove</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Remove</em>' containment reference.
	 * @see #setCascadeRemove(EmptyType)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getCascadeType_CascadeRemove()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-remove' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getCascadeRemove();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeRemove <em>Cascade Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Remove</em>' containment reference.
	 * @see #getCascadeRemove()
	 * @generated
	 */
	void setCascadeRemove(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Cascade Refresh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade Refresh</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Refresh</em>' containment reference.
	 * @see #setCascadeRefresh(EmptyType)
	 * @see org.eclipse.emf.teneo.jpa.orm.OrmPackage#getCascadeType_CascadeRefresh()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-refresh' namespace='##targetNamespace'"
	 * @generated
	 */
	EmptyType getCascadeRefresh();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.jpa.orm.CascadeType#getCascadeRefresh <em>Cascade Refresh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Refresh</em>' containment reference.
	 * @see #getCascadeRefresh()
	 * @generated
	 */
	void setCascadeRefresh(EmptyType value);

} // CascadeType
