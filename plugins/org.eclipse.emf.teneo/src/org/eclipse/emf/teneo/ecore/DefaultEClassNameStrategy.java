package org.eclipse.emf.teneo.ecore;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;
import org.eclipse.emf.teneo.classloader.StoreClassLoadException;

/**
 * This implementation assumes that EClass names are unique. It will (de)Resolve
 * using the EClass name.
 * 
 * @author <a href="lmfridael@elver.org">Laurens Fridael</a>
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class DefaultEClassNameStrategy implements EClassNameStrategy {

	/** The logger */
	private static Log log = LogFactory.getLog(DefaultEClassNameStrategy.class);

	/** The singleton instance as it is thread safe */
	public static final DefaultEClassNameStrategy INSTANCE = new DefaultEClassNameStrategy();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.elver.ecore.spring.EClassResolver#deResolve(org.eclipse.emf.ecore.EClass)
	 */
	public String toUniqueName(EClass eClass) {
		if (eClass == EOBJECT_ECLASS) {
			return EOBJECT_ECLASS_NAME;
		}

		if (eClass == null) {
			throw new IllegalArgumentException(
					"Passed eclass is null."
							+ "This can occur if epackages which refer to eachother are placed in different ecore/xsd files "
							+ "and they are not read using one resource set. The reference from one epackage to another must be "
							+ "resolvable by EMF.");
		}

		if (eClass.getName() == null) {
			throw new IllegalArgumentException(
					"EClass "
							+ eClass.toString()
							+ " has a null name."
							+ "This can occur if epackages which refer to eachother are placed in different ecore/xsd files "
							+ "and they are not read using one resource set. The reference from one epackage to another must be "
							+ "resolvable by EMF.");
		}
		return eClass.getName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.elver.ecore.spring.EClassResolver#resolve(java.lang.String)
	 */
	public EClass toEClass(String eClassName, EPackage[] epackages) {
		if (eClassName == null) {
			throw new IllegalArgumentException("eClassName may not be null");
		}

		if (eClassName.compareTo(EOBJECT_ECLASS_NAME) == 0) {
			return EcorePackage.eINSTANCE.getEObject();
		}

		// now try all epackages
		EClass eClass = null;
		for (int i = 0; i < epackages.length; i++) {
			final EPackage ePackage = epackages[i];
			final EClassifier eClassifier = ePackage.getEClassifier(eClassName);
			if (eClassifier instanceof EClass) {
				if (eClass != null) {
					// doubly entry! Actually require different resolver
					throw new IllegalArgumentException(
							"There is more than one EClass with the same name ("
									+ eClassName
									+ " in EPackage "
									+ eClass.getEPackage().getName()
									+ " and "
									+ ePackage.getName()
									+ ". A different EClassResolver should be used.");
				}
				eClass = (EClass) eClassifier;
			}
		}
		
		// we didn'y find it, perhaps it is fully qualified, lets try by full class name
		if (eClass == null) {
			try {
				final Class<?> cls = ClassLoaderResolver.classForName(eClassName);
				eClass = EModelResolver.instance().getEClass(cls);
			} catch (StoreClassLoadException e) {
				log.debug("Failed to retreive ECLass for name: " + eClassName);
			}
		}
		
		if (eClass == null) {
			throw new IllegalArgumentException("No EClass found using "
					+ eClassName);
		}
		return eClass;
	}
}
