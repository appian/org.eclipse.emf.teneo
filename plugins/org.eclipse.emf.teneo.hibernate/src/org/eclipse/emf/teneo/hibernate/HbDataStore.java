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
 *   Martin Taal
 * </copyright>
 *
 * $Id: HbDataStore.java,v 1.13 2007/02/01 12:06:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.classloader.StoreClassLoadException;
import org.eclipse.emf.teneo.ecore.EClassNameStrategy;
import org.eclipse.emf.teneo.hibernate.hbannotation.util.MappingBuilder;
import org.eclipse.emf.teneo.hibernate.mapper.HbMapperConstants;
import org.eclipse.emf.teneo.hibernate.mapper.HibernateMappingGenerator;
import org.eclipse.emf.teneo.hibernate.mapping.econtainer.EContainerAccessor;
import org.eclipse.emf.teneo.hibernate.mapping.econtainer.EContainerFeatureIDAccessor;
import org.eclipse.emf.teneo.hibernate.mapping.econtainer.EContainerUserType;
import org.eclipse.emf.teneo.hibernate.mapping.elist.HibernateFeatureMapEntry;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResourceFactory;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.EntityMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.HashtableCacheProvider;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.CascadeStyle;
import org.hibernate.mapping.Bag;
import org.hibernate.mapping.Collection;
import org.hibernate.mapping.Column;
import org.hibernate.mapping.Component;
import org.hibernate.mapping.List;
import org.hibernate.mapping.ManyToOne;
import org.hibernate.mapping.OneToMany;
import org.hibernate.mapping.OneToOne;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Property;
import org.hibernate.mapping.SimpleValue;
import org.hibernate.mapping.Table;
import org.hibernate.mapping.Value;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

/**
 * Holds the SessionFactory and performs different initialization related actions. Initializes the database and offers
 * xml import and export methods. In addition can be used to retrieve all referers to a certain eobject.
 * <p>
 * The behavior can be overridden by overriding the protected methods and implementing/registering your own
 * HbDataStoreFactory in the HibernateHelper.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.13 $
 */

public class HbDataStore {

	/** The logger */
	private static Log log = LogFactory.getLog(HbDataStore.class);

	/** Initialize EMF */
	static {
		initializeTypes();
	}

	/** Initializes emf types with jpox */
	private static synchronized void initializeTypes() {
		log.debug("Initializing protocol/extension for hibernate");
		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put("hibernate", new HibernateResourceFactory());
		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put("ehb", new HibernateResourceFactory());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("hibernate", new HibernateResourceFactory());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ehb", new HibernateResourceFactory());
	}

	/** The name under which it is registered */
	private String name;

	/** The list of epackages stored in the datastore */
	private EPackage[] ePackages;

	/** The persistency manager factory */
	private SessionFactory sessionFactory;

	/** The used Hibernate configuration */
	private Configuration hbConfiguration;

	/** HashMap with referers */
	private HashMap referers;

	/**
	 * The used mapping if not passed through a hbm file, can be retrieved for debugging purposes
	 */
	private String mappingXML = null;

	/** The properties used to create the hibernate configuration object */
	private PersistenceOptions persistenceOptions;

	private Properties hibernateProperties;

	/** Is the store initialized */
	private boolean initialized = false;

	/** The array with entities (eclasses) which are not contained */
	private String[] topEntities;

	/** Update the schema option */
	// private boolean updateSchema = true;
	/** The hb context */
	private HbContext hbContext = new HbContextImpl();

