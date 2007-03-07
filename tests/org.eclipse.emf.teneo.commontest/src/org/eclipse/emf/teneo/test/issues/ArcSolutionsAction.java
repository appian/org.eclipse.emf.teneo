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
 * $Id: ArcSolutionsAction.java,v 1.1 2007/03/07 23:33:46 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

import datacore.DatacorePackage;

/**
 * Tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class ArcSolutionsAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public ArcSolutionsAction() {
		super(new EPackage[]{DatacorePackage.eINSTANCE, datacore.types.TypesPackage.eINSTANCE, datacore.represantations.RepresantationsPackage.eINSTANCE});
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
		store.disableDrop();
	}
}
