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
 * $Id: EntityMapper.java,v 1.9 2007/02/08 23:13:12 mtaal Exp $
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorType;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.ecore.EModelResolver;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass;
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
	private final FeatureMapper featureMapper;

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
		featureMapper = hbmContext.getFeatureMapper();
	}

	/**
	 * @return Returns a new hibernate element for the given entity.
	 */
	private Element createEntity(PAnnotatedEClass entity, InheritanceType inhStrategy, PAnnotatedEClass superEntity,
			DiscriminatorValue dValue, Table table) {
		// determine what type of hibernate tag should be used
		final InheritanceType inheritanceStrategy = inhStrategy != null ? inhStrategy
				: InheritanceType.SINGLE_TABLE_LITERAL;
		final EClass eclass = entity.getAnnotatedEClass();
		final String hbClassName;
		if (superEntity == null) {
			hbClassName = "class";
		} else {
			hbClassName = EntityMapper.hbInheritanceName(inheritanceStrategy);
		}

		log.debug("Creating entity tag " + hbClassName);

		final Element target;

		final String entityName = getHbmContext().getEntityName(eclass);
		final String isAbstractStr = eclass.isAbstract() ? "true" : "false";
		if (getHbmContext().isEasyEMFGenerated(eclass)) { // entity
			// get the interfacec
			final String proxyName;
			final Class<?> interfaceClass = EModelResolver.instance().getJavaInterfaceClass(eclass);
			final String className = EModelResolver.instance().getJavaClass(eclass).getName();
			if (interfaceClass != null) {
				proxyName = interfaceClass.getName();
			} else {
				proxyName = className;
			}

			target = getHbmContext().getCurrent().addElement(hbClassName).addAttribute("name", className)
					.addAttribute("entity-name", entityName)
					.addAttribute("proxy", proxyName).addAttribute("abstract", isAbstractStr).addAttribute("lazy",
							"true");
		} else {
			target = getHbmContext().getCurrent().addElement(hbClassName).addAttribute("entity-name", entityName)
					.addAttribute("abstract", isAbstractStr).addAttribute("lazy", "false");

			// note for composite ids the name must be set always!
			// entity.getAnnotatedEClass().getInstanceClass() != null) { // ||
			// entity.getAnnotatedEClass().getInstanceClass() != null ||
			if (hasCompositeID(entity)) { // only for this specific case it is required to have the impl.name
				target.addAttribute("name", hbmContext.getInstanceClassName(entity));
			}
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
		
		if (table != null && hbClassName.compareTo(INHERITANCE_STRATEGY_NAMES[InheritanceType.SINGLE_TABLE]) == 0) {
			log.warn("EClass/Entity (" + entityName + ") is mapped as subclass in a single table with its superclass but it also has a table annotation. This table annotation is ignored.");
		} else if (table != null) {
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
			List<PAnnotatedEStructuralFeature> features = aClass.getPaEStructuralFeatures();
			for (PAnnotatedEStructuralFeature feature : features) {
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

		List<PAnnotatedEClass> mappedSuperClasses = getHbmContext().getMappedSuperClasses(entity);
		log.debug("No of mappedSuperclasses " + mappedSuperClasses.size());

		if (mappedSuperClasses.isEmpty() && entity.getAttributeOverrides().size() > 0) {
			log.error("Specified AttributeOverrides without mapped superclass in " + entity);
			throw new MappingException("Specified AttributeOverrides without mapped superclass", entity);
		}
		if (mappedSuperClasses.isEmpty() && entity.getAssociationOverrides().size() > 0) {
			log.error("Specified AssociationOverrides without mapped superclass in " + entity);
			throw new MappingException("Specified AssociationOverrides without mapped superclass", entity);
		}

		Element entityElement = createEntity(entity, entity.getInheritanceStrategy(), entity.getPaSuperEntity(), entity
				.getDiscriminatorValue(), entity.getTable());

		getHbmContext().setCurrent(entityElement);
		getHbmContext().setCurrentTable(entity.getTable());
		// MT: moved to processFeatures method because this should be done after the id
		// element has been placed

		if (entity.getPrimaryKeyJoinColumns() != null && entity.getPrimaryKeyJoinColumns().size() > 0) {
			addPrimaryKeyJoinColumn(entity.getPrimaryKeyJoinColumns());
		} else if (entity.getPaSuperEntity() != null
				&& InheritanceType.JOINED_LITERAL.equals(entity.getInheritanceStrategy())) {
			final ArrayList<PrimaryKeyJoinColumn> list = new ArrayList<PrimaryKeyJoinColumn>();
			final PrimaryKeyJoinColumn pkjc = PannotationFactory.eINSTANCE.createPrimaryKeyJoinColumn();
			final String entityName = getHbmContext().getEntityName(entity.getAnnotatedEClass());
			getHbmContext().trunc(entityName + "id"); // TODO improve name creation here
			list.add(pkjc);
			addPrimaryKeyJoinColumn(list);
		}

		try {
			log.debug("Processing mapped superclasses, no of mappedsuperclasses: " + mappedSuperClasses.size());
			for (Iterator<PAnnotatedEClass> i = mappedSuperClasses.iterator(); i.hasNext();) {
				getHbmContext().pushOverrideOnStack();
				if (!entity.getAttributeOverrides().isEmpty()) {
					getHbmContext().addAttributeOverrides(entity.getAttributeOverrides());
				}
				if (!entity.getAssociationOverrides().isEmpty()) {
					getHbmContext().addAssociationOverrides(entity.getAssociationOverrides());
				}
				try {
					final PAnnotatedEClass mappedSuperClass = i.next();
					log.debug("Mapped superclass " + mappedSuperClass.getAnnotatedEClass().getName());
					processMappedSuper(mappedSuperClass);
				} finally {
					getHbmContext().popOverrideStack();
				}
			}

			final List<PAnnotatedEStructuralFeature> multipleInheritanceFeatures = getHbmContext().getMultipleInheritedFeatures(entity);
			if (entity.getAnnotatedEClass().getESuperTypes().size() <= 1 && multipleInheritanceFeatures.size() > 0) {
				log.error("Entity has one or less super type but a multiple "
						+ "inheritance structure was detected, this is an application error.");
				throw new MappingException("Entity has one or less super type but a multiple "
						+ "inheritance structure was detected, this is an application error.");
			}
			getHbmContext().pushOverrideOnStack();
			if (entity.getAttributeOverrides() != null) {
				getHbmContext().addAttributeOverrides(entity.getAttributeOverrides());
			}
			if (entity.getAssociationOverrides() != null) {
				getHbmContext().addAssociationOverrides(entity.getAssociationOverrides());
			}
			try {
				processFeatures(multipleInheritanceFeatures);
			} finally {
				getHbmContext().popOverrideStack();
			}

			final EList<SecondaryTable> secondaryTables = entity.getSecondaryTables();
			if (secondaryTables == null || secondaryTables.isEmpty()) {
				// Process features normally.
				processFeatures(entity.getPaEStructuralFeatures());
			} else {
				// Special processing needed for secondary tables.
				processSecondaryTables(secondaryTables, entity);
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
			} else if (getHbmContext().mustAddSyntheticID(entity)) {
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

				if (null != versionElement) { // In case this is not versioned
					entityElement.remove(versionElement);
					entityElement.add(index, versionElement);
				}
			}

			getHbmContext().setCurrent(entityElement.getParent());

			// now process the featuremap entries if any
			processFeatureMapFeatures();
		}

		getHbmContext().addTuplizerElement(entityElement, entity);

		if (entity.getPaSuperEntity() == null && ((HbAnnotatedEClass) entity).getHbCache() != null) {
			addCacheElement(entityElement, ((HbAnnotatedEClass) entity).getHbCache());
		}

		final Element meta1 = new Element("meta");
		meta1.addAttribute("attribute", HbMapperConstants.ECLASS_NAME_META).addText(
				entity.getAnnotatedEClass().getName());
		final Element meta2 = new Element("meta");
		meta2.addAttribute("attribute", HbMapperConstants.EPACKAGE_META).addText(
				entity.getAnnotatedEClass().getEPackage().getNsURI());

		entityElement.add(0, meta1);
		entityElement.add(1, meta2);
	}

	/** Process the featuremap entries */
	private void processFeatureMapFeatures() {
		// this is a while and for loop, in the for loop the features of a feature map
		// are processed, these features can again be a featuremap which are added
		// to the featuremapmappers in the context, therefore this process walks on
		List<FeatureMapMapping> featureMapMappers = getHbmContext().getClearFeatureMapMappers();
		while (featureMapMappers.size() > 0) {

			for (FeatureMapMapping fmm : featureMapMappers) {
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
	protected void processFeatures(List<PAnnotatedEStructuralFeature> features) {
		for (Iterator<PAnnotatedEStructuralFeature> i = features.iterator(); i.hasNext();) {
			processFeature((PAnnotatedEStructuralFeature) i.next());
		}
	}

	/** Process secondary tables. */
	protected void processSecondaryTables(List<SecondaryTable> secondaryTables, PAnnotatedEClass entity) {
		// Group features by primary and secondary tables.
		// For the primary table we use null as the surrogate key. (HashMap allows null keys.)
		final Set<String> tableNames = new HashSet<String>();
		tableNames.add(PRIMARY_TABLE_KEY);
		for (SecondaryTable secondaryTable : secondaryTables) {
			tableNames.add(secondaryTable.getName());
		}
		final Map<String, List<PAnnotatedEStructuralFeature>> featuresByTable = new HashMap<String, List<PAnnotatedEStructuralFeature>>();
		for (PAnnotatedEStructuralFeature feature : entity.getPaEStructuralFeatures()) {
			final String tableName = getSecondaryTableName(feature);
			if (!tableNames.contains(tableName)) {
				final String message = "Feature \"" + feature.getAnnotatedElement().getName()
						+ "\" was mapped to undeclared secondary table \"" + tableName + "\".";
				log.error(message);
				throw new MappingException(message);
			}
			List<PAnnotatedEStructuralFeature> featuresInTable = featuresByTable.get(tableName);
			if (featuresInTable == null) {
				featuresInTable = new ArrayList<PAnnotatedEStructuralFeature>();
				featuresByTable.put(tableName, featuresInTable);
			}
			featuresInTable.add(feature);
		}

		// Process features in primary table.
		{
			final List<PAnnotatedEStructuralFeature> featuresInTable = featuresByTable.get(PRIMARY_TABLE_KEY);
			for (PAnnotatedEStructuralFeature feature : featuresInTable) {
				processFeature(feature);
			}
		}
		// Process features in secondary tables.
		for (SecondaryTable secondaryTable : secondaryTables) {
			if (!featuresByTable.containsKey(secondaryTable.getName())) {
				// The table was listed in the SecondaryTable annotation, but no features were actually mapped to this
				// table.
				log.warn("No features mapped to secondary table " + secondaryTable.getName());
				continue;
			}
			final List<PAnnotatedEStructuralFeature> featuresInTable = featuresByTable.get(secondaryTable.getName());

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
			final List<PrimaryKeyJoinColumn> pkJoinColumns = secondaryTable.getPkJoinColumns();
			for (PrimaryKeyJoinColumn pkJoinColumn : pkJoinColumns) {
				final Element keyElement = joinElement.addElement("key");
				keyElement.addAttribute("column", getHbmContext().trunc(pkJoinColumn.getName()));
			}

			// Process features in this secondary table.
			try {
				getHbmContext().setCurrent(joinElement);
				getHbmContext().setCurrentSecondaryTable(secondaryTable);
				for (PAnnotatedEStructuralFeature feature : featuresInTable) {
					processFeature(feature);
				}
			} finally {
				getHbmContext().setCurrentSecondaryTable(null);
				getHbmContext().setCurrent(joinElement.getParent());
			}
		}
	}

	/** Returns the table name from the column annotation or the joincolumn annotation */
	public String getSecondaryTableName(PAnnotatedEStructuralFeature pef) {
		String tableName = null;
		if (pef.getColumn() != null) {
			tableName = pef.getColumn().getTable();
		} else if (pef.getJoinColumns() != null && !pef.getJoinColumns().isEmpty()) {
			tableName = ((JoinColumn) pef.getJoinColumns().get(0)).getTable();
		}
		return tableName;
	}

	/** Process one feature */
	protected void processFeature(PAnnotatedEStructuralFeature paFeature) {
		featureMapper.process(paFeature);
	}

	/**
	 * Adds a key element to the current entity mapping, is for example used to join to the super class table.
	 */
	private void addPrimaryKeyJoinColumn(List<PrimaryKeyJoinColumn> pkJCs) {
		log.debug("Adding primary key join column");

		final Element jcElement = getHbmContext().getCurrent().addElement("key");

		for (PrimaryKeyJoinColumn pkJC : pkJCs) {
			final Element columnElement = jcElement.addElement("column");

			if (pkJC.getColumnDefinition() != null) {
				log.error("Unsupported column definition in primary key join column " + pkJC);
				throw new MappingException("Unsupported column definition in primary key join column", pkJC);
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
			throw new MappingException("Unsupported column definition in discriminator column", dColumn);
		}
		return dcElement;
	}

	/**
	 * Add a synthetic version if the entity does not define one
	 */
	private Element addVersionProperty() {
		assert (getHbmContext().getCurrent().element("version") == null);

		if (!getHbmContext().alwaysVersion()) {
			return null;
		}

		// note specific accessor is required because version accessor is not retrieved through
		// emf tuplizer
		final Element versionElement = getHbmContext().getCurrent().addElement("version").addAttribute("name",
				getHbmContext().getVersionColumnName()).addAttribute("column", getHbmContext().getVersionColumnName());
		final Element meta = new Element("meta");
		meta.addAttribute("attribute", HbMapperConstants.VERSION_META).addText("true");
		versionElement.add(0, meta);

		versionElement.addAttribute("access", getHbmContext().getVersionPropertyHandlerName());

		return versionElement;
	}
}
