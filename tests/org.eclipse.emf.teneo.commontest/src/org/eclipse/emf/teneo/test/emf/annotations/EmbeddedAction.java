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
 * $Id: EmbeddedAction.java,v 1.7 2009/12/04 15:06:42 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.AOneToMany;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.AlsoEmbeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.AnotherEmbeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embedder;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class EmbeddedAction extends AbstractTestAction {
	/**
	 * Constructor
	 * 
	 * @param arg0
	 */
	public EmbeddedAction() {
		super(EmbeddedPackage.eINSTANCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.MAP_EMBEDDABLE_AS_EMBEDDED, "true");
		return props;
	}

	/** Just create and store an embedded and see if it all worked without column name clashes */
	@Override
	public void doAction(TestStore store) {
		final EmbeddedFactory factory = EmbeddedFactory.eINSTANCE;
		{
			store.beginTransaction();
			final Embedder embedder = factory.createEmbedder();
			{
				final Embeddable ea = factory.createEmbeddable();
				ea.setMyInteger(1);
				ea.setMyString("string");
				embedder.setFirstEmbedded(ea);
			}

			{
				final Embeddable ea = factory.createEmbeddable();
				ea.setMyInteger(2);
				ea.setMyString("string");
				embedder.setSecondEmbedded(ea);
			}

			{
				final Embeddable ea = factory.createEmbeddable();
				ea.setMyInteger(3);
				ea.setMyString("string");
				embedder.setThirdEmbedded(ea);
			}

			{
				final Embeddable ea = factory.createEmbeddable();
				ea.setMyInteger(4);
				ea.setMyString("string");
				embedder.getFourthEmbedded().add(ea);

				final Embeddable ea2 = factory.createEmbeddable();
				ea2.setMyInteger(5);
				ea2.setMyString("string5");
				embedder.getFourthEmbedded().add(ea2);
			}

			{
				final Embeddable ea = factory.createEmbeddable();
				ea.setMyInteger(6);
				ea.setMyString("fifthstring");
				embedder.setFifthEmbedded(ea);
			}

			final AnotherEmbeddable anotherEmbeddable = factory.createAnotherEmbeddable();
			anotherEmbeddable.setName("name");
			anotherEmbeddable.setAnotherName("anotherName");

			final AOneToMany aOneToMany1 = factory.createAOneToMany();
			aOneToMany1.setName("1");
			anotherEmbeddable.getAOneToMany().add(aOneToMany1);

			final AOneToMany aOneToMany2 = factory.createAOneToMany();
			aOneToMany2.setName("2");
			anotherEmbeddable.getAOneToMany().add(aOneToMany2);

			embedder.setAnotherEmbedded(anotherEmbeddable);

			final AlsoEmbeddable ae = factory.createAlsoEmbeddable();
			ae.setName("me");
			embedder.setAlsoEmbeddable(ae);

			store.store(embedder);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Embedder embedder = store.getObject(Embedder.class);
			assertEquals(1, embedder.getFirstEmbedded().getMyInteger());
			assertEquals(2, embedder.getSecondEmbedded().getMyInteger());
			assertEquals(3, embedder.getThirdEmbedded().getMyInteger());
			assertEquals(4, (embedder.getFourthEmbedded().get(0)).getMyInteger());
			assertEquals(5, (embedder.getFourthEmbedded().get(1)).getMyInteger());
			assertEquals(6, embedder.getFifthEmbedded().getMyInteger());
			assertEquals("me", embedder.getAlsoEmbeddable().getName());

			final AnotherEmbeddable ae = embedder.getAnotherEmbedded();
			assertEquals("anotherName", ae.getAnotherName());
			assertEquals("name", ae.getName());
			assertEquals(2, ae.getAOneToMany().size());
			assertEquals("1", ae.getAOneToMany().get(0).getName());
			assertEquals("2", ae.getAOneToMany().get(1).getName());

			store.commitTransaction();
		}
	}
}