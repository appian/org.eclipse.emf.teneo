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
 * $Id: JPOXResourceDAO.java,v 1.1 2006/07/08 22:04:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.emf.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.jdo.JDOHelper;
import javax.jdo.spi.PersistenceCapable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.jpox.PersistenceManagerImpl;

/**
 * JPOX Resource. The JPOX resource is connected to a persistence manager during its lifetime. This is a specific JPOX
 * Resource which detaches objects after loading them and attaching objects when they are saved. This means that there
 * are only transactions during save and load actions.
 * 
 * For the rest see the superclass
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/08 22:04:29 $
 */

public class JPOXResourceDAO extends JPOXResource {
	/** The logger */
	private static Log log = LogFactory.getLog(JPOXResourceDAO.class);

	/**
	 * The hasmap which maps from jdo object id to an EObject. This hashmap is used to make the detaching of a loaded
	 * elist more efficient
	 */
	private final HashMap eobjectByID = new HashMap();

	/** Keeps track if the resource is in detach mode, this prevents load of elists and featuremaps */
	private boolean isDetaching = false;

	/**
	 * The constructor, gets an uri and retrieves the backing OJBStore
	 */
	public JPOXResourceDAO(URI uri) {
		super(uri, true);

		if (log.isDebugEnabled()) {
			log.debug("Created DAO jpoxresource using uri: " + uri.toString());
		}
	}

	/** Adds a object with a certain id to the hasmap */
	public void setDetachedObjectByID(Object obj) {
		assert (obj instanceof PersistenceCapable);
		assert (JDOHelper.isDetached(obj));
		eobjectByID.put(((PersistenceCapable) obj).jdoGetObjectId(), obj);
	}

	/** Gets the detached version of a certain object */
	public Object getDetachedObjectByID(Object obj) {
		assert (obj instanceof PersistenceCapable);
		return eobjectByID.get(((PersistenceCapable) obj).jdoGetObjectId());
	}

	/** Returns true if we are detaching this resource */
	public boolean isDetaching() {
		return isDetaching;
	}

	/** Can be used to signal to the resource that part of its info is being detached */
	public void setIsDetaching(boolean setDetaching) {
		isDetaching = setDetaching;
	}

	/**
	 * Saves the changed objects or removes the detached objects from this resource.
	 */
	protected void saveResource(Map options) {
		log.debug("SAVING DAO jpoxresource using uri: " + uri.toString());

		// now we have all the classnames, now retrieve all the objects using queries!!!!
		tx = pm.currentTransaction();
		tx.begin();

		boolean err = true;
		Detacher detacher;
		try {
			// attachcopy is recursive therefor we only need the root objects
			final Iterator it = getContents().iterator();
			while (it.hasNext()) {
				final Object obj = it.next();
				if (obj instanceof PersistenceCapable) {
					final PersistenceCapable pc = (PersistenceCapable) obj;
					if (JDOHelper.isDetached(pc)) {
						((PersistenceManagerImpl) pm).attachCopy(pc, false); // makePersistent(pc);
					} else {
						((PersistenceManagerImpl) pm).makePersistent(pc);
					}
				}
			}

			// now delete the deleted objects
			// check needs to be done if the objects have not been removed in determine unreachables
			final ArrayList reallyRemove = new ArrayList();
			for (int i = 0; i < removedEObjects.size(); i++) {
				final Object obj = removedEObjects.get(i);
				final PersistenceCapable pc = (PersistenceCapable) pm.getObjectById(((PersistenceCapable) obj)
						.jdoGetObjectId(), false);
				if (!JDOHelper.isDeleted(pc))
					reallyRemove.add(obj);
				eobjectByID.remove(((PersistenceCapable) obj).jdoGetObjectId());
			}

			// now attach the remaing and delete them all
			ArrayList toRemove = new ArrayList();
			for (Iterator removeIt = reallyRemove.iterator(); removeIt.hasNext();) {
				toRemove.add(((PersistenceManagerImpl) pm).makePersistent(removeIt.next()));
			}
			pm.deletePersistentAll(toRemove);

			// detach all objects
			isDetaching = true;
			detacher = preCommitDetach(getContents());
			err = false;
		} finally {
			if (err) {
				tx.rollback();
			} else {
				tx.commit();
			}
			tx = null;
		}

		try {
			detacher.detachPostCommit();
		} finally {
			isDetaching = false;
		}
	}

	/**
	 * Loads all the objects in the global list
	 */
	public List loadResource(Map options) {
		log.debug("Loading DAO resource: " + getURI().toString());

		// check if the resource was unloaded first
		if (pm == null) {
			setPM();
		}
		tx = pm.currentTransaction();
		tx.begin();

		boolean err = true;
		Detacher detacher = null;
		List readObjects = null;
		try {
			// note we have to a call to the super class otherwise an infinite loop is created
			// final ArrayList<InternalEObject> eobjs = new ArrayList<InternalEObject>();
			final ContentsEList elist = (ContentsEList) super.getSuperContents();
			readObjects = loadFromStore(pm);
			final Iterator it = readObjects.iterator();
			while (it.hasNext()) {
				final InternalEObject eobj = (InternalEObject) it.next();
				EContainerRepairControl.repair(eobj);
			}

			log.debug("Loaded " + elist.size() + " objects");

			// detach all objects
			isDetaching = true;
			detacher = preCommitDetach(readObjects);
			err = false;
		} finally {
			if (err) {
				tx.rollback();
			} else {
				tx.commit();
			}
			tx = null;
		}

		try {
			detacher.detachPostCommit();
		} finally {
			isDetaching = false;
		}
		return readObjects;
	}

	/**
	 * Performs the first step in the detach step using the getcontents iterator.
	 */
	public Detacher preCommitDetach(List list) {
		final Iterator it = list.iterator();
		log.debug(">>> Started a detach of objects passed in an iterator");

		final ArrayList all = new ArrayList();
		while (it.hasNext()) {
			final Object obj = it.next();
			if (obj instanceof PersistenceCapable) {
				all.add(obj);
			}
		}

		final Detacher detacher = new Detacher(this);
		detacher.detachPreCommitAll(all);
		return detacher;
	}

	/**
	 * Clears the list of eobjects by id
	 */
	protected void doUnload() {
		eobjectByID.clear();
		super.doUnload();
	}
}