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
package org.eclipse.emf.teneo.eclipselink.ui.wizards.pages;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.spi.PersistenceUnitInfo;

import org.eclipse.emf.teneo.eclipselink.common.ui.wizards.pages.BasicModelAndDatabaseAccessParametersPage;
import org.eclipse.persistence.internal.jpa.deployment.PersistenceUnitProcessor;
import org.eclipse.persistence.jpa.Archive;

public class EclipseLinkModelAndDatabaseAccessParametersPage extends BasicModelAndDatabaseAccessParametersPage {

	private Map<String, PersistenceUnitInfo> persistenceUnits;

	public EclipseLinkModelAndDatabaseAccessParametersPage(String pageName) {
		super(pageName);
	}

	@Override
	protected Set<String> getPersistenceUnitNames() {
		return getPersistenceUnits().keySet();
	}

	@Override
	protected void updateDatabaseLoginFieldsFromPersistenceUnit() {
		String name = persistenceUnitNameField.getText();
		databaseURLField.setText(getPersistenceUnitProperty(name, "eclipselink.jdbc.url")); //$NON-NLS-1$
		jdbcDriverField.setText(getPersistenceUnitProperty(name, "eclipselink.jdbc.driver")); //$NON-NLS-1$
		userNameField.setText(getPersistenceUnitProperty(name, "eclipselink.jdbc.user")); //$NON-NLS-1$
		passwordField.setText(getPersistenceUnitProperty(name, "eclipselink.jdbc.password")); //$NON-NLS-1$
	}

	protected Map<String, PersistenceUnitInfo> getPersistenceUnits() {
		if (persistenceUnits == null) {
			persistenceUnits = new HashMap<String, PersistenceUnitInfo>();
			ClassLoader classLoader = this.getClass().getClassLoader();
			Set<Archive> archives = PersistenceUnitProcessor.findPersistenceArchives(classLoader);
			for (Archive archive : archives) {
				for (PersistenceUnitInfo persistenceUnit : PersistenceUnitProcessor.getPersistenceUnits(archive,
						classLoader)) {
					persistenceUnits.put(persistenceUnit.getPersistenceUnitName(), persistenceUnit);
				}
			}
		}
		return persistenceUnits;
	}

	protected String getPersistenceUnitProperty(String persistenceUnitName, String propertyName) {
		String result = ""; //$NON-NLS-1$
		PersistenceUnitInfo persistenceUnit = getPersistenceUnits().get(persistenceUnitName);
		if (persistenceUnit != null) {
			if (persistenceUnit.getProperties().containsKey(propertyName)) {
				result = (String) persistenceUnit.getProperties().get(propertyName);
			}
		}
		return result;
	}
}
