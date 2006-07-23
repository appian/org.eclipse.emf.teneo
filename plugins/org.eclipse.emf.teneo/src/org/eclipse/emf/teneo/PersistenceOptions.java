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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PersistenceOptions.java,v 1.6 2006/07/23 23:49:18 mtaal Exp $
 */

package org.eclipse.emf.teneo;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.util.SQLCaseStrategy;
import org.eclipse.emf.teneo.util.SQLCaseStrategyImpl;

/**
 * Defines the property names used in the persistence mapping.
 * <p>
 * As a convenience, this class offers type-safe property accessor wrappers.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class PersistenceOptions {

	public static final String DEFAULT_CLASSPATH_FILENAME = "/teneo-persistence.properties";

	private static final String RUNTIME_PREFIX = "teneo.runtime.";

	private static final String MAPPING_PREFIX = "teneo.mapping.";

	private static final String NAMING_PREFIX = "teneo.naming.";

	/** The logger */
	private static Log log = LogFactory.getLog(PersistenceOptions.class);

	/** The prefix of all props */
	private static final String BASE_NAME = PersistenceOptions.class.getName();

	/** Optimistic locking */
	public static final String OPTIMISTIC = new String(BASE_NAME + ".Optimistic").toLowerCase();

	/** Inheritance mapping */
	public static final String INHERITANCE_MAPPING = MAPPING_PREFIX + "inheritance";

	/** Can be set to force an update of the schema when the application starts */
	public static final String UPDATE_SCHEMA = RUNTIME_PREFIX + "update_schema";

	/** Force all containment relations to be eagerly loaded or not */
	public static final String FETCH_CONTAINMENT_EAGERLY = MAPPING_PREFIX + "fetch_containment_eagerly";

	/** Set cascade all (incl. orphan delete) on containment relation */
	public static final String SET_CASCADE_ALL_ON_CONTAINMENT = MAPPING_PREFIX + "cascade_all_on_containment";

	/**
	 * Can be used to control if the entity ann. should be added automatically to the model elements or that the default
	 * annotator should work according to the ejb3 spec.
	 */
	public static final String SET_ENTITY_AUTOMATICALLY = new String(BASE_NAME + ".SetEntityAutomatically")
			.toLowerCase();

	/**
	 * Can be used to control if implementation classes should be used for entity names and target entities or that
	 * eclass names are used.
	 */
	public static final String USE_IMPLEMENTATION_CLASSES_AS_ENTITYNAME = NAMING_PREFIX + "java_class_entity_names";

	/** Qualify the entity name */
	public static final String QUALIFY_ENTITY_NAME = NAMING_PREFIX + "qualify_entity_name";

	/** With the values */
	public static final String QUALIFY_ENTITY_NAME_NO = "no";

	public static final String QUALIFY_ENTITY_NAME_NSPREFIX = "nsprefix";

	/** Use static hibernate mapping file */
	public static final String USE_MAPPING_FILE = MAPPING_PREFIX + "hibernate_mapping_file";

	/** Name of version column, default value is e_version */
	public static final String VERSION_COLUMN_NAME = NAMING_PREFIX + "version_column";

	/** Name of the synthetic id property, default value is e_id */
	public static final String SYNTHETIC_ID_PROPERTY_NAME = NAMING_PREFIX + "synthetic_id_property";

	/** Name of id column, default value is id */
	public static final String ID_COLUMN_NAME = NAMING_PREFIX + "default_id_column";

	/**
	 * Truncate the column name if the length is larger than this property. In case of concatenating property names for
	 * foreign keys
	 */
	public static final String MAXIMUM_SQL_NAME_LENGTH = new String(BASE_NAME + ".MaximumSqlNameLength").toLowerCase();

	/**
	 * Disable EContainer mapping.
	 */
	public static final String DISABLE_ECONTAINER_MAPPING = MAPPING_PREFIX + "disable_econtainer";

	/** Option to specify that for non-contained one-to-many always a join table is used, default is false */
	public static final String JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS = new String(BASE_NAME
			+ ".JoinTableForNonContainedAssociations").toLowerCase();

	/**
	 * The option which determines the casing of columns and table names, lowercase will result in lowercase letters,
	 * uppercase in uppercase, none will just work as it did until now
	 */
	public static final String SQL_CASE_STRATEGY = NAMING_PREFIX + "strategy";

	/**
	 * The wrapped Properties instance.
	 */
	private final Properties properties;

	/**
	 * Construct a new instance using Properties.
	 */
	public PersistenceOptions(Properties properties) {
		// can be null if not set in datastore
		if (properties == null) {
			this.properties = new Properties();
		} else {
			this.properties = properties;
		}
	}

	/**
	 * Constructs a new instance by loading properties from "/elver-persistence.properties" at the root of the
	 * classpath.
	 */
	public PersistenceOptions() {
		properties = new Properties();
		InputStream in = null;
		try {
			in = this.getClass().getResourceAsStream(DEFAULT_CLASSPATH_FILENAME);
			if (in != null) {
				log.debug("Loading persistence options from classpath \"/teneo-properties\".");
				properties.load(in);
			}
		} catch (IOException e) {
			throw new RuntimeException("Error loading \"" + DEFAULT_CLASSPATH_FILENAME + "\" from classpath:"
					+ e.getMessage(), e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				// Ignore.
			}
		}
	}

	/** Returns the value of the UseJoinTableForNonContainedAssociations option, default is false */
	public boolean isJoinTableForNonContainedAssociations() {
		return Boolean.valueOf(properties.getProperty(JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS, "false"))
				.booleanValue();
	}

	/** Returns the value of the UseMappingFile option, default is false */
	public boolean isUseMappingFile() {
		return Boolean.valueOf(properties.getProperty(USE_MAPPING_FILE, "false")).booleanValue();
	}

	/** Returns the value of the orphan delete on containment, default is true */
	public boolean isSetCascadeAllOnContainment() {
		return Boolean.valueOf(properties.getProperty(SET_CASCADE_ALL_ON_CONTAINMENT, "true")).booleanValue();
	}

	/** Returns the value of the Optimistic option, default is true */
	public boolean isUseOptimisticLocking() {
		return Boolean.valueOf(properties.getProperty(OPTIMISTIC, "true")).booleanValue();
	}

	/** Returns the value of the UpdateSchema option, default is true */
	public boolean isUpdateSchema() {
		return Boolean.valueOf(properties.getProperty(UPDATE_SCHEMA, "true")).booleanValue();
	}

	/** Returns the value of the fetch containment eagerly, default is false */
	public boolean isFetchContainmentEagerly() {
		return Boolean.valueOf(properties.getProperty(FETCH_CONTAINMENT_EAGERLY, "false")).booleanValue();
	}

	/** Returns value of the use impl. classname as entity, default is false */
	public boolean isUseImplementationClassAsEntityName() {
		return Boolean.valueOf(properties.getProperty(USE_IMPLEMENTATION_CLASSES_AS_ENTITYNAME, "false"))
				.booleanValue();
	}

	/** Is set entity automatically, default is true */
	public boolean isSetEntityAutomatically() {
		return Boolean.valueOf(properties.getProperty(SET_ENTITY_AUTOMATICALLY, "true")).booleanValue();
	}

	/** Returns the boolean value of the passed option, false if the option is not set */
	public boolean isTrue(String option) {
		return Boolean.valueOf(properties.getProperty(option, "false")).booleanValue();
	}

	/** Returns the inheritance mapping strategy, can be null */
	public String getInheritanceMapping() {
		return properties.getProperty(INHERITANCE_MAPPING);
	}

	/** Returns the value of the version column option, returns null if not set */
	public String getVersionColumnName() {
		return properties.getProperty(VERSION_COLUMN_NAME);
	}

	/** Returns the value of the naming strategy, default is lower case */
	public SQLCaseStrategy getSQLCaseStrategy() {
		return SQLCaseStrategyImpl.createSQLCaseStrategy(properties.getProperty(SQL_CASE_STRATEGY, "lowercase"));
	}

	/** Returns the value of the id column option, returns null if not set */
	public String getIdColumnName() {
		return properties.getProperty(ID_COLUMN_NAME);
	}

	/** Returns the value of the synthetic id property name, returns null if not set */
	public String getSyntheticIdPropertyName() {
		return properties.getProperty(SYNTHETIC_ID_PROPERTY_NAME);
	}

	/** Returns the qualify entity names option, returns QUALIFY_ENTITY_NAME_NO ("no") */
	public String getQualifyEntityName() {
		return properties.getProperty(QUALIFY_ENTITY_NAME, QUALIFY_ENTITY_NAME_NO);
	}

	public boolean isDisableEContainerMapping() {
		return Boolean.valueOf(properties.getProperty(DISABLE_ECONTAINER_MAPPING, "false")).booleanValue();
	}

	/** Return the max. sql name length, or -1 if not set or illegal */
	public int getMaximumSqlNameLength() {
		final String colLength = properties.getProperty(MAXIMUM_SQL_NAME_LENGTH, "-1");
		try {
			return Integer.parseInt(colLength);
		} catch (NumberFormatException e) {
			log.error("Property " + MAXIMUM_SQL_NAME_LENGTH + " as a non-integer value: " + colLength
					+ " value is ignored");
			return -1;
		}
	}

	/**
	 * Returns an array of all String constants.
	 * 
	 * @return
	 */
	public static String[] propertyNames() {
		List names = new ArrayList();
		Field[] fields = PersistenceOptions.class.getFields();
		for (int i = 0; i < fields.length; i++) {
			try {
				final Field field = fields[i]; 
				if ((field.getModifiers() & Modifier.STATIC) > 0 & field.getType().equals(String.class)) {
					final String value = (String) field.get(null);
					if (value.startsWith("teneo.")) {
						names.add(value);
					}
				}
			} catch (IllegalAccessException e) {
			}
		}
		Collections.sort(names);
		return (String[])names.toArray(new String[names.size()]);
	}

	// TODO: Add remaining accessor wrappers.
}