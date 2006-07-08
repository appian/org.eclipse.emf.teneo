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
 * $Id: JPOXSimpleAnyTypeImpl.java,v 1.1 2006/07/08 22:04:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.emf.mapping;

import org.eclipse.emf.ecore.xml.type.impl.SimpleAnyTypeImpl;

/**
 * Extends of the EMF SimpleTypeAnyTypeImpl. Is actually required to get to the protected constructor in the super
 * class.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/08 22:04:29 $
 */

public class JPOXSimpleAnyTypeImpl extends SimpleAnyTypeImpl {
	/** Constructor */
	public JPOXSimpleAnyTypeImpl() {
	}
}