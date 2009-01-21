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

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.eclipselink.elist.IndirectEList;
import org.eclipse.emf.teneo.eclipselink.elistfactory.EListFactory;
import org.eclipse.emf.teneo.eclipselink.emap.IndirectEMap;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.descriptors.DescriptorEvent;
import org.eclipse.persistence.descriptors.DescriptorEventAdapter;
import org.eclipse.persistence.internal.helper.Helper;
import org.eclipse.persistence.mappings.CollectionMapping;
import org.eclipse.persistence.mappings.DatabaseMapping;

public class EmfCollectionAdjuster extends DescriptorEventAdapter {

	@Override
	public void postMerge(DescriptorEvent event) {
		configureEmfCollectionMappings(event);
	}

	@Override
	public void postBuild(DescriptorEvent event) {
		configureEmfCollectionMappings(event);
	}

	@Override
	public void postClone(DescriptorEvent event) {
		configureEmfCollectionMappings(event);
	}

	/*
	 * After a merge, replace EclipseLinkEList/Map in IndirectEList/Map
	 */
	// private void introduceEmfCollectionClasses(DescriptorEvent event) {
	// ClassDescriptor desc = (ClassDescriptor) event.getDescriptor();
	// EObject original = (EObject) event.getOriginalObject();
	// EObject source = (EObject) event.getSource();
	// for (Iterator mI = desc.getMappings().iterator(); mI.hasNext();) {
	// DatabaseMapping dbMapping = (DatabaseMapping) mI.next();
	// if (dbMapping.isCollectionMapping()) {
	// CollectionMapping collectionMapping = (CollectionMapping)dbMapping;
	// if (isEMapMapping(collectionMapping)) {
	// configureEMapMapping(source, collectionMapping);
	// } else {
	// configureEListMapping(source, collectionMapping);
	// }
	// }
	// }
	// }
	private void configureEmfCollectionMappings(DescriptorEvent event) {
		ClassDescriptor desc = event.getDescriptor();
		EObject source = (EObject) event.getSource();
		for (DatabaseMapping dbMapping : desc.getMappings()) {
			if (dbMapping.isCollectionMapping()) {
				CollectionMapping collectionMapping = (CollectionMapping) dbMapping;
				if (isEMapMapping(collectionMapping)) {
					configureEMapMapping(source, collectionMapping);
				} else {
					configureEListMapping(source, collectionMapping);
				}
			}
		}
	}

	private boolean isEMapMapping(CollectionMapping collectionMapping) {
		Class<?> containerClass = collectionMapping.getContainerPolicy().getContainerClass();
		return Helper.classImplementsInterface(containerClass, EMap.class);
	}

	private void configureEMapMapping(EObject source, CollectionMapping collectionMapping) {
		if (collectionMapping.usesIndirection()) {
			Object collectionValue = collectionMapping.getAttributeValueFromObject(source);
			if (collectionValue instanceof IndirectEMap) {
				IndirectEMap<?, ?> contentsMap = (IndirectEMap<?, ?>) collectionValue;
				if (contentsMap.isInstantiated()) {
					replaceWithEmfMap(source, collectionMapping);
				} else {
					EmfTransparentIndirectionPolicy policy = (EmfTransparentIndirectionPolicy) collectionMapping
							.getIndirectionPolicy();
					policy.setAttributeOwner(collectionMapping.getAttributeName(), source);
				}
			}
		} else {
			replaceWithEmfMap(source, collectionMapping);
		}
	}

	private void configureEListMapping(EObject source, CollectionMapping collectionMapping) {
		if (collectionMapping.usesIndirection()) {
			Object collectionValue = collectionMapping.getAttributeValueFromObject(source);
			if (collectionValue instanceof IndirectEList) {
				IndirectEList<?> contentsList = (IndirectEList<?>) collectionValue;
				if (contentsList.isInstantiated()) {
					replaceWithEmfList(source, collectionMapping);
				} else {
					EmfTransparentIndirectionPolicy policy = (EmfTransparentIndirectionPolicy) collectionMapping
							.getIndirectionPolicy();
					policy.setAttributeOwner(collectionMapping.getAttributeName(), source);
				}
			}
		} else {
			replaceWithEmfList(source, collectionMapping);
		}
	}

	@SuppressWarnings("unchecked")
	private <K, V> void replaceWithEmfMap(EObject source, CollectionMapping collectionMapping) {
		EMap<K, V> contentsMap = (EMap<K, V>) collectionMapping.getAttributeValueFromObject(source);
		try {
			// build new EMap using Model
			EMap<K, V> newMap = EListFactory.eINSTANCE.createEMap(source, collectionMapping.getAttributeName());
			EmfHelper.getInstance().setEMapContents(contentsMap, newMap);
			// must set on source after addAll because of notification
			if (contentsMap instanceof IndirectEMap) {
				IndirectEMap<K, V> indirectEMap = (IndirectEMap<K, V>) contentsMap;
				indirectEMap.setDelegate(newMap);
			} else {
				collectionMapping.setAttributeValueInObject(source, newMap);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Exception building correct EList implementation", e);
		}
	}

	@SuppressWarnings("unchecked")
	private <E> void replaceWithEmfList(EObject source, CollectionMapping collectionMapping) {
		List<E> contentsList = (List<E>) collectionMapping.getAttributeValueFromObject(source);
		try {
			// build new list using Model
			BasicEList<E> newList = (BasicEList<E>) EListFactory.eINSTANCE.createEList(source, collectionMapping
					.getAttributeName());
			// TODO setData() marks the list as modified--is this a problem?
			newList.setData(contentsList.size(), contentsList.toArray());
			collectionMapping.setAttributeValueInObject(source, newList);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Exception building correct EList implementation", e);
		}
	}
}
