/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: StoreImportXML.java,v 1.1 2006/07/08 15:02:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.eclipse.resourcehandler;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.ResourcesPlugin;
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
 * @version $Revision: 1.1 $
 */

public abstract class StoreImportXML implements IObjectActionDelegate 
{
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
	public void run(IAction action) 
	{		
		try
		{
			final String title;
			if (isXMLImport()) {
				title = "Select one or more XML resources to import from.";
			} else {
				title = "Select one or more XMI resources to import from.";
			}
			
			final ResourceSelectionDialog dialog = 
				new ResourceSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
						ResourcesPlugin.getWorkspace().getRoot(), title);
			dialog.open();
			final Object[] fileObjs = dialog.getResult();

			if (fileObjs == null) return; // nothing selected

			File[] files = new File[fileObjs.length];
			for (int i = 0; i < fileObjs.length; i++) {
				files[i] = (File)fileObjs[i];
			}
			
			final Properties props = StoreEclipseUtil.readPropFile(selection);
			doImport(files, props);
		}
		catch (Exception c)
		{
			StoreEclipseUtil.handleError(c, log);
		}
	}

	/** Imports the files into the store */
	protected abstract void doImport(File[] files, Properties props);
	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selected) 
	{
		if (!(selected instanceof IStructuredSelection)) return;
		
		final IStructuredSelection structSelection = (IStructuredSelection)selected;
		selection = structSelection;
	}
}
