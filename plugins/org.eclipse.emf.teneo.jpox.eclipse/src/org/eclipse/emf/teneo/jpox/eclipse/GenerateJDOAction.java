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
 * $Id: GenerateJDOAction.java,v 1.2 2006/09/13 10:39:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.eclipse;

import java.util.HashMap;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.eclipse.genxml.GenerateMappingAction;
import org.eclipse.emf.teneo.jpox.JpoxConstants;
import org.eclipse.emf.teneo.jpox.mapper.GenerateJDO;

/**
 * Eclipse popup action to generate a jdo file based on emf generated sources.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class GenerateJDOAction extends GenerateMappingAction {
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		final HashMap options = new HashMap();
		options.put(PersistenceOptions.INHERITANCE_MAPPING, InheritanceType.JOINED_LITERAL.getName());
		super.run(action, JpoxConstants.DEFAULT_JDO_FILENAME, "Generate JDO 2.0 Metadata File", options, GenerateJDO.class.getName());
	}
}