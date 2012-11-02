/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.samples.issues.bz282414.Bar;
import org.eclipse.emf.teneo.samples.issues.bz282414.BarKey;
import org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Factory;
import org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package;
import org.eclipse.emf.teneo.samples.issues.bz282414.Foo;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz282414Action extends AbstractTestAction {

	private final Bz282414Factory factory = Bz282414Factory.eINSTANCE;

	public Bz282414Action() {
		super(new EPackage[] { Bz282414Package.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		{
			store.beginTransaction();
			store.store(createFoo(1));
			store.store(createFoo(2));
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final List<Foo> foos = store.getObjects(Foo.class);
			assertEquals(2, foos.size());
			for (Foo foo : foos) {
				assertEquals(2, foo.getBagOfBars().size());
			}
		}
	}

	private Foo createFoo(int index) {
		final Foo foo = factory.createFoo();
		foo.setClientId("clid" + index);
		foo.setDnmSK(index);
		foo.getBagOfBars().add(createBar(index * 10 + 1));
		foo.getBagOfBars().add(createBar(index * 10 + 2));
		return foo;
	}

	private Bar createBar(int index) {
		final Bar bar = factory.createBar();
		final BarKey barKey = factory.createBarKey();
		barKey.setClassId("classid" + index);
		barKey.setGroupId("groupid" + index);
		bar.setBarKey(barKey);
		return bar;
	}

	@Override
	public boolean supportAuditing() {
		// composite key is not supported
		return false;
	}
}
