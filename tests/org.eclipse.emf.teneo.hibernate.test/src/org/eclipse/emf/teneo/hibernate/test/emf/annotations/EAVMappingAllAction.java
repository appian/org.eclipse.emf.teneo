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
 *   Martin Taal
 * </copyright>
 *
 * $Id: EAVMappingAllAction.java,v 1.3 2009/09/11 15:54:09 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.annotations;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;

/**
 * Tests EAVMapping but then again with everything EAV Mapped.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class EAVMappingAllAction extends EAVMappingAction {

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.EAV_MAPPING, "true");
		props.setProperty(PersistenceOptions.SET_PROXY, "true");
		props.setProperty(PersistenceOptions.ECONTAINER_CLASS_COLUMN, "econtainerclass");
		props.setProperty(PersistenceOptions.ECONTAINER_COLUMN, "econtainercol");
		props.setProperty(PersistenceOptions.ECONTAINER_FEATURE_NAME_COLUMN, "econtainerfn");
		return props;
	}
}
