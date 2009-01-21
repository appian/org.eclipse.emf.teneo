/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.extras.elistfactory.tests;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.eclipselink.elistfactory.EListFactory;

/**
 * Creates EList and EMap instances for a preset model object and structural feature, concludes which constructor and
 * which arguments have been used therefore, and displays the same at the console.
 */
public class EListFactoryUsageTest extends TestCase {

	private static final String TEST_PACKAGE_NS_URI = "http:///org/eclipse/emf/teneo/eclipselink/examples/library.ecore";
	// private static final String TEST_PACKAGE_NS_URI =
	// "http:///org/eclipse/emf/examples/library/extlibrary.ecore/1.0.0";

	private static final String ELIST_TEST_CLASS_NAME = "Library";
	private static final String ELIST_TEST_FEATURE_NAME = "books";

	private static final String EMAP_TEST_CLASS_NAME = null;
	private static final String EMAP_TEST_FEATURE_NAME = null;

	public void testRegularEListEMapUsage1() throws ClassNotFoundException {

		if (ELIST_TEST_FEATURE_NAME == null) {
			return;
		}

		EList<?> eWritersList = EListFactory.eINSTANCE.createEList(TEST_PACKAGE_NS_URI, ELIST_TEST_CLASS_NAME,
				ELIST_TEST_FEATURE_NAME);
		System.out.println(EListFactoryTestUtil.getListConstructor(eWritersList));
	}

	public void testRegularEListEMapUsage2() throws ClassNotFoundException {

		if (ELIST_TEST_FEATURE_NAME == null) {
			return;
		}

		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(TEST_PACKAGE_NS_URI);
		EClass eLibraryClass = (EClass) ePackage.getEClassifier(ELIST_TEST_CLASS_NAME);
		EFactory eLibraryFactory = ePackage.getEFactoryInstance();
		EObject eLibrary = eLibraryFactory.create(eLibraryClass);

		EList<?> eWritersList = EListFactory.eINSTANCE.createEList(eLibrary, ELIST_TEST_FEATURE_NAME);
		System.out.println(EListFactoryTestUtil.getListConstructor(eWritersList));
	}

	public void testRegularEListEMapUsage3() throws ClassNotFoundException {

		if (ELIST_TEST_FEATURE_NAME == null) {
			return;
		}

		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(TEST_PACKAGE_NS_URI);
		EClass eLibraryClass = (EClass) ePackage.getEClassifier(ELIST_TEST_CLASS_NAME);
		EFactory eLibraryFactory = ePackage.getEFactoryInstance();
		EObject eLibrary = eLibraryFactory.create(eLibraryClass);

		EStructuralFeature eBooksFeature = eLibraryClass.getEStructuralFeature(ELIST_TEST_FEATURE_NAME);

		EList<?> eWritersList = EListFactory.eINSTANCE.createEList(eLibrary, eBooksFeature);
		System.out.println(EListFactoryTestUtil.getListConstructor(eWritersList));
	}

	public void testRegularEMapUsage1() throws ClassNotFoundException {

		if (EMAP_TEST_FEATURE_NAME == null) {
			return;
		}

		EMap<?, ?> eBooksMap = EListFactory.eINSTANCE.createEMap(TEST_PACKAGE_NS_URI, EMAP_TEST_CLASS_NAME,
				EMAP_TEST_FEATURE_NAME);
		System.out.println(EListFactoryTestUtil.getListConstructor(eBooksMap));
	}

	public void testRegularEMapUsage2() throws ClassNotFoundException {

		if (EMAP_TEST_FEATURE_NAME == null) {
			return;
		}

		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(TEST_PACKAGE_NS_URI);
		EClass eLibraryClass = (EClass) ePackage.getEClassifier(EMAP_TEST_CLASS_NAME);
		EFactory eLibraryFactory = ePackage.getEFactoryInstance();
		EObject eLibrary = eLibraryFactory.create(eLibraryClass);

		EMap<?, ?> eBooksMap = EListFactory.eINSTANCE.createEMap(eLibrary, EMAP_TEST_FEATURE_NAME);
		System.out.println(EListFactoryTestUtil.getListConstructor(eBooksMap));
	}

	public void testRegularEMapUsage3() throws ClassNotFoundException {

		if (EMAP_TEST_FEATURE_NAME == null) {
			return;
		}

		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(TEST_PACKAGE_NS_URI);
		EClass eLibraryClass = (EClass) ePackage.getEClassifier(EMAP_TEST_CLASS_NAME);
		EFactory eLibraryFactory = ePackage.getEFactoryInstance();
		EObject eLibrary = eLibraryFactory.create(eLibraryClass);

		EStructuralFeature eBooksFeature = eLibraryClass.getEStructuralFeature(EMAP_TEST_FEATURE_NAME);

		EMap<?, ?> eBooksMap = EListFactory.eINSTANCE.createEMap(eLibrary, eBooksFeature);
		System.out.println(EListFactoryTestUtil.getListConstructor(eBooksMap));
	}
}
