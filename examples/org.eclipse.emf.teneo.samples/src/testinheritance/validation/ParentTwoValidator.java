/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParentTwoValidator.java,v 1.1 2007/03/21 15:45:37 mtaal Exp $
 */
package testinheritance.validation;


/**
 * A sample validator interface for {@link testinheritance.ParentTwo}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ParentTwoValidator {
	boolean validate();

	boolean validateTestId(long value);
}
