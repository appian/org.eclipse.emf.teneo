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
package org.eclipse.emf.teneo.eclipselink.elistfactory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

public final class EElementUtil {

  private EElementUtil() {

  }

  public static boolean isListType(final EStructuralFeature eStructuralFeature) {

    return eStructuralFeature.isMany() || isFeatureMapEntryType(eStructuralFeature);
  }

  public static boolean isMapType(final EStructuralFeature eStructuralFeature) {

    return !isContainer(eStructuralFeature) && eStructuralFeature.isMany() && (eStructuralFeature.getEType() instanceof EClass) && isJavaUtilMapEntryType(eStructuralFeature);
  }

  public static boolean isFeatureMapType(final EStructuralFeature eStructuralFeature) {

    return isFeatureMapEntryType(eStructuralFeature);
  }

  public static boolean isJavaUtilMapEntryType(final EStructuralFeature eStructuralFeature) {

    String instanceClassName = eStructuralFeature.getEType().getInstanceClassName();
    return "java.util.Map.Entry".equals(instanceClassName) || "java.util.Map$Entry".equals(instanceClassName);
  }

  public static boolean isFeatureMapEntryType(final EStructuralFeature eStructuralFeature) {

    String instanceClassName = eStructuralFeature.getEType().getInstanceClassName();
    return "org.eclipse.emf.ecore.util.FeatureMap.Entry".equals(instanceClassName) || "org.eclipse.emf.ecore.util.FeatureMap$Entry".equals(instanceClassName);
  }

  public static boolean isContainer(final EStructuralFeature eStructuralFeature) {

    boolean result = false;
    if (eStructuralFeature instanceof EReference) {
      EReference eReference = (EReference) eStructuralFeature;
      EReference eOppositeReference = eReference.getEOpposite();
      result = (eOppositeReference != null) && eOppositeReference.isContainment();
    }
    return result;
  }

  public static boolean isContainment(final EStructuralFeature eStructuralFeature) {

    boolean result = false;
    if (eStructuralFeature instanceof EReference) {
      EReference eReference = (EReference) eStructuralFeature;
      result = eReference.isContainment();
    }
    return result;
  }

  public static boolean isBidirectional(final EStructuralFeature eStructuralFeature) {

    boolean result = false;
    if (eStructuralFeature instanceof EReference) {
      EReference eReference = (EReference) eStructuralFeature;
      result = eReference.getEOpposite() != null;
    }
    return result;
  }

  public static boolean isResolveProxies(final EStructuralFeature eStructuralFeature) {
   
    return isResolveProxies(eStructuralFeature, false);
  }
  
  public static boolean isResolveProxies(final EStructuralFeature eStructuralFeature, final boolean containmentProxies) {

    boolean result = false;
    if (eStructuralFeature instanceof EReference) {
      EReference eReference = (EReference) eStructuralFeature;
      result = (!isContainer(eReference) && !isContainment(eReference) || containmentProxies) && eReference.isResolveProxies();
    }
    return result;
  }

  public static String getQualifiedListItemTypeName(final EStructuralFeature eStructuralFeature) {

    String result = "";
    EClassifier eType = eStructuralFeature.getEType();
    if (eType instanceof EClass) {
      if (eType.getInstanceClassName() != null) {
        result = eType.getInstanceClassName();
      }
      else {
        result = getQualifiedInterfaceName(eType);
      }
    }

    if (eType instanceof EEnum) {
      return getQualifiedInterfaceName(eType);
    }

    if (eType instanceof EDataType) {
      if (isPrimitiveType(eType)) {
        result = getQualifiedPrimitiveObjectTypeName(eType);
      }
      else if ("org.eclipse.emf.common.util.Enumerator".equals(eType.getInstanceClassName())) {
        EDataType eBaseType = ExtendedMetaDataUtil.getExtendedMetaData(eType).getBaseType((EDataType) eType);
        if (eBaseType instanceof EEnum) {
          result = getQualifiedInterfaceName(eBaseType);
        }
      }
      else {
        if (eType.getInstanceClassName() != null) {
          result = eType.getInstanceClassName();
        }
      }
    }
    return result;

  }

  public static int getDerivedStructuralFeatureID(final EObject eOwnerObject, final EStructuralFeature eStructuralFeature) throws ClassNotFoundException {

    int featureID = eStructuralFeature.getFeatureID();
    Class<?> containingClass = eStructuralFeature.getEContainingClass().getInstanceClass();
	return ((InternalEObject) eOwnerObject).eDerivedStructuralFeatureID(featureID, containingClass);
  }

