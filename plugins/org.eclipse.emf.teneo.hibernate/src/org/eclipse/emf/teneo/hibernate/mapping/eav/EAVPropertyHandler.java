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
 * @version $Revision: 1.2 $
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
			final EAVValueHolder valueHolder = EAVValueHolder.create(eFeature);
			valueHolder.setOwner(target);
			valueHolder.set(target.eGet(eFeature));
			valueHolders.add(valueHolder);
		}
		return valueHolders;
	}

	private void fillTargetObject(EObject target, List<EAVValueHolder> valueList) {
		for (EAVValueHolder valueHolder : valueList) {
			valueHolder.setOwner(target);
			valueHolder.setValueInOwner();
		}
	}

	private static class EAVObjectAdapter implements Adapter {

		private Notifier target;

		private List<EAVValueHolder> valueList;

		@Override
		public Notifier getTarget() {
			return target;
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return false;
		}

		@Override
		public void notifyChanged(Notification notification) {
			final EStructuralFeature eFeature = (EStructuralFeature) notification.getFeature();

			switch (notification.getEventType()) {
			case Notification.SET:
				if (!eFeature.isMany()) {
					final EAVValueHolder valueHolder = getValueHolder(eFeature);
					valueHolder.set(notification.getNewValue());
				}
				break;
			case Notification.UNSET:
				if (!eFeature.isMany()) {
					final EAVValueHolder valueHolder = getValueHolder(eFeature);
					valueHolder.set(notification.getNewValue());
				}
				break;
			}
		}

		private EAVValueHolder getValueHolder(EStructuralFeature eFeature) {
			for (EAVValueHolder valueHolder : valueList) {
				if (valueHolder.getEStructuralFeature() == eFeature) {
					return valueHolder;
				}
			}
			throw new IllegalStateException("EFeatrre " + eFeature + " not present in valueList");
		}

		@Override
		public void setTarget(Notifier newTarget) {
			target = newTarget;
		}

		public List<EAVValueHolder> getValueList() {
			return valueList;
		}

		public void setValueList(List<EAVValueHolder> valueList) {
			this.valueList = valueList;
		}

	}
}