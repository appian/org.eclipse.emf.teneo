/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.common.ui;

import org.eclipse.emf.teneo.eclipselink.common.ui.preferencepages.IDatabasePreferenceConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.emf.teneo.eclipselink.common.ui";

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns the database settings which will show up when Preference dialog opens up for the first time.
	 */
	@Override
	protected void initializeDefaultPreferences(IPreferenceStore store) {
		store.setDefault(IDatabasePreferenceConstants.USE_LOGIN_FROM,
				IDatabasePreferenceConstants.USE_LOGIN_FROM_DEFAULT);
		store.setDefault(IDatabasePreferenceConstants.DATABASE_URL, IDatabasePreferenceConstants.DATABASE_URL_DEFAULT);
		store.setDefault(IDatabasePreferenceConstants.JDBC_DRIVER, IDatabasePreferenceConstants.JDBC_DRIVER_DEFAULT);
		store.setDefault(IDatabasePreferenceConstants.USER_NAME, IDatabasePreferenceConstants.USER_NAME_DEFAULT);
		store.setDefault(IDatabasePreferenceConstants.PASSWORD, IDatabasePreferenceConstants.PASSWORD_DEFAULT);
	}
}
