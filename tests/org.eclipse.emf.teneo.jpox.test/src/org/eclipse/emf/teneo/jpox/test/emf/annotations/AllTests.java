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
package org.eclipse.emf.teneo.jpox.test.emf.annotations;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.annotations.BasicAction;
import org.eclipse.emf.teneo.test.emf.annotations.BookAction;
import org.eclipse.emf.teneo.test.emf.annotations.CascadeNotallAction;
import org.eclipse.emf.teneo.test.emf.annotations.CompositeIdAction;
import org.eclipse.emf.teneo.test.emf.annotations.DuplicatesAction;
import org.eclipse.emf.teneo.test.emf.annotations.IdAction;
import org.eclipse.emf.teneo.test.emf.annotations.InheritanceAnnotationAction;
import org.eclipse.emf.teneo.test.emf.annotations.LazyLibraryAction;
import org.eclipse.emf.teneo.test.emf.annotations.LobAction;
import org.eclipse.emf.teneo.test.emf.annotations.ManyToManyAction;
import org.eclipse.emf.teneo.test.emf.annotations.MappedSuperClassAction;
import org.eclipse.emf.teneo.test.emf.annotations.SetNMAction;
import org.eclipse.emf.teneo.test.emf.annotations.SetResourceAction;
import org.eclipse.emf.teneo.test.emf.annotations.ToOneAction;
import org.eclipse.emf.teneo.test.emf.annotations.UniqueConstraintsAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.annotations",
				JPOXTestbed.instance().getConfigurations());

		suite.addTestSuite(MappedSuperClassAction.class);

		suite.addTestSuite(LobAction.class);
		suite.addTestSuite(CascadeNotallAction.class);
		suite.addTestSuite(CompositeIdAction.class);
		suite.addTestSuite(BookAction.class);

		suite.addTestSuite(UniqueConstraintsAction.class);
		suite.addTestSuite(ToOneAction.class);
		suite.addTestSuite(BasicAction.class);
		suite.addTestSuite(InheritanceAnnotationAction.class);
		suite.addTestSuite(LazyLibraryAction.class);
		suite.addTestSuite(IdAction.class);
		suite.addTestSuite(DuplicatesAction.class);
		suite.addTestSuite(SetNMAction.class);
		suite.addTestSuite(SetResourceAction.class);
		suite.addTestSuite(ManyToManyAction.class);

		/*
		 *  // fails because of jpox bug, see: http://www.jpox.org/servlet/jira/browse/CORE-2567
		 * suite.addTestSuite(EmbeddedAction.class); suite.addTestSuite(AttributeOverridesAction.class); // set is not
		 * supported by jpox suite.addTestSuite(SetAction.class);
		 * 
		 * JoinColumns is not supported by jpox suite.addTestSuite(JoinColumnsAction.class);
		 * 
		 */
		return suite;
	}

}
