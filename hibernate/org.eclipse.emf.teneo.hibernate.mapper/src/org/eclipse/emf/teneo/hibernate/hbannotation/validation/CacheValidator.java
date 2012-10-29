/**
 * <copyright>
 * </copyright>
 *
 * $Id: CacheValidator.java,v 1.1 2007/02/08 23:13:12 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.validation;

import org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.hibernate.hbannotation.Cache}. This
 * doesn't really do anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can
 * be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CacheValidator {
	boolean validate();

	boolean validateUsage(CacheConcurrencyStrategy value);

	boolean validateRegion(String value);

	boolean validateInclude(String value);
}
