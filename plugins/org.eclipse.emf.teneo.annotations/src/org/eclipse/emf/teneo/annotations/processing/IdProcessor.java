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
