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
package org.eclipse.emf.teneo.eclipselink.elist;

import java.util.Collection;
import java.util.Map;


import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.BasicEMap.Entry;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.teneo.eclipselink.EmfHelper;
import org.eclipse.emf.teneo.eclipselink.IndirectEContainer;
import org.eclipse.persistence.exceptions.QueryException;
import org.eclipse.persistence.internal.queries.ListContainerPolicy;

/**
 * TODO should split EMap functionality out into EMapContainerPolicy
 */
public class EListContainerPolicy extends ListContainerPolicy {

  private static final long serialVersionUID = 1L;

  private String attributeName; // needed to construct appropriate container in
                                // clone

  public EListContainerPolicy(String attributeName) {
    super(EclipseLinkEList.class);
    this.attributeName = attributeName;
  }

  @Override
  protected boolean removeFrom(Object key, Object element, Object container) {
    try {
      if (container instanceof EcoreEMap) {
        EcoreEMap<?, ?> map = (EcoreEMap<?, ?>) container;
        map.basicRemove(element, null);
        return true;
      }
      else {
        if (container instanceof BasicEList) {
          BasicEList<?> eList = (BasicEList<?>) container;
          return EmfHelper.getInstance().removeFromEList(eList, element);
        }
        else {
          return ((Collection<?>) container).remove(element);
        }
      }
    }
    catch (UnsupportedOperationException ex) {
      throw QueryException.methodNotValid(element, "remove(Object element)");
    }
  }

  /**
   * INTERNAL: Add element into a container which implements the Collection
   * interface.
   * 
   * @param element
   *          java.lang.Object
   * @param container
   *          java.lang.Object
   * @return boolean indicating whether the container changed
   */
  @Override
  public boolean addInto(Object key, Object element, Object container) {
    return doAddInto(key, element, container);
  }

  @SuppressWarnings("unchecked")
  protected <E, K, V> boolean doAddInto(Object key, Object element, Object container) {
    if (container instanceof IndirectEContainer) {
      IndirectEContainer<E> indirectEContainer = (IndirectEContainer<E>) container;
      return indirectEContainer.eAdd((E)element);
    }
    else {
      if (container instanceof BasicEList) {
        return EmfHelper.getInstance().addToEList((EList<E>) container, (E)element);
      }
      else {
        return EmfHelper.getInstance().addToEMap((EMap<K, V>) container, (Map.Entry<K, V>)element);
      }
    }
  }

  @SuppressWarnings("unchecked")
  @Override
  public Object cloneFor(Object container) {
    return doCloneFor(container);
  }
  
  @SuppressWarnings("unchecked")
  public <K, V> Object doCloneFor(Object container) {
    EcoreEMap<K, V> containerClone = null;
    EmfHelper helper = EmfHelper.getInstance();
    if (container instanceof EcoreEMap) {
      EcoreEMap<K, V> contentsMap = (EcoreEMap<K, V>) container;
      BasicEList<Map.Entry<K, V>> delegateEList = helper.getEMapDelegateEList(contentsMap);
      Class<?> entryClass = helper.getEcoreEMapEntryClass(contentsMap);
      EClass entryEClass = helper.getEcoreEMapEntryEClass(contentsMap);
      if (delegateEList instanceof EObjectEList) {
        EObjectEList<Map.Entry<K, V>> eobjectEList = (EObjectEList<Map.Entry<K, V>>) delegateEList;
        InternalEObject owner = helper.getEObjectEListOwner(eobjectEList);
        int featureID = helper.getEObjectEListFeatureId(eobjectEList);
        containerClone = new EcoreEMap<K, V>(entryEClass, entryClass, owner, featureID);
        helper.setEMapContents(contentsMap, containerClone);
      }
      else {
        BasicEList<Entry<K, V>> delegateListClone = (BasicEList<Entry<K, V>>) delegateEList.clone();
        containerClone = new EcoreEMap<K, V>(entryEClass, entryClass, delegateListClone);
      }
    }
    else {
      // EList container class may vary, need to lookup clone method.
      // TODO cache clone methods by class
      return invokeCloneMethodOn(getCloneMethod(container.getClass()), container);
    }
    return containerClone;
  }

  public String getAttributeName() {
    return attributeName;
  }
}
