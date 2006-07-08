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
 * $Id: DefaultPMFCreator.java,v 1.1 2006/07/08 22:04:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.emf;

import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

/**
 * The interface for the creator of a persistence manager factory. This can be used by a client application to override
 * the creation of persistence managers and persistence manager factories.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class DefaultPMFCreator implements PMFCreator {
	/** Creates a persistence manager factory on the basis of the properties */
	public PersistenceManagerFactory getPersistenceManagerFactory(Properties props) {
		return JDOHelper.getPersistenceManagerFactory(props);
	}
}