	/** Initializes this Data Store */
	public final void initialize() {
		// check a few things
		if (getEPackages() == null)
			throw new HbMapperException("EPackages are not set");
		// if (getName() == null)
		// throw new HbStoreException("Name is not set");

		log.debug(">>>>> Creating HB Configuration");
		hbConfiguration = getHbContext().createConfiguration();

		mapModel();

		setPropertiesInConfiguration();

		setInterceptor();

		log.debug("Determine referers for each class");
		referers = computeReferers();

		topEntities = computeTopEntities();

		// now add the econtainer mappings to the contained types, only for
		// unidirectional container relations
		addContainerMappings();

		// buildmappings has to be done before setting the tuplizers because
		// buildMappings will ensure that the element
		// is set in the List properties.
		hbConfiguration.buildMappings();
		setTuplizer();

		// set the event listeners
		setEventListeners();

		updateDatabaseSchema();

		log.debug("Registering datastore with persistent classes");
		HbHelper.INSTANCE.registerDataStoreByPC(this);

		// wait for the session factory until the database is (re)created
		if (sessionFactory != null && !sessionFactory.isClosed())
			sessionFactory.close();
		sessionFactory = buildSessionFactory();

		initialized = true;
	}

	/**
	 * Gets the initialized state.
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/** Sets the tuplizer */
	protected void setTuplizer() {
		final Configuration cfg = getConfiguration();
		for (Iterator pcs = cfg.getClassMappings(); pcs.hasNext();) {
			final PersistentClass pc = (PersistentClass) pcs.next();
			if (pc.getMetaAttribute(HbMapperConstants.ECLASS_META) != null
					|| pc.getMetaAttribute(HbMapperConstants.FEATUREMAP_META) != null) { // featuremap
				// entry
				pc.addTuplizer(EntityMode.MAP, getHbContext().getFeatureMapEntryTuplizer(cfg).getName());
			} else {
				// final EClass eclass =
				// StoreUtil.getEClassFromURI(pc.getEntityName(),
				// getEPackages());
				// pc.setClassName(eclass.getInstanceClassName());
				pc.addTuplizer(EntityMode.MAP, getHbContext().getEMFTuplizerClass(cfg).getName());
				pc.addTuplizer(EntityMode.POJO, getHbContext().getEMFTuplizerClass(cfg).getName());
			}

			// also set the tuplizer for the components, and register for the
			// component

			// Build a list of all properties.
			java.util.List properties = new ArrayList();
			final Property identifierProperty = pc.getIdentifierProperty();
			if (identifierProperty != null) {
				properties.add(identifierProperty);
			}
			for (Iterator it = pc.getPropertyIterator(); it.hasNext();) {
				properties.add(it.next());
			}

			// Now set component tuplizers where necessary.
			for (Iterator it = properties.iterator(); it.hasNext();) {
				Property prop = (Property) it.next();
				if (prop.getName().compareTo("_identifierMapper") == 0) {
					continue; // ignore this one
				}
				final Value value = prop.getValue();
				if (value instanceof Component) {
					setComponentTuplizer((Component) value, cfg);
				} else if (value instanceof Collection && ((Collection) value).getElement() instanceof Component) {
					setComponentTuplizer((Component) ((Collection) value).getElement(), cfg);
				}
			}
		}
	}

	/** Set the event listener, can be overridden, in this impl. it does nothing */
	protected void setEventListeners() {

	}

	/**
	 * Sets the emf component tuplizer (if it is an eclass) or the hibernate component tuplizer
	 */
	private void setComponentTuplizer(Component component, Configuration cfg) {
		// check if the eclass exists
		try {
			EClass eClass = getPersistenceOptions().getEClassNameStrategy().toEClass(component.getComponentClassName(),
					getEPackages());
			if (eClass != null) {
				log.debug("Found " + eClass.getName() + " as a component");
			}
		} catch (IllegalArgumentException e) {
			return; // not a valud eclass;
		}
		// is a
		// valid
		// eclass
		component.addTuplizer(EntityMode.MAP, getHbContext().getEMFComponentTuplizerClass(cfg).getName());
		HbHelper.INSTANCE.registerDataStoreByComponent(this, component);
	}

