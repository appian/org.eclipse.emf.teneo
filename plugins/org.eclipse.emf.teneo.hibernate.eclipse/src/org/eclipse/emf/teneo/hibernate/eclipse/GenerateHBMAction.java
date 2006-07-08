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
 * $Id: GenerateHBMAction.java,v 1.1 2006/07/08 15:04:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.eclipse;

import java.util.HashMap;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.eclipse.genxml.GenerateMappingAction;
import org.eclipse.emf.teneo.hibernate.HbConstants;
import org.eclipse.emf.teneo.hibernate.mapper.GenerateHBM;

/**
 * Eclipse popup action to generate a hibernate file based on ecore files.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class GenerateHBMAction extends GenerateMappingAction {
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		final HashMap options = new HashMap();
		options.put(PersistenceOptions.INHERITANCE_MAPPING, InheritanceType.JOINED_LITERAL.getName());
		super.run(action, HbConstants.HBM_FILE_NAME, "Generate Hibernate mapping file", options, GenerateHBM.class.getName());
	}
}