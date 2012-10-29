package temporal.mod;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;
import org.eclipse.emf.ecore.resource.Resource;

import temporal.Temporal;
import temporal.TemporalPackage;
import temporal.VersionHolder;

/**
 * When editing in the past this handler will use the next EStore to propagate the values to the
 * next versions. This is necessary to bypass the temporality handler and just set the values in the
 * next versions. TODO: It may be more efficient to use the next EStore whenever we want to get/set
 * values from the Temporal base class. Right now I get/set the values from the Temporal base class
 * with the generated getters and setters. It makes the code clear to read however it does rely on
 * the fact that the set checks if the request is for the Temporal base class. It may be more
 * efficient to forward these request to the next EStore directly. This would need to be tried out.
 * 
 * @author jcmcote
 * 
 */
public class TemporalEStoreHandler {

	/**
	 * Temporal processing for setters. The main purpose of the temporal setter hook is to find a
	 * matching verionned object given the current Now time. If none are found it will create a new
	 * versionned object and perform the "setting" request on it. If we find a versionned object that
	 * matches we delegate the "setting" request to it.
	 * 
	 * We also set the value to all subsequent versions. We stop when we hit a version which has this
	 * attribute already set by the user.
	 */
	public static boolean set(InternalEObject givenEObject, EStructuralFeature feature, int index,
			Object value, Object retOldValue[]) {
		boolean handled = false;
		InternalEObject version = findVersionToDelegateMutatorTo(givenEObject, feature);
		if (version != null) {
			// Delegate setting operation to the versioned object.
			if (index == -1) {
				retOldValue[0] = getObject(version, feature);
				// Set value in the version being edited regardless of touched flags.
				version.eSet(feature, value);
				// performSetAndBypassTemporality(version, feature, index, value);

				// And propagate the value to subsequent versions without affecting the touched flags.
				propagateSetToNextVersions(version, feature, index, value);
			} else {
				// Handle the setting into a EList case EList.set(index, value).
				retOldValue[0] = getList(version, feature).set(index, value);
			}
			handled = true;

		} else {
			// If the mutator request is not forked to a version we still must make sure
			// to set the touched attributes.
			if (isTemporalFeature(givenEObject, feature)) {
				// Set value in temporal version/continuity.
				nextEStore(givenEObject).set(givenEObject, feature, index, value);
				// Set touched attribute
				setTouchedAttribute(givenEObject, feature);
				// And propagate the value to subsequent versions without affecting the touched flags.
				propagateSetToNextVersions(givenEObject, feature, index, value);
			}
		}

		return handled;
	}

	public static boolean add(InternalEObject givenEObject, EStructuralFeature feature, int index,
			Object value) {
		InternalEObject version = findVersionToDelegateMutatorTo(givenEObject, feature);
		if (version != null) {
			// Delegate setting operation to this versioned object.
			nextEStore(version).add(version, feature, index, value);
			return true;
		}
		return false;
	}

	public static boolean clear(InternalEObject givenEObject, EStructuralFeature feature) {
		InternalEObject version = findVersionToDelegateMutatorTo(givenEObject, feature);
		if (version != null) {
			// Delegate setting operation to this versioned object.
			nextEStore(version).clear(version, feature);
			return true;
		}
		return false;
	}

	public static boolean move(InternalEObject givenEObject, EStructuralFeature feature,
			int targetIndex, int sourceIndex, Object[] retValue) {
		InternalEObject version = findVersionToDelegateMutatorTo(givenEObject, feature);
		if (version != null) {
			// Delegate setting operation to this versioned object.
			retValue[0] = nextEStore(version).move(version, feature, targetIndex, sourceIndex);

			return true;
		}
		return false;
	}

	public static boolean remove(InternalEObject givenEObject, EStructuralFeature feature, int index,
			Object[] retOldValue) {
		InternalEObject version = findVersionToDelegateMutatorTo(givenEObject, feature);
		if (version != null) {
			// Delegate setting operation to this versioned object.
			retOldValue[0] = nextEStore(version).remove(version, feature, index);
			return true;
		}
		return false;
	}

	/**
	 * Temporal processing for getters. The main purpose of the temporal setter is to forward setter
	 * requests to the versioned objects.
	 * 
	 * TODO: implement the is-feature-temporal check.
	 */
	public static boolean get(InternalEObject givenEObject, EStructuralFeature feature, int index,
			Object[] retValue) {
		InternalEObject version = findVersionToDelegateAccessorTo(givenEObject, feature);
		if (version != null) {
			// Delegate to the a versioned object.
			if (index == -1) {
				retValue[0] = getObject(version, feature);
			} else {
				retValue[0] = getList(version, feature).get(index);
			}
			return true;
		}
		return false;
	}

