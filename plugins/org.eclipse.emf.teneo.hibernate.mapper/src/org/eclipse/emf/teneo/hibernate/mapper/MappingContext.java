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
 * $Id: MappingContext.java,v 1.7 2006/11/28 06:14:01 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.mapper.AbstractProcessingContext;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTable;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint;
import org.eclipse.emf.teneo.ecore.EClassNameStrategy;
import org.eclipse.emf.teneo.ecore.EModelResolver;
import org.eclipse.emf.teneo.simpledom.Document;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.teneo.util.SQLCaseStrategy;

/**
 * Maps a basic attribute with many=true, e.g. list of simpletypes.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class MappingContext extends AbstractProcessingContext {

	/** The xml document to which all elements are added */
	private Document mappingDoc;

	/** The current element, normally a class element */
	private Element currentElement;

	/** Mapping from eclass to entity name */
	private Map entityNames = null;

	/** Keeps track of the list of featuremapmappers created for the current entity */
	private final List featureMapMappers = new ArrayList();

	/** The list of eattributes for which a featuremap mapping was created */
	private final List handledFeatureMapEAttributes = new ArrayList();

	/** the mapper used for features */
	private final FeatureMapper featureMapper;

	/**
	 * Is the current element a mixed or a feature map, in this case all features should be not required. TODO: check,
	 * does this work with embedded components in a feature map?
	 */
	private boolean currentElementFeatureMap = false;

	/** The current table element is set when an entity starts */
	private Table currentTable = null;

	/** The current secondary table being processed. May be null. */
	private SecondaryTable currentSecondaryTable = null;

	/** The entity mapper */
	private final EntityMapper entityMapper;

	/** ERuntime initialized */
	private boolean eRuntimeInitialized = false;

	/** The option to qualify entity names */
	private EClassNameStrategy eclassNameStrategy = null;

	/** Version column name */
	private String versionColumnName = null;

	/** ID column name */
	private String idColumnName = null;

	/** Maximum column name */
	private int maximumSqlNameLength = -1;

	/** The sql case strategy */
	private SQLCaseStrategy sqlCaseStrategy;

	private boolean alwaysVersion;

	/** The constructor */
	public MappingContext() {
		featureMapper = createFeatureMapper();
		entityMapper = new EntityMapper(this);
	}

	/** Returns the entitymapper */
	public EntityMapper getEntityMapper() {
		return entityMapper;
	}

	/** Set relevant properties */
	void setMappingProperties(PersistenceOptions po) {
		eclassNameStrategy = po.getEClassNameStrategy();
		versionColumnName = po.getVersionColumnName();
		idColumnName = po.getIdColumnName();
		maximumSqlNameLength = po.getMaximumSqlNameLength();
		sqlCaseStrategy = po.getSQLCaseStrategy();
		alwaysVersion = po.getAlwaysVersion();
	}

	/** Return the concrete impl. class */
	protected String getInstanceClassName(PAnnotatedEClass aClass) {
		return getInstanceClassName(aClass.getPaModel(), aClass.getAnnotatedEClass());
	}

	/** Return the concrete impl. class */
	protected String getInstanceClassName(PAnnotatedModel paModel, EClass eClass) {
		if (!eRuntimeInitialized) {
			final EPackage[] epackages = new EPackage[paModel.getPaEPackages().size()];
			int cnt = 0;
			for (Iterator it = paModel.getPaEPackages().iterator(); it.hasNext();) {
				final PAnnotatedEPackage pap = (PAnnotatedEPackage) it.next();
				epackages[cnt++] = pap.getAnnotatedEPackage();
			}
			ERuntime.INSTANCE.register(epackages);
			eRuntimeInitialized = true;
		}
		final Class clazz = ERuntime.INSTANCE.getInstanceClass(eClass);
		/*
		 * Handle this in the caller if (clazz == null) { throw new MappingException("No instanceclass can be found for
		 * this eclass: " + aClass.getAnnotatedEClass().getName()); }
		 */
		return clazz.getName();
	}

	/**
	 * @return Returns the entity name for the given entity EClass.
	 */
	public String getEntityName(EClass entityEClass) {
		String name = (String) entityNames.get(entityEClass);
		if (name == null) {
			final Class implClass = getImpl(entityEClass);
			if (implClass != null) {
				name = implClass.getName();
			}
		}
		if (name == null)
			throw new IllegalStateException("An entity name has not been registered for " + entityEClass);
		return name;
	}

	/** Set an entityname for a eclass */
	public void setEntityName(EClass entityEClass, String entityName) {
		entityNames.put(entityEClass, entityName);
	}

	/** Start a document */
	public void beginDocument(Document draft) {
		mappingDoc = draft;
		currentElement = draft.getRoot();
		entityNames = new HashMap();
	}

	/** Finished creating the document */
	public Document endDocument() {
		Document builtDocument = mappingDoc;
		mappingDoc = null;
		currentElement = null;
		entityNames = null;
		return builtDocument;
	}

	/** The current element to which new elements are added */
	public Element getCurrent() {
		return currentElement;
	}

	/** Set the current element to which new elements are added */
	public void setCurrent(Element newCurrent) {
		this.currentElement = newCurrent;
	}

	/**
	 * Note this call will also clear the current list of featuremappers;
	 * 
	 * @return the featureMapMappers gathered during the entity processing
	 */
	public List getClearFeatureMapMappers() {
		final ArrayList result = new ArrayList(featureMapMappers); // clone the list!
		featureMapMappers.clear();
		return result;
	}

	/**
	 * @param Adds
	 *            a featureMapMapper to the featuremapp mapper list
	 */
	public void addFeatureMapMapper(FeatureMapMapping featureMapMapper) {
		if (!handledFeatureMapEAttributes.contains(featureMapMapper.getEAttribute())) {
			featureMapMappers.add(featureMapMapper);
			handledFeatureMapEAttributes.add(featureMapMapper.getEAttribute());
		}
	}

	/**
	 * @return The builder used by entity mapped that maps features to hbm.
	 */
	private FeatureMapper createFeatureMapper() {
		final FeatureMapper featureMapper = new FeatureMapper();

		featureMapper.setBasicMapper(new BasicMapper(this));
		featureMapper.setManyAttributeMapper(new ManyAttributeMapper(this));
		featureMapper.setEmbeddedMapper(new EmbeddedMapper(this));
		featureMapper.setIdMapper(new IdMapper(this));
		featureMapper.setManyToManyMapper(new ManyToManyMapper(this));
		featureMapper.setManyToOneMapper(new ManyToOneMapper(this));
		featureMapper.setOneToManyMapper(new OneToManyMapper(this));
		featureMapper.setOneToOneMapper(new OneToOneMapper(this));
		return featureMapper;
	}

	/** process the features of the annotated eclass */
	protected void processFeatures(List features) {
		for (Iterator i = features.iterator(); i.hasNext();) {
			entityMapper.processFeature((PAnnotatedEStructuralFeature) i.next());
		}
	}

	/**
	 * @return the featureMapper
	 */
	public FeatureMapper getFeatureMapper() {
		return featureMapper;
	}

	/**
	 * @return the currentElementFeatureMap
	 */
	public boolean isCurrentElementFeatureMap() {
		return currentElementFeatureMap;
	}

	/**
	 * @param currentElementFeatureMap
	 *            the currentElementFeatureMap to set
	 */
	public void setCurrentElementFeatureMap(boolean currentElementFeatureMap) {
		this.currentElementFeatureMap = currentElementFeatureMap;
	}

	/**
	 * @return the currentTable
	 */
	public Table getCurrentTable() {
		return currentTable;
	}

	/**
	 * @param currentTable
	 *            the currentTable to set
	 */
	public void setCurrentTable(Table currentTable) {
		this.currentTable = currentTable;
	}

	/**
	 * @param currentSecondaryTable
	 */
	public void setCurrentSecondaryTable(SecondaryTable currentSecondaryTable) {
		this.currentSecondaryTable = currentSecondaryTable;
	}

	/** Get unique constraint key. */
	public String getUniqueConstraintKey(String colName) {
		// Obtain UniqueConstraints from secondary or primary table.
		List uniqueConstraints = null;
		if (currentSecondaryTable != null) {
			uniqueConstraints = currentSecondaryTable.getUniqueConstraints();
		} else if (currentTable != null) {
			uniqueConstraints = currentTable.getUniqueConstraints();
		}
		if (uniqueConstraints == null) {
			return null;
		}

		// NOTE: Hibernate does not support one column being part of multiple unique constraints.
		for (int i = 0, n = uniqueConstraints.size(); i < n; i++) {
			UniqueConstraint uniqueConstraint = (UniqueConstraint) uniqueConstraints.get(i);
			if (uniqueConstraint.getColumnNames().contains(colName)) {
				return "c" + i;
			}

		}
		return null;
	}

	/**
	 * @return the versionColumnName
	 */
	public String getVersionColumnName() {
		return versionColumnName;
	}

	/**
	 * @param versionColumnName
	 *            the versionColumnName to set
	 */
	public void setVersionColumnName(String versionColumnName) {
		this.versionColumnName = versionColumnName;
	}

	/**
	 * @return the maximumColumnNameLength
	 */
	public int getMaximumColumnNameLength() {
		return maximumSqlNameLength;
	}

	/** Default is tru */
	String trunc(String name) {
		return trunc(name, true);
	}

	/** Utilit method to truncate a column name */
	String trunc(String name, boolean truncSuffix) {
		if (maximumSqlNameLength == -1)
			return escape(escape(name));
		if (name.length() < maximumSqlNameLength)
			return escape(escape(name));

		// truncate the part before the last _ because this is often the suffix
		final int underscore = name.lastIndexOf('_');
		if (truncSuffix && underscore != -1 && underscore > 0) {
			final String usStr = name.substring(underscore);
			if ((maximumSqlNameLength - usStr.length()) < 0) {
				return escape(name);
			}
			return escape(name.substring(0, maximumSqlNameLength - usStr.length()) + usStr);
		}

		return escape(name.substring(0, maximumSqlNameLength));
	}

	/** Escape the column name */
	String escape(String name) {
		if (name.indexOf('`') == 0) {
			return sqlCaseStrategy.convert(name);
		}

		return "`" + sqlCaseStrategy.convert(name) + "`";
	}

	/**
	 * @return the idColumnName
	 */
	public String getIdColumnName() {
		return idColumnName;
	}

	/** Return the alwaysversion option */
	public boolean alwaysVersion() {
		return alwaysVersion;
	}

	/** Returns the list of eattrs, note list is updated outside of this object */
	public List getHandledFeatureMapEAttributes() {
		return handledFeatureMapEAttributes;
	}

	/** Returns the correct property name */
	public String getPropertyName(EStructuralFeature ef) {
		return EModelResolver.instance().getJavaMember(ef);
	}

	/** Return the version property handler */
	public String getVersionPropertyHandlerName() {
		return "org.eclipse.emf.teneo.hibernate.mapping.property.VersionPropertyHandler";
	}

	/** Return the id property handler */
	public String getIdPropertyHandlerName() {
		return "org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierPropertyHandler";
	}

	/** There are four cases: EMF generated, EMF Dynamic, Easy EMF Generated, Easy EMF Dynamic */
	public boolean isEasyEMFGenerated(EClassifier eclassifier) {
		return EModelResolver.instance().hasImplementationClass(eclassifier);
	}

	public boolean isEasyEMFDynamic(EClassifier eclassifier) {
		return !isEasyEMFGenerated(eclassifier) && EModelResolver.instance().isRegistered(eclassifier.getEPackage());
	}

	public boolean isEMFGenerated(EClassifier eclassifier) {
		return eclassifier.getInstanceClass() != null;
	}

	public boolean isEMFDynamic(EClassifier eclassifier) {
		return !isEasyEMFDynamic(eclassifier) && !isEMFGenerated(eclassifier);
	}

	/** Check if this is an entity (so without an impl class) */
	public Class getImpl(EClassifier eclassifier) {
		return EModelResolver.instance().getJavaClass(eclassifier);
	}

	/** Check if this is an entity (so without an impl class) */
	public boolean hasImpl(PAnnotatedEStructuralFeature af) {
		return EModelResolver.instance().hasImplementationClass(
				af.getAnnotatedEStructuralFeature().getEContainingClass());
	}

	/** Add a tuplizer element or not */
	public void addTuplizerElement(Element entityElement, PAnnotatedEClass aclass) {
	}

	/** Returns the enumusertype class name */
	public String getEnumUserType() {
		return "org.eclipse.emf.teneo.hibernate.mapping.ENumUserType";
	}

	/** Returns the enum user type integer name */
	public String getEnumIntegerUserType() {
		return "org.eclipse.emf.teneo.hibernate.mapping.ENumUserIntegerType";
	}

	/** Returns the enumusertype class name for the dynamic case */
	public String getDynamicEnumUserType() {
		return "org.eclipse.emf.teneo.hibernate.mapping.DynamicENumUserType";
	}

	/** Returns the enum user type integer name for the dynamic case */
	public String getDynamicEnumIntegerUserType() {
		return "org.eclipse.emf.teneo.hibernate.mapping.DynamicENumUserIntegerType";
	}

	/** Return the default user type */
	public String getDefaultUserType() {
		return "org.eclipse.emf.teneo.hibernate.mapping.DefaultToStringUserType";
	}

	/** Returns the default any type */
	public String getAnytype() {
		return "org.eclipse.emf.teneo.hibernate.mapping.AnyEObjectType";
	}

	/**
	 * @return the eclassNameStrategy
	 */
	public EClassNameStrategy getEClassNameStrategy() {
		return eclassNameStrategy;
	}
}