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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: StoreUtil.java,v 1.8 2006/11/23 06:11:28 mtaal Exp $
 */

package org.eclipse.emf.teneo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.StoreException;

/**
 * Contains different util methods.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */

public class StoreUtil {

	/** The EObject eclass */
	public static EClass EOBJECT_ECLASS = (EClass)EcorePackage.eINSTANCE.getEClassifier("EObject");
	public static String EOBJECT_ECLASS_URI = EcorePackage.eINSTANCE.getNsURI() + "/" + EOBJECT_ECLASS.getName();
	
	/** The logger */
	private static Log log = LogFactory.getLog(StoreUtil.class);

	/** Separator between package and the extension */
	public static final char EXTENSION_SEPARATOR = '.';

	/** Separator in package names */
	private static final char PACKAGE_SEPARATOR = '.';

	/** Separator between segments of an identifying strucuralfeature or edatatype path */
	public static final char PATH_SEPARATOR = '/';

	/** The Annotation source name */
	public static final String ANNOTATION_SOURCE = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";

	/** The nsprefix, eclass separator */
	private static final String NSPREFIX_ECLASS_SEPARATOR = ".";

	/** Returns the name of the entity used for this feature map entry */
	public static String getEntityName(EStructuralFeature feature) {
		assert (FeatureMapUtil.isFeatureMap(feature));
		return feature.getEContainingClass().getName() + "_" + feature.getName();
	}

	/** Returns a loggable string for a efeature */
	public static String toString(EStructuralFeature efeature) {
		if (efeature == null)
			return "NULL"; // possibly throw error
		return efeature.getEContainingClass().getName() + "/" + efeature.getName();
	}

	/** Translates an ECLass to a string representation */
	public static String getEClassURI(EClass eclass, String qualify) {
		if (eclass == EOBJECT_ECLASS) {
			return EOBJECT_ECLASS_URI;
		}
		if (qualify == null || qualify.compareTo(PersistenceOptions.QUALIFY_ENTITY_NAME_NO) == 0) {
			return eclass.getName();
		} else if (qualify.compareTo(PersistenceOptions.QUALIFY_ENTITY_NAME_NSPREFIX) == 0) {
			return eclass.getEPackage().getNsPrefix() + "." + eclass.getName();
		}
		throw new StoreException("Qualify type " + qualify + " unknown");
	}
	
	/**
	 * Returns an estructuralfeature on the basis of the name of the eclass and the name of the feature itself.
	 */
	public static EStructuralFeature getEStructuralFeature(String eclassURI, String featureName, EPackage[] epackages) {
		EClass eclass = getEClassFromURI(eclassURI, epackages);
		if (eclass == null)
			return null;
		return eclass.getEStructuralFeature(featureName);
	}

	/** Translates an eclass uri back to an eclass */
	public static EClass getEClassFromURI(String theEClassURI) {
		final Registry packageRegistry = Registry.INSTANCE;
		final EPackage[] epacks = new EPackage[packageRegistry.size()];
		int cnt = 0;
		for (Iterator it = packageRegistry.values().iterator(); it.hasNext();) {
			final EPackage epack = (EPackage)it.next();
			epacks[cnt++] = epack;
		}
		return getEClassFromURI(theEClassURI, epacks);
	}

