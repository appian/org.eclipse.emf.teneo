/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: GMFNotationAction.java,v 1.8 2009/06/08 07:44:05 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests persisting of gmf diagram.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public class GMFNotationAction extends AbstractTestAction {

	/** Constructor */
	public GMFNotationAction() {
		throw new UnsupportedOperationException("Not supported");
		// super(new EPackage[] { EcorePackage.eINSTANCE, NotationPackage.eINSTANCE, MindmapPackage.eINSTANCE });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		// props.setProperty(PersistenceOptions.USE_MAPPING_FILE, "true");
		return props;
	}

	/** Reads the library model and persists it. */
	@Override
	public void doAction(TestStore store) {
		final URL mindmapURL = getClass().getResource("default.mindmap");
		final URI mindmapURI = URI.createURI(mindmapURL.toString());
		final URL diagramURL = getClass().getResource("default.mmd");
		final URI diagramURI = URI.createURI(diagramURL.toString());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mmd", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mindmap", new XMIResourceFactoryImpl());
		final ResourceSet rs = new ResourceSetImpl();
		final XMIResource mindmapResource = (XMIResource) rs.createResource(mindmapURI);
		final XMIResource diagramResource = (XMIResource) rs.createResource(diagramURI);
		try {
			// default load options.
			final HashMap<Object, Object> loadOptions = new HashMap<Object, Object>();
			loadOptions.putAll(mindmapResource.getDefaultLoadOptions());
			// loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);
			loadOptions.put(XMIResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
			mindmapResource.load(loadOptions);
			diagramResource.load(loadOptions);
			store.beginTransaction();
			for (Object element : mindmapResource.getContents()) {
				store.store(element);
			}
			for (Object element : diagramResource.getContents()) {
				store.store(element);
			}
			store.commitTransaction();
		} catch (Exception e) {
			throw new StoreTestException("Exception", e);
		}

	}
}
