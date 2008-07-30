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


import org.eclipse.emf.teneo.eclipselink.examples.library.impl.WriterImpl;
import org.eclipse.persistence.config.DescriptorCustomizer;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.indirection.IndirectList;
import org.eclipse.persistence.mappings.ManyToManyMapping;

public class PublisherCustomizer implements DescriptorCustomizer {

	/**
	 * <many-to-many name="writers"></many-to-many>
	 */
	public void customize(ClassDescriptor descriptor) throws Exception {
		ManyToManyMapping writersMapping = new ManyToManyMapping();
		writersMapping.setAttributeName("writers");
		writersMapping.setCascadeAll(true);
		writersMapping.setReferenceClass(WriterImpl.class);
		writersMapping.useTransparentCollection();
		writersMapping.useCollectionClass(IndirectList.class);
		writersMapping.setRelationTableName("EMFLIB_WRITER_PUBLISHER");
		writersMapping.addSourceRelationKeyFieldName("EMFLIB_WRITER_PUBLISHER.PUBLISHER_ID", "EMFLIB_PUBLISHER.ID");
		writersMapping.addTargetRelationKeyFieldName("EMFLIB_WRITER_PUBLISHER.WRITER_ID", "EMFLIB_WRITER.ID");
		descriptor.addMapping(writersMapping);
	}

}
