/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalContract.java,v 1.4 2008/08/11 21:54:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.rental.RentalContract#getRentToBusinessPartner <em>Rent To Business Partner</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.RentalContract#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.RentalContract#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.RentalContract#getCost <em>Cost</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.RentalContract#getRentalUnits <em>Rental Units</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.RentalContract#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalContract()
 * @model extendedMetaData="name='RentalContract' kind='elementOnly'"
 * @generated
 */
public interface RentalContract extends EObject {
	/**
	 * Returns the value of the '<em><b>Rent To Business Partner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rent To Business Partner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rent To Business Partner</em>' attribute.
	 * @see #setRentToBusinessPartner(String)
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalContract_RentToBusinessPartner()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='rentToBusinessPartner'"
	 * @generated
	 */
	String getRentToBusinessPartner();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.rental.RentalContract#getRentToBusinessPartner <em>Rent To Business Partner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rent To Business Partner</em>' attribute.
	 * @see #getRentToBusinessPartner()
	 * @generated
	 */
	void setRentToBusinessPartner(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalContract_StartDate()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.rental.Date" required="true"
	 *        extendedMetaData="kind='element' name='startDate'"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.rental.RentalContract#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #isSetEndDate()
	 * @see #unsetEndDate()
	 * @see #setEndDate(Date)
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalContract_EndDate()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.teneo.rental.Date" required="true"
	 *        extendedMetaData="kind='element' name='endDate'"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.rental.RentalContract#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #isSetEndDate()
	 * @see #unsetEndDate()
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.rental.RentalContract#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndDate()
	 * @see #getEndDate()
	 * @see #setEndDate(Date)
	 * @generated
	 */
	void unsetEndDate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.rental.RentalContract#getEndDate <em>End Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Date</em>' attribute is set.
	 * @see #unsetEndDate()
	 * @see #getEndDate()
	 * @see #setEndDate(Date)
	 * @generated
	 */
	boolean isSetEndDate();

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #isSetCost()
	 * @see #unsetCost()
	 * @see #setCost(float)
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalContract_Cost()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='element' name='cost'"
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.rental.RentalContract#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #isSetCost()
	 * @see #unsetCost()
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.rental.RentalContract#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCost()
	 * @see #getCost()
	 * @see #setCost(float)
	 * @generated
	 */
	void unsetCost();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.rental.RentalContract#getCost <em>Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost</em>' attribute is set.
	 * @see #unsetCost()
	 * @see #getCost()
	 * @see #setCost(float)
	 * @generated
	 */
	boolean isSetCost();

	/**
	 * Returns the value of the '<em><b>Rental Units</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.rental.RentalUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rental Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rental Units</em>' reference list.
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalContract_RentalUnits()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='rentalUnits'"
	 * @generated
	 */
	EList<RentalUnit> getRentalUnits();

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' reference.
	 * @see #setCurrency(Currency)
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalContract_Currency()
	 * @model annotation="teneo.jpa value='@ManyToOne(fetch=LAZY)'"
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.rental.RentalContract#getCurrency <em>Currency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Currency value);

} // RentalContract
