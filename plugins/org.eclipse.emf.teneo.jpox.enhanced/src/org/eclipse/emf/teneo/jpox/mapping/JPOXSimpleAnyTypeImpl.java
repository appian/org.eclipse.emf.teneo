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
 * $Id: JPOXSimpleAnyTypeImpl.java,v 1.2 2007/02/01 12:35:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapping;

import org.eclipse.emf.ecore.xml.type.impl.SimpleAnyTypeImpl;

/**
 * Extends of the EMF SimpleTypeAnyTypeImpl. Is actually required to get to the protected constructor in the super
 * class.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2007/02/01 12:35:16 $
 */

public class JPOXSimpleAnyTypeImpl extends SimpleAnyTypeImpl {
	/** Constructor */
	public JPOXSimpleAnyTypeImpl() {
	}
}