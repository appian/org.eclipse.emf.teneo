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

import org.eclipse.emf.ecore.EObject;

public interface EmfOwnedValueHolder {

	public abstract EObject getOwner();

	public abstract void setOwner(EObject owner);

	public abstract String getOwnerAttrName();

	public abstract void setOwnerAttrName(String ownerAttrName);

}