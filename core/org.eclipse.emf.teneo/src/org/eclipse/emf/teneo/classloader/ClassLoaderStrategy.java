/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
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
 * $Id: ClassLoaderStrategy.java,v 1.6 2009/03/30 06:41:00 mtaal Exp $
 */

package org.eclipse.emf.teneo.classloader;

/**
 * Interface for classes which determine which classloader to use.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public interface ClassLoaderStrategy {
	/**
	 * Return the classloader
	 */
	public ClassLoader getClassLoader();
}