	public static boolean size(InternalEObject givenEObject, EStructuralFeature feature,
			int[] retValue) {
		InternalEObject version = findVersionToDelegateAccessorTo(givenEObject, feature);
		if (version != null) {
			// Delegate to the a versioned object.
			retValue[0] = nextEStore(version).size(version, feature);
			return true;
		}
		return false;
	}

	public static boolean lastIndexOf(InternalEObject givenEObject, EStructuralFeature feature,
			Object value, int[] retValue) {
		InternalEObject version = findVersionToDelegateAccessorTo(givenEObject, feature);
		if (version != null) {
			// Delegate to the a versioned object.
			retValue[0] = nextEStore(version).lastIndexOf(version, feature, value);
			return true;
		}
		return false;
	}

	public static boolean indexOf(InternalEObject givenEObject, EStructuralFeature feature,
			Object value, int[] retValue) {
		InternalEObject version = findVersionToDelegateAccessorTo(givenEObject, feature);
		if (version != null) {
			// Delegate to the a versioned object.
			retValue[0] = nextEStore(version).indexOf(version, feature, value);
			return true;
		}
		return false;
	}

	public static boolean toArray(InternalEObject givenEObject, EStructuralFeature feature,
			Object[][] retValue) {
		InternalEObject version = findVersionToDelegateAccessorTo(givenEObject, feature);
		if (version != null) {
			// Delegate to the a versioned object.
			retValue[0] = nextEStore(version).toArray(version, feature);
			return true;
		}
		return false;
	}

	public static boolean toArray(InternalEObject givenEObject, EStructuralFeature feature,
			Object[] array, Object[][] retValue) {
		InternalEObject version = findVersionToDelegateAccessorTo(givenEObject, feature);
		if (version != null) {
			// Delegate to the a versioned object.
			retValue[0] = nextEStore(version).toArray(version, feature, array);
			return true;
		}
		return false;
	}

	public static boolean isEmpty(InternalEObject givenEObject, EStructuralFeature feature,
			boolean[] retValue) {
		InternalEObject version = findVersionToDelegateAccessorTo(givenEObject, feature);
		if (version != null) {
			// Delegate to the a versioned object.
			retValue[0] = nextEStore(version).isEmpty(version, feature);
			return true;
		}
		return false;
	}

	public static boolean contains(InternalEObject givenEObject, EStructuralFeature feature,
			Object value, boolean[] retValue) {
		InternalEObject version = findVersionToDelegateAccessorTo(givenEObject, feature);
		if (version != null) {
			// Delegate to the a versioned object.
			retValue[0] = nextEStore(version).contains(version, feature, value);
			return true;
		}
		return false;
	}

	public static boolean hashCode(InternalEObject givenEObject, EStructuralFeature feature,
			int[] retValue) {
		InternalEObject version = findVersionToDelegateAccessorTo(givenEObject, feature);
		if (version != null) {
			// Delegate to the a versioned object.
			retValue[0] = nextEStore(version).hashCode(version, feature);
			return true;
		}
		return false;
	}

	/**
	 * Tests if the feature is part of the Temporal base class.
	 * 
	 * @param feature
	 * @return
	 */
	public static boolean isFeatureFromTemporalBaseClass(EObject givenEObject,
			EStructuralFeature feature) {
		EClass containingEClass = feature.getEContainingClass();
		return (containingEClass == TemporalEStoreHandler.temporalEClass);
	}

	public static byte[] getTouchedAttributes(EObject givenEObject) {
		TemporalEStoreImpl temporalEStore = (TemporalEStoreImpl) ((InternalEObject) givenEObject)
				.eStore();
		byte[] touched = (byte[]) temporalEStore.getNext().get((InternalEObject) givenEObject,
				TemporalPackage.eINSTANCE.getTemporal_TouchedAttributes(), -1);
		if (touched == null) {
			touched = new byte[givenEObject.eClass().getFeatureCount()];
			TemporalEStoreHandler.setTouchedAttributes((Temporal) givenEObject, touched);
		}
		return touched;
	}

	public static void setTouchedAttributes(Temporal temporal, byte[] b) {
		TemporalEStoreImpl temporalEStore = (TemporalEStoreImpl) ((InternalEObject) temporal).eStore();
		temporalEStore.getNext().set((InternalEObject) temporal,
				TemporalPackage.eINSTANCE.getTemporal_TouchedAttributes(), -1, b);
	}

