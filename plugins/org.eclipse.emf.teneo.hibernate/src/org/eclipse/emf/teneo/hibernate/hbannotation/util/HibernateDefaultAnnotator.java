/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Douglas Bitting
 * </copyright>
 *
 * $Id: HibernateDefaultAnnotator.java,v 1.2 2006/08/31 22:47:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEAttribute;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.mapper.DefaultAnnotator;

/**
 * This class simply understands not to create a OneToMany annotation when a CollectionOfElements
 * annotation is present
 */
public class HibernateDefaultAnnotator extends DefaultAnnotator {

	protected void processOneToManyAttribute(PAnnotatedEAttribute aAttribute, boolean forceNullable) {
		boolean isCollectionOfElements = 
			(aAttribute instanceof HbAnnotatedEAttribute
					&& null != ((HbAnnotatedEAttribute) aAttribute).getHbCollectionOfElements());

		if (isCollectionOfElements) {
			CollectionOfElements coe = ((HbAnnotatedEAttribute) aAttribute).getHbCollectionOfElements();
			if (coe.getTargetElement() == null) {
				coe.setTargetElement(getTargetTypeName(aAttribute.getAnnotatedEAttribute()));
			}
		} else {
			super.processOneToManyAttribute(aAttribute, forceNullable);
		}		
	}

	protected void processOneToManyReference(PAnnotatedEReference aReference, boolean forceOptional) {
		boolean isCollectionOfElements = 
			(aReference instanceof HbAnnotatedEReference
					&& null != ((HbAnnotatedEReference) aReference).getHbCollectionOfElements());
		if (!isCollectionOfElements) {
			super.processOneToManyReference(aReference, forceOptional);
		}
	}

    protected void setFacets(PAnnotatedEStructuralFeature aFeature) {
        super.setFacets(aFeature);
        
        HbAnnotatedEStructuralFeature hbFeature = (HbAnnotatedEStructuralFeature) aFeature;
        // Force indexed to false if IdBag annotation is specified.
        if (hbFeature.getHbIdBag() != null) {
            hbFeature.getIndexed().setValue(false);
        }
    }
}
