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
 * $Id: JpoxDataStore.java,v 1.9.2.1 2007/03/05 18:07:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.spi.PersistenceCapable;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.AbstractEnumerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;
import org.eclipse.emf.teneo.jpox.cache.EMFHardRefCache;
import org.eclipse.emf.teneo.jpox.cache.EMFNullCache;
import org.eclipse.emf.teneo.jpox.cache.EMFSoftRefCache;
import org.eclipse.emf.teneo.jpox.cache.EMFWeakRefCache;
import org.eclipse.emf.teneo.jpox.elist.AnyFeatureMapEntry;
import org.eclipse.emf.teneo.jpox.elist.EListMapping;
import org.eclipse.emf.teneo.jpox.elist.EListWrapper;
import org.eclipse.emf.teneo.jpox.elist.FeatureMapMapping;
import org.eclipse.emf.teneo.jpox.elist.FeatureMapWrapper;
import org.eclipse.emf.teneo.jpox.elist.GenericFeatureMapEntry;
import org.eclipse.emf.teneo.jpox.elist.RemoveLifeCycleListener;
import org.eclipse.emf.teneo.jpox.mapping.AnyTypeEObject;
import org.eclipse.emf.teneo.jpox.mapping.ENumMapping;
import org.eclipse.emf.teneo.jpox.mapping.EObjectMapping;
import org.eclipse.emf.teneo.jpox.mapping.XMLCalendarMapping;
import org.eclipse.emf.teneo.jpox.resource.JPOXResource;
import org.eclipse.emf.teneo.type.FeatureMapEntry;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.jpox.AbstractPersistenceManagerFactory;
import org.jpox.JDOClassLoaderResolver;
import org.jpox.PMFConfiguration;
import org.jpox.PersistenceManagerFactoryImpl;
import org.jpox.TypeManager;
import org.jpox.metadata.AbstractClassMetaData;
import org.jpox.metadata.AbstractPropertyMetaData;
import org.jpox.metadata.ExtensionMetaData;
import org.jpox.metadata.JDOEntityResolver;
import org.jpox.metadata.MetaDataManager;
import org.jpox.plugin.ConfigurationElement;
import org.jpox.plugin.Extension;
import org.jpox.plugin.ExtensionPoint;
import org.jpox.store.StoreManager;
import org.jpox.util.ClassUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Defines for one or more EPackages where (in which relational store) they are persisted. In addition supports mapping
 * of interface names to concrete classnames used by jpox and computes the 'top' classes. The classes which are not
 * contained in other classes.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9.2.1 $ $Date: 2007/03/05 18:07:38 $
 */

public class JpoxDataStore {
	/** The logger */
	private static final Log log = LogFactory.getLog(JpoxDataStore.class);

	/** The AbstractEnumerator which is the super class of all emf enums */
	private static final Class emfEnumClass = AbstractEnumerator.class;

	/** The name under which it is registered */
	private String name;

	/** The list of epackages stored in the datastore */
	private EPackage[] ePackages;

	/** The persistency manager factory */
	private PersistenceManagerFactory pmf;

	/** Refers to by class */
	private HashMap refersToMap;

	/** Local version of topclasses to facilitate separate testcases */
	private Class[] storeTopClasses;

	/** Load the containment lazy */
	private boolean loadContainmentEagerly;

	/** The properties */
	private Properties properties = new Properties();

	/** Has setprops been called */
	private boolean havePropertiesBeenSet = false;

	/** Keeps track if the schema should be updated */
	private boolean updateSchema = false;

	/** The constructor, fills the default properties */
	JpoxDataStore() {
		// properties.setProperty(PMFConfiguration.JDO_DETACHONCLOSE_PROPERTY,"true");
		// properties.setProperty(PMFConfiguration.JDO_DETACHALLONCOMMIT_PROPERTY,"true");
		// properties.setProperty(PMFConfiguration.JDO_CACHE_COLLECTIONS_LAZY_PROPERTY, "true");

		properties.setProperty(PMFConfiguration.JDO_IGNORECACHE_PROPERTY, "false");
		properties.setProperty("javax.jdo.PersistenceManagerFactoryClass", "org.jpox.PersistenceManagerFactoryImpl");
		properties.setProperty(PMFConfiguration.JDO_RETAINVALUES_PROPERTY, "true");
		properties.setProperty(PMFConfiguration.JDO_NONTRANSACTIONAL_READ_PROPERTY, "true");

		properties.setProperty(PMFConfiguration.STRING_DEFAULT_LENGTH_PROPERTY, "255");

		// set it all to false because of performance
		properties.setProperty(PMFConfiguration.AUTO_CREATE_SCHEMA_PROPERTY, "false");
		properties.setProperty(PMFConfiguration.AUTO_CREATE_CONSTRAINTS_PROPERTY, "false");
		properties.setProperty(PMFConfiguration.AUTO_CREATE_SCHEMA_PROPERTY, "false");
		properties.setProperty(PMFConfiguration.AUTO_CREATE_TABLES_PROPERTY, "false");
		properties.setProperty(PMFConfiguration.VALIDATE_COLUMNS_PROPERTY, "false");
		properties.setProperty(PMFConfiguration.VALIDATE_CONSTRAINTS_PROPERTY, "false");
		properties.setProperty(PMFConfiguration.VALIDATE_TABLES_PROPERTY, "false");

//		properties.setProperty(PMFConfiguration.JDO_DETACHALLONCOMMIT_PROPERTY, "true");
		properties.setProperty(PMFConfiguration.PERSISTENCE_BY_REACHABILITY_AT_COMMIT, "true");
		
		properties.setProperty(PMFConfiguration.DELETION_POLICY_PROPERTY, "JPOX");
		
		properties.setProperty(PMFConfiguration.CACHE_LEVEL_1_TYPE_PROPERTY,
				"org.eclipse.emf.teneo.jpox.cache.EMFWeakRefCache");
		properties.setProperty(PMFConfiguration.METADATA_JDO_FILE_EXTENSION_PROPERTY, JpoxHelper.INSTANCE
				.getJdoFileExtension());
	}

