package temporal.mod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import temporal.Temporal;
import temporal.TemporalPackage;
import temporal.VersionHolder;

/**
 * The TemporalCopier is a modified version of the EMF Copier class. The copier copies EObject and
 * their references. The TemporalCopier provides the facility to create versions of Temporal
 * continuities.
 * 
 * To ease merges with future versions of EMF I took care to record where I modified the original
 * code of the Copier to support Temporal copying.
 * 
 * 1) copyTemporalAttributes: Copies all Temporal specific attributes and references. Transfers the
 * date and touched attributes. 2) attachVersionToContinuity: Attaches the newly created version to
 * the version holder of the continuity. 3) copyBidirectional: Creates versions of any temporal
 * associated in a bidirectional association with the temporal being versioned. Temporal in a
 * bidirectional relation are necessarily versioned together. However it is possible that in a
 * timeframe a versioned temporal is re-associated with a temporal that was not versioned in the
 * given timeframe. In that situation we have a temporal that already has a version. So we can't
 * assume that if we are versionning a temporal in a bidirectional association the opposite will
 * need to be versioned it may already exist.
 * 
 * @author jcmcote
 * 
 */
public class TemporalCopier extends HashMap {

	/**
	 * Date of copying.
	 */

	protected final Date copyDate;

	/**
	 * Whether proxies should be resolved during copying.
	 */
	protected boolean resolveProxies = true;

	/**
	 * Creates an instance.
	 */
	protected TemporalCopier(final Date copyDate) {
		this.copyDate = copyDate;
	}

	/**
	 * Creates an instance that resolves proxies or not as specified.
	 * 
	 * @param resolveProxies
	 *          whether proxies should be resolved while copying.
	 */
	protected TemporalCopier(final Date copyDate, boolean resolveProxies) {
		this.resolveProxies = resolveProxies;
		this.copyDate = copyDate;
	}

