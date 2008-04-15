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


import org.eclipse.emf.teneo.eclipselink.EmfSessionCustomizer;
import org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.internal.helper.DatabaseField;
import org.eclipse.persistence.mappings.CollectionMapping;
import org.eclipse.persistence.mappings.OneToManyMapping;
import org.eclipse.persistence.mappings.OneToOneMapping;
import org.eclipse.persistence.sessions.Session;


/**
 * @author shsmith
 *
 */
public class LibrarySessionCustomizer extends EmfSessionCustomizer {

	public LibrarySessionCustomizer() {
		super(LibraryPackage.eINSTANCE);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.eclipselink.EmfSessionCustomizer#establishEContainerMapping(org.eclipse.persistence.sessions.Session, org.eclipse.persistence.descriptors.ClassDescriptor)
	 */
	@Override
	protected void establishEContainerMapping(Session session, ClassDescriptor desc, CollectionMapping mapping) {
		if (mapping.isOneToManyMapping()) {
			OneToManyMapping oneToManyMapping = (OneToManyMapping) mapping;
			Class<?> containerClass = desc.getJavaClass();
			Class<?> containedClass = oneToManyMapping.getReferenceClass();
			ClassDescriptor containedClassDesc = session.getClassDescriptor(containedClass);

			DatabaseField targetKeyField = oneToManyMapping.getTargetForeignKeyFields().get(0);
	        DatabaseField sourceKeyField = oneToManyMapping.getSourceKeyFields().get(0);
			OneToOneMapping eContainerMapping = new OneToOneMapping();
			eContainerMapping.setAttributeName("eContainer");
			eContainerMapping.setReferenceClass(containerClass);
			// TODO indirection for OneToOne needs to be supported
			eContainerMapping.dontUseIndirection();
			eContainerMapping.addForeignKeyFieldName(
				targetKeyField.getQualifiedName(),
				sourceKeyField.getQualifiedName());
			containedClassDesc.addMapping(eContainerMapping);
System.out.println("Adding eContainer mapping from: " + containedClass + " to: " + containerClass );
		} else {
			throw new RuntimeException("eContainer relationship on supported for " + mapping.getClass().getName());
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.teneo.eclipselink.EmfSessionCustomizer#isContainmentRelationship(org.eclipse.persistence.descriptors.ClassDescriptor, org.eclipse.persistence.mappings.CollectionMapping)
	 */
	@Override
	protected boolean isContainmentRelationship(ClassDescriptor desc, CollectionMapping collectionMapping) {
//		Class owner = desc.getJavaClass();
//		if ((owner.equals(LibraryImpl.class)) && (collectionMapping.getReferenceClass().equals(WriterImpl.class))) {
//			return true;
//		}
		return false;

	}

	
	
	
}
