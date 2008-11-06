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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.eclipselink.common.ui.wizards.pages.AbstractRootObjectAndModelEditorPage;
import org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkResourceUtil;
import org.eclipse.persistence.config.PersistenceUnitProperties;

public class EclipseLinkRootObjectAndModelEditorPage extends AbstractRootObjectAndModelEditorPage {
  
  public EclipseLinkRootObjectAndModelEditorPage(String pageName) {
    super(pageName);
  }

  //
  // overrides
  //

  @Override
  protected URI createDatabaseURI(String persistenceUnitName, EClass eClass) {
    String query = EclipseLinkResourceUtil.createContentsInstancesOfQuery(eClass);
    return EclipseLinkResourceUtil.createEclipseLinkURI(persistenceUnitName, query);
  }

  @Override
  protected URI createDatabaseURI(String persistenceUnitName, EObject eObject) {
    String query = EclipseLinkResourceUtil.createContentsExampleQuery(eObject);
    return EclipseLinkResourceUtil.createEclipseLinkURI(persistenceUnitName, query);
  }

  @Override
  protected Map<String, Object> getPersistenceUnitProperties() {
    Map<String, Object> result = new HashMap<String, Object>();
    result.put(PersistenceUnitProperties.CLASSLOADER, this.getClass().getClassLoader());
    return result;
  }
  
  @Override
  protected Map<String, Object> getDatabaseLoginOptionsFromPreviousPage() {
    Map<String, Object> result = new HashMap<String, Object>();
    result.put("eclipselink.jdbc.url", getTypedPreviousPage().getDatabaseURL());
    result.put("eclipselink.jdbc.driver", getTypedPreviousPage().getJDBCDriver());
    result.put("eclipselink.jdbc.user", getTypedPreviousPage().getUserName());
    result.put("eclipselink.jdbc.password", getTypedPreviousPage().getPassword());
    return result;
  }
}
