/**
 * <copyright>
 * </copyright>
 *
 * $Id: BodyValidator.java,v 1.1 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.transent.validation;

import org.eclipse.emf.teneo.samples.emf.annotations.transent.Head;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.annotations.transent.Body}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BodyValidator {
	boolean validate();

	boolean validateTheID(long value);
	boolean validateHead(Head value);
}