	/** Initialize the datastore, creates the database and */
	public final void initialize() {

		if (ePackages == null)
			throw new JpoxStoreException("EPackages are not set");
		if (name == null)
			throw new JpoxStoreException("Name is not set");
		if (!havePropertiesBeenSet)
			throw new JpoxStoreException("Specific properties have not been set");

		ERuntime.INSTANCE.register(getEPackages()); // , PersistenceCapable.class);

		// the jdo file list
		String suffix = properties.getProperty(PMFConfiguration.METADATA_JDO_FILE_EXTENSION_PROPERTY);
		if (suffix == null)
			suffix = "jdo";
		final String jdoFileName = JpoxConstants.PREFIX_PACKAGE	+ JpoxConstants.EXTENSION_SEPARATOR + suffix;
		final String[] jdoFileList = StoreUtil.getFileList(jdoFileName, null);
		
		// then create the list of all classnames
		final String[] pcClassNames = getAllClassNames(jdoFileList);

		// create the schema
		createSchema(pcClassNames, properties);

		// a check if the topclasses are empty then as a default add all the classes from the pcClassNames
		// this happens in case we have a testcase which is not based on epackages
		Class[] topClasses = ERuntime.INSTANCE.getTopClasses();
		if (topClasses.length == 0 && ePackages.length == 0) {
			topClasses = new Class[pcClassNames.length];
			for (int i = 0; i < pcClassNames.length; i++) {
				try {
					// should probably be replaced with direct classloader!
					topClasses[i] = ClassLoaderResolver.classForName(pcClassNames[i]);
				} catch (Exception e) {
					throw new JpoxStoreException("Exception when trying to instantiate class: " + pcClassNames[i], e);
				}
			}
			storeTopClasses = topClasses;
		} else {
			// check if the topclasses are persistencecapable!
			final ArrayList newTopClasses = new ArrayList();
			for (int i = 0; i < topClasses.length; i++) {
				final Class concrete = ERuntime.INSTANCE.getInstanceClass(topClasses[i]);
				if (concrete != null && PersistenceCapable.class.isAssignableFrom(concrete)) {
					newTopClasses.add(concrete);
				}
			}
			storeTopClasses = (Class[]) newTopClasses.toArray(new Class[newTopClasses.size()]);
		}

		// build the list of classnames which are passed to jpox at start
		final StringBuffer classNameList = new StringBuffer();
		for (int i = 0; i < pcClassNames.length; i++) {
			if (i > 0)
				classNameList.append(",");
			classNameList.append(pcClassNames[i]);
		}

		classNameList.append(",");
		classNameList.append(AnyTypeEObject.class.getName());
		classNameList.append(",");
		classNameList.append(AnyFeatureMapEntry.class.getName());

		properties.setProperty("org.jpox.autoStartMechanism", "Classes");
		properties.setProperty("org.jpox.autoStartClassNames", classNameList.toString());

		// and then create a pmf which does all the work but does not check the schema all the time
		pmf = JpoxHelper.INSTANCE.getPMFCreator().getPersistenceManagerFactory(properties);
		initializeTypeManager((AbstractPersistenceManagerFactory)pmf);
		pmf.addInstanceLifecycleListener(new RemoveLifeCycleListener(), null);
		
		loadContainmentEagerly = properties.getProperty(PersistenceOptions.FETCH_CONTAINMENT_EAGERLY) != null
				&& "true".compareTo(properties.getProperty(PersistenceOptions.FETCH_CONTAINMENT_EAGERLY)) == 0;

		refersToMap = createRefersToMap(((PersistenceManagerFactoryImpl) pmf).getPMFContext().getMetaDataManager(),
				pcClassNames);

		if (log.isInfoEnabled()) {
			log.info("Persistence manager factory created using properties: ");
			logProperties(properties);
		}
	}

