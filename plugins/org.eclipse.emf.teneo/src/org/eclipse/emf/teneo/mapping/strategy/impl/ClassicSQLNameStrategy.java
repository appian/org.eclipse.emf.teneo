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
 * $Id: ClassicSQLNameStrategy.java,v 1.1 2007/06/29 07:31:47 mtaal Exp $
 */

package org.eclipse.emf.teneo.mapping.strategy.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.SQLNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.StrategyUtil;
import org.eclipse.emf.teneo.util.AssertUtil;

/**
 * Implements the sql naming strategy of older versions of Teneo. This implementation
 * is driven by the options set in the PersistenceOptions.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class ClassicSQLNameStrategy implements SQLNameStrategy {

	// The logger
	protected static final Log log = LogFactory.getLog(ClassicSQLNameStrategy.class);

	// The local members for several options
	private String optionJoinTableNamingStrategy;
	private String optionJoinColumnNamingStrategy;
	private int optionMaximumSqlLength;
	private EntityNameStrategy optionEntityNameStrategy;
	private PersistenceOptions persistenceOptions;
	private boolean optionSQLUpperCase = false;
	private boolean optionSQLLowerCase = false;

	public String getPrimaryKeyJoinColumnName(PAnnotatedEClass aSuperClass, String idFeature) {
		return convert(getEntityName(aSuperClass.getPaModel(), aSuperClass.getAnnotatedEClass()) + "_" + idFeature,
			true);
	}

	public String getSecondaryTablePrimaryKeyJoinColumnName(PAnnotatedEStructuralFeature iddef) {
		return convert(iddef.getAnnotatedEStructuralFeature().getName());
	}

	/** Returns the table name for a passed AnnotatedEClass */
	public String getTableName(PAnnotatedEClass aClass) {
		return convert(getEntityName(aClass.getPaModel(), aClass.getAnnotatedEClass()));
	}

	public String getColumnName(PAnnotatedEStructuralFeature aStructuralFeature) {
		return convert(aStructuralFeature.getAnnotatedEStructuralFeature().getName());
	}

	/** 
	 * Return the name of the foreign key used for this aReference. 
	 * If null is returned then the name of the foreign key is not set
	 * Returns null in this case.
	 */
	public String getForeignKeyName(PAnnotatedEReference aReference) {
		return null;
	}

	/** Return joincolumn names for many-to-one */
	public List<String> getManyToOneJoinColumnNames(PAnnotatedEReference aReference) {
		final EReference eref = aReference.getAnnotatedEReference();

		assert (!eref.isMany()); // otherwise this should have been a mtm

		// in case of many-to-one to qualify use the name of the class to which is refered
		// this is just there for backward compatibility, see the case of
		// the manytoone and onetoone below.
		final PAnnotatedEClass aClass;
		if (eref.getEOpposite() == null) {
			aClass = aReference.getAReferenceType();
		} else {
			// the aclass is just the class of the structuralfeature itself.
			// this is the most common case the name of the join column reflects
			// the owner of the one-to-many
			aClass = aReference.getPaEClass();
		}
		final String typeName = aClass.getAnnotatedEClass().getName();
		final String featureName = eref.getName();

		final List<String> result = new ArrayList<String>();
		final List<String> names =
				StrategyUtil.getIDFeaturesNames(aClass, persistenceOptions.getDefaultIDFeatureName());
		final boolean simpleNaming = optionJoinColumnNamingStrategy.compareTo("simple") == 0;
		for (String name : names) {
			final String postFix;
			if (names.size() == 1 && simpleNaming) {
				postFix = "";
			} else {
				postFix = "_" + name;
			}

			final String jcName;
			if (simpleNaming) {
				jcName = featureName + postFix;
			} else { // backward compatibility
				jcName = typeName + "_" + featureName + postFix;
			}
			result.add(convert(jcName, true));
		}
		return result;
	}

	/** Return a list of join columns for a many is eAttribute */
	public List<String> getOneToManyEAttributeJoinColumns(PAnnotatedEAttribute aAttribute) {
		final PAnnotatedEClass aClass = aAttribute.getPaEClass();
		final String typeName = aClass.getAnnotatedEClass().getName();
		final String featureName = aAttribute.getAnnotatedEAttribute().getName();

		final List<String> result = new ArrayList<String>();
		final List<String> names =
				StrategyUtil.getIDFeaturesNames(aClass, persistenceOptions.getDefaultIDFeatureName());
		final boolean simpleNaming = optionJoinColumnNamingStrategy.compareTo("simple") == 0;
		for (String name : names) {
			final String postFix;
			if (names.size() == 1 && simpleNaming) {
				postFix = "";
			} else {
				postFix = "_" + name;
			}

			final String jcName = typeName + "_" + featureName + postFix;
			result.add(convert(jcName, true));
		}
		return result;
	}

	/** Return a list of join columns for a many is eReference */
	public List<String> getOneToManyEReferenceJoinColumns(PAnnotatedEReference aReference) {
		final PAnnotatedEClass aClass = aReference.getPaEClass();
		final String typeName;
		final String featureName;
		// for backwards compatibility if the other side is there then use the name
		// of the other side for the typeName and featureName. The many-to-one determines
		// the naming
		if (aReference.getAnnotatedEReference().getEOpposite() != null) {
			typeName = aReference.getAReferenceType().getAnnotatedEClass().getName();
			featureName = aReference.getAnnotatedEReference().getEOpposite().getName();
		} else {
			typeName = aClass.getAnnotatedEClass().getName();
			featureName = aReference.getAnnotatedEReference().getName();
		}

		final List<String> result = new ArrayList<String>();
		final List<String> names =
				StrategyUtil.getIDFeaturesNames(aClass, persistenceOptions.getDefaultIDFeatureName());
		final boolean simpleNaming = optionJoinColumnNamingStrategy.compareTo("simple") == 0;
		for (String name : names) {
			final String postFix;
			if (names.size() == 1 && simpleNaming) {
				postFix = "";
			} else {
				postFix = "_" + name;
			}

			final String jcName = typeName + "_" + featureName + postFix;
			result.add(convert(jcName, true));
		}
		return result;
	}

	/** 
	 * Return a list of join columns for a join table for a many to many
	 */
	public List<String> getJoinTableJoinColumns(PAnnotatedEReference aReference, boolean inverse) {
		final PAnnotatedEClass aClass = aReference.getPaEClass();

		final String typeName;
		String featureName;
		if (inverse) {
			if (aReference.getAnnotatedEReference().getEOpposite() != null) {
				typeName = aReference.getAReferenceType().getAnnotatedEClass().getName();
				featureName = "_" + aReference.getAnnotatedEReference().getEOpposite().getName();
			} else {
				typeName = aClass.getAnnotatedEClass().getName();
				featureName = "";
			}
		} else {
			typeName = aClass.getAnnotatedEClass().getName();
			featureName = "_" + aReference.getAnnotatedEReference().getName();
		}
		// for backward compatibility, only use featurename if the reference is
		// to itself
		if (aReference.getAReferenceType() != aClass) {
			featureName = "";
		}

		final List<String> result = new ArrayList<String>();
		final List<String> names =
				StrategyUtil.getIDFeaturesNames(aClass, persistenceOptions.getDefaultIDFeatureName());
		final boolean simpleNaming = optionJoinColumnNamingStrategy.compareTo("simple") == 0;
		for (String name : names) {
			final String postFix;
			if (names.size() == 1 && simpleNaming) {
				postFix = "";
			} else {
				postFix = "_" + name;
			}

			final String jcName = typeName + featureName + postFix;
			result.add(convert(jcName, true));
		}
		return result;
	}

	/** Return the name of the join table */
	public String getJoinTableName(PAnnotatedEReference aReference) {
		final EReference eReference = aReference.getAnnotatedEReference();
		final boolean isEObject = eReference.getEType() == DefaultEntityNameStrategy.EOBJECT_ECLASS;
		final String jTableName;

		EReference eOpposite = eReference.getEOpposite();
		if (aReference.getManyToMany() != null && aReference.getManyToMany().isIndexed()) {
			// In case the reference is not indexed then one join table can be
			// used for both sides
			// If indexed then separate join tables should be used.
			eOpposite = null; // trick to force a specific naming
		}

		if (!isEObject && optionJoinTableNamingStrategy.compareToIgnoreCase("ejb3") == 0) {
			// table name is the entityname of the eclass of the reference and entityname of
			// the eclass of the refered to
			final String thisEntityName = getEntityName(aReference.getPaModel(), eReference.getEContainingClass());
			final String thatEntityName = getEntityName(aReference.getPaModel(), eReference.getEReferenceType());

			if (eOpposite != null && eOpposite.isMany() && compareNames(eReference, eOpposite)) {
				jTableName = thatEntityName + "_" + thisEntityName;
			} else {
				jTableName = thisEntityName + "_" + thatEntityName;
			}
		} else {
			AssertUtil.assertTrue("option optionJoinTableNamingStrategy " + optionJoinTableNamingStrategy
					+ " not supported", isEObject || optionJoinTableNamingStrategy.compareToIgnoreCase("unique") == 0);
			if (eOpposite != null && eOpposite.isMany() && compareNames(eReference, eOpposite)) {
				final String thatEntityName = getEntityName(aReference.getPaModel(), eOpposite.getEContainingClass());
				jTableName = thatEntityName + "_" + eOpposite.getName();
			} else {
				final String thisEntityName = getEntityName(aReference.getPaModel(), eReference.getEContainingClass());
				jTableName = thisEntityName + "_" + eReference.getName();
			}
		}
		return convert(jTableName);
	}

	public String getDiscriminatorColumnName() {
		return convert("DTYPE"); // replace with constant somewhere
	}

	/** 
	 * Return the name of the version column used.
	 */
	public String getVersionColumnName() {
		return convert(persistenceOptions.getVersionColumnName());
	}

	/**
	 * Return the column name for the id column of the idbag join table. 
	 */
	public String getIdBagIDColumn() {
		return convert(persistenceOptions.getIDBagIDColumnName());
	}

	/** Return the column name for the synthetic ID column */
	public String getSyntheticIDColumnName() {
		return convert(persistenceOptions.getIdColumnName());
	}

	/** 
	 * Sets the PersistenceOptions used. This is mainly to support backward compatibility
	 * with older version in which the naming strategy was controlled by options. 
	 */
	public void setPersistenceOptions(PersistenceOptions po) {
		optionMaximumSqlLength = po.getMaximumSqlNameLength();
		optionJoinTableNamingStrategy = po.getJoinTableNamingStrategy();
		optionJoinColumnNamingStrategy = po.getJoinColumnNamingStrategy();
		optionEntityNameStrategy = po.getEntityNameStrategy();

		final String optionSQLCaseStrategy = po.getSQLCaseStrategy();
		if (optionSQLCaseStrategy.toLowerCase().compareTo("lowercase") == 0) {
			optionSQLLowerCase = true;
		} else if (optionSQLCaseStrategy.toLowerCase().compareTo("uppercase") == 0) {
			optionSQLUpperCase = true;
		}
		persistenceOptions = po;
	}

	// Returns the entityname of the refered to entity
	private String getEntityName(PAnnotatedModel paModel, EClass eClass) {
		return StrategyUtil.getEntityName(optionEntityNameStrategy, persistenceOptions, paModel, eClass);
	}

	public String convert(String name) {
		return convert(name, false);
	}

	private String convert(String name, boolean truncSuffix) {
		final String result = StrategyUtil.trunc(optionMaximumSqlLength, name, truncSuffix);
		if (optionSQLLowerCase) {
			return result.toLowerCase();
		} else if (optionSQLUpperCase) {
			return result.toUpperCase();
		} else {
			return result;
		}
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
}