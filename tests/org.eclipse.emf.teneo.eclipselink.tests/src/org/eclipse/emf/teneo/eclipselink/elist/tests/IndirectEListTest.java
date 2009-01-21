/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.elist.tests;

import java.lang.reflect.Field;
import java.util.ArrayList;

import junit.framework.TestCase;

import org.eclipse.emf.teneo.eclipselink.elist.IndirectEList;
import org.eclipse.persistence.internal.helper.Helper;
import org.eclipse.persistence.internal.security.PrivilegedAccessHelper;

public class IndirectEListTest extends TestCase {
	@SuppressWarnings("serial")
	protected static final class TestEmfIndirectEList<E> extends IndirectEList<E> {
		public boolean isDelegateNull() {
			return delegate == null;
		}
	}

	protected Field delegateField = null;
	protected TestEmfIndirectEList<Object> indirectEList;

	public IndirectEListTest(String arg0) {
		super(arg0);
	}

	/*
	 * (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		delegateField = Helper.getField(IndirectEList.class, "delegate");
		indirectEList = new TestEmfIndirectEList<Object>();
	}

	protected void assertDelegateInstantiated() throws Exception {
		Object delegate = getDelegateFromIndirectEList();
		assertNotNull("delegate should be instantiated", delegate);
	}

	protected void assertDelegateNotInstantiated() throws Exception {
		Object delegate = getDelegateFromIndirectEList();
		assertNull("delegate should not be instantiated", delegate);
	}

	Object getDelegateFromIndirectEList() throws IllegalAccessException {
		return PrivilegedAccessHelper.getValueFromField(delegateField, indirectEList);
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.hashCode()'
	 */
	public void testHashCode() throws Exception {
		indirectEList.hashCode();
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.size()'
	 */
	public void testSize() throws Exception {
		indirectEList.size();
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.isEmpty()'
	 */
	public void testIsEmpty() throws Exception {
		indirectEList.isEmpty();
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.clear()'
	 */
	public void testClear() throws Exception {
		indirectEList.clear();
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.basicListIterator(int)'
	 */
	public void testBasicListIteratorInt() throws Exception {
		try {
			indirectEList.basicListIterator(10);
			fail("Removing from temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.basicIterator()'
	 */
	public void testBasicIterator() throws Exception {
		indirectEList.basicIterator();
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.basicListIterator()'
	 */
	public void testBasicListIterator() throws Exception {
		indirectEList.basicListIterator();
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.basicList()'
	 */
	public void testBasicList() throws Exception {
		indirectEList.basicList();
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.basicRemove(Object,
	 * NotificationChain)'
	 */
	public void testBasicRemove() throws Exception {
		try {
			indirectEList.basicRemove(null, null);
			fail("Removing from temporary EclipseLinkEList should throw an exception.");
		} catch (RuntimeException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.basicAdd(Object,
	 * NotificationChain)'
	 */
	public void testBasicAdd() throws Exception {
		try {
			indirectEList.basicAdd(null, null);
			fail("Adding to a temporary EclipseLinkEList should throw an exception.");
		} catch (RuntimeException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.add(int, Object)'
	 */
	public void testAddIntObject() throws Exception {
		try {
			indirectEList.add(1, null);
			fail("Adding to a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.add(Object)'
	 */
	public void testAddObject() throws Exception {
		indirectEList.add(null);
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.addAll(int, Collection)'
	 */
	public void testAddAllIntCollection() throws Exception {
		try {
			indirectEList.addAll(1, new ArrayList<Object>());
			fail("Adding to a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.addAll(Collection)'
	 */
	public void testAddAllCollection() throws Exception {
		indirectEList.addAll(new ArrayList<Object>());
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.clone()'
	 */
	public void testClone() throws Exception {
		indirectEList.clone();
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.contains(Object)'
	 */
	public void testContainsObject() throws Exception {
		indirectEList.contains(null);
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.containsAll(Collection)'
	 */
	public void testContainsAllCollection() throws Exception {
		indirectEList.containsAll(new ArrayList<Object>());
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.equals(Object)'
	 */
	public void testEqualsObject() throws Exception {
		indirectEList.equals(null);
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.get(int)'
	 */
	public void testGetInt() throws Exception {
		try {
			indirectEList.get(0);
			fail("Using a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.getValueHolder()'
	 */
	public void testGetValueHolder() throws Exception {
		indirectEList.getValueHolder();
		assertDelegateNotInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.hasBeenRegistered()'
	 */
	public void testHasBeenRegistered() throws Exception {
		indirectEList.hasBeenRegistered();
		assertDelegateNotInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.indexOf(Object)'
	 */
	public void testIndexOfObject() throws Exception {
		indirectEList.indexOf(null);
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.isInstantiated()'
	 */
	public void testIsInstantiated() throws Exception {
		indirectEList.isInstantiated();
		assertDelegateNotInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.iterator()'
	 */
	public void testIterator() throws Exception {
		indirectEList.iterator();
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.lastIndexOf(Object)'
	 */
	public void testLastIndexOfObject() throws Exception {
		indirectEList.lastIndexOf(null);
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.listIterator()'
	 */
	public void testListIterator() throws Exception {
		indirectEList.listIterator();
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.listIterator(int)'
	 */
	public void testListIteratorInt() throws Exception {
		try {
			indirectEList.listIterator(10);
			fail("Using a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.remove(int)'
	 */
	public void testRemoveInt() throws Exception {
		try {
			indirectEList.remove(1);
			fail("Using a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.remove(Object)'
	 */
	public void testRemoveObject() throws Exception {
		indirectEList.remove(null);
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.removeAll(Collection)'
	 */
	public void testRemoveAllCollection() throws Exception {
		indirectEList.removeAll(new ArrayList<Object>());
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.removeElement(Object)'
	 */
	public void testRemoveElement() throws Exception {
		indirectEList.removeElement(null);
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.removeElementAt(int)'
	 */
	public void testRemoveElementAt() throws Exception {
		try {
			indirectEList.removeElementAt(1);
			fail("Using a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.retainAll(Collection)'
	 */
	public void testRetainAllCollection() throws Exception {
		indirectEList.retainAll(new ArrayList<Object>());
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.set(int, Object)'
	 */
	public void testSetIntObject() throws Exception {
		try {
			indirectEList.set(1, null);
			fail("Using a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.setElementAt(Object, int)'
	 */
	public void testSetElementAt() throws Exception {
		try {
			indirectEList.setElementAt(null, 1);
			fail("Using a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for
	 * 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.setValueHolder(ValueHolderInterface)'
	 */
	public void testSetValueHolder() throws Exception {
		indirectEList.setValueHolder(null);
		assertDelegateNotInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.subList(int, int)'
	 */
	public void testSubListIntInt() throws Exception {
		try {
			indirectEList.subList(1, 2);
			fail("Using a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.toArray()'
	 */
	public void testToArray() throws Exception {
		indirectEList.toArray();
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.toArray(Object[])'
	 */
	public void testToArrayObjectArray() throws Exception {
		indirectEList.toArray(new Object[] {});
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.toString()'
	 */
	public void testToString() throws Exception {
		indirectEList.toString();
		// ValueHolder class (not QueryBasedValueHolder and other
		// value holders that lazily load objects) always say
		// they are instantiated which will result in the instantiation
		// of an empty List in the ValueHolder
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for
	 * 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.getEclipseLinkPropertyChangeListener()'
	 */
	public void testGetEclipseLinkPropertyChangeListener() throws Exception {
		indirectEList.getEclipseLinkPropertyChangeListener();
		assertDelegateNotInstantiated();
	}

	/*
	 * ListTest method for
	 * 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.hasEclipseLinkPropertyChangeListener()'
	 */
	public void testHasEclipseLinkPropertyChangeListener() throws Exception {
		indirectEList.hasEclipseLinkPropertyChangeListener();
		assertDelegateNotInstantiated();
	}

	/*
	 * ListTest method for
	 * 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.setEclipseLinkPropertyChangeListener(PropertyChangeListener)'
	 */
	public void testSetEclipseLinkPropertyChangeListener() throws Exception {
		indirectEList.setEclipseLinkPropertyChangeListener(null);
		assertDelegateNotInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.getEclipseLinkAttributeName()'
	 */
	public void testGetEclipseLinkAttributeName() throws Exception {
		indirectEList.getEclipseLinkAttributeName();
		assertDelegateNotInstantiated();
	}

	/*
	 * ListTest method for
	 * 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.setEclipseLinkAttributeName(String)'
	 */
	public void testSetEclipseLinkAttributeName() throws Exception {
		indirectEList.setEclipseLinkAttributeName(null);
		assertDelegateNotInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.move(int, Object)'
	 */
	public void testMoveIntObject() throws Exception {
		try {
			indirectEList.move(1, null);
			fail("Using a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.move(int, int)'
	 */
	public void testMoveIntInt() throws Exception {
		try {
			indirectEList.move(1, 2);
			fail("Using a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.addUnique(int, Object)'
	 */
	public void testAddUniqueIntObject() throws Exception {
		try {
			indirectEList.addUnique(1, null);
			fail("Using a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.addUnique(Object)'
	 */
	public void testAddUniqueObject() throws Exception {
		indirectEList.addUnique(null);
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.basicGet(int)'
	 */
	public void testBasicGetInt() throws Exception {
		try {
			indirectEList.basicGet(0);
			fail("Using a temporary EclipseLinkEList should throw an exception.");
		} catch (IndexOutOfBoundsException e) {
			// expected but we are only testing for delegate instantiation
		}
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.setUnique(int, Object)'
	 */
	public void testSetUniqueIntObject() throws Exception {
		indirectEList.setUnique(0, null);
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.ensureCapacity(int)'
	 */
	public void testEnsureCapacity() throws Exception {
		indirectEList.ensureCapacity(1);
		assertDelegateNotInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.elist.EmfIndirectEList.trimToSize()'
	 */
	public void testTrimToSize() throws Exception {
		indirectEList.trimToSize();
		assertDelegateNotInstantiated();
	}

}