	/** Translates an eclass uri back to an eclass */
	public static EClass getEClassFromURI(String theEClassURI, EPackage[] epackages) {
		if (theEClassURI.compareTo(EOBJECT_ECLASS_URI) == 0) {
			return EcorePackage.eINSTANCE.getEObject();
		}
		String nsPrefix = null;
		String eClassName = theEClassURI;
		if (eClassName.indexOf(NSPREFIX_ECLASS_SEPARATOR) != -1) {
			nsPrefix = theEClassURI.substring(0, eClassName.indexOf(NSPREFIX_ECLASS_SEPARATOR));
			eClassName = theEClassURI.substring(1 + eClassName.indexOf(NSPREFIX_ECLASS_SEPARATOR));
		}

		ArrayList eclasses = new ArrayList();
		for (int i = 0; i < epackages.length; i++) {
			EPackage epack = epackages[i];
			if (nsPrefix != null && epack.getNsPrefix() != null && epack.getNsPrefix().compareTo(nsPrefix) != 0) {
				continue;
			}
			EClassifier eclassifier = epack.getEClassifier(eClassName);
			if (eclassifier instanceof EClass) {
				eclasses.add(eclassifier);
			}
		}

		if (eclasses.size() == 1) {
			return (EClass) eclasses.get(0);
		} else if (eclasses.size() == 0) {
			return null;
			// throw new StoreException("The uri " + eclassURI + " can not be translated to an eclass");
		} else {
			StringBuffer eclassList = new StringBuffer();
			for (Iterator it = eclasses.iterator(); it.hasNext();) {
				EClass eclass = (EClass) it.next();
				eclassList.append(eclass.getEPackage().getNsURI() + "/" + eclass.getName());
			}
			throw new StoreException("The uri " + eClassName + " maps to multiple eclasses: " + eclassList.toString());
		}

		/*
		 * int lastIndex = eclassURI.lastIndexOf(PATH_SEPARATOR);
		 * 
		 * if (lastIndex == -1) { throw new StoreAnnotationsException("The uri: " + eclassURI + " has an illegal format,
		 * it can not parsed to an eclass."); }
		 * 
		 * final String nsuri = eclassURI.substring(0, lastIndex); final String name = eclassURI.substring(lastIndex +
		 * 1);
		 * 
		 * final EPackage epack = EPackage.Registry.INSTANCE.getEPackage(nsuri); if (epack == null) { throw new
		 * StoreAnnotationsException("No package found for the nsuri: " + nsuri + " using the eclassURI " + eclassURI); }
		 * 
		 * final EClass eclass = (EClass)epack.getEClassifier(name); if (eclass == null) { throw new
		 * StoreAnnotationsException("The nsuri " + nsuri + " and eclassname: " + name + " does not resolve to an
		 * EClass"); } return eclass;
		 */
	}

	/** Sends out a notification of an elist load */
	public static void dispatchEListLoadNotification(final EObject notifier, final EList elist,
			final EStructuralFeature feature) {
		notifier.eNotify(new NotificationImpl(Constants.ELIST_LOAD_NOTIFICATION, null, elist) {
			public Object getNotifier() {
				return notifier;
			}

			public Object getFeature() {
				return feature;
			}

			public int getFeatureID(Class expectedClass) {
				return feature.getFeatureID();
			}
		});
	}

	/** Returns the string which is used to store the unique identification of this structuralfeature in the db */
	public static String structuralFeatureToString(EStructuralFeature structuralFeature) {
		// the unique id will consist of three part: 1) package NSURI, 2) EClass Name, 3) StructuralFeature Name
		final String nsuri = structuralFeature.getEContainingClass().getEPackage().getNsURI();
		final String eclassName = structuralFeature.getEContainingClass().getName();
		final String featureName = structuralFeature.getName();

		return nsuri + PATH_SEPARATOR + eclassName + PATH_SEPARATOR + featureName;
	}

	/** Returns true if the passed feature is a wildcard feature */
	public static boolean isWildCard(EStructuralFeature feature) {
		EAnnotation eAnnotation = feature.getEAnnotation("http:///org/eclipse/emf/ecore/util/ExtendedMetaData");
		if (eAnnotation == null)
			return false;
		return eAnnotation.getDetails().get("kind") != null
				&& ((String) eAnnotation.getDetails().get("kind")).compareTo("elementWildcard") == 0;
		/*
		 * // todo optimise this with a cache final EAnnotation eannotation =
		 * feature.getEAnnotation("http:///org/eclipse/emf/ecore/util/ExtendedMetaData"); if (eannotation != null) {
		 * final String kind = (String)eannotation.getDetails().get("kind"); final String wildcards =
		 * (String)eannotation.getDetails().get("wildcards"); if (wildcards != null && kind != null &&
		 * "elementWildcard".compareTo(kind) == 0) { return true; } } return false;
		 */
	}

