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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: ProcessingException.java,v 1.2 2006/07/04 21:56:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.processing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;

/**
 * Thrown during processing and generation of mappings.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class ProcessingException extends RuntimeException {

	/** Logger */
	private static final Log log = LogFactory.getLog(ProcessingException.class);

	/** Appends the toString of the paElement to the message */
	public ProcessingException(String msg, PAnnotatedEModelElement paElement) {
		super(msg + ", " + paElement);
		log.error("EXCEPTION: " + getMessage());
	}

	/** Constructor */
	public ProcessingException(String msg) {
		super(msg);
		log.error("EXCEPTION: " + getMessage());
	}

	/** Appends the toString of the paElement to the message */
	public ProcessingException(String msg, PAnnotation pAnnotation) {
		super(msg + ", " + pAnnotation);
		log.error("EXCEPTION: " + getMessage());
	}

}
