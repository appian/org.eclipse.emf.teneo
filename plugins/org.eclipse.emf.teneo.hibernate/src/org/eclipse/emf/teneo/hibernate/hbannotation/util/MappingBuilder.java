package org.eclipse.emf.teneo.hibernate.hbannotation.util;

import org.eclipse.emf.teneo.annotations.pamodel.util.BasicPamodelBuilder;
import org.eclipse.emf.teneo.annotations.pamodel.util.EannotationPamodelBuilder;
import org.eclipse.emf.teneo.mapper.DefaultAnnotator;
import org.eclipse.emf.teneo.mapper.PersistenceMappingBuilderImpl;

/**
 * This class simply provides the Hibernate-equivalent builders to the
 * generic Elver annotation processing mechanism.
 */
public class MappingBuilder extends PersistenceMappingBuilderImpl {

	public static final MappingBuilder INSTANCE = new MappingBuilder();
	
	protected EannotationPamodelBuilder getAnnotationModelBuilder() {
		return new HbAnnotationModelBuilder();
	}

	protected BasicPamodelBuilder getModelBuilder() {
		return new HbAnnotationModelBuilder();
	}

	protected DefaultAnnotator getDefaultAnnotator() {
		return new HibernateDefaultAnnotator();
	}
}
