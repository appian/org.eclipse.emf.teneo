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
 * </copyright>
 * 
 * $Id: DefaultAnnotator.java,v 1.34 2007/03/20 15:53:17 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.mapper;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.StoreAnnotationsException;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.CascadeType;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue;
import org.eclipse.emf.teneo.annotations.pannotation.Entity;
import org.eclipse.emf.teneo.annotations.pannotation.EnumType;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.Inheritance;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToOne;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.annotations.pannotation.Temporal;
import org.eclipse.emf.teneo.annotations.pannotation.TemporalType;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;
import org.eclipse.emf.teneo.ecore.EClassNameStrategy;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.eclipse.emf.teneo.util.SQLCaseStrategy;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Adds default annotations to an existing pamodel. Default annotations are
 * added on the basis of the emf type information. It sets the default
 * annotations according to the ejb3 spec.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.34 $
 */
public class DefaultAnnotator {

	/** The source of the annotations of extended metadata used by emf */
	private static final String ANNOTATION_SOURCE_METADATA = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";

	/** The annotation source used to read additional facets */
	private static final String FACET_SOURCE_LIST = "http://facet.elver.org/List";

	/** Unique facet name */
	private static final String FACET_UNIQUE = "unique";

	/** Index facet name */
	private static final String FACET_INDEX = "indexed";

	/** The logger */
	protected static final Log log = LogFactory.getLog(DefaultAnnotator.class);

	/** Inheritance Mapping, with convenience bools, these values are default */
	private InheritanceType optionDefaultInheritanceMapping = InheritanceType.SINGLE_TABLE_LITERAL;

	/** Add entity if not present or only handle entied eclasses */
	private boolean optionAddEntityAnnotation = true;

	/** Determines if always a join table is used for non-contained relations */
	private boolean optionJoinTableForNonContainedAssociations = false;

	/** Determines the join table naming strategy */
	private String optionJoinTableNamingStrategy = null;

	/** Set orphan delete on containment */
	private boolean optionSetCascadeAllOnContainment = true;

	/** Force eager containment */
	private boolean optionFetchContainmentEagerly = false;

	/** Current Temporal */
	private TemporalType optionDefaultTemporal = null;

	/** The default id feature name */
	private String optionDefaultIDFeatureName = null;;

	/** Option maximum column length */
	private int optionMaximumSqlLength = -1;

	/** The sql naming strategy */
	private SQLCaseStrategy optionSQLCaseStrategy = null;

	/** The eclass qualify approach */
	private EClassNameStrategy optionEClassNameStrategy = null;

	/** Option ID feature as primary key */
	private boolean optionIDFeatureAsPrimaryKey = true;

	/** Option emap as real map */
	private boolean optionEMapAsTrueMap = true;

	/** Convenience link to pamodel factory */
	private PannotationFactory aFactory = PannotationFactory.eINSTANCE;

	/** The annotated model which is being processed */
	private PAnnotatedModel annotatedModel;

	/**
	 * The list of processed eclasses, is used to ensure that a superclass is
	 * done before a subclass
	 */
	private ArrayList<PAnnotatedEClass> processedAClasses = new ArrayList<PAnnotatedEClass>();

	// todo: enable this again
	// private HashMap entityNames;

	/**
	 * Adds default annotations to a pamodel, the method is synchronized because
	 * globals are set. Not necessary because this class should always be used
	 * single threaded but okay.
	 */
	public synchronized void map(PAnnotatedModel annotatedModel,
			PersistenceOptions po) {
		setLocalOptions(po);
		annotatedModel.setInitialized(true);
		this.annotatedModel = annotatedModel;
		// computeEntityNames();
		for (PAnnotatedEPackage pae : annotatedModel.getPaEPackages()) {
			processPackage(pae);
		}
	}

	/**
	 * compute name of each entity TODO: enable this again private void
	 * computeEntityNames() { entityNames = new HashMap(); for (Iterator pi =
	 * annotatedModel.getPaEPackages().iterator(); pi.hasNext(); ) { for
	 * (Iterator ci = ((PAnnotatedEPackage)
	 * pi.next()).getPaEClasses().iterator(); ci.hasNext();) { PAnnotatedEClass
	 * paClass = (PAnnotatedEClass) ci.next(); EClass aClass =
	 * paClass.getAnnotatedEClass(); if (paClass.getEntity() != null &&
	 * paClass.getEntity().getName() != null) { entityNames.put(aClass,
	 * paClass.getEntity().getName()); } else if (paClass.getEmbeddable() ==
	 * null && paClass.getMappedSuperclass() == null) { entityNames.put(aClass,
	 * aClass.getName()); } } } }
	 */

	/** Sets the options in a number of members */
	protected void setLocalOptions(PersistenceOptions po) {
		if (po.getInheritanceMapping() != null) {
			switch (InheritanceType.get(po.getInheritanceMapping()).getValue()) {
			case InheritanceType.JOINED:
				optionDefaultInheritanceMapping = InheritanceType.JOINED_LITERAL;
				log.debug("Option inheritance: joined");
				break;
			case InheritanceType.SINGLE_TABLE:
				optionDefaultInheritanceMapping = InheritanceType.SINGLE_TABLE_LITERAL;
				log.debug("Option inheritance: single");
				break;
			case InheritanceType.TABLE_PER_CLASS:
				optionDefaultInheritanceMapping = InheritanceType.TABLE_PER_CLASS_LITERAL;
				log.debug("Option inheritance: table per class");
				break;
			default:
				throw new IllegalArgumentException(
						"Inheritance mapping option: "
								+ po.getInheritanceMapping()
								+ " is not supported");
			}
		}
		log.debug("Option: Default inheritance setting: "
				+ optionDefaultInheritanceMapping.getName());

		optionAddEntityAnnotation = po.isSetEntityAutomatically();
		log.debug("Option: Automatically adding entity annotation: "
				+ optionAddEntityAnnotation);

		optionFetchContainmentEagerly = po.isFetchContainmentEagerly();
		log.debug("Option: Eagerly load all containment relations: "
				+ optionFetchContainmentEagerly);

		optionSetCascadeAllOnContainment = po.isSetCascadeAllOnContainment();
		log.debug("Option set cascade all on containment: "
				+ optionSetCascadeAllOnContainment);

		optionDefaultIDFeatureName = po.getDefaultIDFeatureName();
		log.debug("Option default id feature name: "
				+ optionDefaultIDFeatureName);

		optionEClassNameStrategy = po.getEClassNameStrategy();
		log.debug("Qualify EClass name option: "
				+ optionEClassNameStrategy.getClass().getName());

		optionIDFeatureAsPrimaryKey = po.isIDFeatureAsPrimaryKey();
		log.debug("ID Feature as primary key " + optionIDFeatureAsPrimaryKey);

		optionEMapAsTrueMap = po.isMapEMapAsTrueMap();
		log.debug("optionEMapAsTrueMap " + optionEMapAsTrueMap);
		
		optionMaximumSqlLength = po.getMaximumSqlNameLength();
		log.debug("Maximum column length: " + optionMaximumSqlLength);

		optionJoinTableForNonContainedAssociations = po
				.isJoinTableForNonContainedAssociations();
		log.debug("JoinTableForNonContainedAssociations "
				+ po.isJoinTableForNonContainedAssociations());

		optionSQLCaseStrategy = po.getSQLCaseStrategy();
		log.debug("SQLCaseStrategy "
				+ optionSQLCaseStrategy.getClass().getName());

		optionJoinTableNamingStrategy = po.getJoinTableNamingStrategy();
		log.debug("JoinTableNamingStrategy " + optionJoinTableNamingStrategy);

		optionDefaultTemporal = TemporalType.get(po.getDefaultTemporalValue());
		if (optionDefaultTemporal == null) {
			throw new IllegalArgumentException("Temporal value not found: "
					+ po.getDefaultTemporalValue());
		}

		if (optionJoinTableNamingStrategy == null
				|| optionJoinTableNamingStrategy.compareToIgnoreCase("ejb3") != 0
				&& optionJoinTableNamingStrategy.compareToIgnoreCase("unique") != 0) {
			throw new IllegalArgumentException(
					"JoinTable naming strategy option: "
							+ optionJoinTableNamingStrategy
							+ " is not supported");
		}
	}

