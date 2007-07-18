/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: LibraryCheckNameAction.java,v 1.1 2007/07/18 16:09:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import org.eclipse.emf.teneo.extension.ExtensionManager;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class LibraryCheckNameAction extends LibraryColLengthAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#setExtensions(org.eclipse.emf.teneo.extension.ExtensionManager)
	 */
	@Override
	public void setExtensions(ExtensionManager extensionManager) {
		// purposely empty, do not remove
	}

	@Override
	protected String getTestQuery() {
		return "SELECT * FROM BOOK WHERE l_b_e_i<>0 AND L_B_I>0 AND w_b_i>0".toLowerCase();
	}
}
