/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: LargeMapValueAction.java,v 1.1 2008/04/11 03:21:48 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.samples.issues.largemapvalue.LargemapvalueFactory;
import org.eclipse.emf.teneo.samples.issues.largemapvalue.LargemapvaluePackage;
import org.eclipse.emf.teneo.samples.issues.largemapvalue.TestElement;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for emap with large value field.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class LargeMapValueAction extends AbstractTestAction {

	private String largeString1;
	private String largeString2;

	public LargeMapValueAction() {
		super(new EPackage[] { LargemapvaluePackage.eINSTANCE });
		largeString1 = createLargeString("teneo", 600000);
		largeString2 = createLargeString("emf", 500000);
	}

	private String createLargeString(String pattern, int length) {
		final StringBuilder sb = new StringBuilder(pattern);
		while (sb.length() < length) {
			sb.append(sb.toString());
		}
		return sb.substring(0, length);
	}

	@Override
	public void doAction(TestStore store) {
		TestElement te = LargemapvalueFactory.eINSTANCE.createTestElement();
		te.setTestProp(largeString1);
		te.getTestMap().put("key1", largeString1);
		te.getTestMap().put("key2", largeString2);
		store.beginTransaction();
		store.store(te);
		store.commitTransaction();

		store.beginTransaction();
		te = store.getObject(TestElement.class);
		assertEquals(largeString1.length(), te.getTestProp().length());
		assertNotNull(te.getTestMap().get("key1"));
		assertNotNull(te.getTestMap().get("key2"));
		assertNotSame(te.getTestMap().get("key1"), largeString1);
		assertNotSame(te.getTestMap().get("key2"), largeString2);
		assertEquals(te.getTestMap().get("key1"), largeString1);
		assertEquals(te.getTestMap().get("key2"), largeString2);
		store.commitTransaction();
	}
}