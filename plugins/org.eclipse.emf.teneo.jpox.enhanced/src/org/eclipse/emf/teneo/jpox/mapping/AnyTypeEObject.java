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
 * $Id: AnyTypeEObject.java,v 1.4 2008/02/28 07:09:08 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapping;

import javax.jdo.PersistenceManager;
import javax.jdo.spi.PersistenceCapable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.xml.type.SimpleAnyType;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.store.OID;

/**
 * Is a wrapper around a general EObject which is stored in the persistent store. This class allows the persistence of
 * SimpleAnyTypeImpl objects as well as persistable EObjects. Is used to support the xsd:anyType XML Schema
 * construction.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $ $Date: 2008/02/28 07:09:08 $
 */

public class AnyTypeEObject extends EObjectImpl {
	/** The logger */
	private static Log log = LogFactory.getLog(AnyTypeEObject.class);

	/** The constant which is set in the classifier member if the value is a persistable EObject */
	public static final String IS_PC = "#";

	/** Field contains the path identifying the store feature */
	protected String classifier;

	/** Field contains the value, either the OID or the simple Type value */
	protected String value;

	/** Constructor used by the persistency layer */
	public AnyTypeEObject() {
	}

	/** Constructor used from the application layer */
	public AnyTypeEObject(PersistenceManager pm, EObject obj) {
		if (obj instanceof SimpleAnyType) {
			SimpleAnyType stype = (SimpleAnyType) obj;
			classifier = StoreUtil.edatatypeToString(stype.getInstanceType());
			value = stype.getRawValue();
		} else {
			// todo: replace with better message
			final PersistenceCapable pc = (PersistenceCapable) obj;
			classifier = IS_PC;
			if (pc.jdoGetObjectId() == null) {
				pm.makePersistent(pc);
			}
			value = pc.jdoGetObjectId().toString();
		}

		log.debug("Created AnyTypeEObject with " + classifier + "/" + value);
	}

	/** Returns the EObject */
	public EObject getEObject() {
		if (classifier.compareTo(IS_PC) == 0) {
			final Object obj = ((PersistenceCapable) this).jdoGetPersistenceManager().getObjectById(new OID(value),
					true);
			log.debug("Translated " + classifier + "/" + value + " into " + obj.getClass().getName());
			return (EObject) obj;
		} else {
			final EDataType edatatype = StoreUtil.stringToEDataType(classifier);
			final JPOXSimpleAnyTypeImpl stype = new JPOXSimpleAnyTypeImpl();
			stype.setInstanceType(edatatype);
			stype.setRawValue(value);
			log.debug("Translated " + classifier + "/" + value + " into SimpleAnyType");
			return stype;
		}
	}
}