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
 * $Id: TopClassesAction.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.samples.issues.topclasses.M;
import org.eclipse.emf.teneo.samples.issues.topclasses.MList;
import org.eclipse.emf.teneo.samples.issues.topclasses.P;
import org.eclipse.emf.teneo.samples.issues.topclasses.PList;
import org.eclipse.emf.teneo.samples.issues.topclasses.R;
import org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesFactory;
import org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests if topclasses are computed correctly also in case of an inheritance strategy. Tests if also for n:m relation lazy loading of
 * detached objects works for jpox.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class TopClassesAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public TopClassesAction() {
		super(TopclassesPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
		final TopclassesFactory factory = TopclassesFactory.eINSTANCE;

		// create a book, writer and library
		try {
			{
				Resource res = store.getResource();
				res.load(null);

				// add other case
				M m = factory.createM();
				m.setName("m");

				P p = factory.createP();
				p.setName("p");
				m.getP().add(p);
				assertTrue(p.getM().contains(m));

				MList mlist = factory.createMList();
				mlist.setName("mlist");
				mlist.getM().add(m);

				PList plist = factory.createPList();
				plist.getP().add(p);
				plist.setName("plist");

				R r = factory.createR();
				r.setName("r");
				r.setMlist(mlist);
				r.setPlist(plist);

				res.getContents().add(r);
				res.save(null);
			}

			{
				Resource res = store.getResource();
				res.load(null);
				assertEquals(1, res.getContents().size());
				R testR = null;
				for (int i = 0; i < res.getContents().size(); i++) {
					final Object obj = res.getContents().get(i);
					if (obj instanceof R) {
						testR = (R) obj;
					}
				}

				M m = (M) testR.getMlist().getM().get(0);
				P p = (P) testR.getPlist().getP().get(0);
				assertTrue(m.getP().contains(p));
				assertTrue(p.getM().contains(m));
				res.save(null);
			}
		} catch (IOException e) {
			throw new StoreTestException("IOException during save", e);
		}
	}
}
