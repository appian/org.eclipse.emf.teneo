/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: GenerateORMAction.java,v 1.2 2009/03/23 19:01:34 mtaal Exp $
 */

package org.eclipse.emf.teneo.orm.eclipse.popup.actions;

import java.util.HashMap;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.eclipse.genxml.GenerateMappingAction;
import org.eclipse.emf.teneo.jpa.GenerateORM;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IActionDelegate;

/**
 * Eclipse popup action to generate a orm file based on ecore files.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class GenerateORMAction extends GenerateMappingAction {
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		final HashMap<String, String> options = new HashMap<String, String>();
		options.put(PersistenceOptions.INHERITANCE_MAPPING,
				InheritanceType.JOINED.getName());
		super.run(action, "orm.xml", "Generate ORM mapping file", options,
				GenerateORM.class.getName());
	}
}