	/** Initializes emf types with jpox */
	protected void initializeTypeManager(AbstractPersistenceManagerFactory initPmf) {
		log.debug("Registering EListMapping, EListWrapper at the jpox manager for handling elists");
		log.debug("Registering FeatureMapMapping, FeatureMapWrapper at the jpox manager for handling FeatureMap");
		log.debug("Registering EObjectMapping at the jpox manager for handling EObjects/AnyType");
		log.debug("Registering XMLCalendarMapping at the jpox manager for handling EObjects/AnyType");
		log.debug("Registering XMLDurationMapping at the jpox manager for handling EObjects/AnyType");

		final TypeManager tm = initPmf.getPMFContext().getTypeManager();
		final ClassLoader contextLoader = ClassLoaderResolver.getClassLoader();
        final org.jpox.ClassLoaderResolver clr = initPmf.getPMFContext().getClassLoaderResolver(contextLoader);
        
        log.debug("Registering level 1 Cache Implementations");
        final ExtensionPoint ep = initPmf.getPMFContext().getPluginManager().getExtensionPoint("org.jpox.cache_level1");
        final Extension extension = new Extension(ep, ep.getPlugin());
        ep.addExtension(extension);
        final ConfigurationElement ce1 = new ConfigurationElement(extension, "cache", null);
        ce1.putAttribute("name", EMFWeakRefCache.class.getName());
        ce1.putAttribute("class-name", EMFWeakRefCache.class.getName());
        extension.addConfigurationElement(ce1);
        log.debug("Registered " + EMFWeakRefCache.class.getName());
        final ConfigurationElement ce2 = new ConfigurationElement(extension, "cache", null);
        ce2.putAttribute("name", EMFHardRefCache.class.getName());
        ce2.putAttribute("class-name", EMFHardRefCache.class.getName());
        extension.addConfigurationElement(ce2);
        log.debug("Registered " + EMFHardRefCache.class.getName());
        final ConfigurationElement ce3 = new ConfigurationElement(extension, "cache", null);
        ce3.putAttribute("name", EMFNullCache.class.getName());
        ce3.putAttribute("class-name", EMFNullCache.class.getName());
        extension.addConfigurationElement(ce3);
        log.debug("Registered " + EMFNullCache.class.getName());
        final ConfigurationElement ce4 = new ConfigurationElement(extension, "cache", null);
        ce4.putAttribute("name", EMFSoftRefCache.class.getName());
        ce4.putAttribute("class-name", EMFSoftRefCache.class.getName());
        extension.addConfigurationElement(ce4);
        log.debug("Registered " + EMFSoftRefCache.class.getName());
        
		tm.addType(initPmf.getPMFContext().getPluginManager(),
				"org.jpox.store_mapping", List.class.getName(), EListMapping.class.getName(),
				EListWrapper.class.getName(), false, "1.4", true, false, false, clr);
		tm.addType(initPmf.getPMFContext().getPluginManager(),
				"org.jpox.store_mapping", EList.class.getName(), EListMapping.class.getName(),
				EListWrapper.class.getName(), false, "1.4", true, false, false, clr);
		tm.addType(initPmf.getPMFContext().getPluginManager(),
				"org.jpox.store_mapping", EMap.class.getName(), EListMapping.class.getName(),
				EListWrapper.class.getName(), false, "1.4", true, false, false, clr);
		tm.addType(initPmf.getPMFContext().getPluginManager(),
				"org.jpox.store_mapping", FeatureMap.class.getName(), FeatureMapMapping.class.getName(),
				FeatureMapWrapper.class.getName(), false, "1.4", true, false, false, clr);
		tm.addType(initPmf.getPMFContext().getPluginManager(),
				"org.jpox.store_mapping", EObject.class.getName(), EObjectMapping.class.getName(), null, true,
				"1.4", true, false, true, clr);
		tm.addType(initPmf.getPMFContext().getPluginManager(),
				"org.jpox.store_mapping", XMLCalendar.class.getName(), XMLCalendarMapping.class.getName(), null, true,
				"1.4", true, false, true, clr);

        addCustomTypes(initPmf, clr);

		for (int i = 0; i < getEPackages().length; i++) {
			final EPackage epack = getEPackages()[i];
			final Iterator it = epack.getEClassifiers().iterator();
			while (it.hasNext()) {
				final EClassifier eclassifier = (EClassifier) it.next();
				final Class instanceClass = eclassifier.getInstanceClass();

				
				if (emfEnumClass.isAssignableFrom(instanceClass)) {
					log.debug("Registering enum type mapper/wrapper for eclass: " + instanceClass.getName());
					tm.addType(initPmf.getPMFContext().getPluginManager(),
							"org.jpox.store_mapping", 
							instanceClass.getName(), ENumMapping.class.getName(), null,
							true, "1.4", true, false, true, clr);
				}
			}
		}
	}

