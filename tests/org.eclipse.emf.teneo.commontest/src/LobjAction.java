

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;

import lobj.LobjFactory;
import lobj.LobjPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the capa, detach and update
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class LobjAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public LobjAction() {
		super(LobjPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
		final LobjFactory factory = LobjFactory.eINSTANCE;
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("learningobjects", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		try {
			{
				store.beginTransaction();
				loadResource(rs, "TestLU.learningobjects");
				loadResource(rs, "TestBlock.learningobjects");
				loadResource(rs, "Lang_de.learningobjects");
				for (Iterator resources = rs.getResources().iterator(); resources.hasNext();) {
					final Resource res = (Resource) resources.next();
					for (Iterator it = res.getContents().iterator(); it.hasNext();) {
						Object obj = it.next();
						store.store(obj);
					}
				}
				store.commitTransaction();
			}
			store.refresh();
			rs = new ResourceSetImpl();
			{
				store.beginTransaction();
				loadResource(rs, "TestLU.learningobjects");
				loadResource(rs, "TestBlock.learningobjects");
				loadResource(rs, "Lang_de.learningobjects");
				for (Iterator resources = rs.getResources().iterator(); resources.hasNext();) {
					final Resource res = (Resource) resources.next();
					for (Iterator it = res.getContents().iterator(); it.hasNext();) {
						Object obj = it.next();
						store.store(obj);
					}
				}
				store.commitTransaction();
			}
		} catch (IOException e) {
			throw new StoreTestException("Exception", e);
		}
	}

	/** Loads a resource */
	private void loadResource(ResourceSet rs, String name) throws IOException {
		final URI uri = URI.createURI("/" + name);
		Resource res = rs.getResource(uri, false);
		if (res == null) {
			res = rs.createResource(uri);
			res.load(Collections.EMPTY_MAP);
		}
	}
}
