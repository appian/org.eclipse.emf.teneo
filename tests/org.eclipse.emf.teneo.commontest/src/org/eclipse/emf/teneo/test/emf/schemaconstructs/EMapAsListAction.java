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
 * $Id: EMapAsListAction.java,v 1.3 2009/03/15 08:09:27 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.schemaconstructs;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;

/**
 * Tests support for emaps.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class EMapAsListAction extends EMapAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties
	 * ()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.EMAP_AS_TRUE_MAP, "false");
		return props;
	}

	@Override
	protected void checkEqual(Object o, List<?> l2) {
		final List<?> l1 = (List<?>) o;
		assertTrue(l1 != l2);
		assertTrue(l1.size() == l2.size());
		for (Object c : l1) {
			assertEquals(l1.indexOf(c), l2.indexOf(c));
		}
	}

}
