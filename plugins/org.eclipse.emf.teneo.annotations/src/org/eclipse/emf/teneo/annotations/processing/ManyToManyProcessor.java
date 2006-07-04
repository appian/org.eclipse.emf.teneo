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
 * $Id: ManyToManyProcessor.java,v 1.2 2006/07/04 21:56:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.processing;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;

/**
 * Process many-to-many associations
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public interface ManyToManyProcessor extends PAnnotatedProcessor {

	/**
	 * Many to Many unidirectional
	 * 
	 * @param paReference
	 * @param manyToMany
	 * @param joinTable
	 */
	public void processMtMUni(PAnnotatedEReference paReference);

	/**
	 * Many to Many bidirectional owner
	 * 
	 * @param paReference
	 * @param manyToMany
	 * @param joinTable
	 */
	public void processMtMBidiOwner(PAnnotatedEReference paReference);

	/**
	 * Many to Many bidirectional inverse
	 * 
	 * @param paReference
	 * @param manyToMany
	 */
	public void processMtMBidiInverse(PAnnotatedEReference paReference);
}
