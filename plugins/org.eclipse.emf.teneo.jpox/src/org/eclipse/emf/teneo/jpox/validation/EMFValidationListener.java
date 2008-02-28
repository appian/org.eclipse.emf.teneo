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
 * $Id: EMFValidationListener.java,v 1.3 2008/02/28 07:09:04 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.validation;

import javax.jdo.listener.InstanceLifecycleEvent;
import javax.jdo.listener.StoreLifecycleListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;

/**
 * This life cycle listener validates emf objects just before they are stored in the datastore. If the object is invalid
 * then a JPOXEmfDiagnosticException is thrown.
 * 
 * @version $Revision: 1.3 $
 */
public class EMFValidationListener implements StoreLifecycleListener {
	/** The logger */
	private static Log log = LogFactory.getLog(EMFValidationListener.class);

	/** Poststore does nothing for validation, all validation is done before */
	public void postStore(InstanceLifecycleEvent event) {
		// do nothing
	}

	/**
	 * Prestore calls the Diagnostician.INSTANCE.validate(eObject). If the state is invalid then a series of exceptions
	 * is created. Note that
	 */
	public void preStore(InstanceLifecycleEvent event) {
		if (event.getSource() == null || !(event.getSource() instanceof EObject))
			return;

		if (log.isDebugEnabled()) {
			log.debug("Validating object of class: " + event.getSource().getClass().getName());
		}

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate((EObject) event.getSource());

		if (diagnostic.getSeverity() == Diagnostic.OK)
			return;
		if (diagnostic.getSeverity() == Diagnostic.INFO)
			return;

		// log the warnings but continue
		if (diagnostic.getSeverity() == Diagnostic.WARNING) {
			JPOXEmfDiagnosticException.logDiagnostic(diagnostic);
			return;
		}

		// else throw an error
		throw new JPOXEmfDiagnosticException(diagnostic);
	}
}