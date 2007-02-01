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
 * $Id: SimplenmAction.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Iterator;

import org.eclipse.emf.teneo.samples.issues.simplenm.Me;
import org.eclipse.emf.teneo.samples.issues.simplenm.SimplenmFactory;
import org.eclipse.emf.teneo.samples.issues.simplenm.SimplenmPackage;
import org.eclipse.emf.teneo.samples.issues.simplenm.You;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests ordering in a nm relation.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class SimplenmAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public SimplenmAction() {
		super(SimplenmPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
		final SimplenmFactory factory = SimplenmFactory.eINSTANCE;

		{
			store.beginTransaction();

			You y1 = factory.createYou();
			y1.setName("y1");
			You y2 = factory.createYou();
			y2.setName("y2");
			You y3 = factory.createYou();
			y3.setName("y3");

			Me m1 = factory.createMe();
			m1.setName("m1");
			Me m2 = factory.createMe();
			m2.setName("m2");
			Me m3 = factory.createMe();
			m3.setName("m3");

			y1.getMe().add(m1);
			y1.getMe().add(m2);
			y1.getMe().add(m3);

			y2.getMe().add(m1);
			y2.getMe().add(m2);
			y2.getMe().add(m3);

			y3.getMe().add(m1);
			y3.getMe().add(m2);
			y3.getMe().add(m3);

			store.store(y1);
			store.store(y2);
			store.store(y3);

			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Iterator it = store.getObjects(You.class).iterator();
			while (it.hasNext()) {
				You you = (You) it.next();
				assertTrue(((Me) you.getMe().get(0)).getName().compareTo("m1") == 0);
				assertTrue(((Me) you.getMe().get(1)).getName().compareTo("m2") == 0);
				assertTrue(((Me) you.getMe().get(2)).getName().compareTo("m3") == 0);
			}
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Iterator it = store.getObjects(Me.class).iterator();
			while (it.hasNext()) {
				Me me = (Me) it.next();
				assertTrue(((You) me.getYou().get(0)).getName().compareTo("y1") == 0);
				assertTrue(((You) me.getYou().get(1)).getName().compareTo("y2") == 0);
				assertTrue(((You) me.getYou().get(2)).getName().compareTo("y3") == 0);
			}
			store.commitTransaction();
		}
	}
}
