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
 * $Id: MappingException.java,v 1.1 2006/11/01 16:18:42 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;

/**
 * Exception used to signal errors in mapping TODO is there an elver hierarchy of exceptions? MT: no there is no real
 * hierarchy, I tend to use have one general exception which always logs the exception
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class MappingException extends RuntimeException {

	/** Logger */
	private static final Log log = LogFactory.getLog(MappingException.class);

	public MappingException(String msg) {
		super(msg);
		log.error("EXCEPTION: " + msg + " CAUSE ");
	}

	/** Constructor */
	public MappingException(String msg, PAnnotatedEModelElement paElement) {
		super(msg + ", " + paElement);
		log.error("EXCEPTION: " + msg + " element " + paElement.getAnnotatedElement().getName());
	}

	public MappingException(String msg, Exception cause) {
		super(msg, cause);
		log.error("EXCEPTION: " + msg + " CAUSE " + cause.getClass().getName());
	}

	public MappingException(String msg, PAnnotation pAnnotation) {
		super(msg + ", " + pAnnotation);
		log.error("EXCEPTION: " + msg + " element " + pAnnotation.eClass().getName() + " "
				+ (pAnnotation.getEModelElement() != null ? pAnnotation.getEModelElement().eClass().getName() : ""));
	}
}
