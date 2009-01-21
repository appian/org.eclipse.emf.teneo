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
package org.eclipse.emf.teneo.eclipselink.ui.wizards;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.eclipselink.common.ui.wizards.AbstractLoadModelFromDatabaseWizard;
import org.eclipse.emf.teneo.eclipselink.common.ui.wizards.pages.AbstractRootObjectAndModelEditorPage;
import org.eclipse.emf.teneo.eclipselink.common.ui.wizards.pages.BasicModelAndDatabaseAccessParametersPage;
import org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkResourceUtil;
import org.eclipse.emf.teneo.eclipselink.ui.wizards.pages.EclipseLinkModelAndDatabaseAccessParametersPage;
import org.eclipse.emf.teneo.eclipselink.ui.wizards.pages.EclipseLinkRootObjectAndModelEditorPage;

public class EclipseLinkLoadModelFromDatabaseWizard extends AbstractLoadModelFromDatabaseWizard {

	@Override
	protected BasicModelAndDatabaseAccessParametersPage createModelAndDatabaseAccessParametersPage(String pageName) {
		return new EclipseLinkModelAndDatabaseAccessParametersPage(pageName);
	}

	@Override
	protected AbstractRootObjectAndModelEditorPage createRootObjectAndModelEditorPage(String pageName) {
		return new EclipseLinkRootObjectAndModelEditorPage(pageName);
	}

	@Override
	protected URI createDatabaseURI(String persistenceUnitName, EObject rootObject) {
		String query = EclipseLinkResourceUtil.createContentsExampleQuery(rootObject);
		return EclipseLinkResourceUtil.createEclipseLinkURI(persistenceUnitName, query);
	}
}
