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
package org.eclipse.emf.teneo.eclipselink.common.ui.wizards;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.eclipselink.common.ui.Activator;
import org.eclipse.emf.teneo.eclipselink.common.ui.internal.messages.Messages;
import org.eclipse.emf.teneo.eclipselink.common.ui.preferencepages.IDatabasePreferenceConstants;
import org.eclipse.emf.teneo.eclipselink.common.ui.wizards.pages.AbstractRootObjectAndModelEditorPage;
import org.eclipse.emf.teneo.eclipselink.common.ui.wizards.pages.BasicModelAndDatabaseAccessParametersPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public abstract class AbstractLoadModelFromDatabaseWizard extends Wizard {

	protected BasicModelAndDatabaseAccessParametersPage modelAndDatabaseAccessParametersPage;
	protected AbstractRootObjectAndModelEditorPage rootObjectAndModelEditorPage;

	public AbstractLoadModelFromDatabaseWizard() {
		setWindowTitle(Messages.wizard_loadEMFModelFromDatabase_title);
	}

	@Override
	public void addPages() {
		modelAndDatabaseAccessParametersPage = createModelAndDatabaseAccessParametersPage("Page1"); //$NON-NLS-1$
		modelAndDatabaseAccessParametersPage.setTitle(Messages.page_emfModelAndDatabase_title);
		modelAndDatabaseAccessParametersPage.setDescription(Messages.page_emfModelAndDatabase_description);
		addPage(modelAndDatabaseAccessParametersPage);

		rootObjectAndModelEditorPage = createRootObjectAndModelEditorPage("Page2"); //$NON-NLS-1$
		rootObjectAndModelEditorPage.setTitle(Messages.page_rootObjectAndEMFModelEditor_title);
		rootObjectAndModelEditorPage.setDescription(Messages.page_rootObjectAndEMFModelEditor_description);
		addPage(rootObjectAndModelEditorPage);
	}

	@Override
	public boolean performFinish() {
		// update database settings in user preferences as far as required
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setValue(IDatabasePreferenceConstants.USE_LOGIN_FROM, modelAndDatabaseAccessParametersPage
				.getUseLoginFrom());
		if (IDatabasePreferenceConstants.USE_LOGIN_FROM_USER_PREFERENCES.equals(modelAndDatabaseAccessParametersPage
				.getUseLoginFrom())) {
			store.setValue(IDatabasePreferenceConstants.DATABASE_URL, modelAndDatabaseAccessParametersPage
					.getDatabaseURL());
			store.setValue(IDatabasePreferenceConstants.JDBC_DRIVER, modelAndDatabaseAccessParametersPage
					.getJDBCDriver());
			store.setValue(IDatabasePreferenceConstants.USER_NAME, modelAndDatabaseAccessParametersPage.getUserName());
			store.setValue(IDatabasePreferenceConstants.PASSWORD, modelAndDatabaseAccessParametersPage.getPassword());
		}

		// create database URI for selected root object
		URI uri = createDatabaseURI(modelAndDatabaseAccessParametersPage.getPersistenceUnitName(),
				rootObjectAndModelEditorPage.getRootObject());

		// open editor on new database URI
		IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		try {
			page.openEditor(new URIEditorInput(uri), rootObjectAndModelEditorPage.getEditorId());
		} catch (PartInitException piex) {
			MessageDialog.openError(workbenchWindow.getShell(), getWindowTitle(), piex.getMessage());
			return false;
		}

		return true;
	}

	protected abstract BasicModelAndDatabaseAccessParametersPage createModelAndDatabaseAccessParametersPage(
			String pageName);

	protected abstract AbstractRootObjectAndModelEditorPage createRootObjectAndModelEditorPage(String pageName);

	protected abstract URI createDatabaseURI(String persistenceUnitName, EObject rootObject);
}