	/** Maps one epackage */
	protected void processPackage(PAnnotatedEPackage aPackage) {
		log.debug(">>>> Adding default annotations for EPackage "
				+ aPackage.getAnnotatedElement().getName());

		log.debug("Processing EDataTypes");
		for (Iterator<PAnnotatedEDataType> it = aPackage.getPaEDataTypes()
				.iterator(); it.hasNext();) {
			processEDataType(it.next());
		}

		log.debug("Processing EClasses");
		for (Iterator<PAnnotatedEClass> it = aPackage.getPaEClasses()
				.iterator(); it.hasNext();) {
			processClass(it.next());
		}
	}

	/** Process an edatatype, does nothing in this impl. */
	protected void processEDataType(PAnnotatedEDataType ped) {
	}

	/** Returns the annotated version of an EClass */
	protected void processClass(PAnnotatedEClass aClass) {
		if (aClass == null) {
			throw new StoreAnnotationsException(
					"Mapping Exception, no Annotated Class for EClass, "
							+ "a common cause is that you did not register all EPackages in the DataStore/Helper Class. "
							+ "When there are references between EClasses in different EPackages then they need to be handled in one DataStore/Helper Class.");
		}
		log.debug(" Adding default annotations for EClass: "
				+ aClass.getAnnotatedElement().getName());

		// do not process the document root
		if (aClass.getAnnotatedEClass().getName().compareTo("DocumentRoot") == 0) {
			return;
		}

		// check if already processed
		if (processedAClasses.contains(aClass))
			return;

		// first do the superclasses
		for (EClass eclass : aClass.getAnnotatedEClass().getESuperTypes()) {
			final PAnnotatedEClass superAClass = aClass.getPaModel()
					.getPAnnotated(eclass);
			if (superAClass == null) {
				throw new StoreAnnotationsException(
						"Mapping Exception, no Annotated Class for EClass: "
								+ eclass.getName()
								+ " a common cause is that you did not register all EPackages in the DataStore/Helper Class. "
								+ "When there are references between EClasses in different EPackages then they need to be handled in one DataStore/Helper Class.");
			}
			processClass(superAClass);
		}

		final EClass eclass = (EClass) aClass.getAnnotatedElement();

		final String transientSource = "http://ejb.elver.org/Transient";
		if (aClass.getAnnotatedEClass().getEAnnotation(transientSource) != null) {
			log.debug("EClass " + aClass.getAnnotatedEClass().getName()
					+ " has transient annotation ");
			return;
		}

		if (!optionAddEntityAnnotation && aClass.getEntity() == null
				&& aClass.getEmbeddable() == null
				&& aClass.getMappedSuperclass() == null) {
			log
					.debug("Entities are not added automatically and this eclass: "
							+ aClass.getAnnotatedEClass().getName()
							+ " does not have an entity/embeddable/mappedsuperclass annotation.");
			// NOTE: should the aClass be removed from its pamodel?
			return;
		}

		processedAClasses.add(aClass);

		// TODO: should eclasses with interface=true be mapped, i.e. have entity
		// specified?

		// add entity or set entity name
		if (aClass.getEntity() == null && aClass.getEmbeddable() == null
				&& aClass.getMappedSuperclass() == null) {
			Entity entity = aFactory.createEntity();
			entity.setEModelElement(eclass);
			entity.setName(getEntityName(eclass));
			aClass.setEntity(entity);
		} else if (aClass.getEntity() != null
				&& aClass.getEntity().getName() == null) {
			aClass.getEntity().setName(getEntityName(eclass));
		}

		// get the inheritance from the supertype or use the global inheritance
		// setting
		// Note only an 'entitied' root gets an inheritance annotation. This is
		// according to the spec.
		final boolean isInheritanceRoot = isInheritanceRoot(aClass);
		final InheritanceType inheritanceType;
		if (aClass.getInheritance() != null) {
			inheritanceType = aClass.getInheritance().getStrategy();
		} else {
			// get the inheritance from the supers, if defined there
			final Inheritance inheritanceFromSupers = getInheritanceFromSupers(aClass);
			inheritanceType = inheritanceFromSupers != null ? inheritanceFromSupers.getStrategy() : 
				optionDefaultInheritanceMapping;
			// if this is the root then add a specific inheritance annotation
			if (isInheritanceRoot) {
				final Inheritance inheritance = aFactory.createInheritance();
				inheritance.setStrategy(inheritanceType);
				inheritance.setEModelElement(eclass);
				aClass.setInheritance(inheritance);
			}
		}

		// add PrimaryKeyJoinColumn
		if (!isInheritanceRoot
				&& inheritanceType.equals(InheritanceType.JOINED_LITERAL)) {
			ArrayList<String> idFeatures = new ArrayList<String>();
			boolean firstDone = false;
			EClass superClass = null;
			for (EClass eSuperClass : aClass.getAnnotatedEClass()
					.getESuperTypes()) {
				final PAnnotatedEClass aSuperClass = annotatedModel
						.getPAnnotated(eSuperClass);
				if (!firstDone) {
					superClass = eSuperClass;
				}
				final List<String> superList = getIDFeaturesNames(aSuperClass);
				idFeatures.removeAll(superList);
				idFeatures.addAll(superList);
				if (!idFeatures.isEmpty())
					break;
			}

			for (String idFeature : idFeatures) {
				final PrimaryKeyJoinColumn pkjc = aFactory
						.createPrimaryKeyJoinColumn();
				final String colName = superClass.getName() + "_" + idFeature;
				pkjc.setName(trunc(colName, true));
				aClass.getPrimaryKeyJoinColumns().add(pkjc);
			}
		}

		// add the table annotation or the name annotation of the table
		// only do this if this is the root in case of singletable or when this
		// is the joined table strategy
		if (aClass.getTable() == null
				&& ((isInheritanceRoot && inheritanceType
						.equals(InheritanceType.SINGLE_TABLE_LITERAL))
						|| inheritanceType
								.equals(InheritanceType.JOINED_LITERAL) || inheritanceType
						.equals(InheritanceType.TABLE_PER_CLASS_LITERAL))) {
			final Table table = aFactory.createTable();
			table.setEModelElement(eclass);

			table
					.setName(trunc(getEntityName(eclass).replace('.', '_'),
							false));
			aClass.setTable(table);
		} else if (aClass.getTable() != null
				&& aClass.getTable().getName() == null) {
			aClass.getTable().setName(trunc(getEntityName(eclass), false));
		}

		// if the strategy is all classes of one hierarchy in one table and this
		// is not the superclass
		// then all properties should be nullable
		// TODO when not all eclasses are entities then this computation is
		// incorrect, the isInheritanceRoot
		// should be the top most class in the hierarchy which is an entity
		final boolean forceOptional = !isInheritanceRoot
				&& inheritanceType.equals(InheritanceType.SINGLE_TABLE_LITERAL);

		// For hibernate as well as jpox the discriminator column is only
		// required for
		// single table, the ejb3 spec does not make a clear statement about the
		// requirement
		// to also have a discriminator column for joined
		if (isInheritanceRoot && aClass.getDiscriminatorColumn() == null
				&& inheritanceType.equals(InheritanceType.SINGLE_TABLE_LITERAL)) {
			// note defaults of primitive types are all defined in the model
			final DiscriminatorColumn dc = aFactory.createDiscriminatorColumn();
			dc.setEModelElement(eclass);
			aClass.setDiscriminatorColumn(dc);
		}

		// add a discriminator value
		if (aClass.getDiscriminatorValue() == null
				&& inheritanceType.equals(InheritanceType.SINGLE_TABLE_LITERAL)) {
			final DiscriminatorValue dv = aFactory.createDiscriminatorValue();
			dv.setValue(getEntityName(eclass));
			dv.setEModelElement(eclass);
			aClass.setDiscriminatorValue(dv);
		}

		for (PAnnotatedEStructuralFeature aStructuralFeature : aClass
				.getPaEStructuralFeatures()) {
			processEFeature(aStructuralFeature, forceOptional);
		}

		// Add default PkJoinColumns for SecondaryTables.
		for (SecondaryTable secondaryTable : aClass.getSecondaryTables()) {
			final EList<PrimaryKeyJoinColumn> pkJoinColumns = secondaryTable
					.getPkJoinColumns();
			if (pkJoinColumns.size() == 0) {
				// No PkJoinColumns configured for this secondary table, so
				// populate with defaults based on the ID
				// attributes of the primary table.
				final List<PAnnotatedEStructuralFeature> aIdFeatures = aClass
						.getPaIdFeatures();
				for (PAnnotatedEStructuralFeature idef : aIdFeatures) {
					final PrimaryKeyJoinColumn pkJoinColumn = PannotationFactory.eINSTANCE
							.createPrimaryKeyJoinColumn();
					pkJoinColumn.setName(trunc(idef
							.getAnnotatedEStructuralFeature().getName(), true));
					pkJoinColumns.add(pkJoinColumn);
				}
			}
		}
	}

