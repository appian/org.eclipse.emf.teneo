/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.examples.library.orm;


import org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType;
import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.mappings.converters.Converter;
import org.eclipse.persistence.sessions.Session;


/*
 * TypeWriterEnumConverter is a singleton since it has no state.
 */
@SuppressWarnings("serial")
public class TypeWriterEnumConverter implements Converter {
	protected static TypeWriterEnumConverter instance = new TypeWriterEnumConverter();
	
	private TypeWriterEnumConverter() {}
	
	public static TypeWriterEnumConverter getInstance() {
		return instance;
	}

	public Object convertDataValueToObjectValue(Object data, Session session) {
		String typeName = (String)data;
		return TWriterType.get(typeName);
	}

	public Object convertObjectValueToDataValue(Object object, Session session) {
		TWriterType type = (TWriterType) object;
		if (type != null) {
			return type.getName();
		} else {
			return null;
		}
	}

	public void initialize(DatabaseMapping arg0, Session arg1) {}
	
	public boolean isMutable() {
		return false;
	}

	
}
