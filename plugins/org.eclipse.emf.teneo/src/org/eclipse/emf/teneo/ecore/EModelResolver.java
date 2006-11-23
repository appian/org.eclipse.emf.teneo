package org.eclipse.emf.teneo.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * The EModelResolver allows pluggable access to the underlying ecore model.
 * It maps from eclass/efeature names to java member names or to real eclass names.
 * This default implementation only returns null.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EModelResolver {

	/** The default instance of an EcoreResolver */
	private static EModelResolver instance = new EModelResolver();

	/** Return the current ecore resolver */
	public static EModelResolver instance() {
		return instance;
	}

	/** Set an EcoreResolver */
	public static void setInstance(EModelResolver modelResolver) {
		instance = modelResolver;
	}

	/** @return the EClass for a java class, if not found then the superclass of the javaclass is tried */
	public EClass getEClass(Class javaClass) {
		return null;
	}

	/** Is the epackage registered */
	public boolean isRegistered(EPackage epackage) {
		return false;
	}

	/** Register the epackage */
	public void register(EPackage epackage) {
	}

	/** Return the java member name for the efeature */
	public String getJavaMember(EStructuralFeature efeature) {
		return efeature.getName();
	}

	/** @return the java implementation class for an EClass */
	public Class getJavaClass(EClassifier eclassifier) {
		return null;
	}

	/** @return the java interface class for an EClass */
	public Class getJavaInterfaceClass(EClass eclass) {
		return null;
	}

	/** Returns true if the passed EClass has a javaClass representation. */
	public boolean hasImplementationClass(EClassifier eclassifier) {
		return false;
	}
	
	/** Returns null */
	public Object create(EClass eclass) {
		return null;
	}
	
	/** Returns null */
	public Object create(EPackage epackage, String eclassName) {
		return null;
	}

	/** Returns null */
	public Object create(String eclassName) {
		return null;
	}
}