	/** Process the features of the eclass */
	protected void processEFeature(
			PAnnotatedEStructuralFeature aStructuralFeature,
			boolean forceOptional) {
		EStructuralFeature eStructuralFeature = aStructuralFeature
				.getAnnotatedEStructuralFeature();

		boolean errorOccured = true;
		try {
			// a feature is transient if:
			// - transient is true and it is an eattribute or
			// - transient is true and it does not have an opposite
			// - transietn is true and it's opposite is not a containment
			// relation
			final boolean isTransient = eStructuralFeature.isTransient()
					&& (eStructuralFeature instanceof EAttribute
							|| ((EReference) eStructuralFeature).getEOpposite() == null
							|| !((EReference) eStructuralFeature)
									.getEOpposite().isContainment() || ((EReference) eStructuralFeature)
							.getEOpposite().isTransient());

			if (aStructuralFeature.getTransient() == null
					&& (eStructuralFeature.isVolatile() || isTransient)) {
				log
						.debug("Structural feature "
								+ eStructuralFeature.getName()
								+ " is transient, therefore adding transient annotation");
				final Transient trans = aFactory.createTransient();
				trans.setEModelElement(eStructuralFeature);
				aStructuralFeature.setTransient(trans);
				// note next statement will force continue
			}

			// do not do anything further for transients
			// process transients further because they can be part of a
			// featuremap, the specific mapper should
			// handle transient
			// Note that this means that transient features will still have
			// additional annotations such as basic etc.
			// if (aStructuralFeature.getTransient() != null) return;

			if (aStructuralFeature instanceof PAnnotatedEAttribute) {
				final PAnnotatedEAttribute aAttribute = (PAnnotatedEAttribute) aStructuralFeature;
				if (((PAnnotatedEAttribute) aStructuralFeature).getVersion() != null)
					return; // do not add more info

				final Class<?> instanceClass = eStructuralFeature.getEType()
						.getInstanceClass();
				boolean isMany = false;
				// instanceClass will be null for enums
				// Lob-annotated attributes must not be treated as one-to-many.
				// eattributes with a hibernate type annotations should not be
				// treated as a list
				final String typeSource = "http://annotations.hibernate.org/Type";
				if (instanceClass != null
						&& aAttribute.getLob() == null
						&& aAttribute.getAnnotatedEAttribute()
								.getEAttributeType().getEAnnotation(typeSource) == null) {
					isMany = eStructuralFeature.isMany()
							|| instanceClass.isArray()
							|| Collection.class.isAssignableFrom(instanceClass)
							|| Set.class.isAssignableFrom(instanceClass)
							|| List.class.isAssignableFrom(instanceClass);
					isMany = isMany
							&& !StoreUtil.isElementOfAGroup(eStructuralFeature);
				}

				if (isMany) {
					processOneToManyAttribute(aAttribute, forceOptional);
				} else {
					processSingleAttribute(aAttribute, forceOptional);
				}

				if (aAttribute.getColumn() != null
						&& aAttribute.getColumn().getName() == null) {
					aAttribute.getColumn().setName(
							trunc(
									aAttribute.getAnnotatedEAttribute()
											.getName(), true));
				}

			} else if (aStructuralFeature instanceof PAnnotatedEReference) {

				final PAnnotatedEReference aReference = (PAnnotatedEReference) aStructuralFeature;

				// detect the type of relation
				// note using the emf model it can not be checked if a relation
				// is a
				// uni-manytoone (2.1.8.3.2) or a uni onetoone (2.1.8.3.1)
				// neither can a uni-manytomany (2.1.8.5.2) be detected
				// because there is no eopposite. However this can be
				// specified manually, the system as a default will choose
				// uni-manytoone

				final EReference eReference = (EReference) aStructuralFeature
						.getAnnotatedElement();
				final EReference eOpposite = eReference.getEOpposite();

				// elements of a group are never multi-occurence because the
				// multi-occurence is
				// handled by the containing featuremap
				final boolean isMany = eReference.isMany()
						&& !StoreUtil.isElementOfAGroup(eReference);
				final boolean isOppositeMany = eOpposite != null
						&& eOpposite.isMany()
						&& !StoreUtil.isElementOfAGroup(eOpposite);

				final boolean mtmBidirectionalRelation = isMany
						&& eOpposite != null && isOppositeMany;
				final boolean mtmUnidirectionalRelation = isMany
						&& eOpposite == null
						&& aReference.getManyToMany() != null;
				final boolean otmBidirectionalRelation = isMany
						&& eOpposite != null && !isOppositeMany;
				final boolean otmUnidirectionalRelation = isMany
						&& eOpposite == null;

				// note as a default if the system has to choose between oto uni
				// or mto uni then it will
				// place a mto
				final boolean otoBidirectionalRelation = !isMany
						&& eOpposite != null && !isOppositeMany;
				final boolean otoUnidirectionalRelation = !isMany
						&& eOpposite == null
						&& (aReference.getOneToOne() != null || !aReference
								.getPrimaryKeyJoinColumns().isEmpty());
				final boolean mtoBidirectionalRelation = !isMany
						&& eOpposite != null && isOppositeMany;
				final boolean mtoUnidirectionalRelation = !isMany
						&& eOpposite == null && !otoUnidirectionalRelation;

				if (mtmBidirectionalRelation) {
					processBidirectionalManyToManyReference(aReference,
							forceOptional);
				} else if (mtmUnidirectionalRelation) {
					processUnidirectionalManyToManyReference(aReference,
							forceOptional);
				} else if (otmBidirectionalRelation
						|| otmUnidirectionalRelation) {
					processOneToManyReference(aReference, forceOptional);
				} else if (otoBidirectionalRelation
						|| otoUnidirectionalRelation) {
					processOneToOneReference(aReference, forceOptional);
				} else if (mtoBidirectionalRelation) {
					processManyToOneReference(aReference, forceOptional);
				} else if (mtoUnidirectionalRelation) {
					processManyToOneReference(aReference, forceOptional);
				}

				// handle column naming at this level
				if (aReference.getColumn() != null
						&& aReference.getColumn().getName() == null) {
					aReference.getColumn().setName(
							trunc(eReference.getName(), true));
				}

			} else {
				throw new IllegalArgumentException(
						"This type of StructuralFeature is not supported: "
								+ aStructuralFeature.getClass().getName());
			}
			errorOccured = false;
		} finally {

			// check that at least one ann was set
			if (aStructuralFeature instanceof PAnnotatedEAttribute) {
				PAnnotatedEAttribute pae = (PAnnotatedEAttribute) aStructuralFeature;
				assert (errorOccured || pae.getBasic() != null
						|| pae.getVersion() != null || pae.getId() != null
						|| pae.getTransient() != null || pae.getOneToMany() != null);
			} else {
				PAnnotatedEReference par = (PAnnotatedEReference) aStructuralFeature;
				assert (errorOccured || par.getTransient() != null
						|| par.getOneToMany() != null
						|| par.getManyToMany() != null
						|| par.getManyToOne() != null || par.getOneToOne() != null);
			}

		}
	}

