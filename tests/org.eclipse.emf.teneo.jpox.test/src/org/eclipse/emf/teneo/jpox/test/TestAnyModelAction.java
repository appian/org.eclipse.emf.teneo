/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * LibraryAction.java,v 1.8 2007/03/29 15:00:32 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Test
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class TestAnyModelAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public TestAnyModelAction() {
		super(new EPackage[] {});
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
// props.setProperty(PersistenceOptions.QUALIFY_ENTITY_NAME,
// PersistenceOptions.QUALIFY_ENTITY_NAME_NSPREFIX);
		// props.setProperty(PersistenceOptions.ALSO_MAP_AS_CLASS, "false");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
	}
}
