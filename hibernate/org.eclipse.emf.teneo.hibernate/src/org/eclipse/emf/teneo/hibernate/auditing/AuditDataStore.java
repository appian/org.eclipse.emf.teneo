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

import java.util.Properties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbContext;
import org.hibernate.SessionFactory;

/**
 * Contains the methods implemented by the datastore to support auditing.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 */
public interface AuditDataStore {
	public HbContext getHbContext();

	public AuditHandler getAuditHandler();

	public SessionFactory getSessionFactory();

	public String toEntityName(EClass eClass);

	public EClass toEClass(String entityName);

	public EPackage.Registry getPackageRegistry();

	public Properties getDataStoreProperties();

	public boolean isAuditing();

	public EPackage[] getEPackages();
}