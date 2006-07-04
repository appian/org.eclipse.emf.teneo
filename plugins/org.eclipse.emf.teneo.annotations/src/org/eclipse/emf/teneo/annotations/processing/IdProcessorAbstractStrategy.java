/*
 *	Copyright 2004-2005, Elver.org (http://www.eclipse.org/emf/teneo).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
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
