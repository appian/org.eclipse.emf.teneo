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
 * $Id: JpoxDataStore.java,v 1.21 2008/01/20 05:59:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.spi.PersistenceCapable;
import javax.xml.namespace.QName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.AbstractEnumerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.Enumerator;
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
import org.eclipse.emf.teneo.DataStore;
import org.eclipse.emf.teneo.EContainerRepairControl;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;
import org.eclipse.emf.teneo.ecore.EModelResolver;
import org.eclipse.emf.teneo.extension.ExtensionManager;
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
import org.eclipse.emf.teneo.jpox.mapping.QNameMapping;
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
import org.jpox.metadata.InheritanceStrategy;
import org.jpox.metadata.MetaDataManager;
import org.jpox.plugin.ConfigurationElement;
import org.jpox.plugin.Extension;
import org.jpox.plugin.ExtensionPoint;
import org.jpox.store.StoreManager;

/**
 * Defines for one or more EPackages where (in which relational store) they are persisted. In
 * addition supports mapping of interface names to concrete classnames used by jpox and computes the
 * 'top' classes. The classes which are not contained in other classes.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.21 $ $Date: 2008/01/20 05:59:13 $
 */

public class JpoxDataStore implements DataStore {
	/** The logger */
	private static final Log log = LogFactory.getLog(JpoxDataStore.class);

	/** The AbstractEnumerator which is the super class of all emf enums */
	private static final Class<?> emfEnumClass = AbstractEnumerator.class;
	private static final Class<?> nextEmfEnumClass = Enumerator.class;

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
	private final Properties properties = new Properties();

	/** Has setprops been called */
	private boolean havePropertiesBeenSet = false;

	/** Keeps track if the schema should be updated */
	private boolean updateSchema = false;

	/** The extensionManager */
	private ExtensionManager extensionManager;

	/** The constructor, fills the default properties */
	JpoxDataStore() {
		// properties.setProperty(PMFConfiguration.JDO_DETACHONCLOSE_PROPERTY,"true");
		// properties.setProperty(PMFConfiguration.JDO_DETACHALLONCOMMIT_PROPERTY,"true");
		// properties.setProperty(PMFConfiguration.JDO_CACHE_COLLECTIONS_LAZY_PROPERTY,
		// "true");

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

		// properties.setProperty(PMFConfiguration.JDO_DETACHALLONCOMMIT_PROPERTY,
		// "true");
		properties.setProperty(PMFConfiguration.PERSISTENCE_BY_REACHABILITY_AT_COMMIT, "true");

		properties.setProperty(PMFConfiguration.DELETION_POLICY_PROPERTY, "JPOX");

		properties.setProperty(PMFConfiguration.CACHE_LEVEL_1_TYPE_PROPERTY,
			"org.eclipse.emf.teneo.jpox.cache.EMFWeakRefCache");
		properties.setProperty(PMFConfiguration.METADATA_JDO_FILE_EXTENSION_PROPERTY, JpoxHelper.INSTANCE
			.getJdoFileExtension());
		properties.setProperty(PersistenceOptions.EMAP_AS_TRUE_MAP, "false");
	}

