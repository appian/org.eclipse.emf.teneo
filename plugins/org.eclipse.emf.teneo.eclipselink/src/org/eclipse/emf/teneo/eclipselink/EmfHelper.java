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
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.teneo.eclipselink.emap.EclipseLinkEMap;
import org.eclipse.emf.teneo.eclipselink.internal.messages.Messages;
import org.eclipse.osgi.util.NLS;
import org.eclipse.persistence.internal.helper.Helper;
import org.eclipse.persistence.internal.security.PrivilegedAccessHelper;

public class EmfHelper {
	private static EmfHelper instance = new EmfHelper();
	private Field delegateEListField;
	private Field eObjectEListFeatureIDField;
	private Field eObjectEListOwnerField;
	private Field ecoreEMapEntryEClassField;
	private Field ecoreEMapEntryClassField;

	private EmfHelper() {
		try {
			delegateEListField = Helper.getField(BasicEMap.class, "delegateEList"); //$NON-NLS-1$
			eObjectEListFeatureIDField = Helper.getField(EObjectEList.class, "featureID"); //$NON-NLS-1$
			eObjectEListOwnerField = Helper.getField(EObjectEList.class, "owner"); //$NON-NLS-1$
			ecoreEMapEntryEClassField = Helper.getField(EcoreEMap.class, "entryEClass"); //$NON-NLS-1$
			ecoreEMapEntryClassField = Helper.getField(EcoreEMap.class, "entryClass"); //$NON-NLS-1$
		} catch (NoSuchFieldException e) {
			throw new RuntimeException(Messages.exception_unableToFindDelegateEListFieldOnBasicEMap, e);
		}
	}

	public static EmfHelper getInstance() {
		return instance;
	}

	@SuppressWarnings("unchecked")
	public <E, K, V> void setECollectionContents(Collection<E> listContents, EList<E> targetList) {
		if (listContents instanceof EMap<?, ?>) {
			EmfHelper.getInstance().setEMapContents((EMap<K, V>) listContents, (EMap<K, V>) targetList);
		} else {
			EmfHelper.getInstance().setEListContents(listContents, targetList);
		}
	}

	public <E> void setEListContents(Collection<E> listContents, EList<E> targetList) {
		if (targetList instanceof EcoreEList<?>) {
			Object[] contentsArray = listContents.toArray();
			try {
				basicSetEListContents(targetList, contentsArray);
				// TODO need to determine if the elements are "eContained"
				// Need to set container reference on each element in contents array
				// for (int i = 0; i < contentsArray.length; i++) {
				// Object element = contentsArray[i];
				// if (element instanceof BasicEObjectImpl) {
				// BasicEObjectImpl basicEObjectImpl = (BasicEObjectImpl)
				// contentsArray[i];
				// // go directly to eBasicSetContainer and not use inverseAdd because
				// // inverseAdd tries to remove the object from the owner which leads
				// to
				// // an infinite loop--eBasicSetContainer does just what is necessary
				// basicEObjectImpl.eBasicSetContainer(
				// (InternalEObject)ecoreEList.getNotifier(),
				// InternalEObject.EOPPOSITE_FEATURE_BASE - ecoreEList.getFeatureID(),
				// null);
				// }
				// }
			} catch (Exception e) {
				new RuntimeException(Messages.exception_cannotSetOwnerOnEList, e);
			}
		} else {
			String msg = NLS.bind(Messages.exception_errorSettingEListContents$0, targetList.getClass());
			throw new RuntimeException(msg);
		}
	}

