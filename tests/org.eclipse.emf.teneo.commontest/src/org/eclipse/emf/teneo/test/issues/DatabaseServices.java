package org.eclipse.emf.teneo.test.issues;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Logger;

import javax.jdo.Transaction;
import javax.management.Query;

import lobj.CorrBlock;
import lobj.Item;
import lobj.LearningUnit;
import lobj.LobjPackage;
import lobj.LuNode;
import lobj.Module;
import lobj.Node;
import lobj.PresentationBlock;
import lobj.ThemeNode;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.resource.StoreResource;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * A Class interfacing the Authortool Database
 * 
 * @author Christian (insel) Donhofer <christian@donhofer.net>, Dietmar (dida)
 *         Holzer <dietmar.holzer@fh-campuswien.ac.at>
 * @version 1.0
 * @contact christian@donhofer.net
 * 
 * @created dunno =)
 * @last_modified 22.02.2007
 */

public final class DatabaseServices {

	private TestStore store;

	DatabaseServices(TestStore store) {
		this.store = store;
	}

	/**
	 * Returns a {@link org.eclipse.emf.ecore.resource.ResourceSet} object that
	 * can be used to manage relative resources.
	 * <p>
	 * The returned {@link org.eclipse.emf.ecore.resource.ResourceSet} has all
	 * of the necessary {@link org.eclipse.emf.ecore.EPackage}s in its
	 * registry.
	 * 
	 * @return a {@link org.eclipse.emf.ecore.resource.ResourceSet} object
	 */
	public static ResourceSet getResourceSet() {
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();
		return resourceSet;
	}

	public static boolean saveXMLOnFilesys(String filename, String content) {
		FileWriter out; // Dateiausgabe-Stream
		// Standardeingabe in Reader umwandeln

		// Erzeugen eines Ausgabe-Streams, der mit der Datei
		// 'FileDemo.dat' verkn�pft ist
		try {
			out = new FileWriter(new File(filename));
			System.out.println("writing " + filename + "...");
			out.write(content);
			out.close(); // Schlie�en der Datei
			System.out.println("File " + filename + " written!");
			return true;
		} catch (IOException ex) {
			ex.printStackTrace();
			return false;
		}

	}

	/**
	 * Saves a {@link org.eclipse.emf.ecore.resource.Resource} to a String
	 * object and returns the newly created {@link java.lang.String}
	 * 
	 * @param rs
	 *            a {@link org.eclipse.emf.ecore.resource.Resource}
	 * @param encoding
	 *            encoding of the xml {@link java.lang.String}
	 * @return a {@link java.lang.String} object that matches the xml
	 *         {@link java.lang.String}
	 */
	public static String resourceToString(Resource rs, String encoding)
			throws Exception {
		StringWriter sw = new StringWriter();
		URIConverter.WriteableOutputStream uws = new URIConverter.WriteableOutputStream(
				sw, encoding);
		try {
			rs.save(uws, new HashMap());
		} catch (Exception e) {
			throw (e);
		}
		String myObject = sw.toString();

		return myObject;
	}

	/**
	 * Saves the changed objects or removes the detached objects from this
	 * resource.
	 */
	protected void saveResource(Resource resource) {

		boolean err = true;
		Object tObj, pObj;
		EObject eObj;
		// retrieve session

		try {
			// initialize transaction
			store.beginTransaction();

			final Iterator it = resource.getContents().iterator();

			// nur erstes Objekt in Resource speichern
			// TODO(1) will this work in every possible case?

			tObj = it.next();
			store.store(tObj);

			err = false;

		} catch (Exception e) {
			err = true;
			e.printStackTrace(System.err);
			throw new Error("Exception when saving resource "
					+ resource.getURI(), e);
		} finally {
			if (err) {
				store.rollbackTransaction();
			} else {
				store.commitTransaction();
			}
		}
	}

