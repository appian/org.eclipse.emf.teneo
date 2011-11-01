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
 * $Id: EAVInstantiator.java,v 1.1 2009/08/21 10:16:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.io.Serializable;

import org.eclipse.emf.ecore.EObject;
import org.hibernate.tuple.Instantiator;

/**
 * Instantiator for the EAV_EObject root.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class EAVInstantiator implements Instantiator {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 6946442685247491904L;

	/** Constructor */
	public EAVInstantiator() {
	}

	/** Instantiates using EcoreUtil.create() */
	public Object instantiate() {
		throw new UnsupportedOperationException();
	}

	/** Instantiates using EcoreUtil.create() */
	public Object instantiate(Serializable id) {
		throw new UnsupportedOperationException();
	}

	/** Checks using the mapped class or the proxy interface */
	public boolean isInstance(Object object) {
		if (object instanceof EObject) {
			return true;
		}
		return false;
	}
}