/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdBagValidator.java,v 1.2 2007/03/21 15:46:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.validation;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.hibernate.hbannotation.IdBag}. This
 * doesn't really do anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can
 * be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IdBagValidator {
	boolean validate();

	boolean validateGenerator(String value);

	boolean validateType(String value);

	boolean validateTable(String value);
}
