/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockValidator.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.validation;

import java.util.Date;

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Block}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BlockValidator {
	boolean validate();

	boolean validateVserver(VServer value);
	boolean validateDescription(String value);
	boolean validateId(long value);
	boolean validateModified(Date value);
	boolean validateRevision(int value);
	boolean validateAgent(String value);
	boolean validateService(String value);
}
