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
 * $Id: HbSequenceIdAction.java,v 1.2 2008/10/27 13:19:26 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.samples.emf.annotations.hb.generator.id.IdPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class HbSequenceIdAction extends AbstractTestAction {

	// this epackage is actually not tested!
	public HbSequenceIdAction() {
		super(IdPackage.eINSTANCE);
	}

	@Override
	public void doAction(TestStore store) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new EcoreResourceFactoryImpl());
		final ArrayList<EPackage> epackages = new ArrayList<EPackage>();
		try {
			final Resource res = resourceSet.createResource(URI.createURI("test.ecore"));
			res.load(this.getClass().getResourceAsStream("sequenceid.ecore"), Collections.EMPTY_MAP);

			final Iterator<EObject> it = res.getAllContents();
			while (it.hasNext()) {
				final Object obj = it.next();
				if (obj instanceof EPackage) {
					EPackage epack = (EPackage) obj;
					if (EPackage.Registry.INSTANCE.getEPackage(epack.getNsURI()) == null) {
						EPackage.Registry.INSTANCE.put(epack.getNsURI(), epack);
					}
					epackages.add(epack);
				}
			}
			System.err.println(HbHelper.INSTANCE.generateMapping(epackages.toArray(new EPackage[epackages.size()]),
				new Properties()));
		} catch (Exception e) {
			throw new Error(e);
		}
	}
}