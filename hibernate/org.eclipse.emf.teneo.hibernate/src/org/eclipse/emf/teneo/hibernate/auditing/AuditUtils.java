/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AnyEObjectType.java,v 1.7 2010/11/12 09:33:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.auditing;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.dom4j.Node;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.hibernate.HbStoreException;
import org.hibernate.EntityMode;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.Session;
import org.hibernate.engine.internal.ForeignKeys;
import org.hibernate.engine.spi.CascadeStyle;
import org.hibernate.engine.spi.Mapping;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.metamodel.relational.Size;
import org.hibernate.persister.entity.Joinable;
import org.hibernate.type.AbstractType;
import org.hibernate.type.AssociationType;
import org.hibernate.type.CompositeType;
import org.hibernate.type.ForeignKeyDirection;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

/**
 * Auditing utilities.
 * 
 * @author <a href="mailto:mkanaley@tibco.com">Mike Kanaley</a>
 */
public class AuditUtils {

	private static final String ID_SEPARATOR = ";";

	private static AuditUtils instance = new AuditUtils();

	public static AuditUtils getInstance() {
		return instance;
	}

	public static void setInstance(AuditUtils instance) {
		AuditUtils.instance = instance;
	}

	/** Constructor by id */
	private final ConcurrentHashMap<String, Constructor<?>> constructors = new ConcurrentHashMap<String, Constructor<?>>();

	public String idToString(Session session, Object value) {
		final String entityName = ((SessionImplementor) session).bestGuessEntityName(value);
		final Serializable id = ForeignKeys.getEntityIdentifierIfNotUnsaved(entityName, value,
				(SessionImplementor) session);
		return entityName + ID_SEPARATOR + id.getClass().getName() + ID_SEPARATOR + id;
	}

	public AuditReference fromString(String idString) {
		final String[] parts = idString.split(ID_SEPARATOR);
		final AuditReference auditReference = new AuditReference();
		auditReference.setEntityName(parts[0]);
		auditReference.setId(getId(parts[2], parts[1]));
		return auditReference;
	}

	/** Creates an id object of the correct type */
	private Serializable getId(String idStr, String idType) {
		try {
			Constructor<?> constructor = constructors.get(idType);
			if (constructor == null) {
				final Class<?> idClass = this.getClass().getClassLoader().loadClass(idType);
				constructor = idClass.getConstructor(new Class[] { String.class });
				constructors.put(idType, constructor);
			}
			return (Serializable) constructor.newInstance(new Object[] { idStr });
		} catch (Exception e) {
			throw new HbStoreException("Could not create id type for " + idType + " and id " + idStr, e);
		}
	}
}