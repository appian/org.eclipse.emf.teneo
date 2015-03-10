/**
 * <copyright>
 *
 * Copyright (c) Lukas Zaruba, 2015
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Lukas Zaruba, lukas.zaruba@gmail.com
 * </copyright>
 *
 */
package org.eclipse.emf.teneo.hibernate.mapping.identifier;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler.Key;

public class IdentifierCacheCleaningRunnable implements Runnable {

	private static final Log LOG = LogFactory.getLog(IdentifierCacheHandler.class);
	private static final String TIME_PROPERTY = "org.eclipse.teneo.hibernate.identifierPurgingLogTimeThreshold";
	private static final int DEFAULT_TIME_THRESHOLD = 1000;
	private static final int REMOVE_TIME_LOG_THRESHOLD = Integer.parseInt(System.getProperty(
			TIME_PROPERTY, "" + DEFAULT_TIME_THRESHOLD));

	private final Map<Key, Object> map;
	private final String name;

	public IdentifierCacheCleaningRunnable(Map<Key, Object> map, String name) {
		if (map == null || name == null) {
			throw new IllegalArgumentException("Expecting an instance of map and an instance of name!");
		}
		this.map = map;
		this.name = name;
	}

	public void run() {
		long start = System.currentTimeMillis();
		int originalRecords = map.size();
		long removedRecords = purgeMap();
		long time = System.currentTimeMillis() - start;

		String msg = "Finished purging map '" + name + "', original records: " + originalRecords
				+ ", removed records: " + removedRecords + ", final records: " + map.size()
				+ ", time[ms]: " + time;
		if (time > REMOVE_TIME_LOG_THRESHOLD) {
			LOG.info(msg);
		} else {
			LOG.debug(msg);
		}
	}

	/**
	 * Method is public for testing purposes.
	 */
	public long purgeMap() {
		long removedRecords = 0;
		final Iterator<Key> it = map.keySet().iterator();
		while (it.hasNext()) {
			if (!it.next().isValid()) {
				it.remove();
				removedRecords++;
			}
		}
		return removedRecords;
	}
}
