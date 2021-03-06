/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonValidator.java,v 1.1 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embeddedid.validation;

import org.eclipse.emf.teneo.samples.emf.annotations.embeddedid.Name;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.annotations.embeddedid.Person}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PersonValidator {
	boolean validate();

	boolean validateName(Name value);
	boolean validateAddress(String value);
}
