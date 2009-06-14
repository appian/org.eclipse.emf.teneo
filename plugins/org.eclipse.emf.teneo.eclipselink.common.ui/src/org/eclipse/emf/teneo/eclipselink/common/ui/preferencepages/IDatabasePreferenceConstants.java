/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.common.ui.preferencepages;

public interface IDatabasePreferenceConstants {

	String USE_LOGIN_FROM = "USE_LOGIN_FROM"; //$NON-NLS-1$
	String USE_LOGIN_FROM_PERSISTENCE_UNIT = "from_persistence_unit"; //$NON-NLS-1$
	String USE_LOGIN_FROM_USER_PREFERENCES = "from_user_preferences"; //$NON-NLS-1$
	String USE_LOGIN_FROM_DEFAULT = USE_LOGIN_FROM_PERSISTENCE_UNIT;

	String DATABASE_URL = "DATABASE_URL"; //$NON-NLS-1$
	String DATABASE_URL_DEFAULT = "jdbc:derby://localhost:1527/sample;create=true"; //$NON-NLS-1$

	String JDBC_DRIVER = "JDBC_DRIVER"; //$NON-NLS-1$
	String JDBC_DRIVER_DEFAULT = "org.apache.derby.jdbc.ClientDriver"; //$NON-NLS-1$

	String USER_NAME = "USER_NAME"; //$NON-NLS-1$
	String USER_NAME_DEFAULT = ""; //$NON-NLS-1$

	String PASSWORD = "PASSWORD"; //$NON-NLS-1$
	String PASSWORD_DEFAULT = ""; //$NON-NLS-1$
}
