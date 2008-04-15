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

import java.util.Iterator;

import junit.framework.TestCase;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.eclipselink.elistfactory.EElementUtil;
import org.eclipse.emf.teneo.eclipselink.elistfactory.EListFactory;

/**
 * Retrieves all classes from a preset model, looks for all
 * EList/EMap/FeatureMap features on theses classes and creates the
 * corresponding EList/EMap/FeatureMap instances for each of them. It concludes 
 * which constructors and which arguments have been used therefore, and makes 
 * sure that they are the very same as those which would normally come from the 
 * GenModel.  
 */
public class EListFactoryTest extends TestCase {

  private static final String TEST_PACKAGE_NS_URI = "http:///org/eclipse/emf/teneo/eclipselink/examples/library.ecore";
  private static final String TEST_GENMODEL_URI = "platform:/plugin/org.eclipse.emf.teneo.eclipselink.examples.library/model/library.genmodel";
//private static final String TEST_PACKAGE_NS_URI = "http:///org/eclipse/emf/examples/library/extlibrary.ecore/1.0.0";
//private static final String TEST_GENMODEL_URI = "platform:/plugin/org.eclipse.emf.examples.library/model/extlibrary.genmodel";
  
  private EPackage ePackage;
  private GenModel genModel;

  @Override
  protected void setUp() throws Exception {

    super.setUp();

    ePackage = EPackage.Registry.INSTANCE.getEPackage(TEST_PACKAGE_NS_URI);
    genModel = EListFactoryTestUtil.loadGenModel(TEST_GENMODEL_URI);
  }

  public void testEListFactory() throws ClassNotFoundException {

    for (Iterator i = ePackage.getEClassifiers().iterator(); i.hasNext();) {
      EClassifier eClassifier = (EClassifier) i.next();

      if (eClassifier instanceof EClass) {
        EClass eClass = (EClass) eClassifier;

        if (!eClass.isInterface() && !eClass.isAbstract()) {
          System.out.println(eClass.getName());

          for (Iterator j = eClass.getEAllStructuralFeatures().iterator(); j.hasNext();) {
            EStructuralFeature eStructuralFeature = (EStructuralFeature) j.next();
            System.out.println("  " + eStructuralFeature.getName());

            if (!eStructuralFeature.isVolatile() && EElementUtil.isListType(eStructuralFeature)) {
              try {
                EObject eObject = ePackage.getEFactoryInstance().create(eClass);
                EList eList = EListFactory.eINSTANCE.createEList(eObject, eStructuralFeature);

                String actualEListConstructor = EListFactoryTestUtil.getListConstructor(eList);
                String expectedEListConstructor = EListFactoryTestUtil.getListConstructorFromGenModel(genModel, eList);
                System.out.println("    EList constructor is: " + actualEListConstructor);
                if (!actualEListConstructor.equals(expectedEListConstructor)) {
                  System.out.println("    but should be:        " + expectedEListConstructor);
                }
                assertEquals("EList constructor as per BasicEListFactoryImpl does not match that coming from GenModel.", actualEListConstructor, expectedEListConstructor);
              }
              catch (Exception ex) {
                ex.printStackTrace();
              }
            }
          }
        }
      }
    }
  }
}
