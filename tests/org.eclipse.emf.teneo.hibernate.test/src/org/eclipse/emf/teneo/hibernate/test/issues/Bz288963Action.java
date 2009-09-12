/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Package;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz288963Action extends AbstractTestAction {

	public Bz288963Action() {
		super(new EPackage[] { Bz288963Package.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		store.beginTransaction();
		store.commitTransaction();
	}
}
