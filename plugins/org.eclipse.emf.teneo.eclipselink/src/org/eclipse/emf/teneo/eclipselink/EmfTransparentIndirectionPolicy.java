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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.persistence.descriptors.changetracking.ChangeTracker;
import org.eclipse.persistence.descriptors.changetracking.CollectionChangeTracker;
import org.eclipse.persistence.exceptions.DescriptorException;
import org.eclipse.persistence.indirection.IndirectContainer;
import org.eclipse.persistence.indirection.ValueHolder;
import org.eclipse.persistence.indirection.ValueHolderInterface;
import org.eclipse.persistence.internal.indirection.DatabaseValueHolder;
import org.eclipse.persistence.internal.indirection.TransparentIndirectionPolicy;
import org.eclipse.persistence.internal.indirection.UnitOfWorkValueHolder;
import org.eclipse.persistence.internal.sessions.AbstractRecord;
import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.internal.sessions.UnitOfWorkImpl;
import org.eclipse.persistence.mappings.ForeignReferenceMapping;
import org.eclipse.persistence.queries.ReadQuery;

public class EmfTransparentIndirectionPolicy extends TransparentIndirectionPolicy {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Override
  public Object valueFromQuery(ReadQuery query, AbstractRecord row, AbstractSession session) {
    return this.buildIndirectContainer(new EmfQueryBasedValueHolder(query, row, session));
  }

  public void setAttributeOwner(String attrName, EObject owner) {
    Object value = getMapping().getAttributeValueFromObject(owner);
    IndirectContainer container = (IndirectContainer) value;
    ValueHolderInterface valueHolder = container.getValueHolder();
    EmfOwnedValueHolder emfOwnedValueHolder = (EmfOwnedValueHolder) valueHolder;
    emfOwnedValueHolder.setOwner(owner);
    emfOwnedValueHolder.setOwnerAttrName(attrName);
  }

  /**
   * Return a clone of the attribute.
   * @param buildDirectlyFromRow
   *          indicates that we are building the clone directly from a row as
   *          opposed to building the original from the row, putting it in the
   *          shared cache, and then cloning the original.
   */
  @Override
  public Object cloneAttribute(Object attributeValue, Object original, Object clone, UnitOfWorkImpl unitOfWork, boolean buildDirectlyFromRow) {
    ValueHolderInterface valueHolder = null;
    Object container = null;
    if (attributeValue instanceof IndirectContainer) {
      valueHolder = ((IndirectContainer) attributeValue).getValueHolder();
    }
    if (!buildDirectlyFromRow && unitOfWork.isOriginalNewObject(original)) {
      // CR#3156435 Throw a meaningful exception if a serialized/dead value
      // holder is detected.
      // This can occur if an existing serialized object is attempt to be
      // registered as new.
      if (valueHolder instanceof DatabaseValueHolder && !((DatabaseValueHolder) valueHolder).isInstantiated() && ((DatabaseValueHolder) valueHolder).getSession() == null && !((DatabaseValueHolder) valueHolder).isSerializedRemoteUnitOfWorkValueHolder()) {
        throw DescriptorException.attemptToRegisterDeadIndirection(original, getMapping());
      }
      if (getMapping().getRelationshipPartner() == null) {
        container = getMapping().buildCloneForPartObject(attributeValue, original, clone, unitOfWork, false);
      }
      else {
        if (!(attributeValue instanceof IndirectContainer)) {
          valueHolder = new ValueHolder(attributeValue);
        }
        AbstractRecord row = null;
        if (valueHolder instanceof DatabaseValueHolder) {
          row = ((DatabaseValueHolder) valueHolder).getRow();
        }

        // If a new object is being cloned then we must build a new
        // UOWValueHolder
        // this is so that new clones can also have their relationships managed
        // here the code instantiates the valueholder in a privledged manner
        // because a
        // UOWValueHolder will assume the objects in the collection are existing
        // if the valueholder
        // Goes through it's own instantiation process.
        UnitOfWorkValueHolder newValueHolder = getMapping().createUnitOfWorkValueHolder(valueHolder, original, clone, row, unitOfWork, buildDirectlyFromRow);
        container = buildIndirectContainer(newValueHolder);
        Object cloneCollection = getMapping().buildCloneForPartObject(attributeValue, original, clone, unitOfWork, false);
        newValueHolder.privilegedSetValue(cloneCollection);
        newValueHolder.setInstantiated();
      }
    }
    else {
      if (!(attributeValue instanceof IndirectContainer)) {
        valueHolder = new ValueHolder(attributeValue);
      }
      AbstractRecord row = null;
      if (valueHolder instanceof DatabaseValueHolder) {
        row = ((DatabaseValueHolder) valueHolder).getRow();
      }
      // TODO: This method is overriden solely to change a single line
      // so it doesn't delegate value holder creation to the mapping which is a 
      // ForeignReferenceMapping that hard wires the value holder creation--no policy!
      //
      // container = buildIndirectContainer(getMapping().createUnitOfWorkValueHolder(valueHolder, original, clone, row, unitOfWork, buildDirectlyFromRow));
      container = buildIndirectContainer(new EmfUnitOfWorkQueryBasedValueHolder(valueHolder, clone, (ForeignReferenceMapping) getMapping(), row, unitOfWork));
    }
    if ( (getMapping().getDescriptor().getObjectChangePolicy().isObjectChangeTrackingPolicy())
            && (((ChangeTracker)clone)._persistence_getPropertyChangeListener() != null)
            && (container instanceof CollectionChangeTracker) ) {
              ((CollectionChangeTracker)container).setTrackedAttributeName(getMapping().getAttributeName());
              ((CollectionChangeTracker)container)._persistence_setPropertyChangeListener(((ChangeTracker)clone)._persistence_getPropertyChangeListener());
          }
    return container;
  }

}
