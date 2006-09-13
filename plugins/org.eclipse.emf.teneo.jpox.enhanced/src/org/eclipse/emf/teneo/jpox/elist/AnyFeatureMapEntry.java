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
 * $Id: AnyFeatureMapEntry.java,v 1.1 2006/09/13 10:43:14 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import javax.jdo.PersistenceManager;
import javax.jdo.spi.PersistenceCapable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.jpox.JpoxEnhancedStoreException;
import org.eclipse.emf.teneo.jpox.mapping.JPOXSimpleAnyTypeImpl;
import org.eclipse.emf.teneo.type.FeatureMapEntry;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.store.OID;

/**
 * Is a specific EMF feature map entry for handling any content. In case of any content it is unknown which elements are
 * actually stored. So in this case all information is stored in a set of String fields.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/09/13 10:43:14 $
 */

public class AnyFeatureMapEntry extends FeatureMapEntry {
	
	/** The logger */
	private static Log log = LogFactory.getLog(AnyFeatureMapEntry.class);

	/** Field contains the path identifying the store feature */
	private String featurePath;

	/** Field contains the value, either the OID or the simple Type value */
	private String anyValue;

	/* Constructor */
	public AnyFeatureMapEntry() {
	}

	/* Constructor */
	public AnyFeatureMapEntry(EStructuralFeature feature, Object value) {
		super(feature, value);
	}

	/** Create copy with same feature and different value */
	public Internal createEntry(Object value) {
		return new AnyFeatureMapEntry(getEStructuralFeature(), value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.jpox.emf.elist.FeatureMapEntry#getStructuralFeatureDBID()
	 */
	protected String getStructuralFeatureDBID() {
		return featurePath;
	}

	/* Sets the value from the db specific values, is done already at initialization time */
	protected Object getValueFromSpecificImplementation(EStructuralFeature feature) {
		if (feature instanceof EReference) {
			// a persistence capable object // note can be null if not found!
			final Object obj = ((PersistenceCapable) this).jdoGetPersistenceManager().getObjectById(new OID(anyValue),
					true);
			if (obj == null) // object has possibly been deleted throw an error which shows this
			{
				final String msg = "EObjectMapping.getObject(): Object with object id: " + anyValue + " of feature: "
						+ featurePath + " can not be retrieved, is has probably been deleted!";
				log.error(msg);

				return null;
			}
			return obj;
		} else if (feature instanceof EAttribute) {
			// translate to a SimpleType to do the conversion
			final JPOXSimpleAnyTypeImpl anyTypeImpl = new JPOXSimpleAnyTypeImpl();
			anyTypeImpl.setInstanceType((EDataType) feature.getEType());
			anyTypeImpl.setRawValue(anyValue);

			return anyTypeImpl.getValue();
		} else {
			throw new JpoxEnhancedStoreException("Unknown instance: " + feature.getClass().getName());
		}
	}

	/** Sets local values */
	public void initializeSpecificImplementation() {
		final EStructuralFeature feature = getEStructuralFeature();
		final Object entryValue = getValue();

		// if an eobject
		String setValue = null;
		if (entryValue instanceof EObject) {
			if (!(entryValue instanceof PersistenceCapable)) {
				throw new JpoxEnhancedStoreException("Only persistencecapable EObjects can be stored in an any element, "
						+ "the class: " + entryValue.getClass().getName() + " is not persistencecapable. "
						+ " Make sure that this class is enhanced!");
			}
			final PersistenceCapable pc = (PersistenceCapable) entryValue;
			if (((PersistenceCapable) this).jdoGetPersistenceManager() != null) {
				if (pc.jdoGetObjectId() == null) // not persistent yet
				{
					// persist it
					((PersistenceCapable) this).jdoGetPersistenceManager().makePersistent(pc);
				}
				setValue = pc.jdoGetObjectId().toString();
			} else {
				setValue = null;
			}
		} else {
			// object is hopefully a simple type? Create a SimpleAnyType
			final JPOXSimpleAnyTypeImpl simpleType = new JPOXSimpleAnyTypeImpl();
			simpleType.setInstanceType((EDataType) feature.getEType());
			simpleType.setValue(entryValue);
			setValue = simpleType.getRawValue();
		}

		featurePath = StoreUtil.structuralFeatureToString(feature);
		anyValue = setValue;
	}

	/** Sets the value in this anyfeature using the Persistence Manager */
	public void persistValue(PersistenceManager pm) {
		if (!(getValue() instanceof PersistenceCapable))
			return;

		final PersistenceCapable pc = (PersistenceCapable) getValue();
		if (pc.jdoGetObjectId() == null) // not persistent yet
		{
			// persist it
			pm.makePersistent(pc);
		}
		anyValue = pc.jdoGetObjectId().toString();
	}
}