	/** Add default annotation to aAttribute: these are id, basic and enum */
	protected void processSingleAttribute(PAnnotatedEAttribute aAttribute,
			boolean forceNullable) {

		log.debug(" Adding default annotations for EAttribute "
				+ aAttribute.getAnnotatedElement().getName());

		final EAttribute eAttribute = (EAttribute) aAttribute
				.getAnnotatedElement();

		// this is done before adding the id because an enumerated can also be
		// an id
		if (eAttribute.getEType() instanceof EEnum
				&& aAttribute.getEnumerated() == null) {
			final Enumerated enumerated = aFactory.createEnumerated();
			enumerated.setValue(EnumType.STRING_LITERAL);
			enumerated.setEModelElement(eAttribute);
			aAttribute.setEnumerated(enumerated);
		}

		if (optionIDFeatureAsPrimaryKey && eAttribute.isID()
				&& aAttribute.getId() == null) {
			final Id id = aFactory.createId();
			id.setEModelElement(eAttribute);
			aAttribute.setId(id);
			addColumnConstraints(aAttribute);
			return; // after id do not add basic
		} else if (aAttribute.getId() != null) {
			addColumnConstraints(aAttribute);
			return; // after id do not do basic
		}

		if (aAttribute.getTemporal() == null) {
			Class<?> clazz = eAttribute.getEAttributeType().getInstanceClass();
			// clazz is hidden somewhere
			if (clazz == null || Object.class.equals(clazz)) {
				ArrayList<EClassifier> eclassifiers = getItemTypes((EDataType) eAttribute
						.getEType());
				for (EClassifier eclassifier : eclassifiers) {
					if (eclassifier.getInstanceClass() != null) {
						clazz = eclassifier.getInstanceClass();
						break;
					}
				}
			}

			if (clazz != null && Date.class.isAssignableFrom(clazz)) {
				final Temporal temporal = aFactory.createTemporal();
				temporal.setValue(optionDefaultTemporal);
				aAttribute.setTemporal(temporal);
				temporal.setEModelElement(eAttribute);
			} else if (clazz != null && Calendar.class.isAssignableFrom(clazz)) {
				final Temporal temporal = aFactory.createTemporal();
				temporal.setValue(optionDefaultTemporal);
				aAttribute.setTemporal(temporal);
				temporal.setEModelElement(eAttribute);
			}
		}

		if (aAttribute.getBasic() == null) {
			// primitive defaults are set in the model itself
			final Basic basic = aFactory.createBasic();
			basic.setEModelElement(eAttribute);

			// NOTE: the ejb3 spec says that for primitivie optional does not
			// apply, this is
			// confusing why having this then? If this applies then for each
			// basic and nullable
			// field a column annotation has to be added to force nullability
			basic.setOptional(forceNullable || !eAttribute.isRequired()
					|| eAttribute.isUnsettable());
			aAttribute.setBasic(basic);
		}
		if (forceNullable) {
			aAttribute.getBasic().setOptional(true);
		}

		if (aAttribute.getId() != null) {
			aAttribute.getBasic().setOptional(false);
			if (aAttribute.getColumn() != null
					&& aAttribute.getColumn().isNullable()) {
				log
						.warn("The column of a primary key property is null, this will often result in database errors!");
			}
		}
		addColumnConstraints(aAttribute);
	}

	/** Adds the column level constraints on the basis of the xsd extended meta data */
	private void addColumnConstraints(PAnnotatedEAttribute aAttribute) {
		
		final EAttribute eAttribute = aAttribute.getAnnotatedEAttribute();
		
		// decide if a column annotation should be added, this is done 
		// when the maxLength or length, totalDigits or fractionDigits are set
		// and when no other column has been set
		if (aAttribute.getColumn() == null) {
			String maxLength = getExtendedMetaData(eAttribute, "maxLength");
			if (maxLength == null) {
				maxLength = getExtendedMetaData(eAttribute, "length");
			}
			final String totalDigits = getExtendedMetaData(eAttribute, "totalDigits");
			final String fractionDigits = getExtendedMetaData(eAttribute, "fractionDigits");
			if (maxLength != null || totalDigits != null || fractionDigits != null) {
				final Column column = aFactory.createColumn();
				// only support this for the string class, the length/maxlength is also 
				// used in case of the xsd list/union types but this can not be enforced using a constraint on the
				// columnlength
				if (maxLength != null && eAttribute.getEAttributeType().getInstanceClass() != null &&
						eAttribute.getEAttributeType().getInstanceClass() == String.class) { 
					column.setLength(Integer.parseInt(maxLength)); // you'll find parse errors!
				}
				if (totalDigits != null) {
					column.setPrecision(Integer.parseInt(totalDigits));
				}
				if (fractionDigits != null) {
					column.setScale(Integer.parseInt(fractionDigits));
				}
				aAttribute.setColumn(column);
			}
		}
	}
	
	/** Handles a many EAttribute which is a list of simple types */
	protected void processOneToManyAttribute(PAnnotatedEAttribute aAttribute,
			boolean forceNullable) {
		final String logStr = aAttribute.getAnnotatedEAttribute().getName()
				+ "/"
				+ aAttribute.getAnnotatedEAttribute().getEContainingClass()
						.getName();

		log.debug("EAttribute " + logStr + " needs a onetomany");

		final EAttribute eAttribute = (EAttribute) aAttribute
				.getAnnotatedElement();
		OneToMany otm = aAttribute.getOneToMany();
		final boolean otmWasSet = otm != null; // otm was set manually
		if (otm == null) {
			log.debug("One to many not present adding one");
			otm = aFactory.createOneToMany();
			aAttribute.setOneToMany(otm);
			otm.setEModelElement(eAttribute);

			if (optionFetchContainmentEagerly) {
				otm.setFetch(FetchType.EAGER_LITERAL);
			}
		} else {
			log
					.debug("One to many present adding default information if required");
		}

		// set cascade if not set
		if (otm.getCascade().isEmpty())
			otm.getCascade().add(CascadeType.ALL_LITERAL);

		if (otm.getTargetEntity() == null || otm.getTargetEntity() == null) {
			otm.setTargetEntity(getTargetTypeName(aAttribute));
		}

		if (aAttribute.getJoinTable() == null) {
			// note not optional because lists of simple types are embedded
			addJoinColumns(aAttribute.getPaEClass(), aAttribute
					.getAnnotatedEAttribute(), aAttribute, FeatureMapUtil
					.isFeatureMap(eAttribute), true); // with featuremap
			// optional is true
		}

		// set unique and indexed
		if (!otmWasSet) {
			log
					.debug("Setting indexed and unique on otm from eAttribute.isOrdered/isUnique because otm was not set manually");
			otm.setIndexed(eAttribute.isOrdered());
			otm.setUnique(eAttribute.isUnique());
			EAnnotation ean = aAttribute.getAnnotatedElement().getEAnnotation(
					FACET_SOURCE_LIST);
			if (ean != null && ean.getDetails() != null) {
				if (ean.getDetails().get(FACET_INDEX) != null) {
					log.warn("Setting indexed from deprecated annotation: "
							+ FACET_INDEX);
					otm.setIndexed(((String) ean.getDetails().get(FACET_INDEX))
							.compareToIgnoreCase("true") == 0);
				}
				if (ean.getDetails().get(FACET_UNIQUE) != null) {
					log.warn("Setting unique from deprecated annotation: "
							+ FACET_UNIQUE);
					otm.setUnique(((String) ean.getDetails().get(FACET_UNIQUE))
							.compareToIgnoreCase("true") == 0);
				}
			}

			ean = aAttribute.getAnnotatedElement().getEAnnotation(
					"http://annotation.elver.org/Indexed");
			if (ean != null && ean.getDetails() != null) {
				if (ean.getDetails().get("value") != null) {
					log
							.warn("Setting indexed from deprecated annotation: http://annotation.elver.org/Indexed");
					otm.setIndexed(((String) ean.getDetails().get("value"))
							.compareToIgnoreCase("true") == 0);
				}
			}
			ean = aAttribute.getAnnotatedElement().getEAnnotation(
					"http://annotation.elver.org/Unique");
			if (ean != null && ean.getDetails() != null) {
				if (ean.getDetails().get("value") != null) {
					log
							.warn("Setting indexed from deprecated annotation: http://annotation.elver.org/Unique");
					otm.setUnique(((String) ean.getDetails().get("value"))
							.compareToIgnoreCase("true") == 0);
				}
			}

		}
	}

