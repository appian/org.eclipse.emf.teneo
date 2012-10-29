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
 * $Id: ModelGroupAction.java,v 1.3 2010/04/02 22:42:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests for the modelgroup construction.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class ModelGroupAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public ModelGroupAction() {
		super(ModelgroupPackage.eINSTANCE);
	}

	/** Creates simple types and tests against */
	@Override
	public void doAction(TestStore store) {
	}
}