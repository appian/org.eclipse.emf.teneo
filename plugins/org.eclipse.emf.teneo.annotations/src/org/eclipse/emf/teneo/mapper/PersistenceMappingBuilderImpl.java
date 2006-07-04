/*
 *	Copyright 2005-2006, Elver.org (http://www.eclipse.org/emf/teneo).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package org.eclipse.emf.teneo.mapper;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.util.BasicPamodelBuilder;
import org.eclipse.emf.teneo.annotations.pamodel.util.EannotationPamodelBuilder;

/**
 * Receives a list of ecore files and generates a mapping model using different strategies. The mapping model is
 * returned.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class PersistenceMappingBuilderImpl implements PersistenceMappingBuilder {

	/** The logger */
	protected static final Log log = LogFactory.getLog(PersistenceMappingBuilderImpl.class);

	/** Receives a list of ecore files and returns a Mapping */
	public PAnnotatedModel buildMapping(String[] ecoreFiles, PersistenceOptions po) {
		// note options are set in call to buildPersistenceMapping(epackages)

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new EcoreResourceFactoryImpl());
		ArrayList epackages = new ArrayList();
		for (int i = 0; i < ecoreFiles.length; i++) {

			log.debug("Reading ecore file: " + ecoreFiles[i]);

			Resource res = resourceSet.getResource(URI.createFileURI(ecoreFiles[i]), true);

			Iterator it = res.getAllContents();
			while (it.hasNext()) {
				final Object obj = it.next();
				if (obj instanceof EPackage) {
					EPackage epack = (EPackage) obj;
					EPackage epackImpl = EPackage.Registry.INSTANCE.getEPackage(epack.getNsURI());
					if (epackImpl != null) {
						epackages.add(epackImpl);
					}
				}
			}
		}

		return buildMapping((EPackage[]) epackages.toArray(new EPackage[epackages.size()]), po);
	}

	/** Builds a persistence mapping for one or more epackages */
	public PAnnotatedModel buildMapping(EPackage[] epackages, PersistenceOptions po) {
		// create the pamodel

		// DCB: Introduce indirection so that extensions to annotation processing mechanism
		// can provide their own model builder.
		BasicPamodelBuilder pamodelBuilder = getModelBuilder();
		log.debug("Creating pamodel for the following epackages");
		for (int i = 0; i < epackages.length; i++) {
			log.debug(epackages[i].getName());
			pamodelBuilder.addRecurse(epackages[i]);
		}

		log.debug("Create base pannotated model");
		PAnnotatedModel pam = pamodelBuilder.getPAnnotatedModel();

		log.debug("Import eannotations");
		// DCB: Introduce indirection so that extensions to annotation processing mechanism
		// can provide their own model builder.
		EannotationPamodelBuilder epb = getAnnotationModelBuilder();
		epb.setPAnnotatedModel(pam);
		epb.processCurrentPAnnotatedModel();

		log.debug("Add default annotations");
		// DCB: Introduce indirection so that extensions to annotation processing mechanism
		// can provide their own default annotation.
		getDefaultAnnotator().map(pam, po);

		log.debug("Returning created pamodel");
		return pam;
	}

	// DCB: New methods to allow for extension
	protected DefaultAnnotator getDefaultAnnotator() {
		return new DefaultAnnotator();
	}

	protected BasicPamodelBuilder getModelBuilder() {
		return new BasicPamodelBuilder();
	}

	protected EannotationPamodelBuilder getAnnotationModelBuilder() {
		return new EannotationPamodelBuilder();
	}
}
