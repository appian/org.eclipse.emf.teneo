/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: HibernateMcssqlDBAdapter.java,v 1.2 2006/07/23 19:20:57 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.stores.adapters;

import org.eclipse.emf.teneo.test.stores.MssqlJDBCTestDatabaseAdapter;
import org.hibernate.dialect.SQLServerDialect;

/**
 * Overridden to add the hibernate database dialect.
 * 
 * @author <a href="mailto:marchign@fastmail.fm">Davide Marchignoli</a>
 * @version $Revision: 1.2 $
*/

public class HibernateMcssqlDBAdapter extends MssqlJDBCTestDatabaseAdapter implements HibernateTestDBAdapter
{
	/** Return the hibernate dialted */
	public String getDialect() {
		return SQLServerDialect.class.getName();
	}
}