	/** Add specific custom types */
	protected void addCustomTypes(AbstractPersistenceManagerFactory initPmf, 
			org.jpox.ClassLoaderResolver clr) {
	
	}
	
	
	/** Checks if the passed object is by any change a contained object and if so returns true */
	public boolean isContainedObject(Object obj) {
		// TODO also check containment for superclasses
		final ArrayList referers = (ArrayList) refersToMap.get(obj.getClass());
		if (referers == null || referers.size() == 0)
			return false;
		for (int i = 0; i < referers.size(); i++) {
			final ReferenceTo refTo = (ReferenceTo) referers.get(i);
			if (refTo.isContainer())
				return true;
		}
		return false;
	}

	/** Get the name */
	public String getName() {
		return name;
	}

	/** Return the mapped epackages */
	public EPackage[] getEPackages() {
		return ePackages;
	}

	/** Get the persistence manager factory */
	public PersistenceManagerFactory getPMF() {
		return pmf;
	}

	/** Close the PersistenceManagerFactory */
	public void close() {
		if (pmf == null)
			return;
		if (pmf.isClosed())
			return;
		org.jpox.PersistenceManager pm = (org.jpox.PersistenceManager) pmf.getPersistenceManager();
		StoreManager store_mgr = pm.getStoreManager();
		store_mgr.close(); // removeAllClasses(new JDOClassLoaderResolver());
		pm.close();
		pmf.close();
	}

	/** Returns the instanceclass for a passed interface */
	public Class getInstanceClass(Class interf) {
		return ERuntime.INSTANCE.getInstanceClass(interf);
	}

	/** Returns the list of names of topclasses, used by resources */
	public String[] getTopClasses() {
		String[] topClasses = new String[storeTopClasses.length];
		for (int i = 0; i < storeTopClasses.length; i++) {
			topClasses[i] = storeTopClasses[i].getName();
		}
		return topClasses;
	}

	/**
	 * Import the complete content from an inputstream into the EMF Data Store. The ExportTarget is the constant defined
	 * in the EMFDataStore interface.
	 */
	public void importDataStore(InputStream is, int importFormat) {
		final Resource importResource;
		if (importFormat == JpoxConstants.EXCHANGE_FORMAT_XML) {
			importResource = new XMLResourceImpl();
		} else {
			importResource = new XMIResourceImpl();
		}

		final JPOXResource jpoxResource = new JPOXResource(URI.createFileURI("." + name));

		try {
			importResource.load(is, Collections.EMPTY_MAP);
			jpoxResource.getContents().addAll(importResource.getContents());
			jpoxResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new JpoxStoreException("Exception when exporting " + name, e);
		}
	}

	/** Export the complete content of the EMF Data Store to an outputstream */
	public void exportDataStore(OutputStream os, int exportFormat, String encoding) {
		final JPOXResource jpoxResource = new JPOXResource(URI.createFileURI("." + name));
		jpoxResource.load(Collections.EMPTY_MAP);

		try {
			final Resource exportResource;
			if (exportFormat == JpoxConstants.EXCHANGE_FORMAT_XML) {
				exportResource = new XMLResourceImpl();
			} else {
				exportResource = new XMIResourceImpl();
			}

			exportResource.getContents().addAll(jpoxResource.getContents());

			final HashMap options = new HashMap();
			if (encoding != null) {
				options.put(XMLResource.OPTION_ENCODING, encoding);
			}

			exportResource.save(os, options);

			jpoxResource.unload();
		} catch (IOException e) {
			throw new JpoxStoreException("Exception when exporting " + name, e);
		}
	}

	/** Creates the tables in the database. This code is partially copied from the org.jpox.SchemaTool */
	protected void createSchema(String[] pcClassNames, Properties origProps) {
		if (!updateSchema) {
			log.debug("Update of the database schema has been disabled returning");
		}
		log.debug("Updating database schema");

		// clone the original properties
		final Properties newProps = (Properties) origProps.clone();

		// set validate and create values
		newProps.setProperty(PMFConfiguration.AUTO_CREATE_COLUMNS_PROPERTY, "true");
		newProps.setProperty(PMFConfiguration.AUTO_CREATE_SCHEMA_PROPERTY, "true");
		newProps.setProperty(PMFConfiguration.VALIDATE_COLUMNS_PROPERTY, "true");
		newProps.setProperty(PMFConfiguration.VALIDATE_CONSTRAINTS_PROPERTY, "true");
		newProps.setProperty(PMFConfiguration.VALIDATE_TABLES_PROPERTY, "true");

		// Create a PersistenceManager for this store and create the tables
		final PersistenceManagerFactory localPmf = JDOHelper.getPersistenceManagerFactory(newProps);
		initializeTypeManager((AbstractPersistenceManagerFactory)localPmf);
		final org.jpox.PersistenceManager pm = (org.jpox.PersistenceManager) localPmf.getPersistenceManager();
		StoreManager store_mgr = pm.getStoreManager();
		try {
			store_mgr.addClasses(pcClassNames, pm.getClassLoaderResolver(), null);
		} finally {
			pm.close();
			localPmf.close();
		}
	}

