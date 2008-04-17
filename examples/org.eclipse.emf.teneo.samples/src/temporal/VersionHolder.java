/**
 * <copyright>
 * </copyright>
 *
 * $Id: VersionHolder.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package temporal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link temporal.VersionHolder#getVersions <em>Versions</em>}</li>
 *   <li>{@link temporal.VersionHolder#getIndexOfContinuity <em>Index Of Continuity</em>}</li>
 * </ul>
 * </p>
 *
 * @see temporal.TemporalPackage#getVersionHolder()
 * @model
 * @generated
 */
public interface VersionHolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' reference list.
	 * The list contents are of type {@link temporal.Temporal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' reference list.
	 * @see temporal.TemporalPackage#getVersionHolder_Versions()
	 * @model type="temporal.Temporal" opposite="versionHolder"
	 * @generated
	 */
	EList getVersions();

	/**
	 * Returns the value of the '<em><b>Index Of Continuity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Of Continuity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Of Continuity</em>' attribute.
	 * @see #setIndexOfContinuity(int)
	 * @see temporal.TemporalPackage#getVersionHolder_IndexOfContinuity()
	 * @model default="0"
	 * @generated
	 */
	int getIndexOfContinuity();

	/**
	 * Sets the value of the '{@link temporal.VersionHolder#getIndexOfContinuity <em>Index Of Continuity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Of Continuity</em>' attribute.
	 * @see #getIndexOfContinuity()
	 * @generated
	 */
	void setIndexOfContinuity(int value);

} // VersionHolder
