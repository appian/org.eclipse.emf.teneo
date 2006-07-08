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
package org.eclipse.emf.teneo.jpox.test.stores;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.test.stores.AbstractTestStoreFactory;
import org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * The jpox store factory
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class JPOXTestStoreFactory extends AbstractTestStoreFactory {

	/** Creates the actual specific test store */
	protected TestStore createStoreInstance(TestDatabaseAdapter adapter, EPackage[] epackages, String mappingFileLocation,
			Properties props, InheritanceType inheritanceType) {
		return new JPOXTestStore(adapter, epackages, null, props, inheritanceType);
	}
}
