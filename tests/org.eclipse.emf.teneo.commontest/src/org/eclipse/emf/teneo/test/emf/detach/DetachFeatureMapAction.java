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
 * $Id: DetachFeatureMapAction.java,v 1.4 2007/02/08 23:11:22 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.detach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.CopyCommand.Helper;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Contacts;
import org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapFactory;
import org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapPackage;
import org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person;
import org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.SpecialPerson;
import org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.provider.DetachfeaturemapItemProviderAdapterFactory;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.resource.StoreResource;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Is a test case to test detach functionality for featuremap with different kinds of methods
 * on the featuremap (move, set, etc).
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $ 
*/
public class DetachFeatureMapAction extends AbstractTestAction 
{

	/** Constructor */
	public DetachFeatureMapAction()
	{
		super(DetachfeaturemapPackage.eINSTANCE);
	}

	/**
	 * Says to use the mapping file, actually only relevant for hibernate
	 */
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.put(PersistenceOptions.USE_MAPPING_FILE, "true");
		return props;
	}

	/** Stores a TopModel Object */
	public void doAction(TestStore store)
	{
		try
		{
			DetachfeaturemapFactory factory = DetachfeaturemapFactory.eINSTANCE;

			{
	    		final Resource resource = store.getResource();
	    		
			    resource.load (Collections.EMPTY_MAP);
			    assertTrue(resource.getContents().size() == 0);
	
			    // add test data
			    Contacts contacts = factory.createContacts();
			    Person person = factory.createPerson();
				person.setName("");
				person.getMobile().add("001");
				person.getMobile().add("002");
				
				contacts.getPersons().add(person);
				
			    SpecialPerson specialPerson = factory.createSpecialPerson();
			    specialPerson.setName("");
			    specialPerson.getMobile().add("001");
			    specialPerson.getMobile().add("002");
				contacts.getPersons().add(specialPerson);
				
				resource.getContents().add(contacts);
				
				resource.save(Collections.EMPTY_MAP);

				contacts = (Contacts)resource.getContents().get(0);
				person = (Person) contacts.getPersons().get(0);
				
				assertEquals (2, person.getMobile().size());
				
				EList mobiles = (EList) person.getMobile();
				
				Object m1 = mobiles.get(0);
				Object m2 = mobiles.get(1);
			    
				for (Object o : new ArrayList<Object>(mobiles)) {
					mobiles.remove(o);
				}
				//mobiles.clear();
				
				mobiles.add(m1);
				mobiles.add(m2);
			     
				resource.save(Collections.EMPTY_MAP);       
				resource.unload();
			}
			
			{
	    		Resource resource = store.getResource();
			    resource.load (Collections.EMPTY_MAP);
				Contacts contacts = (Contacts)resource.getContents().get(0);
				Person person = (Person) contacts.getPersons().get(0);
				
				assertEquals (2, person.getMobile().size());
				resource.unload();
			}
			
			// now move everything around
			{
	    		Resource resource = store.getResource();
			    resource.load (Collections.EMPTY_MAP);
				Contacts contacts = (Contacts)resource.getContents().get(0);
				Person person = (Person) contacts.getPersons().get(0);
				
				Object p0 = person.getPhones().get(0);
				Object p1 = person.getPhones().get(1);
				person.getPhones().clear();
				person.getPhones().add((FeatureMap.Entry)p1);
				person.getPhones().add((FeatureMap.Entry)p0);
				
				assertEquals (2, person.getMobile().size());
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}

			{
	    		Resource resource = store.getResource();
			    resource.load (Collections.EMPTY_MAP);
				Contacts contacts = (Contacts)resource.getContents().get(0);
				Person person = (Person) contacts.getPersons().get(0);
				assertTrue(person.getMobile().get(0).toString().compareTo("002") == 0);
				assertTrue(person.getMobile().get(1).toString().compareTo("001") == 0);
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
			
			// add two and delete 1
			{
	    		Resource resource = store.getResource();
			    resource.load (Collections.EMPTY_MAP);
				Contacts contacts = (Contacts)resource.getContents().get(0);
				Person person = (Person) contacts.getPersons().get(0);
				person.getMobile().add("003");
				person.getMobile().add("004");
				person.getMobile().remove(1); //removes 001
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}

			// check if this actually worked
			{
	    		Resource resource = store.getResource();
			    resource.load (Collections.EMPTY_MAP);
				Contacts contacts = (Contacts)resource.getContents().get(0);
				Person person = (Person) contacts.getPersons().get(0);
				assertTrue(person.getMobile().get(0).toString().compareTo("002") == 0);
				assertTrue(person.getMobile().get(1).toString().compareTo("003") == 0);
				assertTrue(person.getMobile().get(2).toString().compareTo("004") == 0);
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
			
			// do a set and move 
			{
	    		Resource resource = store.getResource();
			    resource.load (Collections.EMPTY_MAP);
				Contacts contacts = (Contacts)resource.getContents().get(0);
				Person person = (Person) contacts.getPersons().get(0);
				person.getPhones().move(0, 2); // order is now 004, 002, 003
				person.getMobile().set(2, "005"); // order is now 004, 002, 005
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}

			// the order should be 004, 002, 005
			{
	    		Resource resource = store.getResource();
			    resource.load (Collections.EMPTY_MAP);
				Contacts contacts = (Contacts)resource.getContents().get(0);
				Person person = (Person) contacts.getPersons().get(0);
				assertTrue(person.getMobile().get(0).toString().compareTo("004") == 0);
				assertTrue(person.getMobile().get(1).toString().compareTo("002") == 0);
				assertTrue(person.getMobile().get(2).toString().compareTo("005") == 0);
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
			
			// test a specific feature related to copy action and then changing the changed object
			{
				List factories = new ArrayList();
				factories.add(new ResourceItemProviderAdapterFactory());
				factories.add(new DetachfeaturemapItemProviderAdapterFactory());
				factories.add(new ReflectiveItemProviderAdapterFactory());

				// create an editing domain
				ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(factories);
				BasicCommandStack commandStack = new BasicCommandStack();
				EditingDomain editDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap());;

				// get and load the resource
				final String uriStr = getResourceUri(store);
				final URI uri = URI.createURI(uriStr);
				Resource resource = editDomain.getResourceSet().createResource(uri);
			    resource.load (Collections.EMPTY_MAP);
			    
			    // get contacts and person
				Contacts contacts = (Contacts)resource.getContents().get(0);
				Person person = (Person) contacts.getPersons().get(0);
				
				// copy
				CopyCommand cpcmd = new CopyCommand(editDomain, person, new Helper()); //(CopyCommand)CopyCommand.create(editDomain, person);
				cpcmd.execute();
				
				// get the copied person, change it and add it to the resource
				Person cpPerson = (Person)cpcmd.getResult().iterator().next();
				cpPerson.setName("copy");
				contacts.getPersons().add(cpPerson);
				
				// save it
				resource.save(Collections.EMPTY_MAP);
				
				// change the copy
				cpPerson.setName("copy2");
				
				// before the next save gave an error but now it works fine.
				resource.save(Collections.EMPTY_MAP);				
				resource.unload();
			}

			// the order should be 004, 002, 005
			{
	    		Resource resource = store.getResource();
			    resource.load (Collections.EMPTY_MAP);
				Contacts contacts = (Contacts)resource.getContents().get(0);
				Person person = (Person) contacts.getPersons().get(0);
				assertTrue(person.getName().compareTo("copy2") != 0);
				assertTrue(person.getPhones().size() > 0);
				
				person.getMobile().clear();
				
				resource.save(Collections.EMPTY_MAP);
				resource.unload();
			}
		}
		catch (Exception e)
		{
			throw new StoreTestException("Need to catch the resource ioexception", e);
		}
    }
	
	/** Returns the resource uri, jdo is default (for now) */
	public String getResourceUri(TestStore store) {
		return "jpoxdao://?" + StoreResource.DS_NAME_PARAM + "=" + store.getDatabaseAdapter().getDbName();		
	}
}
