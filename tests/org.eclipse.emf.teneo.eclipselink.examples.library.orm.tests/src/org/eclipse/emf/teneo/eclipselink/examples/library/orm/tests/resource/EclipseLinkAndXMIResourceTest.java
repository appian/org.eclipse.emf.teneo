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


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkResourceImpl;
import org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkResourceUtil;
import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Library;
import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;
import org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum;
import org.eclipse.emf.teneo.eclipselink.examples.library.impl.StringToBookMapEntryImpl;

public class EclipseLinkAndXMIResourceTest extends BasicEclipseLinkTest {

  private IProject testProject;
  private URI libraryURI, forumURI;
  private Library library1;
  private Forum forum1;
  private Resource libraryResource1, libraryResource2, libraryResource3;
  private Resource forumResource1, forumResource2, forumResource3;

  @Override
  protected void setUp() throws Exception {

    super.setUp();

    // create test project in runtime workspace
    IWorkspace workspace = ResourcesPlugin.getWorkspace();
    testProject = workspace.getRoot().getProject("Test");
    IProjectDescription description = workspace.newProjectDescription("Test");
    testProject.create(description, null);
    testProject.open(null);
  }

  @Override
  protected void tearDown() throws Exception {

    // delete test project including its contents from runtime workspace
    try {
      testProject.delete(true, true, null);
    }
    catch (CoreException cex) {
      cex.printStackTrace();
    }
    
    super.tearDown();
  }

  public void testEclipseLinkAndXMIResource() throws IOException {

    // create library model instance
    library1 = testLibraryFactory.createLibraryModel();

    // create forum model instance
    forum1 = testLibraryFactory.createForumModel();

    saveLibraryModel1AndForumModel1();
    loadLibraryModel2FromForumModel2ViaIDBasedCrossDocumentReference();
    loadLibraryModel3FromForumModel3ViaIndexBasedCrossDocumentReference();
    deleteLibraryModel1();
    unloadAllLibraryAndForumModels();
  }

  private void saveLibraryModel1AndForumModel1() throws IOException {

    // create EclipseLink URI for saving/loading library model in/from database
    String query = EclipseLinkResourceUtil.createContentsEqualQuery(LibraryPackage.eINSTANCE.getLibrary(), LibraryPackage.eINSTANCE.getLibrary_Name(), library1.getName());
    libraryURI = EclipseLinkResourceUtil.createEclipseLinkURI(TEST_PERSISTENCE_UNIT_NAME, query);

    // save library model instance in database
    ResourceSet resourceSet1 = new ResourceSetImpl();
    resourceSet1.getLoadOptions().putAll(getTestPersistenceUnitProperties());
    libraryResource1 = resourceSet1.createResource(libraryURI);

    assertTrue(libraryResource1 instanceof EclipseLinkResourceImpl);

    libraryResource1.getContents().add(library1);
    libraryResource1.save(Collections.EMPTY_MAP);

    // create platform resource URI for saving/loading forum model in/from
    // XMI file
    String forumPathName = createForumModelPathName(testProject, forum1);
    forumURI = URI.createPlatformResourceURI(forumPathName, false);

    // save forum model instance in XMI resource
    forumResource1 = resourceSet1.createResource(forumURI);

    assertTrue(forumResource1 instanceof XMIResourceImpl);

    forumResource1.getContents().add(forum1);
    forumResource1.save(Collections.EMPTY_MAP);
  }

