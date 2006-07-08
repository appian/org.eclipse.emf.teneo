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
 * $Id: Detacher.java,v 1.1 2006/07/08 22:04:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.emf.resource;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.listener.DetachCallback;
import javax.jdo.spi.Detachable;
import javax.jdo.spi.PersistenceCapable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.jpox.emf.JpoxStoreException;
import org.eclipse.emf.teneo.jpox.emf.elist.JPOXEList;
import org.eclipse.emf.teneo.type.FeatureMapEntry;
import org.eclipse.emf.teneo.util.FieldUtil;
import org.jpox.AbstractPersistenceManager;
import org.jpox.LifecycleListenerSpecification;
import org.jpox.PersistenceManager;
import org.jpox.sco.SCO;
import org.jpox.state.StateManagerImpl;

/**
 * Detaches an object and all its persistent capable referenced objects. Is used until jpox implements the DetachOnClose
 * jdo2 function.
 * 
 * Note that all the methods here assume that there is a transaction available and started for the passed persistence
 * manager!
 * 
 * ----------------------------------- Changes 8 Aug 2005: solved bug reported by Georgi Manev (incl. reported change),
 * issue occured when a non-detached object is added to the list of a detached object. In that case the detach procedure
 * below will not work because when the procedure below encounters a detached object then its children are assumed to be
 * detached also. This is not always the case. For the Resource implementations where this procedure is followed this is
 * solved by passing an iterator over the complete contents including the children. This solution was proposed by Georgi
 * Manev. 19 Sept: a nasty case, a new Writer (attached) has a new Book (attached) while there is a detached version of
 * the book present. In this case the attached Book has to be replaced by the detached version!
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/08 22:04:29 $
 */

public class Detacher {
	/** The logger */
	private static Log log = LogFactory.getLog(Detacher.class);

	/**
	 * Checks if a certain object is detached by checking if it is present in the detach list of its resource. The
	 * normal jdohelper.isdetached test is not reliable as jpox sometimes temporarily sets the statemanager back during
	 * attachcopy actions
	 */
	public static boolean isDetached(EObject eobject) {
		Resource res = eobject.eResource();
		if (res == null || !(res instanceof JPOXResourceDAO)) {
			return JDOHelper.isDetached(eobject);
		}
		return ((JPOXResourceDAO) res).getDetachedObjectByID(eobject) != null;
	}

	/** Internal cache of detached objects, this is used to prevent looping */
	private final HashMap toDetachObjects = new HashMap();

	/** The hashmap of detached objects */
	private final JPOXResourceDAO resource;

	/** The persistence manager */
	private final PersistenceManager pm;

	/** Constructor which gets a Persistent Manager */
	public Detacher(JPOXResourceDAO res) {
		resource = res;
		pm = (PersistenceManager) res.getPersistenceManager();
	}

	/** Returns null or a detached version of an attached object */
	public Object getDetachedVersion(Object attached) {
		return resource.getDetachedObjectByID(attached);
	}

	/** Does the actual detach of the objects and removes them from the cache */
	public void detachPostCommit() {
		final Iterator it = toDetachObjects.keySet().iterator();
		final ArrayList toEvictFromCache = new ArrayList();
		while (it.hasNext()) {
			final PersistenceCapable pc = (PersistenceCapable) it.next();
			toEvictFromCache.add(pc);

			final StateManagerImpl sm = (StateManagerImpl) pm.findStateManager(pc);
			if (pc.jdoIsDetached() || sm == null) {
				continue;
			}

			// Call any "pre-detach" listeners
			if (pc instanceof DetachCallback) {
				((DetachCallback) pc).jdoPreDetach();
			}
			pm.notifyLifecycleListenersForEvent(pc, LifecycleListenerSpecification.EVENT_PRE_DETACH, null);

			pc.jdoReplaceFlags();
			((Detachable) pc).jdoReplaceDetachedState(); // this call replaces the following ones
			pc.jdoReplaceStateManager(null);

			if (!pc.jdoIsDetached() || (pc.jdoGetObjectId() == null && pc instanceof EObject)) {
				throw new JpoxStoreException("Object of type: " + pc.getClass().getName()
						+ " was not detached correctly.");
			}

			// detach the elists
			// pc can also be a featuremap entry therefore this test
			if (pc instanceof EObject) {
				detachPostCommitELists((EObject) pc);

				// fill the cache
				resource.setDetachedObjectByID(pc);
			}

			if (sm != null && sm.getLifecycleState() != null) {
				sm.getLifecycleState().transitionDetach(sm);
			}

			if (pc instanceof DetachCallback) {
				((DetachCallback) pc).jdoPostDetach(pc);
			}

			pm.notifyLifecycleListenersForEvent(pc, LifecycleListenerSpecification.EVENT_POST_DETACH, null);
		}

		// and remove from the cache
		for (int i = 0; i < toEvictFromCache.size(); i++) {
			final PersistenceCapable pc = (PersistenceCapable) toEvictFromCache.get(i);
			((AbstractPersistenceManager) pm).removeObjectFromCache(pc, pc.jdoGetObjectId(), true, true);
		}
	}

