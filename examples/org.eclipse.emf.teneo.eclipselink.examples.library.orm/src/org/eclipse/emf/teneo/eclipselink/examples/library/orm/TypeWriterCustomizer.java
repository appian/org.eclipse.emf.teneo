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

import org.eclipse.persistence.config.DescriptorCustomizer;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.mappings.DirectToFieldMapping;
import org.eclipse.persistence.mappings.converters.Converter;


public class TypeWriterCustomizer implements DescriptorCustomizer {

	/**
	 * Add customizer to translate between Enum and value.
	 */
	public void customize(ClassDescriptor descriptor) throws Exception {
		DirectToFieldMapping typeMapping = (DirectToFieldMapping) descriptor.getMappingForAttributeName("type");
		Converter typeWriterEnumConverter = TypeWriterEnumConverter.getInstance();
		typeMapping.setConverter(typeWriterEnumConverter);
	}

}
