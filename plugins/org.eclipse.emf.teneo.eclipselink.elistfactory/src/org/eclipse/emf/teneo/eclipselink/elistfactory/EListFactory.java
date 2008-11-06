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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A factory for creating instances of
 * {@link org.eclipse.emf.common.util.EList <em><b>EList</b></em>},
 * {@link org.eclipse.emf.common.util.EMap <em><b>EMap</b></em>}, and
 * {@link org.eclipse.emf.ecore.util.FeatureMap <em><b>FeatureMap</b></em>} for
 * a given owner object and structural feature.
 * <p>
 * It figures out the appropriate
 * {@link org.eclipse.emf.common.util.EList <em>EList</em>} implementation by
 * analyzing the Ecore properties of the underlying structural feature. The
 * resulting {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance
 * is of the very same type as when it is created and retrieved using the
 * structural feature's get accessor method on its owner class.
 * </p>
 */
public interface EListFactory {

  /**
   * Temporary singleton instance of the EList factory.
   * <p>
   * Should be replaced by a generated subclass of
   * {@link org.eclipse.emf.teneo.eclipselink.elistfactory.BasicEListFactoryImpl <em><b>BasicEListFactoryImpl</b></em>}
   * which could be nested into the model factory class and made available by an
   * additional get accessor on the model factory interface. This ensures that
   * any generator model settings the EList factory's behavior depends on (e.g.
   * suppress containment, suppress notifiation, feature map wrapper class) are
   * automatically taken into account and don't need to be repeated an kept up
   * to date in a manually created subclass of the EList factory.
   * </p>
   */
  public static final EListFactory eINSTANCE = new BasicEListFactoryImpl();

  /**
   * Creates a new
   * {@link org.eclipse.emf.common.util.EList <em><b>EList</b></em>} instance,
   * of the appropriate type, and returns it.
   * <p>
   * It creates a new instance of the specified owner class, and then creates an
   * {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance according
   * to the Ecore properties of that owner class instance and the specified
   * structural feature. Depending on the situation, the resulting
   * {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance may
   * actually be an {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} or
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>} instance.
   * The owner of the resulting
   * {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance is the
   * newly created owner class instance.
   * </p>
   * <p>
   * This method is useful in cases where an
   * {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance and its
   * owner object are to be created at once. The new owner object can be
   * retrieved by calling
   * {@link org.eclipse.emf.ecore.util.EcoreEList#getEObject <code>getEObject()</code>}
   * on the returned {@link org.eclipse.emf.common.util.EList <em>EList</em>}
   * instance.
   * </p>
   * 
   * @param ePackageNsURI
   *          namespace URI of the Ecore package containing
   *          <em>eQualifiedOwnerClassName</em>.
   * @param eOwnerClassName
   *          simple class name of the <em>eStructuralFeatureName</em>'s and the
   *          resulting {@link org.eclipse.emf.common.util.EList <em>EList</em>}
   *          instance's owner object.
   * @param eStructuralFeatureName
   *          name of the structural feature for which the
   *          {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance
   *          is to be created.
   * @return the newly created
   *         {@link org.eclipse.emf.common.util.EList <em><b>EList</b></em>}
   *         instance.
   * @throws ClassNotFoundException
   */
  <E> EList<E> createEList(final String ePackageNsURI, final String eOwnerClassName, final String eStructuralFeatureName) throws ClassNotFoundException;

  /**
   * Creates a new
   * {@link org.eclipse.emf.common.util.EList <em><b>EList</b></em>} instance,
   * of the appropriate type, and returns it.
   * <p>
   * The {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance is
   * created according to the Ecore properties of the specified owner object and
   * structural feature. Depending on the situation, the resulting
   * {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance may
   * actually be an {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} or
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>} instance.
   * The owner of the resulting
   * {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance is the
   * specified owner object.
   * </p>
   * <p>
   * This method is useful in cases where an
   * {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance for an
   * already existing owner object is to be created.
   * </p>
   * 
   * @param eOwnerObject
   *          owner object of <em>eStructuralFeatureName</em> as well as the
   *          resulting {@link org.eclipse.emf.common.util.EList <em>EList</em>}
   *          instance.
   * @param eStructuralFeatureName
   *          name of the structural feature for which the
   *          {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance
   *          is to be created.
   * @return the newly created
   *         {@link org.eclipse.emf.common.util.EList <em><b>EList</b></em>}
   *         instance.
   * @throws ClassNotFoundException
   */
  <E> EList<E> createEList(final EObject eOwnerObject, final String eStructuralFeatureName) throws ClassNotFoundException;

  /**
   * Creates a new
   * {@link org.eclipse.emf.common.util.EList <em><b>EList</b></em>} instance,
   * of the appropriate type, and returns it.
   * <p>
   * The {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance is
   * created according to the Ecore properties of the specified owner object and
   * structural feature. Depending on the situation, the resulting
   * {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance may
   * actually be an {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} or
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>} instance.
   * The owner of the resulting
   * {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance is the
   * specified owner object.
   * </p>
   * <p>
   * This method is useful in cases where an
   * {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance for an
   * already existing owner object is to be created.
   * </p>
   * 
   * @param eOwnerObject
   *          owner object of <em>eStructuralFeature</em> as well as the
   *          resulting {@link org.eclipse.emf.common.util.EList <em>EList</em>}
   *          instance.
   * @param eStructuralFeature
   *          structural feature for which the
   *          {@link org.eclipse.emf.common.util.EList <em>EList</em>} instance
   *          is to be created.
   * @return the newly created
   *         {@link org.eclipse.emf.common.util.EList <em><b>EList</b></em>}
   *         instance.
   * @throws ClassNotFoundException
   */
  <E> EList<E> createEList(final EObject eOwnerObject, final EStructuralFeature eStructuralFeature) throws ClassNotFoundException;

  /**
   * Creates a new {@link org.eclipse.emf.common.util.EMap <em><b>EMap</b></em>}
   * instance, of the appropriate type, and returns it.
   * <p>
   * It creates a new instance of the specified owner class, and then creates an
   * {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance according
   * to the Ecore properties of that owner class instance and the specified
   * structural feature. The owner of the resulting
   * {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance is the
   * newly created owner class instance.
   * </p>
   * <p>
   * This method is useful in cases where an
   * {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance and its
   * owner object are to be created at once. The new owner object can be
   * retrieved by calling
   * {@link org.eclipse.emf.ecore.util.EcoreEMap#getEObject <code>getEObject()</code>}
   * on the returned {@link org.eclipse.emf.common.util.EMap <em>EMap</em>}
   * instance.
   * </p>
   * 
   * @param ePackageNsURI
   *          namespace URI of the Ecore package containing
   *          <em>eQualifiedOwnerClassName</em>.
   * @param eOwnerClassName
   *          simple class name of the <em>eStructuralFeatureName</em>'s and the
   *          resulting {@link org.eclipse.emf.common.util.EMap <em>EMap</em>}
   *          instance's owner object.
   * @param eStructuralFeatureName
   *          name of the structural feature for which the
   *          {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance is
   *          to be created.
   * @return the newly created
   *         {@link org.eclipse.emf.common.util.EMap <em><b>EMap</b></em>}
   *         instance.
   * @throws ClassNotFoundException
   */
  <K, V> EMap<K, V> createEMap(final String ePackageNsURI, final String eOwnerClassName, final String eStructuralFeatureName) throws ClassNotFoundException;

  /**
   * Creates a new {@link org.eclipse.emf.common.util.EMap <em><b>EMap</b></em>}
   * instance, of the appropriate type, and returns it.
   * <p>
   * The {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance is
   * created according to the Ecore properties of the specified owner object and
   * structural feature. The owner of the resulting
   * {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance is the
   * specified owner object.
   * </p>
   * <p>
   * This method is useful in cases where an
   * {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance for an
   * already existing owner object is to be created.
   * </p>
   * 
   * @param eOwnerObject
   *          owner object of <em>eStructuralFeatureName</em> as well as the
   *          resulting {@link org.eclipse.emf.common.util.EMap <em>EMap</em>}
   *          instance.
   * @param eStructuralFeatureName
   *          name of the structural feature for which the
   *          {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance is
   *          to be created.
   * @return the newly created
   *         {@link org.eclipse.emf.common.util.EMap <em><b>EMap</b></em>}
   *         instance.
   * @throws ClassNotFoundException
   */
  <K, V> EMap<K, V> createEMap(final EObject eOwnerObject, final String eStructuralFeatureName) throws ClassNotFoundException;

  /**
   * Creates a new {@link org.eclipse.emf.common.util.EMap <em><b>EMap</b></em>}
   * instance, of the appropriate type, and returns it.
   * <p>
   * The {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance is
   * created according to the Ecore properties of the specified owner object and
   * structural feature. The owner of the resulting
   * {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance is the
   * specified owner object.
   * </p>
   * <p>
   * This method is useful in cases where an
   * {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance for an
   * already existing owner object is to be created.
   * </p>
   * 
   * @param eOwnerObject
   *          owner object of <em>eStructuralFeature</em> as well as the
   *          resulting {@link org.eclipse.emf.common.util.EMap <em>EMap</em>}
   *          instance.
   * @param eStructuralFeature
   *          structural feature for which the
   *          {@link org.eclipse.emf.common.util.EMap <em>EMap</em>} instance is
   *          to be created.
   * @return the newly created
   *         {@link org.eclipse.emf.common.util.EMap <em><b>EMap</b></em>}
   *         instance.
   * @throws ClassNotFoundException
   */
  <K, V> EMap<K, V> createEMap(final EObject eOwnerObject, final EStructuralFeature eStructuralFeature) throws ClassNotFoundException;

  /**
   * Creates a new
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em><b>FeatureMap</b></em>}
   * instance, of the appropriate type, and returns it.
   * <p>
   * It creates a new instance of the specified owner class, and then creates an
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>} instance
   * according to the Ecore properties of that owner class instance and the
   * specified structural feature. The owner of the resulting
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>} instance
   * is the newly created owner class instance.
   * </p>
   * <p>
   * This method is useful in cases where a
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>} instance
   * and its owner object are to be created at once. The new owner object can be
   * retrieved by calling
   * {@link org.eclipse.emf.ecore.util.BasicFeatureMap#getEObject <code>getEObject()</code>}
   * on the returned
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>} instance.
   * </p>
   * 
   * @param ePackageNsURI
   *          namespace URI of the Ecore package containing
   *          <em>eQualifiedOwnerClassName</em>.
   * @param eOwnerClassName
   *          simple class name of the <em>eStructuralFeatureName</em>'s and the
   *          resulting
   *          {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>}
   *          instance's owner object.
   * @param eStructuralFeatureName
   *          name of the structural feature for which the
   *          {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>}
   *          instance is to be created.
   * @return the newly created
   *         {@link org.eclipse.emf.ecore.util.FeatureMap <em><b>FeatureMap</b></em>}
   *         instance.
   * @throws ClassNotFoundException
   */
  FeatureMap createFeatureMap(final String ePackageNsURI, final String eOwnerClassName, final String eStructuralFeatureName) throws ClassNotFoundException;

  /**
   * Creates a new
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em><b>FeatureMap</b></em>}
   * instance, of the appropriate type, and returns it.
   * <p>
   * The {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>}
   * instance is created according to the Ecore properties of the specified
   * owner object and structural feature. The owner of the resulting
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>} instance
   * is the specified owner object.
   * </p>
   * <p>
   * This method is useful in cases where a
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>} instance
   * for an already existing owner object is to be created.
   * </p>
   * 
   * @param eOwnerObject
   *          owner object of <em>eStructuralFeatureName</em> as well as the
   *          resulting
   *          {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>}
   *          instance.
   * @param eStructuralFeatureName
   *          name of the structural feature for which the
   *          {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>}
   *          instance is to be created.
   * @return the newly created
   *         {@link org.eclipse.emf.ecore.util.FeatureMap <em><b>FeatureMap</b></em>}
   *         instance.
   * @throws ClassNotFoundException
   */
  FeatureMap createFeatureMap(final EObject eOwnerObject, final String eStructuralFeatureName) throws ClassNotFoundException;

  /**
   * Creates a new
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em><b>FeatureMap</b></em>}
   * instance, of the appropriate type, and returns it.
   * <p>
   * The {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>}
   * instance is created according to the Ecore properties of the specified
   * owner object and structural feature. The owner of the resulting
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>} instance
   * is the specified owner object.
   * </p>
   * <p>
   * This method is useful in cases where an
   * {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>} instance
   * for an already existing owner object is to be created.
   * </p>
   * 
   * @param eOwnerObject
   *          owner object of <em>eStructuralFeature</em> as well as the
   *          resulting
   *          {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>}
   *          instance.
   * @param eStructuralFeature
   *          structural feature for which the
   *          {@link org.eclipse.emf.ecore.util.FeatureMap <em>FeatureMap</em>}
   *          instance is to be created.
   * @return the newly created
   *         {@link org.eclipse.emf.ecore.util.FeatureMap <em><b>FeatureMap</b></em>}
   *         instance.
   * @throws ClassNotFoundException
   */
  FeatureMap createFeatureMap(final EObject eOwnerObject, final EStructuralFeature eStructuralFeature) throws ClassNotFoundException;
}