  public static String getQualifiedInterfacePackageName(final EClassifier eClassifier) {

    Class<? extends EPackage> ePackageClass = eClassifier.getEPackage().getClass();
    Class<?> ePackageInterface = null;
    for (int i = 0; (i < ePackageClass.getInterfaces().length) && (ePackageInterface == null); i++) {
      String interfaceName = ePackageClass.getInterfaces()[i].getSimpleName();
      if (ePackageClass.getSimpleName().startsWith(interfaceName)) {
        ePackageInterface = ePackageClass.getInterfaces()[i];
      }
    }
    if (ePackageInterface == null) {
      String msg = "Could not find Ecore package interface of Ecore package class '" + ePackageClass.getName() + "'.";
      throw new IllegalStateException(msg);
    }
    return ePackageInterface.getPackage().getName();
  }

  public static String getQualifiedClassPackageName(final EClassifier eClassifier) {

    String eQualifiedPackageClassName = eClassifier.getEPackage().getClass().getName();
    return getPackageName(eQualifiedPackageClassName);
  }

  public static String getQualifiedInterfaceName(final EClassifier eClassifier) {

    return getQualifiedInterfacePackageName(eClassifier) + "." + getSimpleInterfaceName(eClassifier);
  }

  public static String getQualifiedClassName(final EClassifier eClassifier) {

    return getQualifiedClassPackageName(eClassifier) + "." + getSimpleClassName(eClassifier);
  }

  public static String getSimpleInterfaceName(final EClassifier eClassifier) {

    return eClassifier.getName();
  }

  public static String getSimpleClassName(final EClassifier eClassifier) {

    return getSimpleInterfaceName(eClassifier) + "Impl";
  }

  public static String getPackageName(String qualifiedTypeName) {

    return qualifiedTypeName.substring(0, qualifiedTypeName.lastIndexOf("."));
  }

  public static boolean isPrimitiveType(final EClassifier eClassifier) {

    boolean result = false;
    Class<?> instanceClass = eClassifier.getInstanceClass();
    if (instanceClass != null) {
      result = instanceClass.isPrimitive();
    }
    return result;
  }

  public static String getQualifiedPrimitiveObjectTypeName(final EClassifier eClassifier) {

    Class<?> instanceClass = eClassifier.getInstanceClass();
    if (instanceClass == java.lang.Boolean.TYPE)
      return "java.lang.Boolean";
    if (instanceClass == java.lang.Byte.TYPE)
      return "java.lang.Byte";
    if (instanceClass == java.lang.Character.TYPE)
      return "java.lang.Character";
    if (instanceClass == java.lang.Double.TYPE)
      return "java.lang.Double";
    if (instanceClass == java.lang.Float.TYPE)
      return "java.lang.Float";
    if (instanceClass == java.lang.Integer.TYPE)
      return "java.lang.Integer";
    if (instanceClass == java.lang.Long.TYPE)
      return "java.lang.Long";
    if (instanceClass == java.lang.Short.TYPE)
      return "java.lang.Short";
    return null;
  }
  
  public static EPackage findEPackage(final String ePackageNsURI) {

    if ((ePackageNsURI == null) || (ePackageNsURI.trim().length() == 0)) {
      String msg = "Argument for parameter 'ePackageNsURI' must not be blank.";
      throw new IllegalArgumentException(msg);
    }

    EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(ePackageNsURI);
    if (ePackage == null) {
      String msg = "Could not find Ecore package for namespace URI '" + ePackageNsURI + "'.";
      throw new IllegalStateException(msg);
    }
    return ePackage;
  }

  public static EClass findEClass(final EPackage ePackage, final Class<?> javaClass) {
    
    return findEClass(ePackage, javaClass.getSimpleName().replaceFirst("Impl$", ""));
  }
  
  public static EClass findEClass(final EPackage ePackage, final String eClassName) {

    if (ePackage == null) {
      String msg = "Argument for parameter 'ePackage' must not be null.";
      throw new IllegalArgumentException(msg);
    }
    if ((eClassName == null) || (eClassName.trim().length() == 0)) {
      String msg = "Argument for parameter 'eClassName' must not be blank.";
      throw new IllegalArgumentException(msg);
    }

    EClassifier eOwnerClassifier = ePackage.getEClassifier(eClassName);
    if (eOwnerClassifier == null) {
      String msg = "Could not find Ecore classifier named '" + eOwnerClassifier + "' in Ecore package '" + ePackage.getName() + "'.";
      throw new IllegalStateException(msg);
    }
    if (!(eOwnerClassifier instanceof EClass)) {
      String msg = "Type of Ecore classifier '" + eOwnerClassifier.getName() + "' in Ecore package '" + ePackage.getName() + "' is not 'EClass'.";
      throw new IllegalStateException(msg);
    }
    return (EClass) eOwnerClassifier;
  }
}
