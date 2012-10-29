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
 * $Id: FruitsAction.java,v 1.2 2008/02/28 07:08:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

import tc.apple.ApplePackage;
import tc.tree.TreePackage;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class FruitsAction extends AbstractTestAction {
	public FruitsAction() {
		super(new EPackage[] { TreePackage.eINSTANCE, ApplePackage.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
	}
}