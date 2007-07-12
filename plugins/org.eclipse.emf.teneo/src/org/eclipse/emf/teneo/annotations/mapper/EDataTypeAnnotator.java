/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
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
 * $Id: EDataTypeAnnotator.java,v 1.2 2007/07/12 18:05:46 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.extension.ExtensionPoint;

/**
 * Annotates an EDataType, does nothing in this implementation.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class EDataTypeAnnotator extends AbstractAnnotator implements ExtensionPoint {

	// The logger
	protected static final Log log = LogFactory.getLog(EDataTypeAnnotator.class);

	/** Annotate it */
	public void annotate(PAnnotatedEDataType aDataType) {
	}
}
