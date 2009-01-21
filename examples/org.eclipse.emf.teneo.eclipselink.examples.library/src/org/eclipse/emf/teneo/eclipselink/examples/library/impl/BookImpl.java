/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookImpl.java,v 1.2 2009/01/21 21:34:20 seberle Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory;
import org.eclipse.emf.teneo.eclipselink.examples.library.Cover;
import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage;
import org.eclipse.emf.teneo.eclipselink.examples.library.Style;
import org.eclipse.emf.teneo.eclipselink.examples.library.Translator;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl#getTranslator <em>Translator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl#getCover <em>Cover</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookImpl extends IdentifiableImpl implements Book {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPages() <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGES_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected int pages = PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final BookCategory CATEGORY_EDEFAULT = BookCategory.MYSTERY;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected BookCategory category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Writer author;

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Style> styles;

	/**
	 * The cached value of the '{@link #getTranslator() <em>Translator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslator()
	 * @generated
	 * @ordered
	 */
	protected Translator translator;

	/**
	 * The cached value of the '{@link #getCover() <em>Cover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCover()
	 * @generated
	 * @ordered
	 */
	protected Cover cover;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BOOK__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPages(int newPages) {
		int oldPages = pages;
		pages = newPages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BOOK__PAGES, oldPages, pages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(BookCategory newCategory) {
		BookCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BOOK__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writer getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Writer)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.BOOK__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writer basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Writer newAuthor, NotificationChain msgs) {
		Writer oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.BOOK__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Writer newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, LibraryPackage.WRITER__BOOKS, Writer.class, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, LibraryPackage.WRITER__BOOKS, Writer.class, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BOOK__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Style> getStyles() {
		if (styles == null) {
			styles = new EcoreEMap<String,Style>(LibraryPackage.Literals.BOOK_STYLES_MAP_ENTRY, BookStylesMapEntryImpl.class, this, LibraryPackage.BOOK__STYLES);
		}
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translator getTranslator() {
		if (translator != null && translator.eIsProxy()) {
			InternalEObject oldTranslator = (InternalEObject)translator;
			translator = (Translator)eResolveProxy(oldTranslator);
			if (translator != oldTranslator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LibraryPackage.BOOK__TRANSLATOR, oldTranslator, translator));
			}
		}
		return translator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translator basicGetTranslator() {
		return translator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslator(Translator newTranslator) {
		Translator oldTranslator = translator;
		translator = newTranslator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BOOK__TRANSLATOR, oldTranslator, translator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cover getCover() {
		return cover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCover(Cover newCover, NotificationChain msgs) {
		Cover oldCover = cover;
		cover = newCover;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.BOOK__COVER, oldCover, newCover);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCover(Cover newCover) {
		if (newCover != cover) {
			NotificationChain msgs = null;
			if (cover != null)
				msgs = ((InternalEObject)cover).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.BOOK__COVER, null, msgs);
			if (newCover != null)
				msgs = ((InternalEObject)newCover).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.BOOK__COVER, null, msgs);
			msgs = basicSetCover(newCover, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.BOOK__COVER, newCover, newCover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.BOOK__AUTHOR:
				if (author != null)
					msgs = ((InternalEObject)author).eInverseRemove(this, LibraryPackage.WRITER__BOOKS, Writer.class, msgs);
				return basicSetAuthor((Writer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.BOOK__AUTHOR:
				return basicSetAuthor(null, msgs);
			case LibraryPackage.BOOK__STYLES:
				return ((InternalEList<?>)getStyles()).basicRemove(otherEnd, msgs);
			case LibraryPackage.BOOK__COVER:
				return basicSetCover(null, msgs);
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
			case LibraryPackage.BOOK__TITLE:
				return getTitle();
			case LibraryPackage.BOOK__PAGES:
				return new Integer(getPages());
			case LibraryPackage.BOOK__CATEGORY:
				return getCategory();
			case LibraryPackage.BOOK__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case LibraryPackage.BOOK__STYLES:
				if (coreType) return getStyles();
				else return getStyles().map();
			case LibraryPackage.BOOK__TRANSLATOR:
				if (resolve) return getTranslator();
				return basicGetTranslator();
			case LibraryPackage.BOOK__COVER:
				return getCover();
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
			case LibraryPackage.BOOK__TITLE:
				setTitle((String)newValue);
				return;
			case LibraryPackage.BOOK__PAGES:
				setPages(((Integer)newValue).intValue());
				return;
			case LibraryPackage.BOOK__CATEGORY:
				setCategory((BookCategory)newValue);
				return;
			case LibraryPackage.BOOK__AUTHOR:
				setAuthor((Writer)newValue);
				return;
			case LibraryPackage.BOOK__STYLES:
				((EStructuralFeature.Setting)getStyles()).set(newValue);
				return;
			case LibraryPackage.BOOK__TRANSLATOR:
				setTranslator((Translator)newValue);
				return;
			case LibraryPackage.BOOK__COVER:
				setCover((Cover)newValue);
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
			case LibraryPackage.BOOK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case LibraryPackage.BOOK__PAGES:
				setPages(PAGES_EDEFAULT);
				return;
			case LibraryPackage.BOOK__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case LibraryPackage.BOOK__AUTHOR:
				setAuthor((Writer)null);
				return;
			case LibraryPackage.BOOK__STYLES:
				getStyles().clear();
				return;
			case LibraryPackage.BOOK__TRANSLATOR:
				setTranslator((Translator)null);
				return;
			case LibraryPackage.BOOK__COVER:
				setCover((Cover)null);
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
			case LibraryPackage.BOOK__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case LibraryPackage.BOOK__PAGES:
				return pages != PAGES_EDEFAULT;
			case LibraryPackage.BOOK__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case LibraryPackage.BOOK__AUTHOR:
				return author != null;
			case LibraryPackage.BOOK__STYLES:
				return styles != null && !styles.isEmpty();
			case LibraryPackage.BOOK__TRANSLATOR:
				return translator != null;
			case LibraryPackage.BOOK__COVER:
				return cover != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", pages: ");
		result.append(pages);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //BookImpl
