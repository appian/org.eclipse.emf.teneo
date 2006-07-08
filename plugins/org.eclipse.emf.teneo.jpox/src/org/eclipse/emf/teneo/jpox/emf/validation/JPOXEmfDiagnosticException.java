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
 * $Id: JPOXEmfDiagnosticException.java,v 1.1 2006/07/08 22:04:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.emf.validation;

import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.Diagnostic;

/**
 * Is thrown when an EObject is invalid according to its model. The emf diagnostic can be retrieved by getDiagnostic.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/08 22:04:29 $
 */

public class JPOXEmfDiagnosticException extends RuntimeException {
	/**
	 * Serializable id
	 */
	private static final long serialVersionUID = 7433341056815136417L;

	/** The logger for all these exceptions */
	private static Log log = LogFactory.getLog(JPOXEmfDiagnosticException.class);

	/** Sends the output of the diagnostic as debug to the logger */
	public static void logDiagnostic(Diagnostic diag) {
		if (diag.getSeverity() == Diagnostic.OK || diag.getSeverity() == Diagnostic.INFO) {
			return; // don't log these
		}

		if (log.isDebugEnabled()) {
			log.debug("Diagnostic for saving EObject");
			logDiags("", diag);
		}
	}

	/** Log a diagnostic, is called recursively also for child diagnostics */
	private static void logDiags(String prefix, Diagnostic diag) {
		log.debug(prefix + "SOURCE: " + diag.getSource());
		switch (diag.getSeverity()) {
		case Diagnostic.CANCEL:
			log.debug(prefix + "SEVERITY: CANCEL");
			break;
		case Diagnostic.ERROR:
			log.debug(prefix + "SEVERITY: ERROR");
			break;
		case Diagnostic.INFO:
			log.debug(prefix + "SEVERITY: INFO");
			break;
		case Diagnostic.WARNING:
			log.debug(prefix + "SEVERITY: WARNING");
			break;
		}
		log.debug(prefix + "MSG: " + diag.getMessage());
		for (Iterator i = diag.getChildren().iterator(); i.hasNext();) {
			logDiags(prefix + ">", (Diagnostic) i.next());
		}
	}

	/** The diagnostic which is the cause of this error */
	private final Diagnostic diagnostic;

	/**
	 * The constructor, logs the exception also
	 */
	public JPOXEmfDiagnosticException(Diagnostic diag) {
		super(diag.getMessage());
		diagnostic = diag;
		logDiagnostic(diag);
	}

	/** Getter for diagnostic */
	public Diagnostic getDiagnostic() {
		return diagnostic;
	}
}
