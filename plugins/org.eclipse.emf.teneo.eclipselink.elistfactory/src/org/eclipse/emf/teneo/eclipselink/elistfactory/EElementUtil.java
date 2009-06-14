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

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.eclipselink.elistfactory.internal.messages.Messages;
import org.eclipse.osgi.util.NLS;

public final class EElementUtil {

	private EElementUtil() {
	}

	public static boolean isListType(final EStructuralFeature eStructuralFeature) {
		return eStructuralFeature.isMany() || isFeatureMapEntryType(eStructuralFeature);
	}

	public static boolean isMapType(final EStructuralFeature eStructuralFeature) {
		return !isContainer(eStructuralFeature) && eStructuralFeature.isMany()
				&& (eStructuralFeature.getEType() instanceof EClass) && isJavaUtilMapEntryType(eStructuralFeature);
	}

	public static boolean isFeatureMapType(final EStructuralFeature eStructuralFeature) {
		return isFeatureMapEntryType(eStructuralFeature);
	}

	public static boolean isJavaUtilMapEntryType(final EStructuralFeature eStructuralFeature) {
		String instanceClassName = eStructuralFeature.getEType().getInstanceClassName();
		return "java.util.Map.Entry".equals(instanceClassName) || "java.util.Map$Entry".equals(instanceClassName); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public static boolean isFeatureMapEntryType(final EStructuralFeature eStructuralFeature) {
		String instanceClassName = eStructuralFeature.getEType().getInstanceClassName();
		return "org.eclipse.emf.ecore.util.FeatureMap.Entry".equals(instanceClassName) //$NON-NLS-1$
				|| "org.eclipse.emf.ecore.util.FeatureMap$Entry".equals(instanceClassName); //$NON-NLS-1$
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
			result = (!isContainer(eReference) && !isContainment(eReference) || containmentProxies)
					&& eReference.isResolveProxies();
		}
		return result;
	}

	public static String getQualifiedListItemTypeName(final EStructuralFeature eStructuralFeature) {
		String result = ""; //$NON-NLS-1$
		EClassifier eType = eStructuralFeature.getEType();
		if (eType instanceof EClass) {
			if (eType.getInstanceClassName() != null) {
				result = eType.getInstanceClassName();
			} else {
				result = getQualifiedInterfaceName(eType);
			}
		}

		if (eType instanceof EEnum) {
			return getQualifiedInterfaceName(eType);
		}

		if (eType instanceof EDataType) {
			if (isPrimitiveType(eType)) {
				result = getQualifiedPrimitiveObjectTypeName(eType);
			} else if ("org.eclipse.emf.common.util.Enumerator".equals(eType.getInstanceClassName())) { //$NON-NLS-1$
				EDataType eBaseType = ExtendedMetaDataUtil.getExtendedMetaData(eType).getBaseType((EDataType) eType);
				if (eBaseType instanceof EEnum) {
					result = getQualifiedInterfaceName(eBaseType);
				}
			} else {
				if (eType.getInstanceClassName() != null) {
					result = eType.getInstanceClassName();
				}
			}
		}
		return result;

	}

	public static int getDerivedStructuralFeatureID(final EObject eOwnerObject,
			final EStructuralFeature eStructuralFeature) throws ClassNotFoundException {
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
		Assert.isTrue(ePackageInterface != null, NLS.bind(
				Messages.assert_couldNotFindEPackageInterfaceOfEPackageClass$0, ePackageClass.getName()));
		return ePackageInterface.getPackage().getName();
	}

	public static String getQualifiedClassPackageName(final EClassifier eClassifier) {
		String eQualifiedPackageClassName = eClassifier.getEPackage().getClass().getName();
		return getPackageName(eQualifiedPackageClassName);
	}

	public static String getQualifiedInterfaceName(final EClassifier eClassifier) {
		return getQualifiedInterfacePackageName(eClassifier) + "." + getSimpleInterfaceName(eClassifier); //$NON-NLS-1$
	}

	public static String getQualifiedClassName(final EClassifier eClassifier) {

		return getQualifiedClassPackageName(eClassifier) + "." + getSimpleClassName(eClassifier); //$NON-NLS-1$
	}

	public static String getSimpleInterfaceName(final EClassifier eClassifier) {
		return eClassifier.getName();
	}

	public static String getSimpleClassName(final EClassifier eClassifier) {

		return getSimpleInterfaceName(eClassifier) + "Impl"; //$NON-NLS-1$
	}

	public static String getPackageName(String qualifiedTypeName) {
		return qualifiedTypeName.substring(0, qualifiedTypeName.lastIndexOf(".")); //$NON-NLS-1$
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
		if (instanceClass == java.lang.Boolean.TYPE) {
			return "java.lang.Boolean"; //$NON-NLS-1$
		}
		if (instanceClass == java.lang.Byte.TYPE) {
			return "java.lang.Byte"; //$NON-NLS-1$
		}
		if (instanceClass == java.lang.Character.TYPE) {
			return "java.lang.Character"; //$NON-NLS-1$
		}
		if (instanceClass == java.lang.Double.TYPE) {
			return "java.lang.Double"; //$NON-NLS-1$
		}
		if (instanceClass == java.lang.Float.TYPE) {
			return "java.lang.Float"; //$NON-NLS-1$
		}
		if (instanceClass == java.lang.Integer.TYPE) {
			return "java.lang.Integer"; //$NON-NLS-1$
		}
		if (instanceClass == java.lang.Long.TYPE) {
			return "java.lang.Long"; //$NON-NLS-1$
		}
		if (instanceClass == java.lang.Short.TYPE) {
			return "java.lang.Short"; //$NON-NLS-1$
		}
		return null;
	}

	public static EPackage findEPackage(final String ePackageNsURI) {
		Assert.isLegal(ePackageNsURI != null && ePackageNsURI.trim().length() > 0);

		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(ePackageNsURI);
		Assert.isTrue(ePackage != null, NLS
				.bind(Messages.assert_couldNotFindEPackageForNamespaceURI$0, ePackageNsURI));
		return ePackage;
	}

	public static EClass findEClass(final EPackage ePackage, final Class<?> javaClass) {
		return findEClass(ePackage, javaClass.getSimpleName().replaceFirst("Impl$", "")); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public static EClass findEClass(final EPackage ePackage, final String eClassName) {
		Assert.isNotNull(ePackage);
		Assert.isLegal(eClassName != null && eClassName.trim().length() > 0);

		EClassifier eOwnerClassifier = ePackage.getEClassifier(eClassName);
		Assert.isTrue(eOwnerClassifier != null, NLS.bind(
				Messages.assert_couldNotFindEClassifier$0InEPackage$1, eOwnerClassifier, ePackage
						.getName()));
		Assert.isTrue(eOwnerClassifier instanceof EClass, NLS.bind(
				Messages.assert_typeOfEClassifier$0InEPackage$1IsNotEClass, eOwnerClassifier.getName(),
				ePackage.getName()));
		return (EClass) eOwnerClassifier;
	}
}
