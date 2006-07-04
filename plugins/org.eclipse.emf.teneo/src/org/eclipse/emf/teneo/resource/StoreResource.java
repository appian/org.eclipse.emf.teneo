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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: StoreResource.java,v 1.2 2006/07/04 21:28:53 mtaal Exp $
 */

package org.eclipse.emf.teneo.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EContentsEList.FeatureIteratorImpl;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.eclipse.emf.teneo.StoreValidationException;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * General part of Store Resources. Main feature is that it keeps track of changes to the resource content and that
 * settrackingmodification will not load unloaded elists.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public abstract class StoreResource extends ResourceImpl {
	/** The name of the parameter used for the datastore name */
	public static final String DS_NAME_PARAM = "dsname";

	/** Prefix to use when specifying query parameters in the uri or in the property file */
	public static final String QUERY_PREFIX = "query";

	/** The logger */
	private static Log log = LogFactory.getLog(StoreResource.class);

	/** The list of objects which will be deleted at commit time */
	protected ArrayList removedEObjects = new ArrayList();

	/**
	 * The list of objects loaded from the backend. objects which have been removed are still part of this list. This is
	 * to prevent them from being added to the newEObjects list.
	 */
	protected ArrayList loadedEObjects = new ArrayList();

	/**
	 * The list of new objects new EObjects are never part of the loadedEObjects, when a newEObject is removed it is
	 * just removed from this list and not added to the removed EObjects. new eobjects are never part of the
	 * modifiedEObjects list.
	 */
	protected ArrayList newEObjects = new ArrayList();

	/**
	 * The list of changed objects, this contains the loadedEObjects which have changed new EObjects are never part of
	 * this list
	 */
	protected ArrayList modifiedEObjects = new ArrayList();

	/** True when loading, isLoaded is maintained in the superclass */
	protected boolean isLoading = false;

	/**
	 * Apparently the super EMF resource classes have a different idea of loaded During the unload action they again
	 * start loading from the db, this should be prevented.
	 */
	protected boolean isUnLoading = false;

	/** The list of topclasses */
	protected String[] topClassNames;

	/**
	 * The list of queries if they are defined for this resource. If not set (length is 0) then the resource will as
	 * default behavior read the topclasses of the database.
	 */
	private String[] definedQueries = new String[0];

	/**
	 * The constructor, gets an uri and retrieves the backing OJBStore
	 */
	public StoreResource(URI uri) {
		super(uri);

		if (log.isDebugEnabled()) {
			log.debug("Created " + this.getClass().getName() + " using uri: " + uri.toString());
		}

		setLoaded(false);
	}

	/** Sets topclasses */
	protected void init(String[] topClasses) {
		topClassNames = topClasses;
	}

	// ----------------------------------- Defined Queries ----------------------------------

	/** Sets the defined queries */
	public void setDefinedQueries(String[] qrys) {
		log.debug("Setting defined queries of resource " + getURI().toString() + "/" + this.getClass().getName());
		for (int i = 0; i < qrys.length; i++) {
			log.debug("Adding query: " + qrys[i]);
		}

		definedQueries = qrys;
	}

	/** Returns true if there are defined queries */
	public boolean definedQueriesPresent() {
		return definedQueries.length > 0;
	}

	/**
	 * Returns the current array of defined queries. Note if there are no definedQueries then an array of length 0 is
	 * returned.
	 */
	public String[] getDefinedQueries() {
		return definedQueries;
	}

	/** Returns a list of queries if they are passed as parameters */
	protected String[] getQueries(Map params) {
		final Iterator keys = params.keySet().iterator();
		final ArrayList queries = new ArrayList();
		while (keys.hasNext()) {
			final String key = (String) keys.next();
			if (key.startsWith(QUERY_PREFIX)) {
				queries.add(params.get(key));
			}
		}
		return (String[]) queries.toArray(new String[queries.size()]);
	}

	/** Get the parameter from the hashmap, if not found then throw an exception */
	protected String getParam(HashMap params, String paramName, String report) {
		final String param = (String) params.get(paramName);
		if (param == null) {
			throw new StoreResourceException("Parameter " + paramName + " missing in querystring: " + report);
		}
		return param;
	}

	/** Decode the query string in a hashmap */
	protected HashMap decodeQueryString(String qryStr) {
		final HashMap result = new HashMap();

		if (qryStr == null)
			return result;

		final String[] qryParts = qryStr.split("&");
		for (int i = 0; i < qryParts.length; i++) {
			final String qryPart = qryParts[i];
			final String fieldName = qryPart.substring(0, qryPart.indexOf('='));
			final String fieldValue = URI.decode(qryPart.substring(qryPart.indexOf('=') + 1));
			result.put(fieldName, fieldValue);
		}
		return result;
	}

	// ------------------------------ Subclass methods ---------------------------------

	/**
	 * Returns an array of EObjects which refer to a certain EObject, note if the array is of length zero then no
	 * refering EObjects where found.
	 */
	public abstract Object[] getCrossReferencers(EObject referedTo);

	/** Load implemented by subclass */
	protected abstract List loadResource(Map options);

	/** Save implemented by subclass */
	protected abstract void saveResource(Map options);

	// ------------------------------------ Load ------------------------------------------

	/** Returns true if the resource is loading */
	public boolean isLoading() {
		return isLoading;
	}

	/** Set is loading, is used by persistable elists */
	public void setIsLoading(boolean isLoading) {
		this.isLoading = isLoading;
	}

	/** Returns true if the resource is unloading */
	public boolean isUnLoading() {
		return isUnLoading;
	}

	/** Loads the resource */
	public void load(Map options) {
		if (isUnLoading)
			return;
		if (isLoaded())
			return;

		isLoading = true;
		try {
			clearChangeTrackerArrays();
			List list = loadResource(options);

			// get from the superclass otherwise infinite looping
			final ContentsEList elist = (ContentsEList) super.getContents();

			final Iterator it = list.iterator();
			while (it.hasNext()) {
				final Object obj = it.next();
				if (!elist.contains(obj)) // can maybe happen with extents?
				{
					// fill in the resource, do not use the normal add method because it
					// is possible that a child of a container is loaded, in that case
					// the normal add will remove the container of the object when the
					// resource is set in the child object, this issue can happen with
					// direct reads using queries.
					StoreUtil.setEResource((InternalEObject) obj, this);
					elist.basicAdd(obj, null);
					attached((EObject) obj);
				}
			}
		} finally {
			isLoading = false;
			setLoaded(true);
		}
	}

	/**
	 * Called by subclass
	 * 
	 * /** Saves the resource
	 */
	public void save(Map options) {
		boolean err = true;
		try {
			validateContents();

			saveResource(options);
			err = false;
		} finally {
			// now clear the changed eobjects and move the new objects
			// to the loaded eobjects
			if (!err) {
				modifiedEObjects.clear();
				removedEObjects.clear();
				loadedEObjects.addAll(newEObjects);
				newEObjects.clear();
			}
		}
	}

	/**
	 * Clears different lists to start with an empty resource again. Note that the super.dounload is not called because
	 * that clears the list resulting in all kinds of undesirable inverseremoves and database actions.
	 */
	protected void doUnload() {
		isUnLoading = true;

		getErrors().clear();
		getWarnings().clear();

		clearChangeTrackerArrays();
		isUnLoading = false;
	}

	/** Validate the contents of the resource, only the changed/new EObjects are checked */
	protected void validateContents() throws StoreValidationException {
		// get the changed or new eobjects
		final ArrayList newOrChangedObjects = new ArrayList(newEObjects);
		newOrChangedObjects.addAll(modifiedEObjects);

		log.debug("Validating contents of resource " + uri + " approx. " + newOrChangedObjects.size()
				+ " will be checked");

		final ArrayList diags = new ArrayList();
		for (int i = 0; i < newOrChangedObjects.size(); i++) {
			final InternalEObject obj = (InternalEObject) newOrChangedObjects.get(i);

			// ensure that the resource is set correctly before validating
			assert (obj.eResource() == this);
			EContainerRepairControl.setEResourceToAlLContent((InternalEObject) obj, this);

			if (newOrChangedObjects.contains(obj.eContainer()))
				continue; // they will be checked as part of their container

			final org.eclipse.emf.common.util.Diagnostic diag = validateObject((EObject) newOrChangedObjects.get(i));
			if (diag != null)
				diags.add(diag);
		}
		log.debug("Found " + diags.size() + " errors ");
		if (diags.size() > 0) {
			throw new StoreValidationException((org.eclipse.emf.common.util.Diagnostic[]) diags
					.toArray(new org.eclipse.emf.common.util.Diagnostic[diags.size()]));
		}
	}

	/** Copied from IBM tutorial, validates one eobject */
	public org.eclipse.emf.common.util.Diagnostic validateObject(EObject eObject) {
		org.eclipse.emf.common.util.Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
		if (diagnostic.getSeverity() == org.eclipse.emf.common.util.Diagnostic.ERROR) {
			return diagnostic;
		}
		return null;
	}

	// -------------------------- Content Iteration -----------------------------------

	/**
	 * Override load to force a load when getContents is called without a previous load call.
	 */
	public EList getContents() {
		if (!isLoaded() && !isLoading) {
			load(null);
		}

		// and then do our thing!
		return super.getContents();
	}

	/** Extra method to allow subclasses to easily reach the contents of the superclass of this class */
	protected EList getSuperContents() {
		return super.getContents();
	}

	// -------------------------------- Change Tracker ----------------------------------

	/** Clears the change tracker arrays */
	private void clearChangeTrackerArrays() {
		removedEObjects.clear();
		newEObjects.clear();
		loadedEObjects.clear();
		modifiedEObjects.clear();
	}

	/**
	 * Keeps track of changed objects, CHECK: currently if a tree of objects has been added to this resource and
	 * afterwards a child in the tree is changed then the child is added to the modifiedEObjects list while its
	 * containing parent is part of the addedEObjects list. This should maybe be prevented here but this can come at
	 * some cost as it means that the complete container path has to be loaded for each modification.
	 */
	public void modifiedEObject(EObject eObject) {
		// if (addedEObjects.contains(eObject)) return; // see remark above, if childs are added to the modified list
		// then childs also

		if (loadedEObjects.contains(eObject) && !modifiedEObjects.contains(eObject)) {
			assert (!newEObjects.contains(eObject));
			modifiedEObjects.add(eObject);
		}
	}

	/** Keeps track of new objects */
	public void addedEObject(EObject eObject) {
		if (isLoading()) {
			if (removedEObjects.contains(eObject)) {
				// special case an eobject was removed from the resource but is readded during load of an elist
				// the remove will be done at save
				return;
			}
			// assert (!removedEObjects.contains(eObject));
			assert (!loadedEObjects.contains(eObject));
			loadedEObjects.add(eObject);
		} else {
			// assert (!removedEObjects.contains(eObject));
			assert (!newEObjects.contains(eObject));
			if (removedEObjects.remove(eObject)) {
				modifiedEObjects.add(eObject);
			} else {
				newEObjects.add(eObject);
			}
		}
	}

	/** Keeps track of removed objects */
	public void removedEObject(EObject eObject) {
		assert (!removedEObjects.contains(eObject));

		if (newEObjects.contains(eObject)) {
			newEObjects.remove(eObject); // just remove from this list
			return;
		}

		assert (loadedEObjects.contains(eObject));
		assert (!removedEObjects.contains(eObject));
		removedEObjects.add(eObject);
		loadedEObjects.remove(eObject);
	}

	/** Object is attached, is overridden to use non-resolving iterator */
	public void attached(EObject eObject) {
		attachedHelper(eObject);
		for (Iterator tree = getNonResolvingContent(eObject).basicIterator(); tree.hasNext();) {
			attachedHelper((EObject) tree.next());
		}
	}

	/** Detached means deleted from resource */
	public void detached(EObject eObject) {
		detachedHelper(eObject);
		for (Iterator tree = getNonResolvingContent(eObject).basicIterator(); tree.hasNext();) {
			detachedHelper((EObject) tree.next());
		}
	}

	/**
	 * Attached the object to this resource, This object will be stored at the next save action. Also handles the
	 * specific id generation used for different resource impl.
	 */
	protected void attachedHelper(EObject eObject) {
		// a bit strange as an object can only be contained once but this can happen if someone
		// adds an object to a resource directly and then later add this same object as a child
		// to a container
		if (newEObjects.contains(eObject) || loadedEObjects.contains(eObject))
			return;

		addedEObject(eObject);

		if (isTrackingModification()) {
			eObject.eAdapters().add(modificationTrackingAdapter);
		}

		Map map = getIntrinsicIDToEObjectMap();
		if (map != null) {
			String id = EcoreUtil.getID(eObject);
			if (id != null) {
				map.put(id, eObject);
			}
		}

		if (eObject instanceof InternalEObject && eObject.eResource() == null) {
			StoreUtil.setEResource((InternalEObject) eObject, this);
		}

		// now also attach all ereferences with single values
		for (Iterator it = eObject.eClass().getEAllReferences().iterator(); it.hasNext();) {
			final EReference eref = (EReference) it.next();
			if (!eref.isMany() && eObject.eGet(eref) != null) { // the ismanies are handled differently
				final Resource res = ((EObject) eObject.eGet(eref)).eResource();
				if (res == null) { // attach it to this resource because it has no other
					attached((EObject) eObject.eGet(eref));
				}
			}
		}
	}

	/** Overridden to also support persistence specific id instead of single emf id */
	protected void detachedHelper(EObject eObject) {
		removedEObject(eObject);

		Map map = getIntrinsicIDToEObjectMap();
		if (map != null) {
			String id = EcoreUtil.getID(eObject);
			if (id != null) {
				map.remove(id);
			}
		}

		if (isTrackingModification()) {
			eObject.eAdapters().remove(modificationTrackingAdapter);
		}
	}

	/** Returns the added objects */
	public EObject[] getNewEObjects() {
		return (EObject[]) newEObjects.toArray(new EObject[newEObjects.size()]);
	}

	/** Return the new eobjects */
	public EObject[] getModifiedEObjects() {
		return (EObject[]) modifiedEObjects.toArray(new EObject[modifiedEObjects.size()]);
	}

	/** Return the new eobjects */
	public EObject[] getRemovedEObjects() {
		return (EObject[]) removedEObjects.toArray(new EObject[removedEObjects.size()]);
	}

	/** Overridden to make it non resolving for not loaded elists and proxy eobjects */
	public void setTrackingModification(boolean isTrackingModification) {
		boolean oldIsTrackingModification = modificationTrackingAdapter != null;

		if (oldIsTrackingModification != isTrackingModification) {
			if (isTrackingModification) {

				// note the global modification adapter is set after the for loop
				// because in the for loop extra objects can be added to the resource
				// these objects would get two adapters, once in the attachedHelper method
				// and once here, btw can also prevent this by adding a contains check within
				// for loop
				final Adapter adapter = createModificationTrackingAdapter();

				for (Iterator i = getNonResolvingAllContents(); i.hasNext();) {
					EObject eObject = (EObject) i.next();
					assert (!eObject.eAdapters().contains(adapter));
					eObject.eAdapters().add(adapter);
				}
				modificationTrackingAdapter = adapter;
			} else {
				Adapter oldModificationTrackingAdapter = modificationTrackingAdapter;

				for (Iterator i = getNonResolvingAllContents(); i.hasNext();) {
					EObject eObject = (EObject) i.next();
					assert (eObject.eAdapters().contains(modificationTrackingAdapter));
					eObject.eAdapters().remove(oldModificationTrackingAdapter);
				}
				modificationTrackingAdapter = null;
			}
		}

		if (eNotificationRequired()) {
			Notification notification = new NotificationImpl(Notification.SET, oldIsTrackingModification,
					isTrackingModification) {
				public Object getNotifier() {
					return StoreResource.this;
				}

				public int getFeatureID(Class expectedClass) {
					return RESOURCE__IS_TRACKING_MODIFICATION;
				}
			};
			eNotify(notification);
		}
	}

	/**
	 * Always returns a non-resolving iterator because resolving is defined on model level and the resource should
	 * adhere to that
	 */
	private TreeIterator getNonResolvingAllContents() {
		return new AbstractTreeIterator(this, false) {
			public Iterator getChildren(Object object) {
				return object == StoreResource.this ? ((ContentsEList) getContents()).basicIterator()
						: getNonResolvingContent((EObject) object).basicIterator();
			}
		};
	}

	/** Returns a non-resolving contents elist for an eobject */
	private EContentsEList getNonResolvingContent(EObject eObject) {
		return new EContentsEList(eObject) {
			protected boolean resolve() {
				return false;
			}

			public Iterator basicIterator() {
				if (eStructuralFeatures == null) {
					return FeatureIteratorImpl.EMPTY_ITERATOR;
				}

				return getFeatureIterator(eObject, eStructuralFeatures);
			}
		};
	}

	/** Returns a featureiterator which does not load unloaded elists */
	private Iterator getFeatureIterator(EObject eObject, EStructuralFeature[] eStructuralFeatures) {
		if (eStructuralFeatures == null) {
			return FeatureIteratorImpl.EMPTY_ITERATOR;
		}

		return new FeatureIteratorImpl(eObject, eStructuralFeatures) {
			public boolean hasNext() {
				switch (prepared) {
				case 3:
				case 2: {
					return true;
				}
				case 1: {
					return false;
				}
				case -3: {
					// Undo the preparation for previous and continue.
					values.next();
				}
				default: {
					if (values == null || !scanNext(values)) {
						while (featureCursor < eStructuralFeatures.length) {
							EStructuralFeature feature = eStructuralFeatures[featureCursor++];

							if (feature.isMany()) {
								Object value = eObject.eGet(feature, resolve());
								if (value instanceof PersistableDelegateList
										&& !((PersistableDelegateList) value).isLoaded()) {
									continue;
								}
							}

							if (isIncluded(feature) && (!useIsSet() || eObject.eIsSet(feature))) {
								Object value = eObject.eGet(feature, resolve());
								isHandlingFeatureMap = FeatureMapUtil.isFeatureMap(feature);
								if (isHandlingFeatureMap || feature.isMany()) {
									values = resolve() ? ((List) value).listIterator() : ((InternalEList) value)
											.basicListIterator();
									if (scanNext(values)) {
										preparedResult = values.next();
										if (isHandlingFeatureMap) {
											preparedResult = ((FeatureMap.Entry) preparedResult).getValue();
										}
										preparedFeature = feature;
										prepared = 3;
										return true;
									}
								} else if (value != null) {
									values = null;
									preparedResult = value;
									preparedFeature = feature;
									prepared = 2;
									return true;
								}
							}
						}
						values = null;
						isHandlingFeatureMap = false;
						prepared = 1;
						return false;
					} else {
						preparedResult = values.next();
						if (isHandlingFeatureMap) {
							preparedResult = ((FeatureMap.Entry) preparedResult).getValue();
						}
						prepared = 3;
						return true;
					}
				}
				}
			}
		};
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#createModificationTrackingAdapter()
	 */
	protected Adapter createModificationTrackingAdapter() {
		return new StoreModificationTrackingAdapter();
	}

	/**
	 * An adapter implementation for tracking resource modification, registers changed objects
	 */
	protected class StoreModificationTrackingAdapter extends AdapterImpl {
		public void notifyChanged(Notification notification) {
			switch (notification.getEventType()) {
			case Notification.SET:
			case Notification.UNSET:
			case Notification.MOVE: {
				if (!notification.isTouch()) {
					setModified(true);
					modifiedEObject((EObject) notification.getNotifier());
				}
				break;
			}
			case Notification.ADD:
			case Notification.REMOVE:
			case Notification.ADD_MANY:
			case Notification.REMOVE_MANY: {
				setModified(true);
				break;
			}
			}
		}
	}
}