/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookTypeValidator.java,v 1.1 2007/02/08 23:09:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks.validation;

import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.AuthorsType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BookTypeValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateISBN(long value);
	boolean validatePrice(String value);
	boolean validateAuthors(AuthorsType value);
	boolean validateDescription(String value);
	boolean validatePromotion(PromotionType value);
	boolean validatePublicationDate(Object value);
	boolean validateBookCategory(BookCategoryType1 value);
	boolean validateItemId(String value);
}
