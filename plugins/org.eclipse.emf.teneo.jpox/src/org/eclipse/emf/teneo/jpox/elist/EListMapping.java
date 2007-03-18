/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EListMapping.java,v 1.6 2007/03/18 19:18:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.jdo.JDOFatalInternalException;
import javax.jdo.spi.PersistenceCapable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeEObject;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeObject;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.StateManager;
import org.jpox.metadata.ForeignKeyAction;
import org.jpox.sco.SCO;
import org.jpox.store.mapping.CollectionMapping;

/**
 * Mapping class around the EListWrapper. The newWrapper method returns a new EListWrapper instance.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $ $Date: 2007/03/18 19:18:22 $
 */

public class EListMapping extends CollectionMapping {

	/**
	 * Accessor for an instance of the wrapper class.
	 * 
	 * @param sm
	 *            StateManager of the owner
	 * @param fldName
	 *            name of the field
	 * @return Instance of the wrapper
	 */
	protected Object newWrapper(StateManager sm, String fldName) {
		return createWrapper(sm, fldName, null);
	}

	/**
	 * Accessor for an instance of the wrapper class.
	 * 
	 * @param sm
	 *            StateManager of the owner
	 * @param fieldName
	 *            name of the field
	 * @return Instance of the wrapper
	 */
	protected Object newDefaultWrapper(StateManager sm, String fieldName) {
		return createWrapper(sm, fieldName, null);
	}

	// -------------------- Implementation of MappingCallbacks --------------------

	/**
	 * Method deletes all dependent objects based.
	 */ 
	public void deleteDependent(StateManager sm) {
        if (containerIsStoredInSingleColumn())
        {
            // Do nothing when serialised since we are handled in the main request
            return;
        }

        // makes sure field is loaded
		sm.isLoaded(sm.getObject(), fmd.getAbsoluteFieldNumber());
		Collection<?> value = (Collection<?>) sm.provideField(fmd.getAbsoluteFieldNumber());
		if (value != null && !value.isEmpty()) {
			// in case of eobject or in case dependent has been set delete it!
			// also assume that if there is a foreign key constraint with cascade that it is depedendent. 
			// This gave better results then trusting the foreign keys
			final boolean dependent = fmd.getCollection().isDependentElement() || 
				fmd.getCollection().isEmbeddedElement() ||
				fmd.getForeignKeyMetaData().getDeleteAction().equals(ForeignKeyAction.CASCADE);
			if (dependent) {
				Object[] values = ((List<?>) value).toArray();
				
				// clear the collection
				getBackingStore(sm.getPersistenceManager().getClassLoaderResolver()).clear(sm);
				
				if (dependent) {
					for (int i = 0; i < values.length; i++) {
						if (values[i] instanceof PersistenceCapable) {
							sm.getPersistenceManager().deletePersistent(values[i]);
						}
					}
				}
			} else {
				// clear the collection
				getBackingStore(sm.getPersistenceManager().getClassLoaderResolver()).clear(sm);
			}
		}
	}

	/**
	 * Method to be called after the insert of the owner class element.
	 * 
	 * @param sm
	 *            StateManager of the owner
	 */
	public void postInsert(StateManager sm) {
		Collection<?> value = (Collection<?>) sm.provideField(fmd.getAbsoluteFieldNumber());

		if (value instanceof EListWrapper) {
			// do nothing because this should be already okay
		} else if (value != null) {
			// get the feature
			final EStructuralFeature feature = StoreUtil.getEStructuralFeature((EObject) sm.getObject(), fmd.getName());
			if (feature.getEType().getInstanceClass() == EObject.class) {
				final ArrayList<Object> newValues = new ArrayList<Object>();
				final Iterator<?> it = value.iterator();
				while (it.hasNext()) {
					final AnyTypeEObject any = new AnyTypeEObject(sm.getPersistenceManager(), (EObject) it.next());
					newValues.add(any);
				}
				value = newValues;
			} else if (feature.getEType().getInstanceClass() == Object.class) {
				final ArrayList<Object> newValues = new ArrayList<Object>();
				final Iterator<?> it = value.iterator();
				while (it.hasNext()) {
					final AnyTypeObject any = new AnyTypeObject(sm.getPersistenceManager(), it.next());
					newValues.add(any);
				}
				value = newValues;
			}
		}

		// if (value == null)
		// throw new JDOUserException("List fields cannot be null");
		getBackingStore(sm.getPersistenceManager().getClassLoaderResolver()).addAll(sm, value);

		if (value == null) {
			sm.replaceField(fmd.getAbsoluteFieldNumber(), createWrapper(sm, fieldName, new ArrayList<Object>()));
		} else {
			sm.replaceField(fmd.getAbsoluteFieldNumber(), createWrapper(sm, fieldName, (List<?>) value));
		}
	}

