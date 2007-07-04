/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * GenerateHBMAction.java,v 1.2 2007/02/01 12:34:24 mtaal Exp $
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
 * @version $Revision: 1.4 $
 */

public class GenerateHBMAction extends GenerateMappingAction {
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		final HashMap<String, String> options = new HashMap<String, String>();
		options.put(PersistenceOptions.INHERITANCE_MAPPING, InheritanceType.JOINED.getName());
		super.run(action, HbConstants.HBM_FILE_NAME, "Generate Hibernate mapping file", options, GenerateHBM.class
			.getName());
	}
}