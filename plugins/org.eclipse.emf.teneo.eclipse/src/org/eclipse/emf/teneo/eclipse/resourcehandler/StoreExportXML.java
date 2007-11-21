/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: StoreExportXML.java,v 1.3 2007/11/21 14:31:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.eclipse.resourcehandler;

import java.io.ByteArrayInputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.teneo.eclipse.StoreEclipseUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerGenerator;
import org.eclipse.ui.dialogs.SaveAsDialog;

/**
 * Generic action class for exporting xml from a resource file.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public abstract class StoreExportXML implements IObjectActionDelegate {
	/** The logger for this class */
	private static Log log = LogFactory.getLog(StoreExportXML.class);

	/** The selected ehb file */
	private IStructuredSelection selection = null;

	/**
	 * Constructor for Action1.
	 */
	public StoreExportXML() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			final SaveAsDialog saDialog =
					new ExportSaveAsDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			saDialog.open();
			final IPath path = saDialog.getResult();

			if (path == null) {
				return; // nothing selected
			}

			// create the path
			final IPath containerPath = path.removeLastSegments(1);
			final ContainerGenerator cg = new ContainerGenerator(containerPath);
			IWorkspaceRunnable operation = new IWorkspaceRunnable() {
				public void run(IProgressMonitor monitor) throws CoreException {
					cg.generateContainer(null);
				}
			};
			ResourcesPlugin.getWorkspace().run(operation, null);

			// get the file
			final IFile destFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			final Properties props = StoreEclipseUtil.readPropFile(selection);

			final WorkspaceJob wj = new LocalJob(destFile, props);
			wj.schedule();
		} catch (CoreException c) {
			StoreEclipseUtil.handleError(c, log);
		}
	}

	/** Does the real export */
	protected abstract byte[] doExport(Properties props);

	/** Can be overridden */
	protected boolean isXMLExport() {
		return true;
	}

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

	/** Extends Save As dialog to add some specific export titles */
	private class ExportSaveAsDialog extends SaveAsDialog {
		/**
		 * Creates a new Save As dialog for no specific file.
		 * 
		 * @param parentShell
		 *            the parent shell
		 */
		public ExportSaveAsDialog(Shell parentShell) {
			super(parentShell);
		}

		/*
		 * (non-Javadoc) Method declared in Window.
		 */
		@Override
		protected Control createContents(Composite parent) {
			Control contents = super.createContents(parent);
			if (isXMLExport()) {
				setTitle("Export the contents of the datastore to XML");
			} else {
				setTitle("Export the contents of the datastore to XMI");
			}
			setMessage("Select a parent location and enter a file name");
			return contents;
		}
	}

	private class LocalJob extends WorkspaceJob {

		private IFile file;
		private Properties props;

		LocalJob(IFile file, Properties props) {
			super("Import");
			this.file = file;
			this.props = props;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.WorkspaceJob#runInWorkspace(org.eclipse.core.runtime.IProgressMonitor)
		 */
		@Override
		public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {

			final byte[] content = doExport(props);

			IWorkspaceRunnable createOperation = new IWorkspaceRunnable() {
				public void run(IProgressMonitor monitor) throws CoreException {

					// delete the file if it is present
					// first set some attrs to make it possible to delete
					final ResourceAttributes attrs = new ResourceAttributes();
					attrs.setArchive(false);
					attrs.setReadOnly(false);
					if (file.exists()) {
						file.setResourceAttributes(attrs);
						file.delete(true, null);
					}
					file.create(new ByteArrayInputStream(content), true, null);
				}
			};

			ResourcesPlugin.getWorkspace().run(createOperation, null);
			return Status.OK_STATUS;
		}
	}

}
