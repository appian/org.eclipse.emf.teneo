/*******************************************************************************
 * Copyright (c) 2010 Springsite (The Netherlands).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Taal - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.examples.library.orm.tests;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage;
import org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage;
import org.eclipse.emf.teneo.jpa.convert.ORMGenerator;

/**
 * @author mtaal
 */
public class GenerateORMTest extends TestCase {

	public void testGenerateORMLibrary() {
		final ORMGenerator ormGenerator = new ORMGenerator();
		System.err.println(ormGenerator.generateORM(new EPackage[] { LibraryPackage.eINSTANCE }));
	}

	public void testGenerateORMSuppressedInterfaces() {
		final ORMGenerator ormGenerator = new ORMGenerator();
		System.err.println(ormGenerator.generateORM(new EPackage[] { SuppressinterfacesPackage.eINSTANCE }));
	}
}
