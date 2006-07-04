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
 * $Id: OneToOneProcessor.java,v 1.2 2006/07/04 21:56:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.processing;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;

/**
 * Process a {@link OneToOne} annotated element.
 * <p>
 * Assumes that the given {@link PAnnotatedEStructuralFeature} is a normal OneToOne, i.e.
 * <ul>
 * <li>it is a {@link PAnnotatedEReference};
 * <li>it has a {@link OneToOne} annotation;
 * <li>each attribute on the {@link OneToOne} annotation is set possibly except for {@link OneToOne#getMappedBy()};
 * <li>TODO requirements on JoinColumns/PrimaryKeyJoinColumn
 * </ul>
 * 
 * TODO is it possible to have unidirectional PK?
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public interface OneToOneProcessor extends PAnnotatedProcessor {

	/**
	 * one to one unidirectional
	 * 
	 * @param paReference
	 * @param oneToOne
	 * @param joinColumns
	 */
	void processOtOUni(PAnnotatedEReference paReference);

	/**
	 * one to one bidirectional owner with join column
	 * 
	 * @param paReference
	 * @param oneToOne
	 * @param joinColumns
	 */
	void processOtOBidiOwner(PAnnotatedEReference paReference);

	/**
	 * one to one bidirectional inverse
	 * 
	 * @param paReference
	 * @param oneToOne
	 */
	void processOtOBidilInverse(PAnnotatedEReference paReference);
}
