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
 * $Id: NamingHandler.java,v 1.2 2006/08/14 05:09:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.ERuntime;

/**
 * Can be used to create names of columns/tables on the basis of the class/feature name. Ensures unique names accross tables and
 * databases.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class NamingHandler {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(NamingHandler.class);

	/** The suffix used for an order column in a list */
	protected static final String ORDER_COLUMN_SUFFIX = "_IDX";

	/** The suffix used for an id column in a list */
	protected static final String ID_COLUMN_SUFFIX = "_ID";

	/**
	 * List of unique column names over all eclasses/structural features
	 */
	protected ArrayList uniqueNames = new ArrayList();

	/** Returns a unique name for an column */
	public String getUniqueIndexColumnName(EStructuralFeature feature) {
		String colName = feature.getName().toUpperCase();
		String ownerName = feature.getEContainingClass().getName().toUpperCase();
		String checkName = ownerName + "_" + colName;
		int index = 1;
		while (uniqueNames.indexOf(checkName) != -1) {
			checkName = ownerName + colName + index++;
		}
		uniqueNames.add(checkName);
		return checkName + ORDER_COLUMN_SUFFIX;
	}

	/**
	 * Check if the name of the structural feature exists as a field, if not find the correct name. TODO: replace this with the logic
	 * used by emf to handle casing of feature names to java members
	 */
	public String correctName(Class implClass, EStructuralFeature efeature) {
		String featureName = efeature.getName();
		Field[] fields = implClass.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			log.debug(fields[i].getName() + "-" + efeature.getName());
			if (fields[i].getName().compareTo(featureName) == 0) return fields[i].getName();
		}

		for (int i = 0; i < fields.length; i++) {
			log.debug(fields[i].getName() + "-" + efeature.getName());
			if (fields[i].getName().compareToIgnoreCase(featureName) == 0) return fields[i].getName();
		}

		// handle reserved words
		featureName += "_";
		for (int i = 0; i < fields.length; i++) {
			log.debug(fields[i].getName() + "-" + efeature.getName());
			if (fields[i].getName().compareToIgnoreCase(featureName) == 0) return fields[i].getName();
		}
		
		log.error("The structural feature: " + efeature.getName() + "/" + efeature.getEContainingClass().getName()
				+ " does not have a corresponding java member in " + implClass.getName());
		return "";
	}

	/**
	 * Check if the name of the structural feature exists as a field, if not find the correct name. TODO: replace this with the logic
	 * used by emf to handle casing of feature names to java members
	 */
	public String correctName(MappingContext mc, EStructuralFeature efeature) {
		Class implClass = ERuntime.INSTANCE.getInstanceClass(mc.getCurrentAClass().getAnnotatedEClass());
		return correctName(implClass, efeature);
	}
}