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
 * $Id: CatalogAction.java,v 1.5 2007/07/21 09:27:48 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogFactory;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.StringType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.SupplierType;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Performs a number of test actions on the catalog example. Create products, link a supplier, add
 * to catalog, delete from catalog.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public abstract class CatalogAction extends AbstractTestAction {

	private static int COMMENT_LENGTH = 10;

	public CatalogAction() {
		super(CatalogPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "true");
		props.setProperty(PersistenceOptions.MAX_COMMENT_LENGTH, COMMENT_LENGTH + "");
		return props;
	}

	/** Creates a supplier, a product, relates then, saves and retrieves them again. */
	@Override
	public void doAction(TestStore store) {
		long millis = (112671594);
		millis = millis * 10000;
		millis = millis + 4562;

		final CatalogFactory factory = CatalogFactory.eINSTANCE;
		{
			store.beginTransaction();
			final SupplierType supplier = factory.createSupplierType();
			supplier.setName("supplier1");
			supplier.setNoOfEmployees(1);
			store.store(supplier);

			final PriceType price = factory.createPriceType();
			price.setPrice(69.96);
			price.setSupplier(supplier);
			price.setQuantityTo(100.0);
			store.store(price);

			final ProductType product = factory.createProductType();
			product.setCode("product1");
			product.setDescription("This is a very nice product");
			final StringType str1 = factory.createStringType();
			str1.setValue("remarka");
			final StringType str2 = factory.createStringType();
			str2.setValue("remarkb");
			product.getRemark().add(str1);
			product.getRemark().add(str2);
			product.setPrice(price);
			store.store(product);

			// and create another product
			final PriceType price2 = factory.createPriceType();
			price2.setPrice(75.0);
			price2.setSupplier(supplier);
			price2.setQuantityTo(100.0);
			// store.store(price2);

			final ProductType product2 = factory.createProductType();
			product2.setCode("product2");
			// product2.setDescription("This is a very nice product");
			final StringType strfor2 = factory.createStringType();
			strfor2.setValue("remarkb");
			product2.getRemark().add(strfor2);
			product2.setPrice(price2);
			store.store(product2);

			store.commitTransaction();
		}

		// retrieve one product
		// delete one of its remarks and add another remark
		{
			store.beginTransaction();

			final List<?> results = store.query(ProductType.class, "code", "product1", 1);

			assertTrue(results.size() == 1);

			ProductType result = (ProductType) results.get(0);

			assertTrue(result != null);
			assertTrue(result.getCode().compareTo("product1") == 0);
			assertTrue(result.getRemark().size() == 2);

			assertTrue((result.getRemark().get(0)).getValue().compareTo("remarka") == 0);
			assertTrue((result.getRemark().get(1)).getValue().compareTo("remarkb") == 0);

			// then remove one
			result.getRemark().remove(1);

			// add another
			final StringType str1 = factory.createStringType();
			str1.setValue("remarkc");

			result.getRemark().add(str1);

			// store.store(result);

			// and store again
			store.commitTransaction();
		}

		// directly checks if the following StringTypes are in the database: remarka, remarkb and
		// remarkc
		// this test fails for jpox
		{
			store.beginTransaction();

			final List<?> results = store.getObjects(StringType.class);
			assertEquals(3, results.size());

			int remarka = 0;
			int remarkb = 0;
			int remarkc = 0;
			Iterator<?> it = results.iterator();
			while (it.hasNext()) {
				StringType str = (StringType) it.next();
				if (str.getValue().compareTo("remarka") == 0) {
					remarka++;
				} else if (str.getValue().compareTo("remarkb") == 0) {
					remarkb++;
				} else if (str.getValue().compareTo("remarkc") == 0) {
					remarkc++;
				} else {
					fail();
				}
			}
			assertTrue(remarka == 1);
			assertTrue(remarkb == 1);
			assertTrue(remarkc == 1);
			store.commitTransaction();
		}

		// now retrieve the second product and check it
		{
			store.beginTransaction();

			final List<?> results = store.query(ProductType.class, "code", "product2", 1);

			assertTrue(results.size() == 1);

			ProductType result = (ProductType) results.get(0);

			assertTrue(result.getCode().compareTo("product2") == 0);
			assertTrue(result.getRemark().size() == 1);
			final StringType remark = result.getRemark().get(0);
			assertTrue(remark.eContainer() != null);

			assertTrue((result.getRemark().get(0)).getValue().compareTo("remarkb") == 0);

			store.commitTransaction();
		}

		// again retrieve two products
		// create a main catalog and add the two products to it
		// create a subcatalog and attach it to the main catalog
		// and save the lot
		{
			store.beginTransaction();

			ProductType result = (ProductType) store.query(ProductType.class, "code", "product1", 1).get(0);
			ProductType result2 = (ProductType) store.query(ProductType.class, "code", "product2", 1).get(0);

			final CatalogType mainCatalog = factory.createCatalogType();
			mainCatalog.setName("MainCatalog");
			mainCatalog.setDescription("my description");
			mainCatalog.getProduct().add(result);
			mainCatalog.getProduct().add(result2);
			final CatalogType subCatalog = factory.createCatalogType();
			subCatalog.setName("SubCatalog");
			subCatalog.setDescription("mydescription");

			mainCatalog.getSubCatalog().add(subCatalog);

			store.store(mainCatalog);

			store.commitTransaction();
		}

		// retrieve the main catalog and check that all products are present
		// remove one product
		{
			store.beginTransaction();

			CatalogType cat = (CatalogType) store.query(CatalogType.class, "name", "MainCatalog", 1).get(0);

			assertTrue(cat != null);
			assertTrue(cat.getName().compareTo("MainCatalog") == 0);
			assertTrue(cat.getProduct().size() == 2);
			assertTrue((cat.getProduct().get(0)).getCode().compareTo("product1") == 0);
			assertTrue((cat.getProduct().get(1)).getCode().compareTo("product2") == 0);
			cat.getProduct().remove(1); // this product will not be deleted, only the reference
			assertTrue((cat.getSubCatalog().get(0)).getName().compareTo("SubCatalog") == 0);

			store.commitTransaction();
		}

		// test if the product2 was not deleted
		{
			store.beginTransaction();
			ProductType result2 = (ProductType) store.query(ProductType.class, "code", "product2", 1).get(0);
			assertTrue(result2 != null);
			store.commitTransaction();
		}

		// retrieve both catalogs
		{
			store.beginTransaction();
			final List<?> result = store.getObjects(CatalogType.class);
			assertTrue(result.size() == 2);
			Iterator<?> it = result.iterator();
			while (it.hasNext()) {
				CatalogType cat = (CatalogType) it.next();
				assertTrue(cat.getName().compareTo("MainCatalog") == 0 || cat.getName().compareTo("SubCatalog") == 0);
			}
			store.commitTransaction();
		}

		// select a product based on one of its remark values
		{
			store.beginTransaction();

			ProductType prod = null;
			prod = (ProductType) store.query(getQueryText(), 1).get(0);

			assertTrue((prod.getRemark().get(0)).getValue().compareTo("remarka") == 0);
			store.commitTransaction();
		}

		// test the comments in the hdm
		if (store.isHibernateTestStore()) {
			final String[] test =
					new String[] { "My product documentation".substring(0, COMMENT_LENGTH),
							"My description documentation".substring(0, COMMENT_LENGTH),
							"My producttype documentation".substring(0, COMMENT_LENGTH) };
			final String xml = store.getMappingXML();
			for (String t : test) {
				if (xml.indexOf(t) == -1) {
					fail("The following documentation does not appear: " + t);
				}
			}
		}
	}

	/**
	 * @return Returns the string used to query a product with remarks containing the text 'remarka'
	 */
	protected abstract String getQueryText();
	// TODO specialize
	// for jpox
	// SELECT FROM org.eclipse.emf.teneo.test.emf.sample.catalog.gen.impl.ProductTypeImpl
	// WHERE remark.contains(rem) && rem.value == \"remarka\"
	// VARIABLES org.eclipse.emf.teneo.test.emf.sample.catalog.gen.impl.StringTypeImpl rem
	// for hibernate
	// SELECT product FROM org.eclipse.emf.teneo.test.emf.sample.catalog.gen.ProductType product,
	// org.eclipse.emf.teneo.test.emf.sample.catalog.gen.StringType rem
	// WHERE rem in elements(product.remark) and rem.value = 'remarka'
	// }

}