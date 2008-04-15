/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.ContentTreeIterator;
import org.eclipse.emf.teneo.eclipselink.IndirectEContainer;
import org.eclipse.persistence.jpa.osgi.PersistenceProvider;

/**
 * This class implements the {@link EclipseLinkResource} interface and
 * represents a EclipseLink resource.
 * <p>
 * EclipseLink resources provide a link between modeling using EMF and persistence
 * using relational databases. They are implementations of EMF's intrinsic
 * persistence API and can be used to load, work on, and save EMF models in a
 * relational database according to a given EclipseLink O/R mapping definition and a
 * EclipseLink session configuration. As such, EclipseLink resources offer the following
 * benefits:
 * </p>
 * <ul>
 * <li>Database persistence for EMF models through same API as XML/XMI file
 * persistence</li>
 * <li>Fully tree-oriented handling of models during load and save</li>
 * <li>Automatic registration/deletion of objects being added/removed in EMF
 * model in underlying EclipseLink unit of work</li>
 * <li>Support of cross-resource references and lazy loading across EclipseLink and
 * XML/XMI resources</li>
 * </ul>
 * <p>
 * However, several features of regular EMF resources do not apply here, notably
 * the input and output streams handed along during loading and saving, and the
 * support for zip files. The usage of tracking modification is discouraged even
 * for XML/XMI resources and therefore has been disabled completely.
 * </p>
 * <p>
 * A EclipseLink resource typically contains a certain subset of objects stored in
 * the underlying database. It is identified by the URI passed to or created by
 * its constructor. This URI must or will be a EclipseLink URI and indicates an
 * optional database login, a database session declared in the EclipseLink sessions
 * configuration (sessions.xml), and a query returning the objects which
 * constitute the contents of the EclipseLink resource.
 * </p>
 * <p>
 * Technically, a EclipseLink resource encapsulates a EclipseLink database session and
 * unit of work. Both are created lazily either when the EclipseLink resource is
 * loaded or when it is filled with contents. Their destruction or release
 * respectively takes place during unlaod. The same database session may be
 * shared among multiple EclipseLink resources but each EclipseLink resource will have
 * an individual unit of work. In order to guarantee a consistent lifecycle
 * management of database session(s) and unit(s) of work, applications have to
 * make sure that EclipseLink resources are always explicitly unloaded when they are
 * no longer needed.
 * </p>
 * <p>
 * EclipseLink supports the customization of database sessions for all kinds of
 * purposes. In the context of EMF, this is typically required for O/R mapping
 * of EMF enumerators which are not covered by EclipseLink's built-in set of
 * enumeration types. However, as the database session is encapsulated inside
 * the EclipseLink resource it should not and typically never will be accessed
 * directly through the application. Therefore, applications have to provide a
 * session pre-login listener and register it with EclipseLink through the EclipseLink
 * sessions configuration. This pre-login listener is invoked by EclipseLink when a
 * EclipseLink resource is loaded or created and filled with contents and gives an
 * oppertunity to do session customizations according to application-specific
 * requirements.
 * </p>
 */
public class EclipseLinkResourceImpl extends ResourceImpl implements EclipseLinkResource {

  protected class EntityManagerFactoryInstance {

    private EntityManagerFactory entityManagerFactory;
    private int resourceInstanceCount;

    public EntityManagerFactoryInstance(EntityManagerFactory entityManagerFactory) {

      this.entityManagerFactory = entityManagerFactory;
      resourceInstanceCount = 0;
    }

    public EntityManagerFactory getEntityManagerFactory() {

      return entityManagerFactory;
    }

    public int getResourceInstanceCount() {

      return resourceInstanceCount;
    }

    public void setResourceInstanceCount(int resourceInstanceCount) {

      this.resourceInstanceCount = resourceInstanceCount;
    }
  }

  private static Map<String, EntityManagerFactoryInstance> persistenceUnitNameToEntityManagerFactoryInstanceMap = new HashMap<String, EntityManagerFactoryInstance>();

  private String persistenceUnitName;
  private String contentsQuery;
  private EntityManager entityManager;
  private boolean readingContentsFromDatabase;
  private List<EObject> eObjectsToBeRemovedFromDatabase = new ArrayList<EObject>();

