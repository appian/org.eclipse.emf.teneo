package org.eclipse.emf.teneo.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * This implementation qualifies the EClassName using the NsPrefix of the
 * EPackage. If the NsPrefix is not set then the EPackage name is used. The
 * result will be nsPrefix + "." + eclassName.
 * <p>
 * TODO: Should be moved to Teneo project.
 * 
 * @author <a href="lmfridael@elver.org">Laurens Fridael</a>
 * 
 */
public class QualifyingEClassNameStrategy implements EClassNameStrategy {

	/** The singleton instance as it is thread safe */
	public static final QualifyingEClassNameStrategy INSTANCE = new QualifyingEClassNameStrategy();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.elver.ecore.spring.EClassResolver#deResolve(org.eclipse.emf.ecore.EClass)
	 */
	public String toUniqueName(EClass eClass) {
		if (eClass == null) {
			throw new IllegalArgumentException("EClass cannot be null.");
		}
		if (eClass == EOBJECT_ECLASS) {
			return EOBJECT_ECLASS_URI;
		}
		String nsPrefix = eClass.getEPackage().getNsPrefix();
		if (nsPrefix == null) {
			nsPrefix = eClass.getEPackage().getName();
		}
		return nsPrefix + "." + eClass.getName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.elver.ecore.spring.EClassResolver#resolve(java.lang.String)
	 */
	public EClass toEClass(String eClassStr, EPackage[] epackages) {
		if (eClassStr == null) {
			throw new IllegalArgumentException("eClassStr may not be null");
		}

		if (eClassStr.compareTo(EOBJECT_ECLASS_URI) == 0) {
			return EcorePackage.eINSTANCE.getEObject();
		}

		// get prefix or name
		final int index = eClassStr.lastIndexOf(".");
		if (index == -1) {
			throw new IllegalArgumentException(
					"Illegal eClassStr for this resolver (no dot separating the epackage nsprefix and name): "
							+ eClassStr);
		}
		final String nsPrefix = eClassStr.substring(0, index);
		final String eClassName = eClassStr.substring(index + 1);

		// now try all epackages
		EClass eClass = null;
		for (int i = 0; i < epackages.length; i++) {
			final EPackage ePackage = epackages[i];
			if (ePackage.getNsPrefix().compareTo(nsPrefix) == 0
					|| ePackage.getName().compareTo(nsPrefix) == 0) {
				final EClassifier eClassifier = ePackage
						.getEClassifier(eClassName);
				if (eClassifier instanceof EClass) {
					if (eClass != null) {
						// doubly entry! Actually require different resolver
						throw new IllegalArgumentException(
								"There is more than one EClass with the same identifying String ("
										+ eClassStr
										+ " in EPackage "
										+ eClass.getEPackage().getName()
										+ " and "
										+ ePackage.getName()
										+ ". A different EClassResolver should be used.");
					}
					eClass = (EClass) eClassifier;
				}
			}
		}
		if (eClass == null) {
			throw new IllegalArgumentException("No EClass found using "
					+ eClassStr);
		}
		return eClass;
	}
}