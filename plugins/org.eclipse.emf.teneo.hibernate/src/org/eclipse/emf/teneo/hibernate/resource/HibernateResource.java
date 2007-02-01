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
 * $Id: HibernateResource.java,v 1.7 2007/02/01 12:34:14 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.HbMapperException;
import org.eclipse.emf.teneo.hibernate.HbUtil;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.eclipse.emf.teneo.resource.StoreResource;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.impl.SessionImpl;

/**
 * Hibernate Resource. The hibernate resource has a Session during its lifetime. A transaction is started before the
 * load and it is stopped just after the save. The session is disconnected and reconnected when loading and saving.
 * 
 * When you create a HbDataStore through the appropriate method in the HibernateHelper class. The name you passed there
 * can be used as a parameter in the uri used to create this resource (using the parameter pmfname). The uri is then:
 * hibernate://?dsname=myemf.
 * 
 * Another simple trick which is used to fool emf a bit is that the extension of the uri can also be used to init a
 * hibernate resource!
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class HibernateResource extends StoreResource implements HbResource {
	/** The logger */
	private static Log log = LogFactory.getLog(HibernateResource.class);

	/** The store used to determine where to query for the data */
	protected HbDataStore emfDataStore;

	/** The uri parameter under which to store a session controller */
	public static String SESSION_CONTROLLER_PARAM = "sessionController";

	/** The session used for long transactions */
	private Session session = null; // is opened at first load

	/** The session controller */
	private SessionController sessionController = null;

	/** Is set to true if there is a sessionController */
	private boolean hasSessionController = false;

	/**
	 * The constructor, gets an uri and retrieves the backing OJBStore
	 */
	public HibernateResource(URI uri) {
		super(uri);

		log.debug("Creating hibernateresource using uri: " + uri.toString());

		final Map params = decodeQueryString(uri.query());

		if (params.get(DS_NAME_PARAM) != null) { // only the name
			setDefinedQueries(getQueries(params));
			emfDataStore = (HbDataStore) HbHelper.INSTANCE.getDataStore(getParam(params, DS_NAME_PARAM, uri.query()));
		} else if (params.get(SESSION_CONTROLLER_PARAM) != null) {

			setDefinedQueries(getQueries(params));

			final String scName = getParam(params, SESSION_CONTROLLER_PARAM, uri.query());
			sessionController = SessionController.getSessionController(scName);
			log.debug("Using session controller " + scName);
			emfDataStore = sessionController.getHbDataStore();
			hasSessionController = true;
		} else if (uri.fileExtension() != null) // this is probably a platform uri!
		{
			log.debug("Trying fileextension: " + uri.fileExtension());
			// then try the extension of the resource
			emfDataStore = (HbDataStore) HbHelper.INSTANCE.getDataStore(uri.fileExtension());

			// if null then assume that this is a properties file
			if (emfDataStore == null) {
				log.debug("No datastore defined for extension, assuming this is a property file " + uri.toString());
				try {
					final URIConverter uriConverter = getURIConverter();
					final InputStream is = uriConverter.createInputStream(uri);
					final Properties props = new Properties();
					props.load(is);
					is.close();
					emfDataStore = HbUtil.getCreateDataStore(props);
					setDefinedQueries(getQueries(props));
				} catch (IOException e) {
					throw new HbMapperException("Exception when reading properties from: " + uri.toString(), e);
				}
			} 
		}
		if (emfDataStore == null) {
			throw new HbMapperException("No HbDataStore can be found using the uri " + uri.toString());
		}
		log.debug("Using emf data store using  " + emfDataStore.getName());
		super.init(emfDataStore.getTopEntities());
	}

	/** Returns the emfdatastore */
	public HbDataStore getEMFDataStore() {
		return emfDataStore;
	}

	/**
	 * Returns the session of this resource, if no session is set yet then creates it using the datastore. As a default
	 * the FlushMode is set to Never.
	 */
	public Session getSession() {
		if (session == null) {
			if (hasSessionController) {
				session = sessionController.getSession();
			} else {
				// session can be null when this is an xml import! ;
				session = emfDataStore.getSessionFactory().openSession();
				session.setFlushMode(FlushMode.NEVER);
			}
		}
		return session;
	}

	/** Sets the session, overwrites current session */
	public void setSession(Session session) {
		this.session = session;
	}

	/** Returns the session, does nothing in this impl */
	public void returnSession(Session theSession) {
		// do nothing
	}

	/**
	 * Returns an array of EObjects which refer to a certain EObject, note if the array is of length zero then no
	 * refering EObjects where found.
	 */
	public Object[] getCrossReferencers(EObject referedTo) {
		Transaction tx = null;
		boolean err = true;
		final Session mySession = getSession();
		try {
			if (!hasSessionController)
				tx = mySession.beginTransaction();
			final Object[] result = emfDataStore.getCrossReferencers(mySession, referedTo);
			err = false;

			return result;
		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw new HbMapperException("Exception when doing cross reference search " + emfDataStore.getName(), e);
		} finally {
			if (!hasSessionController) {
				if (err) {
					if (tx != null)
						tx.rollback();
					mySession.close();
				} else {
					tx.commit();
				}
			}
		}
	}

	/**
	 * Saves the changed objects or removes the detached objects from this resource.
	 */
	protected void saveResource(Map options) {
		log.debug("Saving resource with uri: " + getURI());

		boolean err = true;
		Transaction tx = null;
		final Session mySession = getSession();
		try {
			if (!hasSessionController) {
				tx = mySession.beginTransaction();
			}

			final List list = super.getSuperContents();
			for (int i = 0; i < list.size(); i++) {
				final Object obj = list.get(i);
				// if (IdentifierCacheHandler.getID(obj) == null) // new object
				// {
				mySession.saveOrUpdate(obj);
				// }
				// else do nothing because hibernate does this automatically??
			}

			// delete all deleted objects
			for (int i = 0; i < removedEObjects.size(); i++) {
				final Object obj = removedEObjects.get(i);
				if (IdentifierCacheHandler.getID(obj) != null) // persisted object
				{
					if (((InternalEObject) obj).eDirectResource() == null
							|| ((InternalEObject) obj).eDirectResource() == this) {
						mySession.delete(obj);
					}
				}
			}

			// now flush everything
			if (!hasSessionController)
				mySession.flush();
			err = false;
		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw new HbMapperException("Exception when saving resource " + emfDataStore.getName(), e);
		} finally {
			if (!hasSessionController) {
				if (err) {
					if (tx != null)
						tx.rollback();
					mySession.close();
				} else {
					tx.commit();
				}
			}
		}
	}

	/**
	 * Loads all the objects in the global list
	 */
	protected List loadResource(Map options) {
		log.debug("Loading resource: " + getURI().toString());

		// first clear the old list
		Transaction tx = null;
		boolean err = true;
		final Session mySession = getSession();
		try {
			if (!hasSessionController) {
				tx = mySession.beginTransaction();
			}

			// note we have to a call to the super class otherwise an infinite loop is created
			final List storeList = loadFromStore(mySession);
			log.debug("Loaded " + storeList.size() + " objects");
			err = false;
			return storeList;
		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw new HbMapperException("Exception when saving resource " + emfDataStore.getName(), e);
		} finally {
			if (!hasSessionController) {
				if (err) {
					if (tx != null)
						tx.rollback();
					mySession.close();
				} else {
					tx.commit();
				}
			}
		}
	}

	/**
	 * Rollsback the transaction if any and clears different lists to start with an empty resource again. Note that the
	 * super.dounload is not called because that clears the list resulting in all kinds of undesirable inverseremoves.
	 */
	protected void doUnload() {
		super.doUnload();

		if (!hasSessionController) {
			AssertUtil.assertTrue("Session must be disconnected in unload", !((SessionImpl) getSession())
					.isTransactionInProgress());
			log.debug("Doing unload, closing and nullifying session");
			getSession().close();
			setSession(null);
		} else {
			log
					.debug("Doing unload, has session controller, sessioncontroller is therefor responsible for session close");
		}
	}

	/**
	 * This method can be overridden to implement specific load behavior. Note that a transaction has already been
	 * started. The session is passed as a parameter, this is the same session which can be retrieved using the
	 * getSession method. The read objects should be returned in the list. Note that after this call the retrieved
	 * objects are put in the resource content.
	 */
	protected List loadFromStore(Session sess) {
		if (definedQueriesPresent()) {
			return loadUsingDefinedQueries(sess);
		} else {
			return loadUsingTopClasses(sess);
		}
	}

	/** Reads data based on the topclasses list */
	private ArrayList loadUsingTopClasses(Session sess) {
		log.debug("Loading resource " + getURI() + " using top classes");
		final ArrayList readObjects = new ArrayList();
		for (int i = 0; i < topClassNames.length; i++) {
			final String topClassName = topClassNames[i];

			log.debug("Loading objects using hql: FROM " + topClassName);

			final Query qry = sess.createQuery("FROM " + topClassName);
			final Iterator it = qry.list().iterator();
			while (it.hasNext()) {
				final EObject eobj = (EObject) it.next();
				// extra check on container because sometimes contained items are still read in
				// case of multiple inheritance
				if (eobj.eContainer() == null) {
					readObjects.add(eobj);
				}
			}
		}
		return readObjects;
	}

	/** Reads data based using defined queries */
	private ArrayList loadUsingDefinedQueries(Session sess) {
		log.debug("Loading resource " + getURI() + " using defined queries");
		final ArrayList readObjects = new ArrayList();
		final String[] qrys = getDefinedQueries();
		for (int i = 0; i < qrys.length; i++) {
			final Query qry = sess.createQuery(qrys[i]);
			log.debug("Loading objects using hql: " + qrys[i]);
			final Iterator it = qry.list().iterator();
			while (it.hasNext()) {
				final Object obj = it.next();
				readObjects.add(obj);
			}
		}
		return readObjects;
	}

	/** Reads a set of objects into the resource by using a query. */
	public Object[] getObjectsByQuery(String query, boolean cache) {
		log.debug("Started listing objects by query " + query + " in resource " + getURI());
		Transaction tx = null;
		Session mySession = null;
		boolean err = true;
		setIsLoading(true);
		try {
			mySession = getSession();
			if (!hasSessionController) {
				tx = mySession.beginTransaction();
			}
			final Query qry = mySession.createQuery(query);
			qry.setCacheable(cache);
			final Object[] result = qry.list().toArray();

			for (int i = 0; i < result.length; i++) {
				Object object = result[i];
				if (object instanceof InternalEObject) {
					final InternalEObject eObject = (InternalEObject) object;
					// only add if the object is not already part of this resource.
					// if already part of this resource then it should have been loaded through
					// a containment relation.
					assert(eObject.eResource() != this || loadedEObjects.contains(eObject) || newEObjects.contains(eObject));						
					addToContent(eObject);
				}
			}

			err = false;
			log.debug("Listed " + result.length + " objects using query " + query + " in resource " + getURI());
			return result;
		} finally {
			if (!hasSessionController) {
				if (err) {
					if (tx != null) {
						tx.rollback();
					}
					mySession.close();
				} else {
					tx.commit();
				}
			}
			setIsLoading(false);
			log.debug("Finished getting objects by query " + query + " in resource " + getURI());
		}
	}

	/**
	 * @return the hasSessionController
	 */
	public boolean isHasSessionController() {
		return hasSessionController;
	}
	
	public boolean isLoading() {
		return isLoading;
	}
	
	/** Load additional objects into the contents using a query */
	public Object[] listByQuery(String query, boolean cache) {
		log.debug("Started listing objects by query " + query + " in resource " + getURI());
		Transaction tx = null;
		Session mySession = null;
		boolean err = true;
		setIsLoading(true);
		try {
			mySession = getSession();
			if (!hasSessionController) {
				tx = mySession.beginTransaction();
			}
			Query qry = mySession.createQuery(query);
			qry.setCacheable(cache);
			Object[] result = qry.list().toArray();

			for (int i = 0; i < result.length; i++) {
				Object object = result[i];
				if (object instanceof InternalEObject) {
					addToContent((InternalEObject) object);
				}
			}

			err = false;
			log.debug("Listed " + result.length + " objects using query " + query + " in resource " + getURI());
			return result;
		} finally {
			setIsLoading(false);
			if (!hasSessionController) {
				if (err) {
					if (tx != null){
						tx.rollback();
					}
					mySession.close();
				} else {
					tx.commit();
				}
			}			
			log.debug("Finished listing objects by query " + query + " in resource " + getURI());
		}
	}
}