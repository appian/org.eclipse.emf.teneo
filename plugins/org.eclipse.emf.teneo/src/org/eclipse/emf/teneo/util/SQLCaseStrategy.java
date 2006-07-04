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
 * $Id: SQLCaseStrategy.java,v 1.2 2006/07/04 21:28:53 mtaal Exp $
 */

package org.eclipse.emf.teneo.util;

/**
 * Implementor of the sql case strategy.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public interface SQLCaseStrategy {

	/** Converts the name to the correct sql case strategy */
	public String convert(String name);
}