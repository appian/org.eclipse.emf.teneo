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
 * $Id: NavTopAction.java,v 1.1 2008/03/19 22:25:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.QualifyingEntityNameStrategy;
import org.eclipse.emf.teneo.samples.issues.nav.NavPackage;
import org.eclipse.emf.teneo.samples.issues.top.TopPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class NavTopAction extends AbstractTestAction {
	public NavTopAction() {
		super(new EPackage[] { NavPackage.eINSTANCE, TopPackage.eINSTANCE });
	}

	@Override
	public void setExtensions(ExtensionManager extensionManager) {
		extensionManager.registerExtension(EntityNameStrategy.class.getName(),
				QualifyingEntityNameStrategy.class.getName());
	}

	@Override
	public void doAction(TestStore store) {
	}
}