/**
 * <copyright>
 * </copyright>
 *
 * $Id: WriterValidator.java,v 1.3 2009/09/12 04:47:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.City;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Pen;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WriterValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateBooks(EList<Book> value);
	boolean validateCity(City value);

	boolean validatePens(EList<Pen> value);

	boolean validateImage(byte[] value);

	boolean validateAbstract(String value);
}
