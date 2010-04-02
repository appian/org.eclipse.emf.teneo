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
 * $Id: EAVValueInstantiator.java,v 1.1 2010/04/02 15:24:11 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.bytecode.ReflectionOptimizer;
import org.hibernate.mapping.Component;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.tuple.PojoInstantiator;

/**
 * Instantiator for the EAV value objects, sets the datastore in the object.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class EAVValueInstantiator extends PojoInstantiator {

	private static final long serialVersionUID = 6946442685247491904L;

	private HbDataStore hbDataStore;
	
	public EAVValueInstantiator(Component component, ReflectionOptimizer.InstantiationOptimizer optimizer) {
		super(component, optimizer);
		hbDataStore = HbHelper.INSTANCE.getDataStore(component);
	}

	public EAVValueInstantiator(PersistentClass persistentClass, ReflectionOptimizer.InstantiationOptimizer optimizer) {
		super(persistentClass, optimizer);
		hbDataStore = HbHelper.INSTANCE.getDataStore(persistentClass);
	}
	
	public Object instantiate() {
		final Object object = super.instantiate();
		if (object instanceof EAVValueHolder) {
			final EAVValueHolder valueHolder = (EAVValueHolder)object;
			valueHolder.setHbDataStore(hbDataStore);
		}
		return object;
	}

}