  private void loadLibraryModel2FromForumModel2ViaIDBasedCrossDocumentReference() {

    // load second forum model instance from XMI resource
    ResourceSet resourceSet2 = new ResourceSetImpl();
    resourceSet2.getLoadOptions().putAll(getTestPersistenceUnitProperties());
    forumResource2 = resourceSet2.getResource(forumURI, true);

    assertTrue(forumResource2 instanceof XMIResourceImpl);

    // analyse second forum model instance
    List<EObject> forumContents2 = forumResource2.getContents();
    assertNotNull(forumContents2);
    assertEquals(1, forumContents2.size());
    EObject forum2 = forumContents2.get(0);

    EPackage forumPack = forum2.eClass().getEPackage();
    EClass forumCls = (EClass) forumPack.getEClassifier("Forum");
    EStructuralFeature nameFeat = forumCls.getEStructuralFeature("name");
    EStructuralFeature ratedAuthorsFeat = forumCls.getEStructuralFeature("ratedAuthors");
    
    assertNotNull(forum2.eGet(nameFeat));
    assertEquals(forum1.eGet(nameFeat), forum2.eGet(nameFeat));
    assertNotNull(forum2.eGet(ratedAuthorsFeat));
    assertEquals(((EList<?>) forum1.eGet(ratedAuthorsFeat)).size(), ((EList<?>) forum2.eGet(ratedAuthorsFeat)).size());

    // navigate from second forum to referenced rated author and thereby
    // lazily load second library model instance from database resource
    Writer writer2 = (Writer) ((EList<?>) forum2.eGet(ratedAuthorsFeat)).get(0);
    
    assertNotNull(writer2);
    
    libraryResource2 = writer2.eResource();

    assertTrue(libraryResource2 instanceof EclipseLinkResourceImpl);
    assertEquals(libraryResource2.getURI(), libraryURI);

    // analyse second library model instance
    assertTrue(writer2.eContainer() instanceof Library);
    Library library2 = (Library) writer2.eContainer();

    assertNotNull(library2.getName());
    assertEquals(library1.getName(), library2.getName());
    assertNotNull(library2.getWriters());
    assertEquals(library1.getWriters().size(), library2.getWriters().size());
    assertNotNull(library2.getBooks());
    assertEquals(library1.getBooks().size(), library2.getBooks().size());
  }

  private void loadLibraryModel3FromForumModel3ViaIndexBasedCrossDocumentReference() {

    // load third forum model instance from XMI resource
    ResourceSet resourceSet3 = new ResourceSetImpl();
    resourceSet3.getLoadOptions().putAll(getTestPersistenceUnitProperties());
    forumResource3 = resourceSet3.getResource(forumURI, true);

    assertTrue(forumResource3 instanceof XMIResourceImpl);

    // analyse third forum model instance
    List<EObject> forumContents3 = forumResource3.getContents();
    assertNotNull(forumContents3);
    assertEquals(1, forumContents3.size());
    EObject forum3 = forumContents3.get(0);

    EPackage forumPack = forum3.eClass().getEPackage();
    EClass forumCls = (EClass) forumPack.getEClassifier("Forum");
    EStructuralFeature nameFeat = forumCls.getEStructuralFeature("name");
    EStructuralFeature featuredBooksFeat = forumCls.getEStructuralFeature("featuredBooks");
    
    assertNotNull(forum3.eGet(nameFeat));
    assertEquals(forum1.eGet(nameFeat), forum3.eGet(nameFeat));
    assertNotNull(forum3.eGet(featuredBooksFeat));
    assertEquals(((EList<?>) forum1.eGet(featuredBooksFeat)).size(), ((EList<?>) forum3.eGet(featuredBooksFeat)).size());

    // navigate from third forum to referenced featured book and thereby
    // lazily load third library model instance from database resource
    Book book3 = (Book) ((EList<?>) forum3.eGet(featuredBooksFeat)).get(0);
    
    assertNotNull(book3);
    
    libraryResource3 = book3.eResource();

    assertTrue(libraryResource3 instanceof EclipseLinkResourceImpl);
    assertEquals(libraryResource3.getURI(), libraryURI);

    // analyse third library model instance
    assertTrue(book3.eContainer() instanceof StringToBookMapEntryImpl);
    StringToBookMapEntryImpl bookEntry3 = (StringToBookMapEntryImpl) book3.eContainer();
    assertTrue(bookEntry3.eContainer() instanceof Library);
    Library library3 = (Library) bookEntry3.eContainer();

    assertNotNull(library3.getName());
    assertEquals(library1.getName(), library3.getName());
    assertNotNull(library3.getWriters());
    assertEquals(library1.getWriters().size(), library3.getWriters().size());
    assertNotNull(library3.getBooks());
    assertEquals(library1.getBooks().size(), library3.getBooks().size());
  }

  private void deleteLibraryModel1() throws IOException {

    // delete first library model instance in database
    libraryResource1.getContents().remove(library1);
    libraryResource1.save(Collections.EMPTY_MAP);
  }

  private void unloadAllLibraryAndForumModels() {

    // unload resources of first library and forum model instance
    libraryResource1.unload();
    forumResource1.unload();

    // unload resources of second library and forum model instance
    libraryResource2.unload();
    forumResource2.unload();

    // unload resources of third library and forum model instance
    libraryResource3.unload();
    forumResource3.unload();
  }

  //
  // helper methods
  //

  private String createForumModelPathName(IProject project, Forum forum) {

    IPath result = project.getFullPath().append(forum.getName() + "." + forum.eClass().getEPackage().getName());
    return result.toString();
  }
}
