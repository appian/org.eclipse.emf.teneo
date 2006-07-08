/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: JPOXResource.java,v 1.1 2006/07/08 22:04:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.emf.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.jdo.FetchPlan;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;
import javax.jdo.spi.PersistenceCapable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.eclipse.emf.teneo.jpox.emf.JpoxConstants;
import org.eclipse.emf.teneo.jpox.emf.JpoxDataStore;
import org.eclipse.emf.teneo.jpox.emf.JpoxHelper;
import org.eclipse.emf.teneo.jpox.emf.JpoxStoreException;
import org.eclipse.emf.teneo.jpox.emf.JpoxUtil;
import org.eclipse.emf.teneo.resource.StoreResource;

/**
 * JPOX Resource. The JPOX resource is connected to a persistence manager during its lifetime. A transaction is started
 * before the load and it is stopped just after the save.
 * 
 * A JPOX resource is created using an uri. The uri should have specific parameters to allow the jpox resource to know
 * to which database to connect.
 * 
 * When you create a persistence manager through the appropriate method in the JPOXHelper class. The name you passed
 * there can be used as a parameter in the uri used to create this resource (using the parameter pmfname). The uri is
 * then: jpox://?pmfname=mypmf.
 * 
 * The types read by the resource can be filtered in two ways: - pass a parameter with the list of types (interfaces or
 * concrete In the second approach all the connection parameters which are required to create a persistence manager
 * factory are used. Here the following parameters have to be passed: dbdriver dburl (note the url should also contain
 * the databasename) dbname dbuser dbpwd
 * 
 * Another simple trick which is used to fool emf a bit is that the extension of the uri can also be used to init a jpox
 * resource!
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/08 22:04:29 $
 */

public abstract class JPOXResource extends StoreResource {
	/** The logger */
	private static Log log = LogFactory.getLog(JPOXResource.class);

	/** Use a very minimal fetch group */
	public static final String FETCH_MINIMAL = "fetch_minimal";

	/** Link to the persistence manager factory */
	protected final PersistenceManagerFactory pmf;

	/** The related persistence manager */
	protected PersistenceManager pm;

	/** The current transaction, can be null in unloaded state */
	protected Transaction tx = null;

	/** The store used to determine where to query for the data */
	protected final JpoxDataStore emfDataStore;

	/** Keeps track how much should be fetched */
	private boolean fetchMinimal = false;

	private boolean fetchAll = false;

	/**
	 * The constructor, gets an uri and retrieves the backing store
	 */
	public JPOXResource(URI uri) {
		this(uri, false);
	}

	/**
	 * The constructor, gets an uri and retrieves the backing OJBStore
	 * 
	 * @param useAllFetchGroup
	 *            if true then the all fetch group will be used.
	 */
	public JPOXResource(URI uri, boolean useAllFetchGroup) {
		super(uri);

		log.debug("Created jpoxresource using uri: " + uri.toString());

		final HashMap params = decodeQueryString(uri.query());

		String emfdsName = null;
		if (uri.query() == null && uri.fileExtension() != null) // this is probably a platform uri!
		{
			if (JpoxConstants.EJDO_EXTENSION.compareTo(uri.fileExtension()) == 0) {
				log.debug("Assuming this is a property file " + uri.toString());
				try {
					final URIConverter uriConverter = getURIConverter();
					final InputStream is = uriConverter.createInputStream(uri);
					final Properties props = new Properties();
					props.load(is);
					is.close();
					emfdsName = props.getProperty("name"); // externalise this string!

					JpoxUtil.getCreateDataStore(props);
					setDefinedQueries(getQueries(props));
				} catch (IOException e) {
					throw new JpoxStoreException("Exception when reading properties from: " + uri.toString(), e);
				}
			} else {
				log.debug("Trying fileextension: " + uri.fileExtension());
				// then try the extension of the resource
				emfdsName = uri.fileExtension();
			}
		} else if (params.get(DS_NAME_PARAM) != null) // only the name
		{
			emfdsName = getParam(params, DS_NAME_PARAM, uri.query());

			setDefinedQueries(getQueries(params));
		}

		if (emfdsName == null) {
			throw new JpoxStoreException("The JPOX Resource can not be initialized using the querystring: "
					+ uri.query() + ". Are all the required parameters present?");
		}

		log.debug("Looking for emf data store using  " + emfdsName);
		emfDataStore = JpoxHelper.INSTANCE.getDataStore(emfdsName);
		pmf = emfDataStore.getPMF();
		super.init(emfDataStore.getTopClasses());

		final String fetch_param = (String) params.get(FETCH_MINIMAL);
		fetchMinimal = fetch_param != null && fetch_param.compareToIgnoreCase("true") == 0;
		fetchAll = useAllFetchGroup;

		// this should be done now, otherwise the classes are not loaded (to retrieve the topclasses)
		pm = pmf.getPersistenceManager();

		setPM(pm);
	}

	/** Creates a pm and sets fetch groups */
	protected void setPM() {
		setPM(pmf.getPersistenceManager());
	}

	/** Returns the persistence manager */
	public PersistenceManager getPersistenceManager() {
		return pm;
	}

