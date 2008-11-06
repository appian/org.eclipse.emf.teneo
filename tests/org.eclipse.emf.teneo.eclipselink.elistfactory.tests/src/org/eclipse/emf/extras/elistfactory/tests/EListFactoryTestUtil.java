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

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;

public class EListFactoryTestUtil {

  public static GenModel loadGenModel(String genModelURI) {

    ResourceSet resourceSet = new ResourceSetImpl();
    URI genmodelURI = URI.createURI(genModelURI);
    Resource genModelResource = resourceSet.getResource(genmodelURI, true);
    return (GenModel) genModelResource.getContents().get(0);
  }

  public static String getListConstructor(final EList<?> eList) {

    String result = "";
    if (eList instanceof FeatureMap) {
      FeatureMap.Internal internalFeatureMap = (FeatureMap.Internal) eList;
      
      result += internalFeatureMap.getClass().getSimpleName();
      result += "(";
      result += "this";
      result += ", ";
      result += getFeatureIDName(internalFeatureMap.getEObject().eClass(), internalFeatureMap.getEStructuralFeature());
      if ((internalFeatureMap instanceof EObjectWithInverseEList) || (internalFeatureMap instanceof EObjectWithInverseResolvingEList) || (internalFeatureMap instanceof EObjectContainmentWithInverseEList)) {
        EReference eReference = ((EReference) internalFeatureMap.getEStructuralFeature());
        EReference eOppositeReference = eReference.getEOpposite();
        result += ", ";
        result += getFeatureIDName(eOppositeReference.getEContainingClass(), eOppositeReference);
      }
      result += ")";
    }
    else if (eList instanceof EcoreEMap) {
      EcoreEMap<?, ?> ecoreEMap = (EcoreEMap<?, ?>) eList;
      
      result += ecoreEMap.getClass().getSimpleName();
      result += "<" + getEntryFeatureInstanceClassSimpleName(ecoreEMap, "key") + "," + getEntryFeatureInstanceClassSimpleName(ecoreEMap, "value") + ">";
      result += "(";
      result += getEntryEClassLiteralName(ecoreEMap);
      result += ", ";
      result += ecoreEMap.getEStructuralFeature().getEType().getName() + "Impl.class";
      result += ", ";
      result += "this";
      result += ", ";
      result += getFeatureIDName(ecoreEMap.getEObject().eClass(), ecoreEMap.getEStructuralFeature());
      result += ")";
    }
    else if (eList instanceof EcoreEList) {
      EcoreEList<?> ecoreEList = (EcoreEList<?>) eList;

      result += getSimpleEcoreEListTypeName(ecoreEList.getClass().getName());
      result += "<" + ecoreEList.getEStructuralFeature().getEType().getInstanceClass().getSimpleName() + ">";
      result += "(";
      result += ecoreEList.getEStructuralFeature().getEType().getInstanceClass().getSimpleName() + ".class";
      result += ", ";
      result += "this";
      result += ", ";
      result += getFeatureIDName(ecoreEList.getEObject().eClass(), ecoreEList.getEStructuralFeature());
      if ((ecoreEList instanceof EObjectWithInverseEList) || (ecoreEList instanceof EObjectWithInverseResolvingEList) || (ecoreEList instanceof EObjectContainmentWithInverseEList)) {
        EReference eReference = ((EReference) ecoreEList.getEStructuralFeature());
        EReference eOppositeReference = eReference.getEOpposite();
        result += ", ";
        result += getFeatureIDName(eOppositeReference.getEContainingClass(), eOppositeReference);
      }
      result += ")";
    }
    return result;
  }
  
  public static String getListConstructorFromGenModel(final GenModel genModel, final EList<?> eList) {

    String result = "";
    EClass eOwnerClass = getOwnerClass(eList);
    if (eOwnerClass != null) {
      GenClass ownerGenClass = findGenClass(genModel, eOwnerClass);
      if (ownerGenClass != null) {
        String interfacePackageName = ownerGenClass.getGenPackage().getInterfacePackageName();
        ImportManager importManager = new ImportManager(interfacePackageName);
        importManager.addMasterImport(interfacePackageName, ownerGenClass.eClass().getName());
        genModel.setImportManager(importManager);

        EStructuralFeature eImplementedFeature = getImplementedFeature(eList);
        if (eImplementedFeature != null) {
          GenFeature implementedGenFeature = findGenFeature(genModel, eImplementedFeature);
          if (implementedGenFeature != null) {
            if (!implementedGenFeature.isVolatile() && implementedGenFeature.isListType()) {
              result = ownerGenClass.getListConstructor(implementedGenFeature);
            }
          }
        }

        genModel.setImportManager(null);
      }
    }
    return result;
  }

