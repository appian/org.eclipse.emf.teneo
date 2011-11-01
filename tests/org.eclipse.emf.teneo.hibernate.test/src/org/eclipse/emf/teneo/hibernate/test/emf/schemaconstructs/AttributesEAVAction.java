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
 * $Id: AttributesEAVAction.java,v 1.1 2009/08/22 00:18:34 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs;

import java.util.Properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.AttributesAction;

/**
 * Tests eav mapping
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class AttributesEAVAction extends AbstractActionTest {

	private static AttributesAction testAction = new AttributesAction() {

		@Override
		protected void checkIdIs(EObject o, String id) {
			// don't do anything as ID does not work in EAV
		}

		@Override
		public Properties getExtraConfigurationProperties() {
			final Properties props = new Properties();
			props.setProperty(PersistenceOptions.EAV_MAPPING, "true");
			return props;
		}
	};

	public AttributesEAVAction() {
		super(testAction);
	}
}
