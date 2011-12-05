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
 * $Id: ExternalAction.java,v 1.2 2011/02/27 20:10:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.teneo.TeneoException;
import org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalObject;
import org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest;
import org.eclipse.emf.teneo.samples.emf.sample.play.ActType;
import org.eclipse.emf.teneo.samples.emf.sample.play.FmType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage;
import org.eclipse.emf.teneo.samples.emf.sample.play.PlayType;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.junit.Assert;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class ExternalAction extends AbstractTestAction {
	public ExternalAction() {
		// touch the play package
		super(ExternalPackage.eINSTANCE);
		if (PlayPackage.eINSTANCE != null) {
			// initialized
		}

	}

	@Override
	public void doAction(TestStore store) {
		final ExternalFactory factory = ExternalFactory.eINSTANCE;

		EObject o1;
		EObject o2;
		EObject o3;
		try {
			// a file handle to the current class
			// the play.xml is in the model directory
			final URI uri = URI.createURI(this.getClass()
					.getResource("small_play.xml").toString());
			final Resource resource = new XMLResourceImpl(uri);
			resource.load(Collections.EMPTY_MAP);
			PlayType play = (PlayType) resource.getContents().get(0);
			o1 = play.getAct().get(0);
			o2 = play.getPersonae();
			o3 = play.getFm();

			// resource.unload();
		} catch (Exception e) {
			throw new TeneoException(e.getMessage(), e);
		}

		final ExternalObject external1 = ExternalFactory.eINSTANCE
				.createExternalObject();
		final ExternalObject external2 = ExternalFactory.eINSTANCE
				.createExternalObject();
		final ExternalObject external3 = ExternalFactory.eINSTANCE
				.createExternalObject();
		{
			final URI externalUri = URI.createURI("external.url");
			final Resource resource = new XMLResourceImpl(externalUri);
			resource.getContents().add(external1);
			resource.getContents().add(external2);
			resource.getContents().add(external3);
		}

		{
			store.beginTransaction();
			final ExternalTest et1 = factory.createExternalTest();
			et1.setName("et1");
			et1.setEObject(o1);
			et1.getEObjects().add(o3);
			et1.getEObjects().add(o1);
			et1.getEObjects().add(o2);
			et1.setExternalObject(external1);
			et1.getExternalObjects().add(external2);
			et1.getExternalObjects().add(external3);
			et1.setEClass(ExternalPackage.eINSTANCE.getExternalTest());
			store.store(et1);
			final ExternalTest et2 = factory.createExternalTest();
			et2.setName("et2");
			et2.setEObject(o2);
			et2.setEClass(ExternalPackage.eINSTANCE.getExternalTest());
			store.store(et2);
			store.commitTransaction();

			EcoreUtil.resolveAll(et2);
		}

		{
			boolean errorOccured = false;
			try {
				store.beginTransaction();
				store.store(ExternalFactory.eINSTANCE.createExternalObject());
				store.commitTransaction();
				errorOccured = false;
			} catch (Exception e) {
				errorOccured = true;
				try {
					store.rollbackTransaction();
				} catch (Exception x) {
					// ignore
				}
			}
			Assert.assertTrue(errorOccured);
		}

		try {
			final Resource res = store.getResource();
			final ResourceSet rs = new ResourceSetImpl();
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("xml", new XMLResourceFactoryImpl());
			rs.getResources().add(res);
			res.load(Collections.EMPTY_MAP);

			for (EObject eobj : res.getContents()) {
				final ExternalTest et = (ExternalTest) eobj;
				if (et.getName().equals("et1")) {
					
					assertTrue(et.getExternalObject() instanceof ExternalObject);
					Assert.assertTrue(((InternalEObject)et.getExternalObject()).eIsProxy());
					Assert.assertTrue(((InternalEObject)et.getExternalObjects().get(0)).eIsProxy());
					Assert.assertTrue(((InternalEObject)et.getExternalObjects().get(1)).eIsProxy());
					Assert.assertTrue(((InternalEObject)et.getExternalObject()).eProxyURI().toString().contains("external.url"));
					assertEquals(2, et.getExternalObjects().size());
					Assert.assertTrue(((InternalEObject)et.getExternalObjects().get(0)).eProxyURI().toString().contains("external.url"));
					Assert.assertTrue(((InternalEObject)et.getExternalObjects().get(1)).eProxyURI().toString().contains("external.url"));
					
					assertTrue(et.getEObject() instanceof ActType);
					int cnt = 0;
					assertEquals(3, et.getEObjects().size());
					for (EObject eo : et.getEObjects()) {
						if (cnt == 0) {
							assertTrue(eo instanceof FmType);
						}
						if (cnt == 1) {
							assertTrue(eo instanceof ActType);
						}
						if (cnt == 2) {
							assertTrue(eo instanceof PersonaeType);
						}
						cnt++;
					}
				} else {
					assertTrue(et.getEObject() instanceof PersonaeType);
				}
				assertEquals(et.getEClass(),
						ExternalPackage.eINSTANCE.getExternalTest());
			}
		} catch (Exception e) {
			throw new TeneoException(e.getMessage(), e);
		}
	}
}