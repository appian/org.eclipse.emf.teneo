/**
 * <copyright>
 * </copyright>
 *
 * $Id: statesByCountryValidator.java,v 1.1 2007/02/08 23:09:28 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.validation;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface statesByCountryValidator {
	boolean validate();

	boolean validateCountry(String value);
	boolean validateAllStates(List<String> value);
	boolean validateSixImportantStates(List<String> value);
	boolean validateZipUnion(String value);
	boolean validateZipUnions(EList<String> value);
	boolean validateSimpleUnion(Object value);
	boolean validateSimpleUnions(EList<Object> value);
	boolean validateSimpleStringUnion(String value);
	boolean validateSimpleStringUnions(EList<String> value);
}
