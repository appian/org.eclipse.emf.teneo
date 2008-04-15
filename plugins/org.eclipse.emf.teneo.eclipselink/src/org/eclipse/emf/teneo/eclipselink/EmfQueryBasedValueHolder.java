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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.eclipselink.elistfactory.EListFactory;
import org.eclipse.persistence.exceptions.DatabaseException;
import org.eclipse.persistence.internal.indirection.QueryBasedValueHolder;
import org.eclipse.persistence.internal.indirection.UnitOfWorkValueHolder;
import org.eclipse.persistence.internal.sessions.AbstractRecord;
import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.queries.ReadQuery;

public class EmfQueryBasedValueHolder extends QueryBasedValueHolder implements EmfOwnedValueHolder {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private EObject owner;
  private String ownerAttrName;

  @Override
  /**
   * Triggers UnitOfWork valueholders directly without triggering the wrapped
   * valueholder (this).
   * <p>
   * When in transaction and/or for pessimistic locking the
   * UnitOfWorkValueHolder needs to be triggered directly without triggering the
   * wrapped valueholder. However only the wrapped valueholder knows how to
   * trigger the indirection, i.e. it may be a batchValueHolder, and it stores
   * all the info like the row and the query. Note: This method is not
   * thread-safe. It must be used in a synchronizaed manner
   */
  public Object instantiateForUnitOfWorkValueHolder(UnitOfWorkValueHolder unitOfWorkValueHolder) {
    // Set the owner and attribute name of the value holder before
    // it is asked to instantiate an EMF collection that requires it.
    EmfUnitOfWorkQueryBasedValueHolder emfValueHolder = (EmfUnitOfWorkQueryBasedValueHolder) unitOfWorkValueHolder;
    setOwner(emfValueHolder.getOwner());
    setOwnerAttrName(emfValueHolder.getOwnerAttrName());
    return super.instantiateForUnitOfWorkValueHolder(unitOfWorkValueHolder);
  }

  @Override
  protected Object instantiate(AbstractSession session) throws DatabaseException {
    return doInstantiate(session);
  }
  
  @SuppressWarnings("unchecked")
  protected <E> Object doInstantiate(AbstractSession session) throws DatabaseException {
    Collection<E> contents = (Collection<E>) super.instantiate(session);
    EList<E> newList = null;
    try {
      newList = EListFactory.eINSTANCE.createEList(getOwner(), getOwnerAttrName());
      EmfHelper.getInstance().setECollectionContents(contents, newList);
    }
    catch (ClassNotFoundException e) {
      e.printStackTrace();
      throw new RuntimeException("Exception building correct EList implementation", e);
    }
    return newList;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.teneo.eclipselink.EmfOwnedValueHolder#getOwner()
   */
  public EObject getOwner() {
    return owner;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.teneo.eclipselink.EmfOwnedValueHolder#setOwner(org.eclipse.emf.ecore.EObject)
   */
  public void setOwner(EObject owner) {
    this.owner = owner;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.teneo.eclipselink.EmfOwnedValueHolder#getOwnerAttrName()
   */
  public String getOwnerAttrName() {
    return ownerAttrName;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.teneo.eclipselink.EmfOwnedValueHolder#setOwnerAttrName(java.lang.String)
   */
  public void setOwnerAttrName(String ownerAttrName) {
    this.ownerAttrName = ownerAttrName;
  }

  public EmfQueryBasedValueHolder(ReadQuery query, AbstractRecord row, AbstractSession session) {
    super(query, row, session);
  }

}