	/** Returns the type name of a many attribute */
	protected String getTargetTypeName(PAnnotatedEAttribute aAttribute) {
		final EAttribute eAttribute = aAttribute.getAnnotatedEAttribute();
		// check on equality on object.class is used for listunion simpleunions
		final Class<?> instanceClass = eAttribute.getEAttributeType()
				.getInstanceClass();
		if (instanceClass != null && !Object.class.equals(instanceClass)
				&& !List.class.equals(instanceClass)) {
			if (instanceClass.isArray()) {
				// get rid of the [] at the end
				return eAttribute.getEType().getInstanceClassName()
						.substring(
								0,
								eAttribute.getEType().getInstanceClassName()
										.length() - 2);
			}
			return instanceClass.getName();
		} else {
			// the type is hidden somewhere deep get it
			// the edatatype is the java.util.list
			// it has an itemType which is the name of the element edatatype
			// which contains the instanceclass
			// takes also into account inheritance between datatypes
			// NOTE the otm.targetentity can consist of a comma delimited list
			// of target
			// entities this is required for listunion types but is not
			// according to the ejb3 spec!
			ArrayList<EClassifier> eclassifiers = getItemTypes((EDataType) eAttribute
					.getEType());
			if (eclassifiers.size() > 0) {
				StringBuffer result = new StringBuffer();
				for (int i = 0; i < eclassifiers.size(); i++) {
					final EClassifier eclassifier = (EClassifier) eclassifiers
							.get(i);
					if (i > 0)
						result.append(",");
					result.append(eclassifier.getInstanceClassName());
				}
				return result.toString();
			} else {
				return Object.class.getName();
			}
		}
	}

	/**
	 * Adds default annotations to a onetomany ereference, this method handles
	 * both the uni- and the bidirectional case
	 */
	protected void processOneToManyReference(PAnnotatedEReference aReference,
			boolean forceOptional) {
		final String logStr = aReference.getAnnotatedEReference().getName()
				+ "/"
				+ aReference.getAnnotatedEReference().getEContainingClass()
						.getName();

		if (aReference.getManyToMany() != null
				|| aReference.getOneToOne() != null
				|| aReference.getManyToOne() != null) {
			throw new StoreMappingException(
					"The feature/eclass "
							+ logStr
							+ " should be a OneToMany but "
							+ "it already has a ManyToMany, OneToOne or ManyToOne annotation");
		}

		final EReference eReference = (EReference) aReference
				.getAnnotatedElement();
		OneToMany otm = aReference.getOneToMany();
		final boolean otmWasSet = otm != null; // otm was set manually
		if (otm == null) {
			log.debug("EReference + " + logStr
					+ " does not have a onetomany annotation, adding one");
			otm = aFactory.createOneToMany();
			aReference.setOneToMany(otm);
			otm.setEModelElement(eReference);

			if (eReference.isContainment() && optionFetchContainmentEagerly) {
				otm.setFetch(FetchType.EAGER_LITERAL);
			}
		} else {
			log.debug("EReference + " + logStr
					+ " has onetomany, check if defaults should be set");
		}

		if (otm.getMappedBy() == null && eReference.getEOpposite() != null) {
			otm.setMappedBy(eReference.getEOpposite().getName());
		}
		setCascade(otm.getCascade(), eReference.isContainment());

		// NOTE Sometimes EMF generated getters/setters have a
		// very generic type (EObject), if the type can be derived here then
		// this should
		// be added here
		if (otm.getTargetEntity() == null) {
			otm.setTargetEntity(getEntityName(eReference.getEReferenceType()));
		}

		// set unique and indexed
		if (!otmWasSet) {
			log
					.debug("Setting indexed and unique from ereference because otm was not set manually!");
			otm.setIndexed(eReference.isOrdered() && aReference.getOrderBy() == null);
			otm.setUnique(eReference.isUnique());

			if (aReference.getAnnotatedEReference().getEOpposite() != null) {
				log
						.debug("Setting unique because is bidirectional (has eopposite) otm");
				otm.setUnique(true);
			}
		} else if (aReference.getAnnotatedEReference().getEOpposite() != null) {
			log
					.warn("The EReference "
							+ logStr
							+ " is not unique (allows duplicates) but it is bi-directional, this is not logical");
		}

		// only use a jointable if the relation is non unique
		final boolean isEObject = EClassNameStrategy.EOBJECT_ECLASS_NAME
				.compareTo(otm.getTargetEntity()) == 0;
		if (isEObject || // in case of eobject always a join table is
				// required
				(optionJoinTableForNonContainedAssociations && !eReference
						.isContainment()) || !otm.isUnique()) {
			JoinTable joinTable = aReference.getJoinTable();
			if (joinTable == null) {
				joinTable = aFactory.createJoinTable();
				aReference.setJoinTable(joinTable);
			}
			joinTable.setEModelElement(eReference);

			// see remark in manytomany about naming of jointables
			if (joinTable.getName() == null) {
				if (!isEObject
						&& optionJoinTableNamingStrategy
								.compareToIgnoreCase("ejb3") == 0) {
					final String jTableName = getEntityName(eReference
							.getEContainingClass())
							+ "_"
							+ getEntityName(eReference.getEReferenceType());
					joinTable.setName(trunc(jTableName, false));
				} else {
					AssertUtil
							.assertTrue("option optionJoinTableNamingStrategy "
									+ optionJoinTableNamingStrategy
									+ " not supported", isEObject
									|| optionJoinTableNamingStrategy
											.compareToIgnoreCase("unique") == 0);
					final String jTableName = getEntityName(eReference
							.getEContainingClass())
							+ "_" + eReference.getName();
					joinTable.setName(trunc(jTableName, false));
				}
			}

			// note joincolumns in jointable can be generated automatically by
			// hib/jpox.
		} else if (aReference.getJoinColumns() == null
				|| aReference.getJoinColumns().isEmpty()) { // add
			// joincolum(s)
			// the name of this eclass, the name of the property on the other
			// side
			if (aReference.getAnnotatedEReference().getEOpposite() != null) {
				// get opposite
				EReference opposite = aReference.getAnnotatedEReference()
						.getEOpposite();

				addJoinColumns(aReference.getPaModel().getPAnnotated(
						opposite.getEContainingClass()), opposite, aReference,
						aReference.getEmbedded() == null, true);
			} else { // no prop on the other side just use this one
				addJoinColumns(aReference.getPaEClass(), aReference
						.getAnnotatedEReference(), aReference, aReference
						.getEmbedded() == null, true);
			}
		}
	}