	/**
	 * Persists an AT {@link org.eclipse.emf.ecore.EObject} to the standard
	 * datastore
	 * 
	 * @param xml
	 *            a {@link org.eclipse.emf.ecore.resource.Resource} in form of
	 *            an xml {@link java.lang.String}
	 * @param encoding
	 *            encoding of the xml {@link java.lang.String} (for instance:
	 *            "UTF-8")
	 * @return true on success, else false
	 */
	public Object[] persistObject(Object[] xmls, String encoding) {
		Object[] ret = new Object[] { "", "" };
		ResourceSet resourceSet = getResourceSet();
		Resource resource;

		URI uri;
		Vector<String> objectsA = new Vector<String>();
		for (int i = 0; i < xmls.length; i = i + 2) {

			// Uri fuer XMI-Resource, wird im StringArray mituebergeben
			uri = URI.createURI((String) xmls[i]);

			// create resource via RS
			resource = resourceSet.createResource(uri);
			String hash = resource.hashCode()
					+ ((String) xmls[i + 1]).hashCode() + "";
			if (objectsA.contains(hash)) { // if the object has already been
											// added
				System.out.println("(RS)skipping [" + resource.toString()
						+ "] with HASHCODE " + hash + " - already present");
				continue; // skip to next iteration
			} else {
				// add hash to list to avoid adding the same resource again
				objectsA.add(hash);
				System.out.println("(RS)adding [" + resource.toString()
						+ "] with HASHCODE " + hash);
				try {
					resource.load(new URIConverter.ReadableInputStream(
							(String) xmls[i + 1], encoding), new HashMap());
				} catch (Exception e) {
					e.printStackTrace();

					// return error/status code and exit
					// 415 - Unsupported media type
					ret[0] = "415";
					return ret;
				}
			}

		}

		System.out.println("ONLINE: NUMBER OF RESOURCES TO PERSIST:"
				+ resourceSet.getResources().size());

		// System.out.println(EcoreUtil.convertToString(Resource, resource));
		try {
			// get resources in resourceSet
			final List resList = resourceSet.getResources();

			// store it!
			// keep track of stored objects to avoid session-errors/collisions
			Vector<String> objects = new Vector<String>();
			for (int i = 0; i < resList.size(); i++) {
				final Resource res = (Resource) resList.get(i);

				String hash = res.hashCode() + "";

				if (objects.contains(hash)) { // if the object has already
												// been added
					System.out.println("(STORE)skipping [" + res.toString()
							+ "] with HASHCODE " + hash + " - already present");
					continue; // skip to next iteration
				} else {
					System.out.println("(STORE)adding [" + res.toString()
							+ "] with HASHCODE " + hash);
					objects.add(hash);

					// save the resource
					saveResource(res);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

			// return error/status code and exit
			// 304 - Not Modified
			ret[0] = "304";
			return ret;
		}

		// return error/status code and exit
		// 201 - Created
		ret[0] = "201";
		return ret;
	}

	/**
	 * Loads a single object from the DB, given an id
	 * 
	 * @param id
	 *            the primary key ID of the object to load
	 * @param encoding
	 *            encoding of the xml {@link java.lang.String} (for instance:
	 *            "UTF-8")
	 * @param eclassname
	 *            {@link org.eclipse.emf.ecore.EClass} name the class of object
	 *            to load
	 * @return an XMI {@link java.lang.String} containing the wanted object
	 */
	public Object[] loadObject(String id, String encoding, String eclassname) {
		return loadObject(id, encoding, eclassname, true);
	}

	/**
	 * extended loadObject function, class-internal use only
	 * 
	 * @param id
	 *            the primary key ID of the object to load
	 * @param encoding
	 *            encoding of the xml {@link java.lang.String} (for instance:
	 *            "UTF-8")
	 * @param eclassname
	 *            {@link org.eclipse.emf.ecore.EClass} name the class of object
	 *            to load
	 * @param serialize
	 *            if false, return EObject, else: ResourceString
	 * @return an XMI {@link java.lang.String} containing the wanted object
	 */
	// private Object[] loadObject(String id, String encoding, String
	// eclassname, boolean serialize){
	// Object[] ret = new Object[]{"", ""};
	// //create datastore, session and transaction
	//		
	// Enumeration p = dataStore.getPersistenceOptions().getProperties().keys();
	// while(p.hasMoreElements()){
	// String actObj = p.nextElement().toString();
	// System.out.println(actObj+
	// " =
	// "+dataStore.getPersistenceOptions().getProperties().getProperty(actObj));
	// }
	// System.out.println("EAGERLY IS SET TO
	// "+dataStore.getPersistenceOptions().isFetchContainmentEagerly());
	//		
	// session = getSession();
	// Transaction tx = session.getTransaction();
	//
	// ResourceSet resourceSet = getResourceSet();
	// Resource rs =
	// resourceSet.createResource(URI.createFileURI("soEinDummy.lobj"));
	// HibernateResource hrs;
	// dataStore.getHibernateProperties().list(System.out);
	//		
	// // start transaction
	// tx.begin();
	//		
	// // query for object by ID
	// Query qry = session.createQuery("from "+eclassname+" where id='"+id+"'");
	// Query qry2 = session.createQuery("from Language");
	// List list = qry.list();
	//		
	//
	// if(list.size() <= 0){
	// //return error/status code and exit
	// //404 - Not Found
	// ret[0] = "404";
	// return ret;
	// }else if(list.size() > 1){
	// //return error/status code and exit
	// //300 - Multiple Objects
	// ret[0] = "300";
	// }else{
	// //return error/status code and exit
	// //200 - OK
	// ret[0] = "200";
	// }
	//		
	//		
	// EObject eo = (EObject)list.get(0);
	// EObject lang = (EObject)qry2.list().get(0);
	// rs.getContents().add(lang);
	//		
	// for(Iterator iter = list.iterator(); iter.hasNext();){
	// EObject element = (EObject) iter.next();
	// rs.getContents().add(element);
	// }
	//
	//		
	// System.out.println("COUNT OF RESOURCES IN RESOURCESET:
	// "+rs.getResourceSet().getResources().size());
	// System.out.println("COUNT OF OBJECTS IN RESOURCE(s):
	// "+rs.getContents().size());
	//
	// if(serialize){
	// System.out.println("CD DEBUG: SERIALIZING OBJECTS!");
	// //translate resource into string
	// String myObject = "";
	// try{
	// myObject = resourceToString(rs, encoding);
	// }catch(Exception e){
	// System.out.println("EXCEPTION WHEN SERIALIZING:");
	// e.printStackTrace();
	// //return error/status code and exit
	// //500 - Internal Server Error
	// ret[0] = "500";
	// return ret;
	// }
	//
	// // return xml-String
	// ret[1] = myObject;
	// }else{
	// System.out.println("CD DEBUG: NOT SERIALIZING OBJECTS!");
	// ret[1] = eo;
	// }
	// // end transaction & session
	// tx.commit();
	// session.close();
	//		
	// return ret;
	// }

	private Object[] loadObject(String id, String encoding, String eclassname,
			boolean serialize) {
		Object[] ret = new Object[] { "", "" };
		// create datastore, session and transaction

		ResourceSet resourceSet = getResourceSet();
		Resource rs = resourceSet.createResource(URI
				.createFileURI("/home/mtaal/mytmp/soEinDummy.lobj"));

		// resourceSet has to be set before somehow..
		final Resource res1 = store.getResource();

		// now load the resources
		try {
			res1.load(Collections.EMPTY_MAP);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("LOADED RESOURCE CONTAINS "
				+ res1.getContents().size() + "OBJECTS!");
		System.out.println("LOADED RESOURCESET CONTAINS "
				+ res1.getResourceSet().getResources().size() + " RESOURCES!");

		for (Iterator iter = res1.getResourceSet().getResources().iterator(); iter
				.hasNext();) {
			Resource resource = (Resource) iter.next();
			if (resource.getContents().size() > 0) {
				EObject eo = EcoreUtil.copy((EObject) resource.getContents()
						.get(0));
				// EObject eo = (EObject)resource.getContents().get(0);
				rs.getContents().add(eo);
			}
		}

		// for (Iterator iter = res1.getContents().iterator(); iter.hasNext();)
		// {
		// EObject element = (EObject) iter.next();
		// System.out.println("adding "+element.toString());
		// EObject eo = EcoreUtil.copy(element);
		// System.out.println("resource contains:" +eo.toString());
		// //rs.getContents().add(eo);
		// }

		if (serialize) {
			System.out.println("CD DEBUG: SERIALIZING OBJECTS!");
			// translate resource into string
			String myObject = "";
			try {

				myObject = resourceToString(rs, encoding);
			} catch (Exception e) {
				System.out.println("EXCEPTION WHEN SERIALIZING:");
				e.printStackTrace();
				// return error/status code and exit
				// 500 - Internal Server Error
				ret[0] = "500";
				return ret;
			}

			// return xml-String
			ret[1] = myObject;
		} else {
			System.out.println("CD DEBUG: NOT SERIALIZING OBJECTS!");
			// ret[1] = eo;
		}

		return ret;
	}

	/**
	 * translate a resource into a string (using resourceToString) and return an
	 * Object[] to be transmitted to the client
	 * 
	 * TODO NOTE null values are not allowed in xmlrpc response, so parent array
	 * must be fully set. you can't leave parent[1] null!!!
	 * 
	 * @param rs
	 * @param encoding
	 * @param list
	 *            List of objects, f.i. retreived via getJoinedLoadList(needed
	 *            for status code generation)
	 * @return Object[], containing a statuscode at index 0 and the serialized
	 *         objects at index 1
	 */
	private Object[] evalStringBuild(Resource rs, String encoding, List list) {

		// port objects to XMI resource for translation
		ResourceSet resourceSet = getResourceSet();
		Resource rsXmi = resourceSet.createResource(URI
				.createFileURI("soEinDummy.lobj"));
		rsXmi.getContents().addAll(rs.getContents());

		Object[] ret = new Object[2];
		// translate resource into string
		String myObjects = "";
		try {
			myObjects = resourceToString(rsXmi, encoding);
		} catch (Exception e) {
			e.printStackTrace();

			// return error/status code and exit
			// 500 - Internal Server Error
			ret[0] = "500";
			return ret;
		}

		if (list.size() <= 0) {
			// return error/status code and exit
			// 404 - Not Found
			ret[0] = "404";
			return ret;
		} else {
			// return error/status code
			// 200 - OK
			ret[0] = "200";
		}

		// add xml-String
		ret[1] = myObjects;

		return ret;
	}

	/**
	 * recursive function to add all (Corr)BlockMeta objects beneath an Item to
	 * a resource, which is than returned
	 * 
	 * @param item
	 *            the toplevel-item
	 * @return resource with all contained blockmetas
	 */
	private Resource addCorrBlockMeta(Item item, Resource rs) {
		if (rs == null) {
			System.out
					.println("(addCorrBlockMeta)RESOURCE IS NULL!!!!!!!!!!!!!!!!!!!!!");
		}

		for (Iterator iter = item.getCorrBlock().iterator(); iter.hasNext();) {
			CorrBlock cb = (CorrBlock) iter.next();
			for (Iterator iterator = cb.getPresentationBlock().iterator(); iterator
					.hasNext();) {
				PresentationBlock pb = (PresentationBlock) iterator.next();
				rs.getContents().add(pb.getBlock().getBlockMeta());
			}
		}
		for (Iterator iter = item.getChilditems().iterator(); iter.hasNext();) {
			rs = addCorrBlockMeta((Item) iter.next(), rs);
		}

		return rs;
	}

	/**
	 * recursive function to add all LuMeta objects beneath a Theme(root)Node to
	 * a resource, which is than returned
	 * 
	 * @param item
	 *            the toplevel-item
	 * @return all contained LuMetas
	 */
	private Resource addLuMeta(ThemeNode rnode, Resource rs) {
		if (rs == null) {
			System.out
					.println("(addLuMeta)RESOURCE IS NULL!!!!!!!!!!!!!!!!!!!!!");
		}

		for (Iterator iter = rnode.getChildnodes().iterator(); iter.hasNext();) {
			Node node = (Node) iter.next();

			if (node instanceof LuNode) { // LuNodes cannot contain LuNodes,
											// so simply add the LuMeta
				rs.getContents().add(
						((LuNode) node).getLearningUnit().getLuMeta());
			} else if (node instanceof ThemeNode) {
				ThemeNode tnode = (ThemeNode) node;
				rs = addLuMeta(tnode, rs);
			}
		}

		return rs;
	}
}
