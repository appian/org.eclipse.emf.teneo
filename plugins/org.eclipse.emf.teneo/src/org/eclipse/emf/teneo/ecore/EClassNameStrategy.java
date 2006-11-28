package org.eclipse.emf.teneo.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * Resolves human usable unique names for EClasses. Internally Elver always uses qualified 
 * String identifiers (EPackage nsuri concatenated with the EClass name). However often  
 * the EClass name is unique and much easier to use for humans.
 * 
 * @author <a href="lmfridael@elver.org">Laurens Fridael</a>
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public interface EClassNameStrategy {

	/** The EObject eclass */
	public static EClass EOBJECT_ECLASS = (EClass) EcorePackage.eINSTANCE.getEClassifier("EObject");

	public static String EOBJECT_ECLASS_URI = EcorePackage.eINSTANCE.getNsURI() + "/" + EOBJECT_ECLASS.getName();

	/**
	 * Determines the name for a given EClass. This name can be used in
	 * jsf pages and queries.
	 * 
	 * Note if the eClass is the EObject eclass then the string EOBJECT_ECLASS_URI 
	 * must be returned.
	 * 
	 * @param eClass
	 *            The EClass for which to resolve the unique name.
	 * @return The persistence entity name or null if it could not be resolved.
	 * @throws IllegalArgumentException
	 *             If eClass is null.
	 */
	public String toUniqueName(EClass eClass);

	/**
	 * Return the EClass for a certain name.
	 * 
	 * Note if the name corresponds to EOBJECT_ECLASS_URI then the 
	 * EcorePackage EObject must be returned. 
	 * 
	 * @return eClass the resolved EClass
	 * @param The EClassName
	 * @throws IllegalArgumentException if the EClass can not be resolved.
	 * @see #deResolve(EClass)
	 */
	public EClass toEClass(String eClassName, EPackage[] epackages);

}
