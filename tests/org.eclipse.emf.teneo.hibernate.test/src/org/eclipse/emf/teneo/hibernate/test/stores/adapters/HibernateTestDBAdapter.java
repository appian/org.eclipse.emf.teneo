package org.eclipse.emf.teneo.hibernate.test.stores.adapters;

import org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter;

public interface HibernateTestDBAdapter extends TestDatabaseAdapter {
	
	/** The getDialect method */
	public String getDialect();
}