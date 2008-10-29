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
package org.eclipse.emf.teneo.eclipselink.emap.tests;

import java.lang.reflect.Field;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.teneo.eclipselink.emap.IndirectEMap;
import org.eclipse.persistence.internal.helper.Helper;
import org.eclipse.persistence.internal.security.PrivilegedAccessHelper;


public class IndirectEMapTest extends TestCase {
	@SuppressWarnings("serial")
  protected static final class TestEmfIndirectEMap<K, V> extends IndirectEMap<K, V> {
		public boolean isDelegateNull() {
			return delegate == null;
		}	
	}

	protected Field delegateField = null;
	protected TestEmfIndirectEMap<Object, Object> indirectEMap;

	public IndirectEMapTest(String arg0) {
		super(arg0);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		delegateField = Helper.getField(IndirectEMap.class, "delegate");
		indirectEMap = new TestEmfIndirectEMap<Object, Object>();
	}

	protected void assertDelegateInstantiated() throws Exception {
		Object delegate = getDelegateFromIndirectEMap();
		assertNotNull("delegate should be instantiated", delegate);
	}

	protected void assertDelegateNotInstantiated()throws Exception {
		Object delegate = getDelegateFromIndirectEMap();
		assertNull("delegate should not be instantiated", delegate);
	}

