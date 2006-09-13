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
 * $Id: RemoveLifeCycleListener.java,v 1.1 2006/09/13 10:39:52 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.elist;

import java.util.Iterator;

import javax.jdo.listener.DeleteLifecycleListener;
import javax.jdo.listener.InstanceLifecycleEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

/**
 * Captures the remove life cycle listener to ensure load of featuremaps before a delete.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/09/13 10:39:52 $
 */

public class RemoveLifeCycleListener implements DeleteLifecycleListener {

	/** The logger */
	private static Log log = LogFactory.getLog(RemoveLifeCycleListener.class);

	/** Does nothing here */
	public void postDelete(InstanceLifecycleEvent arg0) {
		// TODO Auto-generated method stub
	}

	/** Checks if the source is an eobject and then for each featuremap feature ensures that 
	 * it is loaded to support cascading deletes 
	 */
	public void preDelete(InstanceLifecycleEvent arg0) {
		final Object source = arg0.getSource();
		if (source instanceof EObject) {
			final EObject eo = (EObject)source;
			final Iterator eas = eo.eClass().getEAllAttributes().iterator();
			while (eas.hasNext()) {
				final EAttribute ea = (EAttribute)eas.next();
				if (FeatureMapUtil.isFeatureMap(ea)) {
					final FeatureMap fm = (FeatureMap)eo.eGet(ea);
					if (fm instanceof FeatureMapWrapper) {
						if (!((FeatureMapWrapper)fm).isLoaded()) {
							log.debug("Loading unloaded featuremap before remove of parent");
							((FeatureMapWrapper)fm).doLoad();
						}
					}
				}
			}
		}
	}
}