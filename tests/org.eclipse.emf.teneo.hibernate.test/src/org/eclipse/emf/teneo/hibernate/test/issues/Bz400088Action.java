/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.QualifyingEntityNameStrategy;
import org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Factory;
import org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package;
import org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088;
import org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz400088Action extends AbstractTestAction {

	private Bz400088Factory factory = Bz400088Factory.eINSTANCE;

	public Bz400088Action() {
		super(new EPackage[] { Bz400088Package.eINSTANCE });
	}

	public void setExtensions(ExtensionManager extensionManager) {
		extensionManager.registerExtension(EntityNameStrategy.class.getName(),
				QualifyingEntityNameStrategy.class.getName());
		super.setExtensions(extensionManager);
	}

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			Ref400088 t = factory.createRef400088();
			RefOther400088 o1 = factory.createRefOther400088();
			RefOther400088 o2 = factory.createRefOther400088();
			t.getRef().add(o1);
			t.getRef().add(o2);
			store.store(o1);
			store.store(o2);
			store.store(t);
			store.commitTransaction();
		}
	}
}
