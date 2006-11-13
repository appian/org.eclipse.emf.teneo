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
 * $Id: AbstractPropertyMapper.java,v 1.3 2006/11/13 14:53:00 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.EnumType;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Base class for basic, enum, id etc. mappers. Mainly provides convenience methods.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class AbstractPropertyMapper extends AbstractMapper {

	/**
	 * @param hbmContext
	 */
	public AbstractPropertyMapper(MappingContext hbmContext) {
		super(hbmContext);
	}

	/** Returns the correct enum primitive hibernate type, for Elver this is a hibernate user type. */
	public String getEnumUserType(Enumerated enumerated) {
		if (EnumType.STRING == enumerated.getValue().getValue()) {
			return getHbmContext().getEnumUserType();
		} else {
			return getHbmContext().getEnumIntegerUserType();
		}
	}

	/** Returns the correct enum primitive hibernate type, for Elver this is a hibernate user type. */
	protected String hbDynamicEnumType(Enumerated enumerated) {
		if (EnumType.STRING == enumerated.getValue().getValue()) {
			return getHbmContext().getDynamicEnumUserType();
		} else {
			return getHbmContext().getDynamicEnumIntegerUserType();
		}
	}
}
