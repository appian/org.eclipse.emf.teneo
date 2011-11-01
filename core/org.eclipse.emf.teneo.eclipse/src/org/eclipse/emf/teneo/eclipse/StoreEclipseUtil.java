/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * StoreEclipseUtil.java,v 1.2 2007/02/01 12:35:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.eclipse;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;

/**
 * Convenience util, for example reads the property file and returns the property file.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class StoreEclipseUtil {
	/** Utility method to handle an error */
	public static void handleError(Throwable t, Log log) {
		t.printStackTrace(System.err);
		log.error(t);
		MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Error Occured", t.getMessage());
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public static Properties readPropFile(IStructuredSelection selection) {
		final IFile propFile = (IFile) selection.getFirstElement();
		final String filePath = propFile.getFullPath().toOSString();
		try {
			final InputStream is = propFile.getContents();
			final Properties props = new Properties();
			props.load(is);
			is.close();

			// check some props
			checkProperty(Constants.PROP_NAME, props);
			checkProperty(Constants.PROP_EDITOR_EXTENSTION, Constants.PROP_EDITOR_ID, props);
			return props;
		} catch (IOException e) {
			throw new StoreEclipseException("Exception when reading properties from: " + filePath,
					e);
		} catch (CoreException e) {
			throw new StoreEclipseException("Exception when reading properties from: " + filePath,
					e);
		}
	}

	/** Checks if the passed value is null, if not then an exception is thrown */
	private static void checkProperty(String propName, Properties props) {
		if (props.getProperty(propName) == null) {
			throw new StoreEclipseException("The ehb file does not contain the property: "
					+ propName);
		}
	}

	/** Checks if the passed value is null, if not then an exception is thrown */
	private static void checkProperty(String propName1, String propName2, Properties props) {
		if (props.getProperty(propName1) == null && props.getProperty(propName2) == null) {
			throw new StoreEclipseException("The ehb file must contain one of these properties: "
					+ propName1 + "," + propName2);
		}
	}
}