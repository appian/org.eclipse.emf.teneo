/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: ForumAction.java,v 1.1 2006/07/04 22:12:15 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import org.eclipse.emf.teneo.samples.emf.sample.forum.Forum;
import org.eclipse.emf.teneo.samples.emf.sample.forum.ForumFactory;
import org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Member;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Post;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Topic;
import org.eclipse.emf.teneo.samples.emf.sample.forum.TopicCategory;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the forum example
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ 
*/
public class ForumAction extends AbstractTestAction 
{
	public ForumAction() 
	{
		super(ForumPackage.eINSTANCE);
	}
	
	/** Test */
	public void doAction(TestStore store)
	{
        final ForumFactory factory = ForumFactory.eINSTANCE;

        store.beginTransaction();
        final Forum forum = factory.createForum();
        forum.setTitle("my first forum1");
        
        final Member member = factory.createMember();
        member.setNickname("martin");
        
        final Topic topic = factory.createTopic();
        topic.setCategory(TopicCategory.ANNOUNCEMENT_LITERAL);
        topic.setCreator(member);
        topic.setTitle("my first topic!");
        
        // is a two-way relation!
        assertTrue(((Topic)member.getCreated().get(0)).getTitle().compareTo("my first topic!") == 0);
        
        final Post post = factory.createPost();
        post.setTopic(topic);
        post.setAuthor(member);
        post.setComment("my post");
        
        forum.getTopics().add(topic);
        forum.getMembers().add(member);

        store.store(forum);

        for (int i = 0; i < 100; i++)
        {
	        final Member newMember = factory.createMember();
	        newMember.setNickname("martin" + i);
	        forum.getMembers().add(newMember);
	        store.store(newMember);		        
        }
        store.store(forum);
        store.commitTransaction();
	}	
}
