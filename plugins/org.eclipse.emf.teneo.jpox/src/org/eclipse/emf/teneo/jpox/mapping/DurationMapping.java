/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: DurationMapping.java,v 1.2 2008/02/28 07:09:03 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapping;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import org.eclipse.emf.teneo.jpox.JpoxStoreException;
import org.jpox.ClassLoaderResolver;
import org.jpox.store.mapping.ObjectAsStringMapping;

/**
 * Implements custom mapping for javax.xml.datatype.Duration.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2008/02/28 07:09:03 $
 */

public class DurationMapping extends ObjectAsStringMapping {

	private final Duration SAMPLE;
	private final DatatypeFactory dtf;

	public DurationMapping() {
		try {
			dtf = DatatypeFactory.newInstance();
			SAMPLE = dtf.newDurationYearMonth(true, 1, 1);
		} catch (Exception e) {
			throw new JpoxStoreException(e.getMessage(), e);
		}
	}

	@Override
	public Object getSampleValue(ClassLoaderResolver clr) {
		return SAMPLE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpox.store.mapping.ObjectAsStringMapping#getJavaType()
	 */
	@Override
	public Class<?> getJavaType() {
		return Duration.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpox.store.mapping.ObjectAsStringMapping#objectToString(java.lang.Object)
	 */
	@Override
	protected String objectToString(Object object) {
		return object.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpox.store.mapping.ObjectAsStringMapping#stringToObject(java.lang.String)
	 */
	@Override
	protected Object stringToObject(String str) {
		if (str == null) {
			return null;
		}
		return dtf.newDuration(str);
	}

}