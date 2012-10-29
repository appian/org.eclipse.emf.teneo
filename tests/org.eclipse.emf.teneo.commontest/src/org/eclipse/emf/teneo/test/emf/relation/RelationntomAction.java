/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * RelationntomAction.java,v 1.3 2007/02/08 23:11:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.relation;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomFactory;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.MainImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests many different kinds of 1:n relations
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class RelationntomAction extends AbstractTestAction {
	/** test constants */
	private static int NO_MAINS = 2;
	private static int NO_MULTIS = 2;

	/**
	 * Constructor
	 * 
	 * @param arg0
	 */
	public RelationntomAction() {
		super(RelationntomPackage.eINSTANCE);
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
		final RelationntomFactory factory = RelationntomFactory.eINSTANCE;

		{
			store.beginTransaction();

			final ArrayList<MultiNN> multinns = new ArrayList<MultiNN>();
			for (int i = 0; i < NO_MULTIS; i++) {
				MultiNN multinn = factory.createMultiNN();
				multinn.setName(" multinn " + i);
				multinns.add(multinn);
				store.store(multinn);
			}

			final ArrayList<MultiNR> multinrs = new ArrayList<MultiNR>();
			for (int i = 0; i < NO_MULTIS; i++) {
				MultiNR multi = factory.createMultiNR();
				multi.setName(" multinr " + i);
				multinrs.add(multi);
			}

			final ArrayList<MultiRN> multirns = new ArrayList<MultiRN>();
			for (int i = 0; i < NO_MULTIS; i++) {
				MultiRN multi = factory.createMultiRN();
				multi.setName(" multirn " + i);
				multirns.add(multi);
			}

			for (int m = 0; m < NO_MAINS; m++) {
				Main main = factory.createMain();
				main.setName("main");

				main.getMultirn().addAll(multirns);
				for (int i = 0; i < multinns.size(); i++) {
					main.getMultinn().add(multinns.get(i));
				}

				main.getMultinr().addAll(multinrs);
				store.store(main);
			}
			store.commitTransaction();
		}

		{
			store.beginTransaction();

			final List<?> mains = store.getObjects(Main.class);
			assertTrue(mains.size() == NO_MAINS);
			for (int i = 0; i < mains.size(); i++) {
				final MainImpl main = (MainImpl) mains.get(i);
				assertEquals(NO_MULTIS, main.getMultinn().size());
				assertEquals(NO_MULTIS, main.getMultirn().size());
				assertEquals(NO_MULTIS, main.getMultinr().size());

				for (int k = 0; k < main.getMultinn().size(); k++) {
					MultiNN multinn = main.getMultinn().get(k);
					assertEquals(NO_MAINS, multinn.getMain().size());
					assertTrue(mains.containsAll(multinn.getMain()));
				}
				for (int k = 0; k < main.getMultinr().size(); k++) {
					MultiNR multinr = main.getMultinr().get(k);
					assertEquals(NO_MAINS, multinr.getMain().size());
					assertTrue(mains.containsAll(multinr.getMain()));
				}
				for (int k = 0; k < main.getMultirn().size(); k++) {
					MultiRN multirn = main.getMultirn().get(k);
					assertEquals(NO_MAINS, multirn.getMain().size());
					assertTrue(mains.containsAll(multirn.getMain()));
				}
			}

			// prod = (ProductType)store.query("SELECT FROM
			// org.eclipse.emf.teneo.test.emf.catalog.gen.impl.ProductTypeImpl WHERE
			// remark.contains(rem) && rem.value == \"remarka\" VARIABLES
			// org.eclipse.emf.teneo.test.emf.catalog.gen.impl.StringTypeImpl rem", 1).get(0);
			store.commitTransaction();
		}

		/*
		 * // check that the main object can not be deleted { store.checkDeleteFails(Main.class); } //
		 * <element name="containedonewayrequired" type="this:ContainedChildR"/> // 1) we should check
		 * here that this child can not be deleted separately { // check 1
		 * store.checkDeleteFails(OneNR.class); } //<element name="containedoneWaynotrequired"
		 * type="this:ContainedChildNR" minOccurs="0"/> // 3) Direct delete of the child should not be
		 * possible as the parent points to it // 4) if the main object is deleted then this child
		 * should also be deleted automatically //ContainedChildNR containedChildNR =
		 * factory.createContainedChildNR(); { // check 3 store.checkDeleteFails(OneNR.class); //
		 * restore again store.beginTransaction(); MainImpl main =
		 * (MainImpl)store.getObject(Main.class); // check the econtainer assertTrue("Size of all
		 * collections is 2", main.getOnecr().size() == 2); assertTrue("Size of all collections is
		 * 2", main.getOnecn().size() == 2); assertTrue("Size of all collections is 2",
		 * main.getOnenr().size() == 2); assertTrue("Size of all collections is 2",
		 * main.getOnenn().size() == 2); assertTrue("Size of all collections is 2",
		 * main.getTwocr().size() == 2); assertTrue("Size of all collections is 2",
		 * main.getTwocn().size() == 100); assertTrue("Size of all collections is 2",
		 * main.getTwonr().size() == 2); assertTrue("Size of all collections is 2",
		 * main.getTwonn().size() == 100); assertTrue("EContainer is null",
		 * ((EObject)main.getOnecn().get(0)).eContainer() != null); assertTrue("EContainer is null",
		 * ((EObject)main.getOnecr().get(1)).eContainer() != null); assertTrue("EContainer is null",
		 * ((EObject)main.getTwonn().get(1)).eContainer() == null); assertTrue("EContainer is null",
		 * ((EObject)main.getTwonr().get(1)).eContainer() == null); OneCR onecr = factory.createOneCR();
		 * onecr.setName("onecr3"); main.getOnecr().add(onecr); main.getOnecr().remove(0);
		 * store.commitTransaction(); // should be two now (no cascading delete yet!)
		 * store.beginTransaction(); store.checkNumber(OneCR.class, 2); store.commitTransaction(); }
		 * //<element name="notcontainedonewayrequired" type="xsd:IDREF"
		 * ecore:reference="this:NotContainedChildR"/> // 6b) Element has to be set when parent is saved
		 * { // check 6 store.checkDeleteFails(OneNR.class); } //<element
		 * name="notcontainedtwowaynotrequired" type="xsd:IDREF"
		 * ecore:reference="this:NotContainedChildNRT" minOccurs="0" ecore:opposite="main"/>
		 * //NotContainedChildNRT notContainedChildNRT = factory.createNotContainedChildNRT(); // 11)
		 * The main object can not be deleted without removing the ref to the child // 12) Reference to
		 * child can be set to nullable and child/main object can be deleted { store.beginTransaction();
		 * // check 11 and 12 MainImpl main = (MainImpl)store.getObject(Main.class); OneCN delChild =
		 * (OneCN)main.getOnecn().get(0); main.getOnecn().remove(0); store.deleteObject(delChild);
		 * store.commitTransaction(); } //<element name="notcontainedtwowaynotrequirednr"
		 * type="xsd:IDREF" ecore:reference="this:NotContainedChildNRTNR" minOccurs="0"
		 * ecore:opposite="main"/> //NotContainedChildNRTNR notContainedChildNRTNR =
		 * factory.createNotContainedChildNRTNR(); // 15) the child object can be deleted because all
		 * references are null // 16) The child object can be unset from the main object { // check 14
		 * store.beginTransaction(); MainImpl main = (MainImpl)store.getObject(Main.class); OneNN child
		 * = (OneNN)main.getOnenn().get(0); main.getOnenn().remove(0); store.deleteObject(child);
		 * store.commitTransaction(); } // and do some counts { store.beginTransaction();
		 * store.checkNumber(OneCN.class, 1); //0 store.checkNumber(OneCR.class, 2); //0
		 * store.checkNumber(OneNN.class, 1); store.checkNumber(OneNR.class, 2);
		 * store.checkNumber(TwoCR.class, 2); //0 store.checkNumber(TwoCN.class, 100); //0
		 * store.checkNumber(TwoNR.class, 2); store.checkNumber(TwoNN.class, 100);
		 * store.commitTransaction(); } // now make the main object deletable! {
		 * store.beginTransaction(); MainImpl main = (MainImpl)store.getObject(Main.class);
		 * main.getOnenn().clear(); main.getOnenr().clear(); main.getTwonn().clear();
		 * main.getTwonr().clear(); store.deleteObject(main); store.commitTransaction(); } // and do
		 * some counts { store.beginTransaction(); store.checkNumber(OneCN.class, 0);
		 * store.checkNumber(OneCR.class, 0); store.checkNumber(OneNN.class, 1);
		 * store.checkNumber(OneNR.class, 2); store.checkNumber(TwoCR.class, 0);
		 * store.checkNumber(TwoCN.class, 0); store.checkNumber(TwoNR.class, 2);
		 * store.checkNumber(TwoNN.class, 100); store.commitTransaction(); }
		 */
	}
}
