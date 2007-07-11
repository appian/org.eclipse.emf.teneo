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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PaModelAware.java,v 1.1 2007/07/11 14:41:05 mtaal Exp $
 */

package org.eclipse.emf.teneo.extension;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;

/**
 * A extension implementing this interface will be able to 'receive' an instance of a
 * PAnnotatedModel.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public interface PaModelAware {
	/** Set the relevant pamodel */
	void setPaModel(PAnnotatedModel paModel);
}