	/** Compute the top eclasses */
	protected String[] computeTopEntities() {
		ArrayList result = new ArrayList();
		for (Iterator pcs = getConfiguration().getClassMappings(); pcs.hasNext();) {
			final PersistentClass pc = (PersistentClass) pcs.next();

			ArrayList refs = (ArrayList) referers.get(pc.getEntityName());
			boolean topEntity = true;
			if (refs != null) {
				for (Iterator it = refs.iterator(); it.hasNext();) {
					ReferenceTo rt = (ReferenceTo) it.next();
					if (rt.isContainer) {
						topEntity = false;
						break;
					}
				}
			}
			if (topEntity)
				result.add(pc.getEntityName());
		}
		return (String[]) result.toArray(new String[result.size()]);
	}

	/** Adds a econtainer mapping to the class mapping */
	protected void addContainerMappings() {
		if (getPersistenceOptions().isDisableEContainerMapping()) {
			log.debug("EContainer mapping disabled.");
			return;
		}
		for (Iterator pcs = getConfiguration().getClassMappings(); pcs.hasNext();) {
			final PersistentClass pc = (PersistentClass) pcs.next();

			// if a featuremap then just return
			if (HbUtil.getEClassNameFromFeatureMapMeta(pc) != null)
				continue;

			// check if container is required is done in the
			// addContainerMapping call
			addContainerMapping(pc);
		}
	}

	/** Returns true if the pc is contained */
	private boolean isContained(PersistentClass pc) {
		ArrayList refs = (ArrayList) referers.get(pc.getEntityName());
		if (refs == null)
			return false;
		for (Iterator it = refs.iterator(); it.hasNext();) {
			ReferenceTo rt = (ReferenceTo) it.next();
			if (rt.isContainer) {
				return true;
			}
		}
		return false;
	}

	/** Sets the properties in the Hibernate Configuration. */
	protected void setPropertiesInConfiguration() {
		Properties properties = getHibernateProperties();
		if (properties != null) {
			if (properties.getProperty("hibernate.cache.provider_class") == null) {
				log.warn("No hibernate cache provider set, using " + HashtableCacheProvider.class.getName());
				log.warn("For production use please set the ehcache (or other) provider explicitly and configure it");
				properties.setProperty("hibernate.cache.provider_class", HashtableCacheProvider.class.getName());
			}
			log.debug("Setting properties in Hibernate Configuration:");
			logProperties(properties);
			getConfiguration().setProperties(properties);
		}
	}

	/** Sets the interceptor */
	protected void setInterceptor() {
		hbConfiguration.setInterceptor(getHbContext().createInterceptor(getConfiguration(), getPersistenceOptions()));
	}

	/**
	 * Maps an ecore model of one ore more epackages into a hibernate xml String which is added to the passed
	 * configuration
	 */
	protected void mapModel() {
		if (getPersistenceOptions().isUseMappingFile()) {

			// register otherwise the getFileList will not work
			ERuntime.INSTANCE.register(getEPackages());

			log.debug("Searching hbm files in class paths of epackages");
			final String[] fileList = StoreUtil.getFileList(HbConstants.HBM_FILE_NAME, null);
			for (int i = 0; i < fileList.length; i++) {
				log.debug("Adding file " + fileList[i] + " to Hibernate Configuration");
				getConfiguration().addInputStream(this.getClass().getResourceAsStream(fileList[i]));
			}
		} else {
			mappingXML = mapEPackages();
			getConfiguration().addXML(mappingXML);
		}
	}

	/** Generate a hibernate mapping xml string from a set of epackages */
	protected String mapEPackages() {
		log.debug("Generating mapping file from in-mem ecore");
		// DCB: Use Hibernate-specific annotation processing mechanism. This allows use of
		// Hibernate-specific annotations.
		final PersistenceOptions po = getPersistenceOptions();
		PAnnotatedModel paModel = MappingBuilder.INSTANCE.buildMapping(getEPackages(), po);
		HibernateMappingGenerator hmg = new HibernateMappingGenerator(po);
		return hmg.generateToString(paModel);
	}

