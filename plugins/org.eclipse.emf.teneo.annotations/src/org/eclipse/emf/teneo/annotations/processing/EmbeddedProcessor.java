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
 * $Id: EmbeddedProcessor.java,v 1.2 2006/07/23 19:38:45 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.processing;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;

/**
 * Process Embedded properties.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public interface EmbeddedProcessor extends PAnnotatedProcessor {

	void processEmbedded(PAnnotatedEReference paReference);
}
