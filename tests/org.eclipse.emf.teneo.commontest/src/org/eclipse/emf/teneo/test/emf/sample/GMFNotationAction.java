/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: GMFNotationAction.java,v 1.1 2006/10/19 04:54:11 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * Tests persisting of gmf diagram.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public class GMFNotationAction extends AbstractTestAction {
	
	/** Constructor */
	public GMFNotationAction() {
		super(new EPackage[] {EcorePackage.eINSTANCE, NotationPackage.eINSTANCE});
	}

	/** Reads the library model and persists it. */
	public void doAction(TestStore store) {
		store.disableDrop();
	}
}
