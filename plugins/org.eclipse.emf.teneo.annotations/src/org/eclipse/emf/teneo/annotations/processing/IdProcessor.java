/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: IdProcessor.java,v 1.2 2006/07/04 21:56:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.processing;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;

/**
 * Process an id property.
 * 
 * This processor is used in combination with a Id..Strategy. The IdStrategy performs different kinds of error checking
 * to detect illegal situations. The id processor actually does the mapping to the
 * 
 * <p>
 * The process always begin with beginId and ends with endId.
 * 
 * <p>
 * Either a single processEmbeddedId or one or many processIdProperty are invoked within a begin/end pair.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public interface IdProcessor extends PAnnotatedProcessor {
	/**
	 * Invoked on each property of the id.
	 */
	void processIdProperty(PAnnotatedEAttribute idAttribute);

	/**
	 * Invoked on the reference of the embedded id.
	 */
	void processEmbeddedId(PAnnotatedEReference idReference);
}
