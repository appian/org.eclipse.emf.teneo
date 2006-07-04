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
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.IdClass;

/**
 * MT: Not used at the moment, overall imho the id strategy did not add that much value over directly using an
 * IdProcessor
 * 
 * TODO redocument all.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 */
abstract class IdProcessorRootStrategy extends IdProcessorAbstractStrategy {

	/** the entity defines an id class */
	private boolean hasEntityIdClass = false;

	/** id class defined on mapped superclass */
	private boolean hasMappedIdClass = false;

	/** at least one id attribute has been processed for this entity */
	private boolean hasIdAttributes = false;

	/** has an embeddededid annotation */
	private boolean hasEmbeddedId = false;

	/** the id for this entity has been fully defined */
	private boolean isIDDefined = false;

	/** the id processing did not fail (upto now) */
	private boolean isIDWellFormed = true;

	/**
	 * Invoked at the beginning of the processing of the entity.
	 * 
	 * @param paEntity
	 */
	protected void beginEntity(PAnnotatedEClass paEntity) {
		super.beginEntity(paEntity);
		hasIdAttributes = false;
		// TODO check if getIdClass resolves to a proper EClass, only in validation?
		IdClass idClass = paEntity.getIdClass();
		hasEntityIdClass = idClass != null;
		// getIdProcessor().begin(getCurrentEntity());
	}

	/**
	 * Invoked for each mapped superclass of the entity.
	 * <p>
	 * This method is not invoked if an error has been reported.
	 */
	protected void beginMappedSuper(PAnnotatedEClass paMappedSuper) {
		super.beginMappedSuper(paMappedSuper);
		IdClass idClass = paMappedSuper.getIdClass();
		if (isIDWellFormed && idClass != null) {
			if (hasEntityIdClass) {
				getIdProcessor().processIllFormed(getCurrentEntity(),
						"Specified IdClass both in entity and in mapped superclasses", paMappedSuper.getIdClass());
				isIDWellFormed = false;
			} else if (isIDDefined) {
				getIdProcessor().processIllFormed(getCurrentEntity(), "Id defined in different mapped superclasses",
						paMappedSuper.getIdClass());
				isIDWellFormed = false;
			}
			hasMappedIdClass = true;
			if (isIDWellFormed && idClass != null) {
				// getIdProcessor().begin(paMappedSuper);
			}
		}
		// todo not handle normal id attribute?
	}

	/**
	 * Handles a persistent attribute with Id annotation.
	 * <p>
	 * The attribute is ignored if an error has been reported for this entity.
	 */
	void process(PAnnotatedEAttribute paAttribute) {
		assert paAttribute.getId() != null;
		hasIdAttributes = true;

		if (isIDWellFormed && isIDDefined) {
			getIdProcessor().processIllFormed(getCurrentEntity(), "Id specified both in mapped super and in entity",
					paAttribute.getId());
			isIDWellFormed = false;
		}
		if (isIDWellFormed)
			getIdProcessor().processIdProperty(paAttribute);
	}

	/**
	 * Handles a persistent reference with EmbeddedId annotation.
	 * <p>
	 * The reference is ignored if an error has been reported for this entity.
	 */
	void process(PAnnotatedEReference paReference) {
		assert paReference.getEmbeddedId() != null;
		hasEmbeddedId = true;

		if (isIDWellFormed) {
			if (isIDDefined) {
				getIdProcessor().processIllFormed(getCurrentEntity(),
						"Id specified both in mapped super and in entity", paReference.getEmbeddedId());
				isIDWellFormed = false;
			} else if (hasEmbeddedId) {
				getIdProcessor().processIllFormed(getCurrentEntity(), "Specified different more than one EmbeddedId",
						paReference.getEmbeddedId());
				isIDWellFormed = false;
			} else if (hasEntityIdClass) {
				getIdProcessor().processIllFormed(getCurrentEntity(), "Specified both EmbeddedId and IdClass",
						paReference.getEmbeddedId());
				isIDWellFormed = false;
			}
		}
		if (isIDWellFormed)
			getIdProcessor().processEmbeddedId(paReference);
	}

	/**
	 * Dispatch either to {@link #process(PAnnotatedEAttribute) } or to {@link #process(PAnnotatedEReference) }
	 * according to argument type.
	 */
	public void process(PAnnotatedEStructuralFeature paFeature) {
		super.process(paFeature);
		if (paFeature instanceof PAnnotatedEReference)
			process((PAnnotatedEReference) paFeature);
		else
			process((PAnnotatedEAttribute) paFeature);
	}

	/**
	 * Invoked for each beginMappedSuper to signal the conclusion of the processing of the mapped superclass.
	 */
	protected void endMappedSuper() {
		isIDDefined = hasIdAttributes || hasEmbeddedId || hasMappedIdClass;
		super.endMappedSuper();
	}

	/**
	 * Invoked at the conclusion of the id processing.
	 * <p>
	 * This method is invoke also if an error has been reported.
	 */
	protected void endEntity() {
		// getIdProcessor().end();
		hasEntityIdClass = false;
		hasMappedIdClass = false;
		hasIdAttributes = false;
		hasEmbeddedId = false;
		isIDDefined = false;
		isIDWellFormed = true;
		super.endEntity();
	}
}
