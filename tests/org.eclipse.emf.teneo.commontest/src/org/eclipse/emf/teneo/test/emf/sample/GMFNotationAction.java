/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: GMFNotationAction.java,v 1.4 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.example.mindmap.MindmapPackage;

/**
 * Tests persisting of gmf diagram.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $ 
*/
public class GMFNotationAction extends AbstractTestAction {
	
	/** Constructor */
	public GMFNotationAction() {
		super(new EPackage[] {EcorePackage.eINSTANCE, NotationPackage.eINSTANCE, MindmapPackage.eINSTANCE});
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		//props.setProperty(PersistenceOptions.USE_MAPPING_FILE, "true");
		return props;
	}

	/** Reads the library model and persists it. */
	public void doAction(TestStore store) {
		store.disableDrop();
		
		final URL mindmapURL = getClass().getResource("default.mindmap");
		final URI mindmapURI = URI.createURI(mindmapURL.toString());
		final URL diagramURL = getClass().getResource("default.mmd");
		final URI diagramURI = URI.createURI(diagramURL.toString());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mmd", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mindmap", new XMIResourceFactoryImpl());
		final ResourceSet rs = new ResourceSetImpl();
		final XMIResource mindmapResource = (XMIResource)rs.createResource(mindmapURI);
		final XMIResource diagramResource = (XMIResource)rs.createResource(diagramURI);
		try {
			// default load options.
			final HashMap loadOptions = new HashMap();
			loadOptions.putAll(mindmapResource.getDefaultLoadOptions());
			//loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);
			loadOptions.put(XMIResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
			mindmapResource.load(loadOptions);
			diagramResource.load(loadOptions);
			store.beginTransaction();
			for (Iterator it = mindmapResource.getContents().iterator(); it.hasNext();) {
				store.store(it.next());
			}
			for (Iterator it = diagramResource.getContents().iterator(); it.hasNext();) {
				store.store(it.next());
			}
			store.commitTransaction();
		} catch (Exception e) {
			throw new StoreTestException("Exception", e);
		}
	
	}
}
