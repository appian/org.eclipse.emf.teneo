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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EModelResolver.java,v 1.9 2009/03/30 07:53:05 mtaal Exp $
 */

package org.eclipse.emf.teneo.ecore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.DataStore;
import org.eclipse.emf.teneo.ERuntime;

/**
 * The EModelResolver allows pluggable access to the underlying ecore model. It maps from
 * eclass/efeature names to java member names or to real eclass names. This default implementation
 * only returns null.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public abstract class EModelResolver {

	/** The default instance of an EcoreResolver */
	private static EModelResolver instance = null;

	/** Return the current ecore resolver */
	public static EModelResolver instance() {
		if (instance == null) {
			instance = ERuntime.INSTANCE;
		}
		return instance;
	}

	/** Set an EcoreResolver */
	public static void setInstance(EModelResolver modelResolver) {
		instance = modelResolver;
	}

	private Map<EPackage, List<DataStore>> ePackageRegistration = new HashMap<EPackage, List<DataStore>>();
	
	/** Clear all internal datastructures */
	public abstract void clear();

	/**
	 * @return the EClass for a java class, if not found then the superclass of the javaclass is
	 *         tried
	 */
	public abstract EClass getEClass(Class<?> javaClass);

	/** Is the epackage registered */
	public abstract boolean isRegistered(EPackage epackage);

	/** Register the epackages */
	public abstract void register(EPackage[] epacks);

	/** Register that a set of epackages is owned by a datastore */
	public synchronized void registerOwnerShip(DataStore dataStore, EPackage[] epacks) {	
		for (EPackage ePackage : epacks) {
			List<DataStore> stores = ePackageRegistration.get(ePackage);
			if (stores == null) {
				stores = new ArrayList<DataStore>();
				ePackageRegistration.put(ePackage, stores);
			}
			if (!stores.contains(dataStore)) {
				stores.add(dataStore);
			}
		}
	}
	
	/** Unregister an epackage */
	public synchronized void unregisterOwnerShip(DataStore dataStore, EPackage[] epacks) {
		final List<EPackage> toRemove = new ArrayList<EPackage>();
		for (EPackage ePackage : epacks) {
			List<DataStore> stores = ePackageRegistration.get(ePackage);
			if (stores != null) {
				stores.remove(dataStore);
				if (stores.isEmpty()) {
					ePackageRegistration.remove(ePackage);
					toRemove.add(ePackage);
				}
			}
		}
		removeEPackages(toRemove);
	}
	
	/** Remove an epackage from the internal lists */
	protected void removeEPackages(List<EPackage> ePackages) {
		
	}
	
	/** @return all java classes and interfaces */
	public abstract List<Class<?>> getAllClassesAndInterfaces();

	/** @return the java implementation class for an EClass */
	public abstract Class<?> getJavaClass(EClassifier eclassifier);

	/** @return the java interface class for an EClass */
	public abstract Class<?> getJavaInterfaceClass(EClass eclass);

	/** Returns true if the passed EClass has a javaClass representation. */
	public abstract boolean hasImplementationClass(EClassifier eclassifier);

	/** Returns the currently registered epackages */
	public abstract EPackage[] getEPackages();

	/** Returns null */
	public abstract Object create(EClass eclass);

	/** Returns a java instance of an EClass defined by name */
	public Object create(EPackage epackage, String eclassName) {
		final EClass eclass = (EClass) epackage.getEClassifier(eclassName);
		if (eclass == null) {
			throw new IllegalArgumentException("No EClass " + eclassName + " found in epackage " + epackage.getName());
		}
		return create(eclass);
	}

	/**
	 * Returns a java instance of an EClass defined by name, all epackages are searched for this
	 * eclass.
	 */
	public Object create(String eclassName) {
		for (EPackage epackage : getEPackages()) {
			final EClass eclass = (EClass) epackage.getEClassifier(eclassName);
			if (eclass != null) {
				return create(eclass);
			}
		}
		throw new IllegalArgumentException("No EClass " + eclassName + " found.");
	}
}