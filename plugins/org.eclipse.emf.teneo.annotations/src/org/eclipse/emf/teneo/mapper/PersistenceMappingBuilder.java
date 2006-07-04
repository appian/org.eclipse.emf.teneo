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
package org.eclipse.emf.teneo.mapper;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;

/**
 * Receives a list of ecore files and generates a mapping model.The mapping model
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public interface PersistenceMappingBuilder {

	/** The instance of this builder */
	PersistenceMappingBuilder INSTANCE = new PersistenceMappingBuilderImpl();

	/** Receives a list of ecore files and returns a Mapping */
	public PAnnotatedModel buildMapping(String[] ecoreFiles, PersistenceOptions options);

	/** Receives a list of epackages and returns a Mapping */
	public PAnnotatedModel buildMapping(EPackage[] epackages, PersistenceOptions options);
}
