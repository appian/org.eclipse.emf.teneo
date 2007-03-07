/**
 * <copyright>
 * </copyright>
 *
 * $Id: Interval.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datacore.Interval#getMin <em>Min</em>}</li>
 *   <li>{@link datacore.Interval#getMax <em>Max</em>}</li>
 *   <li>{@link datacore.Interval#isIncludeMin <em>Include Min</em>}</li>
 *   <li>{@link datacore.Interval#isIncludeMax <em>Include Max</em>}</li>
 *   <li>{@link datacore.Interval#getKind <em>Kind</em>}</li>
 *   <li>{@link datacore.Interval#getIncrement <em>Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @see datacore.DatacorePackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends CSMValueSet {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(CSMValue)
	 * @see datacore.DatacorePackage#getInterval_Min()
	 * @model containment="true"
	 * @generated
	 */
	CSMValue getMin();

	/**
	 * Sets the value of the '{@link datacore.Interval#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(CSMValue value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(CSMValue)
	 * @see datacore.DatacorePackage#getInterval_Max()
	 * @model containment="true"
	 * @generated
	 */
	CSMValue getMax();

	/**
	 * Sets the value of the '{@link datacore.Interval#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(CSMValue value);

	/**
	 * Returns the value of the '<em><b>Include Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Min</em>' attribute.
	 * @see #setIncludeMin(boolean)
	 * @see datacore.DatacorePackage#getInterval_IncludeMin()
	 * @model
	 * @generated
	 */
	boolean isIncludeMin();

	/**
	 * Sets the value of the '{@link datacore.Interval#isIncludeMin <em>Include Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Min</em>' attribute.
	 * @see #isIncludeMin()
	 * @generated
	 */
	void setIncludeMin(boolean value);

	/**
	 * Returns the value of the '<em><b>Include Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Max</em>' attribute.
	 * @see #setIncludeMax(boolean)
	 * @see datacore.DatacorePackage#getInterval_IncludeMax()
	 * @model
	 * @generated
	 */
	boolean isIncludeMax();

	/**
	 * Sets the value of the '{@link datacore.Interval#isIncludeMax <em>Include Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Max</em>' attribute.
	 * @see #isIncludeMax()
	 * @generated
	 */
	void setIncludeMax(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(CSMValue)
	 * @see datacore.DatacorePackage#getInterval_Kind()
	 * @model
	 * @generated
	 */
	CSMValue getKind();

	/**
	 * Sets the value of the '{@link datacore.Interval#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CSMValue value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' containment reference.
	 * @see #setIncrement(CSMValue)
	 * @see datacore.DatacorePackage#getInterval_Increment()
	 * @model containment="true"
	 * @generated
	 */
	CSMValue getIncrement();

	/**
	 * Sets the value of the '{@link datacore.Interval#getIncrement <em>Increment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' containment reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(CSMValue value);

} // Interval
