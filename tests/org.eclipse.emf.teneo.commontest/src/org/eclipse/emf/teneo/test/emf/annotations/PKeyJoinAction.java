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
 * $Id: PKeyJoinAction.java,v 1.3 2007/06/29 07:35:43 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.Body;
import org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.Head;
import org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.PrimarykeyjoinFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.primarykeyjoin.PrimarykeyjoinPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class PKeyJoinAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * @param arg0
	 */
	public PKeyJoinAction() {
		super(PrimarykeyjoinPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final PrimarykeyjoinFactory factory = PrimarykeyjoinFactory.eINSTANCE;
		{
			store.beginTransaction();
			final Body bd = factory.createBody();
			bd.setTheID(5);
			final Head hd = factory.createHead();
			hd.setMyID(5);
			bd.setHead(hd);
			store.store(bd);
			store.store(hd);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Body bd = (Body) store.getObject(Body.class);
			assertEquals(5, bd.getHead().getMyID());
			assertEquals(5, bd.getTheID());
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Body bd = factory.createBody();
			bd.setTheID(6);
			final Head hd = factory.createHead();
			hd.setMyID(7);
			bd.setHead(hd);
			store.store(bd);
			store.store(hd);
			try {
				store.commitTransaction();
				fail("Foreign key constraint is not enforced");
			} catch (final Exception e) {
				// success
				store.rollbackTransaction();
			}
		}

	}
}