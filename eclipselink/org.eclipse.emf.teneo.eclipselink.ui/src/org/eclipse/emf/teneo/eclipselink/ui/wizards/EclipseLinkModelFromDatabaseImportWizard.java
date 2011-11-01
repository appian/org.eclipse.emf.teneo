package org.eclipse.emf.teneo.eclipselink.ui.wizards;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.eclipselink.common.ui.wizards.AbstractLoadModelFromDatabaseWizard;
import org.eclipse.emf.teneo.eclipselink.common.ui.wizards.pages.AbstractRootObjectAndModelEditorPage;
import org.eclipse.emf.teneo.eclipselink.common.ui.wizards.pages.BasicModelAndDatabaseAccessParametersPage;
import org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkURIUtil;
import org.eclipse.emf.teneo.eclipselink.ui.wizards.pages.EclipseLinkModelAndDatabaseAccessParametersPage;
import org.eclipse.emf.teneo.eclipselink.ui.wizards.pages.EclipseLinkRootObjectAndModelEditorPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

public class EclipseLinkModelFromDatabaseImportWizard extends AbstractLoadModelFromDatabaseWizard implements
		IImportWizard {

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// nothing to do
	}

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
		String query = EclipseLinkURIUtil.createContentsExampleQuery(rootObject);
		return EclipseLinkURIUtil.createEclipseLinkURI(persistenceUnitName, query);
	}
}
