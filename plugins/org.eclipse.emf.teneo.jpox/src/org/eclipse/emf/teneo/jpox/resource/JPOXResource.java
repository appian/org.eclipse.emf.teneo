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
 * $Id: JPOXResource.java,v 1.6 2007/03/29 22:13:44 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.jdo.FetchPlan;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;
import javax.jdo.identity.SingleFieldIdentity;
import javax.jdo.spi.PersistenceCapable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.eclipse.emf.teneo.jpox.JpoxConstants;
import org.eclipse.emf.teneo.jpox.JpoxDataStore;
import org.eclipse.emf.teneo.jpox.JpoxHelper;
import org.eclipse.emf.teneo.jpox.JpoxStoreException;
import org.eclipse.emf.teneo.jpox.JpoxUtil;
import org.eclipse.emf.teneo.resource.StoreResource;
import org.jpox.store.OID;
import org.jpox.store.OIDFactory;

/**
 * JPOX Resource. The JPOX resource is connected to a persistence manager during
 * its lifetime. A transaction is started before the load and it is stopped just
 * after the save.
 * 
 * A JPOX resource is created using an uri. The uri should have specific
 * parameters to allow the jpox resource to know to which database to connect.
 * 
 * When you create a persistence manager through the appropriate method in the
 * JPOXHelper class. The name you passed there can be used as a parameter in the
 * uri used to create this resource (using the parameter pmfname). The uri is
 * then: jpox://?pmfname=mypmf.
 * 
 * The types read by the resource can be filtered in two ways: - pass a
 * parameter with the list of types (interfaces or concrete In the second
 * approach all the connection parameters which are required to create a
 * persistence manager factory are used. Here the following parameters have to
 * be passed: dbdriver dburl (note the url should also contain the databasename)
 * dbname dbuser dbpwd
 * 
 * Another simple trick which is used to fool emf a bit is that the extension of
 * the uri can also be used to init a jpox resource!
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $ $Date: 2007/03/29 22:13:44 $
 */

public class JPOXResource extends StoreResource {
	/** The logger */
	private static Log log = LogFactory.getLog(JPOXResource.class);

	/** Use a very minimal fetch group */
	public static final String FETCH_MINIMAL = "fetch_minimal";

	/** The pm controller param */
	public static final String PM_CONTROLLER_PARAM = "pmController";

	/** The related persistence manager */
	protected PersistenceManager persistenceManager;

	/** The current transaction, can be null in unloaded state */
	protected Transaction tx = null;

	/** The store used to determine where to query for the data */
	protected final JpoxDataStore emfDataStore;

	/** Keeps track how much should be fetched */
	private boolean fetchMinimal = false;

	private boolean fetchAll = false;

	/** The pm controller is set if the pm is controlled outside of this resource */
	private PMController pmController = null;
	private boolean hasPMController = false;

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

		final Map params = decodeQueryString(uri.query());

		String emfdsName = null;
		if (uri.query() == null && uri.fileExtension() != null) // this is
		// probably a
		// platform uri!
		{
			if (JpoxConstants.EJDO_EXTENSION.compareTo(uri.fileExtension()) == 0) {
				log.debug("Assuming this is a property file " + uri.toString());
				try {
					final URIConverter uriConverter = getURIConverter();
					final InputStream is = uriConverter.createInputStream(uri);
					final Properties props = new Properties();
					props.load(is);
					is.close();
					emfdsName = props.getProperty("name"); // externalise this
					// string!

					JpoxUtil.getCreateDataStore(props);
					setDefinedQueries(getQueries(props));
				} catch (IOException e) {
					throw new JpoxStoreException(
							"Exception when reading properties from: "
									+ uri.toString(), e);
				}
			} else {
				log.debug("Trying fileextension: " + uri.fileExtension());
				// then try the extension of the resource
				emfdsName = uri.fileExtension();
			}
			emfDataStore = JpoxHelper.INSTANCE.getDataStore(emfdsName);
			super.init(emfDataStore.getTopClasses());
		} else if (params.get(DS_NAME_PARAM) != null) // only the name
		{
			emfdsName = getParam(params, DS_NAME_PARAM, uri.query());

			setDefinedQueries(getQueries(params));
			emfDataStore = JpoxHelper.INSTANCE.getDataStore(emfdsName);
			super.init(emfDataStore.getTopClasses());
		} else if (params.get(PM_CONTROLLER_PARAM) != null) {

			setDefinedQueries(getQueries(params));

			final String scName = getParam(params, PM_CONTROLLER_PARAM, uri
					.query());
			pmController = PMController.getPMController(scName);
			log.debug("Using p, controller " + scName);
			emfDataStore = pmController.getJpoxDataStore();
			hasPMController = true;

			// this should be done now, otherwise the classes are not loaded (to
			// retrieve the topclasses)
			super.init(emfDataStore.getTopClasses());
		} else {
			throw new JpoxStoreException(
					"The following uri can not be used to create a"
							+ " jpoxresource, it misses parameters for either the jpoxdatastore or a pmController "
							+ uri.toString());
		}

