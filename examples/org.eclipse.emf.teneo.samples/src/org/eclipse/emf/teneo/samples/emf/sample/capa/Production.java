/**
 * <copyright>
 * </copyright>
 *
 * $Id: Production.java,v 1.1 2006/08/14 05:08:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getArticle <em>Article</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getDueTime <em>Due Time</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getMissingAmount <em>Missing Amount</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getProductionId <em>Production Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getTotalAmount <em>Total Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getProduction()
 * @model extendedMetaData="name='Production' kind='empty'"
 * @generated
 */
public interface Production extends EObject {
	/**
	 * Returns the value of the '<em><b>Article</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Article</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Article</em>' attribute.
	 * @see #setArticle(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getProduction_Article()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Article'"
	 * @generated
	 */
	String getArticle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getArticle <em>Article</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article</em>' attribute.
	 * @see #getArticle()
	 * @generated
	 */
	void setArticle(String value);

	/**
	 * Returns the value of the '<em><b>Due Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Time</em>' attribute.
	 * @see #setDueTime(Object)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getProduction_DueTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='DueTime'"
	 * @generated
	 */
	Object getDueTime();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getDueTime <em>Due Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Time</em>' attribute.
	 * @see #getDueTime()
	 * @generated
	 */
	void setDueTime(Object value);

	/**
	 * Returns the value of the '<em><b>Missing Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Amount</em>' attribute.
	 * @see #isSetMissingAmount()
	 * @see #unsetMissingAmount()
	 * @see #setMissingAmount(float)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getProduction_MissingAmount()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='MissingAmount'"
	 * @generated
	 */
	float getMissingAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getMissingAmount <em>Missing Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Amount</em>' attribute.
	 * @see #isSetMissingAmount()
	 * @see #unsetMissingAmount()
	 * @see #getMissingAmount()
	 * @generated
	 */
	void setMissingAmount(float value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getMissingAmount <em>Missing Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMissingAmount()
	 * @see #getMissingAmount()
	 * @see #setMissingAmount(float)
	 * @generated
	 */
	void unsetMissingAmount();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getMissingAmount <em>Missing Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Missing Amount</em>' attribute is set.
	 * @see #unsetMissingAmount()
	 * @see #getMissingAmount()
	 * @see #setMissingAmount(float)
	 * @generated
	 */
	boolean isSetMissingAmount();

	/**
	 * Returns the value of the '<em><b>Production Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Id</em>' attribute.
	 * @see #setProductionId(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getProduction_ProductionId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ProductionId'"
	 * @generated
	 */
	String getProductionId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getProductionId <em>Production Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Id</em>' attribute.
	 * @see #getProductionId()
	 * @generated
	 */
	void setProductionId(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Object)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getProduction_StartTime()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='StartTime'"
	 * @generated
	 */
	Object getStartTime();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Object value);

	/**
	 * Returns the value of the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Amount</em>' attribute.
	 * @see #isSetTotalAmount()
	 * @see #unsetTotalAmount()
	 * @see #setTotalAmount(float)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage#getProduction_TotalAmount()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='TotalAmount'"
	 * @generated
	 */
	float getTotalAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getTotalAmount <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Amount</em>' attribute.
	 * @see #isSetTotalAmount()
	 * @see #unsetTotalAmount()
	 * @see #getTotalAmount()
	 * @generated
	 */
	void setTotalAmount(float value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getTotalAmount <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalAmount()
	 * @see #getTotalAmount()
	 * @see #setTotalAmount(float)
	 * @generated
	 */
	void unsetTotalAmount();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.capa.Production#getTotalAmount <em>Total Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Amount</em>' attribute is set.
	 * @see #unsetTotalAmount()
	 * @see #getTotalAmount()
	 * @see #setTotalAmount(float)
	 * @generated
	 */
	boolean isSetTotalAmount();

} // Production