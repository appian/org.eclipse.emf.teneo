/*
 *	Copyright 2005-2006, Elver.org (http://www.elver.org).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
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
 * @version $Revision: 1.1 $
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
