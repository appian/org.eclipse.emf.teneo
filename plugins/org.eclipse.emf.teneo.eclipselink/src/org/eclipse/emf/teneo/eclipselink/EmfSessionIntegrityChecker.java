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

import org.eclipse.persistence.exceptions.IntegrityChecker;


public class EmfSessionIntegrityChecker extends IntegrityChecker {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Override
  public void handleError(RuntimeException runtimeException) {
    // do nothing when error occurs
    System.out.println("Integrity Error ignored: " + runtimeException.getMessage());
  }

}
