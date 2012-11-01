/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PersistentStoreAdapter.java,v 1.15 2011/02/21 04:43:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.type;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Keeps a list of PersistentLists by efeature. Is used when a new object is persisted and the
 * OR-layer wants to replace the list implementation.
 * 
 * This adapter keeps the PersistentList and ensures that any updates in the original list are also
 * done in the persistent store.
 * 
 * This adapter only operates in case the target object is not read from the persistent store but is
 * persisted there for the first time.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.15 $
 */

public class PersistentStoreAdapter implements Adapter {

	private Notifier target;
	private boolean targetCreatedByORM;

	private Map<EStructuralFeature, Object> storeCollections = new HashMap<EStructuralFeature, Object>();

	private Map<String, Object> syntheticProperties = new HashMap<String, Object>();

	public void addStoreCollection(EStructuralFeature eFeature, Object storeCollection) {
		// note that when refresh is called on a persisted object
		// then this call replaces the current collection
		storeCollections.put(eFeature, storeCollection);
	}

	public Object getStoreCollection(EStructuralFeature eFeature) {
		return storeCollections.get(eFeature);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.Adapter#getTarget()
	 */
	public Notifier getTarget() {
		return target;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.Adapter#isAdapterForType(java.lang.Object)
	 */
	public boolean isAdapterForType(Object type) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common
	 * .notify.Notification)
	 */
	@SuppressWarnings("unchecked")
	public void notifyChanged(Notification notification) {
		final EStructuralFeature eFeature = (EStructuralFeature) notification.getFeature();

		final Object collectionObject = storeCollections.get(eFeature);
		if (collectionObject == null) {
			return;
		}

		final List<Object> list = (collectionObject instanceof List ? (List<Object>) collectionObject
				: null);
		final Map<Object, Object> map = (collectionObject instanceof Map<?, ?> ? (Map<Object, Object>) collectionObject
				: null);

		final boolean isEReference = eFeature instanceof EReference;
		int changedPosition = -1;
		switch (notification.getEventType()) {
		case Notification.ADD:
			if (list != null) {
				if (notification.getPosition() != Notification.NO_INDEX) {
					changedPosition = notification.getPosition();
					list.add(notification.getPosition(), replaceValue(notification.getNewValue(), eFeature));
				} else {
					changedPosition = list.size();
					list.add(replaceValue(notification.getNewValue(), eFeature));
				}
			}
			if (map != null) {
				final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) notification.getNewValue();
				map.put(entry.getKey(), entry.getValue());
			}
			break;
		case Notification.ADD_MANY:
			if (list != null) {
				if (notification.getPosition() != Notification.NO_INDEX) {
					changedPosition = notification.getPosition();
					list.addAll(notification.getPosition(),
							replaceValues((List<Object>) notification.getNewValue(), eFeature));

				} else {
					changedPosition = list.size();
					list.addAll(replaceValues((List<Object>) notification.getNewValue(), eFeature));
				}
			}
			if (map != null) {
				for (Object o : (List<?>) notification.getNewValue()) {
					final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) o;
					map.put(entry.getKey(), entry.getValue());
				}
			}
			break;
		case Notification.REMOVE:
			if (list != null) {
				final Object removed;
				if (notification.getPosition() != Notification.NO_INDEX) {
					removed = list.remove(notification.getPosition());
				} else {
					removed = replaceValue(notification.getOldValue(), eFeature);
					list.remove(removed);
				}
				// recompute them all
				changedPosition = 0;
				if (isEReference) {
					StoreUtil.resetSyntheticListInfo(eFeature, removed);
				}
			}
			if (map != null) {
				final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) notification.getOldValue();
				map.remove(entry.getKey());
			}
			break;
		case Notification.REMOVE_MANY:
			if (list != null) {
				final List<?> removed = replaceValues((List<Object>) notification.getOldValue(), eFeature);
				list.removeAll(removed);
				if (isEReference) {
					for (Object removedObject : removed) {
						StoreUtil.resetSyntheticListInfo(eFeature, removedObject);
					}
				}
				changedPosition = 0;
			}
			if (map != null) {
				for (Object o : (List<?>) notification.getOldValue()) {
					final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) o;
					map.remove(entry.getKey());
				}
			}
			break;
		case Notification.MOVE:
			if (list != null) {
				final int oldPosition = (Integer) notification.getOldValue();
				final int newPosition = notification.getPosition();
				final Object o = list.remove(oldPosition);
				if (o != notification.getNewValue()) {
					throw new IllegalStateException("Persistent list and EList are out of sync");
				}
				list.add(newPosition, o);
				if (newPosition < oldPosition) {
					changedPosition = newPosition;
				} else {
					changedPosition = oldPosition;
				}
			}
			break;
		case Notification.SET:
			if (list != null) {
				final int position = notification.getPosition();
				Object removed = list.set(position, replaceValue(notification.getNewValue(), eFeature));
				changedPosition = position;
				if (isEReference) {
					StoreUtil.resetSyntheticListInfo(eFeature, removed);
				}
			}
			break;
		}

		if (changedPosition > -1 && isEReference) {
			int newIndex = changedPosition;
			for (Object element : list.subList(changedPosition, list.size())) {
				StoreUtil.setSyntheticListOwner(eFeature, element, notification.getNotifier());
				StoreUtil.setSyntheticListIndex(eFeature, element, newIndex++);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common .notify.Notifier)
	 */
	public void setTarget(Notifier newTarget) {
		target = newTarget;
	}

	/**
	 * @return the targetCreatedByORM
	 */
	public boolean isTargetCreatedByORM() {
		return targetCreatedByORM;
	}

	/**
	 * @param targetCreatedByORM
	 *          the targetCreatedByORM to set
	 */
	public void setTargetCreatedByORM(boolean targetCreatedByORM) {
		this.targetCreatedByORM = targetCreatedByORM;
	}

	/**
	 * @return the storeCollections
	 */
	public Map<EStructuralFeature, Object> getStoreCollections() {
		return storeCollections;
	}

	protected Object replaceValue(Object value, EStructuralFeature eFeature) {
		return value;
	}

	protected List<Object> replaceValues(List<Object> values, EStructuralFeature eFeature) {
		return values;
	}

	public Object getSyntheticProperty(String property) {
		return syntheticProperties.get(property);
	}

	public void setSyntheticProperty(String property, Object value) {
		syntheticProperties.put(property, value);
	}
}