	/** Initialize the datastore, creates the database and */
	public final void initialize() {

		if (ePackages == null) {
			throw new JpoxStoreException("EPackages are not set");
		}
		if (name == null) {
			throw new JpoxStoreException("Name is not set");
		}
		if (!havePropertiesBeenSet) {
			throw new JpoxStoreException("Specific properties have not been set");
		}

		// set the eruntime as the emodel resolver!
		EModelResolver.instance().register(getEPackages());

		// the jdo file list
		String suffix = properties.getProperty(PMFConfiguration.METADATA_JDO_FILE_EXTENSION_PROPERTY);
		if (suffix == null) {
			suffix = "jdo";
		}
		final String jdoFileName = JpoxConstants.PREFIX_PACKAGE + JpoxConstants.EXTENSION_SEPARATOR + suffix;
		final String[] jdoFileList = StoreUtil.getFileList(jdoFileName, null);
		if (jdoFileList.length == 0) {
			throw new JpoxStoreException("No jdo files can be found in the classpath");
		}

		// then create the list of all classnames
		final Set<Class<?>> classes = ERuntime.INSTANCE.getAllConcreteClasses();
		final List<Class<?>> pcList = new ArrayList<Class<?>>();
		for (Class<?> clz : classes) {
			if (PersistenceCapable.class.isAssignableFrom(clz)) {
				pcList.add(clz);
			}
		}
		final String[] pcClassNames = new String[pcList.size()];
		int i = 0;
		final StringBuffer classNameList = new StringBuffer();
		for (Class<?> clz : pcList) {
			if (i > 0) {
				classNameList.append(",");
			}
			classNameList.append(pcClassNames[i]);
			pcClassNames[i++] = clz.getName();
		}

		// create the schema
		createSchema(pcClassNames, properties);

		classNameList.append(",");
		classNameList.append(AnyTypeEObject.class.getName());
		classNameList.append(",");
		classNameList.append(AnyFeatureMapEntry.class.getName());

		properties.setProperty("org.jpox.autoStartMechanism", "Classes");
		properties.setProperty("org.jpox.autoStartClassNames", classNameList.toString());

		// and then create a pmf which does all the work but does not check the
		// schema all the time
		pmf = JpoxHelper.INSTANCE.getPMFCreator().getPersistenceManagerFactory(properties);
		initializeTypeManager((AbstractPersistenceManagerFactory) pmf);
		pmf.addInstanceLifecycleListener(new RemoveLifeCycleListener(), null);

		loadContainmentEagerly =
				properties.getProperty(PersistenceOptions.FETCH_CONTAINMENT_EAGERLY) != null &&
						"true".compareTo(properties.getProperty(PersistenceOptions.FETCH_CONTAINMENT_EAGERLY)) == 0;

		final MetaDataManager mdm = ((PersistenceManagerFactoryImpl) pmf).getPMFContext().getMetaDataManager();

		refersToMap = createRefersToMap(mdm, pcClassNames);

		final JDOClassLoaderResolver clr = new JDOClassLoaderResolver();

		// This part of the code has to be done as last in the initialization
		// otherwise
		// things don't work (get an empty metadatamanager, it is unclear at
		// this point
		// why this needs to be done like this.
		Class[] topClasses = ((ERuntime) EModelResolver.instance()).getTopClasses();
		// check if the topclasses are persistencecapable!
		final ArrayList newTopClasses = new ArrayList();
		for (Class element : topClasses) {
			final Class concrete = ((ERuntime) EModelResolver.instance()).getInstanceClass(element);
			if (concrete != null && PersistenceCapable.class.isAssignableFrom(concrete)) {
				// now check if the class is mapped as a sub-class, in which
				// case it is not a topclass
				// in this add all the subclasses to the
				if (isMappedSuperClass(concrete, mdm, clr)) {
					final List<Class<?>> result = getSubClasses(concrete, mdm, clr);
					newTopClasses.removeAll(result);
					newTopClasses.addAll(result);
				} else if (!newTopClasses.contains(concrete)) {
					newTopClasses.add(concrete);
				}
			}
		}
		storeTopClasses = (Class[]) newTopClasses.toArray(new Class[newTopClasses.size()]);

		if (log.isInfoEnabled()) {
			log.info("Persistence manager factory created using properties: ");
			logProperties(properties);
		}
	}

	/** Returns true if the passed class is a mapped superclass */
	private boolean isMappedSuperClass(Class clazz, MetaDataManager mdm, JDOClassLoaderResolver clr) {
		final AbstractClassMetaData amd = mdm.getMetaDataForClass(clazz, clr);
		return amd.getInheritanceMetaData().getStrategyValue().equals(InheritanceStrategy.SUBCLASS_TABLE);
	}

