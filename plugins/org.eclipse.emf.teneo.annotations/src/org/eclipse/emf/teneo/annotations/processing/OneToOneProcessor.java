/*
 *	Copyright 2005-2006, Elver.org (http://www.eclipse.org/emf/teneo).
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