	/**
	 * Adds a econtainer mapping to the class mapping, is only called for eclasses which do not have am explicit feature
	 * which points to the container
	 */
	protected void addContainerMapping(PersistentClass pc) {

		// always first check if the super class should have a container mapping
		if (pc.getSuperclass() != null) {
			addContainerMapping(pc.getSuperclass());
		}

		if (!isContained(pc))
			return;
		if (hasEContainerProp(pc))
			return;

		log.debug("Adding container mapping for " + pc.getEntityName());
		// check if there are not alreadyecontai ner features for the eclass

		final EClass eclass = getPersistenceOptions().getEClassNameStrategy().toEClass(pc.getEntityName(),
				getEPackages());

		// DCB: Provide a way to avoid container mappings for a particular class. You'd do this if, for example,
		// you never load the contained objects except through the containers... or, you don't fit the use case
		// for which this was put together (i.e., the generated model editing code tries to eagerly resolve the
		// container)
		if (eclass == null || eclass.getEAnnotation("http://facet.elver.org/SkipContainerMappings") != null) {
			return; // featuremap
		}

		for (Iterator it = eclass.getEAllReferences().iterator(); it.hasNext();) {
			EReference eref = (EReference) it.next();
			if (eref.isContainer()) {
				log
						.debug("There are container ereferences present, assuming that no separate econtainer columns are required.");
				return;
			}
		}

		log.debug("Adding eContainer and econtainerfeatureid properties to " + pc.getClassName());

		final Property eContainer = new Property();
		eContainer.setName(HbConstants.PROPERTY_ECONTAINER);
		eContainer.setMetaAttributes(new HashMap());
		eContainer.setNodeName(eContainer.getName());
		eContainer.setPropertyAccessorName(EContainerAccessor.class.getName());

		final SimpleValue sv = new SimpleValue(pc.getTable());
		sv.setTypeName(EContainerUserType.class.getName());

		final Column eccColumn = new Column(HbConstants.COLUMN_ECONTAINER_CLASS);
		sv.addColumn(checkColumnExists(pc.getTable(), eccColumn));

		final Column ecColumn = new Column(HbConstants.COLUMN_ECONTAINER);
		sv.addColumn(checkColumnExists(pc.getTable(), ecColumn));

		eContainer.setValue(sv);
		pc.addProperty(eContainer);

		final Property ecFID = new Property();
		ecFID.setName(HbConstants.PROPERTY_ECONTAINER_FEATURE_ID);
		ecFID.setMetaAttributes(new HashMap());
		ecFID.setNodeName(ecFID.getName());
		ecFID.setPropertyAccessorName(EContainerFeatureIDAccessor.class.getName());
		final SimpleValue svfid = new SimpleValue(pc.getTable());
		svfid.setTypeName("integer");

		final Column ecfColumn = new Column(HbConstants.COLUMN_ECONTAINER_FEATUREID);
		svfid.addColumn(checkColumnExists(pc.getTable(), ecfColumn));

		ecFID.setValue(svfid);
		pc.addProperty(ecFID);
	}

	/** Recursively check the container prop in the super hierarchy */
	private boolean hasEContainerProp(PersistentClass pc) {
		final Iterator it = pc.getPropertyIterator();
		while (it.hasNext()) {
			final Property prop = (Property) it.next();
			if (prop.getName().equals(HbConstants.PROPERTY_ECONTAINER)) {
				return true;
			}
		}
		if (pc.getSuperclass() == null)
			return false;
		return hasEContainerProp(pc.getSuperclass());
	}

	/** Updates the database schema */
	protected void updateDatabaseSchema() {
		if (!getPersistenceOptions().isUpdateSchema()) {
			log.debug("Database schema not updated, option " + PersistenceOptions.UPDATE_SCHEMA
					+ " has been set to false");
			return;
		}
		log.debug("Starting update of schema");
		new SchemaUpdate(getConfiguration()).execute(false, true);
		log.debug(">>> Update of schema finished");
	}

	/** Build the session factory */
	protected SessionFactory buildSessionFactory() {
		return getConfiguration().buildSessionFactory();
	}

	/** Checks if a certain column already exists in a class */
	private Column checkColumnExists(Table table, Column searchCol) {
		final Column foundCol = table.getColumn(searchCol);
		if (foundCol != null) {
			return foundCol;
		}
		table.addColumn(searchCol);
		return searchCol;
	}

