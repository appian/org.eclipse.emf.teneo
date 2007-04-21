/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * IdentifierCacheHandler.java,v 1.5 2007/02/08 23:11:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.identifier;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * Implements two maps for caching identifier and version information. Internally uses
 * weakreferences and periodic purge actions to clean the maps.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class IdentifierCacheHandler {
	/** The logger */
	private static Log log = LogFactory.getLog(IdentifierCacheHandler.class);

	/** At this count the maps will be purged for stale entries */
	private static final int PURGE_COUNT = 10000;

	/** HashMap */
	private static Map<Key, Object> idMap = Collections.synchronizedMap(new HashMap<Key, Object>());

	/** Keeps track of the modifications to the versionMap */
	private static int idModCount = 0;

	/** HashMap */
	private static Map<Key, Object> versionMap = Collections
			.synchronizedMap(new HashMap<Key, Object>());

	/** Keeps track of the modifications to the versionMap */
	private static int versionModCount = 0;

	/** Get an identifier from the cache */
	public static Object getID(Object obj) {
		final Object id = idMap.get(new Key(obj));
		if (id == null) {
			log.debug("ID for object " + obj.getClass().getName() + " not found in id cache");
		}
		return id;
	}

	/** Set an identifier in the cache */
	public static void setID(Object obj, Object id) {
		log.debug("Setting id: " + id + " for object " + obj.getClass().getName() + " in idcache ");

		if (id == null) { // actually a remove of the id
			idMap.remove(new Key(obj));
		} else {
			idMap.put(new Key(obj), id);
		}

		// also set the id in the resource
		// disabled for now
		if (false && obj instanceof EObject) {
			final EObject eobj = (EObject) obj;
			final Resource res = eobj.eResource();
			if (res != null && res instanceof XMLResource) {
				log.debug("Setting id " + id.toString() + " in resource "
						+ res.getClass().getName());
				((XMLResource) res).setID(eobj, id.toString());
			}
		}

		idModCount++;
		if (idModCount > PURGE_COUNT) {
			purgeIDMap();
		}
	}

	/** Gets a version from the cache */
	public static Object getVersion(Object obj) {
		return versionMap.get(new Key(obj));
	}

	/** Sets a version in the cache */
	public static void setVersion(Object obj, Object version) {
		log.debug("Setting version: " + version + " for object " + obj.getClass().getName()
				+ " in idcache ");
		versionMap.put(new Key(obj), version);
		versionModCount++;
		if (versionModCount > PURGE_COUNT) {
			purgeVersionMap();
		}
	}

	/** Purge the versionmap for stale entries */
	private static synchronized void purgeIDMap() {
		if (idModCount < PURGE_COUNT) return;
		purgeMap(idMap);
		idModCount = 0;
	}

	/** Purge the versionmap for stale entries */
	private static synchronized void purgeVersionMap() {
		if (versionModCount < PURGE_COUNT) return;
		purgeMap(versionMap);
		versionModCount = 0;
	}

	/** Purges the passed map for stale entries */
	private static synchronized void purgeMap(Map<Key, Object> map) {
		synchronized (map) {
			final ArrayList<Object> toRemove = new ArrayList<Object>();
			final Iterator<Key> it = map.keySet().iterator();
			while (it.hasNext()) {
				final Key key = it.next();
				if (!key.isValid()) toRemove.add(key);
			}
			for (int i = 0; i < toRemove.size(); i++) {
				map.remove(toRemove.get(i));
			}
		}
	}

	/** Dumps the idmap */
	public static void dumpID() {
		dumpContents(idMap);
	}

	/** Dumps the content of the passed map */
	private static void dumpContents(Map<Key, Object> map) {
		synchronized (map) {
			Iterator<Key> it = idMap.keySet().iterator();
			while (it.hasNext()) {
				Key key = it.next();
				Object object = key.weakRef.get();
				if (object != null) {
					System.err.println(object.getClass().getName());
				}
			}
		}
	}

	/**
	 * Own implementation of the key in the hashmap to override the equals method. Equality for this
	 * cache is real memory location equality
	 */

	private static class Key {
		/** The real object as a weakreference */
		private final WeakReference<Object> weakRef;

		/** The hashcode of the stored object */
		private final int hashcode;

		/** Constructor */
		Key(Object keyObject) {
			weakRef = new WeakReference<Object>(keyObject);
			hashcode = keyObject.getClass().hashCode();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object arg0) {
			assert (arg0 != null);
			assert (arg0 instanceof Key);

			final Key key0 = (Key) arg0;

			// weakreference already gone compare on keys itself
			final Object obj0 = key0.weakRef.get();
			final Object obj1 = weakRef.get();
			if (obj0 == null || obj1 == null) {
				return key0 == this;
			}

			// still present compare on values
			// equals call should maybe also be done but goes wrong for
			// featuremap entries
			// which are equal if their values and featuremap are equal
			// identifier and version caching are only usefull in case of object
			// equality
			// because it uses weak references and the first level cache of hb
			// should
			// ensure that only one instance of a certain object is present.
			// There should always be one instance anyway in one session
			// otherwise
			// references between objects can be set wrong (or at least there is
			// a great
			// change that they go wrong).
			return obj0 == obj1;
		}

		/** The hashcode of the enclosed object is returned */
		@Override
		public int hashCode() {
			return hashcode;
		}

		/** Returns true if the weakReference is not yet gc'ed */
		public boolean isValid() {
			return weakRef.get() != null;
		}
	}
}