	/**
	 * Creates a list of classnames on the basis of the jdo files. This code has been copied partially from jpox.org.
	 * This copying was required because jpox does not support passing jdo file names as resource paths.
	 */
	private String[] getAllClassNames(String[] jdoFiles) {
		// then determine the list of jdo files
		// Build up set of classes
		List class_names = null;
		try {
			class_names = getClassNames(jdoFiles);
		} catch (Exception e) {
			throw new JpoxStoreException("Exception while reading jdo_files, fileList: " + dumpFileList(jdoFiles), e);
		}

		if (class_names == null || class_names.size() == 0) {
			throw new JpoxStoreException(
					"There are no classes in the jdo files? A common reason can be that your classes are not enhanced, used jdo files: "
							+ dumpFileList(jdoFiles));
		}
		final String[] class_name_array = new String[class_names.size()];
		final Iterator class_names_iter = class_names.iterator();
		int i = 0;
		while (class_names_iter.hasNext()) {
			class_name_array[i++] = (String) class_names_iter.next();
		}
		return class_name_array;
	}

	/**
	 * Returns an ordered list of classnames so that all super class names are present in the list before their
	 * subclass.
	 */
	public List getClassNames(String[] packageJDOFiles) throws Exception {
		ArrayList result = new ArrayList();

		final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		final DocumentBuilder documentBuilder = dbFactory.newDocumentBuilder();

		documentBuilder.setEntityResolver(new JDOEntityResolver());

		for (int i = 0; i < packageJDOFiles.length; i++) {
			log.debug("Reading jdo file: " + packageJDOFiles[i]);
			InputStream is = this.getClass().getResourceAsStream(packageJDOFiles[i]);
			if (is == null) { // absolute location somewhere?
				is = new FileInputStream(packageJDOFiles[i]);
			}
			final Element docElement = documentBuilder.parse(is)
					.getDocumentElement();

			// find all the nodes with tagname class
			final NodeList nodes = docElement.getElementsByTagName("class");
			for (int j = 0; j < nodes.getLength(); j++) {
				// the class element
				Element classElement = (Element) nodes.item(j);
				String className = classElement.getAttribute("name");

				// find the package name by going one level up.
				String packageName = ((Element) classElement.getParentNode()).getAttribute("name");
				className = ClassUtils.createFullClassName(packageName, className);
				result.add(className);
			}
		}
		return result;
	}

	/** Creates a comma delimited list of a file list */
	private String dumpFileList(String[] jdoFileList) {
		if (jdoFileList == null)
			return "The filelist is NULL";
		if (jdoFileList.length == 0)
			return "The filelist is empty";

		final StringBuffer result = new StringBuffer();
		for (int i = 0; i < jdoFileList.length; i++) {
			if (i > 0)
				result.append(", ");
			result.append(jdoFileList[i]);
		}
		return result.toString();
	}

	/** Dump properties in the log */
	private void logProperties(Properties props) {
		final Iterator it = props.keySet().iterator();
		while (it.hasNext()) {
			final String key = (String) it.next();
			log.info(key + ": " + props.get(key));
		}
	}

	/**
	 * Returns an array of EObjects which refer to a certain EObject, note if the array is of length zero then no
	 * refering EObjects where found. The passed Session is used to create a query. The transaction handling should be
	 * done by the caller.
	 */
	public Object[] getCrossReferencers(PersistenceManager pm, Object referedTo) {
		final ArrayList result = getCrossReferencers(pm, referedTo, false);
		return (Object[]) result.toArray(new Object[result.size()]);
	}

	/** Returns only the container of the passed object, should always be one */
	public EObject getContainer(PersistenceManager pm, EObject referedTo) {
		final ArrayList result = getCrossReferencers(pm, referedTo, true);
		if (result.size() == 1) {
			return (EObject) result.get(0);
		} else if (result.size() == 0) {
			return null;
		} else {
			throw new JpoxStoreException("To many containers found for EObject: " + referedTo.getClass().getName()
					+ " total: " + result.size());
		}
	}

