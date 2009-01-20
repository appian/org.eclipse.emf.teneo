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
package org.eclipse.emf.teneo.eclipselink;

import java.lang.reflect.Field;
import java.util.Collection;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.eclipselink.elist.EListContainerPolicy;
import org.eclipse.emf.teneo.eclipselink.elist.EclipseLinkEList;
import org.eclipse.emf.teneo.eclipselink.elist.IndirectEList;
import org.eclipse.emf.teneo.eclipselink.elistfactory.EElementUtil;
import org.eclipse.emf.teneo.eclipselink.emap.EclipseLinkEMap;
import org.eclipse.emf.teneo.eclipselink.emap.IndirectEMap;
import org.eclipse.persistence.config.SessionCustomizer;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.exceptions.DescriptorException;
import org.eclipse.persistence.exceptions.EclipseLinkException;
import org.eclipse.persistence.internal.helper.Helper;
import org.eclipse.persistence.internal.indirection.NoIndirectionPolicy;
import org.eclipse.persistence.internal.queries.ContainerPolicy;
import org.eclipse.persistence.mappings.CollectionMapping;
import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.queries.ReadAllQuery;
import org.eclipse.persistence.sessions.Session;

/**
 * This customization class will modify the session to: 1. Provide attribute
 * accessors that will maintain the isSet attribute associated with any declared
 * attribute 2. Replace the standard container policies with EMF aware policies
 * 3. Register a listener on any descriptor with collections to provide
 * postBuild/postClone customization (esp. assign collection owner) This entire
 * solution is based around the mappings being configured as: 1. The container
 * policy is set to Map or List--normal settings 2. The container class is
 * specified as Map or List--normal settings 3. The appropriate method is
 * configured for the map's key
 * 
 * @author Shaun Smith 
 * @author Doug Clarke
 * @author Stephan Eberle
 */
public class EmfSessionCustomizer implements SessionCustomizer {

  protected static EmfCollectionAdjuster collectionAdjuster = new EmfCollectionAdjuster();

  /**
   * Invoked after the session is created but prior to login where the mappings
   * are validated. This method walks the descriptors and mapping replacing the
   * container policy where needed.
   */
  @SuppressWarnings("unchecked")
  public void customize(Session session) throws EclipseLinkException {
    // register listener that will delete unnecessary EMap Entries at commit
    // time
    session.getEventManager().addListener(new EmfSessionEventListener());
    for (ClassDescriptor descriptor : (Collection<ClassDescriptor>) session.getDescriptors().values()) {
      if (Helper.classImplementsInterface(descriptor.getJavaClass(), EObject.class)) {
        boolean shouldAttachListener = false;
        // adjust relationship mappings
        for (Object element : descriptor.getMappings()) {
          DatabaseMapping dbMapping = (DatabaseMapping) element;
          enhanceAttributeAccesssor(dbMapping);
          if (dbMapping.isCollectionMapping()) {
            CollectionMapping collectionMapping = (CollectionMapping) dbMapping;
            adjustListMapping(collectionMapping);
            shouldAttachListener = true;
          }
        }
        if (shouldAttachListener) {
          descriptor.getEventManager().addListener(collectionAdjuster);
        }
      }
    }
  }

  private boolean isMapCollection(CollectionMapping collectionMapping) throws EclipseLinkException {

    boolean result = false;
    try {
      String attributeName = collectionMapping.getAttributeName();
      Class<?> mappedClass = collectionMapping.getDescriptor().getJavaClass();
      Field collectionField = Helper.getField(mappedClass, attributeName);
      result = Helper.classImplementsInterface(collectionField.getType(), EMap.class);
    }
    catch (NoSuchFieldException exception) {
      throw DescriptorException.noFieldNameForMapping(collectionMapping);
    }
    return result;
  }

  private void adjustListMapping(CollectionMapping collectionMapping) throws EclipseLinkException {

    ContainerPolicy newContainerPolicy = new EListContainerPolicy(collectionMapping.getAttributeName());
    collectionMapping.setContainerPolicy(newContainerPolicy);
    // we must also update the mapping selection criteria's container policy
    ReadAllQuery selectionQuery = (ReadAllQuery) collectionMapping.getSelectionQuery();
    selectionQuery.setContainerPolicy(newContainerPolicy);

    if (collectionMapping.usesIndirection()) {
      collectionMapping.setIndirectionPolicy(new EmfTransparentIndirectionPolicy());
      if (isMapCollection(collectionMapping)) {
        newContainerPolicy.setContainerClass(IndirectEMap.class);
      }
      else {
        newContainerPolicy.setContainerClass(IndirectEList.class);
      }
    }
    else {
      collectionMapping.setIndirectionPolicy(new NoIndirectionPolicy());
      if (isMapCollection(collectionMapping)) {
        newContainerPolicy.setContainerClass(EclipseLinkEMap.class);
      }
      else {
        newContainerPolicy.setContainerClass(EclipseLinkEList.class);
      }
    }

  }

  private void enhanceAttributeAccesssor(DatabaseMapping dbMapping) {
    EmfInstanceVariableAccessor.customize(dbMapping);
  }
}