	/**
	 * Hooks up cross references; it delegates to {@link #copyReference copyReference}.
	 */
	protected void copyReferences() {
		for (Iterator i = entrySet().iterator(); i.hasNext();) {
			Map.Entry entry = (Map.Entry) i.next();
			EObject eObject = (EObject) entry.getKey();
			EObject copyEObject = (EObject) entry.getValue();
			EClass eClass = eObject.eClass();
			for (int j = 0, size = eClass.getFeatureCount(); j < size; ++j) {
				EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(j);
				// JCC: make sure to skip any refs from the Temporal base class.
				if (!TemporalEStoreHandler.isFeatureFromTemporalBaseClass(eObject, eStructuralFeature)) {

					if (eStructuralFeature.isChangeable() && !eStructuralFeature.isDerived()) {
						if (eStructuralFeature instanceof EReference) {
							EReference eReference = (EReference) eStructuralFeature;
							if (!eReference.isContainment() && !eReference.isContainer()) {
								copyReference(eReference, eObject, copyEObject);
							}
						} else if (FeatureMapUtil.isFeatureMap(eStructuralFeature)) {
							FeatureMap featureMap = (FeatureMap) eObject.eGet(eStructuralFeature);
							FeatureMap copyFeatureMap = (FeatureMap) copyEObject
									.eGet(getTarget(eStructuralFeature));
							int copyFeatureMapSize = copyFeatureMap.size();
							for (int k = 0, featureMapSize = featureMap.size(); k < featureMapSize; ++k) {
								EStructuralFeature feature = featureMap.getEStructuralFeature(k);
								if (feature instanceof EReference) {
									Object referencedEObject = featureMap.getValue(k);
									Object copyReferencedEObject = get(referencedEObject);
									if (copyReferencedEObject == null && referencedEObject != null) {
										EReference reference = (EReference) feature;
										if (reference.isContainment() || reference.getEOpposite() != null) {
											continue;
										}
										copyReferencedEObject = referencedEObject;
									}
									// If we can't add it, it must already be in
									// the list so find it and move it to the
									// end.
									//
									if (!copyFeatureMap.add(feature, copyReferencedEObject)) {
										for (int l = 0; l < copyFeatureMapSize; ++l) {
											if (copyFeatureMap.getEStructuralFeature(l) == feature
													&& copyFeatureMap.getValue(l) == copyReferencedEObject) {
												copyFeatureMap.move(copyFeatureMap.size() - 1, l);
												--copyFeatureMapSize;
												break;
											}
										}
									}
								} else {
									copyFeatureMap.add(featureMap.get(k));
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * Called to handle the copying of a cross reference; this adds values or sets a single value as
	 * appropriate for the multiplicity while omitting any bidirectional reference that isn't in the
	 * copy map.
	 * 
	 * @param eReference
	 *          the reference to copy.
	 * @param eObject
	 *          the object from which to copy.
	 * @param copyEObject
	 *          the object to copy to.
	 */
	protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject) {

		if (eObject.eIsSet(eReference)) {
			if (eReference.isMany()) {
				InternalEList source = (InternalEList) eObject.eGet(eReference);
				InternalEList target = (InternalEList) copyEObject.eGet(getTarget(eReference));
				if (source.isEmpty()) {
					target.clear();
				} else {
					boolean isBidirectional = eReference.getEOpposite() != null;
					int index = 0;
					for (Iterator k = resolveProxies ? source.iterator() : source.basicIterator(); k
							.hasNext();) {
						Object referencedEObject = null;
						referencedEObject = k.next();
						Object copyReferencedEObject = get(referencedEObject);
						if (copyReferencedEObject == null) {
							if (!isBidirectional) {
								target.addUnique(index, referencedEObject);
								++index;
							}
							// JCC: If it is a bidirectional reference and the
							// opposite is a Temporal copy the reference.
							else {
								if (referencedEObject instanceof Temporal) {
									assert (((Temporal) referencedEObject).isContinuity());
									System.err.println("---------------copying bidirectional ref..");
									System.err.println("---------------what conditions make this happen??");
									target.addUnique(index, referencedEObject);
									++index;
								}
							}
						} else {
							if (isBidirectional) {
								int position = target.indexOf(copyReferencedEObject);
								if (position == -1) {
									target.addUnique(index, copyReferencedEObject);
								} else if (index != position) {
									target.move(index, copyReferencedEObject);
								}
							} else {
								target.addUnique(index, copyReferencedEObject);
							}
							++index;
						}
					}
				}
			} else {
				Object referencedEObject = eObject.eGet(eReference, resolveProxies);
				if (referencedEObject == null) {
					copyEObject.eSet(getTarget(eReference), null);
				} else {
					Object copyReferencedEObject = get(referencedEObject);
					if (copyReferencedEObject == null) {
						if (eReference.getEOpposite() == null) {
							copyEObject.eSet(getTarget(eReference), referencedEObject);
						}
						// JCC: If it is a bidirectional reference and the
						// opposite is a Temporal copy the reference.
						else {
							if (referencedEObject instanceof Temporal) {
								assert (((Temporal) referencedEObject).isContinuity());
								System.err.println("---------------copying bidirectional ref..");
								System.err.println("---------------what conditions make this happen??");
								copyEObject.eSet(getTarget(eReference), referencedEObject);
							}
						}
					} else {
						copyEObject.eSet(getTarget(eReference), copyReferencedEObject);
					}
				}
			}
		}
	}

	/**
	 * Returns a collection containing a copy of each EObject in the given collection.
	 * 
	 * @param eObjects
	 *          the collection of objects to copy.
	 * @return the collection of copies.
	 */
	protected Collection copyAll(Collection eObjects) {
		Collection result = new ArrayList(eObjects.size());
		for (Iterator i = eObjects.iterator(); i.hasNext();) {
			result.add(copy((EObject) i.next()));
		}
		return result;
	}

	/**
	 * Returns a copy of the given eObject.
	 * 
	 * @param eObject
	 *          the object to copy.
	 * @return the copy.
	 */
	protected EObject copy(EObject eObject) {

		// JCC: If we already have a copy for this object skip the copying
		// process.
		EObject copyEObject = (EObject) get(eObject);
		if (copyEObject != null) {
			return copyEObject;
		}

		copyEObject = createCopy(eObject);
		put(eObject, copyEObject);

		// JCC: mark the continuity and the new version as bypassing
		// temporality.
		((TemporalEStoreImpl) ((TemporalBaseEObjectImpl) eObject).eStore()).setBypass(true);
		((TemporalEStoreImpl) ((TemporalBaseEObjectImpl) copyEObject).eStore()).setBypass(true);

		// JCC: copy temporal attributes manually.
		copyTemporalAttributes((Temporal) eObject, (Temporal) copyEObject);

		// JCC: attach new version to continuity.
		attachVersionToContinuity((Temporal) eObject, (Temporal) copyEObject);

		// JCC: add new version create to resource if it exists.
		addVersionToContainer((Temporal) eObject, (Temporal) copyEObject);

		EClass eClass = eObject.eClass();
		for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
			EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
			// JCC: Do not copy attributes from the Temporal base class. We
			// copied them ourselves in the copyTemporalAttributes method.
			if (!TemporalEStoreHandler.isFeatureFromTemporalBaseClass(eObject, eStructuralFeature)) {
				if (eStructuralFeature.isChangeable() && !eStructuralFeature.isDerived()) {
					if (eStructuralFeature instanceof EAttribute) {
						copyAttribute((EAttribute) eStructuralFeature, eObject, copyEObject);
					} else {
						EReference eReference = (EReference) eStructuralFeature;
						if (eReference.isContainment()) {
							copyContainment(eReference, eObject, copyEObject);
						}
						// JCC: If we have a bidirectional relationship we have
						// to make sure to create versions for the opposite.
						else if (eReference.getEOpposite() != null) {
							copyBidirectional(eReference, eObject);
						}
					}
				}
			}
		}

		copyProxyURI(eObject, copyEObject);

		return copyEObject;
	}

	/**
	 * Copies the proxy URI from the original to the copy, if present.
	 * 
	 * @param eObject
	 *          the object being copied.
	 * @param copyEObject
	 *          the copy being initialized.
	 */
	protected void copyProxyURI(EObject eObject, EObject copyEObject) {
		if (eObject.eIsProxy()) {
			((InternalEObject) copyEObject).eSetProxyURI(((InternalEObject) eObject).eProxyURI());
		}
	}

	/**
	 * Returns a new instance of the object's target class.
	 * 
	 * @param eObject
	 *          the object to copy.
	 * @return a new instance of the target class.
	 * @see #getTarget(EClass)
	 * @see EcoreUtil#create(EClass)
	 */
	protected EObject createCopy(EObject eObject) {
		return EcoreUtil.create(getTarget(eObject.eClass()));
	}

	/**
	 * Returns the target class used to create a copy instance for objects of the given source class.
	 * 
	 * @param eClass
	 *          the source class.
	 * @return the target class used to create a copy instance.
	 * @see #getTarget(EStructuralFeature)
	 */
	protected EClass getTarget(EClass eClass) {
		return eClass;
	}

	/**
	 * Returns the target feature used to populate a copy instance from the given source feature.
	 * 
	 * @param eStructuralFeature
	 *          the source feature.
	 * @return the target feature used to populate a copy instance.
	 * @see #getTarget(EClass)
	 */
	protected EStructuralFeature getTarget(EStructuralFeature eStructuralFeature) {
		return eStructuralFeature;
	}

	/**
	 * Called to handle the copying of a containment feature; this adds a list of copies or sets a
	 * single copy as appropriate for the multiplicity.
	 * 
	 * @param eReference
	 *          the feature to copy.
	 * @param eObject
	 *          the object from which to copy.
	 * @param copyEObject
	 *          the object to copy to.
	 */
	protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject) {
		if (eObject.eIsSet(eReference)) {
			if (eReference.isMany()) {
				List source = (List) eObject.eGet(eReference);
				List target = (List) copyEObject.eGet(getTarget(eReference));
				if (source.isEmpty()) {
					target.clear();
				} else {
					target.addAll(copyAll(source));

					/**
					 * JCC: added this to support versioning of containment features. fix containment
					 * references.
					 */
					InternalEObject continuityContainer = (InternalEObject) eObject;
					int containerFeatureID = ((InternalEObject) source.get(0)).eContainerFeatureID();
					for (int i = 0; i < target.size(); i++) {
						Object copyChildEObject = target.get(i);
						if (copyChildEObject instanceof Temporal) {
							Object continuity = ((Temporal) copyChildEObject).continuity();
							((TemporalEStoreImpl) ((InternalEObject) copyEObject).eStore()).set(
									(InternalEObject) copyEObject, eReference, i, continuity);
							((InternalEObject) copyChildEObject).eBasicSetContainer(continuityContainer,
									containerFeatureID, null);
						}
					}
				}
			} else {
				EObject childEObject = (EObject) eObject.eGet(eReference);
				EObject copyChildEObject = childEObject == null ? null : copy(childEObject);
				copyEObject.eSet(getTarget(eReference), copyChildEObject);

				/**
				 * JCC: added this to support versioning of containment features. fix containment
				 * references.
				 */
				if (copyChildEObject instanceof Temporal) {
					InternalEObject continuityContainer = (InternalEObject) eObject;
					int containerFeatureID = ((InternalEObject) childEObject).eContainerFeatureID();
					Object continuity = (childEObject);
					((TemporalEStoreImpl) ((InternalEObject) copyEObject).eStore()).set(
							(InternalEObject) copyEObject, eReference, -1, continuity);
					((InternalEObject) copyChildEObject).eBasicSetContainer(continuityContainer,
							containerFeatureID, null);
				}
			}
		}
	}

	/**
	 * Called to handle the copying of an attribute; this adds a list of values or sets a single value
	 * as appropriate for the multiplicity.
	 * 
	 * @param eAttribute
	 *          the attribute to copy.
	 * @param eObject
	 *          the object from which to copy.
	 * @param copyEObject
	 *          the object to copy to.
	 */
	protected void copyAttribute(EAttribute eAttribute, EObject eObject, EObject copyEObject) {
		if (eObject.eIsSet(eAttribute)) {
			if (FeatureMapUtil.isFeatureMap(eAttribute)) {
				FeatureMap featureMap = (FeatureMap) eObject.eGet(eAttribute);
				for (int i = 0, size = featureMap.size(); i < size; ++i) {
					EStructuralFeature feature = featureMap.getEStructuralFeature(i);
					if (feature instanceof EReference && ((EReference) feature).isContainment()) {
						Object value = featureMap.getValue(i);
						if (value != null) {
							copy((EObject) value);
						}
					}
				}
			} else if (eAttribute.isMany()) {
				List source = (List) eObject.eGet(eAttribute);
				List target = (List) copyEObject.eGet(getTarget(eAttribute));
				if (source.isEmpty()) {
					target.clear();
				} else {
					target.addAll(source);
				}
			} else {
				copyEObject.eSet(getTarget(eAttribute), eObject.eGet(eAttribute));
			}
		}
	}

	/**
	 * JCC: This method creates versions for the opposite Temporals. If the opposite is not Temporal
	 * and exception is thrown. Note: This method just creates a version of the opposite it does not
	 * fix the references. The copyReferences will do that later.
	 * 
	 * @param eReference
	 * @param eObject
	 * @param copyEObject
	 */
	protected void copyBidirectional(EReference eReference, EObject eObject) {
		if (eObject.eIsSet(eReference)) {
			if (eReference.isMany()) {
				List source = (List) eObject.eGet(eReference);
				for (Iterator i = source.iterator(); i.hasNext();) {
					EObject itemEObject = (EObject) i.next();
					// bidirectional association must be with other temporal
					// object.
					assert (itemEObject instanceof Temporal);
					EObject referencedEObject = (EObject) get(itemEObject);
					if (referencedEObject == null) {
						copyOpposite((Temporal) itemEObject);
					}
				}
			} else {
				EObject childEObject = (EObject) eObject.eGet(eReference);
				if (childEObject != null) {
					// bidirectional association must be with other temporal
					// object.
					assert (childEObject instanceof Temporal);
					EObject referencedEObject = (EObject) get(childEObject);
					if (referencedEObject == null) {
						copyOpposite((Temporal) childEObject);
					}
				}
			}
		}
	}

	/**
	 * JCC: This method copies an opposite Temporal. If the opposite is not a continuity an exception
	 * is thrown. Also if the given opposite temporal already has a suitable version none is created.
	 * 
	 * @param childTemporal
	 */
	protected void copyOpposite(Temporal childTemporal) {
		// Can't point to a version using bidirectional.
		assert (childTemporal.isContinuity() == true);

		// We are outside so find the version corresponding to the given time.
		Temporal temporalObjectAtNow = childTemporal.currentVersion();
		// Now test if the version we found will work or if we will need to
		// create a new version.
		if (temporalObjectAtNow == null || !temporalObjectAtNow.isDateWithinVersion(copyDate)) {
			// We do not have a version for it so create one.
			copy(childTemporal);
		} else {
			System.err.println("------------ FYI: skiping creating version.");
			System.err.println("------------ what causes this condition???");
		}
	}

	/**
	 * JCC: This method copies the attributes of the Temporal base class.
	 * 
	 * @param continuity
	 * @param newVersion
	 */
	private void copyTemporalAttributes(Temporal continuity, Temporal newVersion) {
		newVersion.eSet(TemporalPackage.eINSTANCE.getTemporal_Continuity(), false);
		newVersion.eSet(TemporalPackage.eINSTANCE.getTemporal_Date(), continuity.getDate());

		TemporalEStoreHandler.setTouchedAttributes(newVersion,
				TemporalEStoreHandler.getTouchedAttributes(continuity));
		// Remove the reference to the touched attributes from the continuity.
		// It will get a new set of touched attributes when required.
		TemporalEStoreHandler.setTouchedAttributes(continuity, null);

		// Remove the version holder by containment reference it is only needed by the continuity
		// for persistence reasons.
		newVersion.eSet(TemporalPackage.eINSTANCE.getTemporal_VersionHolderContainment(), null);
		newVersion.eSet(TemporalPackage.eINSTANCE.getTemporal_VersionHolder(), null);

		// Bump the date of the continuity to now.
		continuity.eSet(TemporalPackage.eINSTANCE.getTemporal_Date(), copyDate);
	}

	/**
	 * JCC: This method adds the newly created version to the resource if any.
	 * 
	 * @param continuity
	 * @param newVersion
	 */
	private void addVersionToContainer(Temporal continuity, Temporal newVersion) {
		/**
		 * JCC: added this to support versioning of containment features. The TemporalCopier made a
		 * version of a continuity. We now check if the continuity had a container. If so we will need
		 * to version the container also. If it does not we check if it is attached to a resource if so
		 * its versions also be attached to the same resource.
		 */
		InternalEObject continuityContainer = (InternalEObject) continuity.eContainer();
		if (continuityContainer != null) {
			// Version the container of this temporal.
			this.copy(continuityContainer);
		} else {
			Resource resource = continuity.eResource();
			if (resource != null) {
				resource.getContents().add(newVersion);
			}
		}
	}

	/**
	 * JCC: This method adds the newly created version to the list of versions for the continuity.
	 * Adds the new version to the versions list by inserting the new version at the location of the
	 * current continuity and repositioning the continuity according to its new date.
	 * 
	 * @param continuity
	 * @param newVersion
	 */
	private static void attachVersionToContinuity(Temporal continuity, Temporal newVersion) {
		VersionHolder vh = (VersionHolder) continuity.eGet(TemporalPackage.eINSTANCE
				.getTemporal_VersionHolder());
		EList versions = vh.getVersions();

		assert (continuity.isContinuity());
		// Insert new version at index of continuity.
		assert (versions.contains(newVersion) == false);
		assert (versions.contains(continuity) == true);
		int indexOfContinuity = vh.getIndexOfContinuity();
		versions.set(indexOfContinuity, newVersion);
		assert (versions.contains(newVersion) == true);
		assert (versions.contains(continuity) == false);

		// Insert the continuity at the proper location based on its new date.
		int versionCount = versions.size();
		Date newDateOfContinuity = continuity.getDate();

		int insertIndex = versionCount;
		for (int i = 0; i < versionCount; i++) {
			Temporal cur = (Temporal) versions.get(i);
			if (newDateOfContinuity.after(cur.getDate())) {
				insertIndex = i;
				break;
			}
		}

		vh.setIndexOfContinuity(insertIndex);

		versions.add(insertIndex, continuity);
		assert (versions.contains(newVersion) == true);
		assert (versions.contains(continuity) == true);

		// Note the copier did not copy the reference to the version holder because
		// it is not a containment reference. However since we added the version to the
		// versions list which is in bi-directional relation with the versionHolder attribute
		// it got set. (is this still true? I now use the copy method of the
		// copier which I think may be coping this reference..)
		assert (newVersion.eGet(TemporalPackage.eINSTANCE.getTemporal_VersionHolder()) == vh);
	}

	/**
	 * JCC: Reset all the bypass flags.
	 */
	private void resetBypassFlags() {
		for (Iterator i = entrySet().iterator(); i.hasNext();) {
			Map.Entry entry = (Map.Entry) i.next();
			EObject eObject = (EObject) entry.getKey();
			EObject copyEObject = (EObject) entry.getValue();
			((TemporalEStoreImpl) ((TemporalBaseEObjectImpl) eObject).eStore()).setBypass(false);
			((TemporalEStoreImpl) ((TemporalBaseEObjectImpl) copyEObject).eStore()).setBypass(false);
		}
	}

	/**
	 * JCC: This is the main entry point into the temporal copier. It is used by the generated codes
	 * createVersion() method.
	 * 
	 * @param continuity
	 * @return
	 */
	public static Temporal createVersion(Temporal continuity, Date copyDate) {
		// sanity check.
		if (!continuity.isContinuity()) {
			throw new UnsupportedOperationException();
		}

		// Create a version based on this continuity version.
		TemporalCopier copier = new TemporalCopier(copyDate);
		Temporal copy = (Temporal) copier.copy(continuity);
		copier.copyReferences();
		copier.resetBypassFlags();
		// copier.fixContainments();
		return copy;
	}

	/**
	 * Hooks up cross references; it delegates to {@link #copyReference copyReference}.
	 */
	protected void fixContainments() {
		for (Iterator i = entrySet().iterator(); i.hasNext();) {
			Map.Entry entry = (Map.Entry) i.next();
			EObject eObject = (EObject) entry.getKey();
			EObject copyEObject = (EObject) entry.getValue();
			EClass eClass = eObject.eClass();
			for (int j = 0, size = eClass.getFeatureCount(); j < size; ++j) {
				EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(j);
				// JCC: make sure to skip any refs from the Temporal base class.
				if (!TemporalEStoreHandler.isFeatureFromTemporalBaseClass(eObject, eStructuralFeature)) {

					if (eStructuralFeature.isChangeable() && !eStructuralFeature.isDerived()) {
						if (eStructuralFeature instanceof EReference) {
							EReference eReference = (EReference) eStructuralFeature;
							if (eReference.isContainment() || eReference.isContainer()) {
								fixContainment(eReference, eObject, copyEObject);
							}
						}
						// else if (FeatureMapUtil.isFeatureMap(eStructuralFeature)) {
						// FeatureMap featureMap = (FeatureMap) eObject.eGet(eStructuralFeature);
						// FeatureMap copyFeatureMap = (FeatureMap)
						// copyEObject.eGet(getTarget(eStructuralFeature));
						// int copyFeatureMapSize = copyFeatureMap.size();
						// for (int k = 0, featureMapSize = featureMap.size(); k < featureMapSize; ++k) {
						// EStructuralFeature feature = featureMap.getEStructuralFeature(k);
						// if (feature instanceof EReference) {
						// Object referencedEObject = featureMap.getValue(k);
						// Object copyReferencedEObject = get(referencedEObject);
						// if (copyReferencedEObject == null && referencedEObject != null) {
						// EReference reference = (EReference) feature;
						// if (reference.isContainment() || reference.getEOpposite() != null) {
						// continue;
						// }
						// copyReferencedEObject = referencedEObject;
						// }
						// // If we can't add it, it must already be in
						// // the list so find it and move it to the
						// // end.
						// //
						// if (!copyFeatureMap.add(feature, copyReferencedEObject)) {
						// for (int l = 0; l < copyFeatureMapSize; ++l) {
						// if (copyFeatureMap.getEStructuralFeature(l) == feature && copyFeatureMap.getValue(l)
						// ==
						// copyReferencedEObject) {
						// copyFeatureMap.move(copyFeatureMap.size() - 1, l);
						// --copyFeatureMapSize;
						// break;
						// }
						// }
						// }
						// }
						// // else {
						// // copyFeatureMap.add(featureMap.get(k));
						// // }
						// }
						// }
					}
				}
			}
		}
	}

	/**
	 * Called to handle the copying of a cross reference; this adds values or sets a single value as
	 * appropriate for the multiplicity while omitting any bidirectional reference that isn't in the
	 * copy map.
	 * 
	 * @param eReference
	 *          the reference to copy.
	 * @param eObject
	 *          the object from which to copy.
	 * @param copyEObject
	 *          the object to copy to.
	 */
	protected void fixContainment(EReference eReference, EObject eObject, EObject copyEObject) {

		if (eObject.eIsSet(eReference)) {
			if (eReference.isMany()) {
				InternalEList source = (InternalEList) eObject.eGet(eReference);
				InternalEList target = (InternalEList) copyEObject.eGet(getTarget(eReference));
				if (source.isEmpty()) {
					target.clear();
				} else {
					ArrayList<EObject> x = new ArrayList<EObject>();
					for (Iterator k = resolveProxies ? source.iterator() : source.basicIterator(); k
							.hasNext();) {
						EObject obj = (EObject) k.next();
						if (obj instanceof Temporal) {
							x.add(obj);
						}
					}

					for (EObject obj : x) {
						target.add(obj);
					}

					// Object copyReferencedEObject = get(referencedEObject);
					// if (copyReferencedEObject == null) {
					// if (!isBidirectional) {
					// target.addUnique(index, referencedEObject);
					// ++index;
					// }
					// // JCC: If it is a bidirectional reference and the
					// // opposite is a Temporal copy the reference.
					// else {
					// if (referencedEObject instanceof Temporal) {
					// assert (((Temporal) referencedEObject).isContinuity());
					// System.err.println("---------------copying bidirectional ref..");
					// System.err.println("---------------what conditions make this happen??");
					// target.addUnique(index, referencedEObject);
					// ++index;
					// }
					// }
					// }
					// else {
					// if (isBidirectional) {
					// int position = target.indexOf(copyReferencedEObject);
					// if (position == -1) {
					// target.addUnique(index, copyReferencedEObject);
					// }
					// else if (index != position) {
					// target.move(index, copyReferencedEObject);
					// }
					// }
					// else {
					// target.addUnique(index, copyReferencedEObject);
					// }
					// ++index;
					// }
					// }
				}
			} else {
				Object referencedEObject = eObject.eGet(eReference, resolveProxies);
				if (referencedEObject == null) {
					copyEObject.eSet(getTarget(eReference), null);
				} else {
					Object copyReferencedEObject = get(referencedEObject);
					if (copyReferencedEObject == null) {
						if (eReference.getEOpposite() == null) {
							copyEObject.eSet(getTarget(eReference), referencedEObject);
						}
						// JCC: If it is a bidirectional reference and the
						// opposite is a Temporal copy the reference.
						else {
							if (referencedEObject instanceof Temporal) {
								assert (((Temporal) referencedEObject).isContinuity());
								System.err.println("---------------copying bidirectional ref..");
								System.err.println("---------------what conditions make this happen??");
								copyEObject.eSet(getTarget(eReference), referencedEObject);
							}
						}
					} else {
						copyEObject.eSet(getTarget(eReference), copyReferencedEObject);
					}
				}
			}
		}
	}
}
