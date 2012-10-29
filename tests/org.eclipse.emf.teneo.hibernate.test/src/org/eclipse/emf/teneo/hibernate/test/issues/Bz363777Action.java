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
import org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Factory;
import org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Package;
import org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap;
import org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMapService;
import org.eclipse.emf.teneo.samples.issues.bz363777.NE;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class Bz363777Action extends AbstractTestAction {

	public Bz363777Action() {
		super(new EPackage[] { Bz363777Package.eINSTANCE });
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.EMAP_AS_TRUE_MAP, "true");
		props.setProperty(PersistenceOptions.ALWAYS_MAP_LIST_AS_BAG, "true");
		return props;
	}

	@Override
	public void doAction(TestStore store) {
		{
			final ChannelMap channelMap = Bz363777Factory.eINSTANCE.createChannelMap();
			final ChannelMapService channelMapService = Bz363777Factory.eINSTANCE
					.createChannelMapService();
			channelMap.setKey(111);
			channelMapService.setName("name123");
			store.store(channelMap);
			store.store(channelMapService);
			final NE ne = Bz363777Factory.eINSTANCE.createNE();
			ne.getMapChannels().put(channelMap, channelMapService);
			store.beginTransaction();
			store.store(ne);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final NE ne = store.getObject(NE.class);
			assertTrue(ne.getMapChannels().size() == 1);
			assertTrue(ne.getMapChannels().get(0).getKey().getKey() == 111);
			assertTrue(ne.getMapChannels().get(0).getValue().getName().equals("name123"));
			store.commitTransaction();
		}
	}
}
