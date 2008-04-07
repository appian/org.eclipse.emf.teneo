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
 * $Id: AnyTypeAction.java,v 1.6 2008/04/07 15:14:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypeFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.B;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Test: - Single occurence any type - any - any with ecore:name
 * 
 * Test: - Create and insert - Retrieve - Delete with cascading delete
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class AnyTypeAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public AnyTypeAction() {
		super(AnytypePackage.eINSTANCE);
	}

	/** Creates simple types and tests against */
	@Override
	public void doAction(TestStore store) {
		// test a simple type
		final AnytypeFactory factory = AnytypeFactory.eINSTANCE;
		{
			store.beginTransaction();

			TestAny testAny = factory.createTestAny();
			testAny.setName("my name");

			// test single AnyType
			// 1
			B b = factory.createB();
			b.setName("myb1");
			testAny.setSingleAnyType(b);

			// test multi AnyType
			// 2
			B b2 = factory.createB();
			b2.setName("myb2");
			testAny.getMultiAnyType().add(b2);

			A a = factory.createA();
			a.setDoub(5.4);
			a.setLon(150);
			a.setName("mya");
			B b3 = factory.createB();
			b3.setName("myb3");
			a.setMyB(b3);
			// 3
			testAny.getMultiAnyType().add(a);

			// test any type
			testAny.getAny().add(AnytypePackage.eINSTANCE.getB_Name(), "my b");
			testAny.getAny().add(AnytypePackage.eINSTANCE.getA_Doub(), new Double(3.0));
			testAny.setA("a");
			B b4 = factory.createB();
			b4.setName("myb4");
			testAny.getAny().add(AnytypePackage.eINSTANCE.getA_MyB(), b4);

			testAny.getMyAny().add(AnytypePackage.eINSTANCE.getB_Name(), "my b my any");
			testAny.getMyAny().add(AnytypePackage.eINSTANCE.getA_Doub(), new Double(3.4));
			B b5 = factory.createB();
			b5.setName("myb5");
			testAny.getMyAny().add(AnytypePackage.eINSTANCE.getA_MyB(), b5);

			store.store(testAny);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			TestAny testAny = store.getObject(TestAny.class);

			// check singleAny
			{
				B b = (B) testAny.getSingleAnyType();
				assertTrue(b.getName().compareTo("myb1") == 0);
				assertTrue(b.eContainer() == testAny);
			}

			// check MultiAny
			for (int i = 0; i < testAny.getMultiAnyType().size(); i++) {
				if (i == 0) // a b2
				{
					B b = (B) testAny.getMultiAnyType().get(i);
					assertTrue(b.getName().compareTo("myb2") == 0);
					assertTrue(b.eContainer() == testAny);
				} else if (i == 1) {
					A a = (A) testAny.getMultiAnyType().get(i);
					assertEquals(5.4, a.getDoub(), 0.01);
					assertTrue(a.getLon() == 150);
					assertTrue(a.getName().compareTo("mya") == 0);
					assertTrue(a.getMyB().getName().compareTo("myb3") == 0);
					assertTrue(a.eContainer() == testAny);
				} else {
					assertTrue("The multiAnyType should have only 2 elements but it has " +
							testAny.getMultiAnyType().size(), false);
				}
			}

			// test xsd:any
			assertTrue("Size of testAny.getAny should be 3 but it is: " + testAny.getAny().size(), testAny.getAny()
				.size() == 3);
			for (int i = 0; i < testAny.getAny().size(); i++) {
				final FeatureMap.Entry entry = testAny.getAny().get(i);
				if (i == 0) {
					assertTrue("Feature expected/found: " + AnytypePackage.eINSTANCE.getB_Name().getName() + "/" +
							entry.getEStructuralFeature().getName(), AnytypePackage.eINSTANCE.getB_Name() == entry
						.getEStructuralFeature());
					assertTrue("Expected/found: 'my b'/" + entry.getValue(), "my b"
						.compareTo((String) entry.getValue()) == 0);
				} else if (i == 1) {
					assertTrue("Feature expected/found: " + AnytypePackage.eINSTANCE.getA_Doub().getName() + "/" +
							entry.getEStructuralFeature().getName(), AnytypePackage.eINSTANCE.getA_Doub() == entry
						.getEStructuralFeature());
					assertTrue("Expected/found: 3.0/" + entry.getValue(), new Double(3.0).equals(entry.getValue()));
				} else if (i == 2) {
					assertTrue("Feature expected/found: " + AnytypePackage.eINSTANCE.getA_MyB().getName() + "/" +
							entry.getEStructuralFeature().getName(), AnytypePackage.eINSTANCE.getA_MyB() == entry
						.getEStructuralFeature());
					B b4 = (B) entry.getValue();
					assertTrue(b4.getName().compareTo("myb4") == 0);
				}
			}
			/*
			 * testAny.getMyAny().add(AnytypePackage.eINSTANCE.getB_Name(), "my b my any");
			 * testAny.getMyAny().add(AnytypePackage.eINSTANCE.getA_Doub(), new Double(3.4)); B b5 =
			 * factory.createB(); b5.setName("myb5");
			 * testAny.getMyAny().add(AnytypePackage.eINSTANCE.getA_MyB(), b5);
			 */
			assertTrue("Size of testAny.getMyAny should be 3 but it is: " + testAny.getMyAny().size(), testAny
				.getMyAny().size() == 3);
			for (int i = 0; i < testAny.getMyAny().size(); i++) {
				final FeatureMap.Entry entry = testAny.getMyAny().get(i);
				if (i == 0) {
					assertTrue("Feature expected/found: " + AnytypePackage.eINSTANCE.getB_Name().getName() + "/" +
							entry.getEStructuralFeature().getName(), AnytypePackage.eINSTANCE.getB_Name() == entry
						.getEStructuralFeature());
					assertTrue("Expected/found: 'my b my any'/" + entry.getValue(), "my b my any"
						.compareTo((String) entry.getValue()) == 0);
				} else if (i == 1) {
					assertTrue("Feature expected/found: " + AnytypePackage.eINSTANCE.getA_Doub().getName() + "/" +
							entry.getEStructuralFeature().getName(), AnytypePackage.eINSTANCE.getA_Doub() == entry
						.getEStructuralFeature());
					assertTrue("Expected/found: 3.4/" + entry.getValue(), new Double(3.4).equals(entry.getValue()));
				} else if (i == 2) {
					assertTrue("Feature expected/found: " + AnytypePackage.eINSTANCE.getA_MyB().getName() + "/" +
							entry.getEStructuralFeature().getName(), AnytypePackage.eINSTANCE.getA_MyB() == entry
						.getEStructuralFeature());
					B b5 = (B) entry.getValue();
					assertTrue(b5.getName().compareTo("myb5") == 0);
				}
			}

			store.commitTransaction();
		}

		{
			store.beginTransaction();
			TestAny testAny = store.getObject(TestAny.class);
			testAny.getMultiAnyType().remove(0);
			store.commitTransaction();
		}

		// now test cascading deletes and non-cascading deletes
		{
			store.beginTransaction();
			TestAny testAny = store.getObject(TestAny.class);
			store.deleteObject(testAny);
			store.commitTransaction();
		}

		// after the delete, the following should have been deleted:
		// The myb1 B object because it was set as anytype which had a containment setting
		// The myb2 B object because it was added to multianytype which had a containment setting
		// The mya A object because it was added to multianytype which had a containment setting
		// so there should only be a mb3, myb4 or myb5 left
		{
			store.beginTransaction();
			Collection acoll = store.getObjects(A.class);
			assertEquals(0, acoll.size());
			Collection coll = store.getObjects(B.class);
			assertEquals(3, coll.size());
			int cnt3 = 0;
			int cnt4 = 0;
			int cnt5 = 0;
			final Iterator it = coll.iterator();
			while (it.hasNext()) {
				B b = (B) it.next();
				if (b.getName().compareTo("myb3") == 0) {
					cnt3++;
				} else if (b.getName().compareTo("myb4") == 0) {
					cnt4++;
				} else if (b.getName().compareTo("myb5") == 0) {
					cnt5++;
				} else {
					assertTrue("Not expected a B with name: " + b.getName(), false);
				}
			}
			assertTrue("There should only be one B with name myb3, there are: " + cnt3, cnt3 == 1);
			assertTrue("There should only be one B with name myb4, there are: " + cnt4, cnt4 == 1);
			assertTrue("There should only be one B with name myb5, there are: " + cnt5, cnt5 == 1);

			store.commitTransaction();
		}
	}
}
