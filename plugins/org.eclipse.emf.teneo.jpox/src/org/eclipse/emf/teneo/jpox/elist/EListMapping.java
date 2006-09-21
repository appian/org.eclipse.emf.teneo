/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EListMapping.java,v 1.2 2006/09/21 00:56:35 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.jdo.JDOFatalInternalException;
import javax.jdo.spi.PersistenceCapable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeEObject;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeObject;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.ClassLoaderResolver;
import org.jpox.StateManager;
import org.jpox.metadata.AbstractPropertyMetaData;
import org.jpox.metadata.ForeignKeyAction;
import org.jpox.sco.SCO;
import org.jpox.store.DatastoreAdapter;
import org.jpox.store.DatastoreContainerObject;
import org.jpox.store.mapping.CollectionMapping;

/**
 * Mapping class around the EListWrapper. The newWrapper method returns a new EListWrapper instance.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2006/09/21 00:56:35 $
 */

public class EListMapping extends CollectionMapping {
	/**
	 * Constructor taking the database adapter representing the datastore being used and the class of the mapping.
	 * 
	 * @param dba
	 *            Database adapter
	 * @param type
	 *            Type of the field
	 */
	public EListMapping(DatastoreAdapter dba, String type) {
		super(dba, type);
	}

	/**
	 * Constructor, specifying the table and the relative field.
	 * 
	 * @param dba
	 *            Datastore Adapter
	 * @param fmd
	 *            FiAbstractPropertyMetaDataeldMetaData for field to be mapped.
	 * @param table
	 *            Table containing the field
	 */
	public EListMapping(DatastoreAdapter dba, AbstractPropertyMetaData fmd, DatastoreContainerObject datastoreContainer,
			ClassLoaderResolver clr) {
		super(dba, fmd, datastoreContainer, clr);
	}

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
		return new EListWrapper(sm, fldName);
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
		return new EListWrapper(sm, fieldName);
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
		Collection value = (Collection) sm.provideField(fmd.getAbsoluteFieldNumber());
		if (value != null && !value.isEmpty()) {
			// in case of eobject or in case dependent has been set delete it!
			// also assume that if there is a foreign key constraint with cascade that it is depedendent. 
			// This gave better results then trusting the foreign keys
			final boolean dependent = fmd.getCollection().isDependentElement() || 
				fmd.getCollection().isEmbeddedElement() ||
				fmd.getForeignKeyMetaData().getDeleteAction().equals(ForeignKeyAction.CASCADE);
			if (dependent) {
				Object[] values = ((List) value).toArray();
				
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
		Collection value = (Collection) sm.provideField(fmd.getAbsoluteFieldNumber());

		if (value instanceof EListWrapper) {
			// do nothing because this should be already okay
		} else if (value != null) {
			// get the feature
			final EStructuralFeature feature = StoreUtil.getEStructuralFeature((EObject) sm.getObject(), fmd.getName());
			if (feature.getEType().getInstanceClass() == EObject.class) {
				final ArrayList newValues = new ArrayList();
				final Iterator it = value.iterator();
				while (it.hasNext()) {
					final AnyTypeEObject any = new AnyTypeEObject(sm.getPersistenceManager(), (EObject) it.next());
					newValues.add(any);
				}
				value = newValues;
			} else if (feature.getEType().getInstanceClass() == Object.class) {
				final ArrayList newValues = new ArrayList();
				final Iterator it = value.iterator();
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
			sm.replaceField(fmd.getAbsoluteFieldNumber(), new EListWrapper(sm, fieldName, new ArrayList()));
		} else {
			sm.replaceField(fmd.getAbsoluteFieldNumber(), new EListWrapper(sm, fieldName, (List) value));
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
		Collection value = (Collection) sm.provideField(fmd.getAbsoluteFieldNumber());
		
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

		sm.replaceField(fmd.getAbsoluteFieldNumber(), new EListWrapper(sm, fieldName, (List) value));
	}
}