  /**
   * Creates an instance with the given
   * {@link org.eclipse.emf.common.util.URI URI}.
   * <p>
   * The {@link org.eclipse.emf.common.util.URI URI} must be a EclipseLink
   * {@link org.eclipse.emf.common.util.URI URI}. EclipseLink
   * {@link org.eclipse.emf.common.util.URI URI}s must have the following
   * format:
   * </p>
   * <ul>
   * <code>eclipselink://loginAlias/sessionName?contentsQueryAlias</code>
   * </ul>
   * <p>
   * and comprise the following components:
   * </p>
   * <ul>
   * <li>A protocol which is always <code><b>eclipselink:</b></code></li>
   * <li>An optional authority which is an <b>alias for</b> a <b>database
   * login</b> to be used. It refers to a
   * {@link org.eclipse.persistence.sessions.DatabaseLogin DatabaseLogin} instance which
   * has been made available through the
   * {@link EclipseLinkSettingsRegistry}. When omitted, the database
   * login specified within the EclipseLink session configuration will be taken as a
   * default.</li>
   * <li>A segment representing the <b>name of</b> the applicable <b>database
   * session</b> declared in the EclipseLink sessions configuration. The sessions
   * configuration is expected to be provided in a file on the application's
   * classpath, and therefore doesn't need to be specified explicitly. The name
   * of this file has either to be left at its default
   * <code>sesssions.xml</code> or must be specified using
   * {@link org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkResource.OPTION_SESSIONS_CONFIGURATION_FILE_NAME OPTION_SESSIONS_CONFIGURATION_FILE_NAME}.</li>
   * <li>A query string which is an <b>alias for</b> a <b>contents query</b>.
   * It refers to a
   * {@link org.eclipse.persistence.queries.ReadAllQuery ReadAllQuery} instance
   * which has been made available through the
   * {@link EclipseLinkSettingsRegistry}. If the alias is a qualified
   * Java class name and no matching contents query can be found, a new
   * {@link org.eclipse.persistence.queries.ReadAllQuery contents query} for
   * reading all instances of the given class will be created on the fly and
   * added to the {@link EclipseLinkSettingsRegistry}.
   * </ul>
   * 
   * @param uri
   *          the EclipseLink {@link org.eclipse.emf.common.util.URI URI}
   *          identifying the set of database objects to be contained in this
   *          resource. Must not be null.
   * @return the newly created {@link EclipseLinkResourceImpl} instance.
   */
  public EclipseLinkResourceImpl(URI uri) {

    super(uri);

    if (!EclipseLinkResourceUtil.isEclipseLinkURI(uri)) {
      String msg = "Argument for parameter 'uri' must contain a 'eclipselink:' scheme.";
      throw new WrappedException(new IllegalArgumentException(msg));
    }
    if (uri.segmentCount() != 1) {
      String msg = "Argument for parameter 'uri' must contain one segment representing the name of a database session.";
      throw new WrappedException(new IllegalArgumentException(msg));
    }
    if (!uri.hasQuery()) {
      String msg = "Argument for parameter 'uri' must contain a query string representing an alias of a query for the contents of this resource.";
      throw new WrappedException(new IllegalArgumentException(msg));
    }

    persistenceUnitName = uri.segments()[0];
    contentsQuery = uri.query();

    initDefaultOptions();
  }