	/** Adds default annotations to a bidirectional many to many ereference */
	protected void processBidirectionalManyToManyReference(
			PAnnotatedEReference aReference, boolean forceOptional) {
		final String featureLogStr = aReference.getAnnotatedEReference()
				.getName()
				+ "/"
				+ aReference.getAnnotatedEReference().getEContainingClass()
						.getName();

		if (aReference.getOneToMany() != null
				|| aReference.getOneToOne() != null
				|| aReference.getManyToOne() != null) {
			throw new StoreMappingException(
					"The feature/eclass "
							+ featureLogStr
							+ " should be a ManyToMany but "
							+ "it already has a OneToMany, OneToOne or ManyToOne annotation");
		}

		final EReference eReference = (EReference) aReference
				.getAnnotatedElement();
		final EReference eOpposite = eReference.getEOpposite();
		assert (eOpposite != null && eOpposite.isMany());

		ManyToMany mtm = aReference.getManyToMany();
		final boolean mtmWasSet = mtm != null; // mtm was set manually
		if (mtm == null) {
			log.debug("Adding manytomany annotations to ereference: "
					+ featureLogStr);
			mtm = aFactory.createManyToMany();
			aReference.setManyToMany(mtm);
			mtm.setEModelElement(eReference);
		} else {
			log
					.debug("ManyToMany present check if default information should be added");
		}

		setCascade(mtm.getCascade(), eReference.isContainment());
		if (mtm.getTargetEntity() == null) {
			mtm.setTargetEntity(getEntityName(eReference.getEReferenceType()));
		}

		// determine where to place the jointable annotation and where to place
		// the mappedby
		// use a certain logic to determine as each is only set on one side
		// note that the join is always set on the other side of mapped by!
		// note that we can not do setJoinHere = !setMappedByHere because there
		// are situations
		// that even for mtm no mappedby is set on either side, nl. in case of
		// containment

		// also check if the other side has a (manual) manytomany with mappedby
		// set
		// bugzilla: 164808
		final PAnnotatedEReference otherPA = aReference.getPaModel()
				.getPAnnotated(eOpposite);
		if (mtm.getMappedBy() == null
				&& setMappedBy(eReference)
				&& (otherPA.getManyToMany() == null || otherPA.getManyToMany()
						.getMappedBy() == null)) {
			mtm.setMappedBy(eOpposite.getName());
		}

		JoinTable joinTable = aReference.getJoinTable();
		if (joinTable == null) {
			joinTable = aFactory.createJoinTable();
			aReference.setJoinTable(joinTable);
		}
		joinTable.setEModelElement(eReference);

		// set unique and indexed
		if (!mtmWasSet) {
			log
					.debug("Setting indexed and unique from ereference.isOrdered/isUnique because mtm was not set manually!");
			mtm.setIndexed(eReference.isOrdered());
		}

		EAnnotation ean = aReference.getAnnotatedElement().getEAnnotation(
				FACET_SOURCE_LIST);
		if (ean != null && ean.getDetails() != null) {
			if (ean.getDetails().get(FACET_INDEX) != null) {
				log.warn("Setting indexed from deprecated annotation: "
						+ FACET_INDEX);
				mtm.setIndexed(((String) ean.getDetails().get(FACET_INDEX))
						.compareTo("true") == 0);
			}
		}

		ean = aReference.getAnnotatedElement().getEAnnotation(
				"http://annotation.elver.org/Indexed");
		if (ean != null && ean.getDetails() != null) {
			if (ean.getDetails().get("value") != null) {
				log
						.warn("Setting indexed from deprecated annotation: http://annotation.elver.org/Indexed");
				mtm.setIndexed(((String) ean.getDetails().get("value"))
						.compareToIgnoreCase("true") == 0);
			}
		}

		// NOTE that the ejb3 spec states that the jointable should be the
		// concatenation of the
		// tablenames of the owning entities with an underscore, this will
		// quickly lead to nameclashes
		// in the case there is more than one relation between two classes. This
		// can be pretty likely
		// if the inheritance strategy is single_table.
		// now possibility to use a different naming strategy
		if (joinTable.getName() == null) {
			// In case the reference is not indexed then one join table can be
			// used for both sides
			// If indexed then separate join tables should be used.
			final String jTableName;
			if (optionJoinTableNamingStrategy.compareToIgnoreCase("ejb3") == 0) {
				if (mtm.isIndexed()) {
					jTableName = getEntityName(eReference.getEContainingClass())
							+ "_"
							+ getEntityName(eOpposite.getEContainingClass());
				} else {
					if (compareNames(eReference, eOpposite)) {
						jTableName = getEntityName(eOpposite
								.getEContainingClass())
								+ "_"
								+ getEntityName(eReference
										.getEContainingClass());
					} else {
						jTableName = getEntityName(eReference
								.getEContainingClass())
								+ "_"
								+ getEntityName(eOpposite.getEContainingClass());
					}
				}
			} else {
				AssertUtil.assertTrue("option optionJoinTableNamingStrategy "
						+ optionJoinTableNamingStrategy + " not supported",
						optionJoinTableNamingStrategy
								.compareToIgnoreCase("unique") == 0);
				if (mtm.isIndexed()) {
					jTableName = getEntityName(eReference.getEContainingClass())
							+ "_" + eReference.getName();
				} else {
					if (compareNames(eReference, eOpposite)) {
						jTableName = getEntityName(eOpposite
								.getEContainingClass())
								+ "_" + eOpposite.getName();
					} else {
						jTableName = getEntityName(eReference
								.getEContainingClass())
								+ "_" + eReference.getName();
					}
				}
			}

			joinTable.setName(trunc(jTableName, false));
		}
		if (/* joinTable.getJoinColumns() == null || */joinTable
				.getJoinColumns().size() == 0) { // no joincolumns,
			// so
			// add them
			// if (joinTable.getJoinColumns() == null)
			// joinTable.getJoinColumns().addAll(aFactory.createJoinColumns());
			joinTable.getJoinColumns().addAll(
					getJoinColumns(aReference.getPaEClass(), eReference, false,
							false, true));
		}
		if (/* joinTable.getInverseJoinColumns() == null || */joinTable
				.getInverseJoinColumns().size() == 0) { // no
			// inversejoincolumns,
			// so
			// add
			// them
			// if (joinTable.getInverseJoinColumns() == null)
			// joinTable.setInverseJoinColumns(aFactory.createJoinColumns());
			joinTable.getInverseJoinColumns().addAll(
					getJoinColumns(annotatedModel.getPAnnotated(eOpposite
							.getEContainingClass()), eOpposite, false, false,
							true));
		}
	}

	/** Adds default annotations to a unidirectional many to many ereference */
	protected void processUnidirectionalManyToManyReference(
			PAnnotatedEReference aReference, boolean forceOptional) {
		final String featureLogStr = aReference.getAnnotatedEReference()
				.getName()
				+ "/"
				+ aReference.getAnnotatedEReference().getEContainingClass()
						.getName();

		if (aReference.getOneToMany() != null
				|| aReference.getOneToOne() != null
				|| aReference.getManyToOne() != null) {
			throw new StoreMappingException(
					"The feature/eclass "
							+ featureLogStr
							+ " should be a ManyToMany but "
							+ "it already has a OneToMany, OneToOne or ManyToOne annotation");
		}

		final EReference eReference = (EReference) aReference
				.getAnnotatedElement();

		final ManyToMany mtm = aReference.getManyToMany();
		log
				.debug("ManyToMany present check if default information should be added");
		mtm.setEModelElement(eReference);

		setCascade(mtm.getCascade(), eReference.isContainment());

		if (mtm.getTargetEntity() == null) {
			mtm.setTargetEntity(getEntityName(eReference.getEReferenceType()));
		}

		// with a unidirectional mtm the join is always placed here
		JoinTable joinTable = aReference.getJoinTable();
		if (joinTable == null) {
			joinTable = aFactory.createJoinTable();
			aReference.setJoinTable(joinTable);
		}
		joinTable.setEModelElement(eReference);

		// note that here not the eclass name is used for the opposite side but
		// the name of the targetentity
		// because that's the one which is known here
		if (joinTable.getName() == null) {
			if (optionJoinTableNamingStrategy.compareToIgnoreCase("ejb3") == 0) {
				final String oppName = mtm.getTargetEntity();
				final String jTableName = getEntityName(eReference
						.getEContainingClass())
						+ "_" + oppName;
				joinTable.setName(trunc(jTableName, false));
			} else {
				AssertUtil.assertTrue("option optionJoinTableNamingStrategy "
						+ optionJoinTableNamingStrategy + " not supported",
						optionJoinTableNamingStrategy
								.compareToIgnoreCase("unique") == 0);
				final String jTableName = getEntityName(eReference
						.getEContainingClass())
						+ "_" + eReference.getName();
				joinTable.setName(trunc(jTableName, false));
			}
		}
		if (joinTable.getJoinColumns() == null) {
			joinTable.getJoinColumns().addAll(
					getJoinColumns(aReference.getPaEClass(), eReference,
							forceOptional, false, true));
		}
	}

