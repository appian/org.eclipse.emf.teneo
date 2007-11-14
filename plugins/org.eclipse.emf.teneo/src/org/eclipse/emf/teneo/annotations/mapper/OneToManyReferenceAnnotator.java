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
 * $Id: OneToManyReferenceAnnotator.java,v 1.4 2007/11/14 16:38:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.mapper;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.EnumType;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Annotates an ereference.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class OneToManyReferenceAnnotator extends BaseEFeatureAnnotator implements ExtensionPoint {

	// The logger
	protected static final Log log = LogFactory.getLog(OneToManyReferenceAnnotator.class);

	/** Annotate it */
	public void annotate(PAnnotatedEReference aReference) {
		final String logStr =
				aReference.getAnnotatedEReference().getName() + "/" +
						aReference.getAnnotatedEReference().getEContainingClass().getName();

		if (aReference.getManyToMany() != null || aReference.getOneToOne() != null || aReference.getManyToOne() != null) {
			throw new StoreMappingException("The feature/eclass " + logStr + " should be a OneToMany but " +
					"it already has a ManyToMany, OneToOne or ManyToOne annotation");
		}

		final EReference eReference = (EReference) aReference.getAnnotatedElement();
		OneToMany otm = aReference.getOneToMany();
		final boolean otmWasSet = otm != null; // otm was set manually
		if (otm == null) {
			log.debug("EReference + " + logStr + " does not have a onetomany annotation, adding one");
			otm = getFactory().createOneToMany();
			aReference.setOneToMany(otm);
			otm.setEModelElement(eReference);

			if (eReference.isContainment() && getPersistenceOptions().isFetchContainmentEagerly()) {
				otm.setFetch(FetchType.EAGER);
			}
		} else {
			log.debug("EReference + " + logStr + " has onetomany, check if defaults should be set");
		}

		if (otm.getMappedBy() == null && eReference.getEOpposite() != null) {
			otm.setMappedBy(eReference.getEOpposite().getName());
		}

		if (getPersistenceOptions().isMapEmbeddableAsEmbedded() &&
				aReference.getAReferenceType().getEmbeddable() != null) {
			aReference.setEmbedded(getFactory().createEmbedded());
		}

		if (getPersistenceOptions().isSetForeignKeyNames()) {
			aReference.setForeignKey(createFK(aReference));
		}

		if (eReference.isContainment() || getPersistenceOptions().isSetDefaultCascadeOnNonContainment()) {
			setCascade(otm.getCascade(), eReference.isContainment());
		}

		// handle a special case, an emap which is mapped as a real map and which has an
		// enumerate as the key
		// Disabled for now as the hibernate map-key does not support enumerates as the type
		// for the key when mapping as a true map
		if (false && StoreUtil.isMap(eReference) && getPersistenceOptions().isMapEMapAsTrueMap()) {
			final EStructuralFeature keyFeature = aReference.getEReferenceType().getEStructuralFeature("key");
			if (keyFeature instanceof EAttribute) {
				final EAttribute keyAttribute = (EAttribute) keyFeature;
				final PAnnotatedEAttribute aKeyAttribute = aReference.getPaModel().getPAnnotated(keyAttribute);
				if (keyAttribute.getEType() instanceof EEnum && aKeyAttribute.getEnumerated() == null) {
					final Enumerated enumerated = getFactory().createEnumerated();
					enumerated.setValue(EnumType.STRING);
					enumerated.setEModelElement(keyAttribute);
					aKeyAttribute.setEnumerated(enumerated);
				}
			}
		}

		// NOTE Sometimes EMF generated getters/setters have a
		// very generic type (EObject), if the type can be derived here then
		// this should
		// be added here
		if (otm.getTargetEntity() == null) {
			otm.setTargetEntity(getEntityName(eReference.getEReferenceType()));
		}

		// set unique and indexed
		if (!otmWasSet) {
			log.debug("Setting indexed and unique from ereference because otm was not set manually!");
			// note force a join table in case of idbag!
			otm.setIndexed(!getPersistenceOptions().alwaysMapListAsBag() &&
					!getPersistenceOptions().alwaysMapListAsIdBag() && eReference.isOrdered() &&
					aReference.getOrderBy() == null);
			// in case of containment it is always unique
			// in case optionidbag then ignore the unique attribute on the ereference
			otm.setUnique(eReference.isContainment() ||
					(!getPersistenceOptions().alwaysMapListAsIdBag() && eReference.isUnique()));

			if (aReference.getAnnotatedEReference().getEOpposite() != null) {
				log.debug("Setting unique because is bidirectional (has eopposite) otm");
				otm.setUnique(true);
			}
		} else if (aReference.getAnnotatedEReference().getEOpposite() != null) {
			log.warn("The EReference " + logStr +
					" is not unique (allows duplicates) but it is bi-directional, this is not logical");
		}

		// only use a jointable if the relation is non unique
		final boolean isEObject = EntityNameStrategy.EOBJECT_ECLASS_NAME.compareTo(otm.getTargetEntity()) == 0;
		// in case of eobject always a join table is required
		if (isEObject ||
				(getPersistenceOptions().isJoinTableForNonContainedAssociations() && !eReference.isContainment()) ||
				!otm.isUnique()) {
			JoinTable joinTable = aReference.getJoinTable();
			if (joinTable == null) {
				joinTable = getFactory().createJoinTable();
				aReference.setJoinTable(joinTable);
			}
			joinTable.setEModelElement(eReference);

			// see remark in manytomany about naming of jointables
			if (joinTable.getName() == null) {
				joinTable.setName(getSqlNameStrategy().getJoinTableName(aReference));
			}

			// note joincolumns in jointable can be generated automatically by
			// hib/jpox. need to explicitly do this in case of
			// composite id
			if (joinTable.getJoinColumns().size() == 0) {
				final List<String> names = getSqlNameStrategy().getJoinTableJoinColumns(aReference, false);
				joinTable.getJoinColumns().addAll(getJoinColumns(names, false, true, otm));
			}
			if (joinTable.getInverseJoinColumns().size() == 0 && aReference.getAReferenceType() != null) {
				final List<String> names = getSqlNameStrategy().getJoinTableJoinColumns(aReference, true);
				// todo: should the inverse join columns not be
				joinTable.getInverseJoinColumns().addAll(getJoinColumns(names, false, true, otm));
			}
		} else if (aReference.getJoinColumns() == null || aReference.getJoinColumns().isEmpty()) { // add
			final List<String> names = getSqlNameStrategy().getOneToManyEReferenceJoinColumns(aReference);
			aReference.getJoinColumns().addAll(getJoinColumns(names, aReference.getEmbedded() == null, true, otm));

			// In case of a bidirectional relation without a join table
			// do a special thing: if this is a list (with an index) then the association is always
			// managed from this side of the relation. This means that update/insert of the
			// joincolumns
			// on the other side is set to false.
			// See the hibernate manual: 6.3.3. Bidirectional associations with indexed collections
			if (otm.isList() && eReference.getEOpposite() != null) {
				final PAnnotatedEReference aOpposite = getAnnotatedModel().getPAnnotated(eReference.getEOpposite());
				if (aOpposite.getJoinColumns().size() > 0) {
					for (JoinColumn jc : aOpposite.getJoinColumns()) {
						jc.setInsertable(false);
						jc.setUpdatable(false);
					}
				}
			}
		}
	}
}
