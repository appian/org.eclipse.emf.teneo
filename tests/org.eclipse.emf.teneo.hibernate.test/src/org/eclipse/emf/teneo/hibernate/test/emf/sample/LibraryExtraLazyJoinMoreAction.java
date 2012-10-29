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
 * $Id: LibraryExtraLazyJoinMoreAction.java,v 1.2 2010/03/27 21:14:42 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.util.Properties;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the extra lazy behavior of collections. Tests move, delete, etc.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class LibraryExtraLazyJoinMoreAction extends LibraryExtraLazyMoreAction {

	private EAnnotation joinAnnotation = null;

	@Override
	public Properties getExtraConfigurationProperties() {

		if (joinAnnotation == null) {
			final LibraryPackage libraryPackage = LibraryPackage.eINSTANCE;
			joinAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			joinAnnotation.setSource("teneo.jpa");
			joinAnnotation.getDetails().put("value", "@JoinTable(name=\"abc\")");
			libraryPackage.getLibrary_Writers().getEAnnotations().add(joinAnnotation);
		}

		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.FETCH_ASSOCIATION_EXTRA_LAZY, "true");
		props.setProperty(PersistenceOptions.JOIN_TABLE_FOR_NON_CONTAINED_ASSOCIATIONS, "true");
		return props;
	}

	public void doAction(TestStore store) {
		try {
			super.doAction(store);
		} finally {
			LibraryPackage.eINSTANCE.getLibrary_Writers().getEAnnotations().remove(joinAnnotation);
			joinAnnotation = null;
		}
	}
}
