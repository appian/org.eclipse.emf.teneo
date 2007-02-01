/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: DetachTest.java,v 1.3 2007/02/01 12:34:05 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.detach;

import javax.jdo.spi.PersistenceCapable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.detach.DetachAction;

/**
 * Specific detach test
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class DetachTest extends AbstractActionTest {

	final static DetachAction testAction = new DetachAction() {

		protected void checkDetached(EObject eObject) {
			final PersistenceCapable pc = (PersistenceCapable) eObject;
			if (!pc.jdoIsDetached()) {
				throw new Error("The object with class: " + pc.getClass().getName() + " is not detached");
			}

			if (pc.jdoGetObjectId() == null) {
				throw new Error("The object with class: " + pc.getClass().getName() + " has no id!");
			}
		}
	};

	public DetachTest() {
		super(testAction);
	}

}
