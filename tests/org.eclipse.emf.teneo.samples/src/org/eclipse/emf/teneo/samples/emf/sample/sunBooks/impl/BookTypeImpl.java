/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookTypeImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.AuthorsType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BookTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BookTypeImpl#getISBN <em>ISBN</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BookTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BookTypeImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BookTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BookTypeImpl#getPromotion <em>Promotion</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BookTypeImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BookTypeImpl#getBookCategory <em>Book Category</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BookTypeImpl#getItemId <em>Item Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookTypeImpl extends EObjectImpl implements BookType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getISBN() <em>ISBN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISBN()
	 * @generated
	 * @ordered
	 */
	protected static final long ISBN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getISBN() <em>ISBN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISBN()
	 * @generated
	 * @ordered
	 */
	protected long iSBN = ISBN_EDEFAULT;

	/**
	 * This is true if the ISBN attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iSBNESet = false;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final String PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected String price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected AuthorsType authors = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPromotion() <em>Promotion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromotion()
	 * @generated
	 * @ordered
	 */
	protected PromotionType promotion = null;

	/**
	 * The default value of the '{@link #getPublicationDate() <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Object PUBLICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected Object publicationDate = PUBLICATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookCategory() <em>Book Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookCategory()
	 * @generated
	 * @ordered
	 */
	protected static final BookCategoryType1 BOOK_CATEGORY_EDEFAULT = BookCategoryType1.MAGAZINE_LITERAL;

	/**
	 * The cached value of the '{@link #getBookCategory() <em>Book Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookCategory()
	 * @generated
	 * @ordered
	 */
	protected BookCategoryType1 bookCategory = BOOK_CATEGORY_EDEFAULT;

	/**
	 * This is true if the Book Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bookCategoryESet = false;

	/**
	 * The default value of the '{@link #getItemId() <em>Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemId()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemId() <em>Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemId()
	 * @generated
	 * @ordered
	 */
	protected String itemId = ITEM_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SunBooksPackage.Literals.BOOK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.BOOK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getISBN() {
		return iSBN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISBN(long newISBN) {
		long oldISBN = iSBN;
		iSBN = newISBN;
		boolean oldISBNESet = iSBNESet;
		iSBNESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.BOOK_TYPE__ISBN, oldISBN, iSBN, !oldISBNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetISBN() {
		long oldISBN = iSBN;
		boolean oldISBNESet = iSBNESet;
		iSBN = ISBN_EDEFAULT;
		iSBNESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SunBooksPackage.BOOK_TYPE__ISBN, oldISBN, ISBN_EDEFAULT, oldISBNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetISBN() {
		return iSBNESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(String newPrice) {
		String oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.BOOK_TYPE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorsType getAuthors() {
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthors(AuthorsType newAuthors, NotificationChain msgs) {
		AuthorsType oldAuthors = authors;
		authors = newAuthors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SunBooksPackage.BOOK_TYPE__AUTHORS, oldAuthors, newAuthors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthors(AuthorsType newAuthors) {
		if (newAuthors != authors) {
			NotificationChain msgs = null;
			if (authors != null)
				msgs = ((InternalEObject)authors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SunBooksPackage.BOOK_TYPE__AUTHORS, null, msgs);
			if (newAuthors != null)
				msgs = ((InternalEObject)newAuthors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SunBooksPackage.BOOK_TYPE__AUTHORS, null, msgs);
			msgs = basicSetAuthors(newAuthors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.BOOK_TYPE__AUTHORS, newAuthors, newAuthors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.BOOK_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromotionType getPromotion() {
		return promotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPromotion(PromotionType newPromotion, NotificationChain msgs) {
		PromotionType oldPromotion = promotion;
		promotion = newPromotion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SunBooksPackage.BOOK_TYPE__PROMOTION, oldPromotion, newPromotion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromotion(PromotionType newPromotion) {
		if (newPromotion != promotion) {
			NotificationChain msgs = null;
			if (promotion != null)
				msgs = ((InternalEObject)promotion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SunBooksPackage.BOOK_TYPE__PROMOTION, null, msgs);
			if (newPromotion != null)
				msgs = ((InternalEObject)newPromotion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SunBooksPackage.BOOK_TYPE__PROMOTION, null, msgs);
			msgs = basicSetPromotion(newPromotion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.BOOK_TYPE__PROMOTION, newPromotion, newPromotion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPublicationDate() {
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationDate(Object newPublicationDate) {
		Object oldPublicationDate = publicationDate;
		publicationDate = newPublicationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.BOOK_TYPE__PUBLICATION_DATE, oldPublicationDate, publicationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookCategoryType1 getBookCategory() {
		return bookCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookCategory(BookCategoryType1 newBookCategory) {
		BookCategoryType1 oldBookCategory = bookCategory;
		bookCategory = newBookCategory == null ? BOOK_CATEGORY_EDEFAULT : newBookCategory;
		boolean oldBookCategoryESet = bookCategoryESet;
		bookCategoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.BOOK_TYPE__BOOK_CATEGORY, oldBookCategory, bookCategory, !oldBookCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBookCategory() {
		BookCategoryType1 oldBookCategory = bookCategory;
		boolean oldBookCategoryESet = bookCategoryESet;
		bookCategory = BOOK_CATEGORY_EDEFAULT;
		bookCategoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SunBooksPackage.BOOK_TYPE__BOOK_CATEGORY, oldBookCategory, BOOK_CATEGORY_EDEFAULT, oldBookCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBookCategory() {
		return bookCategoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemId(String newItemId) {
		String oldItemId = itemId;
		itemId = newItemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.BOOK_TYPE__ITEM_ID, oldItemId, itemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SunBooksPackage.BOOK_TYPE__AUTHORS:
				return basicSetAuthors(null, msgs);
			case SunBooksPackage.BOOK_TYPE__PROMOTION:
				return basicSetPromotion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SunBooksPackage.BOOK_TYPE__NAME:
				return getName();
			case SunBooksPackage.BOOK_TYPE__ISBN:
				return new Long(getISBN());
			case SunBooksPackage.BOOK_TYPE__PRICE:
				return getPrice();
			case SunBooksPackage.BOOK_TYPE__AUTHORS:
				return getAuthors();
			case SunBooksPackage.BOOK_TYPE__DESCRIPTION:
				return getDescription();
			case SunBooksPackage.BOOK_TYPE__PROMOTION:
				return getPromotion();
			case SunBooksPackage.BOOK_TYPE__PUBLICATION_DATE:
				return getPublicationDate();
			case SunBooksPackage.BOOK_TYPE__BOOK_CATEGORY:
				return getBookCategory();
			case SunBooksPackage.BOOK_TYPE__ITEM_ID:
				return getItemId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SunBooksPackage.BOOK_TYPE__NAME:
				setName((String)newValue);
				return;
			case SunBooksPackage.BOOK_TYPE__ISBN:
				setISBN(((Long)newValue).longValue());
				return;
			case SunBooksPackage.BOOK_TYPE__PRICE:
				setPrice((String)newValue);
				return;
			case SunBooksPackage.BOOK_TYPE__AUTHORS:
				setAuthors((AuthorsType)newValue);
				return;
			case SunBooksPackage.BOOK_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SunBooksPackage.BOOK_TYPE__PROMOTION:
				setPromotion((PromotionType)newValue);
				return;
			case SunBooksPackage.BOOK_TYPE__PUBLICATION_DATE:
				setPublicationDate(newValue);
				return;
			case SunBooksPackage.BOOK_TYPE__BOOK_CATEGORY:
				setBookCategory((BookCategoryType1)newValue);
				return;
			case SunBooksPackage.BOOK_TYPE__ITEM_ID:
				setItemId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SunBooksPackage.BOOK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SunBooksPackage.BOOK_TYPE__ISBN:
				unsetISBN();
				return;
			case SunBooksPackage.BOOK_TYPE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case SunBooksPackage.BOOK_TYPE__AUTHORS:
				setAuthors((AuthorsType)null);
				return;
			case SunBooksPackage.BOOK_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SunBooksPackage.BOOK_TYPE__PROMOTION:
				setPromotion((PromotionType)null);
				return;
			case SunBooksPackage.BOOK_TYPE__PUBLICATION_DATE:
				setPublicationDate(PUBLICATION_DATE_EDEFAULT);
				return;
			case SunBooksPackage.BOOK_TYPE__BOOK_CATEGORY:
				unsetBookCategory();
				return;
			case SunBooksPackage.BOOK_TYPE__ITEM_ID:
				setItemId(ITEM_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SunBooksPackage.BOOK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SunBooksPackage.BOOK_TYPE__ISBN:
				return isSetISBN();
			case SunBooksPackage.BOOK_TYPE__PRICE:
				return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
			case SunBooksPackage.BOOK_TYPE__AUTHORS:
				return authors != null;
			case SunBooksPackage.BOOK_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SunBooksPackage.BOOK_TYPE__PROMOTION:
				return promotion != null;
			case SunBooksPackage.BOOK_TYPE__PUBLICATION_DATE:
				return PUBLICATION_DATE_EDEFAULT == null ? publicationDate != null : !PUBLICATION_DATE_EDEFAULT.equals(publicationDate);
			case SunBooksPackage.BOOK_TYPE__BOOK_CATEGORY:
				return isSetBookCategory();
			case SunBooksPackage.BOOK_TYPE__ITEM_ID:
				return ITEM_ID_EDEFAULT == null ? itemId != null : !ITEM_ID_EDEFAULT.equals(itemId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", iSBN: ");
		if (iSBNESet) result.append(iSBN); else result.append("<unset>");
		result.append(", price: ");
		result.append(price);
		result.append(", description: ");
		result.append(description);
		result.append(", publicationDate: ");
		result.append(publicationDate);
		result.append(", bookCategory: ");
		if (bookCategoryESet) result.append(bookCategory); else result.append("<unset>");
		result.append(", itemId: ");
		result.append(itemId);
		result.append(')');
		return result.toString();
	}

} //BookTypeImpl
