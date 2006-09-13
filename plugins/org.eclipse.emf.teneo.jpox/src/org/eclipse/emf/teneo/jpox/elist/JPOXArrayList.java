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
 * $Id: JPOXArrayList.java,v 1.1 2006/09/13 10:39:52 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import org.jpox.StateManager;
import org.jpox.sco.ArrayList;

/**
 * Subclass of the jpox arraylist to get to specific protected fields (nl. isCacheLoaded). Is used internally by the
 * EListWrapper
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/09/13 10:39:52 $
 */

class JPOXArrayList extends ArrayList {
	/**
	 * Constructor, using the StateManager of the "owner" and the field name.
	 * 
	 * @param ownerSM
	 *            The owner StateManager
	 * @param fieldName
	 *            The name of the field of the SCO.
	 */
	JPOXArrayList(StateManager ownerSM, String fieldName) {
		super(ownerSM, fieldName);
	}

	/** Returns is cache loaded */
	public boolean isLoaded() {
		return isCacheLoaded;
	}

}