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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.teneo.eclipselink.common.ui.wizards.pages.BasicModelAndDatabaseAccessParametersPage;
import org.eclipse.persistence.internal.jpa.deployment.Archive;
import org.eclipse.persistence.internal.jpa.deployment.PersistenceUnitProcessor;
import org.eclipse.persistence.internal.jpa.deployment.SEPersistenceUnitInfo;

public class EclipseLinkModelAndDatabaseAccessParametersPage extends BasicModelAndDatabaseAccessParametersPage {

  private List<SEPersistenceUnitInfo> persistenceUnits;

  public EclipseLinkModelAndDatabaseAccessParametersPage(String pageName) {
    super(pageName);
  }

  //
  // overrides
  //
  
  @Override
  protected Set<String> getPersistenceUnitNames() {
    Set<String> result = new HashSet<String>();
    for (SEPersistenceUnitInfo persistenceUnit : getPersistenceUnits()) {
      result.add(persistenceUnit.getPersistenceUnitName());
    }
    return result;
  }
  
  @Override
  protected void updateDatabaseLoginFieldsFromPersistenceUnit() {
    String name = persistenceUnitNameField.getText();
    databaseURLField.setText(getPersistenceUnitProperty(name, "eclipselink.jdbc.url"));
    jdbcDriverField.setText(getPersistenceUnitProperty(name, "eclipselink.jdbc.driver"));
    userNameField.setText(getPersistenceUnitProperty(name, "eclipselink.jdbc.user"));
    passwordField.setText(getPersistenceUnitProperty(name, "eclipselink.jdbc.password"));
  }

  //
  // helper methods
  //

  private List<SEPersistenceUnitInfo> getPersistenceUnits() {
    if (persistenceUnits == null) {
      persistenceUnits = new ArrayList<SEPersistenceUnitInfo>();
      ClassLoader classLoader = this.getClass().getClassLoader();
      Set<Archive> archives = PersistenceUnitProcessor.findPersistenceArchives(classLoader);
      for (Archive archive : archives) {
        persistenceUnits.addAll(PersistenceUnitProcessor.getPersistenceUnits(archive, classLoader));
      }
    }
    return persistenceUnits;
  }

  private SEPersistenceUnitInfo getPersistenceUnit(String persistenceUnitName) {
    SEPersistenceUnitInfo result = null;
    for (SEPersistenceUnitInfo persistenceUnit : getPersistenceUnits()) {
      if (persistenceUnit.getPersistenceUnitName().equals(persistenceUnitName)) {
        result = persistenceUnit;
      }
    }
    return result;
  }

  protected String getPersistenceUnitProperty(String persistenceUnitName, String propertyName) {
    String result = "";
    SEPersistenceUnitInfo persistenceUnit = getPersistenceUnit(persistenceUnitName);
    if (persistenceUnit != null) {
      if (persistenceUnit.getProperties().containsKey(propertyName)) {
        result = (String) persistenceUnit.getProperties().get(propertyName);
      }
    }
    return result;
  }
}
