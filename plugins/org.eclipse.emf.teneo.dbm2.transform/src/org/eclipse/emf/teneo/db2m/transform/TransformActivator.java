package org.eclipse.emf.teneo.db2m.transform;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 */
public class TransformActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "null";

	// The shared instance
	private static TransformActivator plugin;
	
	/**
	 * The constructor
	 */
	public TransformActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		// FIXME Ugly hack to launch code while initiating the plugin. 
		// As we are non-UI, this is not too bad though... :-) CB. 
		
		new QVTExecutor();
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static TransformActivator getDefault() {
		return plugin;
	}

}
