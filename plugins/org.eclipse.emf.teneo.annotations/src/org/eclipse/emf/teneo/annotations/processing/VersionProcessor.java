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

/**
 * Process a version property.
 * <p>
 * Allowed types for version properties are int, Integer, short, Short, long, Long, Timestamp.
 * <p>
 * At most one version property should be defined for each class.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public interface VersionProcessor extends PAnnotatedProcessor {

	/**
	 * @param paAttribute
	 * @param column
	 */
	void processVersion(PAnnotatedEAttribute paAttribute);

}
