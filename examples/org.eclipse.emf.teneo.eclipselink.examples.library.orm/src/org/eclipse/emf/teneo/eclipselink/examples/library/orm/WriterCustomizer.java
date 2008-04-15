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


import org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl;
import org.eclipse.emf.teneo.eclipselink.examples.library.impl.PublisherImpl;
import org.eclipse.emf.teneo.eclipselink.examples.library.impl.TypeWriterImpl;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.indirection.IndirectList;
import org.eclipse.persistence.internal.sessions.factories.DescriptorCustomizer;
import org.eclipse.persistence.mappings.ManyToManyMapping;
import org.eclipse.persistence.mappings.OneToManyMapping;

public class WriterCustomizer implements DescriptorCustomizer {

	public void customize(ClassDescriptor descriptor) throws Exception {
		
		// <one-to-many name="books" mapped-by="author"/>
		OneToManyMapping booksMapping = new OneToManyMapping();
		booksMapping.setAttributeName("books");
		booksMapping.setReferenceClass(BookImpl.class);
		booksMapping.setCascadeMerge(true);
		booksMapping.setCascadeRefresh(true);
		booksMapping.setCascadeRemove(false);
		booksMapping.setCascadePersist(true);
		
		booksMapping.useTransparentCollection();
		booksMapping.useCollectionClass(IndirectList.class);
		booksMapping.addTargetForeignKeyFieldName("EMFLIB_BOOK.AUTHOR_ID", "EMFLIB_WRITER.ID");
		descriptor.addMapping(booksMapping);
		
		// 	<many-to-many name="publishers"></many-to-many>
		ManyToManyMapping publishersMapping = new ManyToManyMapping();
		publishersMapping.setIsReadOnly(true); // writable by "owner", Publisher
		publishersMapping.setAttributeName("publishers");
		publishersMapping.setReferenceClass(PublisherImpl.class);
		publishersMapping.useTransparentCollection();
		publishersMapping.useCollectionClass(IndirectList.class);
		publishersMapping.setRelationTableName("EMFLIB_WRITER_PUBLISHER");
		publishersMapping.addSourceRelationKeyFieldName("EMFLIB_WRITER_PUBLISHER.WRITER_ID", "EMFLIB_WRITER.ID");
		publishersMapping.addTargetRelationKeyFieldName("EMFLIB_WRITER_PUBLISHER.PUBLISHER_ID", "EMFLIB_PUBLISHER.ID");
		descriptor.addMapping(publishersMapping);
		
		// 	<many-to-many name="typewriters"></many-to-many>
		ManyToManyMapping typewritersMapping = new ManyToManyMapping();
		typewritersMapping.setAttributeName("typewriters");
		typewritersMapping.setReferenceClass(TypeWriterImpl.class);
		typewritersMapping.useTransparentCollection();
		typewritersMapping.useCollectionClass(IndirectList.class);
		typewritersMapping.setCascadeAll(true);
		typewritersMapping.setRelationTableName("EMFLIB_WRITER_TYPEWRITER");
		typewritersMapping.addSourceRelationKeyFieldName("EMFLIB_WRITER_TYPEWRITER.WRITER_ID", "EMFLIB_WRITER.ID");
		typewritersMapping.addTargetRelationKeyFieldName("EMFLIB_WRITER_TYPEWRITER.TYPEWRITER_ID", "EMFLIB_TYPEWRITER.ID");
		descriptor.addMapping(typewritersMapping);

	}

}