  /**
   * Creates an instance with the given EclipseLink settings.
   * 
   * @param loginAlias
   *          the alias for a database login to be used. It refers to a
   *          {@link org.eclipse.persistence.sessions.DatabaseLogin DatabaseLogin}
   *          instance which has been made available through the
   *          {@link EclipseLinkSettingsRegistry}. If set to null, the
   *          database login specified within the EclipseLink session configuration
   *          will be taken as a default.
   * @param persistenceUnitName
   *          the name of applicable database session declared in the EclipseLink
   *          sessions configuration. Must not be null nor empty. The sessions
   *          configuration is expected to be provided in a file on the
   *          application's classpath, and therefore doesn't need to be
   *          specified explicitly. The name of this file has either to be left
   *          at its default <code>sesssions.xml</code> or must be specified
   *          using
   *          {@link org.eclipse.emf.teneo.eclipselink.resource.EclipseLinkResource.OPTION_SESSIONS_CONFIGURATION_FILE_NAME OPTION_SESSIONS_CONFIGURATION_FILE_NAME}.
   * @param contentsQueryAlias
   *          the alias for a contents query. Must not be null nor empty. It
   *          refers to a
   *          {@link org.eclipse.persistence.queries.ReadAllQuery ReadAllQuery}
   *          instance which has been made available through the
   *          {@link EclipseLinkSettingsRegistry}. If the alias is a
   *          qualified Java class name and no matching contents query can be
   *          found, a new
   *          {@link org.eclipse.persistence.queries.ReadAllQuery contents query}
   *          for reading all instances of the given class will be created on
   *          the fly and added to the {@link EclipseLinkSettingsRegistry}.
   * @return the newly created {@link EclipseLinkResourceImpl} instance.
   */
  public EclipseLinkResourceImpl(String persistenceUnitName, String contentsQueryAlias) {

    uri = EclipseLinkResourceUtil.createEclipseLinkURI(persistenceUnitName, contentsQueryAlias);

    this.persistenceUnitName = persistenceUnitName;
    contentsQuery = contentsQueryAlias;

    initDefaultOptions();
  }

  public Map<Object, Object> getDefaultSaveOptions() {

    return defaultSaveOptions;
  }

  public Map<Object, Object> getDefaultLoadOptions() {

    return defaultLoadOptions;
  }

  @Override
  public void setURI(URI uri) {

    // cannot change the URI of a EclipseLinkResource on the fly
  }

  /**
   * A notifying list implementation for supporting {@link Resource#getContents}
   * on databases.
   */
  protected class DatabaseContentsEList<E extends Object & EObject> extends ContentsEList<E> {

    private static final long serialVersionUID = 1L;

    //
    // overrides
    //

    @Override
    protected void loaded() {

      if (!isLoaded()) {
        Map<?, ?> options = defaultLoadOptions;
        ResourceSet resourceSet = getResourceSet();
        if (resourceSet != null) {
          options = mergeMaps(resourceSet.getLoadOptions(), options);
        }
        openDatabase(options);
      }
      super.loaded();
    }
  }

  @Override
  public EList<EObject> getContents() {

    if (contents == null) {
      contents = new DatabaseContentsEList<EObject>();
    }
    return contents;
  }

  /**
   * Returns the URI {@link org.eclipse.emf.common.util.URI#fragment fragment}
   * that, when passed to
   * {@link org.eclipse.emf.ecore.resource.Resource#getEObject getEObject} will
   * return the given object.
   * <p>
   * This method is involved in saving resources with cross-resource references
   * and setting objects to be proxies after unloading resources of any kind.
   * Both Ecore ID attribute based and structured URI
   * {@link org.eclipse.emf.common.util.URI#fragment fragment}s as per
   * {@link org.eclipse.emf.ecore.InternalEObject#eURIFragmentSegment InternalEObject.eURIFragmentSegment}
   * are supported. When an ID attribute has been defined on the
   * {@link org.eclipse.emf.ecore.EObject#eClass eClass} of the given object,
   * the URI {@link org.eclipse.emf.common.util.URI#fragment fragment} will not
   * only consist of the ID itself but also contain the qualified owner class
   * name as well as the name of the ID attribute. The resulting format is as
   * follows:
   * </p>
   * <ul>
   * <code>ownerTypeName|idAttributeName='id'</code>
   * </ul>.
   * 
   * @param eObject
   *          the object to identify.
   * @return the URI {@link org.eclipse.emf.common.util.URI#fragment fragment}
   *         for this object.
   */
  @Override
  public String getURIFragment(EObject eObject) {

    String result;
    String id = EcoreUtil.getID(eObject);
    if (id != null) {
      // create decorated ID
      EAttribute eIDAttribute = eObject.eClass().getEIDAttribute();
      result = eObject.eClass().getName() + "|" + eIDAttribute.getName() + "='" + id + "'";
    }
    else {
      result = super.getURIFragment(eObject);
    }
    return result;
  }

