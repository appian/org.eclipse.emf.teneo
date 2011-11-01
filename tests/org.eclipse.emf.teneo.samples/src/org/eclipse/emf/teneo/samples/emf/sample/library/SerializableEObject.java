/**
 * <copyright>
 * </copyright>
 *
 * $Id: SerializableEObject.java,v 1.1 2006/08/25 23:04:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.library;

import java.io.Serializable;

import org.eclipse.emf.ecore.EObject;

/**
 * Combines EObject and Serilizable
 */
public interface SerializableEObject extends EObject, Serializable {
}
