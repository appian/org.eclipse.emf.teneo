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
package org.eclipse.emf.teneo.eclipselink.examples.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Publisher#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Publisher#getWriters <em>Writers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getPublisher()
 * @model
 * @generated
 */
public interface Publisher extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getPublisher_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Publisher#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Writers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writers</em>' reference list.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getPublisher_Writers()
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getPublishers
	 * @model opposite="publishers"
	 * @generated
	 */
	EList<Writer> getWriters();

} // Publisher
