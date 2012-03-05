/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Properties;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.ecore.EModelResolver;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.rental.RentalPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage;
import org.eclipse.emf.teneo.samples.issues.bz242995.Author;
import org.eclipse.emf.teneo.samples.issues.bz242995.Book;
import org.eclipse.emf.teneo.samples.issues.bz242995.BookCategory;
import org.eclipse.emf.teneo.samples.issues.bz242995.Library;
import org.eclipse.emf.teneo.samples.issues.bz242995.OneTimeWonder;
import org.eclipse.emf.teneo.samples.issues.bz242995.Writer;
import org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Factory;
import org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Package;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.proxy.HibernateProxy;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz372869Action extends AbstractTestAction {

	public Bz372869Action() {
		super(new EPackage[] { LibraryPackage.eINSTANCE, RentalPackage.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		EModelResolver.instance().register(new EPackage[]{ProductPackage.eINSTANCE});
		Assert.assertTrue(EModelResolver.instance().isRegistered(ProductPackage.eINSTANCE));
		Assert.assertTrue(EModelResolver.instance().isRegistered(LibraryPackage.eINSTANCE));
		Assert.assertTrue(EModelResolver.instance().isRegistered(RentalPackage.eINSTANCE));
		Assert.assertTrue(ERuntime.instance().isRegistered(RentalPackage.eINSTANCE));
		Assert.assertTrue(ERuntime.instance().isRegistered(RentalPackage.eINSTANCE));
		Assert.assertNotNull(ERuntime.instance().getJavaClass(LibraryPackage.eINSTANCE.getBook()));
		Assert.assertNotNull(ERuntime.instance().getJavaClass(RentalPackage.eINSTANCE.getCurrency()));
		Assert.assertNotNull(ERuntime.instance().getJavaClass(ProductPackage.eINSTANCE.getProductType()));
		((HbDataStore)store.getDataStore()).close();
		Assert.assertTrue(EModelResolver.instance().isRegistered(ProductPackage.eINSTANCE));
		Assert.assertFalse(EModelResolver.instance().isRegistered(LibraryPackage.eINSTANCE));
		Assert.assertFalse(EModelResolver.instance().isRegistered(RentalPackage.eINSTANCE));
		Assert.assertFalse(ERuntime.instance().isRegistered(RentalPackage.eINSTANCE));
		Assert.assertFalse(ERuntime.instance().isRegistered(RentalPackage.eINSTANCE));
		Assert.assertNull(ERuntime.instance().getJavaClass(LibraryPackage.eINSTANCE.getBook()));
		Assert.assertNull(ERuntime.instance().getJavaClass(RentalPackage.eINSTANCE.getCurrency()));
		Assert.assertNotNull(ERuntime.instance().getJavaClass(ProductPackage.eINSTANCE.getProductType()));
	}
}