	/** Dump properties in the log */
	private void logProperties(Properties props) {
		final Iterator it = props.keySet().iterator();
		while (it.hasNext()) {
			final String key = (String) it.next();
			log.info(key + ": " + props.get(key));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.jpox.emf.IEMFDataStore#close()
	 */
	public void close() {
		if (!getSessionFactory().isClosed()) {
			getSessionFactory().close();
		}
	}

	/**
	 * Checks if the passed object is by any change a contained object and if so returns true
	 */
	public boolean isContainedObject(Object obj) {
		// TODO also check containment for superclasses
		final ArrayList theReferers = (ArrayList) referers.get(obj.getClass());
		if (theReferers == null || theReferers.size() == 0)
			return false;
		for (int i = 0; i < theReferers.size(); i++) {
			final ReferenceTo refTo = (ReferenceTo) theReferers.get(i);
			if (refTo.isContainer())
				return true;
		}
		return false;
	}

	/**
	 * Import the complete content from an inputstream into the EMF Data Store. The ExportTarget is the constant defined
	 * in the EMFDataStore interface.
	 */
	public void importDataStore(InputStream is, int importFormat) {
		final Resource importResource;
		if (importFormat == HbConstants.EXCHANGE_FORMAT_XML) {
			importResource = new XMLResourceImpl();
		} else {
			importResource = new XMIResourceImpl();
		}

		final HibernateResource hibResource = new HibernateResource(URI.createFileURI("." + name));

		try {
			importResource.load(is, Collections.EMPTY_MAP);
			hibResource.getContents().addAll(importResource.getContents());
			hibResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new HbMapperException("Exception when importing " + name, e);
		}
	}

	/**
	 * Export the complete content of the EMF Data Store to an outputstream, the exportFormat is a
	 * HbConstants.EXCHANGE_FORMAT_XML or HbConstants.EXCHANGE_FORMAT_XMI, the encoding can be null and is used to set
	 * XMLResource.OPTION_ENCODING.
	 */
	public void exportDataStore(OutputStream os, int exportFormat, String encoding) {
		final HibernateResource hibResource = new HibernateResource(URI.createFileURI("." + name));
		hibResource.load(Collections.EMPTY_MAP);

		try {
			final Resource exportResource;
			if (exportFormat == HbConstants.EXCHANGE_FORMAT_XML) {
				exportResource = new XMLResourceImpl();
			} else {
				exportResource = new XMIResourceImpl();
			}

			exportResource.getContents().addAll(hibResource.getContents());

			final HashMap options = new HashMap();
			if (encoding != null) {
				options.put(XMLResource.OPTION_ENCODING, encoding);
			}

			exportResource.save(os, options);

			hibResource.unload();
		} catch (IOException e) {
			throw new HbMapperException("Exception when exporting " + name, e);
		}
	}

	/**
	 * Returns an array of EObjects and FeatureMapEntries which refer to a certain EObject, note if the array is of
	 * length zero then no refering EObjects where found. The passed Session is used to create a query. The transaction
	 * handling should be done by the caller.
	 */
	public Object[] getCrossReferencers(Session session, Object referedTo) {
		final ArrayList result = getCrossReferencers(session, referedTo, false);
		return (Object[]) result.toArray(new Object[result.size()]);
	}

	/**
	 * Returns an array of EObjects which refer to a certain EObject, note if the array is of length zero then no
	 * refering EObjects where found. The passed Session is used to create a query. The transaction handling should be
	 * done by the caller. onlyContainers means to only check containment relations.
	 */
	private ArrayList getCrossReferencers(Session session, Object referedTo, boolean onlyContainers) {
		assert (referedTo != null);

		String targetEntityName = null;
		if (referedTo instanceof EObject) {
			final EObject eReferedTo = (EObject) referedTo;
			targetEntityName = getPersistenceOptions().getEClassNameStrategy().toUniqueName(eReferedTo.eClass());
		} else if (referedTo instanceof HibernateFeatureMapEntry) {
			final HibernateFeatureMapEntry fme = (HibernateFeatureMapEntry) referedTo;
			targetEntityName = fme.getEntityName();
		} else {
			throw new IllegalArgumentException("Non eobject not yet supported " + referedTo.getClass().getName());
		}

		final ArrayList refersList = (ArrayList) referers.get(targetEntityName);
		if (refersList == null || refersList.size() == 0)
			return new ArrayList();
		final ArrayList result = new ArrayList();
		for (int i = 0; i < refersList.size(); i++) {
			final ReferenceTo refersTo = (ReferenceTo) refersList.get(i);

			// if we only check containment relations then skip this
			if (onlyContainers && !refersTo.isContainer())
				continue;

			final Query qry = session.createQuery(refersTo.getQueryStr());
			qry.setEntity("to", referedTo);
			final java.util.List list = qry.list();
			for (int j = 0; j < list.size(); j++) {
				Object obj = list.get(j);
				if (obj instanceof HibernateFeatureMapEntry) {
					// search then again with the
					final ArrayList fms = getCrossReferencers(session, obj, false);
					if (fms.size() == 0) {
						new AssertionError("The featuremap for featuremap entry " + obj.getClass().getName()
								+ " can not be found");
					}
					obj = fms.get(0);
				}

				// AssertUtil.assertTrue("Getting refersto of " +
				// referedTo.getClass().getName() +
				// ", however one of the refersto is not an eobject but a " +
				// obj.getClass().getName(),
				// obj instanceof EObject);

				if (!result.contains(obj))
					result.add(obj);
			}
		}

		return result;
	}

	/**
	 * Computes the referers, handles the lazy for containment
	 */
	private HashMap computeReferers() {
		final HashMap result = new HashMap();
		Iterator it = hbConfiguration.getClassMappings();

		it = hbConfiguration.getClassMappings();
		ArrayList fmes = new ArrayList();
		while (it.hasNext()) {
			final PersistentClass pc = (PersistentClass) it.next();

			// keep track which are the feature map entries
			if (pc.getMetaAttribute(HbMapperConstants.ECLASS_META) != null
					|| pc.getMetaAttribute(HbMapperConstants.FEATUREMAP_META) != null)
				fmes.add(pc.getEntityName());

			// everyone should have a list otherwise the copying of referers to
			// super types to
			// this type does not work
			if (result.get(pc.getEntityName()) == null) {
				result.put(pc.getEntityName(), new ArrayList());
			}

			final Iterator propIt = pc.getPropertyIterator();
			while (propIt.hasNext()) {
				// handle few cases
				// OneToOne or ManyToOne, referenced class can be obtained from
				// Value and then getReferencedEntityName
				// List: in this case search for a structural feature and get
				// the EType from it
				// if no structural feature then use the type name and hope for
				// the best.

				final Property prop = (Property) propIt.next();
				EClass eClass;
				try{
					eClass = getPersistenceOptions().getEClassNameStrategy().toEClass(pc.getEntityName(), getEPackages());
				} catch (IllegalArgumentException e) {
					// ignoring exception on purpose
					eClass = null;
				}
						
				final EStructuralFeature ef = eClass == null ? null : StoreUtil.getEStructuralFeature(eClass, prop.getName());
				try {
					String toEntity = "";
					boolean isContainer = false;
					boolean isMany = false;
					if (prop.getValue() instanceof ManyToOne) {
						final ManyToOne mto = (ManyToOne) prop.getValue();
						toEntity = mto.getReferencedEntityName();
						if (ef != null) {
							isContainer = ef instanceof EReference && ((EReference) ef).isContainment();
						} else {
							isContainer = prop.getCascadeStyle().hasOrphanDelete()
									|| prop.getCascade().compareTo("all") == 0; // ugly
							// but
						}
						// this was
						// the only
						// way to
						// get all
						// there!
					} else if (prop.getValue() instanceof OneToOne) {
						final OneToOne oto = (OneToOne) prop.getValue();
						toEntity = oto.getReferencedEntityName();
						if (ef != null) {
							isContainer = ef instanceof EReference && ((EReference) ef).isContainment();
						} else {
							isContainer = prop.getCascadeStyle().hasOrphanDelete()
									|| prop.getCascadeStyle() == CascadeStyle.ALL;
						}
					} else if (prop.getValue() instanceof List || prop.getValue() instanceof Bag) {
						isMany = true;
						if (ef == null) { // TODO can this happen?
							isContainer = prop.getCascadeStyle().hasOrphanDelete()
									|| prop.getCascadeStyle() == CascadeStyle.ALL;
							if (((Collection) prop.getValue()).getElement() instanceof OneToMany) {
								final Collection coll = (Collection) prop.getValue();
								toEntity = ((OneToMany) coll.getElement()).getReferencedEntityName();
							} else if (((Collection) prop.getValue()).getElement() instanceof ManyToOne) {
								final Collection coll = (Collection) prop.getValue();
								toEntity = ((ManyToOne) coll.getElement()).getReferencedEntityName();
							} else {
								throw new HbMapperException("Type "
										+ ((Collection) prop.getValue()).getElement().getClass().getName()
										+ " not supported");
							}
						} else {
							// in case of featuremap set containment always on
							// true because only the featuremap entries
							// themselves know if they are containment
							if (ef instanceof EAttribute
									&& ((EAttribute) ef).getEType().getInstanceClass() == Entry.class) {
								isContainer = true;
								final OneToMany otm = (OneToMany) ((Collection) prop.getValue()).getElement();
								toEntity = otm.getReferencedEntityName();
							} else if (ef instanceof EReference) {
								final EReference er = (EReference) ef;
								isContainer = er.isContainment(); // prop.getCascadeStyle().hasOrphanDelete()
								// ||
								// prop.getCascadeStyle()
								// ==
								// CascadeStyle.ALL;
								toEntity = getPersistenceOptions().getEClassNameStrategy().toUniqueName(
										((EReference) ef).getEReferenceType());
							} else if (ef instanceof EAttribute && ef.getEType() instanceof EClass) { // TODO
								// can
								// this
								// ever
								// happen?
								isContainer = true; // prop.getCascadeStyle().hasOrphanDelete()
								// || prop.getCascadeStyle()
								// == CascadeStyle.ALL;
								toEntity = getPersistenceOptions().getEClassNameStrategy().toUniqueName((EClass) ef.getEType());
							}
							// filter out non eobjects
							else {
								continue;
							}
						}
					} else {
						continue;
					}

					ArrayList list = (ArrayList) result.get(toEntity);
					if (list == null) {
						list = new ArrayList();
						result.put(toEntity, list);
					}

					list.add(new ReferenceTo(pc.getEntityName(), prop, isContainer, isMany));
				} catch (StoreClassLoadException e) {
					throw new HbMapperException("Class not found using property: " + prop.getName() + " of " + prop, e);
				}
			}
		}

		// at the end for each class all the refersto of superclasses and
		// interfaces are added also
		final Iterator keyIt = result.keySet().iterator();
		final ArrayList classDone = new ArrayList();
		while (keyIt.hasNext()) {
			final String em = (String) keyIt.next();
			// only do this if not a fme
			if (!fmes.contains(em))
				setRefersToOfSupers(em, result, classDone);
		}

		return result;
	}

	/**
	 * Add the refersto for each superclass/interface to the subclass refersto list. As a convenience returns the set
	 * list
	 */
	private ArrayList setRefersToOfSupers(String eClassUri, HashMap refersTo, ArrayList classDone) {
		final EClassNameStrategy ens = getPersistenceOptions().getEClassNameStrategy();
		EClass eclass = ens.toEClass(eClassUri, getEPackages());
		if (eclass == null)
			return new ArrayList();

		if (classDone.contains(eclass)) {
			return (ArrayList) refersTo.get(eclass);
		}

		final ArrayList thisList = (ArrayList) refersTo.get(ens.toUniqueName(eclass));
		if (thisList == null) {
			return new ArrayList();
		}
		for (Iterator it = eclass.getESuperTypes().iterator(); it.hasNext();) {
			String eclassUri = ens.toUniqueName((EClass) it.next());
			addUnique(thisList, setRefersToOfSupers(eclassUri, refersTo, classDone));
		}
		classDone.add(eclass);
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

	/**
	 * @return the mappingXML
	 */
	public String getMappingXML() {
		return mappingXML;
	}

	/**
	 * @return the dsName
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the epackages
	 */
	public EPackage[] getEPackages() {
		return ePackages;
	}

	/**
	 * @param epackages
	 *            the epackages to set
	 */
	public void setEPackages(EPackage[] epackages) {
		this.ePackages = epackages;
	}

	/**
	 * Gets the persistence options. The persistence options is a type representation of the persistence options. If not
	 * set through the setPersistenceProperties method then a properties file is searched If found it is used to set the
	 * persistence options.
	 * 
	 * <p>
	 * If no properties have been set explicitly, the method will attempt to load them from the file
	 * "/elver-persistence.properties" at the root of the classpath. (A mechanism similar to "hibernate.properties".)
	 * 
	 * @throws HbMapperException
	 *             if an error occured reading the properties file.
	 * @return the persistence options as a Properties instance.
	 * 
	 */
	public PersistenceOptions getPersistenceOptions() {
		if (persistenceOptions == null) {
			final Properties props = new Properties();
			final InputStream in = this.getClass().getResourceAsStream(PersistenceOptions.DEFAULT_CLASSPATH_FILENAME);
			if (in != null) {
				try {
					props.load(in);
				} catch (IOException e) {
					throw new HbMapperException(e);
				} finally {
					try {
						in.close();
					} catch (IOException e) {
						throw new HbMapperException(e);
					}
				}
			}
			persistenceOptions = new PersistenceOptions(props);
		}
		return persistenceOptions;
	}

	/**
	 * Sets the persistence options.
	 */
	public void setPersistenceProperties(Properties persistenceOptions) {
		this.persistenceOptions = new PersistenceOptions(persistenceOptions);
	}

	public Properties getHibernateProperties() {
		return hibernateProperties;
	}

	public void setHibernateProperties(Properties hibernateProperties) {
		this.hibernateProperties = hibernateProperties;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** Get the session factory */
	public SessionFactory getSessionFactory() {
		if (!isInitialized()) {
			initialize();
		}
		assert (sessionFactory != null);
		return sessionFactory;
	}

	/**
	 * @return the hbConfiguration
	 */
	public Configuration getConfiguration() {
		return hbConfiguration;
	}

	/**
	 * The entities (eclasses) which are not contained in another eclass.
	 * 
	 * @return the topEntities
	 */
	public String[] getTopEntities() {
		return topEntities;
	}

	/** Contains the reference to a class which refers to another reference */
	public class ReferenceTo {

		/** Is contained */
		private final boolean isContainer;

		/** The query used to find the occurence */
		private final String qryStr;

		/** Constructor */
		public ReferenceTo(String fromEntity, Property prop, boolean isContainer, boolean isMany) {
			this.isContainer = isContainer;
			if (isMany) {
				qryStr = "SELECT ref FROM " + fromEntity + " as ref WHERE :to in elements(ref." + prop.getName() + ")";
			} else {
				qryStr = "SELECT ref FROM " + fromEntity + " as ref WHERE :to = ref." + prop.getName();
			}
		}

		/**
		 * @return Returns the isContainer.
		 */
		public boolean isContainer() {
			return isContainer;
		}

		/** Returns the query string used used */
		public String getQueryStr() {
			return qryStr;
		}
	}

	/**
	 * @return the hbContext
	 */
	public HbContext getHbContext() {
		return hbContext;
	}

	/**
	 * @param hbContext
	 *            the hbContext to set
	 */
	public void setHbContext(HbContext hbContext) {
		this.hbContext = hbContext;
	}
}