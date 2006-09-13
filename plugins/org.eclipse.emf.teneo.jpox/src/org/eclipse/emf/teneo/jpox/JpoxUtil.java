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
 * $Id: JpoxUtil.java,v 1.1 2006/09/13 10:39:52 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.jdo.spi.PersistenceCapable;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.PMFConfiguration;
import org.jpox.StateManager;

/**
 * Contains different util methods.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/09/13 10:39:52 $
 */

public class JpoxUtil {

	/** Repair the container */
	public static void repairContainer(Object value) {
		if (value instanceof StateManager) {
			if (((StateManager)value).isDeleted(((StateManager)value).getObject())) {
				return;
			}
		}
		EContainerRepairControl.repair(JpoxUtil.checkGetObject(value));
	}
	
	/** Returns the object itself if it is an eobject, if it is a statemanager then the object
	 * is returned, otherwise the object itself is returned.
	 */
	public static Object checkGetObject(Object value) {
		if (value instanceof StateManager) {
			return ((StateManager)value).getObject();
		}
		return value;
	}
	
	/** Creates and registers an emf data store using a set of generic store properties */
	public static JpoxDataStore getCreateDataStore(Properties props) {
		final String name = props.getProperty(Constants.PROP_NAME);
		JpoxDataStore jds = JpoxHelper.INSTANCE.getDataStore(name);
		if (jds != null)
			return jds;

		final Properties properties = new Properties();
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_DRIVERNAME_PROPERTY, doTrim(props
				.getProperty(Constants.PROP_DB_DRIVER)));
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_URL_PROPERTY, doTrim(props
				.getProperty(Constants.PROP_DB_URL)));
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_USERNAME_PROPERTY, doTrim(props
				.getProperty(Constants.PROP_DB_USER)));
		properties.setProperty(PMFConfiguration.JDO_DATASTORE_PASSWORD_PROPERTY, doTrim(props
				.getProperty(Constants.PROP_DB_PWD)));
		properties.setProperty(PMFConfiguration.JDO_MAPPING_CATALOG_PROPERTY, doTrim(props
				.getProperty(Constants.PROP_DB_NAME)));

		EPackage[] epacks = StoreUtil.getEPackages(doTrim(props.getProperty(Constants.PROP_EPACKAGE_NSURI)));

		// create a EMF Data Store, this is retrieved later again
		jds = JpoxHelper.INSTANCE.createRegisterDataStore(name);
		jds.setProperties(properties);
		jds.setEPackages(epacks);
		jds.initialize();
		return jds;
	}

	/** Convenience method */
	private static String doTrim(String totrim) {
		if (totrim == null)
			return null;
		return totrim.trim();
	}

	/**
	 * The following method is copied from the jpox class SCOUtils. We would prefer to use that method directly but it
	 * is not public. Credits to jpox for this method.
	 */

	/**
	 * Convenience method for use by List attachCopy methods to update the passed (attached) list using the (attached)
	 * list elements passed.
	 * 
	 * @param attachedList
	 *            The current (attached) list, the jdo delegate
	 * @param detachedList
	 *            The list of (attached) elements needed.
	 * @return If the List was updated
	 */
	public static boolean updateListWithListElements(List attachedList, List detachedList) {
		boolean updated = false;
		// This method needs to take the existing list and generate a list
		// of add/remove/set/clear operations that change the list to the passed
		// elements in as efficient a way as possible. The simplest is
		// clear() then addAll()!, but if there are many objects and very little
		// has changed this would be very inefficient.
		// What we do currently is remove all elements no longer present, and then
		// add any missing elements, correcting the ordering. This can be non-optimal
		// in some situations.
		// TODO Optimise the process

		// Delete any elements that are no longer in the list
		ArrayList newCopy = new ArrayList(detachedList);
		Iterator attachedIter = attachedList.iterator();
		while (attachedIter.hasNext()) {
			Object attachedElement = attachedIter.next();
			if (!isPresent(newCopy, attachedElement)) {
				// No longer present, so remove it
				attachedIter.remove();
				updated = true;
			}
		}

		// Add any new elements that have been added
		java.util.ArrayList oldCopy = new java.util.ArrayList(attachedList);
		Iterator elementsIter = detachedList.iterator();
		while (elementsIter.hasNext()) {
			Object element = elementsIter.next();
			if (!isPresent(oldCopy, element)) {
				attachedList.add(element);
				updated = true;
			}
		}

		// Update position of elements in the list to match the new order
		for (int i = 0; i < detachedList.size(); i++) {
			final Object element = detachedList.get(i);
			final int newpos = i;
			final int oldpos = indexOf(attachedList, element);
			if (newpos != oldpos) {
				Object obj = attachedList.remove(oldpos);
				attachedList.add(newpos, obj);
				updated = true;
			}
		}

		return updated;
	}

	/** Returns true if the passed pc is contained in the list of pc's, comparison is done on the basis of oid */
	private static boolean isPresent(List list, Object obj) {
		if (!(obj instanceof PersistenceCapable))
			return list.contains(obj);
		final PersistenceCapable pc1 = (PersistenceCapable) obj;
		for (int i = 0; i < list.size(); i++) {
			final PersistenceCapable pc2 = (PersistenceCapable) list.get(i);
			if ((pc2.jdoGetObjectId() == null || pc1.jdoGetObjectId() == null) && pc2.equals(pc1)) {
				return true;
			} else if (pc2.jdoGetObjectId() != null && pc1.jdoGetObjectId() != null
					&& pc2.jdoGetObjectId().equals(pc1.jdoGetObjectId())) {
				return true;
			}
		}
		return false;
	}

	/** Returns true if the passed pc is contained in the list of pc's, comparison is done on the basis of oid */
	private static int indexOf(List list, Object obj) {
		if (!(obj instanceof PersistenceCapable))
			return list.indexOf(obj);
		final PersistenceCapable pc1 = (PersistenceCapable) obj;
		for (int i = 0; i < list.size(); i++) {
			final PersistenceCapable pc2 = (PersistenceCapable) list.get(i);
			if ((pc2.jdoGetObjectId() == null || pc1.jdoGetObjectId() == null) && pc2.equals(pc1)) {
				return i;
			} else if (pc2.jdoGetObjectId() != null && pc1.jdoGetObjectId() != null
					&& pc2.jdoGetObjectId().equals(pc1.jdoGetObjectId())) {
				return i;
			}
		}
		return -1;
	}

}