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
 * $Id: FruitsAction.java,v 1.1 2007/07/09 12:54:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

import tc.apple.ApplePackage;
import tc.tree.TreePackage;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
 */
public class FruitsAction extends AbstractTestAction {
	public FruitsAction() {
		super(new EPackage[] { TreePackage.eINSTANCE, ApplePackage.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
	}
}