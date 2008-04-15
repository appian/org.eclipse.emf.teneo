/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.examples.library.forum;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.ForumFactory
 * @model kind="package"
 * @generated
 */
public interface ForumPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "forum";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/emf/teneo/eclipselink/examples/forum.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "forum";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ForumPackage eINSTANCE = org.eclipse.emf.teneo.eclipselink.examples.library.forum.impl.ForumPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.impl.ForumImpl <em>Forum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.impl.ForumImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.impl.ForumPackageImpl#getForum()
	 * @generated
	 */
	int FORUM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rated Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__RATED_AUTHORS = 1;

	/**
	 * The feature id for the '<em><b>Featured Books</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__FEATURED_BOOKS = 2;

	/**
	 * The number of structural features of the '<em>Forum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum <em>Forum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forum</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum
	 * @generated
	 */
	EClass getForum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum#getName()
	 * @see #getForum()
	 * @generated
	 */
	EAttribute getForum_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum#getRatedAuthors <em>Rated Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rated Authors</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum#getRatedAuthors()
	 * @see #getForum()
	 * @generated
	 */
	EReference getForum_RatedAuthors();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum#getFeaturedBooks <em>Featured Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Featured Books</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum#getFeaturedBooks()
	 * @see #getForum()
	 * @generated
	 */
	EReference getForum_FeaturedBooks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ForumFactory getForumFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.impl.ForumImpl <em>Forum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.impl.ForumImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.forum.impl.ForumPackageImpl#getForum()
		 * @generated
		 */
		EClass FORUM = eINSTANCE.getForum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORUM__NAME = eINSTANCE.getForum_Name();

		/**
		 * The meta object literal for the '<em><b>Rated Authors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORUM__RATED_AUTHORS = eINSTANCE.getForum_RatedAuthors();

		/**
		 * The meta object literal for the '<em><b>Featured Books</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORUM__FEATURED_BOOKS = eINSTANCE.getForum_FeaturedBooks();

	}

} //ForumPackage
