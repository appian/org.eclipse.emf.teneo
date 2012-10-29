/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEModelElementValidator.java,v 1.3 2009/12/13 10:14:12 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.validation;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;

/**
 * A sample validator interface for
 * {@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement}. This doesn't really do
 * anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can
 * be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PAnnotatedEModelElementValidator {
	boolean validate();

	boolean validateModelElement(ENamedElement value);

	boolean validateAnnotatedElement(ENamedElement value);

	boolean validateTransient(Transient value);
}
