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
 * $Id: MappingContext.java,v 1.9 2008/02/28 07:09:03 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper;

import java.util.HashMap;
import java.util.Stack;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.annotations.mapper.AbstractProcessingContext;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.extension.ExtensionInitializable;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.extension.ExtensionManagerAware;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.jpox.mapper.association.EmbeddedMapper;
import org.eclipse.emf.teneo.jpox.mapper.association.ManyToManyMapper;
import org.eclipse.emf.teneo.jpox.mapper.association.ManyToOneMapper;
import org.eclipse.emf.teneo.jpox.mapper.association.OneToManyMapper;
import org.eclipse.emf.teneo.jpox.mapper.association.OneToOneMapper;
import org.eclipse.emf.teneo.jpox.mapper.property.BasicMapper;
import org.eclipse.emf.teneo.jpox.mapper.property.ColumnMapper;
import org.eclipse.emf.teneo.jpox.mapper.property.EClassFeatureMapper;
import org.eclipse.emf.teneo.jpox.mapper.property.IdMapper;
import org.eclipse.emf.teneo.jpox.mapper.property.InheritanceMapper;
import org.eclipse.emf.teneo.jpox.mapper.property.JoinColumnMapper;
import org.eclipse.emf.teneo.jpox.mapper.property.ManyBasicMapper;
import org.eclipse.emf.teneo.jpox.mapper.property.TableMapper;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;

