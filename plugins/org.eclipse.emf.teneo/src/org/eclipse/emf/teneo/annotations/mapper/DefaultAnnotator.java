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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: DefaultAnnotator.java,v 1.8 2007/07/11 18:59:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.mapper;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
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
import org.eclipse.emf.teneo.ERuntime;
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
import org.eclipse.emf.teneo.annotations.pannotation.ForeignKey;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.GenerationType;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.Inheritance;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToOne;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.annotations.pannotation.Temporal;
import org.eclipse.emf.teneo.annotations.pannotation.TemporalType;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;
import org.eclipse.emf.teneo.ecore.EModelResolver;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManagerAware;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.StrategyUtil;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Adds default annotations to an existing pamodel. Default annotations are added on the basis of
 * the emf type information. It sets the default annotations according to the ejb3 spec.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public class DefaultAnnotator implements ExtensionPoint, ExtensionManagerAware {

	// The source of the annotations of extended metadata used by emf
	private static final String ANNOTATION_SOURCE_METADATA = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";

	// The logger
	protected static final Log log = LogFactory.getLog(DefaultAnnotator.class);

	// Several options, coming from persistenceOptions
	private InheritanceType optionDefaultInheritanceMapping = InheritanceType.SINGLE_TABLE;
	private SQLNameStrategy sqlNameStrategy = null;
	private TemporalType optionDefaultTemporal = null;
	private EntityNameStrategy entityNameStrategy = null;
	private boolean optionSetForeignKeyName = false;
	private boolean optionMapEmbeddableAsEmbedded = false;

	protected PersistenceOptions persistenceOptions;

	// the extension manager
	private ExtensionManager extensionManager;

	// Convenience link to pamodel factory
	private final PannotationFactory aFactory = PannotationFactory.eINSTANCE;

	// The annotated model which is being processed
	private PAnnotatedModel annotatedModel;

	// The list of processed eclasses, is used to ensure that a superclass is done before a subclass
	private final ArrayList<PAnnotatedEClass> processedAClasses = new ArrayList<PAnnotatedEClass>();

	/**
	 * Adds default annotations to a pamodel, the method is synchronized because globals are set.
	 * Not necessary because this class should always be used single threaded but okay.
	 */
	public synchronized void map(PAnnotatedModel annotatedModel, PersistenceOptions po) {

		persistenceOptions = po;

		// check if the emodelresolver has been set, if not then
		// use the ERuntime as the default
		try {
			if (EModelResolver.instance() == null) { // fails anyway but this
				// will not be optimised
				// away
				// set the eruntime as the default emodel resolver!
				ERuntime.setAsEModelResolver();
			}
		} catch (IllegalStateException e) {
			// not set, set the eruntime as the emodel resolver!
			ERuntime.setAsEModelResolver();
		}

		final List<PAnnotatedEPackage> apacks = annotatedModel.getPaEPackages();

		final EPackage[] epacks = new EPackage[apacks.size()];
		int cnt = 0;
		for (PAnnotatedEPackage apack : apacks) {
			epacks[cnt++] = apack.getAnnotatedEPackage();
		}

		log.debug("Registering epackages in model resolver, modelresolver instance is: " +
				EModelResolver.instance().getClass().getName());
		EModelResolver.instance().register(epacks);

		// if force fully classify typename then use the EModelResolver/ERuntime
		if (persistenceOptions.isAlsoMapAsClass()) {
			log.debug("Class names are to be fully classified, registering all the " + "epackages");
			// and now set the map as entity for each eclass
			for (PAnnotatedEPackage apack : annotatedModel.getPaEPackages()) {
				for (PAnnotatedEClass aclass : apack.getPaEClasses()) {
					aclass.setOnlyMapAsEntity(!EModelResolver.instance().hasImplementationClass(
						aclass.getAnnotatedEClass()));
				}
			}
		}

		annotatedModel.setInitialized(true);
		this.annotatedModel = annotatedModel;

		setLocalOptions(po);

		for (PAnnotatedEPackage pae : annotatedModel.getPaEPackages()) {
			processPackage(pae);
		}
	}

	/** Sets the options in a number of members */
	protected void setLocalOptions(PersistenceOptions po) {
		if (po.getInheritanceMapping() != null) {
			InheritanceType it = InheritanceType.get(po.getInheritanceMapping());
			if (it == InheritanceType.JOINED) {
				optionDefaultInheritanceMapping = InheritanceType.JOINED;
				log.debug("Option inheritance: joined");
			} else if (it == InheritanceType.SINGLE_TABLE) {
				optionDefaultInheritanceMapping = InheritanceType.SINGLE_TABLE;
				log.debug("Option inheritance: single");
			} else if (it == InheritanceType.TABLE_PER_CLASS) {
				optionDefaultInheritanceMapping = InheritanceType.TABLE_PER_CLASS;
				log.debug("Option inheritance: table per class");
			} else {
				throw new IllegalArgumentException("Inheritance mapping option: " + po.getInheritanceMapping() +
						" is not supported");
			}
		}
		optionDefaultTemporal = TemporalType.get(po.getDefaultTemporalValue());
		if (optionDefaultTemporal == null) {
			throw new IllegalArgumentException("Temporal value not found: " + po.getDefaultTemporalValue());
		}
		optionSetForeignKeyName = po.isSetForeignKeyNames();
		optionMapEmbeddableAsEmbedded = po.isMapEmbeddableAsEmbedded();
		entityNameStrategy = getExtensionManager().getExtension(EntityNameStrategy.class);
		entityNameStrategy.setPaModel(annotatedModel); // is maybe already set?
		sqlNameStrategy = getExtensionManager().getExtension(SQLNameStrategy.class);
		sqlNameStrategy.setPersistenceOptions(po);
	}

	/** Maps one epackage */
	protected void processPackage(PAnnotatedEPackage aPackage) {
		log.debug(">>>> Adding default annotations for EPackage " + aPackage.getAnnotatedElement().getName());

		log.debug("Processing EDataTypes");
		for (PAnnotatedEDataType annotatedEDataType : aPackage.getPaEDataTypes()) {
			processEDataType(annotatedEDataType);
		}

		log.debug("Processing EClasses");
		for (PAnnotatedEClass annotatedEClass : aPackage.getPaEClasses()) {
			processClass(annotatedEClass);
		}
	}

	/** Process an edatatype, does nothing in this impl. */
	protected void processEDataType(PAnnotatedEDataType ped) {
	}

	/** Returns the annotated version of an EClass */
	protected void processClass(PAnnotatedEClass aClass) {

		final EClass eclass = (EClass) aClass.getAnnotatedElement();

		// check if already processed
		if (processedAClasses.contains(aClass)) {
			return;
		}

		// do not process the document root
		if (eclass.getName().compareTo("DocumentRoot") == 0) {
			return;
		}

		log.debug("Creating mapping for eclass " + eclass.getName());

		if (aClass == null) {
			throw new StoreAnnotationsException(
				"Mapping Exception, no Annotated Class for EClass, "
						+ "a common cause is that you did not register all EPackages in the DataStore/Helper Class. "
						+ "When there are references between EClasses in different EPackages then they need to be handled in one DataStore/Helper Class.");
		}

		// first do the superclasses
		for (EClass superEclass : aClass.getAnnotatedEClass().getESuperTypes()) {
			final PAnnotatedEClass superAClass = aClass.getPaModel().getPAnnotated(superEclass);
			if (superAClass == null) {
				throw new StoreAnnotationsException(
					"Mapping Exception, no Annotated Class for EClass: " +
							superEclass.getName() +
							" a common cause is that you did not register all EPackages in the DataStore/Helper Class. " +
							"When there are references between EClasses in different EPackages then they need to be handled in one DataStore/Helper Class.");
			}
			if (!processedAClasses.contains(superAClass)) {
				processClass(superAClass);
			}
		}

		log.debug(" Adding default annotations for EClass: " + aClass.getAnnotatedElement().getName());

		processedAClasses.add(aClass);

		log.debug("Setting the superentity of the eclass");
		setSuperEntity(aClass);
		final boolean isInheritanceRoot =
				aClass.getPaSuperEntity() == null || aClass.getPaSuperEntity().getMappedSuperclass() != null; // last

		// A not mappable type will not get an entity annotation.
		// Even the features of non-mappable types are mapped because
		// the efeatures can be inherited through multiple inheritance
		final boolean mappable = isMappableAnnotatedClass(aClass);

		// add entity or set entity name
		if (mappable && aClass.getEntity() == null && aClass.getEmbeddable() == null) {
			Entity entity = aFactory.createEntity();
			entity.setEModelElement(eclass);
			aClass.setEntity(entity);
		}
		if (aClass.getEntity() != null && aClass.getEntity().getName() == null) {
			aClass.getEntity().setName(entityNameStrategy.toEntityName(eclass));
		}

		// get the inheritance from the supertype or use the global inheritance
		// setting
		// Note only an 'entitied' root gets an inheritance annotation. This is
		// according to the spec.
		final InheritanceType inheritanceType;
		if (aClass.getInheritance() != null) {
			inheritanceType = aClass.getInheritance().getStrategy();
		} else {
			// get the inheritance from the supers, if defined there
			final Inheritance inheritanceFromSupers = getInheritanceFromSupers(aClass);
			inheritanceType =
					inheritanceFromSupers != null ? inheritanceFromSupers.getStrategy()
							: optionDefaultInheritanceMapping;
			// if this is the root then add a specific inheritance annotation
			if (isInheritanceRoot) {
				final Inheritance inheritance = aFactory.createInheritance();
				inheritance.setStrategy(inheritanceType);
				inheritance.setEModelElement(eclass);
				aClass.setInheritance(inheritance);
			}
		}

		// add PrimaryKeyJoinColumn in case of a joined
		if (!isInheritanceRoot && inheritanceType.equals(InheritanceType.JOINED)) {
			ArrayList<String> idFeatures = new ArrayList<String>();
			PAnnotatedEClass aSuperClass = null;
			for (EClass eSuperClass : aClass.getAnnotatedEClass().getESuperTypes()) {
				aSuperClass = annotatedModel.getPAnnotated(eSuperClass);
				idFeatures.addAll(StrategyUtil.getIDFeaturesNames(aSuperClass, persistenceOptions
					.getDefaultIDFeatureName()));
				if (!idFeatures.isEmpty()) {
					break;
				}
			}

			for (String idFeature : idFeatures) {
				final PrimaryKeyJoinColumn pkjc = aFactory.createPrimaryKeyJoinColumn();
				pkjc.setName(sqlNameStrategy.getPrimaryKeyJoinColumnName(aSuperClass, idFeature));
				aClass.getPrimaryKeyJoinColumns().add(pkjc);
			}
		}

		// add the table annotation or the name annotation of the table
		// only do this if this is the root in case of singletable or when this
		// is the joined table strategy
		if (aClass.getTable() == null &&
				((isInheritanceRoot && inheritanceType.equals(InheritanceType.SINGLE_TABLE)) ||
						inheritanceType.equals(InheritanceType.JOINED) || inheritanceType
					.equals(InheritanceType.TABLE_PER_CLASS))) {
			final Table table = aFactory.createTable();
			table.setEModelElement(eclass);
			// name is set in next step
			aClass.setTable(table);
		}
		if (aClass.getTable() != null && aClass.getTable().getName() == null) {
			aClass.getTable().setName(sqlNameStrategy.getTableName(aClass));
		}

		// For hibernate as well as jpox the discriminator column is only
		// required for single table, the ejb3 spec does not make a clear
		// statement about the requirement to also have a discriminator column for joined
		if (isInheritanceRoot && aClass.getDiscriminatorColumn() == null &&
				inheritanceType.equals(InheritanceType.SINGLE_TABLE)) {
			// note defaults of primitive types are all defined in the model
			final DiscriminatorColumn dc = aFactory.createDiscriminatorColumn();
			dc.setEModelElement(eclass);
			dc.setName(sqlNameStrategy.getDiscriminatorColumnName());
			aClass.setDiscriminatorColumn(dc);
		}

		// add a discriminator value
		if (aClass.getDiscriminatorValue() == null && inheritanceType.equals(InheritanceType.SINGLE_TABLE)) {
			final DiscriminatorValue dv = aFactory.createDiscriminatorValue();
			dv.setValue(getEntityName(eclass));
			dv.setEModelElement(eclass);
			aClass.setDiscriminatorValue(dv);
		}

		for (PAnnotatedEStructuralFeature aStructuralFeature : aClass.getPaEStructuralFeatures()) {
			processEFeature(aStructuralFeature);
		}

		// Add default PkJoinColumns for SecondaryTables.
		for (SecondaryTable secondaryTable : aClass.getSecondaryTables()) {
			final EList<PrimaryKeyJoinColumn> pkJoinColumns = secondaryTable.getPkJoinColumns();
			if (pkJoinColumns.size() == 0) {
				// No PkJoinColumns configured for this secondary table, so
				// populate with defaults based on the ID
				// attributes of the primary table.
				final List<PAnnotatedEStructuralFeature> aIdFeatures = aClass.getPaIdFeatures();
				for (PAnnotatedEStructuralFeature idef : aIdFeatures) {
					final PrimaryKeyJoinColumn pkJoinColumn = PannotationFactory.eINSTANCE.createPrimaryKeyJoinColumn();
					pkJoinColumn.setName(sqlNameStrategy.getSecondaryTablePrimaryKeyJoinColumnName(idef));
					pkJoinColumns.add(pkJoinColumn);
				}
			}
		}
	}

	/** Process the features of the eclass */
	protected void processEFeature(PAnnotatedEStructuralFeature aStructuralFeature) {
		EStructuralFeature eStructuralFeature = aStructuralFeature.getAnnotatedEStructuralFeature();

		boolean errorOccured = true;
		try {
			// a feature is transient if:
			// - transient is true and it is an eattribute or
			// - transient is true and it does not have an opposite
			// - transietn is true and it's opposite is not a containment
			// relation
			// - it refers to an eclass which is transient
			boolean isTransient =
					eStructuralFeature.isTransient() &&
							(eStructuralFeature instanceof EAttribute ||
									((EReference) eStructuralFeature).getEOpposite() == null ||
									!((EReference) eStructuralFeature).getEOpposite().isContainment() || ((EReference) eStructuralFeature)
								.getEOpposite().isTransient());

			// check if the refered to eclass is transient if so then this efeature is
			// also transient
			if (!isTransient && eStructuralFeature instanceof EReference) {
				final PAnnotatedEReference aReference = (PAnnotatedEReference) aStructuralFeature;
				if (aReference.getAReferenceType() != null) {
					isTransient = aReference.getAReferenceType().getTransient() != null;
				}
			}

			if (aStructuralFeature.getTransient() == null &&
					((!mapVolitatileFeature() && eStructuralFeature.isVolatile()) || isTransient)) {
				log.debug("Structural feature " + eStructuralFeature.getName() +
						" is transient, therefore adding transient annotation");
				final Transient trans = aFactory.createTransient();
				trans.setEModelElement(eStructuralFeature);
				aStructuralFeature.setTransient(trans);
				// note next statement will force continue
			}

			// process transients further because they can be part of a
			// featuremap, the specific mapper should
			// handle transient
			// Note that this means that transient features will still have
			// additional annotations such as basic etc.
			// if (aStructuralFeature.getTransient() != null) return;
			if (aStructuralFeature instanceof PAnnotatedEAttribute) {
				final PAnnotatedEAttribute aAttribute = (PAnnotatedEAttribute) aStructuralFeature;
				if (((PAnnotatedEAttribute) aStructuralFeature).getVersion() != null) {
					return;
				}

				final Class<?> instanceClass = eStructuralFeature.getEType().getInstanceClass();
				boolean isMany = false;
				// instanceClass will be null for enums
				// Lob-annotated attributes must not be treated as one-to-many.
				// eattributes with a hibernate type annotations should not be
				// treated as a list
				if (instanceClass != null && aAttribute.getLob() == null) {
					isMany =
							eStructuralFeature.isMany() || instanceClass.isArray() ||
									Collection.class.isAssignableFrom(instanceClass) ||
									Set.class.isAssignableFrom(instanceClass) ||
									List.class.isAssignableFrom(instanceClass);
					isMany = isMany && !StoreUtil.isElementOfAGroup(eStructuralFeature);
				}

				if (isMany) {
					processOneToManyAttribute(aAttribute);
				} else {
					processSingleAttribute(aAttribute);
				}

				if (aAttribute.getColumn() != null && aAttribute.getColumn().getName() == null) {
					aAttribute.getColumn().setName(sqlNameStrategy.getColumnName(aAttribute));
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

				final EReference eReference = (EReference) aStructuralFeature.getAnnotatedElement();
				final EReference eOpposite = eReference.getEOpposite();

				// elements of a group are never multi-occurence because the
				// multi-occurence is
				// handled by the containing featuremap
				final boolean isMany = eReference.isMany() && !StoreUtil.isElementOfAGroup(eReference);
				final boolean isOppositeMany =
						eOpposite != null && eOpposite.isMany() && !StoreUtil.isElementOfAGroup(eOpposite);

				final boolean mtmBidirectionalRelation = isMany && eOpposite != null && isOppositeMany;
				final boolean mtmUnidirectionalRelation =
						isMany && eOpposite == null && aReference.getManyToMany() != null;
				final boolean otmBidirectionalRelation = isMany && eOpposite != null && !isOppositeMany;
				final boolean otmUnidirectionalRelation = isMany && eOpposite == null;

				// note as a default if the system has to choose between oto uni
				// or mto uni then it will
				// place a mto
				final boolean otoBidirectionalRelation = !isMany && eOpposite != null && !isOppositeMany;
				final boolean otoUnidirectionalRelation =
						!isMany && eOpposite == null &&
								(aReference.getOneToOne() != null || !aReference.getPrimaryKeyJoinColumns().isEmpty());
				final boolean mtoBidirectionalRelation = !isMany && eOpposite != null && isOppositeMany;
				final boolean mtoUnidirectionalRelation = !isMany && eOpposite == null && !otoUnidirectionalRelation;

				if (mtmBidirectionalRelation) {
					processBidirectionalManyToManyReference(aReference);
				} else if (mtmUnidirectionalRelation) {
					processUnidirectionalManyToManyReference(aReference);
				} else if (otmBidirectionalRelation || otmUnidirectionalRelation) {
					processOneToManyReference(aReference);
				} else if (otoBidirectionalRelation || otoUnidirectionalRelation) {
					processOneToOneReference(aReference);
				} else if (mtoBidirectionalRelation) {
					processManyToOneReference(aReference);
				} else if (mtoUnidirectionalRelation) {
					processManyToOneReference(aReference);
				}

				// handle column naming at this level
				if (aReference.getColumn() != null && aReference.getColumn().getName() == null) {
					aReference.getColumn().setName(sqlNameStrategy.getColumnName(aReference));
				}

			} else {
				throw new IllegalArgumentException("This type of StructuralFeature is not supported: " +
						aStructuralFeature.getClass().getName());
			}
			errorOccured = false;
		} finally {

			// check that at least one ann was set
			if (aStructuralFeature instanceof PAnnotatedEAttribute) {
				PAnnotatedEAttribute pae = (PAnnotatedEAttribute) aStructuralFeature;
				assert (errorOccured || pae.getBasic() != null || pae.getVersion() != null || pae.getId() != null ||
						pae.getTransient() != null || pae.getOneToMany() != null);
			} else {
				PAnnotatedEReference par = (PAnnotatedEReference) aStructuralFeature;
				assert (errorOccured || par.getTransient() != null || par.getOneToMany() != null ||
						par.getManyToMany() != null || par.getManyToOne() != null || par.getOneToOne() != null);
			}

		}
	}

	/** Map the feature if it is volatile, default is false */
	protected boolean mapVolitatileFeature() {
		return false;
	}

	/** Add default annotation to aAttribute: these are id, basic and enum */
	protected void processSingleAttribute(PAnnotatedEAttribute aAttribute) {

		log.debug(" Adding default annotations for EAttribute " + aAttribute.getAnnotatedElement().getName());

		final EAttribute eAttribute = (EAttribute) aAttribute.getAnnotatedElement();

		// this is done before adding the id because an enumerated can also be
		// an id
		if (eAttribute.getEType() instanceof EEnum && aAttribute.getEnumerated() == null) {
			final Enumerated enumerated = aFactory.createEnumerated();
			enumerated.setValue(EnumType.STRING);
			enumerated.setEModelElement(eAttribute);
			aAttribute.setEnumerated(enumerated);
		}

		if (persistenceOptions.isIDFeatureAsPrimaryKey() && eAttribute.isID() && aAttribute.getId() == null) {
			final Id id = aFactory.createId();
			id.setEModelElement(eAttribute);
			aAttribute.setId(id);
			addColumnConstraints(aAttribute);

			if (persistenceOptions.isSetGeneratedValueOnIDFeature() &&
					aAttribute.getGeneratedValue() == null &&
					(Number.class.isAssignableFrom(eAttribute.getEAttributeType().getInstanceClass()) ||
							eAttribute.getEAttributeType().getInstanceClass() == long.class || eAttribute
						.getEAttributeType().getInstanceClass() == int.class)) {
				final GeneratedValue gv = aFactory.createGeneratedValue();
				gv.setStrategy(GenerationType.AUTO);
				aAttribute.setGeneratedValue(gv);
			}

			return; // after id do not add basic
		} else if (aAttribute.getId() != null) {
			addColumnConstraints(aAttribute);
			return; // after id do not do basic
		}

		if (aAttribute.getTemporal() == null) {
			Class<?> clazz = eAttribute.getEAttributeType().getInstanceClass();
			// clazz is hidden somewhere
			if (clazz == null || Object.class.equals(clazz)) {
				ArrayList<EClassifier> eclassifiers = getItemTypes((EDataType) eAttribute.getEType());
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
			basic.setOptional(!eAttribute.isRequired() || eAttribute.isUnsettable());
			aAttribute.setBasic(basic);
		}

		if (aAttribute.getId() != null) {
			aAttribute.getBasic().setOptional(false);
			if (aAttribute.getColumn() != null && aAttribute.getColumn().isNullable()) {
				log.warn("The column of a primary key property is null, this will often result in database errors!");
			}
		}
		addColumnConstraints(aAttribute);
	}

	/**
	 * Adds the column level constraints on the basis of the xsd extended meta data
	 */
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
				// only support this for the string class, the length/maxlength
				// is also
				// used in case of the xsd list/union types but this can not be
				// enforced using a constraint on the
				// columnlength
				if (maxLength != null && eAttribute.getEAttributeType().getInstanceClass() != null &&
						eAttribute.getEAttributeType().getInstanceClass() == String.class) {
					column.setLength(Integer.parseInt(maxLength)); // you'll
					// find
					// parse
					// errors!
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
	protected void processOneToManyAttribute(PAnnotatedEAttribute aAttribute) {
		final String logStr =
				aAttribute.getAnnotatedEAttribute().getName() + "/" +
						aAttribute.getAnnotatedEAttribute().getEContainingClass().getName();

		log.debug("EAttribute " + logStr + " needs a onetomany");

		final EAttribute eAttribute = (EAttribute) aAttribute.getAnnotatedElement();
		OneToMany otm = aAttribute.getOneToMany();
		final boolean otmWasSet = otm != null; // otm was set manually
		if (otm == null) {
			log.debug("One to many not present adding one");
			otm = aFactory.createOneToMany();
			aAttribute.setOneToMany(otm);
			otm.setEModelElement(eAttribute);

			if (persistenceOptions.isFetchContainmentEagerly()) {
				otm.setFetch(FetchType.EAGER);
			}
		} else {
			log.debug("One to many present adding default information if required");
		}

		if (optionSetForeignKeyName) {
			aAttribute.setForeignKey(createFK(aAttribute));
		}

		// handle list of enums
		if (eAttribute.getEType() instanceof EEnum && aAttribute.getEnumerated() == null) {
			final Enumerated enumerated = aFactory.createEnumerated();
			enumerated.setValue(EnumType.STRING);
			enumerated.setEModelElement(eAttribute);
			aAttribute.setEnumerated(enumerated);
		}

		// set cascade if not set
		if (otm.getCascade().isEmpty()) {
			otm.getCascade().add(CascadeType.ALL);
		}

		if (otm.getTargetEntity() == null || otm.getTargetEntity() == null) {
			otm.setTargetEntity(getTargetTypeName(aAttribute));
		}

		if (aAttribute.getJoinTable() == null) {
			// note not optional because lists of simple types are embedded
			final List<String> names = sqlNameStrategy.getOneToManyEAttributeJoinColumns(aAttribute);
			aAttribute.getJoinColumns().addAll(
				getJoinColumns(names, FeatureMapUtil.isFeatureMap(eAttribute), true, otm));
		}

		// set unique and indexed
		if (!otmWasSet) {
			log.debug("Setting indexed and unique on otm from eAttribute.isOrdered/isUnique "
					+ "because otm was not set manually");
			otm.setIndexed(eAttribute.isOrdered());
			otm.setUnique(eAttribute.isUnique());
		}
	}

	/** Create a foreign key and set its name */
	protected ForeignKey createFK(PAnnotatedEStructuralFeature aFeature) {
		final ForeignKey fk = aFactory.createForeignKey();
		fk.setName(sqlNameStrategy.getForeignKeyName(aFeature));
		return fk;
	}

	/** Returns the type name of a many attribute */
	protected String getTargetTypeName(PAnnotatedEAttribute aAttribute) {
		final EAttribute eAttribute = aAttribute.getAnnotatedEAttribute();
		// check on equality on object.class is used for listunion simpleunions
		final Class<?> instanceClass = eAttribute.getEAttributeType().getInstanceClass();
		if (instanceClass != null && !Object.class.equals(instanceClass) && !List.class.equals(instanceClass)) {
			if (instanceClass.isArray()) {
				// get rid of the [] at the end
				return eAttribute.getEType().getInstanceClassName().substring(0,
					eAttribute.getEType().getInstanceClassName().length() - 2);
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
			ArrayList<EClassifier> eclassifiers = getItemTypes((EDataType) eAttribute.getEType());
			if (eclassifiers.size() > 0) {
				StringBuffer result = new StringBuffer();
				for (int i = 0; i < eclassifiers.size(); i++) {
					final EClassifier eclassifier = eclassifiers.get(i);
					if (i > 0) {
						result.append(",");
					}
					result.append(eclassifier.getInstanceClassName());
				}
				return result.toString();
			} else {
				return Object.class.getName();
			}
		}
	}

	/**
	 * Adds default annotations to a onetomany ereference, this method handles both the uni- and the
	 * bidirectional case
	 */
	protected void processOneToManyReference(PAnnotatedEReference aReference) {
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
			otm = aFactory.createOneToMany();
			aReference.setOneToMany(otm);
			otm.setEModelElement(eReference);

			if (eReference.isContainment() && persistenceOptions.isFetchContainmentEagerly()) {
				otm.setFetch(FetchType.EAGER);
			}
		} else {
			log.debug("EReference + " + logStr + " has onetomany, check if defaults should be set");
		}

		if (otm.getMappedBy() == null && eReference.getEOpposite() != null) {
			otm.setMappedBy(eReference.getEOpposite().getName());
		}

		if (optionMapEmbeddableAsEmbedded && aReference.getAReferenceType().getEmbeddable() != null) {
			aReference.setEmbedded(aFactory.createEmbedded());
		}

		if (optionSetForeignKeyName) {
			aReference.setForeignKey(createFK(aReference));
		}

		if (eReference.isContainment() || persistenceOptions.isSetDefaultCascadeOnNonContainment()) {
			setCascade(otm.getCascade(), eReference.isContainment());
		}

		// handle a special case, an emap which is mapped as a real map and which has an
		// enumerate as the key
		// Disabled for now as the hibernate map-key does not support enumerates as the type
		// for the key when mapping as a true map
		if (false && StoreUtil.isMap(eReference) && persistenceOptions.isMapEMapAsTrueMap()) {
			final EStructuralFeature keyFeature = aReference.getEReferenceType().getEStructuralFeature("key");
			if (keyFeature instanceof EAttribute) {
				final EAttribute keyAttribute = (EAttribute) keyFeature;
				final PAnnotatedEAttribute aKeyAttribute = aReference.getPaModel().getPAnnotated(keyAttribute);
				if (keyAttribute.getEType() instanceof EEnum && aKeyAttribute.getEnumerated() == null) {
					final Enumerated enumerated = aFactory.createEnumerated();
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
			otm.setIndexed(!persistenceOptions.alwaysMapListAsBag() && !persistenceOptions.alwaysMapListAsIdBag() &&
					eReference.isOrdered() && aReference.getOrderBy() == null);
			// in case of containment it is always unique
			// in case optionidbag then ignore the unique attribute on the ereference
			otm.setUnique(eReference.isContainment() ||
					(!persistenceOptions.alwaysMapListAsIdBag() && eReference.isUnique()));

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
		if (isEObject || (persistenceOptions.isJoinTableForNonContainedAssociations() && !eReference.isContainment()) ||
				!otm.isUnique()) {
			JoinTable joinTable = aReference.getJoinTable();
			if (joinTable == null) {
				joinTable = aFactory.createJoinTable();
				aReference.setJoinTable(joinTable);
			}
			joinTable.setEModelElement(eReference);

			// see remark in manytomany about naming of jointables
			if (joinTable.getName() == null) {
				joinTable.setName(sqlNameStrategy.getJoinTableName(aReference));
			}

			// note joincolumns in jointable can be generated automatically by
			// hib/jpox.
		} else if (aReference.getJoinColumns() == null || aReference.getJoinColumns().isEmpty()) { // add
			final List<String> names = sqlNameStrategy.getOneToManyEReferenceJoinColumns(aReference);
			aReference.getJoinColumns().addAll(getJoinColumns(names, aReference.getEmbedded() == null, true, otm));
		}
	}

	/** Adds default annotations to a bidirectional many to many ereference */
	protected void processBidirectionalManyToManyReference(PAnnotatedEReference aReference) {
		final String featureLogStr =
				aReference.getAnnotatedEReference().getName() + "/" +
						aReference.getAnnotatedEReference().getEContainingClass().getName();

		if (aReference.getOneToMany() != null || aReference.getOneToOne() != null || aReference.getManyToOne() != null) {
			throw new StoreMappingException("The feature/eclass " + featureLogStr + " should be a ManyToMany but " +
					"it already has a OneToMany, OneToOne or ManyToOne annotation");
		}

		final EReference eReference = (EReference) aReference.getAnnotatedElement();
		final EReference eOpposite = eReference.getEOpposite();
		assert (eOpposite != null && eOpposite.isMany());

		ManyToMany mtm = aReference.getManyToMany();
		final boolean mtmWasSet = mtm != null; // mtm was set manually
		if (mtm == null) {
			log.debug("Adding manytomany annotations to ereference: " + featureLogStr);
			mtm = aFactory.createManyToMany();
			aReference.setManyToMany(mtm);
			mtm.setEModelElement(eReference);
		} else {
			log.debug("ManyToMany present check if default information should be added");
		}

		if (eReference.isContainment() || persistenceOptions.isSetDefaultCascadeOnNonContainment()) {
			setCascade(mtm.getCascade(), eReference.isContainment());
		}

		if (mtm.getTargetEntity() == null) {
			mtm.setTargetEntity(getEntityName(eReference.getEReferenceType()));
		}

		if (optionSetForeignKeyName) {
			aReference.setForeignKey(createFK(aReference));
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
		final PAnnotatedEReference otherPA = aReference.getPaModel().getPAnnotated(eOpposite);
		if (mtm.getMappedBy() == null && setMappedBy(eReference) &&
				(otherPA.getManyToMany() == null || otherPA.getManyToMany().getMappedBy() == null)) {
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

		// NOTE that the ejb3 spec states that the jointable should be the
		// concatenation of the
		// tablenames of the owning entities with an underscore, this will
		// quickly lead to nameclashes
		// in the case there is more than one relation between two classes. This
		// can be pretty likely
		// if the inheritance strategy is single_table.
		// now possibility to use a different naming strategy
		if (joinTable.getName() == null) {
			joinTable.setName(sqlNameStrategy.getJoinTableName(aReference));
		}
		if (joinTable.getJoinColumns().size() == 0) {
			final List<String> names = sqlNameStrategy.getJoinTableJoinColumns(aReference, false);
			joinTable.getJoinColumns().addAll(getJoinColumns(names, false, true, mtm));
		}
		if (joinTable.getInverseJoinColumns().size() == 0) {
			final List<String> names = sqlNameStrategy.getJoinTableJoinColumns(aReference, true);
			joinTable.getInverseJoinColumns().addAll(getJoinColumns(names, false, true, mtm));
		}
	}

	/** Adds default annotations to a unidirectional many to many ereference */
	protected void processUnidirectionalManyToManyReference(PAnnotatedEReference aReference) {
		final String featureLogStr =
				aReference.getAnnotatedEReference().getName() + "/" +
						aReference.getAnnotatedEReference().getEContainingClass().getName();

		if (aReference.getOneToMany() != null || aReference.getOneToOne() != null || aReference.getManyToOne() != null) {
			throw new StoreMappingException("The feature/eclass " + featureLogStr + " should be a ManyToMany but " +
					"it already has a OneToMany, OneToOne or ManyToOne annotation");
		}

		final EReference eReference = (EReference) aReference.getAnnotatedElement();

		final ManyToMany mtm = aReference.getManyToMany();
		log.debug("ManyToMany present check if default information should be added");
		mtm.setEModelElement(eReference);

		if (eReference.isContainment() || persistenceOptions.isSetDefaultCascadeOnNonContainment()) {
			setCascade(mtm.getCascade(), eReference.isContainment());
		}

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

		if (optionSetForeignKeyName) {
			aReference.setForeignKey(createFK(aReference));
		}

		// note that here not the eclass name is used for the opposite side but
		// the name of the targetentity
		// because that's the one which is known here
		if (joinTable.getName() == null) {
			joinTable.setName(sqlNameStrategy.getJoinTableName(aReference));
		}
		if (joinTable.getJoinColumns() == null) {
			final List<String> names = sqlNameStrategy.getJoinTableJoinColumns(aReference, false);
			joinTable.getJoinColumns().addAll(getJoinColumns(names, false, true, mtm));
		}
	}

	/** Adds default annotations for a one to one reference */
	protected void processOneToOneReference(PAnnotatedEReference aReference) {
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
			oto = aFactory.createOneToOne();
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

		if (optionSetForeignKeyName) {
			aReference.setForeignKey(createFK(aReference));
		}

		if (optionMapEmbeddableAsEmbedded && aReference.getAReferenceType().getEmbeddable() != null) {
			aReference.setEmbedded(aFactory.createEmbedded());
		}

		// Note: Sometimes EMF generated getters/setters have a
		// very generic type (EObject), if the type can be derived here then
		// this should
		// be added here
		if (oto.getTargetEntity() == null) {
			oto.setTargetEntity(getEntityName(eReference.getEReferenceType()));
		}
	}

	/** Handles many to one for bidirectional and unidirectional cases */
	protected void processManyToOneReference(PAnnotatedEReference aReference) {
		final String logStr =
				aReference.getAnnotatedEReference().getName() + "/" +
						aReference.getAnnotatedEReference().getEContainingClass().getName();

		if (aReference.getOneToMany() != null || aReference.getManyToMany() != null || aReference.getOneToOne() != null) {
			throw new StoreMappingException("The feature/eclass " + logStr + " should be a ManyToOne but " +
					"it already has a OneToMany, ManyToMany or OneToOne annotation");
		}

		final EReference eReference = (EReference) aReference.getAnnotatedElement();

		ManyToOne mto = aReference.getManyToOne();
		if (mto == null) {
			log.debug("EReference + " + logStr + " does not have a manytoone annotation, adding one");
			mto = aFactory.createManyToOne();
			aReference.setManyToOne(mto);
			mto.setOptional(!eReference.isRequired() || eReference.isUnsettable() || eReference.getEOpposite() != null);
			mto.setEModelElement(eReference);
		} else {
			log.debug("EReference + " + logStr + " does have a manytoone annotation, using it");
		}

		if (eReference.isContainment() || persistenceOptions.isSetDefaultCascadeOnNonContainment()) {
			setCascade(mto.getCascade(), eReference.isContainment());
		}

		// NOTE: Sometimes EMF generated getters/setters have a
		// very generic type (EObject), if the type can be derived here then
		// this should
		// be added here
		if (mto.getTargetEntity() == null) {
			mto.setTargetEntity(getEntityName(eReference.getEReferenceType()));
		}

		if (optionSetForeignKeyName) {
			aReference.setForeignKey(createFK(aReference));
		}

		if (optionMapEmbeddableAsEmbedded && aReference.getAReferenceType().getEmbeddable() != null) {
			aReference.setEmbedded(aFactory.createEmbedded());
		}

		// create a set of joincolumns, note that if this is a two-way relation
		// then
		// the other side will use the name of the ereference as second
		// parameter,
		// matching the joincolumns on the other side
		if (aReference.getJoinColumns() == null || aReference.getJoinColumns().isEmpty()) {
			if (aReference.getAReferenceType() != null) {
				// == null if the reference is to a high level type such as an eobject

				// NOTE that currently in all cases if there is an opposite Teneo assumes
				// that it is managed from the other side. In reality this only needs to
				// be done if the other side is indexed.
				// NOTE: otm/mto with join table is not supported at the moment!
				final List<String> names = sqlNameStrategy.getManyToOneJoinColumnNames(aReference);
				aReference.getJoinColumns().addAll(
					getJoinColumns(names, mto.isOptional(), eReference.getEOpposite() == null ||
							eReference.getEOpposite().isTransient(), mto));
			}
		}
	}

	/** Return a list of join columns */
	private List<JoinColumn> getJoinColumns(List<String> names, boolean optional, boolean isUpdateInsertable,
			PAnnotation pAnnotation) {
		final List<JoinColumn> result = new ArrayList<JoinColumn>();
		for (String name : names) {
			JoinColumn jc = aFactory.createJoinColumn();
			jc.setName(name);
			jc.setNullable(optional);
			jc.setUpdatable(isUpdateInsertable);
			jc.setInsertable(isUpdateInsertable);
			result.add(jc);
		}
		return result;
	}

	/** Set the super entity */
	protected void setSuperEntity(PAnnotatedEClass aClass) {
		assert (aClass.getPaSuperEntity() == null);
		final EClass eclass = aClass.getAnnotatedEClass();
		if (eclass.getESuperTypes().size() == 0) {
			return;
		}
		final PAnnotatedEClass superAClass = aClass.getPaModel().getPAnnotated(eclass.getESuperTypes().get(0));
		if (superAClass.getEntity() != null) {
			aClass.setPaSuperEntity(superAClass);
		}
	}

	/** Returns fals for jpox and true for hibernate */
	protected boolean isMappableAnnotatedClass(PAnnotatedEClass aClass) {

		final EClass eclass = aClass.getAnnotatedEClass();

		if (!mapInterfaceEClass() && eclass.isInterface()) {
			log.debug("Not mapping interfaces and this is an interface eclass, ignore it");
			return false;
		}

		if (aClass.getTransient() != null) {
			return false; // not mappable
		}

		if (!persistenceOptions.isSetEntityAutomatically() && aClass.getEntity() == null &&
				aClass.getEmbeddable() == null) {
			log.debug("Entities are not added automatically and this eclass: " + aClass.getAnnotatedEClass().getName() +
					" does not have an entity/embeddable annotation.");
			return false;
		}

		// ignore these
		if (!mapMappedSuperEClass() && aClass.getMappedSuperclass() != null) {
			if (aClass.getEntity() != null) {
				log
					.warn("EClass " +
							eclass.getName() +
							" has entity as well as mappedsuperclass annotation, following mappedsuperclass annotation, therefore ignoring it for the mapping");
			}
			return false;
		}

		return true;
	}

	/**
	 * Map Interface EClasses, default false, overridden by hibernate to return true
	 */
	protected boolean mapInterfaceEClass() {
		return false;
	}

	/** Map a mapped superclass, this differs for jpox and hibernate */
	protected boolean mapMappedSuperEClass() {
		return true;
	}

	/**
	 * Returns the inheritance of the passed annotated class or from one of its super annotated
	 * class
	 */
	private Inheritance getInheritanceFromSupers(PAnnotatedEClass childPA) {
		if (childPA == null) {
			return null;
		}
		if (childPA.getInheritance() != null) {
			return childPA.getInheritance();
		}
		return getInheritanceFromSupers(childPA.getPaSuperEntity());
	}

	/** Walks up a edatatype inheritance structure to find the itemType */
	private ArrayList<EClassifier> getItemTypes(EDataType eDataType) {
		final ArrayList<EClassifier> result = new ArrayList<EClassifier>();
		if (eDataType == null) {
			return result;
		}
		final String itemType = getEAnnotationValue(eDataType, ANNOTATION_SOURCE_METADATA, "itemType");
		if (itemType != null) {
			result.add(getEClassifier(eDataType.getEPackage(), itemType));
			return result;
		}

		final String memberTypes = getEAnnotationValue(eDataType, ANNOTATION_SOURCE_METADATA, "memberTypes");
		if (memberTypes != null) {
			String[] mtypes = memberTypes.split(" ");
			for (String element : mtypes) {
				EClassifier eclassifier = getEClassifier(eDataType.getEPackage(), element);
				result.addAll(getItemTypes((EDataType) eclassifier));
			}
			return result;
		}

		final String baseType = getEAnnotationValue(eDataType, ANNOTATION_SOURCE_METADATA, "baseType");
		if (baseType != null) {
			final ArrayList<EClassifier> tmpResult =
					getItemTypes((EDataType) getEClassifier(eDataType.getEPackage(), baseType));
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
	 * Returns the eclassifier using either the name of the eclassifier or the name element
	 */
	private EClassifier getEClassifier(EPackage epackage, String searchName) {
		for (EClassifier eclassifier : epackage.getEClassifiers()) {
			if (eclassifier.getName().compareTo(searchName) == 0) {
				return eclassifier;
			}
			String nameAnnotation = getEAnnotationValue(eclassifier, ANNOTATION_SOURCE_METADATA, "name");
			if (nameAnnotation != null && searchName.compareTo(nameAnnotation) == 0) {
				return eclassifier;
			}
		}
		return null;
	}

	/**
	 * Checks if the cascade should be set in the cascade list, is only done if the list is empty
	 */
	private void setCascade(List<CascadeType> cascadeList, boolean isContainment) {
		if (!cascadeList.isEmpty()) {
			return;
		}

		if (isContainment && !persistenceOptions.isSetCascadeAllOnContainment()) {
			cascadeList.add(CascadeType.REMOVE);
			cascadeList.add(CascadeType.MERGE);
			cascadeList.add(CascadeType.PERSIST);
			cascadeList.add(CascadeType.REFRESH);
		} else if (isContainment) {
			cascadeList.add(CascadeType.ALL);
		} else {
			cascadeList.add(CascadeType.MERGE);
			cascadeList.add(CascadeType.PERSIST);
			cascadeList.add(CascadeType.REFRESH);
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
		if (eOpposite == null) {
			return false;
		}
		return compareNames(eReference, eOpposite);
		// &&
		// !eReference.isContainment() && !eOpposite.isContainment();
	}

	/**
	 * Determines where to place a certain annotation/characteristic, this is done by comparing
	 * names..
	 */
	private boolean compareNames(EReference here, EReference there) {
		final String nameHere = here.eClass().getName() + here.getName();
		final String nameThere = there.eClass().getName() + there.getName();
		assert (nameHere.compareTo(nameThere) != 0);
		return nameHere.compareTo(nameThere) > 0;
	}

	/**
	 * Returns the entity name of the eclass, or the instance classname in case the fully classified
	 * classnames should be used
	 */
	protected String getEntityName(EClass eClass) {

// if (persistenceOptions.isMapEMapAsTrueMap() && StoreUtil.isMapEntry(eClass)) {
// // ok, it is an EMAp, get the annotaetd class of the child
// EStructuralFeature feature = eClass.getEStructuralFeature("value");
// if (feature instanceof EReference) {
// return getEntityName(((EReference) feature).getEReferenceType());
// } else {
// return ((EAttribute) feature).getEType().getInstanceClassName();
// }
// }
		return StrategyUtil.getEntityName(entityNameStrategy, persistenceOptions, annotatedModel, eClass);
	}

	/** Get a specific extended metadate */
	private String getExtendedMetaData(EAttribute eAttribute, String key) {
		String value = getEAnnotationValue(eAttribute, "http:///org/eclipse/emf/ecore/util/ExtendedMetaData", key);
		if (value == null) {
			value =
					getEAnnotationValue(eAttribute.getEAttributeType(),
						"http:///org/eclipse/emf/ecore/util/ExtendedMetaData", key);
		}
		return value;
	}

	/** Returns the value of an annotation with a certain key */
	private String getEAnnotationValue(EModelElement eModelElement, String source, String key) {
		final EAnnotation eAnnotation = eModelElement.getEAnnotation(source);
		if (eAnnotation == null) {
			return null;
		}
		return eAnnotation.getDetails().get(key);
	}

	/**
	 * @return the extensionManager
	 */
	public ExtensionManager getExtensionManager() {
		return extensionManager;
	}

	/**
	 * @param extensionManager
	 *            the extensionManager to set
	 */
	public void setExtensionManager(ExtensionManager extensionManager) {
		this.extensionManager = extensionManager;
	}
}