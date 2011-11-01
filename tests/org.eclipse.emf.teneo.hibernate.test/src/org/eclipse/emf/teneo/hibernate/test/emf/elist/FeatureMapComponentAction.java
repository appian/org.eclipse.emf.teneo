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
 * $Id: FeatureMapComponentAction.java,v 1.2 2010/04/03 09:21:01 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.elist;

import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;

/**
 * Tests featuremap with a FeatureMap component mapping.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class FeatureMapComponentAction extends FeatureMapAction {

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.FEATUREMAP_AS_COMPONENT, "true");
		return props;
	}

	protected boolean isComponentTest() {
		return true;
	}
}
