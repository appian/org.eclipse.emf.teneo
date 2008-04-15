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
package org.eclipse.emf.teneo.eclipselink.common.eobject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

public class DatabaseEObjectImpl extends EObjectImpl implements InternalDatabaseEObject {

  private long dbID;
  private long dbVersion;

  public long getDbID() {

    return dbID;
  }

  public long getDbVersion() {

    return dbVersion;
  }
}