  /**
   * Returns the object identified by the given ID.
   * <p>
   * This method is involved in loading resources with cross-resource
   * references. It is called when an Ecore ID attribute based URI
   * {@link org.eclipse.emf.common.util.URI#fragment fragment} needs to be
   * resolved. In the original implementation, this is done by iterating deeply
   * over the resource's contents until the object with the given ID is found.
   * While this approach is fine in XML/XMI files with little to medium numbers
   * of objects, it would be a bad idea to do so when dealing with databases
   * where typically large or very large numbers of objects are stored.
   * Therefore, EclipseLink resources rely on dynamically created
   * {@link org.eclipse.persistence.queries.ReadObjectQuery ReadObjectQueries}
   * when retrieving objects for Ecore ID attribute based URI
   * {@link org.eclipse.emf.common.util.URI#fragment fragments}. In order to
   * enable such queries to be created, the URI
   * {@link org.eclipse.emf.common.util.URI#fragment fragment} must not only
   * consist of the ID itself but has also to contain the qualified owner class
   * name as well as the name of the ID attribute. The expected format is as
   * follows:
   * </p>
   * <ul>
   * <code>ownerTypeName|idAttributeName='id'</code>
   * </ul>.
   * 
   * @param fragment
   *          the URI {@link org.eclipse.emf.common.util.URI#fragment fragment}
   *          for an object to be retrieved.
   * @return the retrieved object.
   */
  @Override
  @SuppressWarnings("unchecked")
  protected EObject getEObjectByID(String fragment) {

    try {
      EObject result = null;

      // break decorated ID into its components
      String[] idComponents = fragment.split("\\||='|'");

      // validate the decorated ID's components
      boolean valid = true;
      if (idComponents.length < 3) {
        valid = false;
      }
      else {
        for (int i = 0; i < 3; i++) {
          if (idComponents[i] == null || idComponents[i].trim().length() == 0) {
            valid = false;
            break;
          }
        }
      }
      if (!valid) {
        String msg = "Invalid object id (expected format: ownerTypeName|idAttributeName='id').";
        throw new WrappedException(new IllegalArgumentException(msg));
      }

      // build and execute query based on the decorated ID's components;
      // take first object in case that query result is not unique
      String queryString = "select o from " + idComponents[0] + " o where o." + idComponents[1] + " = '" + idComponents[2] + "'";
      List<EObject> eObjects = entityManager.createQuery(queryString).getResultList();
      if (eObjects.size() > 0) {
        result = eObjects.get(0);
      }

      return result;
    }
    catch (RuntimeException exception) {
      throw new WrappedException(exception);
    }
  }

  @Override
  public void attached(EObject eObject) {

    // if attached object is a previously detached one simply remove it from
    // the to be removed list
    if (eObjectsToBeRemovedFromDatabase.contains(eObject)) {
      eObjectsToBeRemovedFromDatabase.remove(eObject);
      return;
    }

    // be sure that object to be attached has been created by application
    // and is not just read from database
    if (!readingContentsFromDatabase) {
        // TODO replace content iterator by automatic validation/fixing of orm cascading settings
        Iterator<EObject> allContents = new EclipseLinkContentTreeIterator<EObject>(Collections.singletonList(eObject), true);
        while (allContents.hasNext()) {
          EObject eContainedObject = allContents.next();
          entityManager.persist(eContainedObject);
        }
    }
  }

  @Override
  public void detached(EObject eObject) {

    // don't delete detached objects immediately in entity manager, but keep
    // them in a to be removed list first so that they can easily reattached if
    // required by application
    eObjectsToBeRemovedFromDatabase.add(eObject);
  }

  @Override
  public final void save(Map<?, ?> options) throws IOException {

    if (!isLoaded) {
      String msg = "Cannot save a resource which is not loaded.";
      throw new WrappedException(new IllegalStateException(msg));
    }

    // writing to database goes via entity manager rather than output stream
    save(null, options);
  }

