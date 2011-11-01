/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008, 2009 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 */

package org.eclipse.emf.teneo.hibernate.mapping.elist;

import java.io.Serializable;

import org.hibernate.mapping.Component;
import org.hibernate.tuple.Instantiator;

/**
 * Instantiates feature map entries which are mapped as components.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class FeatureMapEntryComponentInstantiator implements Instantiator {
	private static final long serialVersionUID = -1219767393020090471L;

	public FeatureMapEntryComponentInstantiator(Component component) {
	}

	public Object instantiate() {
		final HibernateFeatureMapEntry fme = new HibernateFeatureMapEntry();
		return fme;
	}

	public Object instantiate(Serializable id) {
		return instantiate();
	}

	public boolean isInstance(Object object) {
		return HibernateFeatureMapEntry.class.isInstance(object);
	}
}