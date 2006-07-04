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

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.IdClass;

/**
 * MT: Not used at the moment, overall imho the id strategy did not add that much value over directly using an
 * IdProcessor
 * 
 * Process id related annotated element for a non root entity.
 * 
 * <p>
 * Signal a failure as soon as an id annotation is processed.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 */
abstract class IdProcessorInnerStrategy extends IdProcessorAbstractStrategy {

	/** the id processing did not fail (upto now) */
	private boolean isIDWellFormed = true;

	/**
	 * Handle an entity or mapped superclass.
	 * <p>
	 * Ignore mapped superclasses after an error has been reported.
	 */
	public void begin(PAnnotatedEClass paEClass) {
		super.begin(paEClass);
		IdClass idClass = paEClass.getIdClass();
		if (isIDWellFormed && idClass != null) {
			// signal at most one error
			getIdProcessor().processIllFormed(getCurrentEntity(), "Id specified on non root entity", idClass);
			isIDWellFormed = false;
		}
	}

	/**
	 * Handles a persistent attribute with Id annotation.
	 * <p>
	 * The attribute is ignored if an error has been reported for this entity.
	 */
	public void process(PAnnotatedEAttribute paAttribute) {
		assert paAttribute.getId() != null;
		if (isIDWellFormed) {
			// signal at most one error
			getIdProcessor().processIllFormed(getCurrentEntity(), "Id specified on non root entity",
					paAttribute.getId());
			isIDWellFormed = false;
		}
	}

	/**
	 * Handles a persistent reference with EmbeddedId annotation.
	 * <p>
	 * The reference is ignored if an error has been reported for this entity.
	 */
	public void process(PAnnotatedEReference paReference) {
		assert paReference.getEmbeddedId() != null;
		if (isIDWellFormed) {
			// signal at most one error
			getIdProcessor().processIllFormed(getCurrentEntity(), "Id specified on non root entity",
					paReference.getEmbeddedId());
			isIDWellFormed = false;
		}
	}

	public void end() {
		super.end();
		isIDWellFormed = true;
	}
}
