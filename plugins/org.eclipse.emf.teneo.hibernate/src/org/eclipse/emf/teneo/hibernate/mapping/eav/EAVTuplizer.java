/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
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
 * $Id: EAVTuplizer.java,v 1.1 2009/08/20 15:59:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionFactoryImplementor;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.tuple.entity.EntityMetamodel;
import org.hibernate.tuple.entity.PojoEntityTuplizer;

/**
 * Tuplizer created to work around this issue: http://opensource.atlassian.com/projects/hibernate/browse/HHH-4078
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */

public class EAVTuplizer extends PojoEntityTuplizer {

	private PersistentClass persistentClass;

	public EAVTuplizer(EntityMetamodel entityMetamodel, PersistentClass mappedEntity) {
		super(entityMetamodel, mappedEntity);
		persistentClass = mappedEntity;
	}

	/**
	 * {@inheritDoc}
	 */
	public String determineConcreteSubclassEntityName(Object entityInstance, SessionFactoryImplementor factory) {
		final Class<?> concreteEntityClass = entityInstance.getClass();
		if (concreteEntityClass == getMappedClass()) {
			return getEntityName();
		} else {
			final Iterator<?> iter = persistentClass.getSubclassIterator();
			while (iter.hasNext()) {
				final PersistentClass pc = (PersistentClass) iter.next();
				if (pc.getMappedClass() == concreteEntityClass) {
					return pc.getEntityName();
				}
			}
			throw new HibernateException("Unable to resolve entity name from Class [" + concreteEntityClass.getName()
					+ "]" + " expected instance/subclass of [" + getEntityName() + "]");
		}
	}
}