	/**
	 * Returns an array of EObjects which refer to a certain EObject, note if the array is of length zero then no
	 * refering EObjects where found.
	 */
	public Object[] getCrossReferencers(EObject referedTo) {
		Transaction tx = null;
		boolean err = true;
		try {
			if (pm == null) {
				setPM();
			}
			tx = pm.currentTransaction();
			tx.begin();
			final Object[] result = emfDataStore.getCrossReferencers(pm, referedTo);
			err = false;

			return result;
		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw new JpoxStoreException("Exception when doing cross reference search " + emfDataStore.getName(), e);
		} finally {
			if (err) {
				if (tx != null && tx.isActive())
					tx.rollback();
			} else {
				tx.commit();
			}
			tx = null;
		}
	}

	/** Opens a new persistence managers */
	private void setPM(PersistenceManager newPM) {
		pm = newPM;
		// set the fetch groups
		if (fetchAll) {
			log.debug("Fetchgroup contains all fields for this resource; " + uri);
			pm.getFetchPlan().addGroup(FetchPlan.ALL);
		} else if (fetchMinimal) {
			log.debug("Minimal fetch group used for resource; " + uri);
			pm.getFetchPlan().addGroup(FetchPlan.DEFAULT);
		} else {
			log.debug("Standard emf/jpox fetch group used for resource; " + uri);
		}
	}

	/**
	 * Saves the changed objects or removes the detached objects from this resource.
	 */
	protected void saveResource(Map options) {
		log.debug("Saving resource with uri: " + getURI() + " and " + getContents().size() + " objects");

		// this happens if the resource was loaded through an inputstream
		if (tx == null || !tx.isActive()) {
			tx = pm.currentTransaction();
			tx.begin();
		}

		boolean err = true;
		try {
			// validate the contents
			validateContents();

			final List list = super.getSuperContents();
			for (int i = 0; i < list.size(); i++) {
				final Object obj = list.get(i);
				if (obj instanceof PersistenceCapable) {
					final PersistenceCapable pc = (PersistenceCapable) obj;
					if (!pc.jdoIsPersistent()) {
						pm.makePersistent(pc);
					}
				}
			}

			// delete all deleted objects
			pm.deletePersistentAll(removedEObjects);

			err = false;
		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw new JpoxStoreException("Exception", e);
		} finally {
			if (err) {
				tx.rollback();
			} else {
				tx.commit();
			}
		}

		// doUnload();

		// reload directly!
		// load(null);
	}

	/**
	 * Loads all the objects in the global list
	 */
	protected List loadResource(Map options) {
		log.debug("Loading resource: " + getURI().toString());

		// pm == null after an unload action
		if (pm == null) {
			setPM();
		}
		tx = pm.currentTransaction();
		tx.begin();

		// note we have to a call to the super class otherwise an infinite loop is created
		final ContentsEList elist = (ContentsEList) super.getSuperContents();
		final List readObjects = loadFromStore(pm);
		final Iterator it = readObjects.iterator();
		while (it.hasNext()) {
			final InternalEObject eobj = (InternalEObject) it.next();
			if (!elist.contains(eobj)) // can maybe happen with extents?
			{
				EContainerRepairControl.repair(eobj);
			}
		}

		log.debug("Loaded " + elist.size() + " objects");
		return readObjects;
	}

	/**
	 * This method can be overridden to implement specific load behavior. Note that a transaction has already been
	 * started. The persistence manager is passed as a parameter, this is the same persistence manager which can be
	 * retrieved using the getPersistenceManager method. The read objects should be returned in the list. Note that
	 * after this call the retrieved objects are put in the resource content.
	 */
	protected List loadFromStore(PersistenceManager pm) {
		if (definedQueriesPresent()) {
			return loadUsingDefinedQueries(pm);
		}

		return loadUsingTopClasses(pm);
	}

	/** Reads data based on the topclasses list */
	private ArrayList loadUsingTopClasses(PersistenceManager pm) {
		log.debug("Loading resource " + getURI() + " using top classes");

		final ArrayList readObjects = new ArrayList();
		for (int i = 0; i < super.topClassNames.length; i++) {
			final String topClassName = super.topClassNames[i];
			final Query qry = pm.newQuery("SELECT FROM " + topClassName);

			log.debug("Loading objects using oql: SELECT FROM " + topClassName);
			final List result = (List) qry.execute();
			final Iterator it = result.iterator();
			while (it.hasNext()) {
				final InternalEObject eobj = (InternalEObject) it.next();

				if (!emfDataStore.isContainedObject(eobj)) {
					readObjects.add(eobj);
				}
			}
		}
		return readObjects;
	}

	/** Reads data based using defined queries */
	private ArrayList loadUsingDefinedQueries(PersistenceManager pm) {
		log.debug("Loading resource " + getURI() + " using defined queries");

		final ArrayList readObjects = new ArrayList();
		final String[] qrys = getDefinedQueries();
		for (int i = 0; i < qrys.length; i++) {
			log.debug("Loading objects using query: " + qrys[i]);
			final Query qry = pm.newQuery(qrys[i]);
			final List result = (List) qry.execute();
			final Iterator it = result.iterator();
			while (it.hasNext()) {
				final InternalEObject eobj = (InternalEObject) it.next();
				readObjects.add(eobj);
			}
		}
		return readObjects;
	}

	/**
	 * Rollsback the transaction if any and clears different lists to start with an empty resource again. Note that the
	 * super.dounload is not called because that clears the list resulting in all kinds of undesirable inverseremoves.
	 */
	protected void doUnload() {
		if (tx != null && tx.isActive()) {
			tx.rollback();
			tx = null;
		}

		pm.close();
		pm = null;

		super.doUnload();
	}
}