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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: TestConfigurations.java,v 1.5 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.conf;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.test.Utils;
import org.eclipse.emf.teneo.test.stores.TestDBAdapters;
import org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter;

/**
 * Manages multiple configurations
 * 
 * @author Davide Marchignoli
 * @author Martin Taal
 * @version $Revision: 1.5 $
 */
public class TestConfigurations {

	/** Map with configs */
	private Map cfgs = new LinkedHashMap();

	/** The list of read database adapters */
	private final TestDBAdapters dbAdapters;

	/** Constructor */
	public TestConfigurations(TestDBAdapters dbAdapters) {
		this.dbAdapters = dbAdapters;
	}

	/**
	 * Add the given configuration.
	 * 
	 * @throws NullPointerException
	 *             if the argument is null
	 * @throws IllegalArgumentException
	 *             if a configuration with the same name is already present
	 */
	public void addConfiguration(TestConfiguration cfg) {
		if (cfgs.containsKey(cfg.getName())) {
			throw new IllegalArgumentException("Duplicate configuration " + cfg.getName());
		}
		cfgs.put(cfg.getName(), cfg);
	}

	/**
	 * Add the configurations defined in a set of properties
	 * 
	 * @param props
	 */
	public void addConfigurations(Properties props) {
		Map hProps = Utils.hiearchizeProps(props);

		for (Iterator pNames = hProps.keySet().iterator(); pNames.hasNext();) {
			String cfgName = (String) pNames.next();
			Properties cfgValues = (Properties) hProps.get(cfgName);

			TestDatabaseAdapter dbAdapter = dbAdapters.get(((String) cfgValues.get("dbadapter")).trim());
			InheritanceType mapStrategy = parseStrategy((String) cfgValues.get("mapstrategy"));
			boolean optimistic = Boolean.valueOf((String) cfgValues.get("optimistic")).booleanValue();
			boolean ejb3 =
					cfgValues.get("ejb3") != null ? Boolean.valueOf((String) cfgValues.get("ejb3")).booleanValue()
							: false;
			boolean xml =
					cfgValues.get("xml") != null ? Boolean.valueOf((String) cfgValues.get("xml")).booleanValue()
							: false;
			addConfiguration(new TestConfiguration(cfgName, dbAdapter, mapStrategy, optimistic, ejb3, xml));
		}
	}

	/** Add configuration */
	public void addConfigurations(InputStream propertiesStream) throws IOException {
		Properties props = new Properties();
		props.load(propertiesStream);
		addConfigurations(props);
	}

	/** Determines the strategy */
	private InheritanceType parseStrategy(String s) {
		InheritanceType inheritanceType = InheritanceType.get(s);
		if (inheritanceType == null) {
			throw new IllegalArgumentException("Unknown mapping strategy " + s);
		}
		return inheritanceType;
	}

	/** Returns all configurations */
	public Collection getConfigurations() {
		return cfgs.values();
	}

	/** Returns the names of the configurations */
	public Set getConfigurationNames() {
		return cfgs.keySet();
	}

	/** Returns a specific configuration */
	public TestConfiguration getConfiguration(String name) {
		return (TestConfiguration) cfgs.get(name);
	}
}
