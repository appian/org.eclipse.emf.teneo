package temporal.mod;

import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import temporal.Temporal;
import temporal.TemporalFactory;
import temporal.TemporalPackage;
import temporal.VersionHolder;
import temporal.TemporalPackage.Literals;

/**
 * This class implements the Temporal operations generated into every type with a
 * Temporal super type.
 * @author jcmcote
 *
 */
public class TemporalUtil {

	public static VersionHolder getVersionHolder(EObject eObject) {
		return (VersionHolder)eObject.eGet(TemporalPackage.Literals.TEMPORAL__VERSION_HOLDER, true);
	}
	
	public static Date getDate(EObject eObject) {
		return (Date)eObject.eGet(TemporalPackage.Literals.TEMPORAL__DATE, true);
	}
	
	public static Date getTrimedNow(){
		return TemporalDateProvider.eINSTANCE.trimDate(TemporalDateProvider.eINSTANCE.now(), TemporalDateProvider.eINSTANCE.getGranularity());
	}
	
	
	/**
	 * If we are constructing an EObject with a Temporal super type we need
	 * to initialize its current date attribute and version holder.
	 */
	public static void initTemporal(EObject eObject){
		if (eObject instanceof Temporal) {
			
			/**
			 * JCC: added this to support versioning of containment features.
			 * bypass temporality when setting up the verion holders.
			 */
			// JCC: mark the continuity and the new version as bypassing temporality.
			((TemporalEStoreImpl) ((TemporalBaseEObjectImpl) eObject).eStore()).setBypass(true);
			
			eObject.eSet(TemporalPackage.Literals.TEMPORAL__DATE, getTrimedNow());
			
			VersionHolder newVersionHolder = temporal.TemporalFactory.eINSTANCE.createVersionHolder();
			// Set containment relationship.
			eObject.eSet(TemporalPackage.Literals.TEMPORAL__VERSION_HOLDER_CONTAINMENT, newVersionHolder);
			// Set reference to it.
			eObject.eSet(TemporalPackage.Literals.TEMPORAL__VERSION_HOLDER, newVersionHolder);
			
			((TemporalEStoreImpl) ((TemporalBaseEObjectImpl) eObject).eStore()).setBypass(false);
		}
	}
	

	/**
	 * This method returns the version corresponding to the given date. The version returned
	 * can either be the continuity or a versioned object. It returns the version that is
	 * earlier or equal to the given date. Null is returned if no version exists which is 
	 * earlier than the given date.
	 */	
	public static Temporal versionAt(EObject eObject, Date date) {
		// Note the continuity is always at index 0 followed by the versions.
		// Also note that versions are generally older than the continuity but could also be newer as in the
		// case of editing in the future.
		// This method handles retrieval of the best match of a version or the continuity.
		// Best match means the date of the version/continuity that is closest to the given date without
		// being passed it.
		
		Temporal version = null;
		Temporal continuity = null;
		Date continuityDate = null;
		
		EList versions = versions(eObject);
		VersionHolder vh = getVersionHolder(eObject);
		int indexOfContinuity = vh.getIndexOfContinuity();
		boolean continuityPresent = (versions.size() > 0);
			
		// Nothing in the list not even a continuity.
		if(continuityPresent == false){
			return null;
		}
		
		// Continuity is at index indexOfContinuity.
		continuity = (Temporal) versions.get(indexOfContinuity);
		continuityDate = continuity.getDate();
		// Check if date match perfectly.
		
		if(TemporalDateProvider.eINSTANCE.areEqual(continuityDate, date, TemporalDateProvider.eINSTANCE.getGranularity())){
			// Don't bother looking further we've got the best match.
			return continuity;
		}
		
		Date trimmedDate = TemporalDateProvider.eINSTANCE.trimDate(date, TemporalDateProvider.eINSTANCE.getGranularity());
		
		// We also have versioned objects. Need to check if one of them is a partial match.
		Iterator it = versions.iterator();
		while (it.hasNext()) {
			Temporal curr = (Temporal)it.next();
			Date currDate = curr.getDate();
			// compareTo returns 1 if the given date is after the currDate.
			if(trimmedDate.compareTo(currDate) >= 0 ){
				version = curr;
				break;
			}			
		}
		
		return version;
	}

	public static Temporal createVersion(EObject eObject) {
		assert(eObject instanceof Temporal);
		return TemporalCopier.createVersion((Temporal)eObject, getTrimedNow());
	}

	public static boolean isDateWithinVersion(EObject eObject, Date date) {
		return TemporalDateProvider.eINSTANCE.areEqual(date, getDate(eObject), TemporalDateProvider.eINSTANCE.getGranularity());
	}

	public static Temporal continuity(EObject eObject) {
		// This method returns the continuity from the versions list.
		// It simply gets the object at index indexOfContinuity from the versions list.
		EList versions = versions(eObject);
		assert(versions.size() > 0);
		return (Temporal) versions.get(getVersionHolder(eObject).getIndexOfContinuity());
	}

	public static Temporal currentVersion(EObject eObject) {
		return versionAt(eObject, TemporalDateProvider.eINSTANCE.now());
	}

	public static EList versions(EObject eObject) {
		VersionHolder vh = getVersionHolder(eObject);
		if(vh == null){
			// we don't need this anymore..
			assert(false);
//			vh = temporal.TemporalFactory.eINSTANCE.createVersionHolder();
//			setVersionHolder(eObject, vh);
		}
		return vh.getVersions();
	}
}
