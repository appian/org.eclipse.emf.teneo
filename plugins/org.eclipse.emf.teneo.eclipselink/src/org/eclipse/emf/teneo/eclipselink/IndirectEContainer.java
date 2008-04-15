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
package org.eclipse.emf.teneo.eclipselink;

import org.eclipse.persistence.indirection.IndirectContainer;


public interface IndirectEContainer<E> extends IndirectContainer {
  /**
   * Add and object to the EMF container without triggering notification or
   * updating the owner.
   * 
   * @param element
   * @return boolean indicating success
   */
  boolean eAdd(E element);
}
