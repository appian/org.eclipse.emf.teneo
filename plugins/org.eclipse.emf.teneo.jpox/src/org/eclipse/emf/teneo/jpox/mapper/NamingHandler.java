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
 * $Id: NamingHandler.java,v 1.5 2007/07/11 14:43:06 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.extension.ExtensionPoint;

/**
 * Can be used to create names of columns/tables on the basis of the class/feature name. Ensures
 * unique names accross tables and databases.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */

public class NamingHandler implements ExtensionPoint {
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
	 * Check if the name of the structural feature exists as a field, if not find the correct name.
	 * TODO: replace this with the logic used by emf to handle casing of feature names to java
	 * members
	 */
	public String correctName(Class implClass, EStructuralFeature efeature) {
		String featureName = efeature.getName();
		Field[] fields = implClass.getDeclaredFields();
		for (Field element : fields) {
			log.debug(element.getName() + "-" + efeature.getName());
			if (element.getName().compareTo(featureName) == 0) {
				return element.getName();
			}
		}

		for (Field element : fields) {
			log.debug(element.getName() + "-" + efeature.getName());
			if (element.getName().compareToIgnoreCase(featureName) == 0) {
				return element.getName();
			}
		}

		// handle reserved words
		featureName += "_";
		for (Field element : fields) {
			log.debug(element.getName() + "-" + efeature.getName());
			if (element.getName().compareToIgnoreCase(featureName) == 0) {
				return element.getName();
			}
		}

		log.error("The structural feature: " + efeature.getName() + "/" + efeature.getEContainingClass().getName() +
				" does not have a corresponding java member in " + implClass.getName());
		return "";
	}

	/**
	 * Check if the name of the structural feature exists as a field, if not find the correct name.
	 * TODO: replace this with the logic used by emf to handle casing of feature names to java
	 * members
	 */
	public String correctName(MappingContext mc, EStructuralFeature efeature) {
		Class implClass = ERuntime.INSTANCE.getJavaClass(mc.getCurrentAClass().getAnnotatedEClass());
		return correctName(implClass, efeature);
	}
}