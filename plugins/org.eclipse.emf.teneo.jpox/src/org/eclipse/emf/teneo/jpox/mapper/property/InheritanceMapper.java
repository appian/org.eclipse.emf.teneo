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
 * $Id: InheritanceMapper.java,v 1.5 2007/02/01 12:36:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.property;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.annotations.mapper.StoreMappingException;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pannotation.Inheritance;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.jpox.mapper.MappingContext;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * The abstract class for different mappers.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */

public class InheritanceMapper extends AbstractMapper {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(InheritanceMapper.class);

	/** Constructor */
	public InheritanceMapper(MappingContext mappingContext) {
		super(mappingContext);
	}

	/** Sets the inheritance strategy of the aclass and handles discriminator columns etc. */
	public void map(PAnnotatedEClass aClass, Element classElement) {
		EClass eClass = aClass.getAnnotatedEClass();
		Inheritance inheritance = getInheritance(aClass);
		if (aClass.getMappedSuperclass() != null) {
			Element inheritanceElement = classElement.addElement("inheritance");
			inheritanceElement.addAttribute("strategy", "subclass-table");
		} else if (inheritance.getStrategy().equals(InheritanceType.JOINED_LITERAL)) {
			log.debug("Inheritance mapping " + inheritance.getStrategy().getName());

			Element inheritanceElement = classElement.addElement("inheritance");
			inheritanceElement.addAttribute("strategy", "new-table");
		} else if (inheritance.getStrategy().equals(InheritanceType.SINGLE_TABLE_LITERAL)) {
			log.debug("Inheritance mapping " + inheritance.getStrategy().getName());

			// check if one of the supertypes is valid
			boolean hasValidSuperType = false;
			for (int i = 0; i < eClass.getEAllSuperTypes().size(); i++) {
				EClass superEClass = (EClass) eClass.getEAllSuperTypes().get(i);

				// also a mapped superclass is not a valid superclass
				PAnnotatedEClass aSuperClass = aClass.getPaModel().getPAnnotated(superEClass);
				if (aSuperClass.getMappedSuperclass() != null) {
					continue;
				}

				if (!superEClass.isInterface() && 
						ERuntime.INSTANCE.getInstanceClass(superEClass) != null) {
					hasValidSuperType = true;
					break;
				}
			}

			if (hasValidSuperType) { // superclass for a subclass

				log.debug("Has superclasses therefore: superclass-table");

				Element inheritanceElement = classElement.addElement("inheritance");
				inheritanceElement.addAttribute("strategy", "superclass-table");

				if (aClass.getDiscriminatorValue() != null) {
					Element discriminator = inheritanceElement.addElement("discriminator");
					discriminator.addAttribute("value", aClass.getDiscriminatorValue().getValue());
				}
			} else { // only add discriminator at the superclass

				log.debug("Has no superclasses therefore: new-table");

				Element inheritanceElement = classElement.addElement("inheritance");

				inheritanceElement.addAttribute("strategy", "new-table");
				String colName = "CLASS_DISCRIMINATOR";
				if (aClass.getDiscriminatorColumn() != null) {
					colName = aClass.getDiscriminatorColumn().getName();
				}

				Element discriminator = inheritanceElement.addElement("discriminator");
				discriminator.addAttribute("column", colName);
				if (aClass.getDiscriminatorValue() != null) {
					discriminator.addAttribute("strategy", "value-map").addAttribute("value",
							aClass.getDiscriminatorValue().getValue());
				} else {
					discriminator.addAttribute("strategy", "class-name");
				}

				log.debug("Added discrimnator with colname " + colName);
			}
		} else {
			throw new StoreMappingException("Inheritance type: " + inheritance.getStrategy().getName() + " not supported");
		}
	}

	/** Returns the inheritance of an annotated superclass of a passed aclass, returns null if not found */
	private Inheritance getInheritance(PAnnotatedEClass childPA) {
		if (childPA.getInheritance() != null) return childPA.getInheritance();
		EClass eChild = childPA.getAnnotatedEClass();
		List supers = eChild.getESuperTypes();
		for (Iterator it = supers.iterator(); it.hasNext();) {
			EClass eSuper = (EClass) it.next();
			PAnnotatedEClass pae = childPA.getPaModel().getPAnnotated(eSuper);
			if (pae != null) {
				Inheritance inheritance = getInheritance(pae);
				if (inheritance != null) {
					return inheritance;
				}
			}
		}
		return null;
	}
}