	/** Adds default annotations for a one to one reference */
	protected void processOneToOneReference(PAnnotatedEReference aReference,
			boolean forceOptional) {
		final String logStr = aReference.getAnnotatedEReference().getName()
				+ "/"
				+ aReference.getAnnotatedEReference().getEContainingClass()
						.getName();

		if (aReference.getOneToMany() != null
				|| aReference.getManyToMany() != null
				|| aReference.getManyToOne() != null) {
			throw new StoreMappingException(
					"The feature/eclass "
							+ logStr
							+ " should be a OneToOne but "
							+ "it already has a OneToMany, ManyToMany or ManyToOne annotation");
		}

		final EReference eReference = (EReference) aReference
				.getAnnotatedElement();

		OneToOne oto = aReference.getOneToOne();
		if (oto == null) {
			log.debug("EReference + " + logStr
					+ " does not have a onetoone annotation, adding one");
			oto = aFactory.createOneToOne();
			aReference.setOneToOne(oto);
			oto.setOptional(forceOptional || !eReference.isRequired()
					|| eReference.isUnsettable());
			oto.setEModelElement(eReference);
		} else {
			log
					.debug("EReference + "
							+ logStr
							+ " has an onetoone annotation setting defaults if required");
		}
		if (forceOptional)
			oto.setOptional(true);

		// determine where to put the mapped-by
		if (oto.getMappedBy() == null && setMappedBy(eReference)) { // only
			// works
			// with
			// different
			// names
			oto.setMappedBy(eReference.getEOpposite().getName());
		}
		setCascade(oto.getCascade(), eReference.isContainment());

		// Note: Sometimes EMF generated getters/setters have a
		// very generic type (EObject), if the type can be derived here then
		// this should
		// be added here
		if (oto.getTargetEntity() == null) {
			oto.setTargetEntity(getEntityName(eReference.getEReferenceType()));
		}
	}

	/** Handles many to one for bidirectional and unidirectional cases */
	protected void processManyToOneReference(PAnnotatedEReference aReference,
			boolean forceOptional) {
		final String logStr = aReference.getAnnotatedEReference().getName()
				+ "/"
				+ aReference.getAnnotatedEReference().getEContainingClass()
						.getName();

		if (aReference.getOneToMany() != null
				|| aReference.getManyToMany() != null
				|| aReference.getOneToOne() != null) {
			throw new StoreMappingException(
					"The feature/eclass "
							+ logStr
							+ " should be a ManyToOne but "
							+ "it already has a OneToMany, ManyToMany or OneToOne annotation");
		}

		final EReference eReference = (EReference) aReference
				.getAnnotatedElement();

		ManyToOne mto = aReference.getManyToOne();
		if (mto == null) {
			log.debug("EReference + " + logStr
					+ " does not have a manytoone annotation, adding one");
			mto = aFactory.createManyToOne();
			aReference.setManyToOne(mto);
			mto.setOptional(forceOptional || !eReference.isRequired()
					|| eReference.isUnsettable()
					|| eReference.getEOpposite() != null);
			mto.setEModelElement(eReference);
		} else {
			log.debug("EReference + " + logStr
					+ " does have a manytoone annotation, using it");
			log
					.debug("Setting optional because of inheritance mapping, this is a subclass");
			if (forceOptional)
				mto.setOptional(forceOptional);
		}

		setCascade(mto.getCascade(), eReference.isContainment());

		// NOTE: Sometimes EMF generated getters/setters have a
		// very generic type (EObject), if the type can be derived here then
		// this should
		// be added here
		if (mto.getTargetEntity() == null) {
			mto.setTargetEntity(getEntityName(eReference.getEReferenceType()));
		}

		// create a set of joincolumns, note that if this is a two-way relation
		// then
		// the other side will use the name of the ereference as second
		// parameter,
		// matching the joincolumns on the other side
		if (aReference.getJoinColumns() == null
				|| aReference.getJoinColumns().isEmpty()) {
			// the name of the joincolumns is defined by the name of the other
			// entity and its primary key fields
			final PAnnotatedEClass aClass;
			if (eReference.getEOpposite() == null) {
				aClass = aReference.getPaModel().getPAnnotated(
						eReference.getEReferenceType());
			} else {
				aClass = aReference.getPaEClass();
			}
			if (aClass != null) { // aClass == null when the reference it to a
				// high level type such as EObject
				// note that the joincolumns are set to not insertable/updatable
				// if
				// this is a bidirectional relation without a join table, in
				// that case the other side
				// controls the columns
				addJoinColumns(aClass, aReference.getAnnotatedEReference(),
						aReference, mto.isOptional(),
						eReference.getEOpposite() == null
								&& aReference.getJoinTable() == null);
			}
		}
	}

	/** Creates a set of joincolumns for a reference to the annotated eclass */
	private void addJoinColumns(PAnnotatedEClass aClass,
			EStructuralFeature esf, PAnnotatedEStructuralFeature aFeature,
			boolean optional, boolean isUpdateInsertable) {
		aFeature.getJoinColumns()
				.addAll(
						getJoinColumns(aClass, esf, optional, true,
								isUpdateInsertable));
	}

	/** Return a list of join columns */
	private List<JoinColumn> getJoinColumns(PAnnotatedEClass aClass,
			EStructuralFeature esf, boolean optional, boolean doUseFeatureName,
			boolean isUpdateInsertable) {
		final List<JoinColumn> result = new ArrayList<JoinColumn>();
		final List<String> names = getIDFeaturesNames(aClass);

		boolean useFeatureName = doUseFeatureName;
		if (esf.getEType() == aClass.getAnnotatedEClass()) {
			useFeatureName = true;
		}

		for (String name : names) {
			JoinColumn jc = aFactory.createJoinColumn();
			final String jcName;
			if (useFeatureName) {
				jcName = aClass.getAnnotatedEClass().getName() + "_"
						+ esf.getName() + "_" + name;
			} else {
				jcName = aClass.getAnnotatedEClass().getName() + "_" + name;
			}
			jc.setName(trunc(jcName, true));
			jc.setNullable(optional);
			jc.setUpdatable(isUpdateInsertable);
			jc.setInsertable(isUpdateInsertable);
			result.add(jc);
		}
		return result;
	}

