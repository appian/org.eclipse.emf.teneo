/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.issues;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.samples.issues.update.Child;
import org.eclipse.emf.teneo.samples.issues.update.Parent;
import org.eclipse.emf.teneo.samples.issues.update.UpdateFactory;
import org.eclipse.emf.teneo.samples.issues.update.UpdatePackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.hibernate.Session;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class UpdateAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public UpdateAction() {
		super(new EPackage[] { UpdatePackage.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.ALWAYS_VERSION, "false");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		{
			final Parent p = UpdateFactory.eINSTANCE.createParent();
			p.setName("p");
			p.setDescription("original");
			final Child c1 = UpdateFactory.eINSTANCE.createChild();
			c1.setName("c1");
			c1.setDescription("original");
			final Child c2 = UpdateFactory.eINSTANCE.createChild();
			c2.setName("c2");
			c2.setDescription("original");
			p.getChildren().add(c1);
			p.getChildren().add(c2);
			store.beginTransaction();
			store.store(p.getChildren());
			store.store(p);
			store.commitTransaction();
		}

		{
			final Parent p = UpdateFactory.eINSTANCE.createParent();
			p.setName("p");
			p.setDescription("updated");
			final Child c1 = UpdateFactory.eINSTANCE.createChild();
			c1.setName("c1");
			c1.setDescription("updated");
			final Child c2 = UpdateFactory.eINSTANCE.createChild();
			c2.setName("c3");
			c2.setDescription("updated");
			p.getChildren().add(c1);
			p.getChildren().add(c2);
			store.beginTransaction();
			final Session session = ((HibernateTestStore) store).getSession();
			session.merge(p);
			store.commitTransaction();
		}

		{
			final Parent p = UpdateFactory.eINSTANCE.createParent();
			p.setName("p2");
			p.setDescription("o2");
			final Child c1 = UpdateFactory.eINSTANCE.createChild();
			c1.setName("c4");
			c1.setDescription("o2");
			final Child c2 = UpdateFactory.eINSTANCE.createChild();
			c2.setName("c5");
			c2.setDescription("o2");
			p.getChildren().add(c1);
			p.getChildren().add(c2);
			store.beginTransaction();
			final Session session = ((HibernateTestStore) store).getSession();
			session.merge(p);
			store.commitTransaction();
		}
	}
}