		log.debug("Looking for emf data store using  " + emfdsName);

		final String fetch_param = (String) params.get(FETCH_MINIMAL);
		fetchMinimal = fetch_param != null
				&& fetch_param.compareToIgnoreCase("true") == 0;
		fetchAll = useAllFetchGroup;

		// load the persistencemanager
		// getPersistenceManager();
	}

	/** Returns the persistence manager */
	public PersistenceManager getPersistenceManager() {
		if (persistenceManager == null) {
			if (pmController != null) {
				persistenceManager = pmController.getPM();
			} else {
				persistenceManager = emfDataStore.getPMF()
						.getPersistenceManager();
			}
			// set the fetch groups
			if (fetchAll) {
				log.debug("Fetchgroup contains all fields for this resource; "
						+ uri);
				persistenceManager.getFetchPlan().addGroup(FetchPlan.ALL);
			} else if (fetchMinimal) {
				log.debug("Minimal fetch group used for resource; " + uri);
				persistenceManager.getFetchPlan().addGroup(FetchPlan.DEFAULT);
			} else {
				log.debug("Standard emf/jpox fetch group used for resource; "
						+ uri);
			}
		}
		return persistenceManager;
	}

	/**
	 * Overridden because if an eobject is removed from its containing parent
	 * then jpox will move it to the deleted state and then the content of the
	 * deleted object can not be used anymore.
	 */
	public void detached(EObject eObject) {
		if (((PersistenceCapable) eObject).jdoIsDeleted()) {
			detachedHelper(eObject);
			return;
		}
		super.detached(eObject);
	}

	/**
	 * Returns an array of EObjects which refer to a certain EObject, note if
	 * the array is of length zero then no refering EObjects where found.
	 */
	public Object[] getCrossReferencers(EObject referedTo) {
		Transaction tx = null;
		boolean err = true;
		try {
			if (!hasPMController) {
				tx = getPersistenceManager().currentTransaction();
				tx.begin();
			}
			final Object[] result = emfDataStore.getCrossReferencers(
					getPersistenceManager(), referedTo);
			err = false;

			return result;
		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw new JpoxStoreException(
					"Exception when doing cross reference search "
							+ emfDataStore.getName(), e);
		} finally {
			if (!hasPMController) {
				if (err) {
					if (tx != null && tx.isActive())
						tx.rollback();
				} else {
					tx.commit();
				}
				tx = null;
			}
		}
	}

	/**
	 * Unpacks the id string and reads an object from the db, note for each read
	 * a transaction is opened, unless the session is controlled by the caller.
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#getEObjectByID(java.lang.String)
	 */
	@Override
	protected EObject getEObjectByID(String id) {
		// try to find the object in the cache
		if (id == null) {
			return super.getEObjectByID(id);
		}
		if (getIntrinsicIDToEObjectMap() != null) {
			final EObject firstCheck = getIntrinsicIDToEObjectMap().get(id);
			if (firstCheck != null) {
				return firstCheck;
			}
		}

		Transaction tx = null;
		boolean err = true;
		try {
			if (!hasPMController) {
				tx = getPersistenceManager().currentTransaction();
				if (!tx.isActive()) { // can also be asserted but okay try to
					// be helpful
					log
							.warn("Resource getobjectbyid: the transaction of the resource should always be active, but it isn't when save starts, beginning transaction");
					tx.begin();
				}
			}

			log.debug("Reading eobject using urifragment " + id);

			final InternalEObject obj = (InternalEObject) getPersistenceManager()
					.getObjectById(new OID(id));
			addToContent(obj);
			err = false;
			return obj;
		} finally {
			if (!hasPMController) {
				if (err) {
					log
							.warn("Exception during getobjectbyid, rolling back transaction");
					tx.rollback();
				} else {
					log.warn("Committing transaction");
					tx.commit();
				}
				tx = getPersistenceManager().currentTransaction();
				tx.begin();
				tx = null;
			}
		}
	}

	/**
	 * Creates a unique id string from the eobject. The id string will contain a
	 * link to the type (eclass) and the string version of the id itself. This
	 * method assumes that the id can be converted from and to a string!
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#getURIFragment(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public String getURIFragment(EObject object) {
		
		if (object == null) {
			return null;
		}

		if (object instanceof PersistenceCapable && getPersistenceManager().getObjectId(object) != null) {
			final OID oid;
			if (getPersistenceManager().getObjectId(object) instanceof OID) {
				oid = (OID)getPersistenceManager().getObjectId(object);
			} else { 
				oid = OIDFactory.getInstance(object.getClass().getName(), ((SingleFieldIdentity)getPersistenceManager().getObjectId(object)).getKeyAsObject());
			}
			if (oid == null) {
				return super.getURIFragment(object);
			}
			return oid.toString();
		}
		return super.getURIFragment(object);
	}

	/**
	 * Saves the changed objects or removes the detached objects from this
	 * resource.
	 */
	protected void saveResource(Map options) {
		log.debug("SAVING DAO jpoxresource using uri: " + uri.toString());

		// now we have all the classnames, now retrieve all the objects using
		// queries!!!!
		if (!hasPMController) {
			tx = getPersistenceManager().currentTransaction();
			if (!tx.isActive()) { // can also be asserted but okay try to be
				// helpful
				log
						.warn("Resource save: the transaction of the resource should always be active, but it isn't when save starts, beginning transaction");
				tx.begin();
			}
		}

		boolean err = true;
		try {
			// persist the new objects
			final Iterator it = getContents().iterator();
			while (it.hasNext()) {
				final Object obj = it.next();

				if (obj instanceof PersistenceCapable) {
					final PersistenceCapable pc = (PersistenceCapable) obj;
					if (!(pc.jdoIsPersistent())) {
						getPersistenceManager().makePersistent(pc);
					}
				}
			}

			// now delete the deleted objects
			// check needs to be done if the objects have not been removed in
			// determine unreachables
			final ArrayList reallyRemove = new ArrayList();
			for (int i = 0; i < removedEObjects.size(); i++) {
				final PersistenceCapable pc = (PersistenceCapable) removedEObjects
						.get(i);
				final EObject eobj = (EObject) pc;
				if (pc.jdoIsPersistent()
						&& !pc.jdoIsDeleted()
						&& (eobj.eResource() == null || eobj.eResource() == this)) {
					reallyRemove.add(pc);
				}
			}

			// now attach the remaing and delete them all
			/*
			 * ArrayList toRemove = new ArrayList(); for (Iterator removeIt =
			 * reallyRemove.iterator(); removeIt.hasNext();) {
			 * toRemove.add(((PersistenceManagerImpl)
			 * pm).makePersistent(removeIt.next())); }
			 */
			getPersistenceManager().deletePersistentAll(reallyRemove);

			err = false;
		} finally {
			if (!hasPMController) {
				if (err) {
					log.warn("Exception during save, rolling back transaction");
					tx.rollback();
				} else {
					log.warn("Committing transaction");
					tx.commit();
				}
				tx = getPersistenceManager().currentTransaction();
				tx.begin();
				tx = null;
			}
		}
	}

	/**
	 * Loads all the objects in the global list
	 */
	public List loadResource(Map options) {
		log.debug("Loading resource: " + getURI().toString());

		// check if the resource was unloaded first
		if (!hasPMController) {
			tx = getPersistenceManager().currentTransaction();
			if (!tx.isActive()) {
				log.debug("Starting transaction");
				tx.begin();
			}
		}

		List readObjects = null;
		// note we have to a call to the super class otherwise an infinite loop
		// is created
		// final ArrayList<InternalEObject> eobjs = new
		// ArrayList<InternalEObject>();
		final ContentsEList elist = (ContentsEList) super.getSuperContents();
		readObjects = loadFromStore(getPersistenceManager());
		final Iterator it = readObjects.iterator();
		while (it.hasNext()) {
			final InternalEObject eobj = (InternalEObject) it.next();
			EContainerRepairControl.repair(eobj);
		}

		log.debug("Loaded " + elist.size() + " objects");
		return readObjects;
	}

	/** Explicit commit and close */
	public void close() {
		log.debug("Closing resource " + getURI());
		if (getPersistenceManager().currentTransaction().isActive()) {
			log.debug("Closing transaction");
			getPersistenceManager().currentTransaction().commit();
		}
		log.debug("Closing persistencemanager");
		getPersistenceManager().close();
	}

	/**
	 * Clears the list of eobjects by id and commits an open transaction
	 */
	protected void doUnload() {
		if (!hasPMController) {
			if (getPersistenceManager().currentTransaction().isActive()) {
				log
						.debug("At unload, transaction is still active committing it");
				getPersistenceManager().currentTransaction().commit();
			}

			log.debug("At unload: closing and nullifying persistencemanager");
			getPersistenceManager().close();
		}
		persistenceManager = null;
		super.doUnload();
	}

	/**
	 * This method can be overridden to implement specific load behavior. Note
	 * that a transaction has already been started. The persistence manager is
	 * passed as a parameter, this is the same persistence manager which can be
	 * retrieved using the getPersistenceManager method. The read objects should
	 * be returned in the list. Note that after this call the retrieved objects
	 * are put in the resource content.
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
}