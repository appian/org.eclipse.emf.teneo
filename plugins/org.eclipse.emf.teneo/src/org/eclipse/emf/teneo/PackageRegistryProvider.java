/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: PackageRegistryProvider.java,v 1.1 2009/07/22 21:08:44 mtaal Exp $
 */

package org.eclipse.emf.teneo;

import org.eclipse.emf.ecore.EPackage;

/**
 * Provides the package registry to the rest of Teneo. As a default the global Package.Registry is used. There are two
 * ways to override the behavior in this class by setting a Package.Registry explicitly. Or by replacing the singleton
 * instance with your own implementation.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class PackageRegistryProvider {

	private static PackageRegistryProvider instance;

	public static PackageRegistryProvider getInstance() {
		if (instance == null) {
			instance = new PackageRegistryProvider();
		}
		return instance;
	}

	public static void setInstance(PackageRegistryProvider instance) {
		PackageRegistryProvider.instance = instance;
	}

	private EPackage.Registry packageRegistry = EPackage.Registry.INSTANCE;

	public EPackage.Registry getPackageRegistry() {
		return packageRegistry;
	}

	public void setPackageRegistry(EPackage.Registry packageRegistry) {
		this.packageRegistry = packageRegistry;
	}

}