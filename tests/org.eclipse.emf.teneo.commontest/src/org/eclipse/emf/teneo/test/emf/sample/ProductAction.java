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
 * $Id: ProductAction.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.Date;

import org.eclipse.emf.teneo.samples.emf.sample.product.ProductFactory;
import org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage;
import org.eclipse.emf.teneo.samples.emf.sample.product.ProductType;
import org.eclipse.emf.teneo.samples.emf.sample.product.SupplierType;
import org.eclipse.emf.teneo.samples.emf.sample.product.impl.ProductTypeImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Very simple emf test which tests a simple relation between a product and its supplier
 * and some primitive types (double and date). 
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public class ProductAction extends AbstractTestAction 
{
	public ProductAction() 
	{
		super(ProductPackage.eINSTANCE);
	}

	/** Creates a supplier, a product, relates then, saves and retrieves them again. */
	public void doAction(TestStore store)
	{
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
	        store.store(product);
	        store.commitTransaction();
    	}
    	
    	{
    		store.beginTransaction();    		
    		ProductTypeImpl result = (ProductTypeImpl)store.getObject(ProductType.class);
			assertTrue(result != null);
			assertTrue(result.getCode().compareTo("product1") == 0);
			assertTrue(result.getSupplier() != null);
			assertEquals(199.95, result.getPrice(), 0.01);
			assertTrue(result.getCreatedOn() instanceof Date);
			assertTrue(result.getSupplier().getName().compareTo("supplier1") == 0);
		    store.commitTransaction();
    	}
	}	
}
