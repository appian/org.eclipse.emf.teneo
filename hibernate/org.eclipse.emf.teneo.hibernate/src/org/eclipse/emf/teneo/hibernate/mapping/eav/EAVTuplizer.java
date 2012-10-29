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
 * $Id: EAVTuplizer.java,v 1.3 2010/04/02 22:10:11 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.bytecode.instrumentation.spi.LazyPropertyInitializer;
import org.hibernate.collection.internal.PersistentList;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.tuple.Instantiator;
import org.hibernate.tuple.entity.EntityMetamodel;
import org.hibernate.tuple.entity.PojoEntityTuplizer;

/**
 * Tuplizer created to work around this issue:
 * http://opensource.atlassian.com/projects/hibernate/browse/HHH-4078
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
	public String determineConcreteSubclassEntityName(Object entityInstance,
			SessionFactoryImplementor factory) {
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
			throw new HibernateException("Unable to resolve entity name from Class ["
					+ concreteEntityClass.getName() + "]" + " expected instance/subclass of ["
					+ getEntityName() + "]");
		}
	}

	// overridden to make sure that the owner is set earlier
	public void setPropertyValues(Object entity, Object[] values) throws HibernateException {
		boolean setAll = !getEntityMetamodel().hasLazyProperties();

		for (int j = 0; j < getEntityMetamodel().getPropertySpan(); j++) {
			if (setAll || values[j] != LazyPropertyInitializer.UNFETCHED_PROPERTY) {
				if (values[j] instanceof PersistentList) {
					final PersistentList persistentList = (PersistentList) values[j];
					if (persistentList.getOwner() == null) {
						persistentList.setOwner(entity);
					}
				}
				setters[j].set(entity, values[j], getFactory());
			}
		}
	}

	@Override
	protected Instantiator buildInstantiator(PersistentClass persistentClass) {
		return new EAVValueInstantiator(persistentClass, null);
	}
}