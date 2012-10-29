/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.eclipse.emf.teneo.samples.issues.bz242995.Library;
import org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Factory;
import org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Package;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class Bz245167Action extends AbstractTestAction {

	public Bz245167Action() {
		super(new EPackage[] { bz242995Package.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {

		final int staticSize = (int) (IdentifierCacheHandler.PURGE_TRESHOLD * 0.1);

		final IdentifierCacheHandler ich = new IdentifierCacheHandler();
		assertEquals(0, ich.getIdMap().size());
		assertEquals(0, ich.getVersionMap().size());

		List<Library> statPart = new ArrayList<Library>();
		for (int i = 0; i < staticSize; i++) {
			Library library = bz242995Factory.eINSTANCE.createLibrary();
			statPart.add(library);
			ich.setID(library, i);
			ich.setVersion(library, i);
		}
		for (int i = 0; i < (10 * IdentifierCacheHandler.PURGE_TRESHOLD); i++) {
			Library library = bz242995Factory.eINSTANCE.createLibrary();
			if ((i % (IdentifierCacheHandler.PURGE_TRESHOLD - 1) == 0)) {
				System.gc();
			}
			ich.setID(library, i + statPart.size() + 1);
			ich.setVersion(library, i);
		}
		assertTrue(ich.getIdMap().size() < (2 * IdentifierCacheHandler.PURGE_TRESHOLD));
		assertTrue(ich.getVersionMap().size() < (2 * IdentifierCacheHandler.PURGE_TRESHOLD));
		System.gc();
		ich.purgeMaps();
		assertEquals(staticSize, ich.getIdMap().size());
		assertEquals(staticSize, ich.getVersionMap().size());

		// note that the statPart arraylist needs to be used after the above
		// assertEquals
		// otherwise the compiler will optimize them away
		ich.dumpID();
		for (Library lib : statPart) {
			assertTrue(ich.getID(lib) != null);
			assertTrue(ich.getVersion(lib) != null);
		}
	}
}
