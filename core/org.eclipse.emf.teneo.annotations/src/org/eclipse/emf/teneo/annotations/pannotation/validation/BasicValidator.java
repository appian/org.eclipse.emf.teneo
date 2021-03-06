/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicValidator.java,v 1.1 2007/02/08 23:12:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.validation;

import org.eclipse.emf.teneo.annotations.pannotation.FetchType;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.annotations.pannotation.Basic}.
 * This doesn't really do anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can
 * be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BasicValidator {
	boolean validate();

	boolean validateFetch(FetchType value);

	boolean validateOptional(boolean value);
}
