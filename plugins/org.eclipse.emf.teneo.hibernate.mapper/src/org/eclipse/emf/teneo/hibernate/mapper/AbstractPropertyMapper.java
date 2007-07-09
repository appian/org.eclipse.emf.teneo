/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal Davide Marchignoli
 * </copyright> $Id: AbstractPropertyMapper.java,v 1.7 2007/07/09 17:43:20 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

/**
 * Base class for basic, enum, id etc. mappers. Mainly provides convenience methods.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
public class AbstractPropertyMapper extends AbstractMapper {

	/**
	 * @param hbmContext
	 */
	public AbstractPropertyMapper(MappingContext hbmContext) {
		super(hbmContext);
	}
}
