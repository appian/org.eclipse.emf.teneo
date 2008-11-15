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
 * $Id: BZ253799Action.java,v 1.1 2008/11/15 21:37:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.samples.issues.bz253799.Bz253799Factory;
import org.eclipse.emf.teneo.samples.issues.bz253799.Bz253799Package;
import org.eclipse.emf.teneo.samples.issues.bz253799.One;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for bugzilla 253799
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class BZ253799Action extends AbstractTestAction {
	public BZ253799Action() {
		super(new EPackage[] { Bz253799Package.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		final Bz253799Factory factory = Bz253799Factory.eINSTANCE;
		{
			store.beginTransaction();
			final One one = factory.createOne();
			try {
				store.store(one);
				store.commitTransaction();
				fail();
			} catch (Exception e) {
				// successfull
			}
		}
	}
}