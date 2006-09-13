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
 * $Id: JPOXEList.java,v 1.1 2006/09/13 10:39:52 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import org.eclipse.emf.teneo.jpox.resource.Detacher;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;

/**
 * Identifies an EList which is implemented for specific EMF JPOX handling.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/09/13 10:39:52 $
 */

public interface JPOXEList extends PersistableDelegateList {
	/** Detach the contents of the EList */
	public void detach(Detacher detacher);

	/** Detach the elist itself, means nullify statemanager */
	public void detachSelf();
}