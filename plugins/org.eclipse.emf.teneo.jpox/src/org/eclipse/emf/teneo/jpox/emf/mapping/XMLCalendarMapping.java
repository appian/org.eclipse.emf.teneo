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
 * $Id: XMLCalendarMapping.java,v 1.1 2006/07/08 22:04:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.emf.mapping;

import java.lang.reflect.Field;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.eclipse.emf.teneo.jpox.emf.JpoxStoreException;
import org.jpox.ClassLoaderResolver;
import org.jpox.metadata.FieldMetaData;
import org.jpox.store.DatastoreAdapter;
import org.jpox.store.DatastoreContainerObject;
import org.jpox.store.DatastoreField;
import org.jpox.store.expression.QueryExpression;
import org.jpox.store.expression.ScalarExpression;
import org.jpox.store.expression.StringExpression;
import org.jpox.store.expression.StringLiteral;
import org.jpox.store.expression.TableExpression;
import org.jpox.store.mapping.JavaTypeMapping;
import org.jpox.store.mapping.MappingManager;

/**
 * Maps an instance of XMLCalendar from and to the jpox persistency layer.A XMLCalendar is stored in two string fields,
 * one string field for the type (e.g. gYear as a short) and one for the value.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/08 22:04:29 $
 */

public class XMLCalendarMapping extends JavaTypeMapping {
	/** The logger */
	private static Log log = LogFactory.getLog(XMLCalendarMapping.class);

	/** The datastore class, see jpox for info */
	protected DatastoreContainerObject datastoreContainer;

	/** Constructor */
	public XMLCalendarMapping(DatastoreAdapter dba, String type) {
		super(null, dba, type);
		this.datastoreContainer = null;
	}

	/** Constructor */
	public XMLCalendarMapping(DatastoreAdapter dba, FieldMetaData fmd, DatastoreContainerObject datastoreContainer,
			ClassLoaderResolver clr) {
		this(dba, fmd, datastoreContainer);
	}

	/** Constructor */
	public XMLCalendarMapping(DatastoreAdapter dba, FieldMetaData fmd, DatastoreContainerObject datastoreContainer) {
		this(dba, fmd, datastoreContainer, true);
	}

	/**
	 * Constructor.
	 * 
	 * @param dba
	 *            Datastroe Adapter
	 * @param fmd
	 *            FieldMetaData for the field to be mapped
	 * @param datastoreContainer
	 *            Table containing the mapped field
	 * @param initDatastoreMappings
	 *            Whether to initialise the datastore mappings (create the columns etc)
	 */
	public XMLCalendarMapping(DatastoreAdapter dba, FieldMetaData fmd, DatastoreContainerObject datastoreContainer,
			boolean initDatastoreMappings) {
		super(fmd, dba, fmd.getType().getName());

		this.datastoreContainer = datastoreContainer;

		if (initDatastoreMappings) {
			try {
				MappingManager mgr = datastoreContainer.getStoreManager().getMappingManager();
				DatastoreField column = mgr.createDatastoreField(fmd, datastoreContainer, dba, this, String.class
						.getName(), 2);
				mgr.createDatastoreMapping(this, datastoreContainer.getStoreManager(), column, String.class.getName());
				column = mgr.createDatastoreField(fmd, datastoreContainer, dba, this, String.class.getName(), 2);
				mgr.createDatastoreMapping(this, datastoreContainer.getStoreManager(), column, String.class.getName());
			} catch (Exception e) {
				e.printStackTrace(System.err);
				throw new JpoxStoreException("MappingException", e);
			}
		}
	}

	/**
	 * Return the Java type being represented.
	 */
	public Class getJavaType() {
		return XMLCalendar.class;
	}

	/**
	 * Accessor for the datastore class (e.g in an RDBMS context, the Table)
	 * 
	 * @return The datastore class containing this mapped field.
	 */
	public DatastoreContainerObject getDatastoreContainer() {
		return datastoreContainer;
	}

	/**
	 * Return a typical value for the Java type. For the enum it returns the first value (the one with ordinal zero) as
	 * an example.
	 */
	public Object getSampleValue() {
		return new XMLCalendar(new Date(), XMLCalendar.GMONTHDAY);
	}

	/* See superclass */
	public boolean includeInFetchStatement() {
		return true;
	}

	/* See superclass */
	public boolean includeInUpdateStatement() {
		return true;
	}

	/* See superclass */
	public boolean includeInInsertStatement() {
		return true;
	}

	/** The string value of the enum is stored, so I assume that the string value should be used here */
	public ScalarExpression newLiteral(QueryExpression qs, Object value) {
		final ScalarExpression expr = new StringLiteral(qs, this, ((XMLCalendar) value).toString());
		return expr;
	}

	/** The string value of the enum is stored, so I assume that the string value should be used here */
	public ScalarExpression newScalarExpression(QueryExpression qs, TableExpression te) {
		final ScalarExpression expr = new StringExpression(qs, this, te);
		return expr;
	}

	/**
	 * Method that sets the values to be put in the datastore columns from the Java object.
	 */
	public void setObject(org.jpox.PersistenceManager pm, Object preparedStatement, int[] exprIndex, Object value) {
		final XMLCalendar xmlcal = (XMLCalendar) value;

		log.debug("Storing XMLCalendar: " + xmlcal.toString());

		// first place the datatype
		try {
			final Field dataTypeField = XMLCalendar.class.getDeclaredField("dataType");
			dataTypeField.setAccessible(true);
			Short datatype = (Short) dataTypeField.get(value);
			getDataStoreMapping(0).setString(preparedStatement, exprIndex[0], datatype.toString());
		} catch (Exception e) {
			throw new JpoxStoreException("Exception when trying to retrieve information from xmlcalendar " + xmlcal, e);
		}

		// and then the value
		getDataStoreMapping(1).setString(preparedStatement, exprIndex[1], xmlcal.toString());
	}

	/**
	 * Method to extract the values out of a JDBC ResultSet and return a Java object. The two string values are
	 * translated into a XMLCalendar.
	 */
	public Object getObject(org.jpox.PersistenceManager pm, Object resultSet, int[] exprIndex) {
		final short datatype = Short.parseShort(getDataStoreMapping(0).getString(resultSet, exprIndex[0]));
		final String value = getDataStoreMapping(1).getString(resultSet, exprIndex[1]);

		return new XMLCalendar(value, datatype);
	}
}