	/**
	 * Returns an array of EObjects which refer to a certain EObject, note if the array is of length zero then no
	 * refering EObjects where found. The passed Session is used to create a query. The transaction handling should be
	 * done by the caller. onlyContainers means to only check containment relations.
	 */
	private ArrayList getCrossReferencers(PersistenceManager pm, Object referedTo, boolean onlyContainers) {
		final ArrayList refersList = (ArrayList) refersToMap.get(referedTo.getClass());
		if (refersList == null || refersList.size() == 0)
			return new ArrayList();
		final ArrayList result = new ArrayList();
		for (int i = 0; i < refersList.size(); i++) {
			final ReferenceTo refersTo = (ReferenceTo) refersList.get(i);

			// if we only check containment relations then skip this
			if (onlyContainers && !refersTo.isContainer())
				continue;

			final Query qry = pm.newQuery(refersTo.getQueryStr());

			final Iterator it = ((List) qry.execute(referedTo)).iterator();
			while (it.hasNext()) {
				Object obj = it.next();

				// in case of a featuremapentry, the entry is not the referer but the owner of the featuremap is
				if (obj instanceof FeatureMapEntry) {
					// search then again with the featuremap
					final ArrayList fms = getCrossReferencers(pm, obj, false);
					if (fms.size() == 0) {
						new AssertionError("The featuremap for featuremap entry " + obj.getClass().getName()
								+ " can not be found");
					}
					obj = fms.get(0);
				}

				// AssertUtil.assertTrue("Getting refersto of " + referedTo.getClass().getName() +
				// ", however one of the refersto is not an eobject but a " + obj.getClass().getName(),
				// obj instanceof EObject);

				if (!result.contains(obj))
					result.add(obj);
			}
		}

		return result;
	}

	/**
	 * Sets the container field of the referedTo EObject, returns true if the container was actually set.
	 */
	public boolean setContainer(PersistenceManager pm, EObject child) {
		if (child.eContainer() != null) {
			log.warn("Container property of " + child.getClass().getName() + " already set to a class: "
					+ child.eContainer().getClass().getName() + ". This method should better only be used to "
					+ "initialize the container property and not to overwrite. Returning without doing anything");
			return false;
		}

		final ArrayList refersList = (ArrayList) refersToMap.get(child.getClass());
		if (refersList == null || refersList.size() == 0)
			return false;
		for (int i = 0; i < refersList.size(); i++) {
			final ReferenceTo refersTo = (ReferenceTo) refersList.get(i);

			// if we only check containment relations then skip this
			if (!refersTo.isContainer())
				continue;

			Query qry = pm.newQuery(refersTo.getQueryStr());
			List list = ((List) qry.execute(child));

			EStructuralFeature esf = refersTo.getStructuralFeature();

			if (list.size() == 1) {
				final Object obj = list.get(0);
				EContainerRepairControl.setContainer((InternalEObject) obj, (InternalEObject) child, esf);

				// instead of returning the queries could also continue to check for error situation
				// nl. that there is not more than one container for an object.
				return true;
			} else if (list.size() > 1) {
				throw new AssertionError("The eobject " + child.getClass().getName()
						+ " is contained by multiple other objects through the feature " + esf.getName() + " of "
						+ refersTo.getFromClass().getName());
			}
		}

		return false;
	}

	/** Creates a hashmap which for each class holds the classes which refer to it */
	private HashMap createRefersToMap(MetaDataManager mdm, String[] allClassNames) {
		final JDOClassLoaderResolver clr = new JDOClassLoaderResolver();
		try {
			final Class[] allClasses = new Class[allClassNames.length];

			final HashMap result = new HashMap();
			for (int i = 0; i < allClasses.length; i++) {
				allClasses[i] = ClassLoaderResolver.classForName(allClassNames[i]);
				result.put(allClasses[i], new ArrayList());
			}

			for (int i = 0; i < allClasses.length; i++) {
				final AbstractClassMetaData cmd = mdm.getMetaDataForClass(allClasses[i], clr);

				// these should be handled together with their parents
				// todo support embedded references
				if (cmd.isEmbeddedOnly())
					continue;

				for (int j = 0; j < cmd.getNoOfFields(); j++) {
					final AbstractPropertyMetaData fld = cmd.getField(j);

					createRefersToFromField(fld, allClasses[i], result, false, fld.getName());
				}
			}

			// at the end for each class all the refersto of superclasses and interfaces are added also
			final Iterator keyIt = result.keySet().iterator();
			final ArrayList classDone = new ArrayList();
			while (keyIt.hasNext()) {
				setRefersToOfSupers((Class) keyIt.next(), result, classDone);
			}

			return result;
		} catch (Exception e) {
			throw new JpoxStoreException("Exception when determining refers to", e);
		}
	}

