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
package org.eclipse.emf.teneo.eclipselink.examples.library.orm.tests;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public abstract class ManagedTest extends TestCase {
	private static List<ManagedTest> runningTests = new ArrayList<ManagedTest>();

	public ManagedTest(String sTestName) {
		super(sTestName);
		registerTest();
	}

	private void registerTest() {
		runningTests.add(this);
	}

	private void unregisterTest() {
		runningTests.remove(this);
		if (runningTests.isEmpty()) {
			allTestsComplete();
		}
	}

	/**
	 * Called when all the tests in the current suite are have been run.
	 */
	protected abstract void allTestsComplete();

	@Override
	protected void tearDown() throws Exception {
		unregisterTest();
		super.tearDown();
	}

}
