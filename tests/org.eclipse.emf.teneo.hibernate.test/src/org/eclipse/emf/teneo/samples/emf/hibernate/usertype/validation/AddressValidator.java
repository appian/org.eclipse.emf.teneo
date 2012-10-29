/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressValidator.java,v 1.1 2007/03/04 21:18:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype.validation;

import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person;

/**
 * A sample validator interface for
 * {@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address}. This doesn't really do
 * anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can
 * be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AddressValidator {
	boolean validate();

	boolean validateAddressInfo(String value);

	boolean validatePerson(Person value);
}
