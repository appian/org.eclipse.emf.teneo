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
 *   Martin Taal
 * </copyright>
 *
 * $Id: TeneoInternalEObject.java,v 1.1 2008/02/28 07:08:24 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping;

import org.eclipse.emf.ecore.InternalEObject;

/**
 * This interface ensures that the cglib proxyfactory does not encounter a security exception
 * because the EMF InternalEObject is signed with a different signature.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public interface TeneoInternalEObject extends InternalEObject {
}