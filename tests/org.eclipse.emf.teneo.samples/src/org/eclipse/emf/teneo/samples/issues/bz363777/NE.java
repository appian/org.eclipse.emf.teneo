/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz363777;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz363777.NE#getMapChannels <em>Map Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Package#getNE()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface NE extends EObject {
	/**
	 * Returns the value of the '<em><b>Map Channels</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap},
	 * and the value is of type {@link org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMapService},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Channels</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Channels</em>' map.
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Package#getNE_MapChannels()
	 * @model mapType="org.eclipse.emf.teneo.samples.issues.bz363777.ChanelMapToChanelMapService<org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap, org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMapService>"
	 * @generated
	 */
	EMap<ChannelMap, ChannelMapService> getMapChannels();

} // NE
