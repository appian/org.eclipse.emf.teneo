/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
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
 * $Id: TeneoNewSQLNameStrategy.java,v 1.1 2009/10/02 07:23:23 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapping.strategy.impl;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.mapping.strategy.StrategyUtil;

/**
 * Mapping strategy which uses the EClass entity name.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class TeneoNewSQLNameStrategy extends TeneoSQLNameStrategy {

	// Returns the entityname of the refered to entity
	protected String getMappingName(PAnnotatedEClass aClass) {
		return StrategyUtil.getEntityName(getEntityNameStrategy(), persistenceOptions, aClass.getPaModel(), aClass
				.getModelEClass());
	}
}