  @Override
  public final void load(Map<?, ?> options) throws IOException {

    if (!isLoaded) {
      try {
        // reading from database goes via entity manager rather than input
        // stream
        load(null, options);
      }
      catch (WrappedException exception) {
        setLoaded(false);
        throw exception;
      }
    }
  }

  /**
   * An iterator over the tree contents of a collection of EObjects, Resources,
   * and ResourceSets.
   * <p>
   * It provides a special iterator for EObject.eContents that can be configured
   * to be aware of EclipseLink indirection. This is useful in cases where an
   * iterator over all available content objects, which have already been read
   * from the database, is required but a retrieval of new content objects from
   * the database has to be avoided. I.e. the iterator will only walk through
   * contained objects which exist as clones in the underlying EclipseLink unit of
   * work. All other contained objects will be skipped and therefore won't get
   * on demand loaded.
   * </p>
   */
  public static class EclipseLinkContentTreeIterator<E> extends ContentTreeIterator<E> {

    private static final long serialVersionUID = 1L;

    private boolean loadOnDemand;

    public EclipseLinkContentTreeIterator(Collection<?> emfObjects, boolean loadOnDemand) {

      super(emfObjects);
      this.loadOnDemand = loadOnDemand;
    }

    //
    // overrides
    //

    @Override
    public Iterator<? extends EObject> getEObjectChildren(EObject eObject) {

      Iterator<? extends EObject> result;
      if (!loadOnDemand) {
        List<EReference> eLoadedContainmentReferences = new ArrayList<EReference>();
        for (EReference eReference : eObject.eClass().getEAllContainments()) {
          if (eReference.isMany()) {
            EList<?> eChildrenList = (EList<?>) eObject.eGet(eReference);
            if (eChildrenList instanceof IndirectEContainer) {
              IndirectEContainer<?> indirectEContainer = (IndirectEContainer<?>) eChildrenList;
              if (indirectEContainer.isInstantiated()) {
                eLoadedContainmentReferences.add(eReference);
              }
            }
            else {
              eLoadedContainmentReferences.add(eReference);
            }
          }
          else {
            // TODO fix to check woven ValueHolder
            // Object childObject = eObject.eGet(eReference);
            // ProxyIndirectionPolicy policy = new ProxyIndirectionPolicy();
            // if (policy.objectIsInstantiated(childObject)) {
            eLoadedContainmentReferences.add(eReference);
            // }
          }
        }
        result = new EContentsEList<EObject>(eObject, eLoadedContainmentReferences).iterator();
      }
      else {
        result = super.getEObjectChildren(eObject);
      }
      return result;
    }
  }

