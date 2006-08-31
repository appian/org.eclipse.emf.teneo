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
 * $Id: EClassResolver.java,v 1.1 2006/08/31 22:46:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import org.eclipse.emf.ecore.EClass;


/**
 * Finds an eclass using a certain string
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public interface EClassResolver {
	
	/** Return an eclass, returns null if not found */
	EClass getEClass(String name);
}
