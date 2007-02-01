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
 * $Id: InheritanceAction.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.samples.issues.inheritance.InheritanceFactory;
import org.eclipse.emf.teneo.samples.issues.inheritance.InheritancePackage;
import org.eclipse.emf.teneo.samples.issues.inheritance.SubOne;
import org.eclipse.emf.teneo.samples.issues.inheritance.SubTwo;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests setting resource when a single ref. relation is loaded.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class InheritanceAction extends AbstractTestAction {

	/**
	 * 
	 * 
	 * @param arg0
	 */
	public InheritanceAction() {
		super(new EPackage[] { InheritancePackage.eINSTANCE});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#hibernateEnabled()
	 */
	protected boolean hibernateEnabled() {
		return true;
	}

	/** Creates simple types and tests against */
	public void doAction(TestStore store) {
		// test a simple type
		final InheritanceFactory factory = InheritanceFactory.eINSTANCE;
		{
			store.beginTransaction();
			SubOne subOne = factory.createSubOne();
			subOne.setName("subOne");
			SubTwo subTwo = factory.createSubTwo();
			subTwo.setName("subTwo");
			store.store(subOne);
			store.store(subTwo);
			store.commitTransaction();
		}
	}
}
