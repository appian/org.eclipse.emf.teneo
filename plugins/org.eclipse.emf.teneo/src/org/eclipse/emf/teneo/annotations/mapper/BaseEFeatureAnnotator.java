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
 * $Id: BaseEFeatureAnnotator.java,v 1.3 2008/01/18 06:20:24 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pannotation.CascadeType;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.ForeignKey;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;

/**
 * Placeholder for several utility methods which are relevant for annotating ereferences and
 * eattributes.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public abstract class BaseEFeatureAnnotator extends AbstractAnnotator {

	// The source of the annotations of extended metadata used by emf
	private static final String ANNOTATION_SOURCE_METADATA = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";

	// The logger
	protected static final Log log = LogFactory.getLog(BaseEFeatureAnnotator.class);

	private int defaultVarCharLength = -1;

	/** Create a foreign key and set its name */
	protected ForeignKey createFK(PAnnotatedEStructuralFeature aFeature) {
		final ForeignKey fk = getFactory().createForeignKey();
		fk.setName(getSqlNameStrategy().getForeignKeyName(aFeature));
		return fk;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.annotations.mapper.AbstractAnnotator#setPersistenceOptions(org.eclipse.emf.teneo.PersistenceOptions)
	 */
	@Override
	public void setPersistenceOptions(PersistenceOptions persistenceOptions) {
		super.setPersistenceOptions(persistenceOptions);

		defaultVarCharLength = persistenceOptions.getDefaultVarCharLength();
	}

	/**
	 * Adds the column level constraints on the basis of the xsd extended meta data
	 */
	protected void addColumnConstraints(PAnnotatedEAttribute aAttribute) {

		final EAttribute eAttribute = aAttribute.getModelEAttribute();

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
			if (maxLength != null || totalDigits != null || fractionDigits != null || defaultVarCharLength > -1) {
				final Column column = getFactory().createColumn();
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

		final Column c = aAttribute.getColumn();
		if (isStringType(aAttribute.getModelEAttribute()) && c != null && defaultVarCharLength > 0 && !c.isSetLength()) {
			c.setLength(defaultVarCharLength);
		}
	}

	private boolean isStringType(EAttribute eAttribute) {
		final Class<?> clz = eAttribute.getEAttributeType().getInstanceClass();
		if (clz != null && String.class.isAssignableFrom(clz)) {
			return true;
		}
		if (eAttribute.getEAttributeType() == XMLTypePackage.eINSTANCE.getString()) {
			return true;
		}
		if (eAttribute.getEAttributeType() == XMLTypePackage.eINSTANCE.getName_()) {
			return true;
		}
		if (eAttribute.getEAttributeType() == XMLTypePackage.eINSTANCE.getNCName()) {
			return true;
		}
		if (eAttribute.getEAttributeType() == XMLTypePackage.eINSTANCE.getToken()) {
			return true;
		}
		if (eAttribute.getEAttributeType() == XMLTypePackage.eINSTANCE.getQName()) {
			return true;
		}
		return false;
	}

	/** Return a list of join columns */
	protected List<JoinColumn> getJoinColumns(List<String> names, boolean optional, boolean isUpdateInsertable,
			PAnnotation pAnnotation) {
		final List<JoinColumn> result = new ArrayList<JoinColumn>();
		for (String name : names) {
			JoinColumn jc = getFactory().createJoinColumn();
			jc.setName(name);
			jc.setNullable(optional);
			jc.setUpdatable(isUpdateInsertable);
			jc.setInsertable(isUpdateInsertable);
			result.add(jc);
		}
		return result;
	}

	/** Returns the type name of a many attribute */
	protected String getTargetTypeName(PAnnotatedEAttribute aAttribute) {
		final EAttribute eAttribute = aAttribute.getModelEAttribute();
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

	/** Walks up a edatatype inheritance structure to find the itemType */
	protected ArrayList<EClassifier> getItemTypes(EDataType eDataType) {
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
	protected EClassifier getEClassifier(EPackage epackage, String searchName) {
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

	/** Get a specific extended metadate */
	protected String getExtendedMetaData(EAttribute eAttribute, String key) {
		String value = getEAnnotationValue(eAttribute, "http:///org/eclipse/emf/ecore/util/ExtendedMetaData", key);
		if (value == null) {
			value =
					getEAnnotationValue(eAttribute.getEAttributeType(),
						"http:///org/eclipse/emf/ecore/util/ExtendedMetaData", key);
		}
		return value;
	}

	/** Returns the value of an annotation with a certain key */
	protected String getEAnnotationValue(EModelElement eModelElement, String source, String key) {
		final EAnnotation eAnnotation = eModelElement.getEAnnotation(source);
		if (eAnnotation == null) {
			return null;
		}
		return eAnnotation.getDetails().get(key);
	}

	/** Determines if mapped by should be set */
	protected boolean setMappedBy(EReference eReference) {
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
	protected boolean compareNames(EReference here, EReference there) {
		final String nameHere = here.eClass().getName() + here.getName();
		final String nameThere = there.eClass().getName() + there.getName();
		assert (nameHere.compareTo(nameThere) != 0);
		return nameHere.compareTo(nameThere) > 0;
	}

	/**
	 * Checks if the cascade should be set in the cascade list, is only done if the list is empty
	 */
	protected void setCascade(List<CascadeType> cascadeList, boolean isContainment) {
		if (!cascadeList.isEmpty()) {
			return;
		}

		if (isContainment) {
			if (getPersistenceOptions().isSetCascadeAllOnContainment()) {
				cascadeList.add(CascadeType.ALL);
			} else {
				if (getPersistenceOptions().isSetCascadeRemoveOnContainment()) {
					cascadeList.add(CascadeType.REMOVE);
				}
				if (getPersistenceOptions().isSetCascadeMergeOnContainment()) {
					cascadeList.add(CascadeType.MERGE);
				}
				if (getPersistenceOptions().isSetCascadePersistOnContainment()) {
					cascadeList.add(CascadeType.PERSIST);
				}
				if (getPersistenceOptions().isSetCascadeRefreshOnContainment()) {
					cascadeList.add(CascadeType.REFRESH);
				}
			}
		} else if (getPersistenceOptions().isSetCascadePolicyForNonContainment()) {
			if (getPersistenceOptions().isSetCascadeMergeOnNonContainment()) {
				cascadeList.add(CascadeType.MERGE);
			}
			if (getPersistenceOptions().isSetCascadePersistOnNonContainment()) {
				cascadeList.add(CascadeType.PERSIST);
			}
			if (getPersistenceOptions().isSetCascadeRefreshOnNonContainment()) {
				cascadeList.add(CascadeType.REFRESH);
			}
		} else {
			cascadeList.add(CascadeType.MERGE);
			cascadeList.add(CascadeType.PERSIST);
			cascadeList.add(CascadeType.REFRESH);
		}
	}
}
