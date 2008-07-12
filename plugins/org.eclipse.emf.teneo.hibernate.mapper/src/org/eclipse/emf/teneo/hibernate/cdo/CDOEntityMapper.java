/***************************************************************************
 * Copyright (c) 2004 - 2008 Springsite B.V. and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Martin Taal - initial API and implementation
 **************************************************************************/
package org.eclipse.emf.teneo.hibernate.cdo;

import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManagerFactory;
import org.eclipse.emf.teneo.extension.ExtensionUtil;
import org.eclipse.emf.teneo.hibernate.mapper.EntityMapper;
import org.eclipse.emf.teneo.hibernate.mapper.MappingContext;
import org.eclipse.emf.teneo.hibernate.mapper.MappingUtil;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Adds mapping for econtainer and eresource.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class CDOEntityMapper extends EntityMapper {
	
	private PAnnotatedEClass currentEntity = null;
	private boolean addedExtraMappings = false;
	
	public void processEntity(PAnnotatedEClass entity) {
		// not the nicest solution
		currentEntity = entity;
		try {
			addedExtraMappings = false;
			super.processEntity(entity);
		} finally {
			currentEntity = null;
		}
	}
	
	// add container and resource mappings
	protected void processFeatures(List<PAnnotatedEStructuralFeature> features) {
		super.processFeatures(features);
		
		if (!addedExtraMappings && currentEntity.getPaSuperEntity() == null) {
			final Element entityElement = getHbmContext().getCurrent();
			final Element resourceElement = entityElement.addElement("property");
			resourceElement.addAttribute("name", "resourceID");
			resourceElement.addElement("column").addAttribute("name", "_resID_Entity");
			resourceElement.addElement("column").addAttribute("name", "_resID_ID");
			resourceElement.addElement("column").addAttribute("name", "_resID_class");
			resourceElement.addAttribute("type", "org.eclipse.emf.cdo.server.internal.hibernate.tuplizer.CDOIDUserType");
			final Element containerElement = entityElement.addElement("property");
			containerElement.addAttribute("name", "containerID");
			containerElement.addElement("column").addAttribute("name", "_contID_Entity");
			containerElement.addElement("column").addAttribute("name", "_contID_ID");
			containerElement.addElement("column").addAttribute("name", "_contID_class");
			containerElement.addAttribute("type", "org.eclipse.emf.cdo.server.internal.hibernate.tuplizer.CDOIDUserType");
			final Element containingFeatureElement = entityElement.addElement("property");
			containingFeatureElement.addAttribute("name", "containingFeatureID");
			containingFeatureElement.addAttribute("column", "_contFeatureID");
			containingFeatureElement.addAttribute("type", "int");
			addedExtraMappings = true;
		}
	}
}
