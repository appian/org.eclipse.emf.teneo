package org.eclipse.emf.teneo.db2m.transform;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.util.Hbm30ResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

public class QVTExecutor {
	
	public QVTExecutor() {

		// flexible way of handling qvto, in and out resources.
		// We can set options on our resources. here, or tell it
		// to use our resource factory.
		
		// For now URI's are hardcoded. 
		String qvto = "platform:/resource/org.eclipse.emf.teneo.db2m.transform/transforms/toEcore.qvto";
		String in = "platform:/resource/org.eclipse.emf.teneo.db2m.example/src/org/eclipse/emf/teneo/db2m/example/Channels.hbm.xml";
		String out = "platform:/resource/org.eclipse.emf.teneo.db2m.transform/transforms/adhoc.ecore";
		exec(qvto, in, out );
	}
	
	
	/**
	 * 
	 * @param qvto
	 * @param in
	 * @param out
	 */
	public void exec(String qvto, String in, String out) {

		ResourceSet resourceSet = new ResourceSetImpl();

		// TODO We could do a conditional registration. 
 		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		.put(Resource.Factory.Registry.DEFAULT_EXTENSION,new Hbm30ResourceFactoryImpl());

		//Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(Hbm30Package.eNS_URI,
				Hbm30Package.eINSTANCE);

		// Refer to an existing transformation via URI
		URI transformationURI = URI
				.createURI(qvto);
		// create executor for the given transformation
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);

		// define the transformation input
		// Remark: we take the objects from a resource, however
		// a list of arbitrary in-memory EObjects may be passed
		Resource inResource = resourceSet.getResource(URI
				.createURI(in), true);
		EList<EObject> inObjects = inResource.getContents();

		// create the input extent with its initial contents
		ModelExtent input = new BasicModelExtent(inObjects);
		// create an empty extent to catch the output
		ModelExtent output = new BasicModelExtent();

		// setup the execution environment details ->
		// configuration properties, logger, monitor object etc.
		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("keepModeling", true);

		// run the transformation assigned to the executor with the given
		// input and output and execution context -> ChangeTheWorld(in, out)
		// Remark: variable arguments count is supported
		ExecutionDiagnostic result = executor.execute(context, input, output);

		// check the result for success
		if (result.getSeverity() == Diagnostic.OK) {
			// the output objects got captured in the output extent
			List<EObject> outObjects = output.getContents();
			// let's persist them using a resource
			Resource outResource = resourceSet
					.getResource(
							URI
									.createURI(out),
							true);
			outResource.getContents().addAll(outObjects);
			try {
				outResource.save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			// turn the result diagnostic into status and send it to error log
			IStatus status = BasicDiagnostic.toIStatus(result);
			// Activator.getDefault().getLog().log(status);
		}
	}

}
