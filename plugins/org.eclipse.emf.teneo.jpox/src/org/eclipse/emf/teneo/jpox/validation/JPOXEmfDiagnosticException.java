/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * JPOXEmfDiagnosticException.java,v 1.2 2007/02/01 12:36:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.validation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.teneo.TeneoException;

/**
 * Is thrown when an EObject is invalid according to its model. The emf diagnostic can be retrieved
 * by getDiagnostic.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $ $Date: 2007/06/29 07:32:02 $
 */

public class JPOXEmfDiagnosticException extends TeneoException {
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
		for (Object element : diag.getChildren()) {
			logDiags(prefix + ">", (Diagnostic) element);
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
