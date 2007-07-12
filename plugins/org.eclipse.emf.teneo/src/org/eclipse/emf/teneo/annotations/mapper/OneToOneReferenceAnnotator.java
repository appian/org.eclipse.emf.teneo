/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: OneToOneReferenceAnnotator.java,v 1.1 2007/07/12 12:55:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;

/**
 * Annotates an ereference.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class OneToOneReferenceAnnotator extends BaseEFeatureAnnotator {

	// The logger
	protected static final Log log = LogFactory.getLog(OneToOneReferenceAnnotator.class);

	/** Annotate it */
	public void annotate(PAnnotatedEReference aReference) {
		final String logStr =
				aReference.getAnnotatedEReference().getName() + "/" +
						aReference.getAnnotatedEReference().getEContainingClass().getName();

		if (aReference.getOneToMany() != null || aReference.getManyToMany() != null ||
				aReference.getManyToOne() != null) {
			throw new StoreMappingException("The feature/eclass " + logStr + " should be a OneToOne but " +
					"it already has a OneToMany, ManyToMany or ManyToOne annotation");
		}

		final EReference eReference = (EReference) aReference.getAnnotatedElement();

		OneToOne oto = aReference.getOneToOne();
		if (oto == null) {
			log.debug("EReference + " + logStr + " does not have a onetoone annotation, adding one");
			oto = getFactory().createOneToOne();
			aReference.setOneToOne(oto);
			oto.setOptional(!eReference.isRequired() || eReference.isUnsettable());
			oto.setEModelElement(eReference);
		} else {
			log.debug("EReference + " + logStr + " has an onetoone annotation setting defaults if required");
		}

		// determine where to put the mapped-by
		if (oto.getMappedBy() == null && setMappedBy(eReference)) { // only
			oto.setMappedBy(eReference.getEOpposite().getName());
		}
		setCascade(oto.getCascade(), eReference.isContainment());

		if (getPersistenceOptions().isSetForeignKeyNames()) {
			aReference.setForeignKey(createFK(aReference));
		}

		if (getPersistenceOptions().isMapEmbeddableAsEmbedded() &&
				aReference.getAReferenceType().getEmbeddable() != null) {
			aReference.setEmbedded(getFactory().createEmbedded());
		}

		// Note: Sometimes EMF generated getters/setters have a
		// very generic type (EObject), if the type can be derived here then
		// this should
		// be added here
		if (oto.getTargetEntity() == null) {
			oto.setTargetEntity(getEntityName(eReference.getEReferenceType()));
		}
	}
}
