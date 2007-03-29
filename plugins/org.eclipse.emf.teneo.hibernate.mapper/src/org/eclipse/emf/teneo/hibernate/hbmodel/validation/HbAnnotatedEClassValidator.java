/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEClassValidator.java,v 1.4 2007/03/29 15:00:46 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel.validation;

import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete;
import org.eclipse.emf.teneo.hibernate.hbannotation.Proxy;
import org.eclipse.emf.teneo.hibernate.hbannotation.Where;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HbAnnotatedEClassValidator {
	boolean validate();

	boolean validateHbCache(Cache value);

	boolean validateHbOnDelete(OnDelete value);

	boolean validateHbWhere(Where value);

	boolean validateHbProxy(Proxy value);
}
