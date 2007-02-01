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
 * $Id: RunGenerateJob.java,v 1.4 2007/02/01 12:35:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.eclipse.genxml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.teneo.eclipse.StoreEclipseException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.internal.core.JarPackageFragmentRoot;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.JavaRuntime;

/**
 * Generate a mapping file in a separate java program to use the classpath of the selected projects.
 */
public class RunGenerateJob extends WorkspaceJob implements IJavaLaunchConfigurationConstants {

	/** Standard name of the generation action */
	private static final String CONFIGURATION_NAME = "Elver JDO Generation";

	/** The list of java projects */
	private ArrayList jProjects; // IJavaProject

	/** Array of absolute paths to ecore files which are to be parsed */
	private String[] ecores;

	/** The location to put the result */
	private String targetFileName;

	/** The name of the main class */
	private String mainClass;

	/** The options */
	private HashMap options;

	/**
	 * The constructor.
	 */
	public RunGenerateJob(ArrayList jProjects, String[] ecores, String targetFileName, String mainClass, HashMap options) {
		super("Generate Mapping File");
		this.jProjects = jProjects;
		this.ecores = ecores;
		this.targetFileName = targetFileName;
		this.mainClass = mainClass;
		this.options = options;
	}

	/** Launches a separate java process using the classpaths of the passed projects */

	public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
		// first delete the old generation of the same name
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType type = manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);
		ILaunchConfiguration[] configurations = manager.getLaunchConfigurations(type);
		for (int i = 0; i < configurations.length; i++) {
			if (configurations[i].getName().compareTo(CONFIGURATION_NAME) == 0) {
				configurations[i].delete();
			}
		}
		
		// create a new launch configuration
		ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, CONFIGURATION_NAME);

		workingCopy.setAttribute(ATTR_DEFAULT_CLASSPATH, false);
		workingCopy.setAttribute(ATTR_CLASSPATH, determineClassPath());
		workingCopy.setAttribute(ATTR_MAIN_TYPE_NAME, mainClass);
		workingCopy.setAttribute(ATTR_PROJECT_NAME, ((IJavaProject) jProjects.get(0)).getProject().getName());
		//workingCopy.setAttribute(ATTR_WORKING_DIRECTORY, workingDir);
		workingCopy.setAttribute(ATTR_PROGRAM_ARGUMENTS, getProgramArguments());
		workingCopy.doSave();
		workingCopy.launch(ILaunchManager.RUN_MODE, null);
		return Status.OK_STATUS;
	}
	
	/** Collect the classpath as a list of strings */
	private ArrayList determineClassPath() throws CoreException {
		ArrayList result = new ArrayList();

		for (int i = 0; i < jProjects.size(); i++) {
			IJavaProject jProject = (IJavaProject) jProjects.get(i);
			IRuntimeClasspathEntry outputEntry = JavaRuntime.newDefaultProjectClasspathEntry(jProject);
			result.add(outputEntry.getMemento());
		}

		IPath systemLibsPath = new Path(JavaRuntime.JRE_CONTAINER);
		IRuntimeClasspathEntry systemLibsEntry = JavaRuntime.newRuntimeContainerClasspathEntry(systemLibsPath,
				IRuntimeClasspathEntry.STANDARD_CLASSES);
		result.add(systemLibsEntry.getMemento());

		return result;
	}
	
	/** Determine the classnames of the interfaces */
	private String getEPackageNames() {
		try {
			final ArrayList result = new ArrayList();
			for (int i = 0; i < jProjects.size(); i++) {
				final IJavaProject ijp = (IJavaProject)jProjects.get(i);
				for (int j = 0; j < ijp.getPackageFragmentRoots().length; j++) {
					IPackageFragmentRoot ipf = ijp.getPackageFragmentRoots()[j];
					if (ipf instanceof JarPackageFragmentRoot) continue;
					for (int c = 0; c < ipf.getChildren().length; c++) {
						walk(ipf.getChildren()[c], "", result);
					}
				}
			}
			
			StringBuffer resultStr = new StringBuffer();
			for (int i = 0; i < result.size(); i++) {
				final String epackage = (String)result.get(i);
				if (i > 0) resultStr.append(",");
				resultStr.append(epackage);
			}
			return resultStr.toString();
		} catch (Exception e) {
			throw new StoreEclipseException("Exception while looking for epackages in projects " + e.getMessage(), e);
		}
		
	}

	/** Walk the java element structure looking for EPackage sources */
	private void walk(IJavaElement ije, String pName, ArrayList result) throws Exception {
		if (ije instanceof JarPackageFragmentRoot || ije instanceof JarPackageFragmentRoot) return;
		if (!(ije instanceof PackageFragment)) return;

		final PackageFragment pf = (PackageFragment)ije;
		final String packageName = pName + (pName.length() > 0 ? "."  : "") + pf.getElementName();
		for (int c = 0; c < pf.getChildren().length; c++) {
			final IJavaElement child = pf.getChildren()[c];
			if (child instanceof PackageFragment) {
				walk(child, packageName, result);
			} else if (child instanceof ICompilationUnit){
				// a source, check if it implements an EPackage
				// TODO make this more robust for other packages which are also EPackages
				final ICompilationUnit icu = (ICompilationUnit)child;
				final String[] types = 	icu.getTypes()[0].getSuperInterfaceNames();
				for (int i = 0; i < types.length; i++) {
					if (types[i].compareTo("EPackage") == 0) {
						result.add(packageName + "." + icu.getTypes()[0].getElementName());
						return;
					}
				}
			}
		}
	}

	/** Returns the program arguments as a string */
	private String getProgramArguments() {
		StringBuffer args = new StringBuffer();
		append(args, targetFileName);
		Iterator keys = options.keySet().iterator();
		while (keys.hasNext()) {
			String key = (String) keys.next();
			String value = (String) options.get(key);
			append(args, "+" + key + "," + value);
		}

		for (int i = 0; i < ecores.length; i++) {
			append(args, ecores[i]);
		}
		
		append(args, "-" + getEPackageNames());
		
		return args.toString();
	}

	/** Appends a program argument taking into account " and space */
	private void append(StringBuffer buffer, String value) {
		buffer.append("\"" + value + "\" ");
	}
}
