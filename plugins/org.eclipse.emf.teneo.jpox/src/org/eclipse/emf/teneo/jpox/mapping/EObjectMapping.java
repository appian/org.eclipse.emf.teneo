/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EObjectMapping.java,v 1.6 2008/02/28 07:09:03 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapping;

import javax.jdo.spi.PersistenceCapable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xml.type.SimpleAnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.jpox.JpoxStoreException;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.ClassLoaderResolver;
import org.jpox.ClassNameConstants;
import org.jpox.StateManager;
import org.jpox.metadata.AbstractPropertyMetaData;
import org.jpox.store.DatastoreAdapter;
import org.jpox.store.DatastoreContainerObject;
import org.jpox.store.OID;
import org.jpox.store.expression.LogicSetExpression;
import org.jpox.store.expression.QueryExpression;
import org.jpox.store.expression.ScalarExpression;
import org.jpox.store.mapping.MappingCallbacks;
import org.jpox.store.mapping.SingleFieldMultiMapping;

/**
 * This class implements the jpox type mapping for a general EObject.This mapping supports two types of EObjects: 1)
 * persistable and 2) simple EObjects which implement SimpleAnyType. The first type is persisted by persisting the OID
 * in a string field. The second type is persisted in two fields: 1) to maintain the EDataType and 2) to keep the value
 * (as a string).
 * 
 * Note this mapping is mainly used to support xsd:any and xsd:anyType.
 * 
 * Note, there is one main drawback with this persistency method, nl. that no referential integrity is maintained. In
 * the future possibly referential integrity is supported by storing all any types with references in a reference table.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $ $Date: 2008/02/28 07:09:03 $
 */

public class EObjectMapping extends SingleFieldMultiMapping implements MappingCallbacks {
	/** The logger */
	private static Log log = LogFactory.getLog(EObjectMapping.class);
	
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
		JPOXSimpleAnyTypeImpl anyTypeImpl = new JPOXSimpleAnyTypeImpl();
		anyTypeImpl.setInstanceType(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text().getEAttributeType());
		anyTypeImpl.setValue("Sample Value");
		return anyTypeImpl;
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

	/** Returns null */
	public ScalarExpression newScalarExpression(QueryExpression qs, LogicSetExpression te) {
		return null;
	}

	/**
	 * Method that sets the values to be put in the datastore columns from the Java object.
	 */
	public void setObject(org.jpox.PersistenceManager pm, Object preparedStatement, int[] exprIndex, Object value) {
		final EObject eobj = (EObject) value;
		if (eobj == null) {
			getDataStoreMapping(0).setString(preparedStatement, exprIndex[0], null);
			getDataStoreMapping(1).setString(preparedStatement, exprIndex[1], null);
		} else if (eobj instanceof PersistenceCapable) {
			final PersistenceCapable pc = (PersistenceCapable) eobj;

			if (pc.jdoGetObjectId() == null) {
				pm.makePersistent(pc);
			}
			getDataStoreMapping(0).setString(preparedStatement, exprIndex[0], AnyTypeEObject.IS_PC);
			getDataStoreMapping(1).setString(preparedStatement, exprIndex[1], pc.jdoGetObjectId().toString());
		} else if (eobj instanceof SimpleAnyType) {
			final SimpleAnyType simpleAnyType = (SimpleAnyType) eobj;

			if (!(simpleAnyType.eContainmentFeature().getEType() instanceof EDataType)) {
				throw new JpoxStoreException("The containing feature (" + simpleAnyType.eContainmentFeature().getName()
						+ ") is not a EDataType but a "
						+ simpleAnyType.eContainmentFeature().getEType().getClass().getName());
			}

			getDataStoreMapping(0).setString(preparedStatement, exprIndex[0],
					StoreUtil.structuralFeatureToString(simpleAnyType.eContainmentFeature()));
			getDataStoreMapping(1).setString(preparedStatement, exprIndex[1], simpleAnyType.getRawValue());
		} else {
			throw new JpoxStoreException("The EObjectMapping does not support this class: "
					+ value.getClass().getName());
		}
	}

	/**
	 * Method to extract the values out of a JDBC ResultSet and return a Java object.
	 */
	public Object getObject(org.jpox.PersistenceManager pm, Object resultSet, int[] exprIndex) {
		final String strVal0 = getDataStoreMapping(0).getString(resultSet, exprIndex[0]);
		final String strVal1 = getDataStoreMapping(1).getString(resultSet, exprIndex[1]);

		if (strVal0.startsWith(AnyTypeEObject.IS_PC)) {
			// a persistence capable object // note can be null if not found!
			final Object obj = pm.getObjectById(new OID(strVal1), true, true, null);
			if (obj == null) // object can be deleted throw an error which shows this
			{
				final String msg = "EObjectMapping.getObject(): Object with object id: " + strVal1 + " of class: "
						+ strVal0 + " can not be retrieved, is has probably been deleted";
				log.error(msg);

				// use a SimpleAnyType to allow the using app to continue at least.
				// todo: this really has to be improved/prevented, for example by creating a separate oid table!
				JPOXSimpleAnyTypeImpl anyTypeImpl = new JPOXSimpleAnyTypeImpl();
				anyTypeImpl.setInstanceType(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text().getEAttributeType());
				anyTypeImpl.setValue(msg);
				return anyTypeImpl;
			}
			return obj;
		} else {
			EStructuralFeature feature = StoreUtil.stringToStructureFeature(strVal0);
			JPOXSimpleAnyTypeImpl anyTypeImpl = new JPOXSimpleAnyTypeImpl();
			anyTypeImpl.setInstanceType((EDataType) feature.getEType());
			anyTypeImpl.setRawValue(strVal1);
			return anyTypeImpl;
		}
	}

	// --------------------------------- Mapping Call Backs --------------------------------------------------

	/** Deletes the object if the feature of the EObject field is dependent */
	public void deleteDependent(StateManager sm) {
		final EStructuralFeature feature = StoreUtil.getEStructuralFeature((InternalEObject) sm.getObject(), fmd
				.getName());

		if (feature instanceof EReference) {
			final EReference eref = (EReference) feature;

			sm.isLoaded(sm.getObject(), fmd.getAbsoluteFieldNumber());
			final Object value = sm.provideField(fmd.getAbsoluteFieldNumber());

			if (eref.isContainment() && value instanceof PersistenceCapable) {
				sm.getPersistenceManager().deletePersistent(value);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpox.store.mapping.MappingCallbacks#postFetch(org.jpox.StateManager)
	 */
	public void postFetch(StateManager sm) {
		// Do nothing here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpox.store.mapping.MappingCallbacks#postInsert(org.jpox.StateManager)
	 */
	public void postInsert(StateManager sm) {
		// Do nothing here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpox.store.mapping.MappingCallbacks#postUpdate(org.jpox.StateManager)
	 */
	public void postUpdate(StateManager sm) {
		// Do nothing here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpox.store.mapping.MappingCallbacks#preDelete(org.jpox.StateManager)
	 */
	public void preDelete(StateManager sm) {
		// Do nothing here
	}
}