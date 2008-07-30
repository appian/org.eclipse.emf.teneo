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
import org.eclipse.persistence.indirection.IndirectList;
import org.eclipse.persistence.mappings.OneToManyMapping;


public class LibraryCustomizer implements DescriptorCustomizer {

	/**
	 *  <one-to-many name="books" target-entity="StringToBookMapEntryImpl" mapped-by="eContainer"/>
	 *  <one-to-many name="writers" target-entity="WriterImpl" mapped-by="eContainer"/>
     */
	public void customize(ClassDescriptor descriptor) throws Exception {
		OneToManyMapping booksMapping = new OneToManyMapping();
		booksMapping.setAttributeName("books");
		booksMapping.setReferenceClass(org.eclipse.emf.teneo.eclipselink.examples.library.impl.StringToBookMapEntryImpl.class);
		booksMapping.setCascadeMerge(true);
		booksMapping.setCascadePersist(true);
		booksMapping.setCascadeRefresh(true);
		booksMapping.useTransparentCollection();
		booksMapping.useCollectionClass(IndirectList.class);
		booksMapping.addTargetForeignKeyFieldName("EMFLIB_LIBRARY_BOOK_MAP.LIBRARY_ID", "EMFLIB_LIBRARY.ID");
		descriptor.addMapping(booksMapping);
		
		OneToManyMapping writersMapping = new OneToManyMapping();
		writersMapping.setAttributeName("writers");
		writersMapping.setReferenceClass(org.eclipse.emf.teneo.eclipselink.examples.library.impl.WriterImpl.class);
		writersMapping.setCascadeMerge(true);
		writersMapping.setCascadePersist(true);
		writersMapping.setCascadeRefresh(true);
		writersMapping.useTransparentCollection();
		writersMapping.useCollectionClass(IndirectList.class);
		writersMapping.addTargetForeignKeyFieldName("EMFLIB_WRITER.ECONTAINER_ID", "EMFLIB_LIBRARY.ID");
		descriptor.addMapping(writersMapping);
	}

}
