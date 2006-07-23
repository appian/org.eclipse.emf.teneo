/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: SchoolLibraryTest.java,v 1.3 2006/07/23 19:28:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.sample;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.impl.BookImpl;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.impl.WriterImpl;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.SchoolLibraryAction;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class SchoolLibraryTest extends AbstractActionTest {

	final static SchoolLibraryAction testAction = new SchoolLibraryAction() {
		/** Returns one test query */
		protected String getQuery1() {
			return "query1=SELECT FROM " + WriterImpl.class.getName() + "&query2=SELECT FROM "
					+ BookImpl.class.getName();
		}

		/** Returns one test query */
		protected String getQuery2() {
			return "query1=SELECT FROM " + WriterImpl.class.getName();
		}

		/** Returns one test query */
		protected String getQuery3() {
			return "query1=SELECT FROM " + WriterImpl.class.getName() + "&query2=SELECT FROM "
					+ BookImpl.class.getName();
		}

		/** Container present */
		protected boolean hasContainer(InternalEObject obj) {
			return true;
		}
	};

	public SchoolLibraryTest() {
		super(testAction);
	}
}