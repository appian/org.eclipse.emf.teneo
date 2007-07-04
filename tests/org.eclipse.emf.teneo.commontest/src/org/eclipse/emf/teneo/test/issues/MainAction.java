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
 * $Id: MainAction.java,v 1.4 2007/07/04 19:28:21 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import main.BaseComponent;
import main.BaseGroup;
import main.BaseObject;
import main.ChildObject1;
import main.ChildObject2;
import main.ChildObject3;
import main.ChildObject4;
import main.MainFactory;
import main.MainPackage;
import main.impl.BaseGroupImpl;

import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests issue with inheritance and polymorphic relations.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class MainAction extends AbstractTestAction {
	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public MainAction() {
		super(MainPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {

		BaseGroup mainObjectsGroup = MainFactory.eINSTANCE.createBaseGroup();
		mainObjectsGroup.setName("mainObjectsGroup");

		// =============== create basic objects ++++++++++++++++++++++

		// create ChildObject1
		ChildObject1 o1 = MainFactory.eINSTANCE.createChildObject1();
		o1.setGroup(mainObjectsGroup);
		o1.setName("o1_1");

		ChildObject1 o2 = MainFactory.eINSTANCE.createChildObject1();
		o2.setGroup(mainObjectsGroup);
		o2.setName("o1_2");

		ChildObject1 o3 = MainFactory.eINSTANCE.createChildObject1();
		o3.setGroup(mainObjectsGroup);
		o3.setName("o1_3");

		ChildObject1 o4 = MainFactory.eINSTANCE.createChildObject1();
		o4.setGroup(mainObjectsGroup);
		o4.setName("o1_4");

		ChildObject1 o5 = MainFactory.eINSTANCE.createChildObject1();
		o5.setGroup(mainObjectsGroup);
		o5.setName("o1_5");

		// create other ChildObjects
		ChildObject2 o11 = MainFactory.eINSTANCE.createChildObject2();
		o11.setGroup(mainObjectsGroup);
		o11.setName(o11.getClass().getName());
		o11.setLength(new Integer(13));
		o11.setObject1(o1);

		ChildObject2 o12 = MainFactory.eINSTANCE.createChildObject2();
		o12.setGroup(mainObjectsGroup);
		o12.setName(o12.getClass().getName());
		o12.setLength(new Integer(15));
		o12.setObject1(o2);

		ChildObject3 o13 = MainFactory.eINSTANCE.createChildObject3();
		o13.setGroup(mainObjectsGroup);
		o13.setName(o13.getClass().getName());
		o13.setWidth(new Integer(6));
		o13.setObject1(o3);

		ChildObject4 o14 = MainFactory.eINSTANCE.createChildObject4();
		o14.setGroup(mainObjectsGroup);
		o14.setName(o14.getClass().getName());
		o14.setThickness(new Integer(1));
		o14.setObject1(o4);

		ChildObject4 o15 = MainFactory.eINSTANCE.createChildObject4();
		o15.setGroup(mainObjectsGroup);
		o15.setName(o15.getClass().getName());
		o15.setThickness(new Integer(2));
		o15.setObject1(o5);
		store.beginTransaction();
		store.store(mainObjectsGroup);

		store.commitTransaction();

		// Reopen the transaction and query for the objects
		store.beginTransaction();

		List<?> c = store.getObjects(BaseGroupImpl.class);
		Iterator<?> it = c.iterator();
		BaseGroup grp = null;// not recursive to limit redondancy display

		// read the TObjectsGroups
		while (it.hasNext()) {
			grp = (BaseGroup) it.next();
			Collection<?> components = grp.getComponents();
			if (components != null) {
				Iterator<?> it2 = components.iterator();
				while (it2.hasNext()) {
					BaseComponent cpn = (BaseComponent) it2.next();
					if (cpn instanceof ChildObject1) {
						ChildObject1 co1 = (ChildObject1) cpn;
						BaseObject bo = co1.getLinkedObject();
						assertTrue(bo.getClass().getName().compareTo(bo.getName()) == 0);
						assertTrue(!(bo instanceof ChildObject1));
					}
				}
			}
		}

		// pm.makePersistentAll(c);
		// notify end of display
		store.commitTransaction();
	}
}