	/**
	 * Get the list of all sub subclasses and subclasses which are not a mappedsuperclass
	 */
	private List<Class<?>> getSubClasses(Class<?> clz, MetaDataManager mdm, JDOClassLoaderResolver clr) {
		final ArrayList<Class<?>> subClasses = new ArrayList<Class<?>>();
		final String[] subs = mdm.getSubclassesForClass(clz.getName(), false);

		if (subs == null) {
			return subClasses;
		}
		for (String sub : subs) {
			final Class<?> subClass = ClassLoaderResolver.classForName(sub);
			if (isMappedSuperClass(subClass, mdm, clr)) {
				subClasses.addAll(getSubClasses(subClass, mdm, clr));
			} else {
				subClasses.add(subClass);
			}
		}
		return subClasses;
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

		final ExtensionPoint mappingEP =
				initPmf.getPMFContext().getPluginManager().getExtensionPoint("org.jpox.store_mapping");
		final Extension mappingExt = new Extension(mappingEP, mappingEP.getPlugin());
		mappingEP.addExtension(mappingExt);
		final ConfigurationElement mce = new ConfigurationElement(extension, "mapping", null);
		mce.putAttribute("java-type", QName.class.getName());
		mce.putAttribute("mapping-class", QNameMapping.class.getName());
		mappingExt.addConfigurationElement(mce);

		tm.addType(initPmf.getPMFContext().getPluginManager(), "org.jpox.store_mapping", List.class.getName(),
			EListMapping.class.getName(), EListWrapper.class.getName(), false, "1.4", true, false, false, clr);
		tm.addType(initPmf.getPMFContext().getPluginManager(), "org.jpox.store_mapping", EList.class.getName(),
			EListMapping.class.getName(), EListWrapper.class.getName(), false, "1.4", true, false, false, clr);
		tm.addType(initPmf.getPMFContext().getPluginManager(), "org.jpox.store_mapping", EMap.class.getName(),
			EListMapping.class.getName(), EListWrapper.class.getName(), false, "1.4", true, false, false, clr);
		tm
			.addType(initPmf.getPMFContext().getPluginManager(), "org.jpox.store_mapping", FeatureMap.class.getName(),
				FeatureMapMapping.class.getName(), FeatureMapWrapper.class.getName(), false, "1.4", true, false, false,
				clr);
		tm.addType(initPmf.getPMFContext().getPluginManager(), "org.jpox.store_mapping", EObject.class.getName(),
			EObjectMapping.class.getName(), null, true, "1.4", true, false, true, clr);

		addCustomTypes(initPmf, clr);

		for (int i = 0; i < getEPackages().length; i++) {
			final EPackage epack = getEPackages()[i];
			final Iterator it = epack.getEClassifiers().iterator();
			while (it.hasNext()) {
				final EClassifier eclassifier = (EClassifier) it.next();
				final Class instanceClass = eclassifier.getInstanceClass();

				if (emfEnumClass.isAssignableFrom(instanceClass) || nextEmfEnumClass.isAssignableFrom(instanceClass)) {
					log.debug("Registering enum type mapper/wrapper for eclass: " + instanceClass.getName());
					tm.addType(initPmf.getPMFContext().getPluginManager(), "org.jpox.store_mapping", instanceClass
						.getName(), ENumMapping.class.getName(), null, true, "1.4", true, false, true, clr);
				}
			}
		}
	}

	/** Add specific custom types */
	protected void addCustomTypes(AbstractPersistenceManagerFactory initPmf, org.jpox.ClassLoaderResolver clr) {

	}