  //
  // helper methods
  //

  private static String getEntryFeatureInstanceClassSimpleName(EcoreEMap<?, ?> ecoreEMap, String entryFeatureName) {

    EClass eEntryType = (EClass) ecoreEMap.getEStructuralFeature().getEType();
    EStructuralFeature entryFeature = eEntryType.getEStructuralFeature(entryFeatureName);
    if (entryFeature != null) {
    	return entryFeature.getEType().getInstanceClass().getSimpleName();
    }
	return "";
  }

  private static String getEntryEClassLiteralName(final EcoreEMap<?, ?> ecoreEMap) {
    
    String result = getSimplePackageInterfaceName(ecoreEMap.getEObject().eClass());
    result += ".Literals.";
    result += CodeGenUtil.format(ecoreEMap.getEStructuralFeature().getEType().getName(), '_', null, false, false).toUpperCase(); 
    return result;
  }
  
  private static String getFeatureIDName(final EClass eOwnerClass, EStructuralFeature eStructuralFeature) {

    String result = getSimplePackageInterfaceName(eOwnerClass);
    result += ".";
    result += CodeGenUtil.format(eOwnerClass.getName(), '_', null, false, false).toUpperCase();
    result += "__";
    result += CodeGenUtil.format(eStructuralFeature.getName(), '_', null, false, false).toUpperCase();
    return result;
  }

  private static String getSimpleEcoreEListTypeName(String qualifiedEcoreEListTypeName) {

    String rawSimpleEcoreEListTypeName = qualifiedEcoreEListTypeName.substring(qualifiedEcoreEListTypeName.lastIndexOf(".") + 1, qualifiedEcoreEListTypeName.length());
    return rawSimpleEcoreEListTypeName.replace('$', '.');
  }

  private static String getSimplePackageInterfaceName(final EClass eClass) {

    String eSimplePackageClassName = eClass.getEPackage().getClass().getSimpleName();
    return eSimplePackageClassName.replaceFirst("Impl$", "");
  }

  private static EClass getOwnerClass(final EList<?> eList) {

    EClass result = null;
    if (eList instanceof EcoreEList) {
      EcoreEList<?> ecoreEList = (EcoreEList<?>) eList;
      result = ecoreEList.getEObject().eClass();
    }
    if (eList instanceof EcoreEMap) {
      EcoreEMap<?, ?> ecoreEMap = (EcoreEMap<?, ?>) eList;
      result = ecoreEMap.getEObject().eClass();
    }
    return result;
  }

  private static EStructuralFeature getImplementedFeature(final EList<?> eList) {

    EStructuralFeature result = null;
    if (eList instanceof EcoreEList) {
      EcoreEList<?> ecoreEList = (EcoreEList<?>) eList;
      result = ecoreEList.getEStructuralFeature();
    }
    if (eList instanceof EcoreEMap) {
      EcoreEMap<?, ?> ecoreEMap = (EcoreEMap<?, ?>) eList;
      result = ecoreEMap.getEStructuralFeature();
    }
    return result;
  }

  public static GenClass findGenClass(final GenModel genModel, final EClass eClass) {

    GenClass result = null;
    GenPackage genPackage = genModel.findGenPackage(eClass.getEPackage());
    if (genPackage != null) {
      for (Iterator<?> iter = genPackage.getGenClasses().iterator(); iter.hasNext();) {
        GenClass genClass = (GenClass) iter.next();
        if (eClass.getName().equals(genClass.getEcoreClass().getName())) {
          result = genClass;
        }
      }
    }
    return result;
  }

  public static GenFeature findGenFeature(final GenModel genModel, final EStructuralFeature eStructuralFeature) {

    GenFeature result = null;
    GenClass genClass = findGenClass(genModel, eStructuralFeature.getEContainingClass());
    for (Iterator<?> i = genClass.getGenFeatures().iterator(); i.hasNext();) {
      GenFeature genFeature = (GenFeature) i.next();
      if (eStructuralFeature.getName().equals(genFeature.getEcoreFeature().getName())) {
        result = genFeature;
      }
    }

    return result;
  }
}
