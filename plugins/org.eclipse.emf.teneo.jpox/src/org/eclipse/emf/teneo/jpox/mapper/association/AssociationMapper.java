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
 * $Id: AssociationMapper.java,v 1.5 2007/07/11 14:43:06 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.jpox.mapper.MappingUtil;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * The abstract class for different mappers.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */

public class AssociationMapper extends AbstractMapper {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(AssociationMapper.class);

	/** Sets common reference field attributes */
	protected void setCommonReferenceAttributes(Element fieldElement, PAnnotatedEReference aReference,
			boolean cascadeRemove) {
		EReference eReference = (EReference) aReference.getAnnotatedElement();

		boolean isWildcard = MappingUtil.isWildcard(eReference);

		// note wildcard does not require dependent because these are always embedded (which is also
		// dependent)
		// our experience showed that if dependent is set on wildcard that errors occur in jpox.
		if (cascadeRemove) {
			fieldElement.addAttribute("dependent", "true");
		} else if (FeatureMapUtil.isFeatureMap(eReference) && !isWildcard) { // featuremap
																				// entries are
																				// always
			// dependent
			fieldElement.addAttribute("dependent", "true");
		} else if (eReference.isContainment() && !isWildcard) {
			// dependent if containment and it is a single reference field (not multi)
			fieldElement.addAttribute("dependent", "true");
		}

		// two way were the otherside is the container then the reference should be delete
		// confusing but foreign-key constraints are defined the other way around in jpox
		if (eReference.getEOpposite() != null && eReference.getEOpposite().isContainment()) {
			fieldElement.addAttribute("delete-action", "cascade");
		} else { // restrict foreign-key constraint in all other cases
			fieldElement.addAttribute("delete-action", "restrict");
		}
	}
}