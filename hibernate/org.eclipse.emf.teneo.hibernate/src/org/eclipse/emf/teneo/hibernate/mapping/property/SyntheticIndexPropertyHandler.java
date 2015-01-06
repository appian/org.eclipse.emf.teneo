/**
 * <copyright>
 *
 * Copyright (c) 2015 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: SyntheticPropertyHandler.java,v 1.5 2010/11/11 10:28:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.property;

import java.util.Iterator;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.mapping.Column;
import org.hibernate.mapping.Property;

/**
 * See {@link SyntheticIndexPropertyHandler}, extends but prevents returning a value in case of
 * first insert. This because hibernate will do this explicitly later.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
@SuppressWarnings("serial")
public class SyntheticIndexPropertyHandler extends SyntheticPropertyHandler {

	private Property property;

	private boolean optional = false;

	/** Constructor */
	public SyntheticIndexPropertyHandler(Property property) {
		super(property.getName());
		this.property = property;

		@SuppressWarnings("rawtypes")
		Iterator it = property.getColumnIterator();
		if (!it.hasNext()) {
			optional = property.isOptional();
		}

		while (it.hasNext()) {
			Column c = (Column) it.next();
			optional |= c.isNullable();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getForInsert(java.lang.Object, java.util.Map,
	 * org.hibernate.engine.SessionImplementor)
	 */
	@SuppressWarnings("rawtypes")
	public Object getForInsert(Object arg0, Map arg1, SessionImplementor arg2)
			throws HibernateException {
		if (optional) {
			return null;
		}
		return super.getForInsert(arg0, arg1, arg2);
	}
}