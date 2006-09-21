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
 * $Id: JPOXResourceDAO.java,v 1.2 2006/09/21 00:56:35 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.resource;

import org.eclipse.emf.common.util.URI;
	
/**
 * JPOX Resource. The JPOX resource is connected to a persistence manager during its lifetime. This is a specific JPOX
 * Resource which detaches objects after loading them and attaching objects when they are saved. This means that there
 * are only transactions during save and load actions.
 * 
 * For the rest see the superclass.
 * 
 * This class will be deprecated, use the JPOXResource class!
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2006/09/21 00:56:35 $
 */

public class JPOXResourceDAO extends JPOXResource {

	/**
	 * The constructor, gets an uri and retrieves the backing OJBStore
	 */
	public JPOXResourceDAO(URI uri) {
		super(uri, true);
	}
}