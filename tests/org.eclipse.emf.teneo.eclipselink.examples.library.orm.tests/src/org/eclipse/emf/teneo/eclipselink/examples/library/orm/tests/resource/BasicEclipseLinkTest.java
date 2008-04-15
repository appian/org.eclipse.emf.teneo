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

import java.util.Collections;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import junit.framework.TestCase;

import org.eclipse.persistence.jpa.osgi.PersistenceProvider;


public class BasicEclipseLinkTest extends TestCase {

  protected static final String TEST_PERSISTENCE_UNIT_NAME = "library";

  protected TestModelFactory testLibraryFactory = new TestModelFactory();

  protected Map<? extends Object, ? extends Object> getTestDatabaseLoginProperties() {
  	
	return Collections.emptyMap();
  }

  @Override
  protected void tearDown() throws Exception {

    super.tearDown();

    // create entity manager factory for given persistence unit name
    EntityManagerFactory entityManagerFactory = new PersistenceProvider().createEntityManagerFactory(TEST_PERSISTENCE_UNIT_NAME, getTestDatabaseLoginProperties(), this.getClass().getClassLoader()); 

    // create entity manager and begin transaction
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    // destroy library model in database and memory
    testLibraryFactory.destroyLibraryModel(entityManager);

    // close entity manager
    entityManager.close();

    // close entity manager factory for given persistence unit name
    entityManagerFactory.close();
  }
}