	/** Creates a refers to from a fld metadata, handles collections, feature maps etc. */
	private void createRefersToFromField(AbstractPropertyMetaData fld, Class fromClass, HashMap result, boolean isFeatureMapField,
			String propName) {
		boolean isMany = false;
		boolean isContained = false;
		Class[] toClasses = null;
		String[] featureNames = null;
		featureNames = getFeatureNames(fld);
		if (fld.getCollection() != null) // many field
		{
			isMany = true;
			isContained = fld.getCollection().isDependentElement();
			Class toClass = ClassLoaderResolver.classForName(fld.getCollection().getElementType());
			if (GenericFeatureMapEntry.class.isAssignableFrom(toClass)) { // a feature map find the real toclasses
				final AbstractPropertyMetaData[] fmds = fld.getElementMetaData().getEmbeddedMetaData().getFieldMetaData();
				for (int k = 0; k < fmds.length; k++) {
					final AbstractPropertyMetaData fmd = fmds[k];
					createRefersToFromField(fmd, fromClass, result, true, propName);
				}
				return;
			} else {
				if (fld.getExtensions() != null) {
					toClasses = getImplementationClasses(fld);
				}
				if (toClasses == null) { // no impl classes extension
					toClasses = new Class[] { toClass };
				}
			}
		} else {
			if (fld.getExtensions() != null) {
				toClasses = getImplementationClasses(fld);
			}

			// not found!
			if (toClasses == null) {
				if (!fld.isFieldTypePersistenceCapable())
					return;
				toClasses = new Class[] { fld.getType() };
			}

			isContained = fld.isDependent();
		}

		if (loadContainmentEagerly && isContained) {
			fld.getContainer().addExtension("cache-lazy-loading", "false");
		}

		for (int c = 0; c < toClasses.length; c++) {
			AssertUtil.assertTrue("Feature names and toclasses should have the same number of elements",
					toClasses.length == featureNames.length);
			Class tclass = toClasses[c];
			if (tclass.isInterface() && EObject.class.isAssignableFrom(tclass)) {
				tclass = ERuntime.INSTANCE.getInstanceClass(tclass);
				if (tclass == null) { // no impl. class for interface
					log.debug("Ignoring " + toClasses[c].getName()
							+ " for computation of referencing classes because it has no concrete implementor");
					continue;
				}
			}

			// ignore these
			if (!PersistenceCapable.class.isAssignableFrom(tclass))
				continue;

			final ArrayList list = (ArrayList) result.get(tclass);
			if (list == null)
				continue; // happens when an element of a list is a simpletype or so

			list.add(new ReferenceTo(fromClass, tclass, propName, featureNames[c], isContained, isMany,
					isFeatureMapField));
		}
	}

	/**
	 * Returns the feature names defined in the extension, if the extension is not found then the name of the fld is
	 * used
	 */
	private String[] getFeatureNames(AbstractPropertyMetaData fld) {
		String[] features = getSplittedExtension(fld, "estructuralfeatures");
		if (features != null)
			return features;
		return new String[] { fld.getName() };
	}

	/** Returns a list of implementation-classes based on the implementation-classes extension */
	private Class[] getImplementationClasses(AbstractPropertyMetaData fld) {
		Class[] toClasses = null;
		final String[] classes = getSplittedExtension(fld, "implementation-classes");
		if (classes == null)
			return null;
		toClasses = new Class[classes.length];
		for (int c = 0; c < classes.length; c++) {
			toClasses[c] = resolveClass(classes[c]);
		}
		return toClasses;
	}

	/** returns the comma split value of the extension, or null if not found or empty */
	private String[] getSplittedExtension(AbstractPropertyMetaData fld, String extension) {
		if (fld.getExtensions() == null)
			return null;
		for (int i = 0; i < fld.getExtensions().length; i++) {
			ExtensionMetaData emd = fld.getExtension(i);

			if (emd.getKey().compareTo(extension) == 0 && emd.getValue() != null && emd.getValue().length() > 0) {
				// special case create an array
				return emd.getValue().split(",");
			}
		}
		return null;
	}

	/** Returns the class, also handles primitive types */
	private Class resolveClass(String className) {
		if (className.compareTo("boolean") == 0)
			return boolean.class;
		if (className.compareTo("byte") == 0)
			return byte.class;
		if (className.compareTo("char") == 0)
			return char.class;
		if (className.compareTo("short") == 0)
			return short.class;
		if (className.compareTo("int") == 0)
			return int.class;
		if (className.compareTo("long") == 0)
			return long.class;
		if (className.compareTo("float") == 0)
			return float.class;
		if (className.compareTo("double") == 0)
			return double.class;
		return ClassLoaderResolver.classForName(className);
	}

	/**
	 * Add the refersto for each superclass/interface to the subclass refersto list. As a convenience returns the set
	 * list
	 */
	private ArrayList setRefersToOfSupers(Class clazz, HashMap refersTo, ArrayList classDone) {
		if (classDone.contains(clazz)) {
			return (ArrayList) refersTo.get(clazz);
		}

		final ArrayList thisList = (ArrayList) refersTo.get(clazz);
		if (thisList == null) {
			return new ArrayList();
		}
		if (clazz.getSuperclass() != null) {
			addUnique(thisList, setRefersToOfSupers(clazz.getSuperclass(), refersTo, classDone));
		}

		final Class[] interfs = clazz.getInterfaces();
		for (int i = 0; i < interfs.length; i++) {
			addUnique(thisList, (ArrayList) refersTo.get(interfs[i]));
		}
		classDone.add(clazz);
		return thisList;
	}

