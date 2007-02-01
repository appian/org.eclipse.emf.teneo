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
 * $Id: AnyFeatureMapEntryMapping.java,v 1.4 2007/02/01 12:36:35 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import javax.jdo.spi.PersistenceCapable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.jpox.JpoxStoreException;
import org.eclipse.emf.teneo.jpox.mapping.JPOXSimpleAnyTypeImpl;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.ClassLoaderResolver;
import org.jpox.ClassNameConstants;
import org.jpox.metadata.AbstractPropertyMetaData;
import org.jpox.store.DatastoreAdapter;
import org.jpox.store.DatastoreContainerObject;
import org.jpox.store.OID;
import org.jpox.store.expression.LogicSetExpression;
import org.jpox.store.expression.QueryExpression;
import org.jpox.store.expression.ScalarExpression;
import org.jpox.store.mapping.SingleFieldMultiMapping;

/**
 * Mapping class around the FeatureMap entries of an any element. The feature map entry of any type is stored in the
 * following fields: 1) a string to hold the feature path, 2) the value which can be an oid or a simple type, and 3) a
 * field which keeps track if the content is an EObject or a simple type..
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $ $Date: 2007/02/01 12:36:35 $
 */

public class AnyFeatureMapEntryMapping extends SingleFieldMultiMapping {
	/** The logger */
	private static Log log = LogFactory.getLog(AnyFeatureMapEntryMapping.class);

	/** Value used in the field that keeps track if the value is a simpletype or a reference to another EObject */
	private static final String IS_EOBJECT = "eobject";

	/** Value used in the field that keeps track if the value is a simpletype or a reference to another EObject */
	private static final String IS_NOT_EOBJECT = "not_eobject";
	
    /**
     * Initialize this JavaTypeMapping with the given DatastoreAdapter for
     * the given FieldMetaData.
     *  
     * @param dba The Datastore Adapter that this Mapping should use.
     * @param fmd FieldMetaData for the field to be mapped (if any)
     * @param container The datastore container storing this mapping (if any)
     * @param clr the ClassLoaderResolver
     */
    public void initialize(DatastoreAdapter dba, AbstractPropertyMetaData fmd, DatastoreContainerObject container, ClassLoaderResolver clr)
    {
		super.initialize(dba, fmd, container, clr);

		addDatastoreField(ClassNameConstants.JAVA_LANG_STRING);
		addDatastoreField(ClassNameConstants.JAVA_LANG_STRING);
		addDatastoreField(ClassNameConstants.JAVA_LANG_STRING);
	}

	/**
	 * Return the Java type being represented.
	 */
	public Class getJavaType() {
		return EObject.class;
	}

	/**
	 * Return a typical value for the Java type. For the enum it returns the first value (the one with ordinal zero) as
	 * an example.
	 */
	public Object getSampleValue(ClassLoaderResolver clr) {
		return new AnyFeatureMapEntry(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), "sample value");
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
		return null; // to be implemented
	}

	/** To be implemented */
	public ScalarExpression newScalarExpression(QueryExpression qs, LogicSetExpression te) {
		return null; // to be implemented
	}

	/**
	 * Method that sets the values to be put in the datastore columns from the Java object.
	 */
	public void setObject(org.jpox.PersistenceManager pm, Object preparedStatement, int[] exprIndex, Object value) {
		final AnyFeatureMapEntry entry = (AnyFeatureMapEntry) value;
		final EStructuralFeature feature = entry.getEStructuralFeature();
		final Object entryValue = entry.getValue();

		// if an eobject
		String setValue = null;
		String setDiscriminator = null;
		if (entryValue instanceof EObject) {
			if (!(entryValue instanceof PersistenceCapable)) {
				throw new JpoxStoreException("Only persistencecapable EObjects can be stored in an any element, "
						+ "the class: " + entryValue.getClass().getName() + " is not persistencecapable. "
						+ " Make sure that this class is enhanced!");
			}
			final PersistenceCapable pc = (PersistenceCapable) entryValue;
			if (pc.jdoGetObjectId() == null) {
				// persist it
				pm.makePersistent(pc);
			}
			setValue = pc.jdoGetObjectId().toString();
			setDiscriminator = IS_EOBJECT;
		} else {
			// object is maybe a simple type? Create a SimpleAnyType
			final JPOXSimpleAnyTypeImpl simpleType = new JPOXSimpleAnyTypeImpl();
			simpleType.setInstanceType((EDataType) feature.getEType());
			simpleType.setValue(entryValue);
			setValue = simpleType.getRawValue();
			setDiscriminator = IS_NOT_EOBJECT;
		}

		getDataStoreMapping(0).setString(preparedStatement, exprIndex[0], StoreUtil.structuralFeatureToString(feature));
		getDataStoreMapping(1).setString(preparedStatement, exprIndex[1], setValue);
		getDataStoreMapping(2).setString(preparedStatement, exprIndex[2], setDiscriminator);
	}

	/**
	 * Method to extract the values out of a JDBC ResultSet and return a Java object.
	 */
	public Object getObject(org.jpox.PersistenceManager pm, Object resultSet, int[] exprIndex) {
		final String strFeature = getDataStoreMapping(0).getString(resultSet, exprIndex[0]);
		final String strValue = getDataStoreMapping(1).getString(resultSet, exprIndex[1]);
		final String strDiscriminator = getDataStoreMapping(2).getString(resultSet, exprIndex[2]);

		final EStructuralFeature feature = StoreUtil.stringToStructureFeature(strFeature);

		if (strDiscriminator.compareTo(IS_EOBJECT) == 0) // an eobject
		{
			// a persistence capable object // note can be null if not found!
			final Object obj = pm.getObjectById(new OID(strValue), true, true, null);
			if (obj == null) // object can be deleted throw an error which shows this
			{
				final String msg = "EObjectMapping.getObject(): Object with object id: " + strValue + " of feature: "
						+ strFeature + " can not be retrieved, is has probably been deleted!";
				log.error(msg);

				return new AnyFeatureMapEntry(feature, null);
			}
			return obj;
		} else {
			// translate to a SimpleType to do the conversion
			final JPOXSimpleAnyTypeImpl anyTypeImpl = new JPOXSimpleAnyTypeImpl();
			anyTypeImpl.setInstanceType((EDataType) feature.getEType());
			anyTypeImpl.setRawValue(strValue);

			return new AnyFeatureMapEntry(feature, anyTypeImpl.getValue());
		}
	}
}