	/** Detaches refered-to objects */
	private void detachPostCommitELists(EObject eo) {
		for (Iterator it = eo.eClass().getEAllStructuralFeatures().iterator(); it.hasNext();) {
			final EStructuralFeature estruct = (EStructuralFeature) it.next();
			final Object value = eo.eGet(estruct);

			if (value == null)
				continue;

			if (value instanceof JPOXEList) {
				if (((JPOXEList) value).isLoaded()) {
					((JPOXEList) value).detachSelf();
				}
			}
		}
	}

	/**
	 * Loads all fields of a pc and detaches its structural components but not yet the object itself. NOTE this action
	 * should be done in the same transaction as the loaded objects and after this call the transaction has to be
	 * committed.
	 */
	public void detachPreCommitAll(List list) {
		final Iterator it = list.iterator();
		while (it.hasNext()) {
			final Object obj = it.next();
			if (obj instanceof PersistenceCapable) {
				detachPreCommit((PersistenceCapable) obj);
			}
		}
	}

	/**
	 * Loads all fields of a pc and detaches its structural components but not yet the object itself. This is done after
	 * the commit.
	 */
	public void detachPreCommit(PersistenceCapable pc) {
		if (toDetachObjects.get(pc) != null)
			return; // already been here
		toDetachObjects.put(pc, pc);

		if (pc.jdoIsDeleted()) {
			throw new JpoxStoreException("The object of class " + pc.getClass().getName()
					+ " can not be detached as it is deleted");
		}

		if (!(pc instanceof Detachable)) {
			throw new JpoxStoreException("The object of class " + pc.getClass().getName()
					+ " does not implement the detachable interface and can not be detached.");
		}

		log.debug("Detaching a " + pc.getClass().getName());

		if (pc instanceof EObject) {
			detachObjectFields((EObject) pc);
		} else if (pc instanceof FeatureMapEntry) {
			final Object value = ((FeatureMapEntry) pc).getValue();
			if (value instanceof SCO) {
				detachSCO((SCO) value);
			} else if (value instanceof PersistenceCapable) {
				detachPreCommit((PersistenceCapable) value);
			}
		}
	}

	/** Detach a sco */
	public void detachSCO(SCO sco) {
		log.debug("Detaching a sco " + sco.getClass().getName());

		// our own elist
		if (sco instanceof JPOXEList) {
			if (((JPOXEList) sco).isLoaded()) {
				((JPOXEList) sco).detach(this);
			}
		} else if (sco instanceof Collection) {
			final Collection coll = (Collection) sco;
			final Iterator it = coll.iterator();
			while (it.hasNext()) {
				final Object obj = it.next();
				if (obj instanceof PersistenceCapable) {
					detachPreCommit((PersistenceCapable) obj);
				} else if (obj instanceof SCO) {
					detachSCO((SCO) obj);
				}
			}

			// delete the owner
			sco.unsetOwner();
		} else // a simple type do nothing
		{

		}
	}

	/** Detaches refered-to objects */
	public void detachObjectFields(EObject eo) {
		for (Iterator it = eo.eClass().getEAllStructuralFeatures().iterator(); it.hasNext();) {
			final EStructuralFeature estruct = (EStructuralFeature) it.next();
			final Object value = eo.eGet(estruct);

			if (value == null)
				continue;

			if (value instanceof SCO) {
				detachSCO((SCO) value);
			} else if (value instanceof PersistenceCapable) {
				// read the detached version from the detach cache
				Object toDetach = value;
				if (!JDOHelper.isDetached(value)) {
					final Object detachedVersion = getDetachedVersion(value);
					if (detachedVersion != null) {
						toDetach = detachedVersion;
						final Field field = FieldUtil.getField(eo.getClass(), estruct.getName());
						FieldUtil.setField(field, eo, toDetach);
					}
				}
				detachPreCommit((PersistenceCapable) toDetach);
			}
		}
	}
}