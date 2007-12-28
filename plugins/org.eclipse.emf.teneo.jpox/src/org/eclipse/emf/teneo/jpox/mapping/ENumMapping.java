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
 * $Id: ENumMapping.java,v 1.6 2007/12/28 14:36:25 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapping;

import java.lang.reflect.Method;
import java.util.HashMap;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;
import org.eclipse.emf.teneo.classloader.StoreClassLoadException;
import org.eclipse.emf.teneo.jpox.JpoxStoreException;
import org.jpox.ClassNameConstants;
import org.jpox.metadata.AbstractPropertyMetaData;
import org.jpox.store.DatastoreAdapter;
import org.jpox.store.DatastoreContainerObject;
import org.jpox.store.DatastoreField;
import org.jpox.store.expression.LogicSetExpression;
import org.jpox.store.expression.QueryExpression;
import org.jpox.store.expression.ScalarExpression;
import org.jpox.store.expression.StringExpression;
import org.jpox.store.expression.StringLiteral;
import org.jpox.store.mapping.JavaTypeMapping;
import org.jpox.store.mapping.MappingFactory;
import org.jpox.store.mapping.MappingManager;

/**
 * This class implements the jpox type mapping for an EMF enum object. The emf enum is stored as a
 * string in the database. So during the storage of an EObject the enum fields (objects) have to be
 * translated to strings. When a read is done this conversion is done from string to the correct
 * enum object. This class assumes that all EMF enums implement a static get method which gets a
 * string parameter and returns the enum object. This class calls this static method using the class
 * signature (reflection).
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $ $Date: 2007/12/28 14:36:25 $
 */

public class ENumMapping extends JavaTypeMapping {

	/** The enum type we are handling here */
	private Class enumType;

	/** The method which translates a string to an instance of the emf enum */
	private Method getMethod;

	/** Hashmap with string to enum mappings */
	private final HashMap localCache = new HashMap();

	/**
	 * Initialize this JavaTypeMapping with the given DatastoreAdapter for the given type.
	 * 
	 * @param dba
	 *            The Datastore Adapter that this Mapping should use.
	 * @param type
	 *            The Class that this mapping maps to the database.
	 * @see MappingFactory#createMapping(Class, DatastoreAdapter, String)
	 */
	@Override
	public void initialize(DatastoreAdapter dba, String type) {
		super.initialize(dba, type);

		try {
			enumType = ClassLoaderResolver.classForName(type);
			getMethod = enumType.getMethod("get", new Class[] { String.class });
		} catch (NoSuchMethodException e) {
			throw new JpoxStoreException(
				"The get method which returns an enum instance does not exist for the class: " + type);
		} catch (StoreClassLoadException e) {
			throw new JpoxStoreException("The enum can not be found: " + type);
		}
	}

	/**
	 * Initialize this JavaTypeMapping with the given DatastoreAdapter for the given FieldMetaData.
	 * 
	 * @param dba
	 *            The Datastore Adapter that this Mapping should use.
	 * @param fmd
	 *            FieldMetaData for the field to be mapped (if any)
	 * @param container
	 *            The datastore container storing this mapping (if any)
	 * @param clr
	 *            the ClassLoaderResolver
	 */
	@Override
	public void initialize(DatastoreAdapter dba, AbstractPropertyMetaData fmd, DatastoreContainerObject container,
			org.jpox.ClassLoaderResolver clr) {
		super.initialize(dba, fmd, container, clr);

		try {
			enumType = fmd.getType();
			getMethod = enumType.getMethod("get", new Class[] { String.class });
		} catch (NoSuchMethodException e) {
			throw new JpoxStoreException(
				"The get method which returns an enum instance does not exist for the class: " + type);
		} catch (StoreClassLoadException e) {
			throw new JpoxStoreException("The enum can not be found: " + type);
		}
		addDatastoreField(ClassNameConstants.JAVA_LANG_STRING);
	}

