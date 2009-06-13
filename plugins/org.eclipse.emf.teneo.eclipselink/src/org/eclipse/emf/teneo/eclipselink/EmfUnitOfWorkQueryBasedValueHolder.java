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
import org.eclipse.emf.teneo.eclipselink.internal.messages.Messages;
import org.eclipse.persistence.exceptions.DatabaseException;
import org.eclipse.persistence.indirection.ValueHolderInterface;
import org.eclipse.persistence.internal.indirection.UnitOfWorkQueryValueHolder;
import org.eclipse.persistence.internal.sessions.AbstractRecord;
import org.eclipse.persistence.internal.sessions.UnitOfWorkImpl;
import org.eclipse.persistence.mappings.ForeignReferenceMapping;

public class EmfUnitOfWorkQueryBasedValueHolder extends UnitOfWorkQueryValueHolder implements EmfOwnedValueHolder {
	/**
   * 
   */
	private static final long serialVersionUID = 1L;
	private EObject owner;
	private String ownerAttrName;

	public EmfUnitOfWorkQueryBasedValueHolder(ValueHolderInterface attributeValue, Object clone,
			ForeignReferenceMapping mapping, AbstractRecord row, UnitOfWorkImpl unitOfWork) {
		super(attributeValue, clone, mapping, row, unitOfWork);
	}

	@Override
	protected Object instantiate() throws DatabaseException {
		return doInstantiate();
	}

	@SuppressWarnings("unchecked")
	protected <E> Object doInstantiate() throws DatabaseException {
		ValueHolderInterface wrappedVH = getWrappedValueHolder();
		if (wrappedVH instanceof EmfQueryBasedValueHolder) {
			EmfQueryBasedValueHolder emfVH = (EmfQueryBasedValueHolder) wrappedVH;
			emfVH.setOwner(getOwner());
			emfVH.setOwnerAttrName(getOwnerAttrName());
		}
		Collection<E> contents = (Collection<E>) super.instantiate();
		EList<E> newList = null;
		try {
			newList = EListFactory.eINSTANCE.createEList(getOwner(), getOwnerAttrName());
			EmfHelper.getInstance().setECollectionContents(contents, newList);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(Messages.EmfUnitOfWorkQueryBasedValueHolder_errorBuildingEListImplementation, e);
		}
		return newList;
	}

	public EObject getOwner() {
		return owner;
	}

	public void setOwner(EObject owner) {
		this.owner = owner;
	}

	public String getOwnerAttrName() {
		return ownerAttrName;
	}

	public void setOwnerAttrName(String ownerAttrName) {
		this.ownerAttrName = ownerAttrName;
	}

}
