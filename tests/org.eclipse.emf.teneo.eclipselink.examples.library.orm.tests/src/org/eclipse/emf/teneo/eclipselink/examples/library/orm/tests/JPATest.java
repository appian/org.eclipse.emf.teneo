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
package org.eclipse.emf.teneo.eclipselink.examples.library.orm.tests;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.eclipse.persistence.jpa.osgi.PersistenceProvider;
import org.eclipse.persistence.sessions.Session;
import org.eclipse.persistence.sessions.factories.SessionManager;

public abstract class JPATest extends ManagedTest {
	private static EntityManagerFactory factory;
	
	protected EntityManager em;
	
	public JPATest(String name) {
		super(name);
	}
	
	public EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = new PersistenceProvider().createEntityManagerFactory(getPersistenceUnitName(), null, this.getClass().getClassLoader());
		}
		return factory;
	}

	protected String getPersistenceUnitName() {
		return "default";
	}

	@Override
  protected void setUp() throws Exception  {
		super.setUp();
		em = getEntityManagerFactory().createEntityManager();
		cleanDatabase();
	}	

	@Override
  protected void tearDown() throws Exception {
		if (em != null) {
			try {
				em.close();
			} catch (RuntimeException e) {
				System.out.println("Exception closing EntityManager: "
						+ e.getMessage());
				e.printStackTrace();
				// not supposed to fail in tearDown
			} finally {
			}
		}
		super.tearDown();
	}
	protected static long nextTitleInt = Calendar.getInstance().getTimeInMillis();

	/**
	 * Subclasses should define to return all objects that should be
	 * deleted before a test is run.
	 * 
	 * @param uow
	 */
	protected abstract void cleanDatabase(EntityManager em);

	/**
	 * Utility method used to generate Strings for "don't care"
	 * attribute values of test objects:
	 *           DON'T HARD WIRE VALUES IN TESTS
	 * 
	 * @return String
	 */
	protected String getAnonymousString() {
		return String.valueOf(nextTitleInt++);
	}

	/** 
	 * Called when all the tests in the current suite are have
	 * been run.
	 */
	@Override
  protected void allTestsComplete()	{
		factory.close();
	}

	protected void cleanDatabase() {
		em.getTransaction().begin();
		cleanDatabase(em);
		em.getTransaction().commit();
	}

	protected void beginTransaction() {
		em.getTransaction().begin();
	}

	protected void commitTransaction() {
		em.getTransaction().commit();
	}

	protected void rollbackTransaction() {
		em.getTransaction().rollback();
	}
	protected void reinitializeCachesAndEntityManager() {
		Session session = SessionManager.getManager().getSession(getPersistenceUnitName());
		session.getIdentityMapAccessor().initializeAllIdentityMaps();
		em.close();
		em = getEntityManagerFactory().createEntityManager();
	}

}
