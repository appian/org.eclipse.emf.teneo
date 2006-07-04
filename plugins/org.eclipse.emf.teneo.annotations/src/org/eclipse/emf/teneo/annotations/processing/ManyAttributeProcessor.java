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

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;

/**
 * Maps many valued attributes.
 * 
 * <p>
 * Assumes that the given {@link PAnnotatedEAttribute} is normal, i.e.
 * <ul>
 * <li>it is a {@link PAnnotatedEReference};
 * <li>it has a {@link OneToMany} annotation;
 * <li>oneToMany.getCascade() is ALL
 * <li>oneToMany.getTargetEntity is not specified
 * <li>the {@link OneToMany} annotation have the following attributes set:
 * <li>TODO which is the meaning of a column annotation? Can it have one?
 * </ul>
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public interface ManyAttributeProcessor extends PAnnotatedProcessor {

	public void processManyAttribute(PAnnotatedEAttribute paAttribute);
}
