/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * Relation1tonAction.java,v 1.3 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.relation;

import java.util.Properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonFactory;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests many different kinds of 1:n relations
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class Relation1tonAction extends AbstractTestAction {
	/** value used to create multiple entries in a list */
	private static final int ELEM_CNT = 10;

	/**
	 * Constructor
	 * 
	 * @param arg0
	 */
	public Relation1tonAction() {
		super(Relation1tonPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "true");
		return props;
	}

	/** Tests cascading deletes, required relations, etc. for 1:1 relations */
	@Override
	public void doAction(TestStore store) {
		// are not able to generate correct foreign key constraints in the generated sql, therefor
		// this does
		// not work.
		final Relation1tonFactory factory = Relation1tonFactory.eINSTANCE;

		{
			store.beginTransaction();

			Main main = factory.createMain();
			main.setName("main");

			OneCR oneCr1 = factory.createOneCR();
			oneCr1.setName("onecr1");
			main.getOnecr().add(oneCr1);
			OneCR oneCr2 = factory.createOneCR();
			oneCr2.setName("onecr2");
			main.getOnecr().add(oneCr2);

			OneCN oneCn1 = factory.createOneCN();
			oneCn1.setName("onecn1");
			main.getOnecn().add(oneCn1);
			OneCN oneCn2 = factory.createOneCN();
			oneCn2.setName("onecn2");
			main.getOnecn().add(oneCn2);

			OneNN oneNn1 = factory.createOneNN();
			oneNn1.setName("onenn1");
			main.getOnenn().add(oneNn1);
			OneNN oneNn2 = factory.createOneNN();
			oneNn2.setName("onenn2");
			main.getOnenn().add(oneNn2);

			OneNR oneNr1 = factory.createOneNR();
			oneNr1.setName("onenr1");
			main.getOnenr().add(oneNr1);
			OneNR oneNr2 = factory.createOneNR();
			oneNr2.setName("onenr2");
			main.getOnenr().add(oneNr2);

			TwoCR twoCr1 = factory.createTwoCR();
			twoCr1.setName("twocr1");
			main.getTwocr().add(twoCr1);
			TwoCR twoCr2 = factory.createTwoCR();
			twoCr2.setName("twocr2");
			main.getTwocr().add(twoCr2);

			for (int i = 0; i < ELEM_CNT; i++) {
				TwoCN twoCn = factory.createTwoCN();
				twoCn.setName("twocn" + i);
				main.getTwocn().add(twoCn);
			}

			for (int i = 0; i < ELEM_CNT; i++) {
				TwoNN twoNn = factory.createTwoNN();
				twoNn.setName("twonn" + i);
				main.getTwonn().add(twoNn);
			}

			TwoNR twoNr1 = factory.createTwoNR();
			twoNr1.setName("twonr1");
			main.getTwonr().add(twoNr1);
			TwoNR twoNr2 = factory.createTwoNR();
			twoNr2.setName("twonr2");
			main.getTwonr().add(twoNr2);

			store.store(main);
			store.commitTransaction();
		}

		// check that the main object can not be deleted
		{
			// this test fails for hibernate because hibernate apparently does not support
			// foreign key constraints checking when removing a parent. Apparently foreign keys
			// are always nulled out. Imo this is incorrect for two way relations.
			// store.checkDeleteFails(Main.class);
		}

		// <element name="containedonewayrequired" type="this:ContainedChildR"/>
		// 1) we should check here that this child can not be deleted separately
		{
			// childs of 1:n relations can be deleted directly!
			// check 1
			// store.checkDeleteFails(OneNR.class);
		}

		// <element name="containedoneWaynotrequired" type="this:ContainedChildNR" minOccurs="0"/>
		// 3) Direct delete of the child should not be possible as the parent points to it
		// 4) if the main object is deleted then this child should also be deleted automatically
		// ContainedChildNR containedChildNR = factory.createContainedChildNR();
		{
			// childs in 1:n relations can be deleted directly!
			// check 3
			// store.checkDeleteFails(OneNR.class);

			// restore again
			store.beginTransaction();
			MainImpl main = (MainImpl) store.getObject(Main.class);

			// check the econtainer
			assertEquals(2, main.getOnecr().size());
			assertEquals(2, main.getOnecn().size());
			assertEquals(2, main.getOnenr().size());
			assertEquals(2, main.getOnenn().size());
			assertEquals(2, main.getTwocr().size());
			assertEquals(ELEM_CNT, main.getTwocn().size());
			assertEquals(2, main.getTwonr().size());
			assertEquals(ELEM_CNT, main.getTwonn().size());

			assertTrue("EContainer is not null", ((EObject) main.getOnecn().get(0)).eContainer() != null);
			assertTrue("EContainer is not null", ((EObject) main.getOnecr().get(1)).eContainer() != null);
			assertTrue("EContainer is null", ((EObject) main.getTwonn().get(1)).eContainer() == null);
			assertTrue("EContainer is null", ((EObject) main.getTwonr().get(1)).eContainer() == null);

			OneCR onecr = factory.createOneCR();
			onecr.setName("onecr3");
			main.getOnecr().add(onecr);
			main.getOnecr().remove(0);
			store.commitTransaction();

			// should be two now (no cascading delete yet!)
			store.beginTransaction();
			store.checkNumber(OneCR.class, 2);
			store.commitTransaction();
		}

		// <element name="notcontainedonewayrequired" type="xsd:IDREF"
		// ecore:reference="this:NotContainedChildR"/>
		// 6b) Element has to be set when parent is saved
		{
			// check 6
			// childs in 1:n relations can be deleted if there is no join table!
			// store.checkDeleteFails(OneNR.class);
		}

		// <element name="notcontainedtwowaynotrequired" type="xsd:IDREF"
		// ecore:reference="this:NotContainedChildNRT" minOccurs="0"
		// ecore:opposite="main"/>
		// NotContainedChildNRT notContainedChildNRT = factory.createNotContainedChildNRT();
		// 11) The main object can not be deleted without removing the ref to the child
		// 12) Reference to child can be set to nullable and child/main object can be deleted
		{
			store.beginTransaction();
			// check 11 and 12
			MainImpl main = (MainImpl) store.getObject(Main.class);
			OneCN delChild = main.getOnecn().get(0);
			main.getOnecn().remove(0);

			assertTrue(((EObject) main.getTwocr().get(0)).eContainer() == main);
			assertTrue((main.getTwocr().get(0)).getMain() == main);

			store.deleteObject(delChild);
			store.commitTransaction();
		}

		// <element name="notcontainedtwowaynotrequirednr" type="xsd:IDREF"
		// ecore:reference="this:NotContainedChildNRTNR" minOccurs="0"
		// ecore:opposite="main"/>
		// NotContainedChildNRTNR notContainedChildNRTNR = factory.createNotContainedChildNRTNR();
		// 15) the child object can be deleted because all references are null
		// 16) The child object can be unset from the main object
		{
			// check 14
			store.beginTransaction();
			MainImpl main = (MainImpl) store.getObject(Main.class);
			OneNN child = main.getOnenn().get(0);
			main.getOnenn().remove(0);
			store.deleteObject(child);
			store.commitTransaction();
		}

		// and do some counts
		{
			store.beginTransaction();
			store.checkNumber(OneCN.class, 1); // 0
			store.checkNumber(OneCR.class, 2); // 0
			store.checkNumber(OneNN.class, 1);
			store.checkNumber(OneNR.class, 2);
			store.checkNumber(TwoCR.class, 2); // 0
			store.checkNumber(TwoCN.class, ELEM_CNT); // 0
			store.checkNumber(TwoNR.class, 2);
			store.checkNumber(TwoNN.class, ELEM_CNT);
			store.commitTransaction();

		}

		// now make the main object deletable!
		{
			store.beginTransaction();

			MainImpl main = (MainImpl) store.getObject(Main.class);

			main.getOnenn().clear();
			main.getOnenr().clear();

			main.getTwonn().clear();
			main.getTwonr().clear();

			store.deleteObject(main);

			store.commitTransaction();
		}

		// and do some counts
		{
			store.beginTransaction();
			store.checkNumber(OneCN.class, 0);
			store.checkNumber(OneCR.class, 0);
			store.checkNumber(OneNN.class, 1);
			store.checkNumber(OneNR.class, 2);
			store.checkNumber(TwoCR.class, 0);
			store.checkNumber(TwoCN.class, 0);
			store.checkNumber(TwoNR.class, 2);
			store.checkNumber(TwoNN.class, ELEM_CNT);
			store.commitTransaction();

		}
	}
}