	Object getDelegateFromIndirectEMap() throws IllegalAccessException {
		return PrivilegedAccessHelper.getValueFromField(delegateField, indirectEMap);
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.hashCode()'
	 */
	public void testHashCode() throws Exception {
		indirectEMap.hashCode();
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.size()'
	 */
	public void testSize() throws Exception {
		indirectEMap.size();
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.isEmpty()'
	 */
	public void testIsEmpty() throws Exception {
		indirectEMap.isEmpty();
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.clear()'
	 */
	public void testClear() throws Exception {
		indirectEMap.clear();
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.EmfIndirectEMap()'
	 */
	public void testEmfIndirectEMap() throws Exception {
		assertDelegateNotInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.EmfIndirectEMap(int)'
	 */
	public void testEmfIndirectEMapInt() throws Exception {

	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.EmfIndirectEMap(int, float)'
	 */
	public void testEmfIndirectEMapIntFloat() throws Exception {

	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.EmfIndirectEMap(Map)'
	 */
	public void testEmfIndirectEMapMap() throws Exception {

	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.clone()'
	 */
	public void testClone() throws Exception {
		indirectEMap.clone();
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.contains(Object)'
	 */
	public void testContainsObject() throws Exception {
		indirectEMap.contains(null);
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.entrySet()'
	 */
	public void testEntrySet() throws Exception {
		indirectEMap.entrySet();
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.equals(Object)'
	 */
	public void testEqualsObject() throws Exception {
		indirectEMap.equals(null);
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.getEclipseLinkAttributeName()'
	 */
	public void testGetEclipseLinkAttributeName() throws Exception {
		indirectEMap.getEclipseLinkAttributeName();
		assertDelegateNotInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.getEclipseLinkPropertyChangeListener()'
	 */
	public void testGetEclipseLinkPropertyChangeListener() throws Exception {
		indirectEMap.getEclipseLinkPropertyChangeListener();
		assertDelegateNotInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.getValueHolder()'
	 */
	public void testGetValueHolder() throws Exception {
		indirectEMap.getValueHolder();
		assertDelegateNotInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.hasEclipseLinkPropertyChangeListener()'
	 */
	public void testHasEclipseLinkPropertyChangeListener() throws Exception {
		indirectEMap.hasEclipseLinkPropertyChangeListener();
		assertDelegateNotInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.isInstantiated()'
	 */
	public void testIsInstantiated() throws Exception {
		indirectEMap.isInstantiated();
		assertDelegateNotInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.remove(int)'
	 */
	public void testRemoveInt() throws Exception {
		try {
			indirectEMap.remove(0);
		} catch (IndexOutOfBoundsException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.remove(Object)'
	 */
	public void testRemoveObject() throws Exception {
		indirectEMap.remove(null);
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.removeAll(Collection)'
	 */
	public void testRemoveAllCollection() throws Exception {
		indirectEMap.removeAll(null);
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.setEclipseLinkAttributeName(String)'
	 */
	public void testSetEclipseLinkAttributeName() throws Exception {
		indirectEMap.setEclipseLinkAttributeName(null);
		assertDelegateNotInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.setEclipseLinkPropertyChangeListener(PropertyChangeListener)'
	 */
	public void testSetEclipseLinkPropertyChangeListener() throws Exception {
		indirectEMap.setEclipseLinkPropertyChangeListener(null);
		assertDelegateNotInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.setValueHolder(ValueHolderInterface)'
	 */
	public void testSetValueHolder() throws Exception {
		indirectEMap.setValueHolder(null);
		assertDelegateNotInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.toString()'
	 */
	public void testToString() throws Exception {
		indirectEMap.toString();
		// ValueHolder class (not QueryBasedValueHolder and other
		// value holders that lazily load objects) always say
		// they are instantiated which will result in the instantiation
		// of an empty List in the ValueHolder
		assertDelegateInstantiated();
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.iterator()'
	 */
	public void testIterator() throws Exception {
		indirectEMap.iterator();
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.add(int, Object)'
	 */
	public void testAddIntObject() throws Exception {
		try {
			indirectEMap.add(0, null);
		} catch (RuntimeException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.add(Object)'
	 */
	public void testAddObject() throws Exception {
		try {
			indirectEMap.add(null);
		} catch (RuntimeException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.addAll(Collection)'
	 */
	public void testAddAllCollection() throws Exception {
		try {
			indirectEMap.addAll(null);
		} catch (RuntimeException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.addAll(int, Collection)'
	 */
	public void testAddAllIntCollection() throws Exception {
		try {
			indirectEMap.addAll(0, null);
		} catch (RuntimeException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.containsAll(Collection)'
	 */
	public void testContainsAllCollection() throws Exception {
		try {
			indirectEMap.containsAll(null);
		} catch (RuntimeException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.get(int)'
	 */
	public void testGetInt() throws Exception {
		try {
			indirectEMap.get(0);
		} catch (IndexOutOfBoundsException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.indexOf(Object)'
	 */
	public void testIndexOfObject() throws Exception {
		indirectEMap.indexOf(null);
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.lastIndexOf(Object)'
	 */
	public void testLastIndexOfObject() throws Exception {
		indirectEMap.lastIndexOf(null);
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.listIterator()'
	 */
	public void testListIterator() throws Exception {
		indirectEMap.listIterator();
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.move(int, int)'
	 */
	public void testMoveIntInt() throws Exception {
		try {
			indirectEMap.move(0,1);
		} catch (IndexOutOfBoundsException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.move(int, Object)'
	 */
	public void testMoveIntObject() throws Exception {
		try {
			indirectEMap.move(0, null);
		} catch (IndexOutOfBoundsException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.retainAll(Collection)'
	 */
	public void testRetainAllCollection() throws Exception {
		indirectEMap.retainAll(null);
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.set(int, Object)'
	 */
	public void testSetIntObject() throws Exception {
		try {
			indirectEMap.set(0,null);
		} catch (IndexOutOfBoundsException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.subList(int, int)'
	 */
	public void testSubListIntInt() throws Exception {
		try {
			indirectEMap.subList(0,1);
		} catch (IndexOutOfBoundsException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.toArray()'
	 */
	public void testToArray() throws Exception {
		indirectEMap.toArray();
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.teneo.eclipselink.emap.EmfIndirectEMap.toArray(Object[])'
	 */
	public void testToArrayObjectArray() throws Exception {
		try {
			indirectEMap.toArray(null);
		} catch (NullPointerException e) {
		}
		assertDelegateInstantiated();		
	}

	/*
	 * ListTest method for 'org.eclipse.emf.common.util.BasicEMap.listIterator(int)'
	 */
	public void testListIteratorInt() throws Exception {
		indirectEMap.listIterator(0);
		assertDelegateInstantiated();
	}
}
