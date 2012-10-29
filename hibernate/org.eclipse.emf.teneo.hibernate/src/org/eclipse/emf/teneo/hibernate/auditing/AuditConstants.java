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

import org.dom4j.Node;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.hibernate.HbStoreException;
import org.hibernate.EntityMode;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
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
 * Constants used in auditing.
 * 
 * @author <a href="mailto:mkanaley@tibco.com">Mike Kanaley</a>
 */
public class AuditConstants {
	public static final String ANNOTATION_AUDIT_SOURCE = "teneo.auditing";
	public static final String ANNOTATION_AUDIT_ECLASS = "auditEClass";

	private static final long YEAR = 365 * 24 * 3600 * 1000;

	private String AUDIT_COLUMN_PREFIX = "teneo";
	private Long INITIAL_END_TIMESTAMP = System.currentTimeMillis() + 100 * YEAR;

}