/**
 * Contains instances of the mappers used.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class MappingContext extends AbstractProcessingContext implements ExtensionPoint, ExtensionManagerAware,
		ExtensionInitializable {

	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(MappingContext.class);

	/** The one to many mapper */
	private OneToManyMapper otmMapper;

	/** The many to many mapper used */
	private ManyToManyMapper mtmMapper;

	/** Mapper for one to one associations */
	private OneToOneMapper otoMapper;

	/** Mapper for many to one association */
	private ManyToOneMapper mtoMapper;

	/** Maps the inheritance annotation */
	private InheritanceMapper inheritanceMapper;

	/** Maps the column annotation */
	private ColumnMapper columnMapper;

	/** Maps the id annotation */
	private IdMapper idMapper;

	/** Maps the basic annotation */
	private BasicMapper basicMapper;

	/** Maps the basic annotation with many=true */
	private ManyBasicMapper manyBasicMapper;

	/** The naming handler */
	private NamingHandler namingHandler;

	/** The pannotated model for which this is done */
	private PAnnotatedModel paModel;

	/**
	 * The stack of current features to map, note an arraylist is used because sometimes it is
	 * required to search one or two levels down in the stack to search for attribute overrides
	 */
	private Stack mappedEFeatures = new Stack();

	/**
	 * The current element being mapped, this element is not on the stack! This is so because to
	 * handle attributeoverrides the parent of the current feature should be used this one is on the
	 * stack.
	 */
	private PAnnotatedEStructuralFeature currentAFeature = null;

	/** The current aclass being mapped */
	private PAnnotatedEClass currentAClass = null;

	/** The map from efeature to attributeoverrides */
	private HashMap attributeOverridesByFeature = new HashMap();

	/** Maps the features of an eclass */
	private EClassFeatureMapper eClassFeatureMapper;

	/** Maps an embedded field */
	private EmbeddedMapper embeddedMapper;

	/** The joincolumn mapper */
	private JoinColumnMapper jcMapper;

	/** The tableMapper */
	private TableMapper tableMapper;

	/** The eclass naming strategy */
	private EntityNameStrategy entityNameStrategy;

	/** The epackages for which this is all done */
	private EPackage[] epackages;

	/** Force optional, in case of singletable */
	private boolean forceOptional = false;

	/** The extensionManager */
	private ExtensionManager extensionManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.extension.ExtensionInitializable#initializeExtension()
	 */
	public void initializeExtension() {
		namingHandler = getExtensionManager().getExtension(NamingHandler.class);
		otmMapper = createMapper(OneToManyMapper.class);
		mtmMapper = createMapper(ManyToManyMapper.class);
		otoMapper = createMapper(OneToOneMapper.class);
		mtoMapper = createMapper(ManyToOneMapper.class);
		inheritanceMapper = createMapper(InheritanceMapper.class);
		columnMapper = createMapper(ColumnMapper.class);
		idMapper = createMapper(IdMapper.class);
		basicMapper = createMapper(BasicMapper.class);
		manyBasicMapper = createMapper(ManyBasicMapper.class);
		eClassFeatureMapper = createMapper(EClassFeatureMapper.class);
		embeddedMapper = createMapper(EmbeddedMapper.class);
		jcMapper = createMapper(JoinColumnMapper.class);
		tableMapper = createMapper(TableMapper.class);
	}

	protected <T> T createMapper(Class<T> clz) {
		final T t = getExtensionManager().getExtension(clz);
		((AbstractMapper) t).setMappingContext(this);
		return t;
	}

	/**
	 * @return the basicMapper
	 */
	public BasicMapper getBasicMapper() {
		return basicMapper;
	}

	/**
	 * @return the columnMapper
	 */
	public ColumnMapper getColumnMapper() {
		return columnMapper;
	}

	/**
	 * @return the idMapper
	 */
	public IdMapper getIdMapper() {
		return idMapper;
	}

	/**
	 * @return the inheritanceMapper
	 */
	public InheritanceMapper getInheritanceMapper() {
		return inheritanceMapper;
	}

	/**
	 * @return the manyBasicMapper
	 */
	public ManyBasicMapper getManyBasicMapper() {
		return manyBasicMapper;
	}

	/**
	 * @return the mtmMapper
	 */
	public ManyToManyMapper getManyToManyMapper() {
		return mtmMapper;
	}

	/**
	 * @return the mtoMapper
	 */
	public ManyToOneMapper getManyToOneMapper() {
		return mtoMapper;
	}

	/**
	 * @return the namingHandler
	 */
	public NamingHandler getNamingHandler() {
		return namingHandler;
	}

	/**
	 * @return the otmMapper
	 */
	public OneToManyMapper getOneToManyMapper() {
		return otmMapper;
	}

	/**
	 * @return the otoMapper
	 */
	public OneToOneMapper getOneToOneMapper() {
		return otoMapper;
	}

	/**
	 * @return the eClassFeatureMapper
	 */
	public EClassFeatureMapper getEClassFeatureMapper() {
		return eClassFeatureMapper;
	}

	/**
	 * Notifies that a certain feature is being mapped, the feature is pushed on the stack. This is
	 * used to handle attributeoverrides
	 */
	public void startMapping(PAnnotatedEStructuralFeature annotatedFeature) {
		mappedEFeatures.push(currentAFeature);
		currentAFeature = annotatedFeature;
	}

	/** Ends the mapping of the feature */
	public void endMapping(PAnnotatedEStructuralFeature aFeature) {
		assert (aFeature == currentAFeature);
		currentAFeature = (PAnnotatedEStructuralFeature) mappedEFeatures.pop();
	}

	/** Assert size is 0 */
	public void assertEmpty() {
		assert (mappedEFeatures.empty());
		assert (attributeOverridesByFeature.isEmpty());
	}

	/**
	 * @return the embeddedMapper
	 */
	public EmbeddedMapper getEmbeddedMapper() {
		return embeddedMapper;
	}

	/**
	 * @return the jcMapper
	 */
	public JoinColumnMapper getJoinColumnMapper() {
		return jcMapper;
	}

	/**
	 * @return the tableMapper
	 */
	public TableMapper getTableMapper() {
		return tableMapper;
	}

	/**
	 * @return the currentAClass
	 */
	public PAnnotatedEClass getCurrentAClass() {
		return currentAClass;
	}

	/**
	 * @param currentAClass
	 *            the currentAClass to set
	 */
	public void setCurrentAClass(PAnnotatedEClass currentAClass) {
		this.currentAClass = currentAClass;
	}

	/**
	 * @return the eclassNameStrategy
	 */
	public EntityNameStrategy getEntityNameStrategy() {
		if (entityNameStrategy == null) {
			entityNameStrategy = getExtensionManager().getExtension(EntityNameStrategy.class);
			entityNameStrategy.setPaModel(getPaModel());

		}
		return entityNameStrategy;
	}

	/**
	 * @return the epackages
	 */
	public EPackage[] getEpackages() {
		return epackages;
	}

	/**
	 * @param epackages
	 *            the epackages to set
	 */
	public void setEpackages(EPackage[] epackages) {
		this.epackages = epackages;
	}

	/**
	 * @return the forceOptional
	 */
	public boolean isForceOptional() {
		return forceOptional;
	}

	/**
	 * @param forceOptional
	 *            the forceOptional to set
	 */
	public void setForceOptional(boolean forceOptional) {
		this.forceOptional = forceOptional;
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

	/**
	 * @return the paModel
	 */
	public PAnnotatedModel getPaModel() {
		return paModel;
	}

	/**
	 * @param paModel
	 *            the paModel to set
	 */
	public void setPaModel(PAnnotatedModel paModel) {
		this.paModel = paModel;
	}
}