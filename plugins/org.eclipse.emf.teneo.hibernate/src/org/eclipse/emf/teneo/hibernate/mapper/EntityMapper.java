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
 *   Martin Taal
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: EntityMapper.java,v 1.2 2006/08/03 09:58:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorType;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTables;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.annotations.processing.FeatureProcessor;
import org.eclipse.emf.teneo.annotations.processing.ProcessingException;
import org.eclipse.emf.teneo.simpledom.DocumentHelper;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps the entity and its features, also takes care of embedded superclass mapping.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class EntityMapper extends AbstractMapper {

	/** Log it all */
	private static final Log log = LogFactory.getLog(EntityMapper.class);

	/** the mapper used for features, is copied from the hbm context for convenience reasons */
	private final FeatureProcessor featureProcessor;

	/** Convenience maps to inheritance strategy names and discriminator types */
	private static final String[] INHERITANCE_STRATEGY_NAMES;

	private static final String[] DISCRIMINATOR_TYPE_NAMES;

	/** Initialize the global arrays */
	static {
		INHERITANCE_STRATEGY_NAMES = new String[InheritanceType.VALUES.size()];
		INHERITANCE_STRATEGY_NAMES[InheritanceType.JOINED] = "joined-subclass";
		INHERITANCE_STRATEGY_NAMES[InheritanceType.SINGLE_TABLE] = "subclass";
		INHERITANCE_STRATEGY_NAMES[InheritanceType.TABLE_PER_CLASS] = "union-subclass";

		DISCRIMINATOR_TYPE_NAMES = new String[DiscriminatorType.VALUES.size()];
		DISCRIMINATOR_TYPE_NAMES[DiscriminatorType.CHAR] = "character";
		DISCRIMINATOR_TYPE_NAMES[DiscriminatorType.INTEGER] = "integer";
		DISCRIMINATOR_TYPE_NAMES[DiscriminatorType.STRING] = "string";
	}

	// Key used for grouping properties to the primary and secondary tables.
	private final String PRIMARY_TABLE_KEY = null;

	/**
	 * @return Return the name used by hibernate to denote the given inheritance type. If the argument is null, the
	 *         default inheritance type (SINGLE_TABLE) is used instead.
	 */
	private static String hbInheritanceName(InheritanceType inheritanceType) {
		return EntityMapper.INHERITANCE_STRATEGY_NAMES[inheritanceType != null ? inheritanceType.getValue()
				: InheritanceType.SINGLE_TABLE];
	}

	/**
	 * @return Return the name used by hibernate for the given dicriminator type
	 */
	private static String hbDiscriminatorType(DiscriminatorType dType) {
		return EntityMapper.DISCRIMINATOR_TYPE_NAMES[dType != null ? DiscriminatorType.STRING : dType.getValue()];
	}

	/**
	 * @return Returns a list of the mapped superclasses of the given entity.
	 */
	public EntityMapper(MappingContext hbmContext) {
		super(hbmContext);
		featureProcessor = hbmContext.getFeatureProcessor();
	}

	/**
	 * @return Returns a new hibernate element for the given entity.
	 */
	private Element createEntity(PAnnotatedEClass entity, InheritanceType inhStrategy, PAnnotatedEClass superEntity,
			DiscriminatorValue dValue, Table table) {
		// determine what type of hibernate tag should be used
		InheritanceType inheritanceStrategy = inhStrategy != null ? inhStrategy : InheritanceType.SINGLE_TABLE_LITERAL;
		final String hbClassName;
		if (superEntity == null) {
			hbClassName = "class";
		} else {
			hbClassName = EntityMapper.hbInheritanceName(inheritanceStrategy);
		}

		log.debug("Creating entity tag " + hbClassName);

		final Element target = getHbmContext().getCurrent().addElement(hbClassName).addAttribute("entity-name",
				getHbmContext().getEntityName(entity.getAnnotatedEClass()))
		// MT: need to discuss if the name is still required for hql or persist with single parameter
				.addAttribute("abstract", entity.getAnnotatedEClass().isAbstract() ? "true" : "false").addAttribute(
						"lazy", "false"); // TODO
		// remove this when setting up EMF proxies

		// note for composite ids the name must be set always!
		// entity.getAnnotatedEClass().getInstanceClass() != null) { // ||
		// entity.getAnnotatedEClass().getInstanceClass() != null ||
		if (hasCompositeID(entity)) { // only for this specific case it is required to have the impl.name
			target.addAttribute("name", hbmContext.getInstanceClassName(entity));
		}

		if (superEntity != null) {
			final String extendsEntity = getHbmContext().getEntityName(superEntity.getAnnotatedEClass());
			target.addAttribute("extends", extendsEntity);
			log.debug("Extends " + extendsEntity);
		}

		if (dValue != null) {
			target.addAttribute("discriminator-value", dValue.getValue());
			log.debug("DValue " + dValue.getValue());
		}

		if (table != null) {
			if (table.getName() != null) {
				target.addAttribute("table", getHbmContext().trunc(table.getName(), false));
				log.debug("Table " + "`" + table.getName() + "`");
			}
			if (table.getSchema() != null) {
				target.addAttribute("schema", getHbmContext().trunc(table.getSchema(), false));
				log.debug("Schema " + table.getSchema());
			}
			if (table.getCatalog() != null) {
				target.addAttribute("catalog", getHbmContext().trunc(table.getCatalog(), false));
				log.debug("Catalog " + table.getCatalog());
			}
		}
		return target;
	}

	/** Returns true if this entity or one of its superclasses has an idclass */
	private boolean hasCompositeID(PAnnotatedEClass aClass) {
		if (aClass.getIdClass() != null)
			return true;
		if (aClass.getPaSuperEntity() != null) {
			return hasCompositeID(aClass.getPaSuperEntity());
		}
		if (aClass.getPaMappedSuper() != null) {
			return hasCompositeID(aClass.getPaMappedSuper());
		}
		{
			List features = aClass.getPaEStructuralFeatures();
			for (Iterator iter = features.iterator(); iter.hasNext();) {
				PAnnotatedEStructuralFeature feature = (PAnnotatedEStructuralFeature) iter.next();
				if (feature instanceof PAnnotatedEReference && ((PAnnotatedEReference) feature).getEmbeddedId() != null) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Maps the given entity in its hbm context.
	 */
	public void processEntity(PAnnotatedEClass entity) {
		if (log.isDebugEnabled())
			log.debug("Mapping Entity " + entity);

		List mappedSuperClasses = getHbmContext().getMappedSuperClasses(entity);
		log.debug("No of mappedSuperclasses " + mappedSuperClasses.size());

		if (mappedSuperClasses.isEmpty() && entity.getAttributeOverrides() != null) {
			log.error("Specified AttributeOverrides without mapped superclass in " + entity);
			throw new ProcessingException("Specified AttributeOverrides without mapped superclass", entity);
		}
		if (mappedSuperClasses.isEmpty() && entity.getAssociationOverrides() != null) {
			log.error("Specified AssociationOverrides without mapped superclass in " + entity);
			throw new ProcessingException("Specified AssociationOverrides without mapped superclass", entity);
		}

		Element entityElement = createEntity(entity, entity.getInheritanceStrategy(), entity.getPaSuperEntity(), entity
				.getDiscriminatorValue(), entity.getTable());

		getHbmContext().setCurrent(entityElement);
		getHbmContext().setCurrentTable(entity.getTable());
		// MT: moved to processFeatures method because this should be done after the id
		// element has been placed

		if (entity.getPrimaryKeyJoinColumns() != null && entity.getPrimaryKeyJoinColumns().getValue().size() > 0) {
			addPrimaryKeyJoinColumn(entity.getPrimaryKeyJoinColumns().getValue());
		} else if (entity.getPaSuperEntity() != null
				&& !InheritanceType.SINGLE_TABLE_LITERAL.equals(entity.getInheritanceStrategy())) {
			final ArrayList list = new ArrayList();
			list.add(PannotationFactory.eINSTANCE.createPrimaryKeyJoinColumn());
			addPrimaryKeyJoinColumn(list);
		}

		try {
			log.debug("Processing mapped superclasses, no of mappedsuperclasses: " + mappedSuperClasses.size());
			for (Iterator i = mappedSuperClasses.iterator(); i.hasNext();) {
				getHbmContext().pushOverrideOnStack();
				if (entity.getAttributeOverrides() != null) {
					getHbmContext().addOverrides(entity.getAttributeOverrides());
				}
				if (entity.getAssociationOverrides() != null) {
					getHbmContext().addOverrides(entity.getAssociationOverrides());
				}
				try {
					final PAnnotatedEClass mappedSuperClass = (PAnnotatedEClass) i.next();
					log.debug("Mapped superclass " + mappedSuperClass.getAnnotatedEClass().getName());
					processMappedSuper(mappedSuperClass);
				} finally {
					getHbmContext().popOverrideStack();
				}
			}

			final List multipleInheritanceFeatures = getHbmContext().getMultipleInheritedFeatures(entity);
			if (entity.getAnnotatedEClass().getESuperTypes().size() <= 1 && multipleInheritanceFeatures.size() > 0) {
				log.error("Entity has one or less super type but a multiple "
						+ "inheritance structure was detected, this is an application error.");
				throw new ProcessingException("Entity has one or less super type but a multiple "
						+ "inheritance structure was detected, this is an application error.");
			}
			getHbmContext().pushOverrideOnStack();
			if (entity.getAttributeOverrides() != null) {
				getHbmContext().addOverrides(entity.getAttributeOverrides());
			}
			if (entity.getAssociationOverrides() != null) {
				getHbmContext().addOverrides(entity.getAssociationOverrides());
			}
			try {
				processFeatures(multipleInheritanceFeatures);
			} finally {
				getHbmContext().popOverrideStack();
			}

			final SecondaryTables secondaryTables = entity.getSecondaryTables();
			if (secondaryTables == null || secondaryTables.getValue().size() == 0) {
				// Process features normally.
				processFeatures(entity.getPaEStructuralFeatures());
			} else {
				// Special processing needed for secondary tables.
				processSecondaryTables(secondaryTables.getValue(), entity);
			}
		} finally {
			getHbmContext().setCurrentTable(null);
			Element idElement = entityElement.element("id");
			if (idElement == null) {
				idElement = entityElement.element("composite-id");
			}

			// create a synthetic id for roots
			if (idElement == null && entity.getPaSuperEntity() == null && entity.getPaMappedSuper() == null) {
				idElement = IdMapper.addSyntheticId(hbmContext, entityElement);
			}

			if (idElement != null) {
				int index = entityElement.indexOf(idElement) + 1;

				if (entity.getDiscriminatorColumn() != null) {
					// add discriminator element immediately after id element
					entityElement.add(index++, createDiscriminatorElement(entity.getDiscriminatorColumn()));
				}

				// create and/or move version element (if present) immediately after discriminator
				Element versionElement = entityElement.element("version");
				if (versionElement == null) {
					versionElement = addVersionProperty();
				}
				entityElement.remove(versionElement);
				entityElement.add(index, versionElement);
			}

			getHbmContext().setCurrent(entityElement.getParent());

			// now process the featuremap entries if any
			processFeatureMapFeatures();
		}

	}

	/** Process the featuremap entries */
	private void processFeatureMapFeatures() {
		// this is a while and for loop, in the for loop the features of a feature map
		// are processed, these features can again be a featuremap which are added
		// to the featuremapmappers in the context, therefore this process walks on
		List featureMapMappers = getHbmContext().getClearFeatureMapMappers();
		while (featureMapMappers.size() > 0) {
			for (Iterator it = featureMapMappers.iterator(); it.hasNext();) {
				FeatureMapMapping fmm = (FeatureMapMapping) it.next();
				fmm.process();
			}

			// read again because the fmm.process can result in new feature map
			// mappings
			featureMapMappers = getHbmContext().getClearFeatureMapMappers();
		}
	}

	/** Process the features of the mapped superclass so that they are added to the current mapping */
	protected void processMappedSuper(PAnnotatedEClass paMappedSuper) {
		processFeatures(paMappedSuper.getPaEStructuralFeatures());
	}

	/** process the features of the annotated eclass */
	protected void processFeatures(List features) {
		for (Iterator i = features.iterator(); i.hasNext();) {
			processFeature((PAnnotatedEStructuralFeature) i.next());
		}
	}

	/** Process secondary tables. */
	protected void processSecondaryTables(List secondaryTables, PAnnotatedEClass entity) {
		// Group features by primary and secondary tables.
		// For the primary table we use null as the surrogate key. (HashMap allows null keys.)
		final Set tableNames = new HashSet();
		tableNames.add(PRIMARY_TABLE_KEY);
		for (Iterator iter = secondaryTables.iterator(); iter.hasNext();) {
			final SecondaryTable secondaryTable = (SecondaryTable) iter.next();
			tableNames.add(secondaryTable.getName());
		}
		final Map featuresByTable = new HashMap();
		for (Iterator iter = entity.getPaEStructuralFeatures().iterator(); iter.hasNext();) {
			final PAnnotatedEStructuralFeature feature = (PAnnotatedEStructuralFeature) iter.next();
			final String tableName = feature.getTableName();
			if (!tableNames.contains(tableName)) {
				final String message = "Feature \"" + feature.getAnnotatedElement().getName()
						+ "\" was mapped to undeclared secondary table \"" + tableName + "\".";
				log.error(message);
				throw new ProcessingException(message);
			}
			List featuresInTable = (List) featuresByTable.get(tableName);
			if (featuresInTable == null) {
				featuresInTable = new ArrayList();
				featuresByTable.put(tableName, featuresInTable);
			}
			featuresInTable.add(feature);
		}

		// Process features in primary table.
		{
			final List featuresInTable = (List) featuresByTable.get(PRIMARY_TABLE_KEY);
			for (Iterator iter = featuresInTable.iterator(); iter.hasNext();) {
				PAnnotatedEStructuralFeature feature = (PAnnotatedEStructuralFeature) iter.next();
				processFeature(feature);
			}
		}
		// Process features in secondary tables.
		for (Iterator iter = secondaryTables.iterator(); iter.hasNext();) {
			final SecondaryTable secondaryTable = (SecondaryTable) iter.next();
			if (!featuresByTable.containsKey(secondaryTable.getName())) {
				// The table was listed in the SecondaryTable annotation, but no features were actually mapped to this
				// table.
				log.warn("No features mapped to secondary table " + secondaryTable.getName());
				continue;
			}
			final List featuresInTable = (List) featuresByTable.get(secondaryTable.getName());

			// Create <join> element
			// See http://www.hibernate.org/hib_docs/v3/reference/en/html/mapping.html#mapping-declaration-join
			final Element joinElement = getHbmContext().getCurrent().addElement("join");
			joinElement.addAttribute("table", getHbmContext().trunc(secondaryTable.getName().toUpperCase(), false));
			log.debug("Mapping features to secondary table \"" + secondaryTable.getName() + "\"");
			if (secondaryTable.getCatalog() != null) {
				joinElement.addAttribute("catalog", secondaryTable.getCatalog());
			}
			if (secondaryTable.getSchema() != null) {
				joinElement.addAttribute("schema", secondaryTable.getSchema());
			}
			entity.getAnnotatedEClass().getEIDAttribute();
			final List pkJoinColumns = secondaryTable.getPkJoinColumns();
			for (Iterator iterator = pkJoinColumns.iterator(); iterator.hasNext();) {
				final PrimaryKeyJoinColumn pkJoinColumn = (PrimaryKeyJoinColumn) iterator.next();
				final Element keyElement = joinElement.addElement("key");
				keyElement.addAttribute("column", getHbmContext().trunc(pkJoinColumn.getName()));
			}

			// Process features in this secondary table.
			try {
				getHbmContext().setCurrent(joinElement);
				getHbmContext().setCurrentSecondaryTable(secondaryTable);
				for (Iterator iter2 = featuresInTable.iterator(); iter2.hasNext();) {
					final PAnnotatedEStructuralFeature feature = (PAnnotatedEStructuralFeature) iter2.next();
					processFeature(feature);
				}
			} finally {
				getHbmContext().setCurrentSecondaryTable(null);
				getHbmContext().setCurrent(joinElement.getParent());
			}
		}
	}

	/** Process one feature */
	protected void processFeature(PAnnotatedEStructuralFeature paFeature) {
		featureProcessor.process(paFeature);
	}

	/**
	 * Adds a key element to the current entity mapping, is for example used to join to the super class table.
	 */
	private void addPrimaryKeyJoinColumn(List pkJCs) {
		log.debug("Adding primary key join column");

		final Element jcElement = getHbmContext().getCurrent().addElement("key");

		for (Iterator it = pkJCs.iterator(); it.hasNext();) {
			final PrimaryKeyJoinColumn pkJC = (PrimaryKeyJoinColumn) it.next();
			final Element columnElement = jcElement.addElement("column");

			if (pkJC.getColumnDefinition() != null) {
				log.error("Unsupported column definition in primary key join column " + pkJC);
				throw new ProcessingException("Unsupported column definition in primary key join column", pkJC);
			}

			if (pkJC.getName() != null) {
				columnElement.addAttribute("name", getHbmContext().trunc(pkJC.getName()));
			}
			if (pkJC.getReferencedColumnName() != null) {
				columnElement.addAttribute("property-ref", pkJC.getReferencedColumnName());
			}
		}
	}

	/**
	 * Creates a discriminator element and returns it, so the caller should add it to the parent element
	 */
	private Element createDiscriminatorElement(DiscriminatorColumn dColumn) {
		Element dcElement = DocumentHelper.createElement("discriminator");
		if (dColumn.getName() != null)
			dcElement.addAttribute("column", getHbmContext().trunc(dColumn.getName()));
		dcElement.addAttribute("type", hbDiscriminatorType(dColumn.getDiscriminatorType()));

		if (dColumn.isSetLength() && log.isDebugEnabled()) {
			log.debug("Ignoring length for discriminator column " + dColumn);
		}

		if (dColumn.getColumnDefinition() != null) {
			log.error("Unsupported column definition in discriminator column " + dColumn);
			throw new ProcessingException("Unsupported column definition in discriminator column", dColumn);
		}
		return dcElement;
	}

	/**
	 * Add a synthetic version if the entity does not define one TODO remove synthetic version property MT: why remove
	 * it? TODO because if one needs optimistic lock one should define an attribute to support it at least I would like
	 * this draconian approach MT This is a convenience, imo you always want optimistic locking and why would you want a
	 * version attribute in a business object next to name, product code, order number etc. imho this is exposing
	 * persistency details to the business layer.
	 */
	private Element addVersionProperty() {
		// note hasVersion does not consider mapped superclasses
		// FIXME this add version everywhere, specify where needed
		// MT2: agree this can be controlled by an option.
		assert (getHbmContext().getCurrent().element("version") == null);

		// note specific accessor is required because version accessor is not retrieved through
		// emf tuplizer
		return getHbmContext().getCurrent().addElement("version").
			// NOTE: the name is also set so that the property name can be 
			// used later to identify a version prop, 
			// TODO: improve this
				addAttribute("name", getHbmContext().getVersionColumnName()).
				addAttribute("column", getHbmContext().getVersionColumnName()).
				addAttribute("access",
					"org.eclipse.emf.teneo.hibernate.mapping.property.VersionPropertyHandler");
	}

}
