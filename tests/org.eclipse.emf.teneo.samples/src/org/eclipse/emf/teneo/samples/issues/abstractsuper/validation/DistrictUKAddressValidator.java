/**
 * <copyright>
 * </copyright>
 *
 * $Id: DistrictUKAddressValidator.java,v 1.1 2008/03/10 22:19:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.abstractsuper.validation;


/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.issues.abstractsuper.DistrictUKAddress}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DistrictUKAddressValidator {
	boolean validate();

	boolean validateDistrict(String value);
}