	private static void setTouchedAttribute(EObject givenEObject, EStructuralFeature feature) {
		// Set touched attribute
		int touchedId = givenEObject.eClass().getFeatureID(feature);
		getTouchedAttributes(givenEObject)[touchedId] = 1;
	}

	/**
	 * This method check if the givenEObject is a Temporal and if the feature is from a Temporal
	 * subclass.
	 * 
	 * @param givenEObject
	 * @param feature
	 * @return
	 */
	private static boolean isTemporalFeature(EObject givenEObject, EStructuralFeature feature) {
		if (givenEObject instanceof Temporal) {
			/**
			 * JCC: added this to support versioning of containment features. containment setter / getters
			 * must trigger versioning, however there are no feature for the container attribute of the
			 * EObjectImpl. Note: I should rename isTemporalFeatureOnContinuity to isFeatureOnContinuity
			 */
			if (feature == null || !isFeatureFromTemporalBaseClass(givenEObject, feature)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This method determines if the feature on the given EObject is on the continuity. It checks if
	 * the feature is an attribute of Temporal derived classes but not one of the Temporal base class
	 * itself. These are used internally and are not versionned. For example features like "date",
	 * "versionHolder" from the Temporal class should not trigger versionning. However features like
	 * "brand", "nbDoors" from the Car class should trigger versionning. This method determins if the
	 * feature is temporal "brand", temporal "nbDoor" on a continuity.
	 * 
	 * @param givenEObject
	 * @param feature
	 * @return
	 */
	private static boolean isFeatureOnContinuity(EObject givenEObject, EStructuralFeature feature) {
		// Check if the givenEObject is a Temporal and the requests is for a feature from a Temporal
		// subclass.
		if (isTemporalFeature(givenEObject, feature)) {
			// Check if we are dealing with the continuity object.
			// We don't want to do anything special with the getters and setters of
			// versioned objects (For example in the case of a getter, they are already
			// holding on to the correct value so all we have to do is retun it
			// and let normal processing (the next EStore handler) take care of returning
			// the correct value.
			if (((Temporal) givenEObject).isContinuity()) {
				// This is a feature from a Temporal derived class and the givenEObject is the continuity.
				return true;
			}
		}

		return false;
	}

	/**
	 * Finds the version to apply the accessor request to (a getter). This method uses the current
	 * date and the granularity to find to which version the getter request should be forwarded to.
	 * 
	 * @param givenEObject
	 * @param feature
	 * @return
	 */
	public static InternalEObject findVersionToDelegateAccessorTo(EObject givenEObject,
			EStructuralFeature feature) {
		InternalEObject versionToDelegateTo = null;
		if (isFeatureOnContinuity(givenEObject, feature)) {
			Temporal continuity = (Temporal) givenEObject;
			// Forward the request to the appropriate version.
			Temporal temporalObjectAtNow = continuity.currentVersion();
			// If we get back null from currentVersion it means we are pass the oldest version.
			if (temporalObjectAtNow == null) {
				versionToDelegateTo = (InternalEObject) createPrimordialVersion(continuity);
			}
			// Make sure the version we get back is not in fact the continuity.
			else if (temporalObjectAtNow != continuity) {
				// Ok, it is a versioned object.
				versionToDelegateTo = (InternalEObject) temporalObjectAtNow;
			}
			// else it is the continuity (returning null will forward processing to continuity).
		}
		return versionToDelegateTo;
	}

	/**
	 * When the requested accessor is for a date before any already existing versions we will create a
	 * version to forward the accessor to it. The accessor will thus effectively return the default
	 * value. When a mutator is invoked at this given time it will affect the version we are creating
	 * here.
	 * 
	 * @param continuity
	 */
	private static Temporal createPrimordialVersion(Temporal continuity) {
		// We will create a version for this date. It will contain the default values.
		EClass c = continuity.eClass();
		Temporal newVersion = (Temporal) c.getEPackage().getEFactoryInstance().create(c);

		// This new version is not the continuity. It will be attached to one.
		newVersion.eSet(TemporalPackage.eINSTANCE.getTemporal_Continuity(), false);

		// Stamp the new version with the date of now. If we ever come around to editing it it will
		// be ready to accept mutators.
		newVersion.eSet(TemporalPackage.eINSTANCE.getTemporal_Date(), TemporalUtil.getTrimedNow());

		// Remove the version holder by containment reference it is only needed by the continuity for
		// persistence reasons.
		newVersion.eSet(TemporalPackage.eINSTANCE.getTemporal_VersionHolderContainment(), null);
		newVersion.eSet(TemporalPackage.eINSTANCE.getTemporal_VersionHolder(), null);

		// Add the newly created version to the versionHolder at the end of the list.
		EList versions = continuity.versions();
		int insertIndex = versions.size();
		versions.add(insertIndex, newVersion);

		Resource resource = continuity.eResource();
		if (resource != null) {
			resource.getContents().add(newVersion);
		}

		return newVersion;
	}

	/**
	 * Finds a version to apply the mutator (setter) to. It uses the current date and the granularity
	 * of the temporal to determine to which version to forward the setter request to.
	 * 
	 * @param givenEObject
	 * @param feature
	 * @return
	 */
	public static InternalEObject findVersionToDelegateMutatorTo(EObject givenEObject,
			EStructuralFeature feature) {
		InternalEObject versionToDelegateTo = null;
		if (isFeatureOnContinuity(givenEObject, feature)) {
			Temporal continuityTemporal = (Temporal) givenEObject;
			// Check if we have moved outside any versioned object.
			Date currentNowDate = TemporalEStoreHandler.temporalDateProvider.now();
			if (!continuityTemporal.isDateWithinVersion(currentNowDate)) {
				// We are outside so find the version corresponding to the given time.
				Temporal temporalObjectAtNow = continuityTemporal.currentVersion();
				// Now test if the version we found will work or if we will need to create a new version.
				if (temporalObjectAtNow != null && temporalObjectAtNow.isDateWithinVersion(currentNowDate)) {
					versionToDelegateTo = (InternalEObject) temporalObjectAtNow;
				} else {
					// The current now date is outside any of our versioned objects.
					// Lets create a new version object and copy the modifications
					// made in the continuity to the newly created version object.
					continuityTemporal.createVersion();
					// The continuity has been versioned. i.e.: its values have been copied into
					// a versionned object. We can now let normal processing of the mutator
					// take its course. That is the next EStore will handle the mutator request.
				}
			}
		}
		return versionToDelegateTo;
	}

	private static boolean isTouchedAttribute(EObject givenEObject, EStructuralFeature feature) {
		// Set touched attribute
		int touchedId = givenEObject.eClass().getFeatureID(feature);
		return getTouchedAttributes(givenEObject)[touchedId] != 0;
	}

	/**
	 * This method propagates the values being set on the startVersion object. It makes sure not to
	 * affect the touched flags of the subsequent versions. It also makes sure to stop propagating
	 * this value when it encounters a version that was already set explicitly by the user.
	 * 
	 * @param startVersion
	 * @param feature
	 * @param index
	 * @param value
	 */
	private static void propagateSetToNextVersions(EObject startVersion, EStructuralFeature feature,
			int index, Object value) {
		EList versions = ((Temporal) startVersion).versions();
		// Start at version just after the one being edited.
		int versionIndex = versions.indexOf(startVersion) - 1;
		while (versionIndex >= 0) {
			InternalEObject version = (InternalEObject) versions.get(versionIndex);
			if (isTouchedAttribute(version, feature) == false) {
				nextEStore(version).set(version, feature, -1, value);
			} else {
				break;
			}
			versionIndex--;
		}
	}

	/**
	 * Get the EList from the feature on the givenEObject.
	 * 
	 * @param givenEObject
	 * @param feature
	 * @return
	 */
	private static EList getList(EObject givenEObject, EStructuralFeature feature) {
		assert (givenEObject.eGet(feature) instanceof EList);
		return (EList) nextEStore(givenEObject).get((InternalEObject) givenEObject, feature, -1);
	}

	/**
	 * Get the value from the feature on the givenEObject
	 * 
	 * @param givenEObject
	 * @param feature
	 * @return
	 */
	private static Object getObject(EObject givenEObject, EStructuralFeature feature) {
		return givenEObject.eGet(feature);
	}

	private static EStore nextEStore(EObject givenEObject) {
		TemporalEStoreImpl temporalEStore = (TemporalEStoreImpl) ((InternalEObject) givenEObject)
				.eStore();
		EStore nextEStore = temporalEStore.getNext();
		return nextEStore;
	}

	private static final EClass temporalEClass = TemporalPackage.eINSTANCE.getTemporal();

	private static final TemporalDateProvider temporalDateProvider = TemporalDateProvider.eINSTANCE;

}
