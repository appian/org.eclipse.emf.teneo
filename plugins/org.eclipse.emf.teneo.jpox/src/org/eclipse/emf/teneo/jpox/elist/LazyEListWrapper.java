/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * EListWrapper.java,v 1.10 2007/04/17 15:49:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import java.util.List;

import org.jpox.StateManager;

/**
 * Is an extra lazy elist wrapper, the data is not loaded but all actions are assumed
 * to happen directly in the db.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2008/02/28 07:09:02 $
 */

public class LazyEListWrapper<E> extends EListWrapper<E> {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -6719775217240311479L;

	public LazyEListWrapper(StateManager ownerSM, String fieldName) {
		super(ownerSM, fieldName);
	}

	public LazyEListWrapper(StateManager ownerSM, String fieldName, List<E> list) {
		super(ownerSM, fieldName, list);
	}

	protected LazyEListWrapper(LazyEListWrapper<E> copyFrom) {
		super(copyFrom);
	}

	@Override
	protected synchronized void doLoad() {
		return;
	}
}