	/** Adds list 2 to list 1 without duplicates */
	private void addUnique(ArrayList l1, ArrayList l2) {
		if (l2 == null)
			return; // this is a valid situation so do nothing

		final Iterator it = l2.iterator();
		while (it.hasNext()) {
			final Object obj = it.next();
			if (!l1.contains(obj))
				l1.add(obj);
		}
	}

	/** Contains the reference to a class which refers to another reference */
	public class ReferenceTo {
		/** The from class */
		private final Class fromClass;

		/** And the ereference used to point */
		private final String name;

		/** Is contained */
		private final boolean isContainer;

		/** Is many */
		private final boolean isMany;

		/** The query used to find the occurence */
		private final String qryStr;

		/** Try to find the structuralfeature */
		private final EStructuralFeature structuralFeature;

		/** Constructor */
		public ReferenceTo(Class theFromClass, Class theToClass, String propName, String featureName,
				boolean myIsContainer, boolean myIsMany, boolean isFeatureMapEntryField) {
			fromClass = theFromClass;
//			toClass = theToClass;
			name = propName;
			isContainer = myIsContainer;
			isMany = myIsMany;

			if (isFeatureMapEntryField) {
				qryStr = "SELECT FROM " + fromClass.getName() + " WHERE " + name
						+ ".contains(gfme) && gfme.localReferenceValue==:toObject " + "VARIABLES "
						+ GenericFeatureMapEntry.class.getName() + " gfme";
			} else if (isMany) {
				qryStr = "SELECT FROM " + fromClass.getName() + " WHERE " + name + ".contains(:toObject)";
			} else {
				qryStr = "SELECT FROM " + fromClass.getName() + " WHERE " + name + " == :toObject";
			}

			if (isContainer) {
				final EClass eclass = ERuntime.INSTANCE.getEClass(fromClass);
				assert (eclass != null);
				structuralFeature = StoreUtil.getEStructuralFeature(eclass, featureName);
			} else {
				structuralFeature = null;
			}
		}

		/**
		 * @return Returns the isContainer.
		 */
		public boolean isContainer() {
			return isContainer;
		}

		/** Returns the fromclass */
		public Class getFromClass() {
			return fromClass;
		}

		/**
		 * @return Returns the structuralfeature
		 */
		public EStructuralFeature getStructuralFeature() {
			AssertUtil.assertTrue("The getstructural feature may only be called for containment relations. " + name
					+ " of " + fromClass.getClass().getName() + " is not a containment relation.", isContainer);
			return structuralFeature;
		}

		/** Returns the query string used used */
		public String getQueryStr() {
			return qryStr;
		}
	}

	/**
	 * @param epackages
	 *            the epackages to set
	 */
	public void setEPackages(EPackage[] ePackages) {
		this.ePackages = ePackages;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the props
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * @param props
	 *            the props to set
	 */
	public void setProperties(Properties props) {
		this.properties.putAll(props);

		if (props.get(PersistenceOptions.INHERITANCE_MAPPING) != null) {
			log.debug("Option " + PersistenceOptions.INHERITANCE_MAPPING + " is set to: "
					+ props.getProperty(PersistenceOptions.INHERITANCE_MAPPING) + " translating to option "
					+ PMFConfiguration.DEFAULT_INHERITANCE_STRATEGY_PROPERTY);

			String inheritanceMapping = props.getProperty(PersistenceOptions.INHERITANCE_MAPPING);
			switch (InheritanceType.get(inheritanceMapping).getValue()) {
			case InheritanceType.JOINED:
				properties.put(PMFConfiguration.DEFAULT_INHERITANCE_STRATEGY_PROPERTY, "JPOX");
				log.debug("Option inheritance: JPOX");
				break;
			case InheritanceType.SINGLE_TABLE:
				properties.put(PMFConfiguration.DEFAULT_INHERITANCE_STRATEGY_PROPERTY, "JDO2");
				log.debug("Option inheritance: JDO2");
				break;
			default:
				throw new IllegalArgumentException("Inheritance mapping option: " + inheritanceMapping
						+ " is not supported");
			}
		}

		updateSchema = props.get(PersistenceOptions.UPDATE_SCHEMA) == null
				|| props.getProperty(PersistenceOptions.UPDATE_SCHEMA).compareTo("true") == 0;

		log.debug("Option updateschema: " + updateSchema);

		havePropertiesBeenSet = true;
	}
}