	/**
	 * Returns true if this is the root of the inheritancetree which is
	 * persisted
	 */
	private boolean isInheritanceRoot(PAnnotatedEClass aClass) {
		if (aClass.getMappedSuperclass() != null) {
			return false;
		}
		if (aClass.getTransient() != null) {
			return false;
		}
		for (Iterator<EClass> it = aClass.getAnnotatedEClass().getESuperTypes()
				.iterator(); it.hasNext();) {
			PAnnotatedEClass superAClass = aClass.getPaModel().getPAnnotated(
					it.next());
			if (superAClass != null
					&& superAClass.getMappedSuperclass() == null
					&& processedAClasses.contains(superAClass)) {
				return false;
			}

			// and go up one level, can be used to skip non-entities in the
			// structure
			if (isInheritanceRoot(superAClass)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns the inheritance of the passed annotated class or from one of its
	 * super annotated class
	 */
	private Inheritance getInheritanceFromSupers(PAnnotatedEClass childPA) {
		if (childPA.getInheritance() != null
				&& processedAClasses.contains(childPA))
			return childPA.getInheritance();
		final EClass eChild = childPA.getAnnotatedEClass();
		for (EClass eSuper : eChild.getESuperTypes()) {
			final PAnnotatedEClass pae = annotatedModel.getPAnnotated(eSuper);
			if (pae != null) {
				final Inheritance inheritance = getInheritanceFromSupers(pae);
				if (inheritance != null) {
					return inheritance;
				}
			}
		}
		return null;
	}

	/** Walks up a edatatype inheritance structure to find the itemType */
	private ArrayList<EClassifier> getItemTypes(EDataType eDataType) {
		final ArrayList<EClassifier> result = new ArrayList<EClassifier>();
		if (eDataType == null)
			return result;
		final String itemType = getEAnnotationValue(eDataType,
				ANNOTATION_SOURCE_METADATA, "itemType");
		if (itemType != null) {
			result.add(getEClassifier(eDataType.getEPackage(), itemType));
			return result;
		}

		final String memberTypes = getEAnnotationValue(eDataType,
				ANNOTATION_SOURCE_METADATA, "memberTypes");
		if (memberTypes != null) {
			String[] mtypes = memberTypes.split(" ");
			for (int i = 0; i < mtypes.length; i++) {
				EClassifier eclassifier = getEClassifier(eDataType
						.getEPackage(), mtypes[i]);
				result.addAll(getItemTypes((EDataType) eclassifier));
			}
			return result;
		}

		final String baseType = getEAnnotationValue(eDataType,
				ANNOTATION_SOURCE_METADATA, "baseType");
		if (baseType != null) {
			final ArrayList<EClassifier> tmpResult = getItemTypes((EDataType) getEClassifier(
					eDataType.getEPackage(), baseType));
			if (tmpResult.size() > 0) {
				result.addAll(tmpResult);
				return result;
			}
		}
		if (!Object.class.equals(eDataType.getInstanceClass())) {
			result.add(eDataType);
		}
		return result;
	}

	/**
	 * Returns the eclassifier using either the name of the eclassifier or the
	 * name element
	 */
	private EClassifier getEClassifier(EPackage epackage, String searchName) {
		for (EClassifier eclassifier : epackage.getEClassifiers()) {
			if (eclassifier.getName().compareTo(searchName) == 0)
				return eclassifier;
			String nameAnnotation = getEAnnotationValue(eclassifier,
					ANNOTATION_SOURCE_METADATA, "name");
			if (nameAnnotation != null
					&& searchName.compareTo(nameAnnotation) == 0) {
				return eclassifier;
			}
		}
		return null;
	}

	/**
	 * Checks if the cascade should be set in the cascade list, is only done if
	 * the list is empty
	 */
	private void setCascade(List<CascadeType> cascadeList, boolean isContainment) {
		if (!cascadeList.isEmpty())
			return;

		if (isContainment && !optionSetCascadeAllOnContainment) {
			cascadeList.add(CascadeType.REMOVE_LITERAL);
			cascadeList.add(CascadeType.MERGE_LITERAL);
			cascadeList.add(CascadeType.PERSIST_LITERAL);
			cascadeList.add(CascadeType.REFRESH_LITERAL);
		} else if (isContainment) {
			cascadeList.add(CascadeType.ALL_LITERAL);
		} else {
			cascadeList.add(CascadeType.MERGE_LITERAL);
			cascadeList.add(CascadeType.PERSIST_LITERAL);
			cascadeList.add(CascadeType.REFRESH_LITERAL);
		}
	}

	/** Determines if mapped by should be set */
	private boolean setMappedBy(EReference eReference) {
		// only set in two way relation
		// if has not been set on the other side (mappedtoFields)
		// if not a containment relation, containment relations are handled
		// differently
		// the other side may neither be containment
		final EReference eOpposite = eReference.getEOpposite();
		if (eOpposite == null)
			return false;
		return compareNames(eReference, eOpposite);
		// &&
		// !eReference.isContainment() && !eOpposite.isContainment();
	}

	/**
	 * Determines where to place a certain annotation/characteristic, this is
	 * done by comparing names..
	 */
	private boolean compareNames(EReference here, EReference there) {
		final String nameHere = here.eClass().getName() + here.getName();
		final String nameThere = there.eClass().getName() + there.getName();
		assert (nameHere.compareTo(nameThere) != 0);
		return nameHere.compareTo(nameThere) > 0;
	}

	/** Returns the entity name of the eclass */
	private String getEntityName(EClass eclass) {
		if (eclass == null) {
			throw new IllegalArgumentException(
					"Passed eclass is null."
							+ "This can occur if epackages which refer to eachother are placed in different ecore/xsd files "
							+ "and they are not read using one resource set. The reference from one epackage to another must be "
							+ "resolvable by EMF.");
		}

		
		// ok, here we figure out if it is an EMap. if so, we return the destination child name, not the keyToValueEntry wrapper
		final PAnnotatedEClass aclass = annotatedModel.getPAnnotated(eclass);
		if(optionEMapAsTrueMap && StoreUtil.isMapEntry(eclass)){
				// ok, it is an EMAp, get the annotaetd class of the child
			EStructuralFeature feature = eclass.getEStructuralFeature("value");
			if(feature instanceof EReference) {
				return optionEClassNameStrategy.toUniqueName(((EReference)feature).getEReferenceType());
			} else {
				return ((EAttribute)feature).getEType().getInstanceClassName();
			}
		}
		
		if (aclass != null && aclass.getEntity() != null
				&& aclass.getEntity().getName() != null) {
			return aclass.getEntity().getName();
		}
		return optionEClassNameStrategy.toUniqueName(eclass);
	}

	/** Get a specific extended metadate */
	private String getExtendedMetaData(EAttribute eAttribute, String key) {
		String value = getEAnnotationValue(eAttribute, "http:///org/eclipse/emf/ecore/util/ExtendedMetaData", key);
		if (value == null) {
			value = getEAnnotationValue(eAttribute.getEAttributeType(), "http:///org/eclipse/emf/ecore/util/ExtendedMetaData", key);
		}
		return value;
	}

	/** Returns the value of an annotation with a certain key */
	private String getEAnnotationValue(EModelElement eModelElement, String source,
			String key) {
		final EAnnotation eAnnotation = eModelElement.getEAnnotation(source);
		if (eAnnotation == null)
			return null;
		return (String) eAnnotation.getDetails().get(key);
	}

	/**
	 * Returns the list of names of id props of the eclass, walks the
	 * inheritance tree to find the id feature, if none is found then the
	 */
	private List<String> getIDFeaturesNames(PAnnotatedEClass aClass) {
		final List<String> list = getIDFeaturesNamesRecurse(aClass);
		// See, 172756
		if (list.isEmpty()) {
			list.add(optionDefaultIDFeatureName);
		}
		return list;
	}

	/** Internal will walk the inheritance tree to find the id feature */
	private List<String> getIDFeaturesNamesRecurse(PAnnotatedEClass aClass) {
		final ArrayList<String> list = new ArrayList<String>();
		for (EStructuralFeature feature : aClass.getAnnotatedEClass()
				.getEStructuralFeatures()) {
			final PAnnotatedEStructuralFeature aStructuralFeature = aClass
					.getPaModel().getPAnnotated(feature);
			if (aStructuralFeature instanceof PAnnotatedEAttribute) {
				final PAnnotatedEAttribute aAttribute = (PAnnotatedEAttribute) aStructuralFeature;
				final String attrName = aAttribute.getAnnotatedEAttribute()
						.getName();
				if (aAttribute.getId() != null && !list.contains(attrName)) {
					list.add(attrName);
				}
			}
		}

		if (list.isEmpty()
				&& aClass.getAnnotatedEClass().getESuperTypes().size() > 0) {
			for (EClass eClass : aClass.getAnnotatedEClass().getESuperTypes()) {
				final PAnnotatedEClass aSuperClass = annotatedModel
						.getPAnnotated(eClass);
				if (aSuperClass != null) {
					final List<String> superList = getIDFeaturesNamesRecurse(aSuperClass);
					list.removeAll(superList);
					list.addAll(superList);
				}
				if (!list.isEmpty()) {
					return list;
				}
			}
			if (!list.isEmpty()) {
				return list;
			}
			// fall through
		}
		return list;
	}

	/** Utilit method to truncate a column name */
	private String trunc(String truncName, boolean truncSuffix) {
		final String correctedName = truncName.replace('.', '_');

		if (optionMaximumSqlLength == -1)
			return optionSQLCaseStrategy.convert(correctedName);
		if (correctedName.length() < optionMaximumSqlLength)
			return optionSQLCaseStrategy.convert(correctedName);

		// truncate the part before the last _ because this is often the suffix
		final int underscore = correctedName.lastIndexOf('_');
		if (truncSuffix && underscore != -1 && underscore > 0) {
			final String usStr = correctedName.substring(underscore);
			if ((optionMaximumSqlLength - usStr.length()) < 0)
				return optionSQLCaseStrategy.convert(correctedName);
			return optionSQLCaseStrategy.convert(correctedName.substring(0,
					optionMaximumSqlLength - usStr.length())
					+ usStr);
		}

		return optionSQLCaseStrategy.convert(correctedName.substring(0,
				optionMaximumSqlLength));
	}
}