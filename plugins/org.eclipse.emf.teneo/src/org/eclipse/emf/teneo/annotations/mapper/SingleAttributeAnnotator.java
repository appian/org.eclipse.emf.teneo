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
 * $Id: SingleAttributeAnnotator.java,v 1.1 2007/07/12 12:55:58 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.mapper;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.EnumType;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.GenerationType;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.Temporal;
import org.eclipse.emf.teneo.annotations.pannotation.TemporalType;

/**
 * Annotates a single attribute, a primitive type such as a long or int.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class SingleAttributeAnnotator extends BaseEFeatureAnnotator {

	// The logger
	protected static final Log log = LogFactory.getLog(SingleAttributeAnnotator.class);

	private TemporalType optionDefaultTemporal = null;

	/** Process the features of the eclass */
	public void annotate(PAnnotatedEAttribute aAttribute) {

		log.debug(" Adding default annotations for EAttribute " + aAttribute.getAnnotatedElement().getName());

		final EAttribute eAttribute = (EAttribute) aAttribute.getAnnotatedElement();

		// this is done before adding the id because an enumerated can also be
		// an id
		if (eAttribute.getEType() instanceof EEnum && aAttribute.getEnumerated() == null) {
			final Enumerated enumerated = getFactory().createEnumerated();
			enumerated.setValue(EnumType.STRING);
			enumerated.setEModelElement(eAttribute);
			aAttribute.setEnumerated(enumerated);
		}

		if (getPersistenceOptions().isIDFeatureAsPrimaryKey() && eAttribute.isID() && aAttribute.getId() == null) {
			final Id id = getFactory().createId();
			id.setEModelElement(eAttribute);
			aAttribute.setId(id);
			addColumnConstraints(aAttribute);

			if (getPersistenceOptions().isSetGeneratedValueOnIDFeature() &&
					aAttribute.getGeneratedValue() == null &&
					(Number.class.isAssignableFrom(eAttribute.getEAttributeType().getInstanceClass()) ||
							eAttribute.getEAttributeType().getInstanceClass() == long.class || eAttribute
						.getEAttributeType().getInstanceClass() == int.class)) {
				final GeneratedValue gv = getFactory().createGeneratedValue();
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
				final Temporal temporal = getFactory().createTemporal();
				temporal.setValue(optionDefaultTemporal);
				aAttribute.setTemporal(temporal);
				temporal.setEModelElement(eAttribute);
			} else if (clazz != null && Calendar.class.isAssignableFrom(clazz)) {
				final Temporal temporal = getFactory().createTemporal();
				temporal.setValue(optionDefaultTemporal);
				aAttribute.setTemporal(temporal);
				temporal.setEModelElement(eAttribute);
			}
		}

		if (aAttribute.getBasic() == null) {
			// primitive defaults are set in the model itself
			final Basic basic = getFactory().createBasic();
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.annotations.mapper.AbstractAnnotator#setPersistenceOptions(org.eclipse.emf.teneo.PersistenceOptions)
	 */
	@Override
	public void setPersistenceOptions(PersistenceOptions persistenceOptions) {
		super.setPersistenceOptions(persistenceOptions);

		optionDefaultTemporal = TemporalType.get(persistenceOptions.getDefaultTemporalValue());
		if (optionDefaultTemporal == null) {
			throw new StoreMappingException("Temporal value not found: " + persistenceOptions.getDefaultTemporalValue());
		}
	}

}