	public <E> boolean addToEList(EList<E> eList, E element) {
		if (eList instanceof BasicEList<?>) {
			int size = eList.size();
			int newSize = size + 1;

			try {
				// use reflection to: delegate.grow(index);
				Method growMethod = PrivilegedAccessHelper.getDeclaredMethod(BasicEList.class, "grow", //$NON-NLS-1$
						new Class[] { int.class });
				growMethod.setAccessible(true);
				growMethod.invoke(eList, new Object[] { newSize });
				// update EList size
				Field sizeField = PrivilegedAccessHelper.getDeclaredField(BasicEList.class, "size", true); //$NON-NLS-1$
				sizeField.set(eList, newSize);
				// use reflection to: delegate.assign(index, object);
				Method assignMethod = PrivilegedAccessHelper.getDeclaredMethod(BasicEList.class, "assign", new Class[] { //$NON-NLS-1$
						int.class, Object.class });
				assignMethod.setAccessible(true);
				assignMethod.invoke(eList, new Object[] { size, element });
			} catch (Exception e) {
				new RuntimeException(Messages.exception_errorAddingElementToEList, e);
			}
			return true;
		} else {
			return eList.add(element);
		}
	}

	public boolean removeFromEList(EList<?> eList, Object object) {
		if (eList instanceof BasicEList<?>) {
			try {
				// adapted from BasicEList.remove(Object object)
				// to avoid relationship management
				int size = eList.size();
				int index = eList.indexOf(object);
				Field dataField = Helper.getField(eList.getClass(), "data"); //$NON-NLS-1$
				Object[] data = (Object[]) dataField.get(eList);
				if (index >= 0) {
					int shifted = size - index - 1;
					if (shifted > 0) {
						System.arraycopy(data, index + 1, data, index, shifted);
					}
					// Don't hold onto a duplicate reference to the last object.
					data[--size] = null;
				}
				// update EList size
				Field sizeField = PrivilegedAccessHelper.getDeclaredField(BasicEList.class, "size", true); //$NON-NLS-1$
				sizeField.set(eList, size);
			} catch (Exception e) {
				new RuntimeException(Messages.exception_errorRemovingElementFromEList, e);
			}
			return true;
		} else {
			return eList.remove(object);
		}
	}

	private void basicSetEListContents(EList<?> targetList, Object[] contentsArray) throws NoSuchFieldException,
			IllegalAccessException {
		Field dataField = Helper.getField(targetList.getClass(), "data"); //$NON-NLS-1$
		PrivilegedAccessHelper.setValueInField(dataField, targetList, contentsArray);
		Field sizeField = Helper.getField(targetList.getClass(), "size"); //$NON-NLS-1$
		PrivilegedAccessHelper.setValueInField(sizeField, targetList, contentsArray.length);
	}

	// TODO extract common code from addToEMap and setEMapContents to cache
	// methods and field
	@SuppressWarnings("unchecked")
	public <K, V> void setEMapContents(EMap<K, V> mapContents, EMap<K, V> targetMap) {
		try {
			if (targetMap instanceof BasicEMap<?, ?>) {
				BasicEMap<K, V> basicEMap = (BasicEMap<K, V>) targetMap;
				// set the entry list
				Method basicEMapEnsureEntryDataExistsMethod = PrivilegedAccessHelper.getDeclaredMethod(BasicEMap.class,
						"ensureEntryDataExists", new Class[] {}); //$NON-NLS-1$
				basicEMapEnsureEntryDataExistsMethod.setAccessible(true);
				basicEMapEnsureEntryDataExistsMethod.invoke(basicEMap, new Object[] {});
				Method basicEMapDoPutMethod = PrivilegedAccessHelper.getDeclaredMethod(BasicEMap.class, "doPut", //$NON-NLS-1$
						new Class[] { BasicEMap.Entry.class });
				basicEMapDoPutMethod.setAccessible(true);
				for (Object entry : mapContents.entrySet()) {
					basicEMapDoPutMethod.invoke(basicEMap, new Object[] { entry });
				}
				// set the delegate list
				EList<Map.Entry<K, V>> delegateEList = (EList<Map.Entry<K, V>>) delegateEListField.get(basicEMap);
				basicSetEListContents(delegateEList, mapContents.toArray());
			}
		} catch (Exception e) {
			new RuntimeException(Messages.exception_errorSettingEMapContents, e);
		}
	}

