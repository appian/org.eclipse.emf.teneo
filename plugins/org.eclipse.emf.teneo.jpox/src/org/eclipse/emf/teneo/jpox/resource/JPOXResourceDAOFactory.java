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
 * $Id: JPOXResourceDAOFactory.java,v 1.2 2006/09/21 00:56:35 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Creates jpox resources based on an uri.
 * 
 * Deprecated, use JPOXResourceFactory.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2006/09/21 00:56:35 $
 */

public class JPOXResourceDAOFactory implements Resource.Factory {
	/** The logger */
	// private static Log log = LogFactory.getLog(JPOXResourceFactory.class);
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.Resource.Factory#createResource(org.eclipse.emf.common.util.URI)
	 */
	public Resource createResource(URI uri) {
		return new JPOXResource(uri, true);
	}
}
