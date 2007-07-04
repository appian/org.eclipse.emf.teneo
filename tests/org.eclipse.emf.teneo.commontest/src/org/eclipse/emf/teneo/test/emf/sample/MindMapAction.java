/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: MindMapAction.java,v 1.7 2007/07/04 19:28:21 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;
import org.example.mindmap.Map;
import org.example.mindmap.MindmapFactory;
import org.example.mindmap.MindmapPackage;
import org.example.mindmap.Priority;
import org.example.mindmap.Relationship;
import org.example.mindmap.RelationshipType;
import org.example.mindmap.Resource;
import org.example.mindmap.Topic;

/**
 * Tests the gmf mindmap example
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class MindMapAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public MindMapAction() {
		super(MindmapPackage.eINSTANCE);
	}

	@Override
	@SuppressWarnings("unchecked")
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.SET_DEFAULT_CASCADE_ON_NON_CONTAINMENT, "true");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	@SuppressWarnings("unchecked")
	public void doAction(TestStore store) {
		final MindmapFactory factory = MindmapFactory.eINSTANCE;
		{
			final Map map = factory.createMap();
			map.setTitle("Persistency Discussions");

			final Resource res1 = factory.createResource();
			res1.setEmail("mtaal@elver.org");
			res1.setName("Martin Taal");

			final Resource res2 = factory.createResource();
			res2.setEmail("test@elver.org");
			res2.setName("Test Me");

			map.getResources().add(res1);
			map.getResources().add(res2);

			map.getRootTopics().add(createTopic(store, map.getResources(), factory, "Teneo JPOX", 5));
			map.getRootTopics().add(createTopic(store, new ArrayList(), factory, "Teneo Hibernate", 3));

			final Relationship rel = factory.createRelationship();
			rel.setSource((Topic) map.getRootTopics().get(0));
			rel.setTarget((Topic) map.getRootTopics().get(1));
			rel.setType(RelationshipType.EXTENDS_LITERAL);

			map.getRelations().add(rel);

			store.beginTransaction();
			store.store(map);
			store.commitTransaction();
		}

		{
			store.beginTransaction();
			Map map = store.getObject(Map.class);
			assertEquals(2, map.getRootTopics().size());
			checkTopic(map, (Topic) map.getRootTopics().get(0), "Teneo JPOX", 5);
			checkTopic(map, (Topic) map.getRootTopics().get(1), "Teneo Hibernate", 3);
			Relationship rs = (Relationship) map.getRelations().get(0);
			assertEquals(rs.getSource(), map.getRootTopics().get(0));
			assertEquals(rs.getTarget(), map.getRootTopics().get(1));
			map.getRelations().remove(0);
			map.getRootTopics().remove(1);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			Map map = store.getObject(Map.class);
			assertEquals(1, map.getRootTopics().size());
			checkTopic(map, (Topic) map.getRootTopics().get(0), "Teneo JPOX", 5);
			store.commitTransaction();
		}
	}

	/** Create a default topic */
	@SuppressWarnings("unchecked")
	private Topic createTopic(TestStore store, List resources, MindmapFactory factory, String name, int level) {
		final Topic topic = factory.createTopic();
		topic.setEndDate(store.getDate(new Date()));
		topic.setStartDate(store.getDate(new Date()));
		topic.setName(name + level);
		topic.setPriority(Priority.get(level));
		topic.setPercentComplete((float) (level * 10.0 / 100.0));
		topic.getResources().addAll(resources);
		for (int i = 0; i < level; i++) {
			topic.getSubtopics().add(createTopic(store, resources, factory, name + "_", level - 1));
		}
		return topic;
	}

	private void checkTopic(Map map, Topic topic, String name, int level) {
		assertEquals(name + level, topic.getName());
		assertEquals(level, topic.getSubtopics().size());
		assertEquals(Priority.get(level), topic.getPriority());
		assertEquals((float) (level * 10.0 / 100.0), topic.getPercentComplete(), 0.1f);
		for (int i = 0; i < topic.getResources().size(); i++) {
			assertEquals(topic.getResources().get(i), map.getResources().get(i));
		}
		for (int i = 0; i < level; i++) {
			checkTopic(map, (Topic) topic.getSubtopics().get(i), name + "_", level - 1);
		}
	}
}