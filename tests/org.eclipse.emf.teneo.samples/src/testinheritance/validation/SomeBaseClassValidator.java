/**
 * <copyright>
 * </copyright>
 *
 * $Id: SomeBaseClassValidator.java,v 1.1 2007/03/18 22:28:33 mtaal Exp $
 */
package testinheritance.validation;

/**
 * A sample validator interface for {@link testinheritance.SomeBaseClass}. This doesn't really do
 * anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can
 * be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SomeBaseClassValidator {
	boolean validate();

	boolean validateAnotherProperty(long value);
}
