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
 * $Id: AgilAction.java,v 1.1 2007/03/28 13:58:33 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import lobj.LobjPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests reference relations between abstract relations. This failed during
 * compute references, the test is therefore very light.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class AgilAction extends AbstractTestAction {

	// TEST 1: MODULEFOLDER
	private String xmlFile = "/home/mtaal/mytmp/testcase1.xmi";
	private String testObjClass = "ModuleFolder";
	private String testObjID = "modfo-27C47B58-71F7-6F08-DDCE-E40D4EBA305C";
	private String parentTestObjClass = "ModuleFolder";
	private boolean rootFolder = false;

	DatabaseServices services;

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public AgilAction() {
		super(new EPackage[] { LobjPackage.eINSTANCE });
	}

	/*
	 * load a resource from a local file
	 */
	private Resource getLocalResource() {

		ResourceSet resourceSet = new ResourceSetImpl();

		File file = new File(xmlFile);
		URI uri = (file.isFile() ? URI.createFileURI(file.getAbsolutePath())
				: URI.createURI(xmlFile));

		Resource resource;

		try {
			// Demand load resource for this file.
			//
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			("xmi", 
			 new XMIResourceFactoryImpl());

			resource = resourceSet.getResource(uri, true);
			System.out.println("Loaded " + uri);

			return resource;
		} catch (Exception exception) {
			System.out.println("Problem loading " + uri);
			exception.printStackTrace();
		}

		return null;
	}

	/*
	 * load a string from a local file
	 */
	private String getLocalString() {

		try {
			StringBuffer fileData = new StringBuffer(1000);
			BufferedReader reader = new BufferedReader(new FileReader(xmlFile));
			char[] buf = new char[1024];
			int numRead = 0;
			while ((numRead = reader.read(buf)) != -1) {
				String readData = String.valueOf(buf, 0, numRead);
				fileData.append(readData);
				buf = new char[1024];
			}
			reader.close();
			return fileData.toString();
		} catch (Exception e) {
			System.err.println("File input error");
			e.printStackTrace();
		}

		return null;
	}

	private boolean compareResources(Resource resA, Resource resB) {
		// compare number of objects
		if (resA.getContents().size() != resB.getContents().size()) {
			System.out.println("compareResources: unequal object count.");
			return false;
		}

		for (int j = 0; j < resA.getContents().size(); j++) {
			// get iterators
			Iterator a = resA.getContents().iterator();
			Iterator b = resB.getContents().iterator();
			// fetch EObjects
			EObject objA = (EObject) a.next();
			EObject objB = (EObject) b.next();

			// compare eClasses first
			if (!objA.eClass().getName().equalsIgnoreCase(
					objB.eClass().getName())) {
				System.out.println("compareResources: unequal eClasses.");
				return false;
			}
			// eClasses match, check attribute values
			EList attributes = objA.eClass().getEAllAttributes();

			for (Iterator it = attributes.iterator(); it.hasNext();) {
				// get attribute object
				EAttribute attrib = (EAttribute) it.next();

				// compare attribute values
				if (!objA.eGet(attrib).equals(objB.eGet(attrib))) {
					System.out
							.println("compareResources: found different attribute values.");
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * Test method for
	 * {@link jku.ce.scholion.dataaccessprovider.DatabaseServices#resourceToString(org.eclipse.emf.ecore.resource.Resource, java.lang.String)}.
	 */
	/*
	 * public void testResourceToString() { // load a resource directly from its
	 * persistant storage Resource resA = getLocalResource(); // transform to
	 * string String output = ""; try{ output = services.resourceToString(resA,
	 * encoding); }catch(Exception e){ e.printStackTrace(); } // read xmlstring
	 * from local file String input = getLocalString();
	 * 
	 * //compare the two strings assertEquals(output, input); }
	 */

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
		services = new DatabaseServices(store);
		// load testobject
		// String tObj = getLocalString();
		Resource tRes = getLocalResource();
		try {
			tRes.load(new HashMap());
			String tObj = "";
			String str;
			store.beginTransaction();
			final EObject copy = EcoreUtil.copy(tRes.getContents().get(0)); 
			store.store(copy);
			store.commitTransaction();

			// resolve all proxies for the objects in the resource
			EcoreUtil.ExternalCrossReferencer.find(tRes);

			str = services.resourceToString(tRes, "");

			System.out.println("building object with URI: "
					+ tRes.getURI().toString());

			// tArr[0] = tRes.getURI().toString();
			// tArr[1] = tObj;

			System.out
					.println("(testPersistObject)PERSISTING THE FOLLOWING STRINGs:\n");
			System.out.println((String) str);

			// try to persist
			Object[] ret = services.persistObject(new String[] { str }, "");

			String statusCode = ret[0].toString();

			// check status code
			// if other than 201, fail this test
			System.out.println("(testPersistObject)status code=" + statusCode);
			assertEquals("201", statusCode);
		} catch (Exception e) {
			throw new Error("Exception", e);
		}
	}

	/**
	 * Test method for
	 * {@link jku.ce.scholion.dataaccessprovider.DatabaseServices#loadObject(java.lang.String, java.lang.String, java.lang.String)}.
	 * does loadObject work? test #3
	 */
	public void testLoadObject() {
		// try to load persisted object
		Object[] ret = services.loadObject(testObjID, "", testObjClass);

		String statusCode = ret[0].toString();

		// check status code
		// if other than 200, fail this test
		System.out.println("(testLoadObject)status code=" + statusCode);
		System.out.println(ret[1].toString());
		assertEquals("200", statusCode);
	}

	/**
	 * Test method for
	 * {@link jku.ce.scholion.dataaccessprovider.DatabaseServices#loadObjectList(java.lang.String, java.lang.String)}.
	 * does loadObjectList work? test #4
	 */
	// public void testLoadObjectList() {
	// //try to load persisted object
	// Object[] ret = services.loadSubset(encoding, testObjClass, null, null);
	//		
	// String statusCode = ret[0].toString();
	// //check status code
	// //if other than 200, fail this test
	// System.out.println("(testLoadObjectList)status code="+statusCode);
	// assertEquals("200", statusCode);
	// }
	//
	//
	// /**
	// * Test method for {@link
	// jku.ce.scholion.dataaccessprovider.DatabaseServices#loadSubset(java.lang.String
	// parentid, java.lang.String parentclass, java.lang.String idfield,
	// java.lang.String encoding)}.
	// * does loadSubset work?
	// * test #4
	// */
	// public void testLoadSubset() {
	// System.out.println("calling loadSubset with params: "+encoding+",
	// "+testObjClass+", "+parentTestObjClass+", "+testObjID);
	// //try to load persisted object
	// Object[] ret = services.loadSubset(encoding, testObjClass,
	// parentTestObjClass, testObjID);
	//		
	//		
	// String statusCode = ret[0].toString();
	//		
	// //check status code
	// //if other than 200, fail this test
	// System.out.println("(testLoadSubset)status code="+statusCode);
	// assertEquals("200", statusCode);
	// }
	//
	// /**
	// * does getEObjectDetails work?
	// * test #5
	// */
	// public void testGetEObjectDetails() {
	//		
	// Object[] features = new Object[]
	// {LobjPackage.eINSTANCE.MODULE_FOLDER__FOLDER_META,
	// LobjPackage.eINSTANCE.MODULE_FOLDER__MODULE_FOLDER};
	//		
	// //try to load persisted object
	// Object[] ret = services.getEObjectDetails(encoding, testObjClass,
	// testObjID, features);
	//		
	// String statusCode = ret[0].toString();
	//		
	// //check status code
	// //if other than 200, fail this test
	// System.out.println("(testGetEObjectDetails)status code="+statusCode);
	// System.out.println(ret[1].toString());
	// assertEquals("200", statusCode);
	// }
	//	
	// /**
	// * does getRootFolder work?
	// * test #6
	// */
	// public void testGetRootFolder(){
	// if(rootFolder){
	// //try to load persisted object
	// Object[] ret = services.getRootFolder(encoding, parentTestObjClass,
	// testObjID);
	// }else{
	// System.out.println("INFO: TESTCASE DOES NOT SUPPORT getRootFolder!
	// [SKIP]");
	// assertTrue(true);
	// }
	// }
	// /**
	// * does deleteObject work?
	// * test #7
	// */
	// public void testDeleteObject() {
	// //try to load persisted object
	// Object[] ret = services.deleteObject(testObjID, parentTestObjClass);
	//		
	// String statusCode = ret[0].toString();
	//		
	// //check status code
	// //if other than 200, fail this test
	// System.out.println("(testDeleteObject)status code="+statusCode);
	// assertEquals("202", statusCode);
	// }
}
