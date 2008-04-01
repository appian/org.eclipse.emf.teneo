/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryEditorPlugin.java,v 1.1 2008/04/01 07:32:09 mtaal Exp $
 */
package org.eclipse.example.library.presentation;

import java.util.Properties;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.example.library.LibraryPackage;
import org.hibernate.cfg.Environment;
import org.osgi.framework.BundleContext;

/**
 * This is the central singleton for the Library editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class LibraryEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LibraryEditorPlugin INSTANCE = new LibraryEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryEditorPlugin() {
		super
			(new ResourceLocator [] {
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
		
		// teneo.start
		public void start(BundleContext context) throws Exception 
		{
			org.eclipse.osgi.framework.debug.Debug.DEBUG_GENERAL = true;
			
			// Set the database information, Environment is org.hibernate.cfg.Environment
			final Properties props = new Properties();
			props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
			props.setProperty(Environment.USER, "root");
			props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/lib");
			props.setProperty(Environment.PASS, "root");
			props.setProperty(Environment.DIALECT, org.hibernate.dialect.MySQLInnoDBDialect.class.getName());

			// Initialize create the HbDataStore
			HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore("library");
			hbds.setEPackages(new EPackage[]{LibraryPackage.eINSTANCE});
			hbds.setProperties(props);
			hbds.initialize();
			
			super.start(context);
		}
		// teneo.end
	}

}
