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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: HibernateMysqlDBAdapter.java,v 1.6 2008/05/27 07:42:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.stores.adapters;

import org.eclipse.emf.teneo.test.stores.BaseTestDatabaseAdapter;
import org.hibernate.dialect.MySQLInnoDBDialect;

/**
 * Overridden to add the hibernate database dialect.
 * 
 * @author <a href="mailto:marchign@fastmail.fm">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class HibernateMysqlDBAdapter extends BaseTestDatabaseAdapter implements HibernateTestDBAdapter {
	/** Return the hibernate dialted */
	public String getDialect() {
		return MySQLInnoDBDialect.class.getName();
	}
}