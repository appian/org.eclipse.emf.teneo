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
package org.eclipse.emf.teneo.eclipselink.ui.actions;

import org.eclipse.emf.teneo.eclipselink.ui.wizards.EclipseLinkLoadModelFromDatabaseWizard;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;

public class EclipseLinkLoadModelFromDatabaseAction implements
		IWorkbenchWindowActionDelegate {

	public void init(IWorkbenchWindow window) {
		// do nothing
	}

	public void run(IAction action) {
		// create the wizard
		IWizard wizard = new EclipseLinkLoadModelFromDatabaseWizard();

		// create the wizard dialog
		WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell(), wizard);

		// open the wizard dialog
		dialog.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// do nothing
	}

	public void dispose() {
		// do nothing
	}
}
