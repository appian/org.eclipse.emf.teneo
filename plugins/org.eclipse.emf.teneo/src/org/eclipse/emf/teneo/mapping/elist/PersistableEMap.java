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
 *   Douglas Bitting
 *   Martin Taal
 *
 * </copyright>
 *
 * $Id: PersistableEMap.java,v 1.5 2007/02/08 23:14:41 mtaal Exp $
 */
package org.eclipse.emf.teneo.mapping.elist;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;

/**
 * A persistable emap which uses the PersistableEList as its delegate.
 * 
 * @version $Revision: 1.5 $
 */
public abstract class PersistableEMap<K, V> extends EcoreEMap<K, V> implements
		PersistableDelegateList<BasicEMap.Entry<K, V>> {

	/** The logger */
	private static Log log = LogFactory.getLog(PersistableEMap.class);

	/** The logstring */
	protected String logString;

	/** The local copy to the PersistableDelegateList */
	private PersistableEList<BasicEMap.Entry<K, V>> persistableEList = null;

	/** Used for assertion */
	private final int featureID;

	/** The entry eclass */
	private final EClass entryEClass;

	/** Not supported constructor */
	public PersistableEMap(EClass entryEClass, EList<Entry<K, V>> delegateEList) {
		super(entryEClass, Map.Entry.class, delegateEList);
		throw new UnsupportedOperationException(
				"Explicitly passing delegate list is not supported!");
	}

	/** Constructor */
	public PersistableEMap(EClass entryEClass, Class<?> entryClass,
			InternalEObject owner, int featureID) {
		super(entryEClass, Map.Entry.class, owner, featureID);
		this.featureID = featureID;
		this.entryEClass = entryEClass;
		log.debug("Created persistable emap for entry eclass "
				+ entryEClass.getName());
	}

	/** Sets the delegatelist to a persistablelist */
	protected void setDelegatePeristableEList(InternalEObject owner,
			EStructuralFeature feature, List<Entry<K, V>> delegateORMList) {
		assert (feature.getFeatureID() == featureID);
		persistableEList = createPersistableDelegateList(owner, feature,
				delegateORMList);
		delegateEList = persistableEList; // set the super member

		logString = "EMap with entry eclass: " + entryEClass.getName()
				+ " of member " + feature.getName() + " owned by "
				+ owner.getClass().getName() + " with delegate list "
				+ delegateORMList.getClass().getName();

		log.debug("Created emap " + logString);
	}

	/** Needs to be implemented by concrete subclass */
	protected abstract PersistableEList<BasicEMap.Entry<K, V>> createPersistableDelegateList(
			InternalEObject owner, EStructuralFeature feature,
			List<Entry<K, V>> delegateORMList);

	/**
	 * Initializes the {@link #delegateEList}. This implementation illustrates
	 * the precise pattern that is used to delegate a list implementation's
	 * callback methods to the map implementation.
	 */
	public void initializeDelegateEList() {
		delegateEList = null;
	}

	/** Return the delegate list without doing a load */
	public List<? extends BasicEMap.Entry<K, V>> getDelegate() {
		return persistableEList.getDelegate();
	}

	/** Returns true if the elist is loaded */
	public boolean isLoaded() {
		return persistableEList.isLoaded();
	}

	/**
	 * Overridden for access to size member
	 */
	@Override
	protected void ensureEntryDataExists() {
		size = persistableEList.size();
		super.ensureEntryDataExists();
	}

	/**
	 * Overridden because of access to size
	 */
	@Override
	protected void didClear(BasicEList<Entry<K, V>>[] oldEntryData) {
		size = persistableEList.size();
		super.didClear(oldEntryData);
	}

	/**
	 * Overridden because of access to size attribute
	 */
	public int size() {
		size = persistableEList.size();
		return super.size();
	}

	/**
	 * Overridden because of access to size attribute
	 */
	public boolean isEmpty() {
		size = persistableEList.size();
		return super.isEmpty();
	}

	/*
	 * Javadoc copied from interface. Overridden because of access to size
	 * attribute
	 */
	@Override
	public boolean containsKey(Object key) {
		size = persistableEList.size();
		return super.containsKey(key);
	}

	/*
	 * Javadoc copied from interface. Overridden because of access to size
	 * attribute
	 */
	@Override
	public Set<K> keySet() {
		size = persistableEList.size();
		return super.keySet();
	}

	/*
	 * Javadoc copied from interface. Overridden because of access to size
	 * attribute
	 */
	@Override
	public Collection<V> values() {
		size = persistableEList.size();
		return super.values();
	}

	/*
	 * Javadoc copied from interface. Overridden because of access to size
	 * attribute
	 */
	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		size = persistableEList.size();
		return super.entrySet();
	}

	/*
	 * Javadoc copied from interface. Overridden because of access to size
	 * attribute
	 */
	@Override
	public boolean containsValue(Object value) {
		size = persistableEList.size();
		return super.containsValue(value);
	}

	/*
	 * Javadoc copied from interface. Overridden because of access to size
	 * attribute
	 */
	@Override
	public V get(Object key) {
		size = persistableEList.size();
		return super.get(key);
	}

	@Override
	public Map<K, V> map() {
		if (view == null) {
			view = new View<K, V>();
		}
		if (view.map == null) {
			view.map = new PersistableDelegatingMap();
		}

		return view.map;
	}

	/** Used to tag the returned map class and give access to the owner */
	public class PersistableDelegatingMap extends DelegatingMap {

		/** Return my owner */
		public PersistableEMap<K, V> getOwner() {
			return PersistableEMap.this;
		}
	}
}