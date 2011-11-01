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
 * $Id: DetachFeatureMapTest.java,v 1.4 2008/02/28 07:08:57 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.detach;

import org.eclipse.emf.teneo.resource.StoreResource;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.detach.DetachFeatureMapAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Is a test case to test detach functionality for featuremap with different kinds of methods on the featuremap (move, set, etc).
 * 
 * @version $Revision: 1.4 $
 */
public class DetachFeatureMapTest extends AbstractActionTest {

	/** Creates a hibernate specific version of the action */
	private static DetachFeatureMapAction testAction = new DetachFeatureMapAction() {
		/** Returns the resource uri, jdo is default (for now) */
		public String getResourceUri(TestStore store) {
			return "hibernate://?" + StoreResource.DS_NAME_PARAM + "=" + store.getDatabaseAdapter().getDbName();
		}
	};

	public DetachFeatureMapTest() {
		super(testAction);
	}
}