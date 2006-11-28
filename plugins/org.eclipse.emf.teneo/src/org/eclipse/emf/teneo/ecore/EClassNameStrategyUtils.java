package org.eclipse.emf.teneo.ecore;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.StoreException;
import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;

/**
 * Creates the correct EClass name strategy.
 * 
 * @author <a href="lmfridael@elver.org">Laurens Fridael</a>
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EClassNameStrategyUtils {

	/** The logger */
	private static Log log = LogFactory.getLog(EClassNameStrategyUtils.class);

	/**
	 * Creates the correct eclass name strategy based on the String setting. 
	 * 
	 */
	public static EClassNameStrategy create(String option) {
		try {
			if (option == null) {
				log.debug("Creating " + DefaultEClassNameStrategy.class.getName() + " as eclass name strategy");
				return DefaultEClassNameStrategy.INSTANCE;
			}
			if (option.compareToIgnoreCase(PersistenceOptions.QUALIFY_ENTITY_NAME_NO) == 0) {
				log.debug("Creating " + DefaultEClassNameStrategy.class.getName() + " as eclass name strategy");
				return DefaultEClassNameStrategy.INSTANCE;
			}
			if (option.compareToIgnoreCase(PersistenceOptions.QUALIFY_ENTITY_NAME_NSPREFIX) == 0) {
				log.debug("Creating " + QualifyingEClassNameStrategy.class.getName() + " as case strategy");
				return QualifyingEClassNameStrategy.INSTANCE;
			}

			log.debug("Assuming class name creating instance of " + option);
			return (EClassNameStrategy) ClassLoaderResolver.classForName(option).newInstance();
		} catch (Exception e) {
			throw new StoreException("Could not instantiate: " + option, e);
		}
	}
}