package org.eclipse.emf.test.teneo.resource.edit;

import java.io.IOException;
import java.util.Collections;
import java.util.Properties;

import junit.framework.TestCase;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.test.databinding.emfdb.EmfdbFactory;
import org.eclipse.emf.test.databinding.emfdb.EmfdbPackage;
import org.eclipse.emf.test.databinding.emfdb.Family;
import org.eclipse.emf.test.databinding.emfdb.Person;

public class TeneoResourceTest extends TestCase {

	protected AdapterFactoryEditingDomain editingDomain;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testResource() {
		// Connection properties
		final Properties properties = new Properties();
		properties.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");		
		properties.put("hibernate.connection.url", "????????????????????????");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.put("hibernate.connection.username", "????????????????????????");
		properties.put("hibernate.connection.password", "????????????????????????");		
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "create");
		
		// Create the DataStore.
		final HbDataStore dataStore = HbHelper.INSTANCE.createRegisterDataStore(Activator.PLUGIN_ID);
		dataStore.setEPackages(new EPackage[] { EmfdbPackage.eINSTANCE });
		dataStore.setProperties(properties);
		dataStore.initialize();		
		
		// Create EditingDomain etc
		final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	    final BasicCommandStack commandStack = new BasicCommandStack();	    
	    editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack);
	    
	    // Create resource & test
	    final URI uri = URI.createURI("hibernate://?" +HibernateResource.DS_NAME_PARAM + "=" + Activator.PLUGIN_ID); 		
		try {
			final Resource resource = editingDomain.getResourceSet().createResource(uri);
			resource.load(Collections.EMPTY_MAP);
	
			// Create a new family
			final Family family = EmfdbFactory.eINSTANCE.createFamily();
			resource.getContents().add(family);
			resource.save(Collections.EMPTY_MAP);
			
			// Add a child to the family (Family contains child)
			final Person child = EmfdbFactory.eINSTANCE.createPerson();
			final Command command1 = AddCommand.create(editingDomain, family, EmfdbPackage.Literals.FAMILY__PERSONS, child);
			editingDomain.getCommandStack().execute(command1);
			resource.save(Collections.EMPTY_MAP);
			
			// Add a mother to the family (Family contains mother)
			// Add reference of mother to child (Child references mother)
			final Person mother = EmfdbFactory.eINSTANCE.createPerson();
			final CompoundCommand command2 = new CompoundCommand();
			command2.append(AddCommand.create(editingDomain, family, EmfdbPackage.Literals.FAMILY__PERSONS, mother));
			command2.append(AddCommand.create(editingDomain, child, EmfdbPackage.Literals.PERSON__PARENTS, mother));
			editingDomain.getCommandStack().execute(command2);
			resource.save(Collections.EMPTY_MAP);

			// Undo command stack to remove mother from Family containment and from Person reference 
			editingDomain.getCommandStack().undo();
			resource.save(Collections.EMPTY_MAP);
			
			// Redo command stack to re-add mother to Family containment and to Person reference
			editingDomain.getCommandStack().redo();
			resource.save(Collections.EMPTY_MAP);			// <-- ERROR here
			
		} catch (IOException ioe) { 
			ioe.printStackTrace();
		}
	}
}
