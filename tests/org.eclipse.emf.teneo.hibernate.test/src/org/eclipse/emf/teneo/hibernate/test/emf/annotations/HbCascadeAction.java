/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * LazyLibraryAction.java,v 1.9 2007/03/29 15:00:32 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.HbCascadeFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.HbCascadePackage;
import org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.Parent;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the hb cascade types and DELETE_ORPHAN on an association
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class HbCascadeAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public HbCascadeAction() {
		super(HbCascadePackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = super.getExtraConfigurationProperties();
		props.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
				"SAVE_UPDATE, PERSIST, REFRESH, MERGE, DELETE, DELETE_ORPHAN");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		final HbCascadeFactory factory = HbCascadeFactory.eINSTANCE;
		{
			store.beginTransaction();
			final Parent parent = factory.createParent();
			parent.setName("parent");
			for (int i = 0; i < 5; i++) {
				final Child child = factory.createChild();
				child.setName("child" + i);
				parent.getChildren().add(child);
			}
			store.store(parent);
			store.commitTransaction();
		}

		{
			store.checkNumber(Child.class, 5);
		}

		{
			store.beginTransaction();
			Parent parent = store.getObject(Parent.class);
			parent.getChildren().remove(1);
			store.commitTransaction();
		}

		{
			store.checkNumber(Child.class, 4);
		}

		{
			store.beginTransaction();
			Parent parent = store.getObject(Parent.class);
			store.deleteObject(parent);
			store.commitTransaction();
		}

		{
			store.checkNumber(Parent.class, 0);
			store.checkNumber(Child.class, 0);
		}
	}
}