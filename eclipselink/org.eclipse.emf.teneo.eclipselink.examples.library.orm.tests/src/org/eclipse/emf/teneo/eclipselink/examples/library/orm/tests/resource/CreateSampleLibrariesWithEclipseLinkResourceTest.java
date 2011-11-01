/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.examples.library.orm.tests.resource;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.eclipselink.examples.library.Address;
import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryFactory;
import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage;
import org.eclipse.emf.teneo.eclipselink.examples.library.Translator;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;
import org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkResourceImpl;
import org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkURIUtil;

public class CreateSampleLibrariesWithEclipseLinkResourceTest extends TestCase {

	private URI uri;
	private Resource resource;
	private Library libraryEclipseCon, libraryIBM, libraryOracle;

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		// create and populate first library model instance
		libraryEclipseCon = LibraryFactory.eINSTANCE.createLibrary();
		libraryEclipseCon.setName("EclipseCon Library");

		Writer writer1 = LibraryFactory.eINSTANCE.createWriter();
		writer1.setName("The True Eclipse Expert");
		libraryEclipseCon.getWriters().add(writer1);

		Address address1 = LibraryFactory.eINSTANCE.createAddress();
		address1.setTown("Sin City");
		writer1.setAddress(address1);

		Book book1 = LibraryFactory.eINSTANCE.createBook();
		book1.setTitle("Eclipse Tips & Tricks");
		libraryEclipseCon.getBooks().put(book1.getTitle(), book1);

		Translator translator1 = LibraryFactory.eINSTANCE.createTranslator();
		translator1.setName("Mr. Babelfish");
		book1.setTranslator(translator1);

		Address address2 = LibraryFactory.eINSTANCE.createAddress();
		address2.setTown("Foo City");
		// TODO add this relationship to mapping
		translator1.setAddress(address2);

		// create and populate second library model instance
		libraryIBM = LibraryFactory.eINSTANCE.createLibrary();
		libraryIBM.setName("IBM Library");

		// create and populate third library model instance
		libraryOracle = LibraryFactory.eINSTANCE.createLibrary();
		libraryOracle.setName("ORACLE Library");

		// create EclipseLink URI for saving/loading all library models in/from
		// database
		String query = EclipseLinkURIUtil.createContentsInstancesOfQuery(LibraryPackage.eINSTANCE.getLibrary());
		uri = EclipseLinkURIUtil.createEclipseLinkURI(AbstractEclipseLinkTest.TEST_PERSISTENCE_UNIT_NAME, query);

		// save all library model instances in database
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().putAll(
				AbstractEclipseLinkTest.getTestPersistenceUnitProperties(this.getClass().getClassLoader()));
		resource = resourceSet.createResource(uri);
		resource.getContents().add(libraryEclipseCon);
		resource.getContents().add(libraryIBM);
		resource.getContents().add(libraryOracle);
		resource.save(Collections.EMPTY_MAP);

		// unload resource of library model instances
		resource.unload();
	}

	public void testEclipseLinkResourceContentPresent() throws IOException {
		// load second library model instance from database
		ResourceSet resourceSet2 = new ResourceSetImpl();
		resourceSet2.getLoadOptions().putAll(
				AbstractEclipseLinkTest.getTestPersistenceUnitProperties(this.getClass().getClassLoader()));
		Resource resource2 = resourceSet2.getResource(uri, true);

		assertTrue(resource2 instanceof EclipseLinkResourceImpl);
		assertTrue(resource2.isLoaded());

		// analyse second library model instance
		List<EObject> contents2 = resource2.getContents();
		assertNotNull(contents2);
		assertEquals(3, contents2.size());
	}
}
