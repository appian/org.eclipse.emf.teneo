/**
 * <copyright>
 * </copyright>
 *
 * $Id: Embedder.java,v 1.1 2006/07/11 16:57:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embedder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getFirstEmbedded <em>First Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getSecondEmbedded <em>Second Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getThirdEmbedded <em>Third Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getFourthEmbedded <em>Fourth Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getFifthEmbedded <em>Fifth Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getEmbedder()
 * @model extendedMetaData="name='Embedder' kind='elementOnly'"
 * @generated
 */
public interface Embedder extends EObject {
	/**
	 * Returns the value of the '<em><b>First Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Embedded</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Embedded</em>' containment reference.
	 * @see #setFirstEmbedded(Embeddable)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getEmbedder_FirstEmbedded()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        annotation="http://annotation.elver.org/Embedded appinfo='true'"
	 *        annotation="http://annotation.elver.org/AttributeOverride name='myString' column='c1'"
	 *        annotation="http://annotation.elver.org/Column/c1 name='columnString3'"
	 *        extendedMetaData="kind='element' name='firstEmbedded'"
	 * @generated
	 */
	Embeddable getFirstEmbedded();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getFirstEmbedded <em>First Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Embedded</em>' containment reference.
	 * @see #getFirstEmbedded()
	 * @generated
	 */
	void setFirstEmbedded(Embeddable value);

	/**
	 * Returns the value of the '<em><b>Second Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Embedded</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Embedded</em>' containment reference.
	 * @see #setSecondEmbedded(Embeddable)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getEmbedder_SecondEmbedded()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        annotation="http://annotation.elver.org/Embedded appinfo='true'"
	 *        annotation="http://annotation.elver.org/AttributeOverrides value='a1 a2'"
	 *        annotation="http://annotation.elver.org/AttributeOverride/a1 name='myString' column='c1'"
	 *        annotation="http://annotation.elver.org/Column/c1 name='columnString1'"
	 *        annotation="http://annotation.elver.org/AttributeOverride/a2 name='myInteger' column='c2'"
	 *        annotation="http://annotation.elver.org/Column/c2 name='columnInteger1'"
	 *        extendedMetaData="kind='element' name='secondEmbedded'"
	 * @generated
	 */
	Embeddable getSecondEmbedded();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getSecondEmbedded <em>Second Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Embedded</em>' containment reference.
	 * @see #getSecondEmbedded()
	 * @generated
	 */
	void setSecondEmbedded(Embeddable value);

	/**
	 * Returns the value of the '<em><b>Third Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Embedded</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Embedded</em>' containment reference.
	 * @see #setThirdEmbedded(Embeddable)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getEmbedder_ThirdEmbedded()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        annotation="http://annotation.elver.org/Embedded appinfo='true'"
	 *        annotation="http://annotation.elver.org/AttributeOverrides value='a1 a2'"
	 *        annotation="http://annotation.elver.org/AttributeOverride/a1 name='myString' column='c1'"
	 *        annotation="http://annotation.elver.org/Column/c1 name='columnString2'"
	 *        annotation="http://annotation.elver.org/AttributeOverride/a2 name='myInteger' column='c2'"
	 *        annotation="http://annotation.elver.org/Column/c2 name='columnInteger2'"
	 *        extendedMetaData="kind='element' name='thirdEmbedded'"
	 * @generated
	 */
	Embeddable getThirdEmbedded();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getThirdEmbedded <em>Third Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Embedded</em>' containment reference.
	 * @see #getThirdEmbedded()
	 * @generated
	 */
	void setThirdEmbedded(Embeddable value);

	/**
	 * Returns the value of the '<em><b>Fourth Embedded</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fourth Embedded</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fourth Embedded</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getEmbedder_FourthEmbedded()
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable" containment="true" resolveProxies="false" required="true"
	 *        annotation="http://annotation.elver.org/Embedded appinfo='true'"
	 *        extendedMetaData="kind='element' name='fourthEmbedded'"
	 * @generated
	 */
	EList getFourthEmbedded();

	/**
	 * Returns the value of the '<em><b>Fifth Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fifth Embedded</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fifth Embedded</em>' containment reference.
	 * @see #setFifthEmbedded(Embeddable)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getEmbedder_FifthEmbedded()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        annotation="http://annotation.elver.org/Embedded appinfo='true'"
	 *        extendedMetaData="kind='element' name='fifthEmbedded'"
	 * @generated
	 */
	Embeddable getFifthEmbedded();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder#getFifthEmbedded <em>Fifth Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fifth Embedded</em>' containment reference.
	 * @see #getFifthEmbedded()
	 * @generated
	 */
	void setFifthEmbedded(Embeddable value);

} // Embedder
