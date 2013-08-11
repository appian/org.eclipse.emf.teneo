/**
 * <copyright> Copyright (c) 2013 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * DynamicAction.java,v 1.4 2007/03/20 23:33:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.auditing;

import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.17 $
 */
public class Bz402727Action extends SimpleLibraryAuditingAction {

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final HibernateTestStore hbStore = (HibernateTestStore) store;
		final SchemaExport schemaExport = new SchemaExport(hbStore.getEmfDataStore()
				.getHibernateConfiguration());
		schemaExport.create(true, false);
		schemaExport.toString();
	}
}