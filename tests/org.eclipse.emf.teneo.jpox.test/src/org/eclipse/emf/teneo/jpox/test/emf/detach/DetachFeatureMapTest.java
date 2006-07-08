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

import org.eclipse.emf.teneo.jpox.emf.resource.JPOXResource;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.detach.DetachFeatureMapAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Specific detach feature map test
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class DetachFeatureMapTest extends AbstractActionTest {

	/** Creates a hibernate specific version of the action */
	final static DetachFeatureMapAction testAction = new DetachFeatureMapAction() {
		/** Returns the resource uri, jdo is default (for now) */
		public String getResourceUri(TestStore store) {
			return "jpoxdao://?" + JPOXResource.DS_NAME_PARAM + "=" + store.getDatabaseAdapter().getDbName();
		}
	};

	public DetachFeatureMapTest() {
		super(testAction);
	}
}