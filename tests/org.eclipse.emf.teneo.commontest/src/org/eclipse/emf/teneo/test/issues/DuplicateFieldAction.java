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
 * $Id: DuplicateFieldAction.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.teneo.samples.issues.duplicate_field.TestA;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests an issue which occurs when a type is contained by two other types through multi-occurence relations. In this case a duplicate
 * column exception occurs. This has been solved. This error is thrown when creating the database schema.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2007/02/01 12:35:37 $
 */
public class DuplicateFieldAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public DuplicateFieldAction() {
		super();
	}

	/** Return the packagename of the test sample, Is needed in case of non emf test cases */
	public String getTestPackageName() {
		return TestA.class.getPackage().getName();
	}

	/** Doaction */
	public void doAction(TestStore store) {

	}
}
