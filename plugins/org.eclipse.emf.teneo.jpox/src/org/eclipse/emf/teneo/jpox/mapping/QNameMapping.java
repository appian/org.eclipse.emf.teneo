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
 * $Id: QNameMapping.java,v 1.2 2008/02/28 07:09:03 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapping;

import javax.xml.namespace.QName;

import org.eclipse.emf.teneo.jpox.JpoxStoreException;
import org.jpox.ClassLoaderResolver;
import org.jpox.store.mapping.ObjectAsStringMapping;

/**
 * Implements custom mapping for qname.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2008/02/28 07:09:03 $
 */

public class QNameMapping extends ObjectAsStringMapping {

	private static final QName SAMPLE = new QName("http://www.elver.org", "elver", "e");

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
	public Class getJavaType() {
		return QName.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpox.store.mapping.ObjectAsStringMapping#objectToString(java.lang.Object)
	 */
	@Override
	protected String objectToString(Object object) {
		final QName qName = (QName) object;
		return "{" + qName.getNamespaceURI() + "}" + qName.getPrefix() + ":" + qName.getLocalPart();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpox.store.mapping.ObjectAsStringMapping#stringToObject(java.lang.String)
	 */
	@Override
	protected Object stringToObject(String str) {
		if (str.indexOf("{") == -1) {
			throw new JpoxStoreException("String " + str + " can not be converted to a QName, missing starting {");
		}
		final int endIndexNS = str.indexOf("}");
		if (endIndexNS == -1) {
			throw new JpoxStoreException("String " + str +
					" can not be converted to a QName, missing end ns delimiter } ");
		}
		final int prefixIndex = str.indexOf(":", endIndexNS);
		if (prefixIndex == -1) {
			throw new JpoxStoreException("String " + str +
					" can not be converted to a QName, missing prefix delimiter :");
		}
		final String ns = str.substring(1, endIndexNS);
		final String prefix = str.substring(endIndexNS + 1, prefixIndex);
		final String localPart = str.substring(prefixIndex + 1);
		return new QName(ns, localPart, prefix);
	}

}