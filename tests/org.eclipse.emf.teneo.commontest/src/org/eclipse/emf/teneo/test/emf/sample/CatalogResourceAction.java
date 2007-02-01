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
 * $Id: CatalogResourceAction.java,v 1.4 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogFactory;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.StringType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.SupplierType;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Performs a number of test actions on the catalog example. Create products, link a supplier, add to catalog, delete from catalog.
 * 
 * All using a resource, tests add, delete and update of objects in a resource.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class CatalogResourceAction extends AbstractTestAction {
	/**
	 * Constructor
	 * 
	 * @param arg0
	 */
	public CatalogResourceAction() {
		super(CatalogPackage.eINSTANCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#hibernateEnabled()
	 */
	protected boolean hibernateEnabled() {
		return true;
	}

	/**
	 * Creates a supplier, a product, relates then, saves them in a resource and retrieves them again. and does sme
	 */
	Resource resource;

	public void doAction(TestStore store) {
		final CatalogFactory factory = CatalogFactory.eINSTANCE;
		try {
			double checkPrice = (double) 69.96; // is checked later

			{
				resource = store.getResource();
				resource.load(null);

				final SupplierType supplier = factory.createSupplierType();
				supplier.setName("supplier1");
				supplier.setNoOfEmployees(1);
				resource.getContents().add(supplier);

				final PriceType price = factory.createPriceType();
				price.setPrice(checkPrice);
				price.setSupplier(supplier);
				price.setQuantityTo(100.0);
				resource.getContents().add(price);

				final ProductType product = (ProductType) factory.createProductType();
				product.setCode("product1");
				product.setDescription("This is a very nice product");
				final StringType str1 = factory.createStringType();
				str1.setValue("remarka");
				final StringType str2 = factory.createStringType();
				str2.setValue("remarkb");
				product.getRemark().add(str1);
				product.getRemark().add(str2);
				product.setPrice(price);
				resource.getContents().add(product);
				resource.save(null);
				resource.unload();
			}

			{
				// test retrieval by connection params
				resource = store.getResource();
				resource.load(null);

				assertTrue("There should be two top objects in the resource but there are " + resource.getContents().size(), resource
						.getContents().size() == 2);

				// get the supplier
				SupplierType supplier = null;
				for (int i = 0; i < resource.getContents().size(); i++) {
					if (resource.getContents().get(i) instanceof SupplierType) {
						supplier = (SupplierType) resource.getContents().get(i);
					}
				}

				// and create another product
				final PriceType price2 = factory.createPriceType();
				price2.setPrice(75.0);
				price2.setSupplier(supplier);
				price2.setQuantityTo(100.0);

				final ProductType product2 = (ProductType) factory.createProductType();
				product2.setCode("product2");
				product2.setDescription("This is a very nice product");
				final StringType strfor2 = factory.createStringType();
				strfor2.setValue("remarkb");
				product2.getRemark().add(strfor2);
				product2.setPrice(price2);
				resource.getContents().add(product2);
				resource.save(null);
				resource.unload();
			}

			store.beginTransaction();
			store.checkNumber(ProductType.class, 2);
			store.checkNumber(SupplierType.class, 1);
			store.checkNumber(PriceType.class, 2);
			store.checkNumber(StringType.class, 3);
			store.commitTransaction();

			// directly checks if the following StringTypes are in the database: remarka, remarkb and remarkc
			{
				store.beginTransaction();
				final List results = store.getObjects(StringType.class);
				assertTrue(results.size() == 3);
				int remarka = 0;
				int remarkb = 0;
				int remarkc = 0;
				Iterator it = results.iterator();
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
				assertTrue(remarkb == 2);
				assertTrue(remarkc == 0);
				store.commitTransaction();
			}

			store.beginTransaction();
			store.checkNumber(ProductType.class, 2);
			store.checkNumber(SupplierType.class, 1);
			store.checkNumber(PriceType.class, 2);
			store.checkNumber(StringType.class, 3);
			store.commitTransaction();

			// again retrieve two products
			// create a main catalog and add the two products to it
			// create a subcatalog and attach it to the main catalog
			// and save the lot
			{
				// test retrieval using minimal connection params
				resource = store.getResource("fetch_minimal=true");
				resource.load(null);

				// this should force a load of the products
				Iterator it = resource.getContents().iterator();
				while (it.hasNext()) {
					Object obj = it.next();
					if (obj instanceof ProductType) {
						assertTrue(((ProductType) obj).getDescription() != null);
					}
				}

				final CatalogType mainCatalog = factory.createCatalogType();
				mainCatalog.setName("MainCatalog");
				mainCatalog.setDescription("my description");

				// add the products to the maincatalog
				it = resource.getContents().iterator();
				while (it.hasNext()) {
					Object obj = it.next();
					if (obj instanceof ProductType) mainCatalog.getProduct().add(obj);
				}
				final CatalogType subCatalog = factory.createCatalogType();
				subCatalog.setName("SubCatalog");
				subCatalog.setDescription("mydescription");

				mainCatalog.getSubCatalog().add(subCatalog);
				resource.getContents().add(mainCatalog);
				resource.getContents().add(subCatalog);
				resource.save(null);
				resource.unload();
			}

			store.beginTransaction();
			store.checkNumber(CatalogType.class, 2);
			store.commitTransaction();

			// retrieve the main catalog and check that all products are present
			// remove one product, note that because this is a non-containment relation
			{
				resource = store.getResource();
				resource.load(null);
				Iterator it = resource.getContents().iterator();
				CatalogType cat = null;
				while (it.hasNext()) {
					final Object obj = it.next();

					assertTrue("Only top classes should be returned", obj instanceof ProductType || obj instanceof SupplierType
							|| obj instanceof CatalogType);

					if (obj instanceof CatalogType && ((CatalogType) obj).getName().compareTo("MainCatalog") == 0) {
						assertTrue("There should only be one MainCatalog", cat == null);
						cat = (CatalogType) obj;
					}
				}
				assertTrue(cat != null);
				assertEquals(0, cat.getName().compareTo("MainCatalog"));
				assertEquals(2, cat.getProduct().size());
				assertTrue(((ProductType) cat.getProduct().get(0)).getCode().compareTo("product1") == 0);
				assertTrue(((ProductType) cat.getProduct().get(1)).getCode().compareTo("product2") == 0);
				cat.getProduct().remove(1); // this product will not be deleted, only the reference
				assertTrue(((CatalogType) cat.getSubCatalog().get(0)).getName().compareTo("SubCatalog") == 0);

				resource.save(null);
				resource.unload();
			}

			// product was not deleted
			store.beginTransaction();
			store.checkNumber(ProductType.class, 2);
			store.commitTransaction();

			// retrieve the resource and delete one product
			{
				resource = store.getResource();
				resource.load(null);

				// count the products in the resource
				List list = resource.getContents();
				int cnt = 0;
				ProductType delProduct = null;
				for (int i = 0; i < list.size(); i++) {
					Object obj = list.get(i);
					if (obj instanceof ProductType) {
						cnt++;

						// test if the containment is set correctly
						// there is always at least one remark!
						EObject eobj = (EObject) ((ProductType) obj).getRemark().get(0);
						assertTrue("The remark should be contained in the product", eobj.eContainer() == obj);

						// delete the product with 1 remark, this is then tested below
						if (((ProductType) obj).getRemark().size() == 1) {
							delProduct = (ProductType) obj;
						}
					}
				}
				assertTrue("There should be two products in the resource.", cnt == 2);

				// now remove one product from the resource
				resource.getContents().remove(delProduct);
				resource.save(null);
				resource.unload();
			}

			// do some counts
			store.beginTransaction();
			store.checkNumber(ProductType.class, 1);
			store.checkNumber(SupplierType.class, 1);
			store.checkNumber(PriceType.class, 1);
			// note the product with one remark was deleted therefore there are 2 left
			store.checkNumber(StringType.class, 2);
			store.commitTransaction();

			// now update an object in the resource, update a derived element (the price) and
			// remove one remark from the list and a new one.
			{
				resource = store.getResource();
				resource.load(null);
				ProductType result = null;
				for (int i = 0; i < resource.getContents().size(); i++) {
					if (resource.getContents().get(i) instanceof ProductType) {
						// there should only be one product
						assertTrue("There should only be one product", result == null);
						result = (ProductType) resource.getContents().get(i);
					}
				}

				assertTrue(result != null);
				assertTrue(result.getCode().compareTo("product1") == 0);
				assertTrue(result.getRemark().size() == 2);

				assertTrue(((StringType) result.getRemark().get(0)).getValue().compareTo("remarka") == 0);
				assertTrue(((StringType) result.getRemark().get(1)).getValue().compareTo("remarkb") == 0);

				// then remove one
				result.getRemark().remove(1);

				// add another
				final StringType str1 = factory.createStringType();
				str1.setValue("remarkc");

				result.getRemark().add(str1);

				result.getPrice().setPrice(result.getPrice().getPrice() + 100.0);
				resource.save(null);
				resource.unload();
			}

			// there should now only be a remarka and a remarkc
			{
				store.beginTransaction();
				final List results = store.getObjects(StringType.class);
				assertTrue(results.size() == 2);
				int remarka = 0;
				int remarkb = 0;
				int remarkc = 0;
				Iterator it = results.iterator();
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
				assertTrue(remarkb == 0);
				assertTrue(remarkc == 1);
				store.commitTransaction();
			}

			// check if the update of the price was passed on
			{
				store.beginTransaction();
				ProductType result = (ProductType) store.query(ProductType.class, "code", "product1", 1).get(0);
				assertTrue(result != null);
				assertEquals(169.96, result.getPrice().getPrice(), 0.01);
				store.commitTransaction();
			}
		} catch (Exception e) {
			throw new StoreTestException(e.getMessage(), e);
		}
	}
}