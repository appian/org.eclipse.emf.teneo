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

import java.lang.reflect.Field;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.persistence.internal.helper.Helper;
import org.eclipse.persistence.internal.security.PrivilegedAccessHelper;
import org.eclipse.persistence.internal.sessions.UnitOfWorkImpl;
import org.eclipse.persistence.sessions.Session;
import org.eclipse.persistence.sessions.SessionEvent;
import org.eclipse.persistence.sessions.SessionEventAdapter;

public class EmfSessionEventListener extends SessionEventAdapter {

  public EmfSessionEventListener() {
    super();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.persistence.sessions.SessionEventAdapter#preCalculateUnitOfWorkChangeSet(org.eclipse.persistence.sessions.SessionEvent)
   */
  @Override
  public void preCalculateUnitOfWorkChangeSet(SessionEvent event) {
    Field eContainerField;
    try {
      eContainerField = Helper.getField(EObjectImpl.class, "eContainer");
      Session session = event.getSession();
      UnitOfWorkImpl uow = (UnitOfWorkImpl) session;
      for (Object object : uow.getCloneMapping().keySet()) {
        if (object instanceof BasicEMap.Entry) {
          EObjectImpl entry = (EObjectImpl) object;
          if (entry.eContainer() == null) {
            // restore the eContainer reference so the primary keys can be
            // calculated
            EObjectImpl backupEntry = (EObjectImpl) uow.getBackupClone(entry);
            PrivilegedAccessHelper.setValueInField(eContainerField, entry, backupEntry.eContainer());
          }
        }
      }
    }
    catch (Exception e) {
      throw new RuntimeException("Error deleting EMap Entries", e);
    }
  }

}
