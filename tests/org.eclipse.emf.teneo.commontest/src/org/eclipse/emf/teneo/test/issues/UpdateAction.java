/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.samples.issues.update.Child;
import org.eclipse.emf.teneo.samples.issues.update.Parent;
import org.eclipse.emf.teneo.samples.issues.update.UpdateFactory;
import org.eclipse.emf.teneo.samples.issues.update.UpdatePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class UpdateAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public UpdateAction() {
		super(new EPackage[] { UpdatePackage.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		{
			final Parent p = UpdateFactory.eINSTANCE.createParent();
			p.setName("p");
			final Child c1 = UpdateFactory.eINSTANCE.createChild();
			c1.setName("c1");
			final Child c2 = UpdateFactory.eINSTANCE.createChild();
			c2.setName("c2");
			p.getChildren().add(c1);
			p.getChildren().add(c2);
			store.beginTransaction();
			store.store(p);
			store.commitTransaction();
		}

		{
			final Parent p = UpdateFactory.eINSTANCE.createParent();
			p.setName("p");
			final Child c1 = UpdateFactory.eINSTANCE.createChild();
			c1.setName("c1");
			final Child c2 = UpdateFactory.eINSTANCE.createChild();
			c2.setName("c2");
			p.getChildren().add(c1);
			p.getChildren().add(c2);
			store.beginTransaction();
			store.store(p);
			store.commitTransaction();
		}
	}
}
