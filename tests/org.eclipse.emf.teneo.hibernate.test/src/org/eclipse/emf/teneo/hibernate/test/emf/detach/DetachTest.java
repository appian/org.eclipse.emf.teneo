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
 * $Id: DetachTest.java,v 1.2 2006/07/23 19:20:57 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.detach;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.detach.DetachAction;

/**
 * Test
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class DetachTest extends AbstractActionTest {

	private static DetachAction testAction = new DetachAction() {

		protected void checkDetached(EObject eObject) {
			// TODO Auto-generated method stub
		}
	};

	public DetachTest() {
		super(testAction);
	}

}
