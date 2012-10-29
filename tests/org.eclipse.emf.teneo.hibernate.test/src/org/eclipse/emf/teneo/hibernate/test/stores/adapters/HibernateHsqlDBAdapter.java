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
 * $Id: HibernateHsqlDBAdapter.java,v 1.5 2008/05/27 07:42:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.stores.adapters;

import org.eclipse.emf.teneo.test.stores.HsqldbTestDatabaseAdapter;
import org.hibernate.dialect.HSQLDialect;

/**
 * Overridden to add the hibernate database dialect.
 * 
 * @version $Revision: 1.5 $
 */

public class HibernateHsqlDBAdapter extends HsqldbTestDatabaseAdapter implements
		HibernateTestDBAdapter {
	/** Return the hibernate dialted */
	public String getDialect() {
		return HSQLDialect.class.getName();
	}
}