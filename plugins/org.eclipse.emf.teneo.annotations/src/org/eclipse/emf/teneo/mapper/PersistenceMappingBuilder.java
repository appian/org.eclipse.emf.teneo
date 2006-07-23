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
 * </copyright>
 *
 * $Id: PersistenceMappingBuilder.java,v 1.2 2006/07/23 19:38:45 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapper;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;

/**
 * Receives a list of ecore files and generates a mapping model.The mapping model
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public interface PersistenceMappingBuilder {

	/** The instance of this builder */
	PersistenceMappingBuilder INSTANCE = new PersistenceMappingBuilderImpl();

	/** Receives a list of ecore files and returns a Mapping */
	public PAnnotatedModel buildMapping(String[] ecoreFiles, PersistenceOptions options);

	/** Receives a list of epackages and returns a Mapping */
	public PAnnotatedModel buildMapping(EPackage[] epackages, PersistenceOptions options);
}
