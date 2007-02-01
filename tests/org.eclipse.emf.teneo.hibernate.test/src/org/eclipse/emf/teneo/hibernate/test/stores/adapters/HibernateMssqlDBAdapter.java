/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: HibernateMssqlDBAdapter.java,v 1.3 2007/02/01 12:36:23 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.stores.adapters;

import org.eclipse.emf.teneo.test.stores.BaseTestDatabaseAdapter;
import org.hibernate.dialect.SQLServerDialect;

/**
 * Overridden to add the hibernate database dialect.
 * 
 * @author <a href="mailto:marchign@fastmail.fm">Davide Marchignoli</a>
 * @version $Revision: 1.3 $
*/

public class HibernateMssqlDBAdapter extends BaseTestDatabaseAdapter implements HibernateTestDBAdapter
{
	/** Return the hibernate dialted */
	public String getDialect() {
		return SQLServerDialect.class.getName();
	}
}