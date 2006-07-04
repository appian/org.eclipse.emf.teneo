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
 * $Id: FeatureMapEntry.java,v 1.1 2006/07/04 21:04:04 mtaal Exp $
 */

package org.eclipse.emf.teneo.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.eclipse.emf.teneo.StoreException;
import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;
import org.eclipse.emf.teneo.classloader.StoreClassLoadException;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Is used to replace the EMF feature map entry with an entry which can be handled by the or layer.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public abstract class FeatureMapEntry implements FeatureMap.Entry {
	/** Cache the mappings so that the getEntryClass method is faster */
	private static final Hashtable cacheEntryClass = new Hashtable();

	/**
	 * Method to get from a class and field name to the name of the generated Group class. This method also tries the interfaces of a
	 * class (and the superinterfaces etc.). The result is cached to get the results faster the next time.
	 */
	public static Class getEntryClass(Class clazz, String fieldName) {
		return getEntryClass(clazz, fieldName, clazz.getName() + fieldName);
	}

	/**
	 * Returns the entry class on the basis of the interfaces of the passed class, this is used for hibernate which will have
	 * featuremap entries generated on interface level instead of impl. level public static Class getEntryClassFromInterface(Class
	 * clazz, String fieldName) { // try the interfaces for (int i = 0; i < clazz.getInterfaces().length; i++) { final Class
	 * elementClass = getEntryClass(clazz.getInterfaces()[i], fieldName); if (elementClass != null) return elementClass; } throw new
	 * StoreException("No FeatureMapEntry class found for class/field: " + clazz.getName() + "/" + fieldName); }
	 */

	/**
	 * Method to get from a class and field name to the name of the generated Group class. This method also tries the interfaces of a
	 * class (and the superinterfaces etc.). The result is cached to get the results faster the next time.
	 */
	private static Class getEntryClass(Class clazz, String fieldName, String originalName) {
		String className = clazz.getName() + fieldName;

		// first try the cache
		Class elementClass = (Class) cacheEntryClass.get(className);
		if (elementClass != null) return elementClass;

		try {
			elementClass = ClassLoaderResolver.classForName(className);
			cacheEntryClass.put(className, elementClass);
		} catch (StoreClassLoadException e) // is probably always a classnotfoundexception
		{
			final String origName = className;
			String firstChar = fieldName.substring(0, 1);
			if (firstChar.toUpperCase().compareTo(firstChar) == 0) // uppercase -> to lowercase
			{
				firstChar = firstChar.toLowerCase();
			} else {
				firstChar = firstChar.toUpperCase();
			}
			final String restField = fieldName.substring(1);
			className = clazz.getName() + firstChar + restField;
			try {
				elementClass = ClassLoaderResolver.classForName(className);
				cacheEntryClass.put(className, elementClass);
			} catch (StoreClassLoadException f) // is probably always a classnotfoundexception
			{
				// try the interfaces
				if (clazz.isInterface()) {
					for (int i = 0; i < clazz.getInterfaces().length; i++) {
						elementClass = getEntryClass(clazz.getInterfaces()[i], fieldName, originalName);
						if (elementClass != null) break;
					}
				} else // try the superclass
				{
					if (clazz.getSuperclass() != null) {
						elementClass = getEntryClass(clazz.getSuperclass(), fieldName, originalName);
					}
				}

				if (elementClass == null && !clazz.isInterface()) {
					throw new StoreException("Class can not be found, the following names were tried: 1) " + origName + ", and 2) "
							+ className);
				}
			}
		}
		if (elementClass != null) {
			cacheEntryClass.put(originalName, elementClass);
		}
		return elementClass;
	}

	/**
	 * Gets an 'normal' FeatureMap.Entry and if it is not a FeatureMapEntry replaces it with a specific implementation.
	 */
	public static FeatureMapEntry replaceEntry(Object obj, Class replaceByType, FeatureMap.Internal owningMap) {
		// if (obj instanceof FeatureMapEntry) return (FeatureMapEntry)obj;
		try {
			// do special check, in case the featuremap entry does not need to be changed
			if (obj instanceof FeatureMapEntry) {
				final FeatureMapEntry fmEntry = (FeatureMapEntry) obj;

				// return the entry if it is not yet set, in this case it does not yet belong to a
				// featuremap and can be used. This happens with a featuremap which has already been replaced.
				if (!fmEntry.isFeatureMapSet() || fmEntry.belongsToFeatureMap(owningMap)) return fmEntry;
			}
			FeatureMapEntry entry = (FeatureMapEntry) replaceByType.newInstance();
			entry.setEntry((FeatureMap.Entry) obj);
			entry.setFeatureMap(owningMap);
			return entry;
		} catch (Exception e) {
			throw new StoreException("Exception while instantiating for elementClass " + replaceByType.getName(), e);
		}
	}

	/**
	 * Replaces standard FeatureMap.Entry with a FeatureMapEntry for a collection
	 */
	public static Collection replaceEntryAll(Collection c, Class replaceByType, FeatureMap.Internal owningMap) {
		final ArrayList newEntries = new ArrayList();
		final Iterator it = c.iterator();
		while (it.hasNext()) {
			newEntries.add(replaceEntry(it.next(), replaceByType, owningMap));
		}
		return newEntries;
	}

	/** Creates an entry with the correct type */
	public static FeatureMap.Entry createEntry(EStructuralFeature feature, Object value, Class replaceByType,
			FeatureMap.Internal owningMap) {
		try {
			FeatureMapEntry entry = (FeatureMapEntry) replaceByType.newInstance();
			entry.setFields(feature, value);
			entry.setFeatureMap(owningMap);
			return entry;
		} catch (Exception e) {
			throw new StoreException("Exception while instantiating for elementClass " + replaceByType.getName(), e);
		}
	}

	/** Method which creates a list of entries based on one feature and multiple values */
	public static Collection createEntryAll(EStructuralFeature feature, Collection values, Class elementType,
			FeatureMap.Internal owningMap) {
		final ArrayList entries = new ArrayList();
		final Iterator it = values.iterator();
		while (it.hasNext()) {
			entries.add(createEntry(feature, it.next(), elementType, owningMap));
		}
		return entries;
	}

	/** The structural feature which defines which element this is */
	private EStructuralFeature eStructuralFeature;

	/** And its value */
	private Object value;

	/** Keeps track if the class was initialized */
	private boolean initialized = false;

	/**
	 * The featuremap to which we are connected. Is used to determine if entries have been added to another featuremap. This happens in
	 * copy actions.
	 */
	private FeatureMap.Internal owningMap;

	/** Constructor called by the storage layer, fields need to be set by calls to subclass */
	public FeatureMapEntry() {
	}

	/** Constructor called by the storage layer, fields need to be set by calls to subclass */
	public FeatureMapEntry(EStructuralFeature feature, Object val) {
		eStructuralFeature = feature;
		value = val;
		initialized = true;
		initializeSpecificImplementation();
	}

	/** Sets the featuremap, is done when an entry is added to the featuremap */
	public void setFeatureMap(FeatureMap.Internal featureMap) {
		owningMap = featureMap;

		/*
		 * if (value != null && value instanceof InternalEObject && eStructuralFeature instanceof EReference &&
		 * ((EReference)eStructuralFeature).isContainment()) {
		 * ((InternalEObject)value).eSetResource((Resource.Internal)owningMap.getEObject().eResource(), null); }
		 */
	}

	/** Unsets the featuremap, is done when an entry is removed */
	public void unsetFeatureMap() {
		owningMap = null;
	}

	/** Is true if this featureMap already belongs to a Map */
	public boolean isFeatureMapSet() {
		return owningMap != null;
	}

	/** Is true if this featureMap already belongs to the passed map */
	public boolean belongsToFeatureMap(FeatureMap.Internal fm) {
		return owningMap == fm; // object equality!
	}

	/** Set the value from a previous entry */
	public void setEntry(FeatureMap.Entry entry) {
		eStructuralFeature = entry.getEStructuralFeature();
		value = entry.getValue();
		initialized = true; // needs to be set before the call to the subclass, otherwise infinite looping
		initializeSpecificImplementation();
	}

	/** Initializes this class from the values in the subclass */
	public void initialize() {
		eStructuralFeature = retrieveStructuralFeature(getStructuralFeatureDBID());
		value = getValueFromSpecificImplementation(eStructuralFeature);
		initialized = true;
	}

	/** Needs to be implemented by the subclass, returns the value based on one of the fields set through the db */
	protected abstract Object getValueFromSpecificImplementation(EStructuralFeature eFeature);

	/** Needs to be implemented by the subclass, returns the database id of the structural feature */
	protected abstract String getStructuralFeatureDBID();

	/** Is called by the super class to notify the subclass that it needs to set its fields based on the structural feature */
	protected abstract void initializeSpecificImplementation();

	/** Method which needs to be called by the subclass to set the superclass members */
	public void setFields(EStructuralFeature structuralFeature, Object structuralValue) {
		eStructuralFeature = structuralFeature;
		value = structuralValue;
		initialized = true; // do this before the call to the subclass
		// initialize the subclass so that the fields are stored in the db
		initializeSpecificImplementation();
	}

	/** Returns structural feature */
	public EStructuralFeature getEStructuralFeature() {
		if (!initialized) initialize();

		return eStructuralFeature;
	}

	/** Returns the value */
	public Object getValue() {
		if (!initialized) initialize();

		return value;
	}

	/** Returns the string which is used to store the unique identification of this structuralfeature in the db */
	protected String createStructuralFeatureDBID() {
		return StoreUtil.structuralFeatureToString(getEStructuralFeature());
	}

	/** Gets a structuralfeature on the basis of the passed id */
	protected EStructuralFeature retrieveStructuralFeature(String dbid) {
		return StoreUtil.stringToStructureFeature(dbid);
	}

	/**
	 * Checks if a certain feature has a certain name or that its group (if present) has this name, in which case it is also set to
	 * true.
	 */
	protected boolean featureForField(String name) {
		if (eStructuralFeature.getName().compareTo(name) == 0) return true;

		// check the group feature
		final EStructuralFeature groupFeature = ExtendedMetaData.INSTANCE.getGroup(eStructuralFeature);
		if (groupFeature != null && groupFeature.getName().compareTo(name) == 0) return true;

		final EStructuralFeature affiliatedFeature = ExtendedMetaData.INSTANCE.getAffiliation(eStructuralFeature);
		if (affiliatedFeature != null && affiliatedFeature.getName().compareTo(name) == 0) return true;
		return false;
	}

	/**
	 * Sets the container property of the value if the value is an EObject and the feature is a containment feature.
	 */
	public void setContainer(InternalEObject owner) {
		if (!initialized) initialize();

		if (value != null && value instanceof InternalEObject && eStructuralFeature instanceof EReference
				&& ((EReference) eStructuralFeature).isContainment()) {
			EContainerRepairControl.setContainer(owner, (InternalEObject) value, eStructuralFeature);
		}
	}

	/** Code copied from FeatureMapUtil.EntryImpl */
	public boolean equals(Object that) {
		if (!initialized) initialize();

		if (this == that) {
			return true;
		} else if (!(that instanceof FeatureMap.Entry)) {
			return false;
		} else {
			FeatureMap.Entry entry = (FeatureMap.Entry) that;
			return entry.getEStructuralFeature() == eStructuralFeature
					&& (value == null ? entry.getValue() == null : value.equals(entry.getValue()));
		}
	}

	/** Code copied from FeatureMapUtil.EntryImpl */
	public int hashCode() {
		/*
		 * Used to create a hashcode which maps all instances of one class to the same hashcode Is required because the normal hashcode
		 * method (see commented out part below) resulted in null-pointer exceptions in hibernate because the content of the entry was
		 * used for determining the hashcode while the object was not initialized from the db
		 */
		return this.getClass().hashCode();
		/*
		 * if (!initialized) initialize();
		 * 
		 * return eStructuralFeature.hashCode() ^ (value == null ? 0 : value.hashCode());
		 */
	}

	/** Code copied from FeatureMapUtil.EntryImpl */
	public String toString() {
		if (!initialized) initialize();

		String prefix = eStructuralFeature.getEContainingClass().getEPackage().getNsPrefix();
		eStructuralFeature.getName();
		return (prefix != null && prefix.length() != 0 ? prefix + ":" + eStructuralFeature.getName() : eStructuralFeature.getName())
				+ "=" + value;
	}
}