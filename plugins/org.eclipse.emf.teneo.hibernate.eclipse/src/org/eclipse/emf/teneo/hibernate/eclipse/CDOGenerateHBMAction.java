/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * GenerateHBMAction.java,v 1.2 2007/02/01 12:34:24 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.eclipse;

import java.util.HashMap;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.eclipse.genxml.GenerateMappingAction;
import org.eclipse.emf.teneo.hibernate.HbConstants;
import org.eclipse.emf.teneo.hibernate.cdo.CDOHelper;
import org.eclipse.emf.teneo.hibernate.mapper.GenerateHBM;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IActionDelegate;

/**
 * Eclipse popup action to generate a hibernate file based on ecore files.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class CDOGenerateHBMAction extends GenerateMappingAction {
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		final HashMap<String, String> options = new HashMap<String, String>();
		options.put(PersistenceOptions.INHERITANCE_MAPPING, InheritanceType.JOINED.getName());
		options.put(CDOHelper.GENERATE_FOR_CDO, CDOHelper.GENERATE_FOR_CDO);
		super.run(action, "cdo_" + HbConstants.HBM_FILE_NAME, Messages.getString("teneo.generate.hbm.cdo"), options,
				GenerateHBM.class.getName());
	}
}