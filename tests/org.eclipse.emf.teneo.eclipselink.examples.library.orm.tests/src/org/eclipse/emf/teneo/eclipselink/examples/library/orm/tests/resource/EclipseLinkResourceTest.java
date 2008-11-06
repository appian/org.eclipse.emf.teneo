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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage;
import org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryImpl;
import org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkResourceImpl;
import org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkResourceUtil;

public class EclipseLinkResourceTest extends BasicEclipseLinkTest {

  private URI uri;
  private Resource resource1, resource2;
  private Library library1;

  public void testEclipseLinkResource() throws IOException {

    // create library model instance
    library1 = testLibraryFactory.createLibraryModel();

    saveLibraryModel1();
    loadLibraryModel2();
    deleteLibraryModel1();
    reloadLibraryModel2();
    unloadAllLibraryModels();
  }

  private void saveLibraryModel1() throws IOException {

    // create EclipseLink URI for saving/loading library model in/from database
    String query = EclipseLinkResourceUtil.createContentsEqualQuery(LibraryPackage.eINSTANCE.getLibrary(), LibraryPackage.eINSTANCE.getLibrary_Name(), library1.getName());
    uri = EclipseLinkResourceUtil.createEclipseLinkURI(TEST_PERSISTENCE_UNIT_NAME, query);

    // save library model instance in database
    ResourceSet resourceSet1 = new ResourceSetImpl();
    resourceSet1.getLoadOptions().putAll(getTestPersistenceUnitProperties());
    resource1 = resourceSet1.createResource(uri);

    assertTrue(resource1 instanceof EclipseLinkResourceImpl);
    assertFalse(resource1.isLoaded());

    resource1.getContents().add(library1);

    assertTrue(resource1.isLoaded());

    resource1.save(Collections.EMPTY_MAP);
  }

  private void loadLibraryModel2() {

    // load second library model instance from database
    ResourceSet resourceSet2 = new ResourceSetImpl();
    resourceSet2.getLoadOptions().putAll(getTestPersistenceUnitProperties());
    resource2 = resourceSet2.getResource(uri, true);

    assertTrue(resource2 instanceof EclipseLinkResourceImpl);
    assertTrue(resource2.isLoaded());

    // analyse second library model instance
    List<EObject> contents2 = resource2.getContents();
    assertNotNull(contents2);
    assertEquals(1, contents2.size());
    assertTrue(contents2.get(0) instanceof LibraryImpl);
    Library library2 = (Library) contents2.get(0);

    assertNotNull(library2.getName());
    assertEquals(library1.getName(), library2.getName());
    assertNotNull(library2.getWriters());
    assertEquals(library1.getWriters().size(), library2.getWriters().size());
    assertEquals(resource2, (library2.getWriters().get(0)).eResource());
    assertNotNull(library2.getBooks());
    assertEquals(library1.getBooks().size(), library2.getBooks().size());
    assertEquals(resource2, (library2.getBooks().get("myBook")).eResource());
  }

  private void deleteLibraryModel1() throws IOException {

    // delete first library model instance in database
    resource1.getContents().remove(library1);
    resource1.save(Collections.EMPTY_MAP);
  }

  private void reloadLibraryModel2() throws IOException {

    // reload second library model instance from database
    resource2.unload();

    assertFalse(resource2.isLoaded());

    resource2.load(Collections.EMPTY_MAP);

    assertTrue(resource2.isLoaded());

    // analyse second library model instance
    List<EObject> contents2 = resource2.getContents();
    assertNotNull(contents2);
    assertEquals(0, contents2.size());
  }

  private void unloadAllLibraryModels() {

    // unload resource of first library model instance
    resource1.unload();

    assertFalse(resource1.isLoaded());

    // unload resource of second library model instance
    resource2.unload();

    assertFalse(resource2.isLoaded());
  }
}