  @Override
  protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {

    if (options == null) {
      String msg = "Argument for parameter 'options' must not be null.";
      throw new WrappedException(new IllegalArgumentException(msg));
    }

    try {
      // actually delete objects which have previously been detached
      if (eObjectsToBeRemovedFromDatabase.size() > 0) {
        for (EObject eObject : eObjectsToBeRemovedFromDatabase) {
          // TODO replace content iterator by automatic validation/fixing of orm cascading settings
          Iterator<EObject> allContents = new EclipseLinkContentTreeIterator<EObject>(Collections.singletonList(eObject), true);
          while (allContents.hasNext()) {
            EObject eContainedObject = allContents.next();
            entityManager.remove(eContainedObject);
          }
        }
        eObjectsToBeRemovedFromDatabase.clear();
      }

      // commit but continue transaction
      entityManager.getTransaction().commit();
      entityManager.getTransaction().begin();
    }
    catch (RuntimeException exception) {
      throw new WrappedException(exception);
    }
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {

    openDatabase(options);
    readContentsFromDatabase(options);
  }

  @Override
  protected void doUnload() {

    Iterator<EObject> allContents = new EclipseLinkContentTreeIterator<EObject>(new ArrayList<EObject>(getContents()), false);

    // this guard is needed to ensure that clear doesn't make the resource
    // become loaded
    if (!getContents().isEmpty()) {
      getContents().clear();
    }
    getErrors().clear();
    getWarnings().clear();

    while (allContents.hasNext()) {
      InternalEObject eObject = (InternalEObject) allContents.next();
      unloaded(eObject);
    }

    closeDatabase();
  }

  @Override
  public final boolean isTrackingModification() {

    return false;
  }

  @Override
  public final void setTrackingModification(boolean isTrackingModification) {

    // do nothing
  }

  @Override
  public boolean isModified() {

    return false;
  }

  @Override
  public void setModified(boolean isModified) {

    // do nothing
  }

  //
  // helper methods
  //

  protected void initDefaultOptions() {

    defaultSaveOptions = new HashMap<Object, Object>();

    defaultLoadOptions = new HashMap<Object, Object>();
    defaultLoadOptions.put("eclipselink.logging.level", "FINE");
  }

  protected void openDatabase(Map<?, ?> options) {

    if (options == null) {
      String msg = "Argument for parameter 'options' must not be null.";
      throw new WrappedException(new IllegalArgumentException(msg));
    }

    try {
      // entity manager factory for given persistence unit name already
      // existing?
      EntityManagerFactoryInstance entityManagerFactoryInstance;
      if (!persistenceUnitNameToEntityManagerFactoryInstanceMap.containsKey(persistenceUnitName)) {
        // create and register new entity manager factory for given persistence
        // unit name according to sessions configuration file
        EntityManagerFactory entityManagerFactory = new PersistenceProvider().createEntityManagerFactory(persistenceUnitName, options, this.getClass().getClassLoader());
        if (entityManagerFactory == null) {
        	throw new RuntimeException("Unable to create entity manager factory for persistence unit named '" + persistenceUnitName + "'.");
        }
        entityManagerFactoryInstance = new EntityManagerFactoryInstance(entityManagerFactory);
        persistenceUnitNameToEntityManagerFactoryInstanceMap.put(persistenceUnitName, entityManagerFactoryInstance);
      }
      else {
        // retrieve existing entity manager factory for given persistence unit
        // name
        entityManagerFactoryInstance = persistenceUnitNameToEntityManagerFactoryInstanceMap.get(persistenceUnitName);
      }

      // increase EclipseLink resource instance counter for underlying entity
      // manager factory
      int count = entityManagerFactoryInstance.getResourceInstanceCount();
      count++;
      entityManagerFactoryInstance.setResourceInstanceCount(count);

      // create entity manager and begin transaction
      EntityManagerFactory entityManagerFactory = entityManagerFactoryInstance.getEntityManagerFactory();
      entityManager = entityManagerFactory.createEntityManager();
      entityManager.getTransaction().begin();
    }
    catch (RuntimeException exception) {
      closeDatabase();
      throw new WrappedException(exception);
    }
  }

  @SuppressWarnings("unchecked")
  protected void readContentsFromDatabase(Map<?, ?> options) {

    try {
      // execute contents query and initialize contents list
      readingContentsFromDatabase = true;
      List<EObject> contents = entityManager.createQuery(contentsQuery).getResultList();
      getContents().addAll(contents);
      readingContentsFromDatabase = false;
    }
    catch (RuntimeException exception) {
      throw new WrappedException(exception);
    }
  }

  protected void closeDatabase() {

    // entity manager existing and open?
    if (entityManager != null && entityManager.isOpen()) {
      // close entity manager
      entityManager.close();
    }

    // entity manager factory for given persistence unit name existing?
    if (persistenceUnitNameToEntityManagerFactoryInstanceMap.containsKey(persistenceUnitName)) {
      // decrease EclipseLink resource instance counter for underlying entity
      // manager factory
      EntityManagerFactoryInstance entityManagerFactoryInstance = persistenceUnitNameToEntityManagerFactoryInstanceMap.get(persistenceUnitName);
      int count = entityManagerFactoryInstance.getResourceInstanceCount();
      if (count > 0) {
        count--;
        entityManagerFactoryInstance.setResourceInstanceCount(count);
      }

      // close and unregister entity manager factory for given persistence unit
      // name when all EclipseLink resource instances relying on it have been
      // unloaded
      if (count == 0) {
        EntityManagerFactory entityManagerFactory = entityManagerFactoryInstance.getEntityManagerFactory();
        entityManagerFactory.close();
        persistenceUnitNameToEntityManagerFactoryInstanceMap.remove(persistenceUnitName);
      }
    }
  }
}