	/**
	 * Checks if the passed object is by any change a contained object and if so returns true
	 */
	public boolean isContainedObject(Object obj) {
		// TODO also check containment for superclasses
		final ArrayList referers = (ArrayList) refersToMap.get(obj.getClass());
		if (referers == null || referers.size() == 0) {
			return false;
		}
		for (int i = 0; i < referers.size(); i++) {
			final ReferenceTo refTo = (ReferenceTo) referers.get(i);
			if (refTo.isContainer()) {
				return true;
			}
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
		if (pmf == null) {
			return;
		}
		if (pmf.isClosed()) {
			return;
		}
		org.jpox.PersistenceManager pm = (org.jpox.PersistenceManager) pmf.getPersistenceManager();
		StoreManager store_mgr = pm.getStoreManager();
		store_mgr.close(); // removeAllClasses(new JDOClassLoaderResolver());
		pm.close();
		pmf.close();
	}

	/** Returns the instanceclass for a passed interface */
	public Class getInstanceClass(Class interf) {
		return ((ERuntime) EModelResolver.instance()).getInstanceClass(interf);
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
	 * Import the complete content from an inputstream into the EMF Data Store. The ExportTarget is
	 * the constant defined in the EMFDataStore interface.
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

	/**
	 * Creates the tables in the database. This code is partially copied from the
	 * org.jpox.SchemaTool
	 */
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
		initializeTypeManager((AbstractPersistenceManagerFactory) localPmf);
		final org.jpox.PersistenceManager pm = (org.jpox.PersistenceManager) localPmf.getPersistenceManager();
		StoreManager store_mgr = pm.getStoreManager();
		try {
			store_mgr.addClasses(pcClassNames, pm.getClassLoaderResolver(), null);
		} finally {
			pm.close();
			localPmf.close();
		}
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
	 * Returns an array of EObjects which refer to a certain EObject, note if the array is of length
	 * zero then no refering EObjects where found. The passed Session is used to create a query. The
	 * transaction handling should be done by the caller.
	 */
	public Object[] getCrossReferencers(PersistenceManager pm, Object referedTo) {
		final ArrayList result = getCrossReferencers(pm, referedTo, false);
		return result.toArray(new Object[result.size()]);
	}

	/** Returns only the container of the passed object, should always be one */
	public EObject getContainer(PersistenceManager pm, EObject referedTo) {
		final ArrayList result = getCrossReferencers(pm, referedTo, true);
		if (result.size() == 1) {
			return (EObject) result.get(0);
		} else if (result.size() == 0) {
			return null;
		} else {
			throw new JpoxStoreException("To many containers found for EObject: " + referedTo.getClass().getName() +
					" total: " + result.size());
		}
	}

	/**
	 * Returns an array of EObjects which refer to a certain EObject, note if the array is of length
	 * zero then no refering EObjects where found. The passed Session is used to create a query. The
	 * transaction handling should be done by the caller. onlyContainers means to only check
	 * containment relations.
	 */
	private ArrayList getCrossReferencers(PersistenceManager pm, Object referedTo, boolean onlyContainers) {
		final ArrayList refersList = (ArrayList) refersToMap.get(referedTo.getClass());
		if (refersList == null || refersList.size() == 0) {
			return new ArrayList();
		}
		final ArrayList result = new ArrayList();
		for (int i = 0; i < refersList.size(); i++) {
			final ReferenceTo refersTo = (ReferenceTo) refersList.get(i);

			// if we only check containment relations then skip this
			if (onlyContainers && !refersTo.isContainer()) {
				continue;
			}

			final Query qry = pm.newQuery(refersTo.getQueryStr());

			final Iterator it = ((List) qry.execute(referedTo)).iterator();
			while (it.hasNext()) {
				Object obj = it.next();

				// in case of a featuremapentry, the entry is not the referer
				// but the owner of the featuremap is
				if (obj instanceof FeatureMapEntry) {
					// search then again with the featuremap
					final ArrayList fms = getCrossReferencers(pm, obj, false);
					if (fms.size() == 0) {
						new AssertionError("The featuremap for featuremap entry " + obj.getClass().getName() +
								" can not be found");
					}
					obj = fms.get(0);
				}

				// AssertUtil.assertTrue("Getting refersto of " +
				// referedTo.getClass().getName() +
				// ", however one of the refersto is not an eobject but a " +
				// obj.getClass().getName(),
				// obj instanceof EObject);

				if (!result.contains(obj)) {
					result.add(obj);
				}
			}
		}

		return result;
	}

	/**
	 * Sets the container field of the referedTo EObject, returns true if the container was actually
	 * set.
	 */
	public boolean setContainer(PersistenceManager pm, EObject child) {
		if (child.eContainer() != null) {
			log.warn("Container property of " + child.getClass().getName() + " already set to a class: " +
					child.eContainer().getClass().getName() + ". This method should better only be used to " +
					"initialize the container property and not to overwrite. Returning without doing anything");
			return false;
		}

		final ArrayList refersList = (ArrayList) refersToMap.get(child.getClass());
		if (refersList == null || refersList.size() == 0) {
			return false;
		}
		for (int i = 0; i < refersList.size(); i++) {
			final ReferenceTo refersTo = (ReferenceTo) refersList.get(i);

			// if we only check containment relations then skip this
			if (!refersTo.isContainer()) {
				continue;
			}

			Query qry = pm.newQuery(refersTo.getQueryStr());
			List list = ((List) qry.execute(child));

			EStructuralFeature esf = refersTo.getStructuralFeature();

			if (list.size() == 1) {
				final Object obj = list.get(0);
				EContainerRepairControl.setContainer((InternalEObject) obj, (InternalEObject) child, esf);

				// instead of returning the queries could also continue to check
				// for error situation
				// nl. that there is not more than one container for an object.
				return true;
			} else if (list.size() > 1) {
				throw new AssertionError("The eobject " + child.getClass().getName() +
						" is contained by multiple other objects through the feature " + esf.getName() + " of " +
						refersTo.getFromClass().getName());
			}
		}

		return false;
	}

	/**
	 * Creates a hashmap which for each class holds the classes which refer to it
	 */
	private HashMap createRefersToMap(MetaDataManager mdm, String[] allClassNames) {
		final JDOClassLoaderResolver clr = new JDOClassLoaderResolver();
		try {
			final Class[] allClasses = new Class[allClassNames.length];

			final HashMap result = new HashMap();
			for (int i = 0; i < allClasses.length; i++) {
				allClasses[i] = ClassLoaderResolver.classForName(allClassNames[i]);
				result.put(allClasses[i], new ArrayList());
			}

			for (Class element : allClasses) {
				final AbstractClassMetaData cmd = mdm.getMetaDataForClass(element, clr);

				// these should be handled together with their parents
				// todo support embedded references
				if (cmd.isEmbeddedOnly()) {
					continue;
				}

				for (int j = 0; j < cmd.getNoOfFields(); j++) {
					final AbstractPropertyMetaData fld = cmd.getField(j);

					createRefersToFromField(fld, element, result, false, fld.getName());
				}
			}

			// at the end for each class all the refersto of superclasses and
			// interfaces are added also
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

	/**
	 * Creates a refers to from a fld metadata, handles collections, feature maps etc.
	 */
	private void createRefersToFromField(AbstractPropertyMetaData fld, Class fromClass, HashMap result,
			boolean isFeatureMapField, String propName) {
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
			if (GenericFeatureMapEntry.class.isAssignableFrom(toClass)) { // a
				// feature
				// map
				// find
				// the
				// real
				// toclasses
				final AbstractPropertyMetaData[] fmds =
						fld.getElementMetaData().getEmbeddedMetaData().getFieldMetaData();
				for (final AbstractPropertyMetaData fmd : fmds) {
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
				if (!fld.isFieldTypePersistenceCapable()) {
					return;
				}
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
				tclass = getInstanceClass(tclass);
				if (tclass == null) { // no impl. class for interface
					log.debug("Ignoring " + toClasses[c].getName() +
							" for computation of referencing classes because it has no concrete implementor");
					continue;
				}
			}

			// ignore these
			if (!PersistenceCapable.class.isAssignableFrom(tclass)) {
				continue;
			}

			final ArrayList list = (ArrayList) result.get(tclass);
			if (list == null) {
				continue; // happens when an element of a list is a simpletype
				// or so
			}

			list.add(new ReferenceTo(fromClass, tclass, propName, featureNames[c], isContained, isMany,
				isFeatureMapField));
		}
	}

	/**
	 * Returns the feature names defined in the extension, if the extension is not found then the
	 * name of the fld is used
	 */
	private String[] getFeatureNames(AbstractPropertyMetaData fld) {
		String[] features = getSplittedExtension(fld, "estructuralfeatures");
		if (features != null) {
			return features;
		}
		return new String[] { fld.getName() };
	}

	/**
	 * Returns a list of implementation-classes based on the implementation-classes extension
	 */
	private Class[] getImplementationClasses(AbstractPropertyMetaData fld) {
		Class[] toClasses = null;
		final String[] classes = getSplittedExtension(fld, "implementation-classes");
		if (classes == null) {
			return null;
		}
		toClasses = new Class[classes.length];
		for (int c = 0; c < classes.length; c++) {
			toClasses[c] = resolveClass(classes[c]);
		}
		return toClasses;
	}

	/**
	 * returns the comma split value of the extension, or null if not found or empty
	 */
	private String[] getSplittedExtension(AbstractPropertyMetaData fld, String extension) {
		if (fld.getExtensions() == null) {
			return null;
		}
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
		if (className.compareTo("boolean") == 0) {
			return boolean.class;
		}
		if (className.compareTo("byte") == 0) {
			return byte.class;
		}
		if (className.compareTo("char") == 0) {
			return char.class;
		}
		if (className.compareTo("short") == 0) {
			return short.class;
		}
		if (className.compareTo("int") == 0) {
			return int.class;
		}
		if (className.compareTo("long") == 0) {
			return long.class;
		}
		if (className.compareTo("float") == 0) {
			return float.class;
		}
		if (className.compareTo("double") == 0) {
			return double.class;
		}
		return ClassLoaderResolver.classForName(className);
	}

	/**
	 * Add the refersto for each superclass/interface to the subclass refersto list. As a
	 * convenience returns the set list
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
		for (Class element : interfs) {
			addUnique(thisList, (ArrayList) refersTo.get(element));
		}
		classDone.add(clazz);
		return thisList;
	}

	/** Adds list 2 to list 1 without duplicates */
	private void addUnique(ArrayList l1, ArrayList l2) {
		if (l2 == null) {
			return; // this is a valid situation so do nothing
		}

		final Iterator it = l2.iterator();
		while (it.hasNext()) {
			final Object obj = it.next();
			if (!l1.contains(obj)) {
				l1.add(obj);
			}
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
			// toClass = theToClass;
			name = propName;
			isContainer = myIsContainer;
			isMany = myIsMany;

			if (isFeatureMapEntryField) {
				qryStr =
						"SELECT FROM " + fromClass.getName() + " WHERE " + name +
								".contains(gfme) && gfme.localReferenceValue==:toObject " + "VARIABLES " +
								GenericFeatureMapEntry.class.getName() + " gfme";
			} else if (isMany) {
				qryStr = "SELECT FROM " + fromClass.getName() + " WHERE " + name + ".contains(:toObject)";
			} else {
				qryStr = "SELECT FROM " + fromClass.getName() + " WHERE " + name + " == :toObject";
			}

			if (isContainer) {
				final EClass eclass = EModelResolver.instance().getEClass(fromClass);
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
			AssertUtil.assertTrue("The getstructural feature may only be called for containment relations. " + name +
					" of " + fromClass.getClass().getName() + " is not a containment relation.", isContainer);
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
			log.debug("Option " + PersistenceOptions.INHERITANCE_MAPPING + " is set to: " +
					props.getProperty(PersistenceOptions.INHERITANCE_MAPPING) + " translating to option " +
					PMFConfiguration.DEFAULT_INHERITANCE_STRATEGY_PROPERTY);

			String inheritanceMapping = props.getProperty(PersistenceOptions.INHERITANCE_MAPPING);
			if (InheritanceType.get(inheritanceMapping) == InheritanceType.JOINED) {
				properties.put(PMFConfiguration.DEFAULT_INHERITANCE_STRATEGY_PROPERTY, "JPOX");
				log.debug("Option inheritance: JPOX");
			} else if (InheritanceType.get(inheritanceMapping) == InheritanceType.SINGLE_TABLE) {
				properties.put(PMFConfiguration.DEFAULT_INHERITANCE_STRATEGY_PROPERTY, "JDO2");
				log.debug("Option inheritance: JDO2");
			} else {
				throw new IllegalArgumentException("Inheritance mapping option: " + inheritanceMapping +
						" is not supported");
			}
		}

		updateSchema =
				props.get(PersistenceOptions.UPDATE_SCHEMA) == null ||
						props.getProperty(PersistenceOptions.UPDATE_SCHEMA).compareTo("true") == 0;

		log.debug("Option updateschema: " + updateSchema);

		havePropertiesBeenSet = true;
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
}