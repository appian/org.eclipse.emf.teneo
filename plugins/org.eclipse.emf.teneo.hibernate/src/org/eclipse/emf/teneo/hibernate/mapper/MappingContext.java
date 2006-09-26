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
 * $Id: MappingContext.java,v 1.6 2006/09/26 13:23:06 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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
import org.eclipse.emf.teneo.annotations.processing.FeatureProcessor;
import org.eclipse.emf.teneo.simpledom.Document;
import org.eclipse.emf.teneo.simpledom.Element;
import org.eclipse.emf.teneo.util.SQLCaseStrategy;

/**
 * Maps a basic attribute with many=true, e.g. list of simpletypes.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
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

	/** the mapper used for features */
	private final FeatureProcessor featureProcessor;

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
	private String qualifyEntityNames = null;

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
	MappingContext() {
		featureProcessor = createFeatureProcessor();
		entityMapper = new EntityMapper(this);
	}

	/** Returns the entitymapper */
	public EntityMapper getEntityMapper() {
		return entityMapper;
	}

	/** Set relevant properties */
	void setMappingProperties(PersistenceOptions po) {
		qualifyEntityNames = po.getQualifyEntityName();
		versionColumnName = po.getVersionColumnName();
		idColumnName = po.getIdColumnName();
		maximumSqlNameLength = po.getMaximumSqlNameLength();
		sqlCaseStrategy = po.getSQLCaseStrategy();
        alwaysVersion = po.getAlwaysVersion();
	}

	/** Return the concrete impl. class */
	synchronized String getInstanceClassName(PAnnotatedEClass aClass) {
		return getInstanceClassName(aClass.getPaModel(), aClass.getAnnotatedEClass());
	}

	/** Return the concrete impl. class */
	synchronized String getInstanceClassName(PAnnotatedModel paModel, EClass eClass) {
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
		 * Handle this in the caller if (clazz == null) { throw new ProcessingException("No instanceclass can be found
		 * for this eclass: " + aClass.getAnnotatedEClass().getName()); }
		 */
		return clazz.getName();
	}

	/**
	 * @return Returns the entity name for the given entity EClass.
	 */
	public String getEntityName(EClass entityEClass) {
		final String name = (String) entityNames.get(entityEClass);
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
		featureMapMappers.add(featureMapMapper);
	}

	/**
	 * @return The builder used by entity mapped that maps features to hbm.
	 */
	private FeatureProcessor createFeatureProcessor() {
		final FeatureProcessor featureMapper = new FeatureProcessor();

		final BasicMapper basicMapper = new BasicMapper(this);
		final ManyAttributeMapper manyAttributeMapper = new ManyAttributeMapper(this);
		final EmbeddedMapper embeddedMapper = new EmbeddedMapper(this);
		final IdMapper idMapper = new IdMapper(this);
		final ManyToManyMapper manyToManyMapper = new ManyToManyMapper(this);
		final ManyToOneMapper manyToOneMapper = new ManyToOneMapper(this);
		final OneToManyMapper oneToManyMapper = new OneToManyMapper(this);
		final OneToOneMapper oneToOneMapper = new OneToOneMapper(this);
        final UnclassifiableMapper unclassifiableMapper = new UnclassifiableMapper(this, featureMapper);

		featureMapper.setBasicProcessor(basicMapper);
		featureMapper.setTransientProcessor(basicMapper);
		featureMapper.setVersionProcessor(basicMapper);
		featureMapper.setManyAttributeProcessor(manyAttributeMapper);
		featureMapper.setEmbeddedProcessor(embeddedMapper);
		featureMapper.setIdProcessor(idMapper);
		featureMapper.setManyToManyProcessor(manyToManyMapper);
		featureMapper.setManyToOneProcessor(manyToOneMapper);
		featureMapper.setOneToManyProcessor(oneToManyMapper);
		featureMapper.setOneToOneProcessor(oneToOneMapper);

		featureMapper.setUnclassifiableProcessor(unclassifiableMapper);
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
	public FeatureProcessor getFeatureProcessor() {
		return featureProcessor;
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
	 * @return the qualifyEntityNames
	 */
	public String getQualifyEntityNames() {
		return qualifyEntityNames;
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
}