/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * StoreImportXML.java,v 1.2 2007/02/01 12:35:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.eclipse.resourcehandler;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.teneo.eclipse.Messages;
import org.eclipse.emf.teneo.eclipse.StoreEclipseUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;

/**
 * Performs the import xml action
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public abstract class StoreImportXML implements IObjectActionDelegate {
	/** The logger for this class */
	private static Log log = LogFactory.getLog(StoreImportXML.class);

	/** The selected ehb file */
	private IStructuredSelection selection = null;

	/**
	 * Constructor for Action1.
	 */
	public StoreImportXML() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/** Can be overridden */
	protected boolean isXMLImport() {
		return true;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			final String title;
			if (isXMLImport()) {
				title = Messages.getString("teneo.import.xml");
			} else {
				title = Messages.getString("teneo.import.xmi");
			}

			final ResourceSelectionDialog dialog = new ResourceSelectionDialog(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), ResourcesPlugin.getWorkspace().getRoot(), title);
			dialog.open();
			final Object[] fileObjs = dialog.getResult();

			if (fileObjs == null) {
				return; // nothing selected
			}

			IFile[] files = new IFile[fileObjs.length];
			for (int i = 0; i < fileObjs.length; i++) {
				files[i] = (IFile) fileObjs[i];
			}

			final Properties props = StoreEclipseUtil.readPropFile(selection);
			final WorkspaceJob wj = new LocalJob(files, props);
			wj.schedule();
		} catch (Exception c) {
			StoreEclipseUtil.handleError(c, log);
		}
	}

	/** Imports the files into the store */
	protected abstract void doImport(IFile[] files, Properties props);

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selected) {
		if (!(selected instanceof IStructuredSelection)) {
			return;
		}

		final IStructuredSelection structSelection = (IStructuredSelection) selected;
		selection = structSelection;
	}

	private class LocalJob extends WorkspaceJob {

		private IFile[] files;
		private Properties props;

		LocalJob(IFile[] files, Properties props) {
			super(Messages.getString("teneo.import"));
			this.files = files;
			this.props = props;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.WorkspaceJob#runInWorkspace(org.eclipse.core
		 * .runtime.IProgressMonitor)
		 */
		@Override
		public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
			doImport(files, props);
			return Status.OK_STATUS;
		}
	}
}
