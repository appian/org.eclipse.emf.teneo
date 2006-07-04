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
 * $Id: IdProcessorAbstractStrategy.java,v 1.2 2006/07/04 21:56:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.processing;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;

/**
 * MT: Not used at the moment, overall imho the id strategy did not add that much value over directly using an
 * IdProcessor
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 */
abstract class IdProcessorAbstractStrategy {

	/** the currently processed entity */
	private PAnnotatedEClass currentEntity;

	/** the number of begin without corresponding end */
	private int nestedBegin = 0;

	/**
	 * @return Returns the idProcessor.
	 */
	protected abstract IdProcessor getIdProcessor();

	protected PAnnotatedEClass getCurrentEntity() {
		return currentEntity;
	}

	public void begin(PAnnotatedEClass paEClass) {
		if (paEClass.getEntity() != null)
			beginEntity(paEClass);
		else if (paEClass.getMappedSuperclass() != null)
			beginMappedSuper(paEClass);
		else
			throw new IllegalStateException("begin with non Entity and non mapped superclass");
	}

	/**
	 * Invoked at the beginning of the processing of the entity.
	 * 
	 * @param paEntity
	 */
	protected void beginEntity(PAnnotatedEClass paEntity) {
		if (nestedBegin > 0)
			throw new IllegalStateException("Unexpected begin with Entity");
		currentEntity = paEntity;
		nestedBegin = 1;
	}

	/**
	 * Invoked for each mapped superclass of the entity.
	 * <p>
	 * This method is not invoked if an error has been reported.
	 */
	protected void beginMappedSuper(PAnnotatedEClass paMappedSuper) {
		if (nestedBegin == 0)
			throw new IllegalStateException("Unexpected begin with non Entity");
		nestedBegin++;
	}

	public void process(PAnnotatedEStructuralFeature paFeature) {
		if (getCurrentEntity() == null)
			throw new IllegalStateException("Unexpected process outside entity");
	}

	public void end() {
		if (nestedBegin == 0)
			throw new IllegalStateException("Unexpected end");
		if (nestedBegin == 1)
			endEntity();
		else
			endMappedSuper();
		nestedBegin--;
	}

	/**
	 * 
	 */
	protected void endMappedSuper() {
	}

	/**
	 * 
	 */
	protected void endEntity() {
	}
}
