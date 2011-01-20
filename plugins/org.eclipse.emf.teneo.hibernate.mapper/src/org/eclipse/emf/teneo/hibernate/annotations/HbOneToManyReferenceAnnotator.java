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
 * $Id: HbOneToManyReferenceAnnotator.java,v 1.5 2011/01/20 17:12:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.annotations;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.mapper.OneToManyReferenceAnnotator;
import org.eclipse.emf.teneo.annotations.mapper.StoreMappingException;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.CascadeType;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.CacheConcurrencyStrategy;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cascade;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbCascadeType;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationFactory;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;

/**
 * Annotates an ereference.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */

public class HbOneToManyReferenceAnnotator extends OneToManyReferenceAnnotator {

	// The logger
	protected static final Log log = LogFactory
			.getLog(HbOneToManyReferenceAnnotator.class);
	private String defaultCacheStrategy = CacheConcurrencyStrategy.NONE
			.getName();

	/** Annotate it */
	@Override
	public void annotate(PAnnotatedEReference aReference) {
		boolean isCollectionOfElements = (aReference instanceof HbAnnotatedEReference && null != ((HbAnnotatedEReference) aReference)
				.getHbCollectionOfElements());

		HbAnnotatedEReference hbReference = (HbAnnotatedEReference) aReference;

		final OneToMany otm = aReference.getOneToMany();
		final boolean doHbCascade = otm == null || otm.getCascade().isEmpty();

		// add an idbag annotation
		if (getPersistenceOptions().alwaysMapListAsIdBag()
				&& aReference.getModelEReference().isMany()
				&& aReference.getOneToMany() == null
				&& !aReference.getModelEReference().isContainment()) {
			hbReference.setHbIdBag(HbannotationFactory.eINSTANCE.createIdBag());
			// add a join table
		}

		if (getPersistenceOptions().isAddIndexForForeignKey()) {
			HbAnnotationUtil.setIndex(aReference, this);
		}

		if (!isCollectionOfElements) {
			super.annotate(aReference);
		}

		// now handle the case of defaultCacheStrategy which is different than
		// none
		boolean hasCache = hbReference.getHbCache() != null;
		if (!hasCache
				&& defaultCacheStrategy
						.compareToIgnoreCase(CacheConcurrencyStrategy.NONE
								.getName()) != 0) {
			final CacheConcurrencyStrategy ccs = CacheConcurrencyStrategy
					.getByName(defaultCacheStrategy);
			if (ccs == null) {
				throw new StoreMappingException(
						"The default cache strategy: "
								+ defaultCacheStrategy
								+ " is not one of the allowed values (uppercase) "
								+ "as defined in the JPA Hibernate Annotation Extensions.");
			}

			log.debug("Setting cache strategy " + defaultCacheStrategy + " on "
					+ aReference.getModelEReference().getName());
			final Cache cache = HbannotationFactory.eINSTANCE.createCache();
			cache.setUsage(ccs);
			hbReference.setHbCache(cache);
		}

		if (doHbCascade && hbReference.getHbCascade() == null) {
			String option;
			if (aReference.getModelEReference().isContainment()) {
				option = getPersistenceOptions()
						.getCascadePolicyForContainment();
			} else if (getPersistenceOptions()
					.isSetCascadePolicyForNonContainment()) {
				option = getPersistenceOptions()
						.getCascadePolicyForNonContainment();
			} else {
				option = "PERSIST, MERGE, REFRESH";
			}

			final Cascade hbCascade = HbannotationFactory.eINSTANCE
					.createCascade();
			for (HbCascadeType hbCascadeValue : HbCascadeType.values()) {
				if (option.contains(hbCascadeValue.getName())) {
					hbCascade.getValue().add(hbCascadeValue);
				}
			}
			if (hbCascade.getValue().size() > 0) {
				hbReference.setHbCascade(hbCascade);
			}
		}
	}

	protected void setCascade(List<CascadeType> cascadeList,
			boolean isContainment) {
		if (!cascadeList.isEmpty()) {
			return;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.annotations.mapper.AbstractAnnotator#
	 * setPersistenceOptions(org.eclipse.emf.teneo.PersistenceOptions)
	 */
	@Override
	public void setPersistenceOptions(PersistenceOptions persistenceOptions) {
		super.setPersistenceOptions(persistenceOptions);
		defaultCacheStrategy = persistenceOptions.getDefaultCacheStrategy();
	}
}
