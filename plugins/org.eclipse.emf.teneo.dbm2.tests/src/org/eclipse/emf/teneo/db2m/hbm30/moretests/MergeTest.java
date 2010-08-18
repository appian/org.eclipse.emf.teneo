package org.eclipse.emf.teneo.db2m.hbm30.moretests;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.teneo.db2m.hbm30.merge.Merger;

public class MergeTest extends TestCase {
	
	private Collection<URI> uris;
	

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		
		// Opening the workspace in a non plugin fashion, 
		// leads to a closed plugin. 
		
//		IWorkspace space = ResourcesPlugin.getWorkspace();
//		IPath rootPath = space.getRoot().getLocation();
		
		
//		IProject p = space.getRoot().getProject("org.eclipse.emf.teneo.db2m.tests");
//		if(!p.exists()){
//			return;
//		}
//		IPath path = rootPath;
//		path = path.append("/fixtures/");
//		
//		IFolder folder = space.getRoot().getFolder(path);
			
//		if(!folder.exists()) return;
		
//		IResource[] members;
//		
//		try {
//			members = folder.members();
//		} catch (CoreException e) {
//			// if the project + Path doesn't exist. 
//			e.printStackTrace();
//			return;
//		}
//		
		uris = new ArrayList<URI>();
//		for(int i = 0; i < members.length ; i++){
//			IResource res = members[i];
//			if(res.getType() == IResource.FILE){
//				// It's a FILE. 
//				res.getFileExtension().endsWith("hbm.xml");
//				uris.add(URI.createPlatformResourceURI(res.getLocation().toString(), true));
//			}
//		}
		
		File folder = new File(URI.createFileURI("/Users/dzonekl/Documents/Spaces/db2m/org.eclipse.emf.teneo.db2m.tests/fixtures").toFileString());
		if(folder.exists() && folder.isDirectory()){
			File[] list = folder.listFiles();
			Collection<File> c = Arrays.asList(list);
			for(File f : c){
				uris.add(URI.createFileURI(f.getAbsolutePath()));
			}
		}
		
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		// Nothing to teardown
	}
	
	public void testMergeAbsolute(){
		
	}
	

	public void testMergeAsPlugin() {
		assert uris != null;
		URI[] mergeTargets = new URI[uris.size()];
		uris.toArray(mergeTargets);
		Merger.mergeEMF(mergeTargets, URI.createFileURI("merge.hbm.xml"));
	}

}
