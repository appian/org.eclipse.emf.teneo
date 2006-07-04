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
 * $Id: BasicProcessor.java,v 1.2 2006/07/04 21:56:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.processing;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;

/**
 * Process a basic property.
 * 
 * <p>
 * One of the defined methods should be invoked for the property.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public interface BasicProcessor extends PAnnotatedProcessor {

	void processBasic(PAnnotatedEAttribute paAttribute);

	void processTemporal(PAnnotatedEAttribute paAttribute);

	void processLob(PAnnotatedEAttribute paAttribute);

	void processEnum(PAnnotatedEAttribute paAttribute);

	void processType(PAnnotatedEAttribute paAttribute);
}
