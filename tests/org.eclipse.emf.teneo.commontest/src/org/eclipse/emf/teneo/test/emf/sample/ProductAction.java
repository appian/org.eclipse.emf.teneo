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
 * $Id: ProductAction.java,v 1.2 2006/11/15 17:17:48 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Date;

import org.eclipse.emf.teneo.samples.emf.sample.product.ClassificationType;
import org.eclipse.emf.teneo.samples.emf.sample.product.ProductFactory;
import org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage;
import org.eclipse.emf.teneo.samples.emf.sample.product.ProductType;
import org.eclipse.emf.teneo.samples.emf.sample.product.SupplierType;
import org.eclipse.emf.teneo.samples.emf.sample.product.impl.ProductTypeImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Very simple emf test which tests a simple relation between a product and its supplier and some primitive types
 * (double and date).
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class ProductAction extends AbstractTestAction {
	public ProductAction() {
		super(ProductPackage.eINSTANCE);
	}

	/** Creates a supplier, a product, relates then, saves and retrieves them again. */
	public void doAction(TestStore store) {
		store.disableDrop();
		{
			store.beginTransaction();

			final ProductFactory factory = ProductFactory.eINSTANCE;

			final SupplierType supplier = factory.createSupplierType();
			supplier.setName("supplier1");
			supplier.setNoOfEmployees(1);
			store.store(supplier);

			final ProductType product = factory.createProductType();
			product.setCode("product1");
			product.setCreatedOn(new Date());
			product.setId("productid1");
			product.setPrice(199.95);
			product.setSupplier(supplier);

			ClassificationType c1 = factory.createClassificationType();
			c1.setName("c1");
			ClassificationType c2 = factory.createClassificationType();
			c2.setName("c2");
			ClassificationType c3 = factory.createClassificationType();
			c3.setName("c3");

			product.setAnyOne(c1);
			product.getAnyList().add(c2);
			product.getAnyList().add(c3);
			product.getAnyList().add(supplier);

			store.store(product);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			ProductTypeImpl result = (ProductTypeImpl) store.getObject(ProductType.class);
			assertTrue(result != null);
			assertTrue(result.getCode().compareTo("product1") == 0);
			assertTrue(result.getSupplier() != null);
			assertEquals(199.95, result.getPrice(), 0.01);
			assertTrue(result.getSupplier().getName().compareTo("supplier1") == 0);

			ClassificationType c1 = (ClassificationType) result.getAnyOne();
			assertEquals("c1", c1.getName());

			assertEquals("c2", ((ClassificationType) result.getAnyList().get(0)).getName());
			assertEquals("c3", ((ClassificationType) result.getAnyList().get(1)).getName());
			assertEquals(result.getSupplier(), result.getAnyList().get(2));
			result.setAnyOne(result.getSupplier());
			result.getAnyList().remove(0);
			result.getAnyList().remove(1);
			store.commitTransaction();
		}

		store.checkNumber(ClassificationType.class, 3);

		{
			store.beginTransaction();
			ProductTypeImpl result = (ProductTypeImpl) store.getObject(ProductType.class);
			assertEquals(1, result.getAnyList().size());
			result.setAnyOne(null);
			store.commitTransaction();
		}
	}
}