	/** Returns true if the passed feature is a mixed feature, a mixed feature is almost the same as a wildcard */
	public static boolean isMixed(EStructuralFeature feature) {
		// todo optimise this with a cache
		final EAnnotation eannotation = feature.getEAnnotation("http:///org/eclipse/emf/ecore/util/ExtendedMetaData");
		if (eannotation != null) {
			final String kind = (String) eannotation.getDetails().get("kind");
			if (kind != null && "elementWildcard".compareTo(kind) == 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Sets the eresource by walking up the containment structure and finding the highest parent. There the resource is
	 * set.If the resource is already set nothing is done.
	 */
	public static void setEResource(InternalEObject eobj, Resource.Internal resource, boolean force) {
		if (eobj.eResource() != null && eobj.eResource() != resource && !force)
			return;

		InternalEObject currentEObject = eobj;
		while (currentEObject.eContainer() != null && !currentEObject.eContainmentFeature().isResolveProxies()) {
			currentEObject = (InternalEObject) currentEObject.eContainer();
			AssertUtil.assertNotSameObject(currentEObject, currentEObject.eContainer());
		}
		currentEObject.eSetResource(resource, null);
	}

	/** Translates a string to a structural feature */
	public static EStructuralFeature stringToStructureFeature(String strid) {
		// this method expects a dbid consisting of three parts separated by /
		int lastIndex = strid.lastIndexOf(PATH_SEPARATOR);
		int beforeLastIndex = strid.lastIndexOf(PATH_SEPARATOR, lastIndex - 1);

		if (lastIndex == -1 || beforeLastIndex == -1) {
			throw new StoreException(
					"The database id stored for a structuralfeature used in a featuremap entry is invalid, dbid: "
							+ strid);
		}

		final String nsuri = strid.substring(0, beforeLastIndex);
		final String eclassName = strid.substring(beforeLastIndex + 1, lastIndex);
		final String featureName = strid.substring(lastIndex + 1);

		final EPackage epack = EPackage.Registry.INSTANCE.getEPackage(nsuri);
		if (epack == null) {
			throw new StoreException("The dbid " + strid + " and nsuri: " + nsuri + " does not resolve to an epackage");
		}

		final EClass eclass = (EClass) epack.getEClassifier(eclassName);
		if (eclass == null) {
			throw new StoreException("The dbid " + strid + " and eclassname: " + eclassName
					+ " does not resolve to an eclass");
		}

		final EStructuralFeature structFeature = eclass.getEStructuralFeature(featureName);
		if (structFeature == null) {
			throw new StoreException("The dbid " + strid + " and featurename: " + featureName
					+ " does not resolve to a structural feature");
		}

		return structFeature;
	}

	/** Returns the string which is used to store the unique identification of the passed edatatype */
	public static String edatatypeToString(EDataType edatatype) {
		// the unique id will consist of two part: 1) package NSURI, 2) Name
		final String nsuri = edatatype.getEPackage().getNsURI();
		final String name = edatatype.getName();
		return nsuri + PATH_SEPARATOR + name;
	}

	/** Translates a string to an edatatype */
	public static EDataType stringToEDataType(String strid) {
		// this method expects a dbid consisting of three parts separated by /
		int lastIndex = strid.lastIndexOf(PATH_SEPARATOR);

		if (lastIndex == -1) {
			throw new StoreException("The database id stored for a datatype is invalid, dbid: " + strid);
		}

		final String nsuri = strid.substring(0, lastIndex);
		final String name = strid.substring(lastIndex + 1);

		final EPackage epack = EPackage.Registry.INSTANCE.getEPackage(nsuri);
		if (epack == null) {
			throw new StoreException("The dbid " + strid + " and nsuri: " + nsuri + " does not resolve to an epackage");
		}

		final EDataType edatatype = (EDataType) epack.getEClassifier(name);
		if (edatatype == null) {
			throw new StoreException("The dbid " + strid + " and eclassname: " + name
					+ " does not resolve to an EDataType");
		}
		return edatatype;
	}

	/**
	 * Based on the eobject and the fieldname returns the structural feature. Caching should be added here.
	 */
	public static EStructuralFeature getEStructuralFeature(EObject emfObj, String fieldName) {
		return getEStructuralFeature(emfObj.eClass(), fieldName);
	}

	/**
	 * Returns all the direct content based on the eclass of the object, null content is not returned
	 */
	public static Object[] getObjectContent(EObject eo) {
		final ArrayList result = new ArrayList();
		for (Iterator it = eo.eClass().getEAllStructuralFeatures().iterator(); it.hasNext();) {
			final EStructuralFeature estruct = (EStructuralFeature) it.next();
			final Object val = eo.eGet(estruct);
			if (val != null) {
				result.add(val);
			}
		}
		return (Object[]) result.toArray(new Object[result.size()]);
	}

	/**
	 * Based on the eclass and the fieldname returns the structural feature. Caching should be added here.
	 */
	public static EStructuralFeature getEStructuralFeature(EClass eclass, String fieldName) {
		EStructuralFeature reserve = null;
		for (Iterator it = eclass.getEAllStructuralFeatures().iterator(); it.hasNext();) {
			final EStructuralFeature estruct = (EStructuralFeature) it.next();
			String name = estruct.getName();
			if (name.compareTo(fieldName) == 0) {
				return estruct;
			}
			if (name.compareToIgnoreCase(fieldName) == 0) {
				reserve = estruct; // use this if all else fails
			} else if ((name + "_").compareToIgnoreCase(fieldName) == 0) { // reserved word
				reserve = estruct; // use this if all else fails
			}
		}

		if (reserve != null)
			return reserve;

		throw new StoreException("The fieldname " + fieldName + " is not present as a ereference type in the class: "
				+ eclass.getName());
	}

	/**
	 * Returns a list of all ereferences with many of the emfObj. TODO add caching
	 */
	public static EReference[] getManyGroupEReferences(EObject emfObj) {
		final ArrayList manyRefs = new ArrayList();
		for (Iterator it = emfObj.eClass().getEAllStructuralFeatures().iterator(); it.hasNext();) {
			final EStructuralFeature estruct = (EStructuralFeature) it.next();
			if (estruct instanceof EReference
					&& (((EReference) estruct).isMany() || isGroupFeature(estruct) || isWildCard(estruct))) {
				manyRefs.add(estruct);
			}
		}
		return (EReference[]) manyRefs.toArray(new EReference[manyRefs.size()]);
	}

	/** Checks if a structural feature is a group feature */
	public static boolean isGroupFeature(EStructuralFeature estruct) {
		final EAnnotation annotation = estruct.getEAnnotation(ANNOTATION_SOURCE);

		if (annotation == null)
			return false;

		final EMap map = annotation.getDetails();
		final Iterator keys = map.keySet().iterator();
		while (keys.hasNext()) {
			final String key = (String) keys.next();
			final String value = (String) map.get(key);
			if ("kind".compareTo(key) == 0 && "group".compareTo(value) == 0) {
				return true;
			}
		}
		return false;
	}

	/** Returns the name used for the group feature, if the feature is not a group then null is returned */
	public static String getGroupName(EStructuralFeature estruct) {
		final EAnnotation annotation = estruct.getEAnnotation(ANNOTATION_SOURCE);

		if (annotation == null)
			return null;

		boolean isGroup = false;
		String name = null;

		final EMap map = annotation.getDetails();
		final Iterator keys = map.keySet().iterator();
		while (keys.hasNext()) {
			final String key = (String) keys.next();
			final String value = (String) map.get(key);
			if ("kind".compareTo(key) == 0 && "group".compareTo(value) == 0) {
				// can not return here because we also need to get the name
				isGroup = true;
			}
			if ("name".compareTo(key) == 0) {
				name = value;
			}
		}

		if (isGroup) {
			assert (name != null);
			return name;
		}

		return null;
	}

	/** Checks if a feature is an element of the passed group */
	public static boolean isElementOfGroup(EStructuralFeature estruct, EStructuralFeature groupFeature) {
		final EStructuralFeature ef = ExtendedMetaData.INSTANCE.getGroup(estruct);
		return ef == groupFeature;
		/*
		 * final EAnnotation annotation = estruct.getEAnnotation(ANNOTATION_SOURCE);
		 * 
		 * if (annotation == null) return false;
		 * 
		 * final EMap map = annotation.getDetails(); final Iterator keys = map.keySet().iterator(); while
		 * (keys.hasNext()) { final String key = (String)keys.next(); final String value = (String)map.get(key); // for
		 * a choice the groupName in the group element starts with # for substitution it // doesn't therefore the
		 * endsWith if ("group".compareTo(key) == 0 && value != null && groupName.endsWith(value)) { return true; } }
		 * 
		 * return false;
		 */
	}

	/** Checks if a feature is an element of a group */
	public static boolean isElementOfAGroup(EStructuralFeature estruct) {
		final EStructuralFeature ef = ExtendedMetaData.INSTANCE.getGroup(estruct);
		return ef != null;
		/*
		 * // group elements are always transient if (!estruct.isTransient()) return false;
		 * 
		 * final EAnnotation annotation = estruct.getEAnnotation(ANNOTATION_SOURCE);
		 * 
		 * if (annotation == null) return false;
		 * 
		 * final EMap map = annotation.getDetails(); final Iterator keys = map.keySet().iterator(); while
		 * (keys.hasNext()) { final String key = (String)keys.next(); final String value = (String)map.get(key); if
		 * ("group".compareTo(key) == 0 && value != null) return true; }
		 * 
		 * return false;
		 */
	}

	/** Returns the list of estructuralfeatures which belong to a certain feature map entry */
	public static List getFeaturesOfGroup(EAttribute eattr) {
		final ArrayList result = new ArrayList();
		for (Iterator it = eattr.getEContainingClass().getEStructuralFeatures().iterator(); it.hasNext();) {
			EStructuralFeature efeature = (EStructuralFeature) it.next();
			if (StoreUtil.isElementOfGroup(efeature, eattr)) {
				result.add(efeature);
			}
		}
		return result;
	}

	/**
	 * Returns an array of epackages on the basis of a string with comma separated epackage ns uris
	 */
	public static EPackage[] getEPackages(String nsuris) {
		final String[] epacknsuris = nsuris.split(",");
		final EPackage[] epacks = new EPackage[epacknsuris.length];
		for (int i = 0; i < epacknsuris.length; i++) {
			final EPackage epack = EPackage.Registry.INSTANCE.getEPackage(epacknsuris[i]);
			if (epack == null) {
				throw new StoreException("EPackage with nsuri: " + epacknsuris[i] + " can not be found,");
			}
			epacks[i] = epack;
		}
		return epacks;
	}

	/** Sets a field and wraps the exceptions */
	public static void setField(Field field, Object obj, Object value) {
		try {
			field.set(obj, value);
		} catch (IllegalAccessException e) {
			throw new StoreException("IllegalAccessException " + obj.getClass().getName() + " field; "
					+ field.getName());
		}
	}

	/** Determines the list of available jdo files on the basis of the suffix */
	public static String[] getFileList(String fileName, String additionalLocation) {
		final ArrayList result = new ArrayList();
		log.debug(">>>> Building or descriptor file List");

		if (additionalLocation != null) {
			if (additionalLocation.endsWith(fileName)) {
				result.add(additionalLocation);
			} else {
				result.add(additionalLocation + File.separator + fileName);
			}
		}

		final String[] packagelist = buildPackagelist();
		for (int i = 0; i < packagelist.length; i++) {
			final String packagePath = packagelist[i];
			final String filePath = packagePath + fileName;

			log.debug("Try path: " + filePath);

			final URL url = StoreUtil.class.getResource(filePath);
			if (url != null) // file exists
			{
				log.debug("!!Found!!");
				result.add(filePath);
			}
		}
		return (String[]) result.toArray(new String[result.size()]);
	}

	/** Build list of possible or descriptor file paths */
	private static String[] buildPackagelist() {
		// walk through all the classnames
		final ArrayList newPackagePathList = new ArrayList();
		newPackagePathList.add(File.pathSeparator); // add the root package
		final ArrayList allClasses = new ArrayList(ERuntime.INSTANCE.getAllInterfaces());
		allClasses.addAll(ERuntime.INSTANCE.getAllConcreteClasses());
		final Iterator it = allClasses.iterator();
		while (it.hasNext()) {
			final Class clazz = (Class) it.next();
			final String className = clazz.getName();
			final int classNameIndex = className.lastIndexOf(PACKAGE_SEPARATOR);
			final String trunkClassName = className.substring(0, classNameIndex);
			final String startPath = PATH_SEPARATOR + trunkClassName.replace(PACKAGE_SEPARATOR, PATH_SEPARATOR);

			buildPackagePathFromClassName(startPath, newPackagePathList);
		}
		return (String[]) newPackagePathList.toArray(new String[newPackagePathList.size()]);
	}

	/** Take care of one class */
	private static void buildPackagePathFromClassName(String path, ArrayList newPackagePathList) {
		if (newPackagePathList.contains(path + PATH_SEPARATOR))
			return;
		newPackagePathList.add(path + PATH_SEPARATOR);

		final int sepIndex = path.lastIndexOf(PATH_SEPARATOR);
		if (sepIndex == -1)
			return;
		buildPackagePathFromClassName(path.substring(0, sepIndex), newPackagePathList);
	}

	/** Copies a file */
	public static void copyFile(File src, File dst) {
		try {
			log.debug("Copy file from " + src.getAbsolutePath() + " to " + dst.getAbsolutePath());
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dst);
	
			// Transfer bytes from in to out
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			throw new StoreException("Exception while copying from/to " + src.getAbsolutePath() 
					+ "/" + dst.getAbsolutePath(), e);
		}
	}
}