	// TODO extract common code from addToEMap and setEMapContents to cache
	// methods and field
	@SuppressWarnings("unchecked")
	public <K, V> boolean addToEMap(EMap<K, V> eMap, Map.Entry<K, V> entry) {
		if (eMap instanceof EclipseLinkEMap<?, ?>) {
			return EmfHelper.getInstance().addToEList(eMap, entry);
		} else {
			if (eMap instanceof BasicEMap<?, ?>) {
				try {
					BasicEMap<K, V> basicEMap = (BasicEMap<K, V>) eMap;
					// add the entry
					Method basicEMapEnsureEntryDataExistsMethod = PrivilegedAccessHelper.getDeclaredMethod(
							BasicEMap.class, "ensureEntryDataExists", new Class[] {}); //$NON-NLS-1$
					basicEMapEnsureEntryDataExistsMethod.setAccessible(true);
					basicEMapEnsureEntryDataExistsMethod.invoke(basicEMap, new Object[] {});
					Method basicEMapDoPutMethod = PrivilegedAccessHelper.getDeclaredMethod(BasicEMap.class, "doPut", //$NON-NLS-1$
							new Class[] { BasicEMap.Entry.class });
					basicEMapDoPutMethod.setAccessible(true);
					basicEMapDoPutMethod.invoke(basicEMap, new Object[] { entry });
					// update the delegate list
					EList<Map.Entry<K, V>> delegateEList = (EList<Map.Entry<K, V>>) delegateEListField.get(basicEMap);
					addToEList(delegateEList, entry);
				} catch (Exception e) {
					new RuntimeException(Messages.exception_errorAddingEntryToEMap, e);
				}
				return true;
			} else {
				String msg = NLS.bind(Messages.exception_collectionClassNotSupported$0, eMap.getClass().getName());
				throw new RuntimeException(msg);
			}
		}
	}

	@SuppressWarnings("unchecked")
	public <K, V> BasicEList<Map.Entry<K, V>> getEMapDelegateEList(BasicEMap<K, V> originalEMap) {
		try {
			return (BasicEList<Map.Entry<K, V>>) delegateEListField.get(originalEMap);
		} catch (Exception e) {
			// TODO Throw EclipseLinkEMF Exception
			throw new RuntimeException(Messages.exception_errorGettingDelegateList);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Class<? extends Map.Entry> getEcoreEMapEntryClass(EcoreEMap<?, ?> map) {
		try {
			return (Class<? extends Map.Entry>) ecoreEMapEntryClassField.get(map);
		} catch (Exception e) {
			// TODO Throw EclipseLinkEMF Exception
			throw new RuntimeException(Messages.exception_errorGettingDelegateList);
		}
	}

	public EClass getEcoreEMapEntryEClass(EcoreEMap<?, ?> map) {
		try {
			return (EClass) ecoreEMapEntryEClassField.get(map);
		} catch (Exception e) {
			// TODO Throw EclipseLinkEMF Exception
			throw new RuntimeException(Messages.exception_errorGettingEntryEClass);
		}
	}

	public InternalEObject getEObjectEListOwner(EObjectEList<?> map) {
		try {
			return (InternalEObject) eObjectEListOwnerField.get(map);
		} catch (Exception e) {
			// TODO Throw EclipseLinkEMF Exception
			throw new RuntimeException(Messages.exception_errorGettingListOwner);
		}
	}

	public void setEObjectEListOwner(EObjectEList<?> list, InternalEObject owner) {
		try {
			eObjectEListOwnerField.set(list, owner);
		} catch (Exception e) {
			// TODO Throw EclipseLinkEMF Exception
			throw new RuntimeException(Messages.exception_errorSettingListOwner);
		}
	}

	public int getEObjectEListFeatureId(EObjectEList<?> list) {
		try {
			return eObjectEListFeatureIDField.getInt(list);
		} catch (Exception e) {
			// TODO Throw EclipseLinkEMF Exception
			throw new RuntimeException(Messages.exception_errorGettingFeatureID);
		}
	}
}
