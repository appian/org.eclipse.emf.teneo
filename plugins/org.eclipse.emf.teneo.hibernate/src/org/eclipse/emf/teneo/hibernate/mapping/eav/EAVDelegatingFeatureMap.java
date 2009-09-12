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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.DelegatingFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * The list used in instances mapped using the EAV schema.
 */
public class EAVDelegatingFeatureMap extends DelegatingFeatureMap implements EAVDelegatingList {

	private static final long serialVersionUID = 1L;
	private List<FeatureMap.Entry> delegate;
	private List<?> persistentList;

	public EAVDelegatingFeatureMap(InternalEObject owner, EStructuralFeature eFeature) {
		super(owner, eFeature);
	}

	private void initialize() {
		if (delegate != null) {
			return;
		}
		delegate = new ArrayList<FeatureMap.Entry>();
		for (Object eavValueObj : persistentList) {
			delegate.add((FeatureMap.Entry) ((EAVValueHolder) eavValueObj).get(owner));
		}
	}

	public boolean isDelegateInitialized() {
		return delegate != null;
	}

	@Override
	protected List<FeatureMap.Entry> delegateList() {
		initialize();
		return delegate;
	}

	public List<FeatureMap.Entry> getDelegate() {
		initialize();
		return delegate;
	}

	public void setDelegate(List<FeatureMap.Entry> delegate) {
		this.delegate = delegate;
	}

	public List<?> getPersistentList() {
		return persistentList;
	}

	public void setPersistentList(List<?> persistentList) {
		this.persistentList = persistentList;
	}
}
