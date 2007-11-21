/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * StoreOpenResource.java,v 1.2 2007/02/01 12:35:18 mtaal Exp $
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
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.eclipse.StoreEclipseException;
import org.eclipse.emf.teneo.eclipse.StoreEclipseUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IFileEditorMapping;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

/**
 * Performs the open resource action based on the information in the property file
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public abstract class StoreOpenResource implements IObjectActionDelegate {
	/** The logger for this class */
	private static Log log = LogFactory.getLog(StoreOpenResource.class);

	/** The selected ehb file */
	protected IStructuredSelection selection = null;

	/**
	 * Constructor for Action1.
	 */
	public StoreOpenResource() {
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
		final IFile propFile = (IFile) selection.getFirstElement();
		try {
			final Properties props = StoreEclipseUtil.readPropFile(selection);
			final WorkspaceJob wj = new LocalJob(propFile, props);
			wj.schedule();
		} catch (Exception e) {
			log.error(e);
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error Occured", e
				.getMessage());
		}
	}

	/** Ensure that the data store is opened */
	protected abstract void openDataStore(Properties props);

	/** Convenience method */
	private String doTrim(String totrim) {
		if (totrim == null) {
			return null;
		}
		return totrim.trim();
	}

	/** Returns the editor id on the basis of the editor id or the extension */
	private String getEditorID(String propID, String propExtension) {
		if (propID != null) {
			return propID;
		}
		final IWorkbench workbench = PlatformUI.getWorkbench();

		IEditorDescriptor editorDesc = workbench.getEditorRegistry().getDefaultEditor(propExtension);
		if (editorDesc == null) {
			IFileEditorMapping[] mappings = workbench.getEditorRegistry().getFileEditorMappings();
			for (IFileEditorMapping map : mappings) {
				// System.err.println(map.getExtension() + "-->" + map.getEditors()[0].getId());
				if (map.getExtension().compareTo(propExtension.toLowerCase()) == 0) {
					editorDesc = map.getEditors()[0];
					break;
				}
			}
		}

		if (editorDesc == null) {
			throw new StoreEclipseException("No editor can be found for extension: " + propExtension);
		}
		return editorDesc.getId();
	}

	/** Creates a dummy file which is used to 'fool' the editor to open a specific rdb resource */
	public IFile getModelFile(IFile ehbFile, String extension) {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(ehbFile.getFullPath().append("hibernate." + extension));
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

	private class LocalJob extends WorkspaceJob {

		private IFile file;
		private Properties props;

		LocalJob(IFile file, Properties props) {
			super("Open resource");
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
			openDataStore(props);

			// now use the editor props to find the correct editor
			final String editorextension = doTrim(props.getProperty(Constants.PROP_EDITOR_EXTENSTION));
			final String editorid = doTrim(props.getProperty(Constants.PROP_EDITOR_ID));

			final String foundEditorID = getEditorID(editorid, editorextension);

			// and open it
			final IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			final IWorkbenchPage page = workbenchWindow.getActivePage();
			page.openEditor(new FileEditorInput(file), foundEditorID);
			return Status.OK_STATUS;
		}
	}
}