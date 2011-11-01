/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressValidator.java,v 1.1 2007/02/08 23:09:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AddressValidator {
	boolean validate();

	boolean validateGroup(FeatureMap value);
	boolean validateName(EList<String> value);
	boolean validateLongName(EList<String> value);
}