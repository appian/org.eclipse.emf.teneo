/**
 * <copyright> Copyright (c) 2013 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DynamicAction.java,v 1.4 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.auditing;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.17 $
 */
public class Bz398156Action extends SimpleLibraryAuditingAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties ()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = super.getExtraConfigurationProperties();
		// props.put(PersistenceOptions.AUDITING_DB_SCHEMA, "dbschema");
		props.put(PersistenceOptions.AUDITING_ENTITY_POSTFIX, "");
		props.put(PersistenceOptions.AUDITING_ENTITY_PREFIX, "audit_");
		return props;
	}

	protected String getAuditEntityName(String eClassName) {
		return "audit_" + eClassName;
	}

}