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
package org.eclipse.emf.teneo.eclipselink.emap;

import java.util.Iterator;
import java.util.Vector;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.persistence.exceptions.QueryException;
import org.eclipse.persistence.internal.queries.CollectionContainerPolicy;
import org.eclipse.persistence.internal.queries.ContainerPolicy;
import org.eclipse.persistence.internal.queries.MapContainerPolicy;
import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.sessions.Session;

/**
 * <p>
 * <b>Purpose</b>: A MapContainerPolicy is ContainerPolicy whose container class implements the Map interface.
 * <p>
 * <p>
 * <b>Responsibilities</b>: Provide the functionality to operate on an instance of a Map.
 * 
 * @see MapContainerPolicy
 * @see ContainerPolicy
 * @see CollectionContainerPolicy
 */
public class EMapContainerPolicy extends MapContainerPolicy {

	private static final long serialVersionUID = 1L;

	/**
	 * INTERNAL: Construct a new policy.
	 */
	public EMapContainerPolicy() {
		super(BasicEMap.class);
	}

	/**
	 * INTERNAL: Construct a new policy for the specified class.
	 */
	public EMapContainerPolicy(Class<?> containerClass) {
		super(containerClass);
	}

	/**
	 * INTERNAL: Construct a new policy for the specified class name.
	 */
	public EMapContainerPolicy(String containerClassName) {
		super(containerClassName);
	}

	@Override
	public Class<?> getInterfaceType() {
		return EMap.class;
	}

	/**
	 * INTERNAL: Return the size of container.
	 */
	@Override
	public int sizeFor(Object container) {
		return ((EMap<?, ?>) container).size();
	}

	/**
	 * INTERNAL: Validate the container type.
	 */
	@Override
	public boolean isValidContainer(Object container) {
		// PERF: Use instanceof which is inlined, not isAssignable which is very
		// inefficent.
		return container instanceof EMap<?, ?>;
	}

	/**
	 * INTERNAL: Remove element from container which implements the Map interface.
	 */
	public boolean removeFromWithIdentity(Object element, Object container, Session session) {
		boolean found = false;
		Vector<Object> knownKeys = new Vector<Object>(1);
		try {
			Iterator<?> iterator = ((EMap<?, ?>) container).keySet().iterator();
			while (iterator.hasNext()) {
				Object key = iterator.next();
				if (((EMap<?, ?>) container).get(key) == element) {
					knownKeys.addElement(key);
					found = true;
				}
			}
			if (found) {
				for (int index = 0; index < knownKeys.size(); ++index) {
					((EMap<?, ?>) container).remove(knownKeys.elementAt(index));
				}
			}
			return found;
		} catch (UnsupportedOperationException ex) {
			throw QueryException.methodNotValid(container, "remove(Object element)"); //$NON-NLS-1$
		}
	}

	/**
	 * INTERNAL: Remove element from container which implements the Map interface.
	 */
	@Override
	public boolean removeFrom(Object key, Object element, Object container, AbstractSession session) {
		try {
			Object returnValue = null;
			if (key != null) {
				returnValue = ((EMap<?, ?>) container).remove(key);
			} else {
				returnValue = ((EMap<?, ?>) container).remove(keyFrom(element, session));
			}
			if (returnValue == null) {
				return false;
			} else {
				return true;
			}
		} catch (UnsupportedOperationException ex) {
			throw QueryException.methodNotValid(container, "remove(Object element)"); //$NON-NLS-1$
		}
	}

	/**
	 * INTERNAL: Return an Iterator for the given container.
	 */
	@Override
	public Object iteratorFor(Object container) {
		return ((EMap<?, ?>) container).values().iterator();
	}

	/**
	 * INTERNAL: Return the true if element exists in container.
	 * 
	 * @return boolean true if container 'contains' element
	 */
	@Override
	protected boolean contains(Object element, Object container) {
		return ((EMap<?, ?>) container).containsValue(element);
	}

	/**
	 * INTERNAL: Remove all the elements from container.
	 */
	@Override
	public void clear(Object container) {
		try {
			((EMap<?, ?>) container).clear();
		} catch (UnsupportedOperationException ex) {
			throw QueryException.methodNotValid(container, "clear()"); //$NON-NLS-1$
		}
	}

	/**
	 * INTERNAL: Add element into container which implements the Map interface.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addInto(Object key, Object element, Object container, AbstractSession session) {
		Object wrapped = element;
		if (hasElementDescriptor()) {
			wrapped = getElementDescriptor().getObjectBuilder().wrapObject(element, session);
		}
		try {
			if (key != null) {
				return ((EMap<Object, Object>) container).put(key, wrapped) != null;
			} else {
				return ((EMap<Object, Object>) container).put(keyFrom(element, session), wrapped) != null;
			}
		} catch (ClassCastException ex1) {
			throw QueryException.mapKeyNotComparable(element, container);
		}
	}
}