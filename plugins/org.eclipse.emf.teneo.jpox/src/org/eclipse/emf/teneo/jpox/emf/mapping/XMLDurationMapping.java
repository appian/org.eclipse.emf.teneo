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
 * $Id: XMLDurationMapping.java,v 1.1 2006/07/08 22:04:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.emf.mapping;

import org.eclipse.emf.ecore.xml.type.internal.XMLDuration;
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
 * Maps an instance of XMLDuration from and to the jpox persistency layer. A XMLDuration is stored in one string field.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/08 22:04:29 $
 */

public class XMLDurationMapping extends JavaTypeMapping {
	/** The datastore class, see jpox for info */
	protected DatastoreContainerObject datastoreContainer;

	/** Constructor */
	public XMLDurationMapping(DatastoreAdapter dba, String type) {
		super(null, dba, type);
		this.datastoreContainer = null;
	}

	/** Constructor */
	public XMLDurationMapping(DatastoreAdapter dba, FieldMetaData fmd, DatastoreContainerObject datastoreContainer,
			ClassLoaderResolver clr) {
		this(dba, fmd, datastoreContainer);
	}

	/** Constructor */
	public XMLDurationMapping(DatastoreAdapter dba, FieldMetaData fmd, DatastoreContainerObject datastoreContainer) {
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
	public XMLDurationMapping(DatastoreAdapter dba, FieldMetaData fmd, DatastoreContainerObject datastoreContainer,
			boolean initDatastoreMappings) {
		super(fmd, dba, fmd.getType().getName());

		this.datastoreContainer = datastoreContainer;

		if (initDatastoreMappings) {
			try {
				MappingManager mgr = datastoreContainer.getStoreManager().getMappingManager();
				DatastoreField column = mgr.createDatastoreField(fmd, datastoreContainer, dba, this, String.class
						.getName(), 1);
				mgr.createDatastoreMapping(this, datastoreContainer.getStoreManager(), column, String.class.getName());
			} catch (Exception e) {
				e.printStackTrace(System.err);
				throw new JpoxStoreException("Exception", e);
			}
		}
	}

	/**
	 * Return the Java type being represented.
	 */
	public Class getJavaType() {
		return XMLDuration.class;
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
		return new XMLDuration("P1Y2M3DT10H30M12.3S");
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
		final ScalarExpression expr = new StringLiteral(qs, this, ((XMLDuration) value).toString());
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
		final XMLDuration xmldur = (XMLDuration) value;
		getDataStoreMapping(0).setString(preparedStatement, exprIndex[0], xmldur.toString());
	}

	/**
	 * Method to extract the values out of a JDBC ResultSet and return a Java object.
	 */
	public Object getObject(org.jpox.PersistenceManager pm, Object resultSet, int[] exprIndex) {
		final String value = getDataStoreMapping(0).getString(resultSet, exprIndex[1]);
		return new XMLDuration(value);
	}
}