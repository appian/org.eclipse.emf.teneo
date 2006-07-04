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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ContextClassLoaderStrategy.java,v 1.1 2006/07/04 21:04:04 mtaal Exp $
 */

package org.eclipse.emf.teneo.classloader;

/**
 * Returns the context class loader.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class ContextClassLoaderStrategy implements ClassLoaderStrategy {
	/**
	 * Returns the context class loader
	 */
	public ClassLoader getClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}

}
