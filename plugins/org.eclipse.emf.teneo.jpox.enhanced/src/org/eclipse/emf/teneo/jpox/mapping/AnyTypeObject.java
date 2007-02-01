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
 * $Id: AnyTypeObject.java,v 1.2 2007/02/01 12:35:16 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapping;

import java.lang.reflect.Constructor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jdo.PersistenceManager;
import javax.jdo.spi.PersistenceCapable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.xml.type.SimpleAnyType;
import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;
import org.eclipse.emf.teneo.classloader.StoreClassLoadException;
import org.eclipse.emf.teneo.jpox.JpoxEnhancedStoreException;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.store.OID;

/**
 * Is a wrapper around a general Object which is stored in the persistent store. This class supports simple types such
 * as String, Integer, Long etc., java.util.Date and Persistence Capable objects. All types are supported which have a
 * constructor which accepts a String as input, also the toString method of the object should be usable as argument to
 * the constructors argument.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ $Date: 2007/02/01 12:35:16 $
 */

public class AnyTypeObject {
	/** The logger */
	private static Log log = LogFactory.getLog(AnyTypeObject.class);

	/** The expected parameter types of the constructor */
	private static Class[] CONSTRUCTOR_PARAM = new Class[] { String.class };

	/** Field contains the path identifying the store feature */
	protected String classifier;

	/** Field contains the value, either the OID or the simple Type value */
	protected String value;

	/** Constructor used from the datastore */
	public AnyTypeObject() {
	}

	/** Constructor used from the application layer */
	public AnyTypeObject(PersistenceManager pm, Object obj) {
		if (obj instanceof SimpleAnyType) {
			SimpleAnyType stype = (SimpleAnyType) obj;
			classifier = StoreUtil.edatatypeToString(stype.getInstanceType());
			value = stype.getRawValue();
		} else if (obj instanceof PersistenceCapable) {
			// todo: replace with better message
			final PersistenceCapable pc = (PersistenceCapable) obj;
			classifier = AnyTypeEObject.IS_PC;
			if (pc.jdoGetObjectId() == null) {
				pm.makePersistent(pc);
			}
			value = pc.jdoGetObjectId().toString();
		} else {
			classifier = obj.getClass().getName();

			// handle Date a bit special because the constructor of Date with a String is
			// deprecated so we use dataformat to create and return the string
			if (obj instanceof Date) {
				value = new SimpleDateFormat().format((Date) obj);
			} else {
				value = obj.toString();
			}
		}
		log.debug("Created instance of AnyTypeObject with: " + value + "/" + classifier);
	}

	/** Returns the Object */
	public Object getObject() {
		// a pc
		if (classifier.compareTo(AnyTypeEObject.IS_PC) == 0) {
			final Object obj = ((PersistenceCapable) this).jdoGetPersistenceManager().getObjectById(new OID(value),
					true);
			if (obj != null) {
				log.debug("GetObject of AnyTypeObject with: " + value + "/" + classifier + " returns object "
						+ obj.getClass());
			} else {
				log.debug("GetObject of AnyTypeObject return no result with: " + value + "/" + classifier);
			}
			return obj;
		}
		// a simpleanytype
		else if (classifier.indexOf(StoreUtil.PATH_SEPARATOR) != -1) {
			final EDataType edatatype = StoreUtil.stringToEDataType(classifier);
			final JPOXSimpleAnyTypeImpl stype = new JPOXSimpleAnyTypeImpl();
			stype.setInstanceType(edatatype);
			stype.setRawValue(value);
			log.debug("Created simpleanytype with: " + value + "/" + classifier);
			return stype;
		}
		// a general object
		else {
			if (classifier.compareTo(Date.class.getName()) == 0) {
				try {
					final Date dateObj = new SimpleDateFormat().parse(value);
					log.debug("Created object " + dateObj.getClass() + " with: " + value + "/" + classifier);
					return dateObj;
				} catch (ParseException e) {
					throw new JpoxEnhancedStoreException("Can not create date object from: " + value, e);
				}
			} else {
				try {
					// TODO cache classnames
					final Class clazz = ClassLoaderResolver.classForName(classifier);
					final Constructor constructor = clazz.getConstructor(CONSTRUCTOR_PARAM);
					final Object obj = constructor.newInstance(new Object[] { value });
					log.debug("Created object " + obj.getClass() + " with: " + value + "/" + classifier);
					return obj;
				} catch (StoreClassLoadException e) {
					throw new JpoxEnhancedStoreException("The class: " + classifier
							+ " could not be found, value in the db is " + value, e);
				} catch (NoSuchMethodException e) {
					throw new JpoxEnhancedStoreException("The class " + classifier
							+ " does not have a constructor which expects one String parameter", e);
				} catch (Exception e) {
					throw new JpoxEnhancedStoreException("Exception when translation " + classifier + "/" + value
							+ " to an Object", e);
				}
			}
		}
	}
}