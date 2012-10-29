/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExternalValidator.java,v 1.1 2009/08/21 10:16:53 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.validation;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.annotations.pannotation.External}.
 * This doesn't really do anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can
 * be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExternalValidator {
	boolean validate();

	boolean validateType(String value);
}
