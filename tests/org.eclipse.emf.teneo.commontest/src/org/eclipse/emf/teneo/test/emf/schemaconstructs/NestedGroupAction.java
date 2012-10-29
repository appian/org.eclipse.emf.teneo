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
 * $Id: NestedGroupAction.java,v 1.4 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.NestedgroupPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class NestedGroupAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public NestedGroupAction() {
		super(NestedgroupPackage.eINSTANCE);
	}

	/** Creates simple types and tests against */
	public void doAction(TestStore store) {
		// test a simple type
		// final RestrictionFactory factory = RestrictionFactory.eINSTANCE;
		{
			{
				store.beginTransaction();
				store.commitTransaction();
			}
		}
	}
}