	/** Creates the wrapper, either an emap or elist */
	@SuppressWarnings("unchecked")
	private Object createWrapper(StateManager sm, String fieldName, List<?> list) {
		final EStructuralFeature estruct = StoreUtil.getEStructuralFeature((InternalEObject) sm
				.getObject(), fieldName);
		if (estruct instanceof EReference) {
			final EReference eref = (EReference)estruct;
			// the test for emap checks: the entry class must have a instanceclass: Map.Entry
			// and the entry class must have two efeatures with the name key and value
			boolean isEMap = eref.getEReferenceType() != null && eref.getEReferenceType().getInstanceClass() != null && 
				Map.Entry.class.isAssignableFrom(eref.getEReferenceType().getInstanceClass()); 
			isEMap = isEMap && 
				eref.getEReferenceType().getEStructuralFeatures().size() == 2 &&
					eref.getEReferenceType().getEStructuralFeature("key") != null &&
					eref.getEReferenceType().getEStructuralFeature("value") != null;
			
			if (isEMap) {
				if (list != null) {
					return new EMapWrapper<Object, Object>(sm, fieldName, 
							(List<Map.Entry<Object, Object>>)list);
					//emap.setJPOXControlInformation(sm, fieldName, (List<ap.Entry<Object, Object>>)list);
				} else {
					return new EMapWrapper<Object, Object>(sm, fieldName);
				}
			}
		}
		if (list != null) {
			return new EListWrapper(sm, fieldName, list);
		} else {
			return new EListWrapper(sm, fieldName);
		}
	}
	
	/**
	 * Override standard jpox behavior because it does not work correctly in case of two way relations.
	public void preDelete(StateManager sm) {
		try
		{
		// in case of two way relations the list should be emptied explicitly and
		// not as part of predelete
		// in case of two-way relation the relation should explicitly be cleared
		if (fmd.getCollection().isDependentElement() || fmd.getCollection().isEmbeddedElement()
				|| fmd.getMappedBy() != null) {
			// Clear out the Collection - the elements are only deleted within clear() if dependent
			// Collection value = (Collection)sm.provideField(fmd.getAbsoluteFieldNumber());
			// value.clear();
			getBackingStore(sm.getPersistenceManager().getClassLoaderResolver()).clear(sm);
		}
		} catch (Throwable t) {
			t.printStackTrace(System.err);
			t.printStackTrace(System.err);			
		}
	}
	 */

	/**
	 * Method to be called after any fetch of the owner class element.
	 * 
	 * @param sm
	 *            StateManager of the owner
	 */
	public void postFetch(StateManager sm) {
		sm.replaceField(fmd.getAbsoluteFieldNumber(), newWrapper(sm, fieldName));
	}

	/**
	 * Method to be called after any update of the owner class element.
	 * 
	 * @param sm
	 *            StateManager of the owner
	 */
	public void postUpdate(StateManager sm) {
		Collection<?> value = (Collection<?>) sm.provideField(fmd.getAbsoluteFieldNumber());
		
		if (value == null) {
			return; //can be null if never accessed
		}

		if (value instanceof SCO) {
			SCO sco = (SCO) value;

			if (sm.getObject() == sco.getOwner() && fieldName.equals(sco.getFieldName())) {
				return;
			}

			if (sco.getOwner() != null) {
				throw new JDOFatalInternalException(LOCALISER.msg("AbstractListMapping.WrongOwnerError"));
			}
		}

		// TODO Change this. To remove all elements and then add a new set is very inefficient!
		getBackingStore(sm.getPersistenceManager().getClassLoaderResolver()).clear(sm);
		getBackingStore(sm.getPersistenceManager().getClassLoaderResolver()).addAll(sm, value);

		sm.replaceField(fmd.getAbsoluteFieldNumber(), createWrapper(sm, fieldName, (List<?>) value));
	}
}