	/**
	 * Convenience method to add a datastore field for this mapping. The column will be created
	 * using the ColumnMetaData for the respective position of this column. The column is added to
	 * the end of the list of datastore fields.
	 * 
	 * @param typeName
	 *            Java type of the field to add the column for.
	 */
	protected void addDatastoreField(String typeName) {
		MappingManager mgr = dba.getMappingManager();
		DatastoreField column =
				mgr.createDatastoreField(fmd, datastoreContainer, dba, this, typeName, getNumberOfDatastoreFields());
		mgr.createDatastoreMapping(this, datastoreContainer.getStoreManager(), column, typeName);
	}

	/**
	 * Return the Java type being represented.
	 */
	@Override
	public Class getJavaType() {
		return enumType;
	}

	@Override
	public String getJavaTypeForDatastoreMapping(int index) {
		return String.class.getName();
	}

	/**
	 * Accessor for the datastore class (e.g in an RDBMS context, the Table)
	 * 
	 * @return The datastore class containing this mapped field.
	 */
	@Override
	public DatastoreContainerObject getDatastoreContainer() {
		return datastoreContainer;
	}

	/**
	 * Return a typical value for the Java type. For the enum it returns the first value (the one
	 * with ordinal zero) as an example.
	 */
	@Override
	public Object getSampleValue(org.jpox.ClassLoaderResolver clr) {
		// this is a bit of a hack, we assume that there is an enum for the int value 0
		try {
			final Method getIntMethod = enumType.getMethod("get", new Class[] { int.class });
			return getIntMethod.invoke(null, new Object[] { new Integer(0) });
		} catch (Exception e) {
			throw new JpoxStoreException("Exception when getting sample enum for class: " + enumType.getName(), e);
		}
	}

	/* See superclass */
	@Override
	public boolean includeInFetchStatement() {
		return true;
	}

	/* See superclass */
	@Override
	public boolean includeInUpdateStatement() {
		return true;
	}

	/* See superclass */
	@Override
	public boolean includeInInsertStatement() {
		return true;
	}

	/** The string value of the enum is stored, so I assume that the string value should be used here */
	@Override
	public ScalarExpression newLiteral(QueryExpression qs, Object value) {
		ScalarExpression expr = new StringLiteral(qs, this, ((Enumerator) value).getLiteral());
		return expr;
	}

	/** The string value of the enum is stored, so I assume that the string value should be used here */
	@Override
	public ScalarExpression newScalarExpression(QueryExpression qs, LogicSetExpression te) {
		ScalarExpression expr = new StringExpression(qs, this, te);
		return expr;
	}

	/**
	 * Method that sets the values to be put in the datastore columns from the Java object. In this
	 * case a string (the name of the enum).
	 */
	@Override
	public void setObject(org.jpox.PersistenceManager pm, Object preparedStatement, int[] exprIndex, Object value) {
		Enumerator enumValue = (Enumerator) value;
		if (enumValue == null) {
			getDataStoreMapping(0).setString(preparedStatement, exprIndex[0], null);
		} else {
			getDataStoreMapping(0).setString(preparedStatement, exprIndex[0], enumValue.getLiteral());
		}
	}

	/**
	 * Method to extract the values out of a JDBC ResultSet and return a Java object. In this case
	 * the string is read from the resultset and the static method is called on the Enum class to
	 * get the correct enum object. Synchronized because of updating of localcache.
	 */
	@Override
	public synchronized Object getObject(org.jpox.PersistenceManager pm, Object resultSet, int[] exprIndex) {
		final String strVal = getDataStoreMapping(0).getString(resultSet, exprIndex[0]);

		Enumerator enumValue = (Enumerator) localCache.get(strVal);
		if (enumValue != null) {
			return enumValue;
		}

		// call the getMethod!
		try {
			enumValue = (Enumerator) getMethod.invoke(null, new Object[] { strVal });
			localCache.put(strVal, enumValue);
			return enumValue;
		} catch (Exception e) {
			e.printStackTrace(System.err);
			throw new JpoxStoreException("Exception when getting enum for class: " + enumType.getName() +
					" using value: " + strVal, e);
		}
	}
}