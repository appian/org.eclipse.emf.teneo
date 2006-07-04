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
