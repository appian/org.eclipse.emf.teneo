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
 * $Id: Bz292973.java,v 1.1 2009/10/27 23:14:05 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.Properties;

import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.LibraryAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class Bz292973 extends AbstractActionTest {

	private static LibraryAction testAction = new LibraryAction() {
		@Override
		protected void checkContainerAfterLibraryRetrieve(TestStore store, Writer writ) {
		};

		@Override
		public Properties getExtraConfigurationProperties() {
			final Properties props = super.getExtraConfigurationProperties();
			props.setProperty(HibernateTestStore.EPACKAGE_INIT_MODE, HibernateTestStore.EPACKAGE_INIT_MODE_SPECIFIED);
			props.setProperty(HibernateTestStore.SPECIFIED_EPACKAGES, LibraryPackage.class.getName());
			return props;
		}

		@Override
		protected void checkTeneoSQLNameStrategy() {
		}

		@Override
		protected void checkContainerAfterWriterRetrieve(TestStore store, Writer writ) {
		};

		@Override
		protected boolean listValueOfCorrectType(Object value) {
			return true;
		};

		/** Dump the annotated model to standard output */
		@Override
		protected void dumpPAModel(TestStore testStore) {
		}

	};

	public Bz292973() {
		super(testAction);
	}
}
