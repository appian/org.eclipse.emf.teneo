/**
 * Copyright (c) 2009 Martin Taal and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Martin Taal - initial api
 */
package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.DelegatingEcoreEList;

/**
 * The list used in instances mapped using the EAV schema.
 */
public class EAVDelegatingEcoreEList<E> extends DelegatingEcoreEList<E> {

	private static final long serialVersionUID = 1L;
	private EStructuralFeature eStructuralFeature;
	private List<E> delegate;

	public EAVDelegatingEcoreEList(InternalEObject owner) {
		super(owner);
	}

	@Override
	protected List<E> delegateList() {
		return delegate;
	}

	public List<E> getDelegate() {
		return delegate;
	}

	public void setDelegate(List<E> delegate) {
		this.delegate = delegate;
	}

	public EStructuralFeature getEStructuralFeature() {
		return eStructuralFeature;
	}

	public void setEStructuralFeature(EStructuralFeature eStructuralFeature) {
		this.eStructuralFeature = eStructuralFeature;
	}
}
