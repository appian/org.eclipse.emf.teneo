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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkResourceUtil;
import org.eclipse.emf.teneo.eclipselink.examples.library.Address;
import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryFactory;
import org.eclipse.emf.teneo.eclipselink.examples.library.Translator;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

public class CreateSampleLibrariesWithEclipseLinkResourceTest extends BasicEclipseLinkTest {

  private URI uri;
  private Resource resource;
  private Library library1, library2, library3;

  public void testEclipseLinkResource() throws IOException {

    // create and populate first library model instance
    library1 = LibraryFactory.eINSTANCE.createLibrary();
    library1.setName("EclipseCon Library");

    Writer writer1 = LibraryFactory.eINSTANCE.createWriter();
    writer1.setName("The True Eclipse Expert");
    library1.getWriters().add(writer1);
    
    Address address1 = LibraryFactory.eINSTANCE.createAddress();
    address1.setTown("Sin City");
    writer1.setAddress(address1);
    
    Book book1 = LibraryFactory.eINSTANCE.createBook();
    book1.setTitle("Eclipse Tips & Tricks");
    library1.getBooks().put(book1.getTitle(), book1);

    Translator translator1 = LibraryFactory.eINSTANCE.createTranslator();
    translator1.setName("Mr. Babelfish");
    book1.setTranslator(translator1);
    
    Address address2 = LibraryFactory.eINSTANCE.createAddress();
    address2.setTown("Foo City");
    // TODO add this relationship to mapping
    translator1.setAddress(address2);

    // create and populate second library model instance
    library2 = LibraryFactory.eINSTANCE.createLibrary();
    library2.setName("IBM Library");

    // create and populate third library model instance
    library3 = LibraryFactory.eINSTANCE.createLibrary();
    library3.setName("ORACLE Library");

    // create EclipseLink URI for saving/loading all library models in/from
    // database
    uri = EclipseLinkResourceUtil.createEclipseLinkURI(TEST_PERSISTENCE_UNIT_NAME, Library.class.getName());

    // save all library model instances in database
    ResourceSet resourceSet = new ResourceSetImpl();
    resourceSet.getLoadOptions().putAll(getTestDatabaseLoginProperties());
    resource = resourceSet.createResource(uri);
    resource.getContents().add(library1);
    resource.getContents().add(library2);
    resource.getContents().add(library3);
    resource.save(Collections.EMPTY_MAP);

    // unload resource of library model instances
    resource.unload();
  }
}
