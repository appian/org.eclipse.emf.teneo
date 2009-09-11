/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
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
 * $Id: EAVTextValue.java,v 1.1 2009/09/11 22:52:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

/**
 * Holds a text value.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EAVTextValue {

	private long id;
	private int version;

	private String textValue;
	private EAVSingleEAttributeValueHolder valueHolder;

	public EAVSingleEAttributeValueHolder getValueHolder() {
		return valueHolder;
	}

	public void setValueHolder(EAVSingleEAttributeValueHolder valueHolder) {
		this.valueHolder = valueHolder;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getTextValue() {
		return textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}
}