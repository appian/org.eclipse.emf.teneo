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
 * $Id: DocumentRootAction.java,v 1.3 2009/08/22 00:10:05 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot.ComplexType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot.DocumentRoot;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot.DocumentrootFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot.DocumentrootPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot.util.DocumentrootResourceFactoryImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests persisting DocumentRoot.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class DocumentRootAction extends AbstractTestAction {

	public DocumentRootAction() {
		super(DocumentrootPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.MAP_DOCUMENT_ROOT, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			final DocumentRoot dr = DocumentrootFactory.eINSTANCE.createDocumentRoot();
			dr.getMixed().add(DocumentrootPackage.eINSTANCE.getDocumentRoot_Test(), "test");
			dr.getMixed().add(DocumentrootPackage.eINSTANCE.getDocumentRoot_OtherTest(), "otherTest");

			final ComplexType complexType = DocumentrootFactory.eINSTANCE.createComplexType();
			complexType.setTest("complexTest");
			store.store(dr);
			store.commitTransaction();

			// try {
			// final XMLResource xmlResource = new XMLResourceImpl();
			// xmlResource.getContents().add(dr);
			// xmlResource.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			// xmlResource.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			//
			// xmlResource.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			//
			// xmlResource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
			// xmlResource.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
			//
			// xmlResource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
			// final StringWriter sw = new StringWriter();
			// xmlResource.save(sw, Collections.EMPTY_MAP);
			// System.err.println(sw.toString());
			// } catch (IOException e) {
			// throw new IllegalStateException(e);
			// }
		}

		{
			store.beginTransaction();
			final DocumentRoot dr = store.getObject(DocumentRoot.class);
			assertEquals(DocumentrootPackage.eINSTANCE.getDocumentRoot_Test(), dr.getMixed().get(0)
					.getEStructuralFeature());
			assertEquals("test", dr.getMixed().get(0).getValue());
			assertEquals(DocumentrootPackage.eINSTANCE.getDocumentRoot_OtherTest(), dr.getMixed().get(1)
					.getEStructuralFeature());
			assertEquals("otherTest", dr.getMixed().get(1).getValue());
			store.commitTransaction();
		}

		{
			final Resource resource = readResource("document_root.xml");
			assertEquals(1, resource.getContents().size());
			final DocumentRoot dr = (DocumentRoot) resource.getContents().get(0);
			assertEquals(DocumentrootPackage.eINSTANCE.getDocumentRoot_Test(), dr.getMixed().get(0)
					.getEStructuralFeature());
			assertEquals("test", dr.getMixed().get(0).getValue());
		}
	}

	private Resource readResource(String fileName) {
		// read the xml's
		final URL url = DocumentRootAction.class.getResource(fileName);
		final Resource resource = new DocumentrootResourceFactoryImpl().createResource(URI.createURI(url.toString()));
		// xmlResource.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		// xmlResource.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		//
		// xmlResource.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		//
		// xmlResource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		// xmlResource.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		//
		// xmlResource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		try {
			resource.load(Collections.EMPTY_MAP);
			System.err.println(resource.getContents().size());
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
		return resource;
	}
}