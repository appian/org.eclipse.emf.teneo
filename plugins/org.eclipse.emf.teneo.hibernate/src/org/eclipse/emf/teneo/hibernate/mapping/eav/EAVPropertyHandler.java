/**
 * <copyright> Copyright (c) 2009 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * EReferencePropertyHandler.java,v 1.4 2007/04/07 12:43:51 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.hibernate.HibernateException;
import org.hibernate.PropertyNotFoundException;
import org.hibernate.engine.SessionFactoryImplementor;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;

/**
 * The property handler which takes care of setting/getting the
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
@SuppressWarnings("unchecked")
public class EAVPropertyHandler implements Getter, Setter, PropertyAccessor, ExtensionPoint {

	private static final long serialVersionUID = -3712366809398761331L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.PropertyAccessor#getGetter(java.lang.Class, java.lang.String)
	 */
	public Getter getGetter(Class theClass, String propertyName) throws PropertyNotFoundException {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.PropertyAccessor#getSetter(java.lang.Class, java.lang.String)
	 */
	public Setter getSetter(Class theClass, String propertyName) throws PropertyNotFoundException {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#get(java.lang.Object)
	 */
	public Object get(Object owner) throws HibernateException {

		final EObject eOwner = (EObject) owner;
		for (Adapter adapter : eOwner.eAdapters()) {
			if (adapter instanceof EAVObjectAdapter) {
				final EAVObjectAdapter eavAdapter = (EAVObjectAdapter) adapter;
				return eavAdapter.getValueList();
			}
		}

		final EAVObjectAdapter eavAdapter = new EAVObjectAdapter();
		eavAdapter.setTarget(eOwner);
		final List<EAVValueHolder> valueList = createValueList(eOwner);
		eavAdapter.setValueList(valueList);
		eOwner.eAdapters().add(eavAdapter);
		return valueList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getForInsert(java.lang.Object, java.util.Map,
	 * org.hibernate.engine.SessionImplementor)
	 */
	public Object getForInsert(Object owner, Map mergeMap, SessionImplementor session) throws HibernateException {
		return get(owner);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Setter#set(java.lang.Object, java.lang.Object,
	 * org.hibernate.engine.SessionFactoryImplementor)
	 */
	public void set(Object target, Object value, SessionFactoryImplementor factory) throws HibernateException {
		final EObject eOwner = (EObject) target;
		for (Adapter adapter : eOwner.eAdapters()) {
			if (adapter instanceof EAVObjectAdapter) {
				final EAVObjectAdapter eavAdapter = (EAVObjectAdapter) adapter;
				// todo: is the value every different, I don't think so..)
				eavAdapter.setValueList((List<EAVValueHolder>) value);
				return;
			}
		}
		fillTargetObject((EObject) target, (List<EAVValueHolder>) value);
		final EAVObjectAdapter eavAdapter = new EAVObjectAdapter();
		eavAdapter.setTarget(eOwner);
		eavAdapter.setValueList((List<EAVValueHolder>) value);
		eOwner.eAdapters().add(eavAdapter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getMethod()
	 */
	public Method getMethod() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getMethodName()
	 */
	public String getMethodName() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getReturnType()
	 */
	public Class getReturnType() {
		return InternalEObject.class;
	}

	private List<EAVValueHolder> createValueList(EObject target) {
		final List<EAVValueHolder> valueHolders = new ArrayList<EAVValueHolder>();
		for (EStructuralFeature eFeature : target.eClass().getEAllStructuralFeatures()) {
			if (eFeature.isDerived() || eFeature.isTransient() || eFeature.isVolatile()) {
				continue;
			}
			final EAVValueHolder valueHolder = EAVValueHolder.create(target, eFeature);
			valueHolder.set(target.eGet(eFeature));
			if (eFeature.isUnsettable()) {
				valueHolder.setValueIsSet(target.eIsSet(eFeature));
			}
			valueHolders.add(valueHolder);
		}
		return valueHolders;
	}

	private void fillTargetObject(EObject target, List<EAVValueHolder> valueList) {
		for (EAVValueHolder valueHolder : valueList) {
			valueHolder.setValueInOwner((InternalEObject) target);
		}
	}

	private static class EAVObjectAdapter implements Adapter {

		private Notifier target;

		private List<EAVValueHolder> valueList;

		public Notifier getTarget() {
			return target;
		}

		public void setTarget(Notifier newTarget) {
			target = newTarget;
		}

		public List<EAVValueHolder> getValueList() {
			return valueList;
		}

		public void setValueList(List<EAVValueHolder> valueList) {
			this.valueList = valueList;
		}

		public boolean isAdapterForType(Object type) {
			return false;
		}

		private EAVValueHolder getValueHolder(EStructuralFeature eFeature) {
			for (EAVValueHolder valueHolder : valueList) {
				if (valueHolder.getEStructuralFeature() == eFeature) {
					return valueHolder;
				}
			}
			// can happen when adding
			return null;
		}

		public void notifyChanged(Notification notification) {
			final EStructuralFeature eFeature = (EStructuralFeature) notification.getFeature();

			final EAVValueHolder valueHolder = getValueHolder(eFeature);
			EAVMultiValueHolder multiValueHolder = null;

			List<Object> list = null;
			if (valueHolder instanceof EAVMultiValueHolder) {
				list = (List<Object>) valueHolder.getValue();
				multiValueHolder = (EAVMultiValueHolder) valueHolder;
			}

			// this can happen in case of a featuremap
			if (valueHolder == null) {
				return;
			}

			switch (notification.getEventType()) {
			case Notification.ADD: {
				if (notification.getPosition() != Notification.NO_INDEX) {
					list.add(notification.getPosition(), multiValueHolder.getElement(notification.getNewValue()));
				} else {
					list.add(multiValueHolder.getElement(notification.getNewValue()));
				}
				// if (map != null) {
				// final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) notification.getNewValue();
				// map.put(entry.getKey(), entry.getValue());
				// }
			}
				break;
			case Notification.ADD_MANY: {
				final List<Object> values = new ArrayList<Object>();
				for (Object o : (List<Object>) notification.getNewValue()) {
					values.add(multiValueHolder.getElement(o));
				}
				if (notification.getPosition() != Notification.NO_INDEX) {
					list.addAll(notification.getPosition(), values);
				} else {
					list.addAll(values);
				}
				// if (map != null) {
				// for (Object o : (List<?>) notification.getNewValue()) {
				// final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) o;
				// map.put(entry.getKey(), entry.getValue());
				// }
				// }
			}
				break;
			case Notification.REMOVE: {
				int removeIndex = notification.getPosition();
				if (removeIndex == Notification.NO_INDEX) {
					final Object oldValue = notification.getOldValue();
					for (Object o : list) {
						final EAVValueHolder elemValue = (EAVValueHolder) o;
						if (elemValue.getValue() != null && oldValue != null && elemValue.getValue().equals(oldValue)) {
							removeIndex = list.indexOf(o);
							break;
						} else if (elemValue.getValue() == oldValue) {
							removeIndex = list.indexOf(o);
							break;
						}
					}
				}

				if (removeIndex != Notification.NO_INDEX) {
					list.remove(removeIndex);
				}
				// if (map != null) {
				// final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) notification.getOldValue();
				// map.remove(entry.getKey());
				// }
			}
				break;
			case Notification.REMOVE_MANY:
				final List<?> oldValues = (List<?>) notification.getOldValue();
				for (Object oldValue : oldValues) {
					int removeIndex = notification.getPosition();
					if (removeIndex == Notification.NO_INDEX) {
						for (Object o : list) {
							final EAVValueHolder elemValue = (EAVValueHolder) o;
							if (elemValue.getValue() != null && oldValue != null
									&& elemValue.getValue().equals(oldValue)) {
								removeIndex = list.indexOf(o);
								break;
							} else if (elemValue.getValue() == oldValue) {
								removeIndex = list.indexOf(o);
								break;
							}
						}
					}

					if (removeIndex != Notification.NO_INDEX) {
						list.remove(removeIndex);
					}
				}
				// if (map != null) {
				// for (Object o : (List<?>) notification.getOldValue()) {
				// final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) o;
				// map.remove(entry.getKey());
				// }
				// }
				break;
			case Notification.MOVE:
				if (list != null) {
					final int oldPosition = (Integer) notification.getOldValue();
					final int newPosition = notification.getPosition();
					final Object o = list.remove(oldPosition);
					list.add(newPosition, o);
				}
				break;
			case Notification.SET:
				if (eFeature.isMany()) {
					final int position = notification.getPosition();
					list.set(position, multiValueHolder.getElement(notification.getNewValue()));
				} else {
					valueHolder.set(notification.getNewValue());
				}
				break;
			case Notification.UNSET:
				if (!eFeature.isMany()) {
					valueHolder.set(notification.getNewValue());
				}
				break;
			}
		}
	}
}